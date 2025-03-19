package org.example.ObjectPool;

/**
 * Ejemplo sencillo de implementación del patrón Object Pool aplicado a un escenario de videojuegos.
 *
 * Supongamos que tenemos un sistema de "balas" (o proyectiles) en un shooter 2D.
 * Crear y destruir objetos "Bullet" repetidamente (especialmente si hay muchas balas en pantalla)
 * puede causar overhead en memoria y CPU. Por eso, es útil reutilizar instancias.
 */

public class Bullet {

    private boolean active;
    private float x;
    private float y;
    private float speed;
    private String spriteId;

    public Bullet(String spriteId) {
        this.active = false;
        this.spriteId = spriteId;
        this.x = 0.0f;
        this.y = 0.0f;
        this.speed = 0.0f;
        System.out.print("Creating Bullet with spriteId: " + spriteId);
    }

    public void init(float startX, float startY, float speed) {
        this.x = startX;
        this.y = startY;
        this.speed = speed;
        this.active = true;
        System.out.println(">> Bullet  initialized in (" + x + ", " + y + ") with speed" + speed);
    }

    public void update() {
        if(active) {

            this.y -= speed;
            System.out.println("Bullet  " + spriteId + " moving to Y = " + y);

            if (y < - 100) {
                deactivate();
            }

        }
    }

    public void deactivate() {
        this.active = false;
        System.out.println(">> Bullet " + spriteId + " deactivated and ready to reuse.");

    }

    public boolean isActive() {
        return active;
    }

}
