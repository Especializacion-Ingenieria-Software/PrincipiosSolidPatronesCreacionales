# Trabajo 1 – Patrones y Diseño de Software

Este documento describe los pasos y objetivos para la entrega de la asignación, incluyendo la aplicación de principios **SOLID** y patrones de diseño **creacionales**, así como la modelación de un sistema para la construcción de documentos en formato PDF de manera flexible.

---

## Integrantes del Grupo
- Xavier de Jesus Lozano Figueroa
- Miguel Angel Blanco
- Marlon David Peñuela Pardo

---

## Objetivo General
- **Demostrar** la aplicación de principios **SOLID** y patrones creacionales en la resolución de problemas de diseño de software.
- **Modelar** y **desarrollar** un sistema que construya documentos en formato PDF de manera flexible, haciendo uso de por lo menos **dos patrones de diseño**.

---

## Contenido

1. **Punto 1 – Patrones Creacionales**
   - [Parte A: Definición del Problema](#parte-a-definición-del-problema)
   - [Parte B: Diagrama UML de Clases](#parte-b-diagrama-uml-de-clases)
   - [Parte C: Implementación de los Patrones de Diseño](#parte-c-implementación-de-los-patrones-de-diseño)

2. **Punto 2 – Construcción de Documentos PDF**
   - [Modelado de la Solución](#modelado-de-la-solución)
   - [Diagrama UML y Explicación](#diagrama-uml-y-explicación)
   - [Código Fuente de la Aplicación](#código-fuente-de-la-aplicación)

3. [Plazo de Entrega](#plazo-de-entrega)

---

## Punto 1 – Patrones Creacionales

### Parte A: Definición del Problema
1. **Descripción de uno o varios problemas** donde se apliquen **tres** patrones creacionales **distintos**.  
2. **Justificación** de por qué la aplicación de cada patrón **resuelve** el problema planteado.  
3. Los problemas pueden estar relacionados o pueden ser independientes; la temática es libre.

**Requisitos clave**:
- **Tres problemas** (uno por cada patrón) o **un único** problema con tres componentes donde cada componente use un patrón creacional distinto.
- **Justificar** por qué el patrón es la **mejor solución** para cada caso.

Ejemplos de patrones creacionales:
- Factory Method  
- Abstract Factory  
- Singleton  
- Builder  
- Prototype  

*(Se debe elegir cualquier combinación de tres.)*

### Parte B: Diagrama UML de Clases
- **Elaborar** el diagrama UML donde se **evidencie** la estructura del patrón de diseño.
- **Explicar** cómo cada clase corresponde a uno de los **participantes** del patrón.
- Se pueden presentar:
  - **Tres** diagramas diferentes (uno por cada patrón) **o**
  - **Un único** diagrama que muestre la **integración** de los tres patrones.

**Importante**:
- Utilizar **nombres de clases** propios del **dominio** que se esté modelando.
- Evitar nombres **genéricos** o iguales a los presentados en la literatura de patrones.

### Parte C: Implementación de los Patrones de Diseño
1. **Implementar** en el lenguaje de programación de su preferencia.
2. **Demostrar** el uso de cada patrón con mensajes en la consola (pueden ser logs que indiquen qué patrón se está utilizando).
3. **Aplicar** principios **SOLID**.
4. No es necesario desarrollar toda la funcionalidad; basta con ilustrar cómo se instancia y utiliza cada patrón.

---

## Punto 2 – Construcción de Documentos PDF

Para este punto, se requiere modelar un sistema para **construir** documentos en formato **PDF** de manera flexible, capaz de generar documentos complejos (múltiples columnas, tablas, títulos, estilos, etc.), y permitir la creación a partir de **diferentes formatos de origen** (XLSX, DOCX, XML, etc.).

### Modelado de la Solución
- El sistema debe permitir al usuario **seleccionar** el tipo de formato de origen (XLSX, DOCX, XML, etc.).
- El sistema debe permitir crear documentos **complejos** y **flexibles**:
  - Soportar adición de columnas, tablas, enunciados, estilos en tiempo de ejecución.
- El diseño debe ser **extensible** para soportar nuevos formatos, **sin modificar** el código existente.
- El **cliente** de la aplicación no debe necesitar conocer los **detalles** de lectura/escritura ni la **implementación** para generar el PDF.

### Diagrama UML y Explicación
- **Diagrama de Clases** UML que muestre:
  - Al menos **dos patrones** de diseño.
  - Participantes y cómo se relacionan en la solución.
- **Justificar** la **elección** de los patrones utilizados, en relación con los requisitos de flexibilidad y extensibilidad.

### Código Fuente de la Aplicación
- **Proveer** una implementación base (no completa) que **demuestre** la interacción de los patrones.
- No es obligatorio implementar la lógica de lectura o escritura; solo mostrar la **estructura** y cómo se **invocan** los métodos.

---

## Plazo de Entrega
- **Fecha límite**: *Sábado 22 de marzo*.
- El trabajo será **presentado** en horario de clase.
- **Entrega** a través de *Microsoft Teams* (pueden usar un repositorio público como GitHub, GitLab o Azure Repos).  
  - Incluir en el documento el **enlace** al repositorio.  
- **Estructura** recomendada de entrega:
  1. Un documento (PDF o Markdown) con:
     - **Descripción** del problema o problemas.
     - **Diagramas** UML.
     - **Justificación** de los patrones.
     - **Enlace** al repositorio del código.
  2. Repositorio con:
     - **Código fuente**.
     - Ejemplos básicos de ejecución (logs en consola).
     - Archivos de diagramas, si aplica.

---

## Cómo Ejecutar (Sugerencia)
1. **Clonar** el repositorio o descargar el código fuente.
2. **Abrir** el proyecto en el IDE de preferencia.
3. **Compilar** e instalar las dependencias (si son necesarias).
4. **Ejecutar** las clases de prueba para ver los mensajes que evidencien el uso de los patrones.

---

## Contribución y Colaboración
- Se recomienda **distribuir** tareas de investigación, modelado y codificación entre los integrantes.
- Cada integrante debe participar en al menos una fase (análisis, diseño, programación).

---

### Contacto
Para dudas o aclaraciones, se puede consultar al docente a través de **Teams** o en horario de clase.

> **¡Importante!** Se debe garantizar el correcto uso de **tres patrones creacionales**, **principios SOLID** y **al menos dos patrones** para la parte de construcción de documentos en PDF. El cumplimiento de estos criterios es esencial para la calificación.
