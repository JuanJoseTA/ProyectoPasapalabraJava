#DOCUMENTO
  
	##CASOS DE USO
	
	• Identificador único: * CU1 Introducir nombre.
	• Autor: Pablo Frías, Mario Bernáldez y Roberto Gil.
	• Contexto de uso: Cuando el jugador quiere comenzar la partida.
	• Actor principal:Jugador.
	• Participantes y objetivos: Jugador y el sistema. Introducir el alias en el sistema.
	• Garantías mínimas:El nombre guardado representará al jugador durante el juego.
	• Garantías de éxito y/o Post-condiciones: Se almacena el nombre del jugador.
	• Precondiciones y activación: El jugador ha ejecutado el juego.
	• Escenario principal: 1.El jugador se conecta a la partida.
						   2.Se pide introducir el nombre por pantalla.
						   3.El jugador teclea el alias
						   4.El nombre se almacena en el sistema.
	• Escenarios alternativos: Si el nombre no tiene el formato adecuado, se vuelve a pedir.
	
	• Identificador único: * CU2 Leer pregunta.
	• Autor: Pablo Frías, Mario Bernáldez y Roberto Gil
	• Contexto de uso: El jugador se encuentra en una letra y se lanza una pregunta correspondiente a ella.
	• Actor principal: Jugador.
	• Participantes y objetivos: El sistema y el jugador. El objetivo es plantearle una pregunta al jugador.
	• Garantías mínimas: Que la pregunta sea leída por el jugador.
	• Garantías de éxito y/o Post-condiciones: Que se muestre la pregunta correctamente.
	• Precondiciones y activación: Que se haya comenzado el juego y estar en una letra del sistema.
	• Escenario principal: 1.El jugador se encuentra en la partida.
						   2.Al jugador le toca contestar una letra.
						   3.El sistema elige aleatoriamente en la base de datos una pregunta de esa letra.
						   4.El sitema manda la pregunta.
	• Escenarios alternativos:
	
	
	• Identificador único: * CU3 Responder pregunta.
	• Autor: Pablo Frías, Mario Bernáldez y Roberto Gil
	• Contexto de uso: El jugador se encuentra con una pregunta de una letra.
	• Actor principal: Jugador.
	• Participantes y objetivos: El sistema y el jugador.El objetivo es responer la pregunta lanzada.
	• Garantías mínimas: Que se pida por teclado introducir la respuesta.
	• Garantías de éxito y/o Post-condiciones: Que el jugador responda la pregunta.
	• Precondiciones y activación: Que se haya comenzado el juego y el jugador haya visto mostrada la pregunta por pantalla.
	• Escenario principal: 1.El jugador se encuentra en la partida.
						   2.El sistema lanza una pregunta y el jugador la lee.
						   3.El sistema pide introducir por teclado la respuesta.
						   4.El jugador responde la pregunta.
	• Escenarios alternativos: Si el jugador no responde la pregunta o la responde con un formato no permitido,
							   el sistema la dará por incorrecta.
								
	
	
	
	• Identificador único: * CU4 Consultar resolución de pregunta.
	• Autor: Pablo Frías, Mario Bernáldez y Roberto Gil
	• Contexto de uso: El jugador acaba de responder una pregunta.
	• Actor principal: Jugador.
	• Participantes y objetivos: El sistema y el jugador.El objetivo es saber por el jugador si la pregunta es correcta o no. 
	• Garantías de éxito y/o Post-condiciones: Que se muestre por pantalla la resolución de dicha pregunta.
	• Precondiciones y activación: El jugador ha respondido a una pregunta.
	• Escenario principal: 1. El jugador se encuentra en la partida.
						   2. El jugador ha respondido una pregunta.
						   3. El sistema comprueba en la base de datos que la respuesta es correcta.
						   4. El sistema muestra por pantalla la resolución.
	• Escenarios alternativos: Si no ha respondido, se muestra por pantalla "TIEMPO".
	
	
	
	
	• Identificador único: * CU5 Ver solución.
	• Autor: Pablo Frías, Mario Bernáldez y Roberto Gil
	• Contexto de uso: El jugador ha fallado el rebote.
	• Actor principal: El sistema
	• Participantes y objetivos: El sistema y los dos jugadores. El objetivo es saber la pregunta fallada.
	• Garantías de éxito y/o Post-condiciones: Que se muestre por pantalla la respuesta.
	• Precondiciones y activación: Que hayan fallado ambos jugadores la pregunta.
	• Escenario principal: 1. El jugador se encuentra en la partida
						   2. El rebote es fallado.
						   3. El sistema busca en la base de datos la respuesta.
						   4. El sistema muestra por pantalla la palabra.
	• Escenarios alternativos: Si acierta el rebote, no hace falta que muestre nada.								
	
	
	
	
							
	• Identificador único: * CU6 Ver puntuación(1)
	• Autor: Pablo Frías, Mario Bernáldez y Roberto Gil
	• Contexto de uso
	• Actor principal
	• Participantes y objetivos
	• Garantías mínimas
	• Garantías de éxito y/o Post-condiciones
	• Precondiciones y activación
	• Escenario principal
	• Escenarios alternativos
		
	• Identificador único:  * CU7 Ver puntuación(2)
	• Autor: Pablo Frías, Mario Bernáldez y Roberto Gil
	• Contexto de uso
	• Actor principal
	• Participantes y objetivos
	• Garantías mínimas
	• Garantías de éxito y/o Post-condiciones
	• Precondiciones y activación
	• Escenario principal
	• Escenarios alternativos




 
