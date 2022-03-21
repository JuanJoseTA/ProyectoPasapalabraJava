# Historial de revisiones

  
# Introducción
## Propósito
## Alcance
## Visión general

# Descripción general del producto
## Funciones del producto
## Suposiciones y dependencias
## Restricciones
## Requisitos futuros

# Requerimientos específicos
## Requisitos funcionales

###  RF Respecto a los jugadores:
    * Deben poder jugar dos usuarios simultáneamente.
    * Los usuarios deben poder acceder aportando su nombre de jugador.
    * El jugador 1 sera el primer nombre introducido.
    * Debe empezar el jugador 1.

### RF Respecto al funcionamiento del juego:
    #### Sistema de juego:
        * En cada letra se deberá alternar el orden de inicio entre los jugadores.
        * Deberá haber un rebote en caso del que el primer jugador en responder falle, para que el otro jugador tenga la oportunidad de ganar la letra.
        * Deberá lanzarse la misma pregunta al jugador que no ha respondido primero.
        * Deberá pasar a la siguiente letra haya acierto o fallo, llevándose la letra o no cualquiera de los jugadores.
        * Al acabar cada ronda se pasará a la siguiente letra.
        * La respuesta debe ser introducida por teclado.
        * Cada jugador deberá tener asociado un contador con el número de aciertos (puntos) que lleva en el juego.
        * Deberá haber una cuenta atrás de 10 segundos que comienze al mostrar la pregunta, y se resetee al cambiar el turno

    #### Interfaz:
        * Se deberá mostrar por pantalla la pregunta al jugador correspondiente. 
        * En la interfaz, en los aciertos deberá mostrarse por pantalla "CORRECTO".
        * En los errores deberá mostrarse por pantalla "INCORRECTO".
        * Deberá aparecer a la izquierda las preguntas del jugador1.
        * Deberá aparecer a la derecha las preguntas del jugador2.
        * Deberá aparecer la letra que se está respondiendo en la parte central de la interfaz.
        * Deberá mostrarse el resultado del juego mostrando por pantalla el ganador en caso de que lo haya.
        * Deberá aparecer la letra que se está respondiendo en la parte central de la interfaz.
        * Deberá mostrarse el resultado del juego mostrando por pantalla el ganador en caso de que lo haya.
        * En una letra aleatoria deberá mostrarse por pantalla el mensaje : "Las dos próximas letras tendrán bonus".
        * Se deberá mostrar por pantalla el número de aciertos de cada jugador.
        * Al mostrar la letra a responder, debe haber un mensaje indicando si la respuesta empieza o contiene la letra.
        * Al terminar la cuenta atrás, deberá darse como incorrecta la pregunta, y mostrar por pantalla "¡TIEMPO!".

    #### Puntuacion:

    #### Preguntas:
        ##### Características:
            * Debe haber mínimo una pregunta por cada letra del abecedario (exceptuando la ñ).
        ##### Tipos:
            * Debe haber definiciones que se deben adivinar.
            * Debe haber preguntas que deben ser respondidas con una única palabra.
        ##### Respuestas:
        ##### Casos Especiales:
            * El bonus deberá tener una puntuación doble.

        
        
    


### Despues del juego:
* RF01  
* RF02 
* RF03 
* RF04 
* RF05 Debe lanzarse la pregunta de la primera letra al jugador 1.
* RF06 
* RF07 
* RF08 
* RF09 
* RF10 
* RF11 
* RF12 
* RF13 
* RF14
* RF15 
* RF16 
* RF17 
* RF18 
* RF19 
* RF20 
* RF21 
* RF22 
* RF23 
* RF24 
* RF25 
* RESUMEN REQUISITOS FUNCIONALES:
    RFO2->NOMBRE JUGADOR
    RF03->JUGADOR 1 EMPIEZA
    RF04->ORDEN ALTERNADO
    RF05->PRIMERA PREGUNTA
    RF06->REBOTE
    RF07->PASO LETRA
    RF08->FIN DE RONDA
    RF09->MOSTRAR PREGUNTA
    RF10->RESPUESTA TECLADO
    RF11->ACIERTOS
    RF12->ERRORES
    RF13->POSICIÓN JUGADOR 1
    RF14->POSICIÓN JUGADOR 2
    RF15->LETRA PREGUNTA
    RF16->MOSTRAR RESULTADO
    RF17->MÍNIMO PREGUNTAS LETRA
    RF18->BONUS
    RF19->PUNTUACIÓN BONUS
    RF20->CONTADOR ACIERTOS
    RF21->ACIERTOS TOTALES
    RF22->EMPIEZA O CONTIENE
    RF23->TURNO
    RF24->CUENTA ATRÁS
    RF25->EXCESO TIEMPO

### Extra:
* RF Deberá haber una letra aleatoria con bonus (da más puntos).
* RF Las letras acertadas aparecen en la parte de la interfaz correspondiente a ese jugador.
* RF En los aciertos se deberá mostrar por pantalla el color verde.
* RF A su vez, en los errores deberá mostrarse por pantalla el color rojo.
* RF Deberá ganar siempre un jugador.
* RF Deberá haber preguntas extras con letras aleatorias.
* RF Deberá mostrar al final de la partida, el tiempo utilizado por cada uno de los jugadores.


## Requisitos no funcionales
* RNF01 El sistema estará soportado por PC.
* RNF02 La batería de palabras estará almacenada en una base de datos.
* RNF03 Los jugadores tendrán un maximo de 10 segundos para responder cada pregunta.
* RNF04 El sistema no distingue entre mayúsculas y minúsculas.
* RNF05 El sistema no reconocerá las tildes, por lo que el uso de tildes será respuesta incorrecta.
* RNF06 La temática del juego será orientada al conocimiento deportivo.
* RNF07 Las respuestas deben contener o comenzar por la letra correspondiente al turno.
* RNF08 El sistema recibe la respuesta en la entrada por teclado.
* RNF09 El tiempo restante para responder se mostrará en el formato de segundos.
* RESUMEN REQUISITOS NO FUNCIONALES:
    RNF01->SOPORTE
    RNF02->ALMACENAMIENTO PALABRAS
    RNF03->TIEMPO RESPUESTA
    RNF04->FORMATO LETRAS
    RNF05->TILDES
    RNF06->TEMÁTICA
    RNF07->RESPUESTA LETRA
    RNF08->ENTRADA TECLADO

# Apéndices adicionales
