package org.example.ObjectPool;

public interface Poolable {
    /**
     * Activa o inicializa el objeto con los parámetros requeridos.
     * Por ejemplo, posicionarlo en la pantalla, asignar velocidad, etc.
     */
    void init(float startX, float startY, float speed);

    /**
     * Actualiza la lógica interna del objeto (movimiento, colisiones, etc.)
     */
    void update();

    /**
     * Retorna si el objeto está actualmente "activo"
     * (por ejemplo, la bala está volando en pantalla).
     */
    boolean isActive();

    /**
     * Desactiva el objeto para poder ser reutilizado.
     */
    void deactivate();
}
