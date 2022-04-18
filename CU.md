#DOCUMENTO
  
	##CASOS DE USO
	• Identificador único: * CU1 Iniciar partida.
	• Autor: Javier Luque Rueda, Juan José Tirado Arregui, Joaquín Ruiz Álvarez, Pablo Frías Campos
	• Contexto de uso: Los usuarios quieren jugar una partida.
	• Actor principal: Los usuarios.
	• Participantes y objetivos: Los usuarios; el objetivo es que ejecuten el juego.
	• Garantías de éxito y/o Post-condiciones: Se ejecuta correctamente el juego.
	• Precondiciones y activación: Ganas de divertirse y aprender sobre deportes.
	• Escenario principal: 1. Se encuentra con la máquina en funcionamiento.
	                       2. Ejecuta la plataforma del juego.
	• Escenarios alternativos: 1. No se ejecuta correctamente el juego por fallo.


	• Identificador único: * CU2 Introducir nombre.
	• Autor: Pablo Frías, Mario Bernáldez, Roberto Gil, Joaquín Ruiz Alvarez y Juan Jose Tirado Arregui.
	• Contexto de uso: Cuando el jugador quiere comenzar la partida.
	• Actor principal:Jugador.
	• Participantes y objetivos: Jugador y el sistema. Introducir el alias en el sistema.
	• Garantías mínimas:El nombre guardado representará al jugador durante el juego.
	• Garantías de éxito y/o Post-condiciones: Se almacena el nombre del jugador.
	• Precondiciones y activación: El jugador ha ejecutado el juego.
	• Escenario principal: 1.El jugador se conecta a la partida.
						   2.Se pide introducir el nombre por pantalla.
						   3.El jugador teclea el alias.
						   4.El nombre se almacena en el sistema.
	• Escenarios alternativos: Si el nombre no tiene el formato adecuado, se vuelve a pedir.
	
	• Identificador único: * CU3 Consultar ronda.
	• Autor: Joaquín Ruiz Alvarez y Javier Luque Rueda.
	• Contexto de uso: Comienza una ronda y el jugador puede ver todos los aspectos de ella.
	• Actor principal: Jugador.
	• Participantes y objetivos: El sistema y el jugador. El objetivo es que el jugador pueda consultar todo lo relacionado con una ronda.
	• Garantías mínimas: Que conozca lo relacionado con la ronda.
	• Garantías de éxito y/o Post-condiciones: Que se muestren las funcionalidades correctamente.
	• Precondiciones y activación: Que se haya comenzado el juego y estar en una ronda de la partida.
	• Escenario principal: 1.El jugador se encuentra en la partida.
						   2.Se encuentra en una parte de la ronda.
						   3.Se muestra por pantalla los aspectos correspondientes.
	• Escenarios alternativos: 1. No se muestra por pantalla lo necesario.

	• Identificador único: * CU4 Leer pregunta.
	• Autor: Pablo Frías, Mario Bernáldez, Roberto Gil, Joaquín Ruiz Alvarez y Juan Jose Tirado Arregui.
	• Contexto de uso: El jugador se encuentra en una letra y se lanza una pregunta correspondiente a ella.
	• Actor principal: Jugador.
	• Participantes y objetivos: El sistema y el jugador. El objetivo es plantearle una pregunta al jugador.
	• Garantías mínimas: Que la pregunta sea leída por el jugador.
	• Garantías de éxito y/o Post-condiciones: Que se muestre la pregunta correctamente.
	• Precondiciones y activación: Que se haya comenzado el juego y estar en una ronda de la partida.
	• Escenario principal: 1.El jugador se encuentra en la partida.
						   2.Al jugador le toca contestar una letra.
						   3.El sistema elige aleatoriamente en la base de datos una pregunta de esa letra.
						   4.El sitema manda la pregunta.
	• Escenarios alternativos: 1. No se muestra por pantalla la pregunta.
	
	
	• Identificador único: * CU5 Responder pregunta.
	• Autor: Pablo Frías, Mario Bernáldez, Roberto Gil, Carlos Pino Padilla, Joaquín Ruiz Alvarez y Juan Jose Tirado Arregui.
	• Contexto de uso: El jugador se encuentra con una pregunta de una letra.
	• Actor principal: Jugador.
	• Participantes y objetivos: El sistema y el jugador. El objetivo es responder la pregunta lanzada.
	• Garantías mínimas: Que se pida por teclado introducir la respuesta.
	• Garantías de éxito y/o Post-condiciones: Que el jugador responda la pregunta.
	• Precondiciones y activación: Que se haya comenzado el juego y el jugador haya visto mostrada la pregunta por pantalla.
	• Escenario principal: 1.El jugador se encuentra en la partida.
						   2.El sistema lanza una pregunta y el jugador la lee.
						   3.El sistema pide introducir por teclado la respuesta.
						   4.El jugador responde la pregunta.
	• Escenarios alternativos: 1. El jugador se encuentra en la partida.
							   2. El sistema lanza una pregunta y el jugador la lee.
							   3. El sistema pide introducir por teclado la respuesta.
							   4. Pasa el tiempo sin responder.
	
	
	• Identificador único: * CU6 Consultar validez de la respuesta.
	• Autor: Pablo Frías, Mario Bernáldez y Roberto Gil
	• Contexto de uso: El jugador acaba de responder una pregunta.
	• Actor principal: Jugador.
	• Participantes y objetivos: El sistema y el jugador. El objetivo es saber por el jugador si la pregunta es correcta o no. 
	• Garantías de éxito y/o Post-condiciones: Que se muestre por pantalla "CORRECTO" o "INCORRECTO".
	• Precondiciones y activación: El jugador ha respondido a una pregunta.
	• Escenario principal: 1. El jugador se encuentra en la partida.
						   2. El jugador ha respondido una pregunta.
						   3. El sistema comprueba en la base de datos que la respuesta es correcta.
						   4. El sistema muestra por pantalla la corrección.
	• Escenarios alternativos: Si no ha respondido dentro del tiempo, se muestra por pantalla "TIEMPO".
	
	
	• Identificador único: * CU7 Ver solución.
	• Autor: Pablo Frías, Mario Bernáldez, Roberto Gil, Carlos Pino Padilla, Joaquín Ruiz Alvarez y Juan Jose Tirado Arregui.
	• Contexto de uso: El jugador ha fallado el rebote.
	• Actor principal: El jugador
	• Participantes y objetivos: El sistema y los dos jugadores. El objetivo es saber la pregunta fallada.
	• Garantías de éxito y/o Post-condiciones: Que se muestre por pantalla la respuesta.
	• Precondiciones y activación: Que hayan fallado ambos jugadores la pregunta.
	• Escenario principal: 1. El jugador se encuentra en la partida
						   2. El jugador se encuentra en una ronda.
						   3. El jugador recibe el rebote
						   4. El rebote es fallado.
						   5. El sistema busca en la base de datos la respuesta.
						   6. El sistema muestra por pantalla la palabra.
	• Escenarios alternativos: Si el primer jugador en responder acierta acierta el rebote, no hace falta que muestre nada.								
							
	• Identificador único: * CU8 Ver puntuación.
	• Autor: Pablo Frías, Mario Bernáldez y Roberto Gil
	• Contexto de uso: El  jugador podrá saber en todo momento su puntuación actual.
	• Actor principal: El jugador.
	• Participantes y objetivos: EL sistema y el jugador; el objetivo es mostrar la puntuación del jugador. 
	• Garantías de éxito y/o Post-condiciones: Se muestra en pantalla la puntuación del jugador actualizada.
	• Precondiciones y activación: Que la partida haya empezado.
	• Escenario principal: 1. El jugador se encuentra en la partida.
			       2. El sistema lleva un recuento del número de puntos obtenidos. 
			       3. El sistema imprime por pantalla la puntuación del jugador.	
	• Escenarios alternativos: 1.No se muestra por pantalla el contador.
		

	• Identificador único:  * CU9 Ver resultado final.
	• Autor: Pablo Frías, Mario Bernáldez y Roberto Gil
	• Contexto de uso: Al terminar la partida se mostrará el resultado de la partida.
	• Actor principal: El jugador.
	• Participantes y objetivos: El sistema y el jugador; el objetivo es informar a los jugadores del resultado de la partida.
	• Garantías de éxito y/o Post-condiciones: Se mostrará por pantalla el resultado.
	• Precondiciones y activación: Se deben haber completado todas las rondas.
	• Escenario principal: 1. Acaban las rondas.
	                       2. El sistema muestra el resultado final.
	• Escenarios alternativos: No se acaba la partida por abandono de la plataforma.

	
	• Identificador único:  * CU10 Consultar tiempo.
	• Autor: Javier Luque Rueda, Juan José Tirado Arregui, Joaquín Ruiz Álvarez, Pablo Frías Campos
	• Contexto de uso: Se está respondiendo una pregunta de una ronda.
	• Actor principal: El jugador.
	• Participantes y objetivos: El sistema y el jugador; el objetivo del jugador es saber el tiempo que le queda para responder.
	• Garantías de éxito y/o Post-condiciones: 
	• Precondiciones y activación: Se ha lanzado la pregunta.
	• Escenario principal: 1. El jugador se encuentra en partida.
	                       2. Durante una ronda se informa del tiempo que le queda.
	• Escenarios alternativos: 1.No se muestra el tiempo


	Identificador único:  * CU11 Consultar rebote.
	• Autor: Javier Luque Rueda, Juan José Tirado Arregui, Joaquín Ruiz Álvarez, Pablo Frías Campos, Carlos Pino Padilla
	• Contexto de uso: Se lanza la misma pregunta al jugador que no ha contestado primero.
	• Actor principal: El jugador.
	• Participantes y objetivos: El sistema y el jugador; el objetivo del jugador es saber que hay rebote y debe contestar a la misma pregunta.
	• Garantías de éxito y/o Post-condiciones: Se muestra por pantalla "REBOTE".
	• Precondiciones y activación:  Primer jugador en contestar en la ronda falla.
	• Escenario principal: 1. El jugador se encuentra en partida.
	                       2. El jugador se encuentra en una ronda.
						   3. El jugador recibe el rebote.
						   4. Durante la ronda se informa si hay rebote.
	• Escenarios alternativos: No hay rebote. (El primer jugador acierta)

	
	Identificador único:  * CU12 Consultar bonus.
	• Autor: Javier Luque Rueda, Juan José Tirado Arregui, Joaquín Ruiz Álvarez, Pablo Frías Campos, Carlos Pino Padilla
	• Contexto de uso: Al lanzarse la pregunta, se mostrará si tiene bonus.
	• Actor principal: El jugador.
	• Participantes y objetivos: El sistema y el jugador; el objetivo del jugador es saber que la pregunta tiene bonus.
	• Garantías de éxito y/o Post-condiciones: Se muestra por pantalla "BONUS" y "Puntuación doble".
	• Precondiciones y activación:  La letra de la ronda es la elegida para el bonus aleatoriamente.
	• Escenario principal: 1. El jugador se encuentra en partida.
	                       2. El jugador se encuentra en una ronda.
						   3. Durante la ronda se informa si hay bonus.
	• Escenarios alternativos: No hay bonus (ronda normal).


	Identificador único:  * CU13 Jugar otra vez.
	• Autor: Javier Luque Rueda, Juan José Tirado Arregui, Joaquín Ruiz Álvarez, Pablo Frías Campos, Carlos Pino Padilla
	• Contexto de uso: Termina partida y juega otra vez.
	• Actor principal: El jugador.
	• Participantes y objetivos: El sistema y el jugador; el objetivo es que puedan volver a jugar otra partida.
	• Garantías de éxito y/o Post-condiciones: Se muestra por pantalla "jugar otra vez".
	• Precondiciones y activación:  Termina la partida.
	• Escenario principal: 1. El jugador se encuentra en partida.
	                       2. Acaban las rondas.
	• Escenarios alternativos: 1. Cierra la plataforma


	Identificador único:  * CU14 Gestión de preguntas.
	• Autor: Javier Luque Rueda, Juan José Tirado Arregui, Joaquín Ruiz Álvarez, Pablo Frías Campos, Carlos Pino Padilla
	• Contexto de uso: De dónde salen las preguntas.
	• Actor principal: El administrador. 
	• Participantes y objetivos: Administrador, que salga la pregunta correspondiente a la ronda en la partida.
	• Garantías de éxito y/o Post-condiciones: 
	• Precondiciones y activación: 
	• Escenario principal: 
	• Escenarios alternativos:

			       



 
