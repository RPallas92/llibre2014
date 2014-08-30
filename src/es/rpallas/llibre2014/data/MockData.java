package es.rpallas.llibre2014.data;

import java.util.ArrayList;
import java.util.List;

import es.rpallas.llibre2014.models.Event;

public class MockData {
	/**
	 * TODO Replace by real class and data
	 */

	private static List<Event> mEvents12;
	private static List<Event> mEvents13;
	private static List<Event> mEvents14;
	private static List<Event> mEvents15;

	public static List<Event> get12DayEvents() {
		mEvents12 = new ArrayList<Event>();
		mEvents12
				.add(new Event(
						"Colada de Furtaperas",
						"08:00",
						"En la Plaza Mayor, colgada de Furtaperas en el tocho, acompañado de la comparsa de cabezudos y el Prior de la Cofradía."));
		mEvents12
				.add(new Event(
						"Exposición filatelica y filatélica",
						"11:00",
						"En la planta baja del Museo de Historia y Tradición de Graus, inauguración de la XXIV Exposición Filatélica y Numismática con estafeta temporal provista del matasellos conmemorativo del centenario de la fundación del Orfeón de Graus, organizada por el Club Filatélico y Numismático GRADUS. (Exposición abierta de 11.30 a 14 horas y de 19 a 21 horas, hasta el día 15)."));
		mEvents12
				.add(new Event(
						"Trabucazo",
						"11:45",
						"En la Plaza Mayor, colgada de Furtaperas en el tocho, acompañado de la comparsa de cabezudos y el Prior de la Cofradía."));
		mEvents12
				.add(new Event(
						"Desfile de carrozas",
						"12:00",
						"Con el disparo de cohetes y volteo de campanas dará comienzo, en la Plaza de San Miguel, el desfile de carrozas, COMPARSA DE GIGANTES, CABEZUDOS, CABALLEZ y FURTAPERAS. Nos acompañarán la RONDALLA FRANCISCO PARRA con los cantadores FRANCISCO LASIERRA y JAVIER BADULES, la charanga BAND&DIEZ y la BANDA de la SOCIEDAD MUSICAL “LA PAZ” de SIETE AGUAS."));
		mEvents12
				.add(new Event(
						"Recibimiento de los gaiteros",
						"19:00",
						"Siguiendo la tradición, entre salvas y trabucazos, serán recibidos los gaiteros en el Puente de Abajo, por las repatanas y repatanes, danzantes, Autoridades, Prior de la Cofradía del Santo Cristo y San Vicente Ferrer, mozas, mozos y público en general, entrando por el Portal de Chinchín en dirección de la casa donde habitó San Vicente Ferrer ante la cual se cantará la primera Albada. Siguiendo hasta la iglesia de San Miguel, en la capilla del Santo Cristo, se interpretará la tradicional Albada, y las repatanas y repatanes ofrecerán los frutos de la tierra al Santo Cristo."));
		mEvents12
				.add(new Event(
						"Conciertos de música",
						"00:30",
						"En la Plaza Mayor, gran noche de música para todos con los grupos YOU ROCK y DeNOCHE."));
		return mEvents12;
	}

	public static List<Event> get13DayEvents() {
		mEvents13 = new ArrayList<Event>();
		mEvents13
				.add(new Event(
						"Diana floreada",
						"08:00",
						"Diana floreada a cargo de la Banda de Música. Misa de Hermanos en la Basílica de la Peña."));
		mEvents13
				.add(new Event(
						"Procesión",
						"10:30",
						"Procesión de San Vicente Ferrer, presidida por las repatanas y repatanes, Autoridades y el Prior de la Cofradía, con asistencia de los mozos danzantes que interpretarán el baile de la CARDELINA y la tradicional comparsa de Cabezudos, Caballez y Caretas. La procesión finalizará en la Basílica de la Peña, donde se celebrará la Santa Misa y cantará el Coro Parroquial."));
		mEvents13
				.add(new Event(
						"Actuación Danzantes",
						"13:00",
						"En la Plaza Mayor, primera actuación de nuestros danzantes y danzantas, que interpretarán los bailes de LAS ESPADAS, CULEBRETA, CINTAS y CANASTILLO. Actuación de la comparsa de Cabezudos, Caretas, Caballez, Gigantes y Furtaperas."));
		mEvents13
				.add(new Event(
						"Sesión Vermú",
						"14:00",
						"Sesión Vermú en el CDRG amenizada por la Orquesta VENUS. En el transcurso de la misma, entrega de los premios del Concurso de Carrozas Fiestas de Graus 2014."));
		mEvents13
				.add(new Event(
						"Espectáculo de circo",
						"18:00",
						"En el Patio del Colegio, espectáculo de circo contemporáneo “Colón es un intestino” por Compañía D’CLICK."));
		mEvents13
				.add(new Event(
						"Aniversario Teatro Salamero",
						"19:30",
						"Acto de conmemoración del 80 Aniversario del Cine-Teatro Salamero. Inauguración de la exposición Un siglo de cine en Graus. Cerrarán el acto las bandas de música de la Sociedad Musical “LA PAZ” de Siete Aguas y la de la Asociación Cultural GRADENSE de Graus."));
		mEvents13
				.add(new Event(
						"La Mojiganga",
						"21:30",
						"Cabalgata de la Mojiganga desde la Glorieta de Joaquín Costa hasta la Plaza Mayor, acompañada por la Banda de Música. A continuación, la MOJIGANGA."));
		mEvents13
				.add(new Event("Sesión de baile", "24:00",
						"Gran sesión de baile en el CDRG amenizada por la Orquesta VENUS."));

		return mEvents13;
	}

	public static List<Event> get14DayEvents() {
		mEvents14 = new ArrayList<Event>();
		mEvents14
				.add(new Event(
						"Diana floreada",
						"08:00",
						"Diana floreada a cargo de la Banda de Música. Misa de Hermanos en la iglesia parroquial."));
		mEvents14
				.add(new Event(
						"Procesión del Santo Cristo",
						"10:30",
						"Procesión del Santo Cristo, presidida por las repatanas y repatanes, Autoridades y el Prior de la Cofradía, con asistencia de los mozos danzantes que interpretarán el baile de la CARDELINA y la tradicional comparsa de Cabezudos, Caballez y Caretas. La procesión finalizará en la iglesia parroquial donde se celebrará la Santa Misa y cantará la Coral Villa de Graus, dirigida por Dª Noelia Torres."));
		mEvents14
				.add(new Event(
						"Actuación de Danzantes",
						"13:00",
						"En la Plaza Mayor, segunda actuación de los mozos y mozas danzantes y de la comparsa de Cabezudos, Caretas, Caballez, Gigantes y Furtaperas."));
		mEvents14
				.add(new Event("Sesión Vermú", "14:00",
						"Sesión Vermú en el CDRG amenizada por la Orquesta NOVA BLANES."));
		mEvents14
				.add(new Event(
						"La Llega",
						"15:30",
						"Partiendo del Portal de Chinchín, la tradicional Llega del Santo Cristo, presidida por el Prior, Autoridades y Hermanos de la Cofradía, recorrerá las calles de la Villa. Los danzantes, al compás de la gaita, interpretarán el baile de los palitroques."));
		mEvents14
				.add(new Event(
						"Recorrido Interpeñas",
						"19:30",
						"Saliendo de la Plaza Mayor, recorrido INTERPEÑAS con la charanga BAND&DIEZ que finalizará en el Espacio Interpeñas."));
		mEvents14
				.add(new Event("Momentos de Jota", "21:00",
						"En la Plaza Mayor, espectáculo “Momentos de Jota” con ROBERTO CIRIA."));
		mEvents14
				.add(new Event("Sesión de baile", "23:30",
						"Gran sesión de baile en el CDRG amenizada por la Orquesta NOVA BLANES."));
		mEvents14
				.add(new Event(
						"Canto de Albadas",
						"02:00",
						"Como es tradicional, los hijos de la Villa cantaremos las Albadas. A continuación, en la Plaza Mayor, ¡guiso de ternera para todos!"));

		return mEvents14;
	}

	public static List<Event> get15DayEvents() {
		mEvents15 = new ArrayList<Event>();

		mEvents15
				.add(new Event(
						"Diana floreada",
						"08:00",
						"Diana floreada por las calles de la villa por la BANDA DE MÚSICA de la ASOCIACIÓN CULTURAL GRADENSE."));
		mEvents15.add(new Event("Misa de difuntos", "11:00",
				"Misa de difuntos en la iglesia parroquial."));
		mEvents15
				.add(new Event("Espectáculo Ventealahora", "11:00",
						"En la Plaza Mayor, el espectáculo Ventealahora del colectivo NOSTRAXLADAMUS."));
		mEvents15
				.add(new Event("Actuación Danzantes infantiles", "12:30",
						"En la Plaza Mayor, actuación de los danzantes y cabezudos infantiles."));
		mEvents15.add(new Event("Sesión Vermú", "14:00",
				"Sesión Vermú en el CDRG amenizada por la Orquesta BARASONA."));
		mEvents15
				.add(new Event(
						"Homenaje a la Ribagorza",
						"19:00",
						"Homenaje a la Ribagorza. \nRecepción de Autoridades en el Ayuntamiento. \nA continuación, entrega en la Plaza Mayor de los Premios CALIBO De la Ribagorza y de los Premios del deporte local y comarcal de la temporada 2013/14. \nCon la participación de LOS NAVEGANTES, Producciones Teatrales y el grupo EL MANTEL DE NOA."));
		mEvents15
				.add(new Event(
						"Cabalgata fin de Fiestas",
						"23:00",
						"Cabalgata final de Fiestas y desfile de carrozas, desde la Plaza de San Miguel, con la BANDA DE MÚSICA de la ASOCIACIÓN CULTURAL GRADENSE \nAl llegar al puente del río Ésera, monumental castillo de fuegos artificiales y gran traca. \nY para finalizar, en el CDRG, gran sesión de baile amenizada por la Orquesta BARASONA."));

		return mEvents15;
	}

}
