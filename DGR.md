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

#### RF01.1 Nombre de jugador. Deberán introducir el nombre por teclado cada uno de forma ordenada. El jugador 1 deberá ser el primer nombre introducido y el jugador 2 deberá ser el segundo nombre introducido.


### RF02 Jugar una partida. Necesitamos 2 jugadores.

#### RF02.1 Ronda. Cada ronda será una letra.

	RF02.1.1 Nº de rondas. Habrá tantas rondas como letras del abecedario, excepto la ñ.

	RF02.1.2 Pregunta de la letra. Se realiza la pregunta aleatoria de la letra correspondiente. Referencia al RF05.
	
	RF02.1.3 Cronómetro. Cuando se lanza la pregunta se inicia un contador. Depende de RF02.1.2. Se debe cumplir RNF03. 
	
		RF02.1.3.1 Reinicio. En caso de rebote se reinicia el contador, ya que no cambia la ronda.
		
	RF02.1.4 Respuesta del usuario. 
	
		RF02.1.4.1 Entrada. La palabra sera introducida por teclado en el formato indicado.
		
		RF02.1.4.2 Respuesta Correcta. En caso de acierto, puntúa al jugador correspondiente y pasa a la siguiente ronda.
		
		RF02.1.4.3 Respuesta Incorrecta. Puede ser por fin del tiempo o por respuesta errónea. Depende RNF04.
		
			RF02.1.4.3.1 Jugador que inicia la ronda. Si éste falla, se produciría el rebote al otro jugador.

				RF02.1.4.3.1.1 Rebote. Se le hace la misma pregunta al otro jugador dandole la oportunidad a ganar la letra.
	
			RF02.1.4.3.2 Jugador que recibe el rebote. Si éste falla, se pasa a la siguiente ronda(letra) sin que ninguno puntúe.
			 
	RF02.1.5 Bonus. Se trata de dos rondas, la primera será escogida aleatoriamente y la segunda será la posterior a esta. Referencia RF03.2. La primera de estas dos rondas, no podrá ser la ronda final. Depende RF02.3. Debe cumplir RNF011.

#### RF02.2 Turnos. El turno de cada ronda lo marca la letra a responder. El turno será siempre el contrario al de la ronda anterior excepto    en la ronda uno que empezará el jugador 1. Depende de RF01.
	

#### RF02.3 Final. Al terminar la última ronda (correspondiente a la letra "z").Depende de RF02.1.

	RF02.3.1 Comparar marcadores. Se comparan los contadores de cada jugador y gana el jugador que tenga mayor puntuación, si ambos tienen la misma entonces habrá un empate. Depende de RF03. Llama a RF03.1.


### RF03 Sistema de puntuacion

#### RF03.1 Contador. Cada jugador deberá tener asociado un contador con el número de aciertos (puntos) que lleva en el juego.
	
	RF03.1.1 Acierto. Se deberá sumar un punto al contador del jugador que responda una pregunta correctamente. 
		
	RF03.1.2 Fallo. No se debe sumar ningún punto al contador del jugador que responda una pregunta incorrectamente.
		
#### RF03.2 Bonus. Una ronda normal, donde se ve alterada la puntuación. Depende de RF02.
		
	RF03.2.1 Acierto. Se deberá sumar dos puntos al contador del jugador que responda una pregunta correctamente. 
			
	RF03.2.2 Fallo. No se debe sumar ningún punto al contador del jugador que responda una pregunta incorrectamente. 


### RF04 Interfaz

#### RF04.1 Mostrar Pregunta. Se deberá mostrar una pregunta aleatoria, de la letra correspondiente, en pantalla. Referencia a RF05. Depende de RF02.1

	RF04.1.1 Mostrar jugador. Se deberá mostrar la pregunta en la parte de la pantalla del jugador que tenga el turno. Depende de RF02.2

	RF04.1.2 Mostrar letra. Se deberá mostrar la letra en la parte central a la que corresponde la ronda. 

	RF04.1.3 Mostrar tiempo. Se deberá mostrar la cuenta atrás.

		RF04.1.3.1 Acaba . Si el tiempo acaba se deberá mostrar "TIEMPO".

	RF04.1.4 Mostrar bonus. Si la letra es bonus, deberá mostrar "Las dos próximas letras tendrán bonus". Depende de RF02.1.5.

		RF04.1.4.1 Mostrar Puntuacion. Mostrar "Puntuacion doble".
		
#### RF04.2 Mostrar Correccion. Al responder el jugador se deberá mostrar si es correcto o no y sus consecuencias. 

	RF04.2.1 Mostrar Correcto. Si la respuesta es correcta se deberá mostrar "CORRECTO".

	RF04.2.2 Mostrar Incorrecto. Si la respuesta es incorrecta se deberá mostrar "INCORRECTO".

		RF04.2.2.1 Mostrar rebote. Si el que falla es el primer jugador en responder en esta ronda, se deberá mostrar "REBOTE". Depende de RF02.2

		RF04.2.2.2 Mostrar solucion. Si falla el rebote se deberá mostrar la solución. 

#### RF04.3 Mostrar contador. Se deberá mostrar en todo momento el numero de aciertos de cada jugador. Depende de RF03.

	RF04.3.1 Contador Jugador x. Se deberá mostrar su contador de aciertos en la parte de la pantalla correspondiente. Si el jugador x acierta una pregunta, se le actualiza su contador.Depende RF03 y RF02.1.5.
				
#### RF04.4 Mostrar al final. Al acabar la partida se deberá mostrar el resultado. Depende de RF02.3.

	RF04.4.1 Mostrar resultado. Se deberá mostrar el resultado de la partida,(el nombre del jugador que gana o si hay empate). Depende de RF02.3.

	RF04.4.2 Jugar otra vez. Se deberá mostrar "Jugar otra vez". 
			

### RF05 Preguntas. Habrá distintas maneras de formular las preguntas. Al principio de la pregunta o definición, se indicará si la respuesta empieza o contiene por la letra correspondiente a la ronda. Depende de RF02.

#### RF05.1 Definición. Proposición que expone con claridad el significado de la palabra a responder.
		
#### RF05.2 Interrogación. Enunciado con signo de interrogación cuyo propósito es una respuesta.
		
#### RF05.3 Completar. Enunciado incompleto que debe ser rellenado con una palabra para darle un significado.
		

## Requisitos no funcionales
### RNF01 Soporte. El sistema estará soportado por PC. Sólo para navegador.
### RNF02 Almacenamiento. La batería de palabras estará almacenada en ficheros de texto.
### RNF03 Los jugadores tendrán un maximo de 15 segundos para responder cada pregunta.
### RNF04 El sistema no distingue entre mayúsculas y minúsculas.
### RNF05 El sistema no permitirá el uso de las tildes.
### RNF06 El sistema no permitirá el uso de los caracteres especiales.
### RNF07 La temática del juego será orientada al conocimiento deportivo.
### RNF08 Las respuestas deben contener o comenzar por la letra correspondiente a la ronda.
### RNF09 El sistema recibe la respuesta en la entrada por teclado.
### RNF10 El tiempo restante para responder se mostrará en el formato de segundos.
### RNF11 La primera ronda aleatoria no podrá ser la correspondiente a la letra "z".


# Apéndices adicionales
