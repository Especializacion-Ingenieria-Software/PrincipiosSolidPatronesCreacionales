package org.example.ObjectPool;



public class objectPoolExample {

    public static void main(String[] args) {
        // Creamos un pool de balas con un máximo de 5
        BulletPool pool = new BulletPool(5);

        // "Disparamos" 3 balas
        Bullet b1 = pool.acquireBullet("bulletSprite");
        Bullet b2 = pool.acquireBullet("bulletSprite");
        Bullet b3 = pool.acquireBullet("bulletSprite");

        // Inicializamos sus posiciones y velocidades
        if (b1 != null) b1.init(50, 300, 5);
        if (b2 != null) b2.init(55, 300, 5);
        if (b3 != null) b3.init(60, 300, 5);

        // Simulamos un "update" sencillo de un frame
        if (b1 != null) b1.update();
        if (b2 != null) b2.update();
        if (b3 != null) b3.update();

        // Suponemos que la bala b1 salió de la pantalla o impactó
        // la desactivamos y la regresamos al pool
        if (b1 != null) {
            pool.releaseBullet(b1);
        }

        // Adquirimos otra bala (se reutilizará la liberada recién)
        Bullet b4 = pool.acquireBullet("bulletSprite");
        if (b4 != null) {
            b4.init(70, 300, 5);
            b4.update();
        }

        // Tratamos de saturar el pool: pedimos 6 balas cuando el límite es 5
        Bullet[] bullets = new Bullet[6];
        for (int i = 0; i < 6; i++) {
            bullets[i] = pool.acquireBullet("bulletSprite");
            if (bullets[i] != null) {
                bullets[i].init(100 + (5 * i), 300, 5);
            }
        }

        // "Retorno" de todas las balas para demostrar su reutilización.
        for (Bullet bullet : bullets) {
            if (bullet != null) {
                pool.releaseBullet(bullet);
            }
        }
    }
}