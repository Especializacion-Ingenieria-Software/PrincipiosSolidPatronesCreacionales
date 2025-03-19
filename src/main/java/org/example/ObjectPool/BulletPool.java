package org.example.ObjectPool;

public class BulletPool {
    private final java.util.Queue<Bullet> availableBullets = new java.util.LinkedList<>();

    private int bulletCount = 0;
    private final int MAX_BULLETS;

    public BulletPool(int maxBullets) {
        this.MAX_BULLETS = maxBullets;
    }

    public Bullet acquireBullet(String spriteId) {
        if (!availableBullets.isEmpty()) {
            Bullet bullet = availableBullets.poll();
            System.out.println("Reusing bullet.");
            return bullet;
        } else if (bulletCount < MAX_BULLETS) {
            bulletCount++;
            return new Bullet(spriteId + "_" + bulletCount);
        } else {
            System.out.println("There are not bullets availables. Límite reached: " + MAX_BULLETS);
            return null;
        }
    }

    public void releaseBullet(Bullet bullet) {
        if(bullet != null) {
            bullet.deactivate();
            availableBullets.offer(bullet);
        }
    }
}
