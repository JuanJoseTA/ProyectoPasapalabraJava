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


### RF01 Acceso a la partida.

#### RF01.1 Nombre de jugador. Deberán introducir el nombre por teclado cada uno de forma ordenada.

#### RF01.2 Jugador 1. Deberá ser el primer nombre introducido.

#### RF01.3 Jugador 2. Deberá ser el segundo nombre introducido.


### RF02 Jugar una partida.

#### RF02.1 Ronda

	RF02.1.1 Nº de rondas. Habrá tantas rondas como letras del abecedario, excepto la ñ.

	RF02.1.2 Pregunta de la letra. Se realiza la pregunta aleatoria de la letra correspondiente. Referencia al RF05
	
	RF02.1.3 Cronómetro. Cuando se lanza la pregunta se inicia un contador de 15 segundos. Depende de RF02.1.1
	
		RF02.1.3.1 Reinicio. En caso de rebote se reinicia el contador, ya que no cambia la ronda.
		
	RF02.1.4 Respuesta del usuario. 
	
		RF02.1.4.1 Entrada. La palabra sera introducida por teclado en el formato indicado. Depende de RF06.
		
		RF02.1.4.2 Respuesta Correcta. En caso de acierto, puntúa al jugador correspondiente y pasa a la siguiente ronda.
		
		RF02.1.4.3 Respuesta Incorrecta. 
		
			RF02.1.4.3.1 Jugador que inicia la ronda. Si éste falla, se produciría el rebote al otro jugador.
	
			RF02.1.4.3.2 Jugador que recibe el rebote. Si éste falla, se pasa a la siguiente ronda(letra) sin que ninguno puntúe.
			
				RF02.1.4.3.2.1 Solución a la respuesta correcta a la pregunta dada. Referencia a la RF04.
			 
	RF02.1.5 Bonus.

		RF02.1.5.1 Ronda de bonus. Dos rondas normales consecutivas aleatorias. Referencia RF03.2.
		 
		RF02.1.5.2 Restriccion. La primera de estas dos rondas, no podrá ser la ronda final. Depende RF02.3

#### RF02.2 Turnos

	RF02.2.1 Definición.  El turno de cada ronda lo marca la letra a responder.
	
	RF02.2.2 Primer turno. Le corresponde al jugador 1. 
	
	RF02.2.3 Orden alternado. En cada ronda se deberá alternar el orden de inicio entre los jugadores.

#### RF02.3 Final

	RF02.3.1 Definición. Al terminar la última ronda (correspondiente a la letra "z").Depende de RF02.1.
	
	RF02.3.2 Ganador. Gana el jugador que tenga mayor puntuación. Depende de RF03.
	
		RF02.3.2.1 Empate. En este caso, no hay ganador.
		
		RF02.3.2.2 Mostrarlo. Mostrar el resultado de la partida. Depende de RF04.


### RF03 Sistema de puntuacion

#### RF03.1 Contador. Cada jugador deberá tener asociado un contador con el número de aciertos (puntos) que lleva en el juego.
	
	RF03.1.1 Acierto. Se deberá sumar un punto al contador del jugador que responda una pregunta correctamente. Depende de RF06.
		
	RF03.1.2 Fallo. No se debe sumar ningún punto al contador del jugador que responda una pregunta incorrectamente. Depende de RF06.
		
#### RF03.2 Bonus. 
	
	RF03.2.1 Definición. Una ronda normal, donde se ve alterada la puntuación. Depende de RF02.
		
		RF03.2.1.1 Acierto. Se deberá sumar dos puntos al contador del jugador que responda una pregunta correctamente. Depende de RF06.
			
		RF03.2.1.2 Fallo. No se debe sumar ningún punto al contador del jugador que responda una pregunta incorrectamente. Depende de RF06.


### RF04 Interfaz

#### RF04.1 Mostrar Pregunta. Se deberá mostrar una pregunta aleatoria, de la letra correspondiente, en pantalla. Referencia a RF05. Depende de RF02.1

	RF04.1.1 Mostrar jugador. Se deberá mostrar la pregunta en la parte de la pantalla del jugador que tenga el turno. Depende de RF02.2

	RF04.1.2 Mostrar letra. Se deberá mostrar la letra en la parte central a la que corresponde la ronda. 

	RF04.1.3 Mostrar tiempo. Se deberá mostrar la cuenta atrás.

		RF04.1.3.1 Acaba . Si el tiempo acaba se deberá mostrar "TIEMPO".

	RF04.1.4 Mostrar bonus. Si la letra es bonus, deberá mostrar "Las dos próximas letras tendrán bonus". Depende de RF02.1.5.

		RF04.1.4.1 Mostrar Puntuacion. Mostrar "Puntuacion doble".
		
#### RF04.2 Mostrar Correccion. Al responder el jugador se deberá mostrar si es correcto o no y sus consecuencias. Depende de RF06.

	RF04.2.1 Mostrar Correcto. Si la respuesta es correcta se deberá mostrar "CORRECTO".

	RF04.2.2 Mostrar Incorrecto. Si la respuesta es incorrecta se deberá mostrar "INCORRECTO".

		RF04.2.2.1 Mostrar rebote. Si el que falla es el primer jugador en responder en esta ronda, se deberá mostrar "REBOTE". Depende de RF02.2

		RF04.2.1.2 Mostrar solucion. Si falla el rebote se deberá mostrar la solución. 

#### RF04.3 Mostrar contador. Se deberá mostrar en todo momento el numero de aciertos de cada jugador. Depende de RF03.

	RF04.3.1 Contador Jugador 1. Se deberá mostrar su contador de aciertos en la parte izquierda de la pantalla.

		RF04.3.1.1 Pregunta. Si el jugador1 acierta una pregunta, se le actualiza su contador. Depende RF03 y RF02.1.5.
			
	RF04.3.2 Contador Jugador 2. Se deberá mostrar su contador de aciertos en la parte derecha de la pantalla.
			
		RF04.3.2.1 Pregunta. Si el jugador2 acierta una pregunta, se le actualiza su contador. Depende RF03 y RF02.1.5.
				
#### RF04.4 Mostrar final. Al acabar la partida se deberá mostrar el resultado. Depende de RF02.3.

	RF04.4.1 Ganador 1. Se deberá mostrar "GANADOR" y el nombre del jugador 1 si tiene mas aciertos que jugador 2. Depende de RF01.

	RF04.4.2 Ganador 2. Se deberá mostrar "GANADOR" y el nombre del jugador 2 si tiene mas aciertos que jugador 1. Depende de RF01.

	RF04.4.3 Empate. Se deberá mostrar "EMPATE" si el numero de aciertos de los dos jugadores es el mismo. 

	RF04.4.4 Jugar otra vez. Se deberá mostrar "Jugar otra vez". 
			

### RF05 Preguntas

#### RF05.1 Tipo. Habrá distintas maneras  de formular las preguntas.

	RF05.1.2 Definición. Proposición que expone con claridad el significado de la palabra a responder.
		
	RF05.1.3 Interrogación. Enunciado con signo de interrogación cuyo propósito es una respuesta.
		
	RF05.1.4 Completar. Enunciado incompleto que debe ser rellenado con una palabra para darle un significado.
		
#### RF05.2 Características. 
	
	RF05.2.1 Indicador. Al principio de la pregunta o definición, se indicará si la respuesta empieza o contiene por la letra correspondiente a la ronda. Depende de RF02.
	 

### RF06 Respuestas

#### RF06.1 Restricciones. Características que debe cumplir la respuesta para que sea considerada como válida.

	RF06.1.1 Tildes. No se tendrán en cuenta las tildes.

	RF06.1.2 Letra "ñ".La ñ no puede formar parte de la respuesta.

	RF06.1.3 Palabras compuestas. Las palabras no pueden ser compuestas.

	RF06.1.4 Espacios en blanco.Deberá escribirse la respuesta sin espacios.

	RF06.1.5 Caracteres especiales. La respuesta no debe incluir carácteres especiales.

      
#### RF06.2 Corrección. La respuesta será correcta si se corresponde con la pregunta dada y no contiene ninguna restricción. Referencia a RF05.



## Requisitos no funcionales
### RNF01 Soporte. El sistema estará soportado por PC.
### Almacenamiento. RNF02 La batería de palabras estará almacenada en ficheros.
### RNF03 Los jugadores tendrán un maximo de 15 segundos para responder cada pregunta.
### RNF04 El sistema no distingue entre mayúsculas y minúsculas.
### RNF05 El sistema no reconocerá las tildes, por lo que el uso de tildes será respuesta incorrecta.
### RNF05 El sistema no reconocerá los caracteres especiales, por lo que el uso de caracteres especiales será respuesta incorrecta.
### RNF06 La temática del juego será orientada al conocimiento deportivo.
### RNF07 Las respuestas deben contener o comenzar por la letra correspondiente al turno.
### RNF08 El sistema recibe la respuesta en la entrada por teclado.
### RNF09 El tiempo restante para responder se mostrará en el formato de segundos.
### RNF10 La letra aleotoria bonus no podrá ser la z.

### Extra:
* RF Las letras acertadas aparecen en la parte de la interfaz correspondiente a ese jugador.
* RF En los aciertos se deberá mostrar por pantalla el color verde.
* RF Al acertar en la latra bonus, se deberá mostrar por pantalla el color dorado.
* RF A su vez, en los errores deberá mostrarse por pantalla el color rojo.
* RF Deberá ganar siempre un jugador.
* RF Deberá haber preguntas extras con letras aleatorias.

# Apéndices adicionales
