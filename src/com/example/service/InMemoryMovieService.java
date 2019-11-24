package com.example.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


import com.example.domain.Director;
import com.example.domain.Genre;
import com.example.domain.Movie;
import com.example.model.CriteriaBean;

/**
 * 
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public class InMemoryMovieService implements MovieService {

    private Map<Integer, Movie> movies;
    private Map<Integer, Genre> genres;
    private Map<Integer, Director> directors;
    private static final MovieService instance = new InMemoryMovieService();

    public static MovieService getInstance() {
        return instance;
    }

    private InMemoryMovieService() {
        movies = new ConcurrentHashMap<>();
        genres = new ConcurrentHashMap<>();
        directors = new ConcurrentHashMap<>();
        populate();
    }

    public void populate() {
        movies.put(1, new Movie(1, "500 Days Of Summer", 2009, "tt1022603"));
        movies.put(2, new Movie(2, "Beyond a Reasonable Doubt", 2009,
                "tt1183251"));
        movies.put(3, new Movie(3, "Gamer", 2009, "tt1034032"));
        movies.put(4, new Movie(4, "Cheri", 2009, "tt1179258"));
        movies.put(5, new Movie(5, "Dorian Gray", 2009, "tt1235124"));
        movies.put(6, new Movie(6, "Inglourious Basterds", 2009, "tt0361748"));
        movies.put(7, new Movie(7, "Invictus", 2009, "tt1057500"));
        movies.put(8, new Movie(8, "Julie and Julia", 2009, "tt1135503"));
        movies.put(9, new Movie(9, "Los abrazos rotos", 2009, "tt0913425"));
        movies.put(10, new Movie(10, "Of Mice and Men", 1992, "tt0105046"));
        movies.put(11, new Movie(11, "Armored", 2009, "tt0913354"));
        movies.put(12, new Movie(12, "Bornova Bornova", 2009, "tt1548542"));
        movies.put(13, new Movie(13, "Coco avant Chanel", 2009, "tt1035736"));
        movies.put(14,
                new Movie(14, "Nefes: Vatan sa?olsun", 2009, "tt1171701"));
        movies.put(15, new Movie(15, "Up", 2009, "tt1049413"));
        movies.put(16, new Movie(16, "Whiteout", 2009, "tt0365929"));
        movies.put(17, new Movie(17, "The Time Travelers Wife", 2009,
                "tt0452694"));
        movies.put(18, new Movie(18, "Whatever Works", 2009, "tt1178663"));
        movies.put(19, new Movie(19, "Anonyma - Eine Frau in Berlin", 2009,
                "tt1035730"));
        movies.put(20, new Movie(20, "Zombieland", 2009, "tt1156398"));
        movies.put(21, new Movie(21, "Weather Girl", 2009, "tt1085515"));
        movies.put(22, new Movie(22, "Watchmen", 2009, "tt0409459"));
        movies.put(23, new Movie(23, "Adam Resurrected", 2008, "tt0479341"));
        movies.put(24, new Movie(24, "Angels and Deamons", 2009, "tt0808151"));
        movies.put(25, new Movie(25, "Away We Go", 2009, "tt1176740"));
        movies.put(26, new Movie(26, "Last Ride", 2009, "tt1235142"));
        movies.put(27, new Movie(27, "The Boys Are Back", 2009, "tt0926380"));
        movies.put(28,
                new Movie(28, "Nothing But the Truth", 2008, "tt1073241"));
        movies.put(29, new Movie(29, "100 Feet", 2008, "tt0899128"));
        movies.put(30, new Movie(30, "The Tournament", 2009, "tt0471041"));
        movies.put(31, new Movie(31, "Nordwand", 2008, "tt0844457"));
        movies.put(32, new Movie(32, "A Serious Man", 2009, "tt1019452"));
        movies.put(33, new Movie(33, "Saw VI", 2009, "tt1233227"));
        movies.put(34, new Movie(34, "Ne te retourne pas", 2009, "tt1075113"));
        movies.put(35, new Movie(35, "District 9", 2009, "tt1136608"));
        movies.put(36, new Movie(36, "Extract", 2009, "tt1225822"));
        movies.put(37,
                new Movie(37, "Five Minutes of Haven", 2009, "tt1238291"));
        movies.put(38, new Movie(38, "High Life", 2009, "tt1143110"));
        movies.put(39, new Movie(39, "The Proposal", 2009, "tt1041829"));
        movies.put(40, new Movie(40, "Veronika Decides to Die", 2009,
                "tt1068678"));
        movies.put(41, new Movie(41, "The Other Man", 2008, "tt0974613"));
        movies.put(42, new Movie(42, "The Goods: Live Hard, Sell Hard", 2009,
                "tt1092633"));
        movies.put(43, new Movie(43, "The Hangover", 2009, "tt1119646"));
        movies.put(44, new Movie(44, "Public Enemies", 2009, "tt1152836"));
        movies.put(45, new Movie(45, "Creation", 2009, "tt0974014"));
        movies.put(46, new Movie(46, "Amelia", 2009, "tt1129445"));
        movies.put(47, new Movie(47, "The Rebound", 2009, "tt1205535"));
        movies.put(48, new Movie(48, "Powder Blue", 2009, "tt1032819"));
        movies.put(49, new Movie(49, "The Men Who Stare at Goats", 2009,
                "tt1234548"));
        movies.put(50, new Movie(50, "Bright Star", 2009, "tt0810784"));
        movies.put(51, new Movie(51, "Case 39", 2009, "tt0795351"));
        movies.put(52, new Movie(52, "Cold Souls", 2009, "tt1127877"));
        movies.put(53, new Movie(53, "Moon", 2009, "tt1182345"));
        movies.put(54, new Movie(54, "Worlds Greatest Dad", 2009, "tt1262981"));
        movies.put(55, new Movie(55, "Paranormal Activity", 2007, "tt1179904"));
        movies.put(56, new Movie(56, "State of Play", 2009, "tt0473705"));
        movies.put(57, new Movie(57, "God on Trial", 2008, "tt1173494"));
        movies.put(58, new Movie(58, "The Brothers Bloom", 2009, "tt0844286"));
        movies.put(59, new Movie(59, "My One and Only", 2009, "tt1185431"));
        movies.put(60, new Movie(60, "Mâ€žn Som Hatar Kvinnor", 2009,
                "tt1132620"));
        movies.put(61, new Movie(61, "Mary and Max", 2009, "tt0978762"));
        movies.put(62,
                new Movie(62, "The Limits of Control", 2009, "tt0978762"));
        movies.put(63, new Movie(63, "Sunshine Cleaning", 2008, "tt0862846"));
        movies.put(64, new Movie(64, "A Perfect Getaway", 2009, "tt0971209"));
        movies.put(65, new Movie(65, "My Sisters Keeper", 2009, "tt1078588"));
        movies.put(66, new Movie(66, "Oorlogswinter", 2008, "tt0795441"));
        movies.put(67, new Movie(67, "Planet 51", 2009, "tt0762125"));
        movies.put(68, new Movie(68, "Before the Rain", 1994, "tt0110882"));
        movies.put(69, new Movie(69, "I Love You, Man", 2009, "tt1155056"));
        movies.put(70, new Movie(70, "Rembetiko", 1983, "tt0086182"));
        movies.put(71, new Movie(71, "Amelia", 2009, "tt1129445"));
        movies.put(72, new Movie(72, "The Damned United", 2009, "tt1226271"));
        movies.put(73, new Movie(73, "Hiroshima", 2005, "tt0475296"));
        movies.put(74, new Movie(74, "New York, I Love You", 2009, "tt0808399"));
        movies.put(75, new Movie(75, "Fish Tank", 2009, "tt1232776"));
        movies.put(76, new Movie(76, "The Informant!", 2009, "tt1130080"));
        movies.put(77, new Movie(77, "The Courageous Heart of Irena Sendler",
                2009, "tt1010278"));
        movies.put(78, new Movie(78, "Storm", 2009, "tt0768239"));
        movies.put(79, new Movie(79, "Before the Devil Knows You are Dead",
                2007, "tt0292963"));
        movies.put(80, new Movie(80, "Triangle", 2009, "tt1187064"));
        movies.put(81, new Movie(81, "The Great Escape", 1963, "tt0057115"));
        movies.put(82, new Movie(82, "2012", 2009, "tt1190080"));
        movies.put(83, new Movie(83, "The Cry of the Owl", 2009, "tt1034302"));
        movies.put(84, new Movie(84, "13B", 2009, "tt1385824"));
        movies.put(85, new Movie(85, "Double Indemnity", 1944, "tt0036775"));
        movies.put(86, new Movie(86, "Butch Cassidy and the Sundance Kid",
                1969, "tt0064115"));
        movies.put(87, new Movie(87, "El secreto de sus ojos", 2009,
                "tt1305806"));
        movies.put(88, new Movie(88, "Danton", 1983, "tt0083789"));
        movies.put(89, new Movie(89, "Easy Rider", 1969, "tt0064276"));
        movies.put(90, new Movie(90, "Surrogates", 2009, "tt0986263"));
        movies.put(91, new Movie(91, "Dog Day Afternoon", 1975, "tt0072890"));
        movies.put(92, new Movie(92, "A Streetcar Named Desire", 1951,
                "tt0044081"));
        movies.put(93, new Movie(93, "Sunset Blvd.", 1950, "tt0043014"));
        movies.put(94, new Movie(94, "Network", 1976, "tt0074958"));
        movies.put(95, new Movie(95, "Vertigo", 1958, "tt0052357"));
        movies.put(96, new Movie(96, "Bom yeoreum gaeul gyeoul geurigo bom",
                2003, "tt0374546"));
        movies.put(97, new Movie(97, "Them!", 1954, "tt0047573"));
        movies.put(98, new Movie(98, "Bin-jip", 2004, "tt0423866"));
        movies.put(99, new Movie(99, "Nae meorisokui jiwoogae", 2004,
                "tt0428870"));
        movies.put(100, new Movie(100, "Hwal", 2005, "tt0456470"));
        movies.put(101, new Movie(101, "Kimssi pyoryugi", 2009, "tt1499666"));
        movies.put(102, new Movie(102, "Uzak ?htimal", 2009, "tt1366981"));
        movies.put(103, new Movie(103, "Daybreakers", 2009, "tt0433362"));
        movies.put(104, new Movie(104, "Bin-mong", 2008, "tt1165253"));
        movies.put(105, new Movie(105, "Oldboy", 2003, "tt0364569"));
        movies.put(106, new Movie(106, "Cairo Time", 2009, "tt0896529"));
        movies.put(107, new Movie(107, "Pazar - Bir Ticaret MasalÃ•", 2008,
                "tt1286165"));
        movies.put(108, new Movie(108, "The Cove", 2009, "tt1313104"));
        movies.put(109, new Movie(109, "Tenderness", 2009, "tt0494864"));
        movies.put(110, new Movie(110, "Hachiko: A Dogs Story", 2009,
                "tt1028532"));
        movies.put(111, new Movie(111, "The Treasure of the Sierra Madre",
                1948, "tt0040897"));
        movies.put(112, new Movie(112, "Le magnifique", 1973, "tt0070354"));
        movies.put(113, new Movie(113, "The Party", 1968, "tt0063415"));
        movies.put(114, new Movie(114, "The Box", 2009, "tt0362478"));
        movies.put(115, new Movie(115, "Everybodys Fine", 2009, "tt0780511"));
        movies.put(116, new Movie(116, "Peter and Vandy", 2009, "tt1144551"));
        movies.put(117, new Movie(117, "Psycho", 1960, "tt0054215"));
        movies.put(118, new Movie(118, "Women in Trouble", 2009, "tt1247704"));
        movies.put(119, new Movie(119, "Shichinin no samurai", 1954,
                "tt0047478"));
        movies.put(120, new Movie(120, "Yeopgijeogin geunyeo", 2001,
                "tt0293715"));
        movies.put(121, new Movie(121, "Samaria", 2004, "tt0397619"));
        movies.put(122, new Movie(122, "Dial M for Murder", 1954, "tt0046912"));
        movies.put(123, new Movie(123, "Un prophÅ te", 2009, "tt1235166"));
        movies.put(124, new Movie(124, "The Vicious Kind", 2009, "tt1183921"));
        movies.put(125, new Movie(125, "Bakjwi", 2009, "tt0762073"));
        movies.put(126, new Movie(126, "Up in the air", 2009, "tt1193138"));
        movies.put(127, new Movie(127,
                "The Little Girl Who Lives Down the Lane", 1976, "tt0074806"));
        movies.put(128,
                new Movie(128, "Law Abiding Citizen", 2009, "tt1197624"));
        movies.put(129, new Movie(129, "Nine", 2009, "tt0875034"));
        movies.put(131, new Movie(131, "The Hurt Locker", 2008, "tt0887912"));
        movies.put(132, new Movie(132, "The Soloist", 2009, "tt0821642"));
        movies.put(133, new Movie(133, "Agora", 2009, "tt1186830"));
        movies.put(134, new Movie(134, "Motherhood", 2009, "tt1220220"));
        movies.put(135, new Movie(135, "The Wild Brunch", 1969, "tt0065214"));
        movies.put(136, new Movie(136, "Ne?eli Hayat", 2009, "tt1523515"));
        movies.put(137, new Movie(137, "The Greatest", 2009, "tt1226232"));
        movies.put(138, new Movie(138, "My Only Sunshine", 2008, "tt1370212"));
        movies.put(139, new Movie(139, "The Accused", 1988, "tt0094608"));
        movies.put(140, new Movie(140, "Empire of the Sun", 1987, "tt0092965"));
        movies.put(141, new Movie(141, "The Outsiders", 1983, "tt0086066"));
        movies.put(142, new Movie(142,
                "The Boondock Saints II: All Saints Day", 2009, "tt1300851"));
        movies.put(143, new Movie(143, "From Paris with Love", 2010,
                "tt1179034"));
        movies.put(144, new Movie(144, "Heavenly Creatures", 1994, "tt0110005"));
        movies.put(145, new Movie(145, "The Private Lives of Pippa Lee", 2009,
                "tt1134629"));
        movies.put(146, new Movie(146, "The Imaginarium of Doctor Parnassus",
                2009, "tt1054606"));
        movies.put(147, new Movie(147, "The Men Who Stare at Goats", 2009,
                "tt1234548"));
        movies.put(148, new Movie(148, "Cloudy with a Chance of Meatballs",
                2009, "tt0844471"));
        movies.put(149, new Movie(149, "The Princess and the Frog", 2009,
                "tt0780521"));
        movies.put(150, new Movie(150, "An Education", 2009, "tt1174732"));
        movies.put(151, new Movie(151, "Avatar", 2009, "tt0499549"));
        movies.put(152, new Movie(152, "Avatar 3D", 2009, "tt0499549"));
        movies.put(153, new Movie(153,
                "Precious: Based on the Novel Push by Sapphire", 2009,
                "tt0929632"));
        movies.put(154, new Movie(154, "The Blind Side", 2009, "tt0878804"));
        movies.put(155, new Movie(155, "New Moon", 2009, "tt1259571"));
        movies.put(156, new Movie(156, "Fantastic Mr. Fox", 2009, "tt0432283"));
        movies.put(157, new Movie(157, "Sherlock Holmes", 2009, "tt0988045"));
        movies.put(158, new Movie(158, "My Own Private Idaho", 1991,
                "tt0102494"));
        movies.put(159, new Movie(159, "The Road", 2009, "tt0898367"));
        movies.put(160, new Movie(160, "Karamazovi", 2008, "tt1080716"));
        movies.put(161, new Movie(161, "Mâ€žn som hatar kvinnor", 2009,
                "tt1132620"));
        movies.put(162, new Movie(162, "The Collector", 2009, "tt0844479"));
        movies.put(163, new Movie(163, "Bacheha-Ye aseman", 1997, "tt0118849"));
        movies.put(164, new Movie(164, "Deiji", 2006, "tt0468704"));
        movies.put(165, new Movie(165, "Leaves of Grass", 2009, "tt1151359"));
        movies.put(166, new Movie(166, "Scarface", 1983, "tt0086250"));
        movies.put(167, new Movie(167, "Wicker Park", 2004, "tt0324554"));
        movies.put(168, new Movie(168, "L appartement", 1996, "tt0115561"));
        movies.put(169, new Movie(169, "Brooklyns Finest", 2009, "tt1210042"));
        movies.put(170, new Movie(170, "Alice", 2009, "tt1461312"));
        movies.put(171, new Movie(171, "Duplicity", 2009, "tt1135487"));
        movies.put(172, new Movie(172, "Harry Brown", 2009, "tt1289406"));
        movies.put(173, new Movie(173, "Jeux Denfants", 2003, "tt0364517"));
        movies.put(174, new Movie(174, "Defendor", 2009, "tt1303828"));
        movies.put(175, new Movie(175, "Edge of Darkness", 2010, "tt1226273"));
        movies.put(176, new Movie(176, "Just Like Heaven", 2005, "tt0425123"));
        movies.put(177, new Movie(177, "2046", 2004, "tt0212712"));
        movies.put(178, new Movie(178, "Brothers", 2009, "tt0765010"));
        movies.put(179, new Movie(179, "Crazy Heart", 2009, "tt1263670"));
        movies.put(180, new Movie(180, "Shutter Island", 2010, "tt1130884"));
        movies.put(181, new Movie(181, "KÃ•skanmak", 2009, "tt1512894"));
        movies.put(182, new Movie(182,
                "Das weisse Band - Eine deutsche Kindergeschichte", 2009,
                "tt1149362"));
        movies.put(183, new Movie(183, "The Lovely Bones", 2009, "tt0380510"));
        movies.put(184, new Movie(184, "Eastern Plays", 2009, "tt1426361"));
        movies.put(185, new Movie(185, "Ghost Town", 2008, "tt0995039"));
        movies.put(186, new Movie(186, "Almost Famous", 2000, "tt0181875"));
        movies.put(187, new Movie(187, "Cargo", 2009, "tt0381940"));
        movies.put(188, new Movie(188, "Glorious 39", 2009, "tt1319694"));
        movies.put(189, new Movie(189, "Fifty Dead Men Walking", 2009,
                "tt1097643"));
        movies.put(190, new Movie(190, "Grey Gardens", 2009, "tt0758751"));
        movies.put(191, new Movie(191, "The Bounty Hunter", 2010, "tt1038919"));
        movies.put(192, new Movie(192, "To Verdener", 2008, "tt1065318"));
        movies.put(193, new Movie(193, "Vavien", 2009, "tt1558877"));
        movies.put(194, new Movie(194, "The Return of Frank James", 1940,
                "tt0032983"));
        movies.put(195, new Movie(195, "Lebanon", 2009, "tt1483831"));
        movies.put(196, new Movie(196,
                "Harry Potter and the Half-Blood Prince", 2009, "tt0417741"));
        movies.put(197, new Movie(197, "Slovenka", 2009, "tt1224373"));
        movies.put(198, new Movie(198, "9:06", 2009, "tt1361326"));
        movies.put(199, new Movie(199, "Der amerikanische Freund", 1977,
                "tt0075675"));
        movies.put(200, new Movie(200, "2081", 2009, "tt1282015"));
        movies.put(201, new Movie(201, "Dear John", 2010, "tt0989757"));
        movies.put(202, new Movie(202, "Broken English", 2007, "tt0772157"));
        movies.put(203, new Movie(203, "The Last Wave", 1977, "tt0076299"));
        movies.put(204, new Movie(204, "The Rainmaker", 1997, "tt0119978"));
        movies.put(205, new Movie(205, "Keulraesik", 2003, "tt0348568"));
        movies.put(206, new Movie(206, "The Electric Mist", 2009, "tt0910905"));
        movies.put(207, new Movie(207, "Serious Moonlight", 2009, "tt1133993"));
        movies.put(208, new Movie(208, "Ice Age", 2002, "tt0268380"));
        movies.put(209, new Movie(209, "Ice Age: The Meltdown", 2006,
                "tt0438097"));
        movies.put(210, new Movie(210, "Ice Age: Dawn of the Dinosaurs", 2009,
                "tt1080016"));
        movies.put(211, new Movie(211, "La doppia ora", 2009, "tt1379222"));
        movies.put(212, new Movie(212, "A Single Man", 2009, "tt1315981"));
        movies.put(213, new Movie(213, "Cracks", 2009, "tt1183665"));
        movies.put(214, new Movie(214, "The Missing Person", 2009, "tt1105512"));
        movies.put(215, new Movie(215, "Extraordinary Measures", 2010,
                "tt1244659"));
        movies.put(216, new Movie(216, "Leap Year", 2010, "tt1216492"));
        movies.put(217, new Movie(217, "Nowhere Boy", 2009, "tt1266029"));
        movies.put(218, new Movie(218, "Yah?i BatÃ•", 2010, "tt1567448"));
        movies.put(219, new Movie(219, "Sonbahar", 2008, "tt1330591"));
        movies.put(220, new Movie(220, "Tombstone", 1993, "tt0108358"));
        movies.put(221, new Movie(221, "La Sconosciuta", 2006, "tt0494271"));
        movies.put(222, new Movie(222, "I Love You Phillip Morris", 2010,
                "tt1045772"));
        movies.put(223, new Movie(223, "You Dont Know Jack", 2010, "tt1132623"));
        movies.put(224, new Movie(224, "Ex Drummer", 2007, "tt0812243"));
        movies.put(225, new Movie(225, "Yip Man", 2008, "tt1220719"));
        movies.put(226, new Movie(226, "Yip Man 2: Chung si chuen kei", 2010,
                "tt1386932"));
        movies.put(227,
                new Movie(227, "Alice in Wonderland", 2010, "tt1014759"));
        movies.put(228, new Movie(228, "Chloe", 2009, "tt1352824"));
        movies.put(229, new Movie(229, "Elegy", 2008, "tt0974554"));
        movies.put(230, new Movie(230, "Voditel dlya Very", 2004, "tt0416292"));
        movies.put(231, new Movie(231, "Romantik Komedi", 2010, "tt1587263"));
        movies.put(232, new Movie(232, "Veda", 2010, "tt1586001"));
        movies.put(233, new Movie(233, "Drag Me to Hell", 2009, "tt1127180"));
        movies.put(234, new Movie(234, "Stalag 17", 1953, "tt0046359"));
        movies.put(235, new Movie(235, "What Doesnt Kill You", 2008,
                "tt1133991"));
        movies.put(236, new Movie(236, "Faubourg 36", 2008, "tt0948535"));
        movies.put(237, new Movie(237, "Germinal", 1993, "tt0107002"));
        movies.put(238, new Movie(238,
                "My Left Foot: The Story of Christy Brown", 1989, "tt0097937"));
        movies.put(239, new Movie(239, "Sin Nombre", 2010, "tt1127715"));
        movies.put(240, new Movie(240, "Eloâ€¹se", 2009, "tt1221188"));
        movies.put(241, new Movie(241, "Ba?ka Dilde A?k", 2009, "tt1513713"));
        movies.put(242, new Movie(242, "The Book of Eli", 2010, "tt1037705"));
        movies.put(243, new Movie(243, "Air Doll", 2009, "tt1371630"));
        movies.put(244, new Movie(244, "Azumi", 2003, "tt0384819"));
        movies.put(245, new Movie(245, "Azumi 2: Death or Love", 2005,
                "tt0431641"));
        movies.put(246, new Movie(246, "Unthinkable", 2010, "tt0914863"));
        movies.put(255,
                new Movie(255, "Shrek Forever After", 2010, "tt0892791"));
        genres.put(1, new Genre(1, "Comedy"));
        genres.put(2, new Genre(2, "Drama"));
        genres.put(3, new Genre(3, "Romance"));
        genres.put(4, new Genre(4, "Mystery"));
        genres.put(5, new Genre(5, "Action"));
        genres.put(6, new Genre(6, "Sci-Fi"));
        genres.put(7, new Genre(7, "Thriller"));
        genres.put(8, new Genre(8, "War"));
        genres.put(9, new Genre(9, "Biography"));
        genres.put(10, new Genre(10, "History"));
        genres.put(11, new Genre(11, "Adventure"));
        genres.put(12, new Genre(12, "Animation"));
        genres.put(13, new Genre(13, "Family"));
        genres.put(14, new Genre(14, "Crime"));
        genres.put(15, new Genre(15, "Horror"));
        genres.put(16, new Genre(16, "Sport"));
        genres.put(17, new Genre(17, "Fantasy"));
        genres.put(18, new Genre(18, "Music"));
        genres.put(19, new Genre(19, "Film-Noir"));
        genres.put(20, new Genre(20, "Western"));
        genres.put(21, new Genre(21, "Documentary"));
        genres.put(22, new Genre(22, "Musical"));
        movies.get(1).getGenres().add(genres.get(1));
        movies.get(1).getGenres().add(genres.get(2));
        movies.get(1).getGenres().add(genres.get(3));
        movies.get(2).getGenres().add(genres.get(2));
        movies.get(2).getGenres().add(genres.get(4));
        movies.get(3).getGenres().add(genres.get(5));
        movies.get(3).getGenres().add(genres.get(6));
        movies.get(3).getGenres().add(genres.get(7));
        movies.get(4).getGenres().add(genres.get(2));
        movies.get(4).getGenres().add(genres.get(3));
        movies.get(5).getGenres().add(genres.get(2));
        movies.get(6).getGenres().add(genres.get(2));
        movies.get(6).getGenres().add(genres.get(8));
        movies.get(7).getGenres().add(genres.get(9));
        movies.get(7).getGenres().add(genres.get(2));
        movies.get(7).getGenres().add(genres.get(10));
        movies.get(8).getGenres().add(genres.get(9));
        movies.get(8).getGenres().add(genres.get(2));
        movies.get(8).getGenres().add(genres.get(1));
        movies.get(8).getGenres().add(genres.get(3));
        movies.get(9).getGenres().add(genres.get(2));
        movies.get(9).getGenres().add(genres.get(7));
        movies.get(9).getGenres().add(genres.get(3));
        movies.get(10).getGenres().add(genres.get(2));
        movies.get(11).getGenres().add(genres.get(5));
        movies.get(11).getGenres().add(genres.get(2));
        movies.get(11).getGenres().add(genres.get(7));
        movies.get(12).getGenres().add(genres.get(2));
        movies.get(13).getGenres().add(genres.get(9));
        movies.get(13).getGenres().add(genres.get(2));
        movies.get(14).getGenres().add(genres.get(5));
        movies.get(14).getGenres().add(genres.get(11));
        movies.get(14).getGenres().add(genres.get(2));
        movies.get(14).getGenres().add(genres.get(8));
        movies.get(15).getGenres().add(genres.get(12));
        movies.get(15).getGenres().add(genres.get(11));
        movies.get(15).getGenres().add(genres.get(1));
        movies.get(15).getGenres().add(genres.get(13));
        movies.get(16).getGenres().add(genres.get(5));
        movies.get(16).getGenres().add(genres.get(14));
        movies.get(16).getGenres().add(genres.get(2));
        movies.get(16).getGenres().add(genres.get(4));
        movies.get(17).getGenres().add(genres.get(2));
        movies.get(17).getGenres().add(genres.get(6));
        movies.get(17).getGenres().add(genres.get(3));
        movies.get(18).getGenres().add(genres.get(1));
        movies.get(18).getGenres().add(genres.get(3));
        movies.get(19).getGenres().add(genres.get(2));
        movies.get(19).getGenres().add(genres.get(8));
        movies.get(20).getGenres().add(genres.get(5));
        movies.get(20).getGenres().add(genres.get(1));
        movies.get(20).getGenres().add(genres.get(15));
        movies.get(21).getGenres().add(genres.get(1));
        movies.get(22).getGenres().add(genres.get(5));
        movies.get(22).getGenres().add(genres.get(2));
        movies.get(22).getGenres().add(genres.get(4));
        movies.get(22).getGenres().add(genres.get(6));
        movies.get(22).getGenres().add(genres.get(7));
        movies.get(23).getGenres().add(genres.get(2));
        movies.get(23).getGenres().add(genres.get(8));
        movies.get(24).getGenres().add(genres.get(4));
        movies.get(24).getGenres().add(genres.get(7));
        movies.get(25).getGenres().add(genres.get(1));
        movies.get(25).getGenres().add(genres.get(2));
        movies.get(26).getGenres().add(genres.get(2));
        movies.get(27).getGenres().add(genres.get(2));
        movies.get(28).getGenres().add(genres.get(2));
        movies.get(28).getGenres().add(genres.get(7));
        movies.get(29).getGenres().add(genres.get(15));
        movies.get(29).getGenres().add(genres.get(7));
        movies.get(30).getGenres().add(genres.get(5));
        movies.get(31).getGenres().add(genres.get(11));
        movies.get(31).getGenres().add(genres.get(2));
        movies.get(31).getGenres().add(genres.get(10));
        movies.get(31).getGenres().add(genres.get(16));
        movies.get(32).getGenres().add(genres.get(1));
        movies.get(32).getGenres().add(genres.get(2));
        movies.get(33).getGenres().add(genres.get(14));
        movies.get(33).getGenres().add(genres.get(15));
        movies.get(33).getGenres().add(genres.get(4));
        movies.get(33).getGenres().add(genres.get(7));
        movies.get(34).getGenres().add(genres.get(2));
        movies.get(35).getGenres().add(genres.get(5));
        movies.get(35).getGenres().add(genres.get(2));
        movies.get(35).getGenres().add(genres.get(6));
        movies.get(35).getGenres().add(genres.get(7));
        movies.get(36).getGenres().add(genres.get(1));
        movies.get(37).getGenres().add(genres.get(2));
        movies.get(37).getGenres().add(genres.get(14));
        movies.get(37).getGenres().add(genres.get(7));
        movies.get(38).getGenres().add(genres.get(1));
        movies.get(38).getGenres().add(genres.get(2));
        movies.get(39).getGenres().add(genres.get(1));
        movies.get(39).getGenres().add(genres.get(2));
        movies.get(39).getGenres().add(genres.get(3));
        movies.get(40).getGenres().add(genres.get(2));
        movies.get(41).getGenres().add(genres.get(2));
        movies.get(42).getGenres().add(genres.get(1));
        movies.get(43).getGenres().add(genres.get(11));
        movies.get(43).getGenres().add(genres.get(1));
        movies.get(43).getGenres().add(genres.get(14));
        movies.get(44).getGenres().add(genres.get(9));
        movies.get(44).getGenres().add(genres.get(14));
        movies.get(44).getGenres().add(genres.get(2));
        movies.get(44).getGenres().add(genres.get(10));
        movies.get(44).getGenres().add(genres.get(7));
        movies.get(45).getGenres().add(genres.get(9));
        movies.get(45).getGenres().add(genres.get(2));
        movies.get(46).getGenres().add(genres.get(9));
        movies.get(46).getGenres().add(genres.get(2));
        movies.get(47).getGenres().add(genres.get(1));
        movies.get(47).getGenres().add(genres.get(3));
        movies.get(48).getGenres().add(genres.get(2));
        movies.get(49).getGenres().add(genres.get(1));
        movies.get(49).getGenres().add(genres.get(8));
        movies.get(50).getGenres().add(genres.get(9));
        movies.get(50).getGenres().add(genres.get(2));
        movies.get(50).getGenres().add(genres.get(3));
        movies.get(51).getGenres().add(genres.get(15));
        movies.get(51).getGenres().add(genres.get(7));
        movies.get(52).getGenres().add(genres.get(1));
        movies.get(52).getGenres().add(genres.get(2));
        movies.get(53).getGenres().add(genres.get(2));
        movies.get(53).getGenres().add(genres.get(4));
        movies.get(53).getGenres().add(genres.get(6));
        movies.get(53).getGenres().add(genres.get(7));
        movies.get(54).getGenres().add(genres.get(1));
        movies.get(54).getGenres().add(genres.get(2));
        movies.get(55).getGenres().add(genres.get(15));
        movies.get(55).getGenres().add(genres.get(7));
        movies.get(56).getGenres().add(genres.get(2));
        movies.get(56).getGenres().add(genres.get(4));
        movies.get(56).getGenres().add(genres.get(7));
        movies.get(57).getGenres().add(genres.get(2));
        movies.get(58).getGenres().add(genres.get(11));
        movies.get(58).getGenres().add(genres.get(1));
        movies.get(58).getGenres().add(genres.get(14));
        movies.get(58).getGenres().add(genres.get(2));
        movies.get(58).getGenres().add(genres.get(3));
        movies.get(59).getGenres().add(genres.get(1));
        movies.get(59).getGenres().add(genres.get(2));
        movies.get(60).getGenres().add(genres.get(14));
        movies.get(60).getGenres().add(genres.get(4));
        movies.get(60).getGenres().add(genres.get(7));
        movies.get(61).getGenres().add(genres.get(12));
        movies.get(61).getGenres().add(genres.get(1));
        movies.get(61).getGenres().add(genres.get(2));
        movies.get(62).getGenres().add(genres.get(14));
        movies.get(62).getGenres().add(genres.get(2));
        movies.get(62).getGenres().add(genres.get(7));
        movies.get(63).getGenres().add(genres.get(1));
        movies.get(63).getGenres().add(genres.get(2));
        movies.get(64).getGenres().add(genres.get(2));
        movies.get(64).getGenres().add(genres.get(15));
        movies.get(64).getGenres().add(genres.get(4));
        movies.get(64).getGenres().add(genres.get(7));
        movies.get(65).getGenres().add(genres.get(2));
        movies.get(66).getGenres().add(genres.get(2));
        movies.get(66).getGenres().add(genres.get(10));
        movies.get(66).getGenres().add(genres.get(8));
        movies.get(67).getGenres().add(genres.get(12));
        movies.get(67).getGenres().add(genres.get(11));
        movies.get(67).getGenres().add(genres.get(1));
        movies.get(67).getGenres().add(genres.get(13));
        movies.get(67).getGenres().add(genres.get(17));
        movies.get(68).getGenres().add(genres.get(2));
        movies.get(68).getGenres().add(genres.get(8));
        movies.get(69).getGenres().add(genres.get(1));
        movies.get(69).getGenres().add(genres.get(3));
        movies.get(70).getGenres().add(genres.get(9));
        movies.get(70).getGenres().add(genres.get(2));
        movies.get(70).getGenres().add(genres.get(10));
        movies.get(70).getGenres().add(genres.get(18));
        movies.get(70).getGenres().add(genres.get(8));
        movies.get(70).getGenres().add(genres.get(9));
        movies.get(70).getGenres().add(genres.get(2));
        movies.get(72).getGenres().add(genres.get(9));
        movies.get(72).getGenres().add(genres.get(2));
        movies.get(72).getGenres().add(genres.get(16));
        movies.get(73).getGenres().add(genres.get(10));
        movies.get(74).getGenres().add(genres.get(2));
        movies.get(74).getGenres().add(genres.get(3));
        movies.get(75).getGenres().add(genres.get(2));
        movies.get(76).getGenres().add(genres.get(1));
        movies.get(76).getGenres().add(genres.get(14));
        movies.get(76).getGenres().add(genres.get(2));
        movies.get(76).getGenres().add(genres.get(7));
        movies.get(77).getGenres().add(genres.get(9));
        movies.get(77).getGenres().add(genres.get(2));
        movies.get(78).getGenres().add(genres.get(2));
        movies.get(79).getGenres().add(genres.get(14));
        movies.get(79).getGenres().add(genres.get(2));
        movies.get(79).getGenres().add(genres.get(7));
        movies.get(80).getGenres().add(genres.get(15));
        movies.get(80).getGenres().add(genres.get(4));
        movies.get(80).getGenres().add(genres.get(7));
        movies.get(81).getGenres().add(genres.get(5));
        movies.get(81).getGenres().add(genres.get(11));
        movies.get(81).getGenres().add(genres.get(2));
        movies.get(81).getGenres().add(genres.get(7));
        movies.get(81).getGenres().add(genres.get(8));
        movies.get(81).getGenres().add(genres.get(15));
        movies.get(82).getGenres().add(genres.get(5));
        movies.get(82).getGenres().add(genres.get(11));
        movies.get(82).getGenres().add(genres.get(2));
        movies.get(82).getGenres().add(genres.get(6));
        movies.get(83).getGenres().add(genres.get(2));
        movies.get(83).getGenres().add(genres.get(7));
        movies.get(84).getGenres().add(genres.get(15));
        movies.get(84).getGenres().add(genres.get(4));
        movies.get(84).getGenres().add(genres.get(7));
        movies.get(85).getGenres().add(genres.get(14));
        movies.get(85).getGenres().add(genres.get(19));
        movies.get(85).getGenres().add(genres.get(7));
        movies.get(86).getGenres().add(genres.get(11));
        movies.get(86).getGenres().add(genres.get(14));
        movies.get(86).getGenres().add(genres.get(2));
        movies.get(86).getGenres().add(genres.get(20));
        movies.get(87).getGenres().add(genres.get(14));
        movies.get(87).getGenres().add(genres.get(2));
        movies.get(87).getGenres().add(genres.get(4));
        movies.get(87).getGenres().add(genres.get(3));
        movies.get(87).getGenres().add(genres.get(7));
        movies.get(88).getGenres().add(genres.get(9));
        movies.get(88).getGenres().add(genres.get(2));
        movies.get(88).getGenres().add(genres.get(10));
        movies.get(89).getGenres().add(genres.get(14));
        movies.get(89).getGenres().add(genres.get(2));
        movies.get(90).getGenres().add(genres.get(5));
        movies.get(90).getGenres().add(genres.get(6));
        movies.get(90).getGenres().add(genres.get(7));
        movies.get(91).getGenres().add(genres.get(14));
        movies.get(91).getGenres().add(genres.get(2));
        movies.get(91).getGenres().add(genres.get(7));
        movies.get(92).getGenres().add(genres.get(2));
        movies.get(93).getGenres().add(genres.get(2));
        movies.get(93).getGenres().add(genres.get(19));
        movies.get(94).getGenres().add(genres.get(2));
        movies.get(95).getGenres().add(genres.get(14));
        movies.get(95).getGenres().add(genres.get(4));
        movies.get(95).getGenres().add(genres.get(3));
        movies.get(95).getGenres().add(genres.get(7));
        movies.get(96).getGenres().add(genres.get(2));
        movies.get(97).getGenres().add(genres.get(6));
        movies.get(97).getGenres().add(genres.get(15));
        movies.get(98).getGenres().add(genres.get(14));
        movies.get(98).getGenres().add(genres.get(2));
        movies.get(98).getGenres().add(genres.get(3));
        movies.get(99).getGenres().add(genres.get(2));
        movies.get(99).getGenres().add(genres.get(3));
        movies.get(100).getGenres().add(genres.get(2));
        movies.get(100).getGenres().add(genres.get(3));
        movies.get(101).getGenres().add(genres.get(2));
        movies.get(102).getGenres().add(genres.get(2));
        movies.get(103).getGenres().add(genres.get(5));
        movies.get(103).getGenres().add(genres.get(2));
        movies.get(103).getGenres().add(genres.get(15));
        movies.get(103).getGenres().add(genres.get(6));
        movies.get(103).getGenres().add(genres.get(7));
        movies.get(104).getGenres().add(genres.get(2));
        movies.get(104).getGenres().add(genres.get(17));
        movies.get(104).getGenres().add(genres.get(4));
        movies.get(104).getGenres().add(genres.get(3));
        movies.get(105).getGenres().add(genres.get(2));
        movies.get(105).getGenres().add(genres.get(4));
        movies.get(105).getGenres().add(genres.get(7));
        movies.get(106).getGenres().add(genres.get(2));
        movies.get(106).getGenres().add(genres.get(3));
        movies.get(107).getGenres().add(genres.get(2));
        movies.get(108).getGenres().add(genres.get(21));
        movies.get(108).getGenres().add(genres.get(2));
        movies.get(109).getGenres().add(genres.get(14));
        movies.get(109).getGenres().add(genres.get(2));
        movies.get(109).getGenres().add(genres.get(7));
        movies.get(110).getGenres().add(genres.get(2));
        movies.get(110).getGenres().add(genres.get(13));
        movies.get(111).getGenres().add(genres.get(11));
        movies.get(111).getGenres().add(genres.get(2));
        movies.get(111).getGenres().add(genres.get(20));
        movies.get(111).getGenres().add(genres.get(5));
        movies.get(112).getGenres().add(genres.get(5));
        movies.get(112).getGenres().add(genres.get(1));
        movies.get(112).getGenres().add(genres.get(17));
        movies.get(112).getGenres().add(genres.get(3));
        movies.get(113).getGenres().add(genres.get(1));
        movies.get(114).getGenres().add(genres.get(2));
        movies.get(114).getGenres().add(genres.get(15));
        movies.get(114).getGenres().add(genres.get(4));
        movies.get(114).getGenres().add(genres.get(6));
        movies.get(115).getGenres().add(genres.get(2));
        movies.get(116).getGenres().add(genres.get(2));
        movies.get(116).getGenres().add(genres.get(3));
        movies.get(117).getGenres().add(genres.get(15));
        movies.get(117).getGenres().add(genres.get(4));
        movies.get(117).getGenres().add(genres.get(7));
        movies.get(118).getGenres().add(genres.get(1));
        movies.get(119).getGenres().add(genres.get(5));
        movies.get(119).getGenres().add(genres.get(11));
        movies.get(120).getGenres().add(genres.get(1));
        movies.get(120).getGenres().add(genres.get(2));
        movies.get(120).getGenres().add(genres.get(3));
        movies.get(121).getGenres().add(genres.get(2));
        movies.get(122).getGenres().add(genres.get(14));
        movies.get(122).getGenres().add(genres.get(4));
        movies.get(122).getGenres().add(genres.get(7));
        movies.get(123).getGenres().add(genres.get(14));
        movies.get(123).getGenres().add(genres.get(2));
        movies.get(124).getGenres().add(genres.get(1));
        movies.get(124).getGenres().add(genres.get(2));
        movies.get(125).getGenres().add(genres.get(2));
        movies.get(125).getGenres().add(genres.get(15));
        movies.get(125).getGenres().add(genres.get(3));
        movies.get(126).getGenres().add(genres.get(1));
        movies.get(126).getGenres().add(genres.get(2));
        movies.get(126).getGenres().add(genres.get(3));
        movies.get(127).getGenres().add(genres.get(2));
        movies.get(127).getGenres().add(genres.get(15));
        movies.get(127).getGenres().add(genres.get(4));
        movies.get(127).getGenres().add(genres.get(7));
        movies.get(128).getGenres().add(genres.get(14));
        movies.get(128).getGenres().add(genres.get(2));
        movies.get(128).getGenres().add(genres.get(7));
        movies.get(129).getGenres().add(genres.get(2));
        movies.get(129).getGenres().add(genres.get(22));
        movies.get(129).getGenres().add(genres.get(3));
        movies.get(131).getGenres().add(genres.get(5));
        movies.get(131).getGenres().add(genres.get(2));
        movies.get(131).getGenres().add(genres.get(7));
        movies.get(131).getGenres().add(genres.get(8));
        movies.get(132).getGenres().add(genres.get(2));
        movies.get(132).getGenres().add(genres.get(9));
        movies.get(132).getGenres().add(genres.get(18));
        movies.get(133).getGenres().add(genres.get(11));
        movies.get(133).getGenres().add(genres.get(2));
        movies.get(133).getGenres().add(genres.get(10));
        movies.get(133).getGenres().add(genres.get(3));
        movies.get(134).getGenres().add(genres.get(1));
        movies.get(135).getGenres().add(genres.get(5));
        movies.get(135).getGenres().add(genres.get(20));
        movies.get(136).getGenres().add(genres.get(1));
        movies.get(137).getGenres().add(genres.get(2));
        movies.get(138).getGenres().add(genres.get(2));
        movies.get(139).getGenres().add(genres.get(2));
        movies.get(139).getGenres().add(genres.get(7));
        movies.get(140).getGenres().add(genres.get(5));
        movies.get(140).getGenres().add(genres.get(2));
        movies.get(140).getGenres().add(genres.get(8));
        movies.get(141).getGenres().add(genres.get(14));
        movies.get(141).getGenres().add(genres.get(2));
        movies.get(141).getGenres().add(genres.get(3));
        movies.get(142).getGenres().add(genres.get(5));
        movies.get(142).getGenres().add(genres.get(14));
        movies.get(142).getGenres().add(genres.get(2));
        movies.get(142).getGenres().add(genres.get(7));
        movies.get(143).getGenres().add(genres.get(5));
        movies.get(143).getGenres().add(genres.get(14));
        movies.get(143).getGenres().add(genres.get(7));
        movies.get(144).getGenres().add(genres.get(14));
        movies.get(144).getGenres().add(genres.get(2));
        movies.get(144).getGenres().add(genres.get(3));
        movies.get(144).getGenres().add(genres.get(7));
        movies.get(145).getGenres().add(genres.get(2));
        movies.get(145).getGenres().add(genres.get(3));
        movies.get(146).getGenres().add(genres.get(11));
        movies.get(146).getGenres().add(genres.get(17));
        movies.get(146).getGenres().add(genres.get(4));
        movies.get(146).getGenres().add(genres.get(1));
        movies.get(146).getGenres().add(genres.get(8));
        movies.get(148).getGenres().add(genres.get(12));
        movies.get(148).getGenres().add(genres.get(13));
        movies.get(149).getGenres().add(genres.get(12));
        movies.get(149).getGenres().add(genres.get(13));
        movies.get(149).getGenres().add(genres.get(17));
        movies.get(149).getGenres().add(genres.get(22));
        movies.get(149).getGenres().add(genres.get(3));
        movies.get(150).getGenres().add(genres.get(2));
        movies.get(151).getGenres().add(genres.get(5));
        movies.get(151).getGenres().add(genres.get(11));
        movies.get(151).getGenres().add(genres.get(6));
        movies.get(152).getGenres().add(genres.get(5));
        movies.get(152).getGenres().add(genres.get(11));
        movies.get(152).getGenres().add(genres.get(6));
        movies.get(153).getGenres().add(genres.get(2));
        movies.get(154).getGenres().add(genres.get(2));
        movies.get(154).getGenres().add(genres.get(16));
        movies.get(155).getGenres().add(genres.get(2));
        movies.get(155).getGenres().add(genres.get(17));
        movies.get(155).getGenres().add(genres.get(15));
        movies.get(155).getGenres().add(genres.get(3));
        movies.get(156).getGenres().add(genres.get(12));
        movies.get(156).getGenres().add(genres.get(11));
        movies.get(156).getGenres().add(genres.get(1));
        movies.get(156).getGenres().add(genres.get(13));
        movies.get(157).getGenres().add(genres.get(5));
        movies.get(157).getGenres().add(genres.get(11));
        movies.get(157).getGenres().add(genres.get(14));
        movies.get(157).getGenres().add(genres.get(2));
        movies.get(157).getGenres().add(genres.get(4));
        movies.get(157).getGenres().add(genres.get(7));
        movies.get(158).getGenres().add(genres.get(2));
        movies.get(158).getGenres().add(genres.get(3));
        movies.get(159).getGenres().add(genres.get(11));
        movies.get(159).getGenres().add(genres.get(2));
        movies.get(159).getGenres().add(genres.get(7));
        movies.get(160).getGenres().add(genres.get(2));
        movies.get(160).getGenres().add(genres.get(14));
        movies.get(160).getGenres().add(genres.get(4));
        movies.get(160).getGenres().add(genres.get(7));
        movies.get(162).getGenres().add(genres.get(14));
        movies.get(162).getGenres().add(genres.get(15));
        movies.get(162).getGenres().add(genres.get(7));
        movies.get(163).getGenres().add(genres.get(1));
        movies.get(163).getGenres().add(genres.get(2));
        movies.get(163).getGenres().add(genres.get(13));
        movies.get(164).getGenres().add(genres.get(2));
        movies.get(164).getGenres().add(genres.get(3));
        movies.get(165).getGenres().add(genres.get(1));
        movies.get(165).getGenres().add(genres.get(14));
        movies.get(165).getGenres().add(genres.get(2));
        movies.get(165).getGenres().add(genres.get(7));
        movies.get(166).getGenres().add(genres.get(14));
        movies.get(166).getGenres().add(genres.get(2));
        movies.get(166).getGenres().add(genres.get(7));
        movies.get(167).getGenres().add(genres.get(2));
        movies.get(167).getGenres().add(genres.get(4));
        movies.get(167).getGenres().add(genres.get(3));
        movies.get(167).getGenres().add(genres.get(7));
        movies.get(168).getGenres().add(genres.get(2));
        movies.get(168).getGenres().add(genres.get(4));
        movies.get(168).getGenres().add(genres.get(3));
        movies.get(169).getGenres().add(genres.get(5));
        movies.get(169).getGenres().add(genres.get(14));
        movies.get(169).getGenres().add(genres.get(2));
        movies.get(169).getGenres().add(genres.get(7));
        movies.get(170).getGenres().add(genres.get(17));
        movies.get(171).getGenres().add(genres.get(3));
        movies.get(171).getGenres().add(genres.get(7));
        movies.get(172).getGenres().add(genres.get(14));
        movies.get(172).getGenres().add(genres.get(2));
        movies.get(172).getGenres().add(genres.get(7));
        movies.get(173).getGenres().add(genres.get(1));
        movies.get(173).getGenres().add(genres.get(2));
        movies.get(173).getGenres().add(genres.get(3));
        movies.get(174).getGenres().add(genres.get(1));
        movies.get(174).getGenres().add(genres.get(2));
        movies.get(175).getGenres().add(genres.get(2));
        movies.get(175).getGenres().add(genres.get(7));
        movies.get(176).getGenres().add(genres.get(1));
        movies.get(176).getGenres().add(genres.get(17));
        movies.get(176).getGenres().add(genres.get(3));
        movies.get(177).getGenres().add(genres.get(2));
        movies.get(177).getGenres().add(genres.get(17));
        movies.get(177).getGenres().add(genres.get(3));
        movies.get(177).getGenres().add(genres.get(6));
        movies.get(178).getGenres().add(genres.get(2));
        movies.get(178).getGenres().add(genres.get(7));
        movies.get(178).getGenres().add(genres.get(8));
        movies.get(179).getGenres().add(genres.get(2));
        movies.get(179).getGenres().add(genres.get(18));
        movies.get(179).getGenres().add(genres.get(3));
        movies.get(180).getGenres().add(genres.get(14));
        movies.get(180).getGenres().add(genres.get(2));
        movies.get(180).getGenres().add(genres.get(4));
        movies.get(180).getGenres().add(genres.get(7));
        movies.get(181).getGenres().add(genres.get(2));
        movies.get(182).getGenres().add(genres.get(14));
        movies.get(182).getGenres().add(genres.get(2));
        movies.get(182).getGenres().add(genres.get(4));
        movies.get(183).getGenres().add(genres.get(14));
        movies.get(183).getGenres().add(genres.get(2));
        movies.get(183).getGenres().add(genres.get(17));
        movies.get(183).getGenres().add(genres.get(15));
        movies.get(183).getGenres().add(genres.get(7));
        movies.get(184).getGenres().add(genres.get(2));
        movies.get(185).getGenres().add(genres.get(1));
        movies.get(185).getGenres().add(genres.get(17));
        movies.get(185).getGenres().add(genres.get(3));
        movies.get(186).getGenres().add(genres.get(2));
        movies.get(186).getGenres().add(genres.get(18));
        movies.get(187).getGenres().add(genres.get(6));
        movies.get(188).getGenres().add(genres.get(2));
        movies.get(188).getGenres().add(genres.get(10));
        movies.get(188).getGenres().add(genres.get(3));
        movies.get(188).getGenres().add(genres.get(7));
        movies.get(188).getGenres().add(genres.get(8));
        movies.get(189).getGenres().add(genres.get(2));
        movies.get(189).getGenres().add(genres.get(7));
        movies.get(190).getGenres().add(genres.get(9));
        movies.get(190).getGenres().add(genres.get(2));
        movies.get(191).getGenres().add(genres.get(5));
        movies.get(191).getGenres().add(genres.get(1));
        movies.get(191).getGenres().add(genres.get(14));
        movies.get(191).getGenres().add(genres.get(3));
        movies.get(192).getGenres().add(genres.get(2));
        movies.get(193).getGenres().add(genres.get(1));
        movies.get(193).getGenres().add(genres.get(2));
        movies.get(193).getGenres().add(genres.get(7));
        movies.get(194).getGenres().add(genres.get(20));
        movies.get(195).getGenres().add(genres.get(2));
        movies.get(195).getGenres().add(genres.get(8));
        movies.get(196).getGenres().add(genres.get(5));
        movies.get(196).getGenres().add(genres.get(11));
        movies.get(196).getGenres().add(genres.get(13));
        movies.get(196).getGenres().add(genres.get(17));
        movies.get(196).getGenres().add(genres.get(4));
        movies.get(196).getGenres().add(genres.get(3));
        movies.get(197).getGenres().add(genres.get(2));
        movies.get(198).getGenres().add(genres.get(2));
        movies.get(198).getGenres().add(genres.get(7));
        movies.get(199).getGenres().add(genres.get(14));
        movies.get(199).getGenres().add(genres.get(4));
        movies.get(199).getGenres().add(genres.get(7));
        movies.get(199).getGenres().add(genres.get(2));
        movies.get(200).getGenres().add(genres.get(5));
        movies.get(200).getGenres().add(genres.get(6));
        movies.get(201).getGenres().add(genres.get(2));
        movies.get(201).getGenres().add(genres.get(3));
        movies.get(201).getGenres().add(genres.get(8));
        movies.get(202).getGenres().add(genres.get(1));
        movies.get(202).getGenres().add(genres.get(2));
        movies.get(202).getGenres().add(genres.get(3));
        movies.get(203).getGenres().add(genres.get(2));
        movies.get(203).getGenres().add(genres.get(4));
        movies.get(203).getGenres().add(genres.get(7));
        movies.get(204).getGenres().add(genres.get(14));
        movies.get(204).getGenres().add(genres.get(2));
        movies.get(204).getGenres().add(genres.get(7));
        movies.get(205).getGenres().add(genres.get(3));
        movies.get(206).getGenres().add(genres.get(2));
        movies.get(206).getGenres().add(genres.get(4));
        movies.get(207).getGenres().add(genres.get(1));
        movies.get(207).getGenres().add(genres.get(2));
        movies.get(207).getGenres().add(genres.get(3));
        movies.get(208).getGenres().add(genres.get(12));
        movies.get(208).getGenres().add(genres.get(5));
        movies.get(208).getGenres().add(genres.get(11));
        movies.get(208).getGenres().add(genres.get(1));
        movies.get(208).getGenres().add(genres.get(13));
        movies.get(209).getGenres().add(genres.get(12));
        movies.get(209).getGenres().add(genres.get(5));
        movies.get(209).getGenres().add(genres.get(11));
        movies.get(209).getGenres().add(genres.get(1));
        movies.get(209).getGenres().add(genres.get(13));
        movies.get(210).getGenres().add(genres.get(12));
        movies.get(210).getGenres().add(genres.get(5));
        movies.get(210).getGenres().add(genres.get(11));
        movies.get(210).getGenres().add(genres.get(1));
        movies.get(210).getGenres().add(genres.get(13));
        movies.get(210).getGenres().add(genres.get(3));
        movies.get(211).getGenres().add(genres.get(2));
        movies.get(211).getGenres().add(genres.get(4));
        movies.get(211).getGenres().add(genres.get(7));
        movies.get(212).getGenres().add(genres.get(2));
        movies.get(213).getGenres().add(genres.get(2));
        movies.get(214).getGenres().add(genres.get(1));
        movies.get(214).getGenres().add(genres.get(2));
        movies.get(214).getGenres().add(genres.get(4));
        movies.get(214).getGenres().add(genres.get(1));
        movies.get(214).getGenres().add(genres.get(3));
        movies.get(215).getGenres().add(genres.get(2));
        movies.get(216).getGenres().add(genres.get(1));
        movies.get(216).getGenres().add(genres.get(3));
        movies.get(217).getGenres().add(genres.get(9));
        movies.get(217).getGenres().add(genres.get(2));
        movies.get(217).getGenres().add(genres.get(18));
        movies.get(218).getGenres().add(genres.get(1));
        movies.get(218).getGenres().add(genres.get(20));
        movies.get(219).getGenres().add(genres.get(2));
        movies.get(219).getGenres().add(genres.get(1));
        movies.get(219).getGenres().add(genres.get(3));
        movies.get(220).getGenres().add(genres.get(5));
        movies.get(220).getGenres().add(genres.get(2));
        movies.get(220).getGenres().add(genres.get(10));
        movies.get(220).getGenres().add(genres.get(3));
        movies.get(220).getGenres().add(genres.get(20));
        movies.get(221).getGenres().add(genres.get(2));
        movies.get(221).getGenres().add(genres.get(4));
        movies.get(221).getGenres().add(genres.get(7));
        movies.get(222).getGenres().add(genres.get(1));
        movies.get(222).getGenres().add(genres.get(2));
        movies.get(223).getGenres().add(genres.get(9));
        movies.get(223).getGenres().add(genres.get(2));
        movies.get(224).getGenres().add(genres.get(1));
        movies.get(224).getGenres().add(genres.get(14));
        movies.get(224).getGenres().add(genres.get(2));
        movies.get(224).getGenres().add(genres.get(18));
        movies.get(225).getGenres().add(genres.get(5));
        movies.get(225).getGenres().add(genres.get(9));
        movies.get(225).getGenres().add(genres.get(2));
        movies.get(226).getGenres().add(genres.get(5));
        movies.get(226).getGenres().add(genres.get(9));
        movies.get(226).getGenres().add(genres.get(10));
        movies.get(227).getGenres().add(genres.get(11));
        movies.get(227).getGenres().add(genres.get(13));
        movies.get(227).getGenres().add(genres.get(17));
        movies.get(228).getGenres().add(genres.get(2));
        movies.get(228).getGenres().add(genres.get(7));
        movies.get(229).getGenres().add(genres.get(2));
        movies.get(229).getGenres().add(genres.get(3));
        movies.get(230).getGenres().add(genres.get(2));
        movies.get(231).getGenres().add(genres.get(1));
        movies.get(231).getGenres().add(genres.get(3));
        movies.get(232).getGenres().add(genres.get(9));
        movies.get(232).getGenres().add(genres.get(2));
        movies.get(232).getGenres().add(genres.get(10));
        movies.get(232).getGenres().add(genres.get(8));
        movies.get(233).getGenres().add(genres.get(15));
        movies.get(233).getGenres().add(genres.get(7));
        movies.get(234).getGenres().add(genres.get(1));
        movies.get(234).getGenres().add(genres.get(2));
        movies.get(234).getGenres().add(genres.get(8));
        movies.get(235).getGenres().add(genres.get(14));
        movies.get(235).getGenres().add(genres.get(2));
        movies.get(236).getGenres().add(genres.get(2));
        movies.get(236).getGenres().add(genres.get(18));
        movies.get(237).getGenres().add(genres.get(2));
        movies.get(237).getGenres().add(genres.get(3));
        movies.get(238).getGenres().add(genres.get(9));
        movies.get(238).getGenres().add(genres.get(2));
        movies.get(239).getGenres().add(genres.get(11));
        movies.get(239).getGenres().add(genres.get(14));
        movies.get(239).getGenres().add(genres.get(2));
        movies.get(239).getGenres().add(genres.get(7));
        movies.get(240).getGenres().add(genres.get(2));
        movies.get(241).getGenres().add(genres.get(2));
        movies.get(242).getGenres().add(genres.get(5));
        movies.get(242).getGenres().add(genres.get(11));
        movies.get(242).getGenres().add(genres.get(2));
        movies.get(242).getGenres().add(genres.get(7));
        movies.get(242).getGenres().add(genres.get(20));
        movies.get(243).getGenres().add(genres.get(2));
        movies.get(244).getGenres().add(genres.get(5));
        movies.get(244).getGenres().add(genres.get(11));
        movies.get(244).getGenres().add(genres.get(2));
        movies.get(244).getGenres().add(genres.get(17));
        movies.get(244).getGenres().add(genres.get(7));
        movies.get(245).getGenres().add(genres.get(5));
        movies.get(246).getGenres().add(genres.get(2));
        movies.get(246).getGenres().add(genres.get(7));
        movies.get(214).getGenres().add(genres.get(1));
        movies.get(214).getGenres().add(genres.get(1));
        movies.get(214).getGenres().add(genres.get(1));
        movies.get(214).getGenres().add(genres.get(1));
        directors.put(1, new Director(1, "Marc Webb", "nm1989536"));
        directors.put(2, new Director(2, "Peter Hyams", "nm0001382"));
        directors.put(3, new Director(3, "Mark Neveldine", "nm0004410"));
        directors.put(4, new Director(4, "Brian Taylor", "nm0962729"));
        directors.put(5, new Director(5, "Stephen Frears", "nm0001241"));
        directors.put(6, new Director(6, "Oliver Parker", "nm0662529"));
        directors.put(7, new Director(7, "Quentin Tarantino", "nm0000233"));
        directors.put(8, new Director(8, "Clint Eastwood", "nm0000142"));
        directors.put(9, new Director(9, "Nora Ephron", "nm0001188"));
        directors.put(10, new Director(10, "Pedro Almodovar", "nm0000264"));
        directors.put(11, new Director(11, "Gary Sinise", "nm0000641"));
        directors.put(12, new Director(12, "NimrÂ¢d Antal", "nm0030735"));
        directors.put(13, new Director(13, "?nan Temelkuran", "nm3692009"));
        directors.put(14, new Director(14, "Anne Fontaine", "nm0284774"));
        directors.put(15, new Director(15, "Levent Semerci", "nm2896395"));
        directors.put(16, new Director(16, "Pete Docter", "nm0230032"));
        directors.put(17, new Director(17, "Dominic Sena", "nm0784061"));
        directors.put(18, new Director(18, "Robert Schwentke", "nm0777881"));
        directors.put(19, new Director(19, "Woody Allen", "nm0000095"));
        directors.put(20, new Director(20, "Max Fâ€žrberbâ€�ck", "nm0299621"));
        directors.put(21, new Director(21, "Ruben Fleischer", "nm0281508"));
        directors.put(22, new Director(22, "Blayne Weaver", "nm0915814"));
        directors.put(23, new Director(23, "Zack Snyder", "nm0811583"));
        directors.put(24, new Director(24, "Paul Schrader", "nm0001707"));
        directors.put(25, new Director(25, "Ron Howard", "nm0000165"));
        directors.put(26, new Director(26, "Sam Mendes", "nm0005222"));
        directors.put(27, new Director(27, "Glendyn Ivin", "nm1380395"));
        directors.put(28, new Director(28, "Scott Hicks", "nm0382956"));
        directors.put(29, new Director(29, "Rod Lurie", "nm0527109"));
        directors.put(30, new Director(30, "Eric Red", "nm0714599"));
        directors.put(31, new Director(31, "Scott Mann", "nm1470993"));
        directors.put(32, new Director(32, "Philipp Stâ€�lzl", "nm0836715"));
        directors.put(33, new Director(33, "Ethan Coen", "nm0001053"));
        directors.put(34, new Director(34, "Joel Coen", "nm0001054"));
        directors.put(35, new Director(35, "Kevin Greutert", "nm0340436"));
        directors.put(36, new Director(36, "Marina de Van", "nm0888418"));
        directors.put(37, new Director(37, "Neill Blomkamp", "nm0088955"));
        directors.put(38, new Director(38, "Mike Judge", "nm0431918"));
        directors.put(39, new Director(39, "Oliver Hirschbiegel", "nm0386570"));
        directors.put(40, new Director(40, "Gary Yates", "nm0946750"));
        directors.put(41, new Director(41, "Anne Fletcher", "nm0281945"));
        directors.put(42, new Director(42, "Emily Young", "nm1369721"));
        directors.put(43, new Director(43, "Richard Eyre", "nm0264236"));
        directors.put(44, new Director(44, "Neal Brennan", "nm0107366"));
        directors.put(45, new Director(45, "Todd Phillips", "nm0680846"));
        directors.put(46, new Director(46, "Micheal Mann", "nm0000520"));
        directors.put(47, new Director(47, "Jon Amiel", "nm0000750"));
        directors.put(48, new Director(48, "Mira Nair", "nm0619762"));
        directors.put(49, new Director(49, "Bart Freundlich", "nm0294505"));
        directors.put(50, new Director(50, "Timothy Linh Bui", "nm0119613"));
        directors.put(51, new Director(51, "Grant Heslov", "nm0381416"));
        directors.put(52, new Director(52, "Jane Campion", "nm0001005"));
        directors.put(53, new Director(53, "Christian Alvert", "nm0023355"));
        directors.put(54, new Director(54, "Sophie Barthes", "nm1754436"));
        directors.put(55, new Director(55, "Duncan Jones", "nm1512910"));
        directors.put(56, new Director(56, "Bobcat Goldthwait", "nm0001281"));
        directors.put(57, new Director(57, "Oren Peli", "nm2305431"));
        directors.put(58, new Director(58, "Kevin Macdonald", "nm0531817"));
        directors.put(59, new Director(59, "Andy DeEmmony", "nm0214320"));
        directors.put(60, new Director(60, "Rian Johnson", "nm0426059"));
        directors.put(61, new Director(61, "Richard Loncraine", "nm0518644"));
        directors.put(62, new Director(62, "Niels Arden Oplev", "nm0649117"));
        directors.put(63, new Director(63, "Adam Elliot", "nm0254178"));
        directors.put(64, new Director(64, "Jim Jarmusch", "nm0000464"));
        directors.put(65, new Director(65, "Christine Jeffs", "nm0420422"));
        directors.put(66, new Director(66, "David Twohy", "nm0878638"));
        directors.put(67, new Director(67, "Nick Cassavetes", "nm0001024"));
        directors.put(68, new Director(68, "Martin Koolhoven", "nm0465551"));
        directors.put(69, new Director(69, "Jorge Blanco", "nm3360961"));
        directors.put(70, new Director(70, "Milcho Manchevski", "nm0541391"));
        directors.put(71, new Director(71, "John Hamburg", "nm0357453"));
        directors.put(72, new Director(72, "Costas Ferris", "nm0002948"));
        directors.put(73, new Director(73, "Tom Hooper", "nm0393799"));
        directors.put(74, new Director(74, "Paul Wilmshurst", "nm0932882"));
        directors.put(75, new Director(75, "Fatih AkÃ•n", "nm0015359"));
        directors.put(76, new Director(76, "Yvan Attal", "nm0040939"));
        directors.put(77, new Director(77, "Andrea Arnold", "nm0036349"));
        directors.put(78, new Director(78, "Steven Soderbergh", "nm0001752"));
        directors.put(79, new Director(79, "John Kent Harrison", "nm0006867"));
        directors.put(80,
                new Director(80, "Hans-Christian Schmid", "nm0772691"));
        directors.put(81, new Director(81, "Sidney Lumet", "nm0001486"));
        directors.put(82, new Director(82, "Christopher Smith", "nm1247462"));
        directors.put(83, new Director(83, "John Sturges", "nm0836328"));
        directors.put(84, new Director(84, "Roland Emmerich", "nm0000386"));
        directors.put(85, new Director(85, "Jamie Thraves", "nm0861899"));
        directors.put(86, new Director(86, "Vikram K. Kumar", "nm3347823"));
        directors.put(87, new Director(87, "Billy Wilder", "nm0000697"));
        directors.put(88, new Director(88, "George Roy Hill", "nm0001351"));
        directors.put(89, new Director(89, "Juan Josâ€š Campanella",
                "nm0002728"));
        directors.put(90, new Director(90, "Andrzej Wajda", "nm0906667"));
        directors.put(91, new Director(91, "Dennis Hopper", "nm0000454"));
        directors.put(92, new Director(92, "Jonathan Mostow", "nm0609236"));
        directors.put(93, new Director(93, "Elia Kazan", "nm0001415"));
        directors.put(94, new Director(94, "Alfred Hitchcock", "nm0000033"));
        directors.put(95, new Director(95, "Ki-duk Kim", "nm1104118"));
        directors.put(96, new Director(96, "Gordon Douglas", "nm0235066"));
        directors.put(97, new Director(97, "John H. Lee", "nm0497565"));
        directors.put(98, new Director(98, "Hae-jun Lee", "nm1536497"));
        directors
                .put(99, new Director(99, "Mahmut FazÃ•l Co?kun", "nm3312722"));
        directors.put(100, new Director(100, "Michael Spierig", "nm1294961"));
        directors.put(101, new Director(101, "Peter Spierig", "nm1294962"));
        directors.put(102, new Director(102, "Chan-wook Park", "nm0661791"));
        directors.put(103, new Director(103, "Ruba Nadda", "nm0618779"));
        directors.put(104, new Director(104, "Ben Hopkins", "nm0394114"));
        directors.put(105, new Director(105, "Louie Psihoyos", "nm3174775"));
        directors.put(106, new Director(106, "John Polson", "nm0689852"));
        directors.put(107, new Director(107, "Lasse Hallstrâ€�m", "nm0002120"));
        directors.put(108, new Director(108, "John Huston", "nm0001379"));
        directors.put(109, new Director(109, "Philippe de Broca", "nm0003606"));
        directors.put(110, new Director(110, "Blake Edwards", "nm0001175"));
        directors.put(111, new Director(111, "Richard Kelly", "nm0446819"));
        directors.put(112, new Director(112, "Kirk Jones", "nm0428600"));
        directors.put(113, new Director(113, "Jay DiPietro", "nm2842549"));
        directors.put(114,
                new Director(114, "Sebastian Gutierrez", "nm0349406"));
        directors.put(115, new Director(115, "Akira Kurosawa", "nm0000041"));
        directors.put(116, new Director(116, "Jae-young Kwak", "nm1030706"));
        directors.put(117, new Director(117, "Jacques Audiard", "nm0002191"));
        directors
                .put(118, new Director(118, "Lee Toland Krieger", "nm1767218"));
        directors.put(119, new Director(119, "Jason Reitman", "nm0718646"));
        directors.put(120, new Director(120, "Nicolas Gessner", "nm0004654"));
        directors.put(121, new Director(121, "F. Gary Gray", "nm0336620"));
        directors.put(122, new Director(122, "Rob Marshall", "nm0551128"));
        directors.put(123, new Director(123, "Kathryn Bigelow", "nm0000941"));
        directors.put(124, new Director(124, "Joe Wright", "m0942504"));
        directors.put(125,
                new Director(125, "Alejandro AmenÂ bar", "nm0024622"));
        directors.put(126,
                new Director(126, "Katherine Dieckmann", "nm0225869"));
        directors.put(127, new Director(127, "Sam Peckinpah", "nm0001603"));
        directors.put(128, new Director(128, "YÃ•lmaz Erdo?an", "nm0258784"));
        directors.put(129, new Director(129, "Shana Feste", "nm0275277"));
        directors.put(130, new Director(130, "Reha Erdem", "nm0258732"));
        directors.put(131, new Director(131, "Jonathan Kaplan", "nm0438279"));
        directors.put(132, new Director(132, "Steven Spielberg", "nm0000229"));
        directors.put(133, new Director(133, "Francis Ford Coppola",
                "nm0000338"));
        directors.put(134, new Director(134, "Troy Duffy", "nm0240627"));
        directors.put(135, new Director(135, "Pierre Morel", "nm0603628"));
        directors.put(136, new Director(136, "Peter Jackson", "nm0001392"));
        directors.put(137, new Director(137, "Rebecca Miller", "nm0589182"));
        directors.put(138, new Director(138, "Terry Gilliam", "nm0000416"));
        directors.put(139, new Director(139, "Phil Lord", "nm0520488"));
        directors.put(140, new Director(140, "Chris Miller", "nm0588087"));
        directors.put(141, new Director(141, "Ron Clements", "nm0166256"));
        directors.put(142, new Director(142, "John Musker", "nm0615780"));
        directors.put(143, new Director(143, "Lone Scherfig", "nm0771054"));
        directors.put(144, new Director(144, "James Cameron", "nm0000116"));
        directors.put(145, new Director(145, "Lee Daniels", "nm0200005"));
        directors.put(146, new Director(146, "John Lee Hancock", "nm0359387"));
        directors.put(147, new Director(147, "Chris Weitz", "nm0919363"));
        directors.put(148, new Director(148, "Wes Anderson", "nm0027572"));
        directors.put(149, new Director(149, "Guy Ritchie", "nm0005363"));
        directors.put(150, new Director(150, "Gus Van Sant", "nm0001814"));
        directors.put(151, new Director(151, "John Hillcoat", "nm0384825"));
        directors.put(152, new Director(152, "Petr Zelenka", "nm0954500"));
        directors.put(153, new Director(153, "Marcus Dunstan", "nm1729303"));
        directors.put(154, new Director(154, "Majid Majidi", "nm0006498"));
        directors.put(155, new Director(155, "Wai-keung Lau", "nm0490487"));
        directors.put(156, new Director(156, "Tim Blake Nelson", "nm0625789"));
        directors.put(157, new Director(157, "Brian De Palma", "nm0000361"));
        directors.put(158, new Director(158, "Paul McGuigan", "nm0006476"));
        directors.put(159, new Director(159, "Gilles Mimouni", "nm0590813"));
        directors.put(160, new Director(160, "Antoine Fuqua", "nm0298807"));
        directors.put(161, new Director(161, "Nick Willing", "nm0932216"));
        directors.put(162, new Director(162, "Tony Gilroy", "nm0006904"));
        directors.put(163, new Director(163, "Daniel Barber", "nm2905562"));
        directors.put(164, new Director(164, "Yann Samuel", "nm1367933"));
        directors.put(165, new Director(165, "Peter Stebbings", "nm0824220"));
        directors.put(166, new Director(166, "Martin Campbell", "nm0132709"));
        directors.put(167, new Director(167, "Mark Waters", "nm0132709"));
        directors.put(168, new Director(168, "Kar Wai Wong", "nm0939182"));
        directors.put(169, new Director(169, "Jim Sheridan", "nm0006487"));
        directors.put(170, new Director(170, "Scott Cooper", "nm0178376"));
        directors.put(171, new Director(171, "Martin Scorsese", "nm0000217"));
        directors.put(172, new Director(172, "Zeki Demirkubuz", "nm0218547"));
        directors.put(173, new Director(173, "Michael Haneke", "nm0359734"));
        directors.put(174, new Director(174, "Kamen Kalev", "nm1189816"));
        directors.put(175, new Director(175, "David Koepp", "nm0462895"));
        directors.put(176, new Director(176, "Cameron Crowe", "nm0001081"));
        directors.put(177, new Director(177, "Ivan Engler", "nm1393530"));
        directors.put(178, new Director(178, "Stephen Poliakoff", "nm0689081"));
        directors.put(179, new Director(179, "Kari Skogland", "nm0804556"));
        directors.put(180, new Director(180, "Michael Sucsy", "nm1302591"));
        directors.put(181, new Director(181, "Andy Tennant", "nm0855035"));
        directors.put(182, new Director(182, "Durul Taylan", "nm1533201"));
        directors.put(183, new Director(183, "Fritz Lang", "nm0000485"));
        directors.put(184, new Director(184, "Samuel Maoz", "nm1413443"));
        directors.put(185, new Director(185, "David Yates", "nm0946734"));
        directors.put(186, new Director(186, "Damjan Kozole", "nm0468995"));
        directors.put(187, new Director(187, "Igor Sterk", "nm0827459"));
        directors.put(188, new Director(188, "Wim Wenders", "nm0000694"));
        directors.put(189, new Director(189, "Chandler Tuttle", "nm2459703"));
        directors.put(190, new Director(190, "Zoe R. Cassavetes", "nm0144023"));
        directors.put(191, new Director(191, "Peter Weir", "nm0001837"));
        directors
                .put(192, new Director(192, "Bertrand Tavernier", "nm0851724"));
        directors.put(193, new Director(193, "Cheryl Hines", "nm0385644"));
        directors.put(194, new Director(194, "Chris Wedge", "nm0917188"));
        directors.put(195, new Director(195, "Carlos Saldanha", "nm0757858"));
        directors
                .put(196, new Director(196, "Giuseppe Capotondi", "nm3321297"));
        directors.put(197, new Director(197, "Tom Ford", "nm1053530"));
        directors.put(198, new Director(198, "Jordan Scott", "nm0779386"));
        directors.put(199, new Director(199, "Noah Buschel", "nm1231757"));
        directors.put(200, new Director(200, "Nancy Meyers", "nm0583600"));
        directors.put(201, new Director(201, "Tom Vaughan", "nm0891114"));
        directors.put(202, new Director(202, "Anand Tucker", "nm0875793"));
        directors.put(203, new Director(203, "Sam Taylor Wood", "nm0939993"));
        directors
                .put(204, new Director(204, "â„¢mer Faruk Sorak", "nm0814716"));
        directors.put(205, new Director(205, "â„¢zcan Alper", "nm3213296"));
        directors.put(206, new Director(206, "Garry Marshall", "nm0005190"));
        directors
                .put(207, new Director(207, "George P. Cosmatos", "nm0181902"));
        directors.put(208,
                new Director(208, "Giuseppe Toprnatore", "nm0868153"));
        directors.put(209, new Director(209, "Glenn Ficarra", "nm0275629"));
        directors.put(210, new Director(210, "John Requa", "nm0720135"));
        directors.put(211, new Director(211, "Barry Levinson", "nm0001469"));
        directors.put(212, new Director(212, "Koen Morties", "nm0607831"));
        directors.put(213, new Director(213, "Wilson Yip", "nm0948159"));
        directors.put(214, new Director(214, "Tim Burton", "nm0000318"));
        directors.put(215, new Director(215, "Atom Egoyan", "nm0000382"));
        directors.put(216, new Director(216, "Isabel Coixet", "nm0170043"));
        directors.put(217, new Director(217, "Pavel Chukhraj", "nm0161056"));
        directors.put(218, new Director(218, "Ketche", "nm3773770"));
        directors.put(219, new Director(219, "ZÂ�lfÂ� Livaneli", "nm0515101"));
        directors.put(220, new Director(220, "Sam Raimi", "nm0000600"));
        directors.put(221, new Director(221, "Brian Goodman", "nm0329023"));
        directors.put(222, new Director(222, "Christophe Barratier",
                "nm0056725"));
        directors.put(223, new Director(223, "Claude Berri", "nm0001945"));
        directors.put(224, new Director(224, "Cary Fukunaga", "nm1560977"));
        directors.put(225, new Director(225, "Jesus Garay", "nm0304879"));
        directors.put(226, new Director(226, "?lksen Ba?arÃ•r", "nm2079185"));
        directors.put(227, new Director(227, "Albert Hughes", "nm0400436"));
        directors.put(228, new Director(228, "Allen Hughes", "nm0400441"));
        directors.put(229, new Director(229, "Hirokazu Koreeda", "nm0466153"));
        directors.put(230, new Director(230, "Ryâ€“hei Kitamura", "nm0457565"));
        directors.put(231, new Director(231, "Shusuke Kaneko", "nm0437526"));
        directors.put(232, new Director(232, "Gregor Jordan", "nm0429964"));
        directors.put(241, new Director(241, "Mike Mitchell", "nm0593610"));
        movies.get(1).getDirectors().add(directors.get(1));
        movies.get(2).getDirectors().add(directors.get(2));
        movies.get(3).getDirectors().add(directors.get(3));
        movies.get(3).getDirectors().add(directors.get(4));
        movies.get(4).getDirectors().add(directors.get(5));
        movies.get(5).getDirectors().add(directors.get(6));
        movies.get(6).getDirectors().add(directors.get(7));
        movies.get(7).getDirectors().add(directors.get(8));
        movies.get(8).getDirectors().add(directors.get(9));
        movies.get(9).getDirectors().add(directors.get(10));
        movies.get(10).getDirectors().add(directors.get(11));
        movies.get(11).getDirectors().add(directors.get(12));
        movies.get(12).getDirectors().add(directors.get(13));
        movies.get(13).getDirectors().add(directors.get(14));
        movies.get(14).getDirectors().add(directors.get(15));
        movies.get(15).getDirectors().add(directors.get(16));
        movies.get(16).getDirectors().add(directors.get(17));
        movies.get(17).getDirectors().add(directors.get(18));
        movies.get(18).getDirectors().add(directors.get(19));
        movies.get(19).getDirectors().add(directors.get(20));
        movies.get(20).getDirectors().add(directors.get(21));
        movies.get(21).getDirectors().add(directors.get(22));
        movies.get(22).getDirectors().add(directors.get(23));
        movies.get(23).getDirectors().add(directors.get(24));
        movies.get(24).getDirectors().add(directors.get(25));
        movies.get(25).getDirectors().add(directors.get(26));
        movies.get(26).getDirectors().add(directors.get(27));
        movies.get(27).getDirectors().add(directors.get(28));
        movies.get(28).getDirectors().add(directors.get(29));
        movies.get(29).getDirectors().add(directors.get(30));
        movies.get(30).getDirectors().add(directors.get(31));
        movies.get(31).getDirectors().add(directors.get(32));
        movies.get(32).getDirectors().add(directors.get(33));
        movies.get(32).getDirectors().add(directors.get(34));
        movies.get(33).getDirectors().add(directors.get(35));
        movies.get(34).getDirectors().add(directors.get(36));
        movies.get(35).getDirectors().add(directors.get(37));
        movies.get(36).getDirectors().add(directors.get(38));
        movies.get(37).getDirectors().add(directors.get(39));
        movies.get(38).getDirectors().add(directors.get(40));
        movies.get(39).getDirectors().add(directors.get(41));
        movies.get(40).getDirectors().add(directors.get(42));
        movies.get(41).getDirectors().add(directors.get(43));
        movies.get(42).getDirectors().add(directors.get(44));
        movies.get(43).getDirectors().add(directors.get(45));
        movies.get(44).getDirectors().add(directors.get(46));
        movies.get(45).getDirectors().add(directors.get(47));
        movies.get(46).getDirectors().add(directors.get(48));
        movies.get(47).getDirectors().add(directors.get(49));
        movies.get(48).getDirectors().add(directors.get(50));
        movies.get(49).getDirectors().add(directors.get(51));
        movies.get(50).getDirectors().add(directors.get(52));
        movies.get(51).getDirectors().add(directors.get(53));
        movies.get(52).getDirectors().add(directors.get(54));
        movies.get(53).getDirectors().add(directors.get(55));
        movies.get(54).getDirectors().add(directors.get(56));
        movies.get(55).getDirectors().add(directors.get(57));
        movies.get(56).getDirectors().add(directors.get(58));
        movies.get(57).getDirectors().add(directors.get(59));
        movies.get(58).getDirectors().add(directors.get(60));
        movies.get(59).getDirectors().add(directors.get(61));
        movies.get(60).getDirectors().add(directors.get(62));
        movies.get(61).getDirectors().add(directors.get(63));
        movies.get(62).getDirectors().add(directors.get(64));
        movies.get(63).getDirectors().add(directors.get(65));
        movies.get(64).getDirectors().add(directors.get(66));
        movies.get(65).getDirectors().add(directors.get(67));
        movies.get(66).getDirectors().add(directors.get(68));
        movies.get(67).getDirectors().add(directors.get(69));
        movies.get(68).getDirectors().add(directors.get(70));
        movies.get(69).getDirectors().add(directors.get(71));
        movies.get(70).getDirectors().add(directors.get(72));
        movies.get(70).getDirectors().add(directors.get(48));
        movies.get(72).getDirectors().add(directors.get(73));
        movies.get(73).getDirectors().add(directors.get(74));
        movies.get(74).getDirectors().add(directors.get(75));
        movies.get(74).getDirectors().add(directors.get(76));
        movies.get(75).getDirectors().add(directors.get(77));
        movies.get(76).getDirectors().add(directors.get(78));
        movies.get(77).getDirectors().add(directors.get(79));
        movies.get(78).getDirectors().add(directors.get(80));
        movies.get(79).getDirectors().add(directors.get(81));
        movies.get(80).getDirectors().add(directors.get(82));
        movies.get(81).getDirectors().add(directors.get(83));
        movies.get(82).getDirectors().add(directors.get(84));
        movies.get(83).getDirectors().add(directors.get(85));
        movies.get(84).getDirectors().add(directors.get(86));
        movies.get(85).getDirectors().add(directors.get(87));
        movies.get(86).getDirectors().add(directors.get(88));
        movies.get(87).getDirectors().add(directors.get(89));
        movies.get(88).getDirectors().add(directors.get(90));
        movies.get(89).getDirectors().add(directors.get(91));
        movies.get(90).getDirectors().add(directors.get(92));
        movies.get(91).getDirectors().add(directors.get(81));
        movies.get(92).getDirectors().add(directors.get(93));
        movies.get(93).getDirectors().add(directors.get(87));
        movies.get(94).getDirectors().add(directors.get(81));
        movies.get(95).getDirectors().add(directors.get(94));
        movies.get(96).getDirectors().add(directors.get(95));
        movies.get(97).getDirectors().add(directors.get(96));
        movies.get(98).getDirectors().add(directors.get(95));
        movies.get(99).getDirectors().add(directors.get(97));
        movies.get(100).getDirectors().add(directors.get(95));
        movies.get(101).getDirectors().add(directors.get(98));
        movies.get(102).getDirectors().add(directors.get(99));
        movies.get(103).getDirectors().add(directors.get(100));
        movies.get(103).getDirectors().add(directors.get(101));
        movies.get(104).getDirectors().add(directors.get(95));
        movies.get(105).getDirectors().add(directors.get(102));
        movies.get(106).getDirectors().add(directors.get(103));
        movies.get(107).getDirectors().add(directors.get(104));
        movies.get(108).getDirectors().add(directors.get(105));
        movies.get(109).getDirectors().add(directors.get(106));
        movies.get(110).getDirectors().add(directors.get(107));
        movies.get(111).getDirectors().add(directors.get(108));
        movies.get(112).getDirectors().add(directors.get(109));
        movies.get(113).getDirectors().add(directors.get(110));
        movies.get(114).getDirectors().add(directors.get(111));
        movies.get(115).getDirectors().add(directors.get(112));
        movies.get(116).getDirectors().add(directors.get(113));
        movies.get(117).getDirectors().add(directors.get(94));
        movies.get(118).getDirectors().add(directors.get(114));
        movies.get(119).getDirectors().add(directors.get(115));
        movies.get(120).getDirectors().add(directors.get(116));
        movies.get(121).getDirectors().add(directors.get(95));
        movies.get(122).getDirectors().add(directors.get(94));
        movies.get(123).getDirectors().add(directors.get(117));
        movies.get(124).getDirectors().add(directors.get(118));
        movies.get(125).getDirectors().add(directors.get(102));
        movies.get(126).getDirectors().add(directors.get(119));
        movies.get(127).getDirectors().add(directors.get(120));
        movies.get(128).getDirectors().add(directors.get(121));
        movies.get(129).getDirectors().add(directors.get(122));
        movies.get(131).getDirectors().add(directors.get(123));
        movies.get(132).getDirectors().add(directors.get(124));
        movies.get(133).getDirectors().add(directors.get(125));
        movies.get(134).getDirectors().add(directors.get(126));
        movies.get(135).getDirectors().add(directors.get(127));
        movies.get(136).getDirectors().add(directors.get(128));
        movies.get(137).getDirectors().add(directors.get(129));
        movies.get(138).getDirectors().add(directors.get(130));
        movies.get(139).getDirectors().add(directors.get(131));
        movies.get(140).getDirectors().add(directors.get(132));
        movies.get(141).getDirectors().add(directors.get(133));
        movies.get(142).getDirectors().add(directors.get(134));
        movies.get(143).getDirectors().add(directors.get(135));
        movies.get(144).getDirectors().add(directors.get(136));
        movies.get(145).getDirectors().add(directors.get(137));
        movies.get(146).getDirectors().add(directors.get(138));
        movies.get(146).getDirectors().add(directors.get(51));
        movies.get(148).getDirectors().add(directors.get(139));
        movies.get(148).getDirectors().add(directors.get(140));
        movies.get(149).getDirectors().add(directors.get(141));
        movies.get(149).getDirectors().add(directors.get(142));
        movies.get(150).getDirectors().add(directors.get(143));
        movies.get(151).getDirectors().add(directors.get(144));
        movies.get(152).getDirectors().add(directors.get(144));
        movies.get(153).getDirectors().add(directors.get(145));
        movies.get(154).getDirectors().add(directors.get(146));
        movies.get(155).getDirectors().add(directors.get(147));
        movies.get(156).getDirectors().add(directors.get(148));
        movies.get(157).getDirectors().add(directors.get(149));
        movies.get(158).getDirectors().add(directors.get(150));
        movies.get(159).getDirectors().add(directors.get(151));
        movies.get(160).getDirectors().add(directors.get(152));
        movies.get(160).getDirectors().add(directors.get(62));
        movies.get(162).getDirectors().add(directors.get(153));
        movies.get(163).getDirectors().add(directors.get(154));
        movies.get(164).getDirectors().add(directors.get(155));
        movies.get(165).getDirectors().add(directors.get(156));
        movies.get(166).getDirectors().add(directors.get(157));
        movies.get(167).getDirectors().add(directors.get(158));
        movies.get(168).getDirectors().add(directors.get(159));
        movies.get(169).getDirectors().add(directors.get(160));
        movies.get(170).getDirectors().add(directors.get(161));
        movies.get(171).getDirectors().add(directors.get(162));
        movies.get(172).getDirectors().add(directors.get(163));
        movies.get(173).getDirectors().add(directors.get(164));
        movies.get(174).getDirectors().add(directors.get(165));
        movies.get(175).getDirectors().add(directors.get(166));
        movies.get(176).getDirectors().add(directors.get(167));
        movies.get(177).getDirectors().add(directors.get(168));
        movies.get(178).getDirectors().add(directors.get(169));
        movies.get(179).getDirectors().add(directors.get(170));
        movies.get(180).getDirectors().add(directors.get(171));
        movies.get(181).getDirectors().add(directors.get(172));
        movies.get(182).getDirectors().add(directors.get(173));
        movies.get(183).getDirectors().add(directors.get(136));
        movies.get(184).getDirectors().add(directors.get(174));
        movies.get(185).getDirectors().add(directors.get(175));
        movies.get(186).getDirectors().add(directors.get(176));
        movies.get(187).getDirectors().add(directors.get(177));
        movies.get(188).getDirectors().add(directors.get(178));
        movies.get(189).getDirectors().add(directors.get(179));
        movies.get(190).getDirectors().add(directors.get(180));
        movies.get(191).getDirectors().add(directors.get(181));
        movies.get(192).getDirectors().add(directors.get(62));
        movies.get(193).getDirectors().add(directors.get(182));
        movies.get(194).getDirectors().add(directors.get(183));
        movies.get(195).getDirectors().add(directors.get(184));
        movies.get(196).getDirectors().add(directors.get(185));
        movies.get(197).getDirectors().add(directors.get(186));
        movies.get(198).getDirectors().add(directors.get(187));
        movies.get(199).getDirectors().add(directors.get(188));
        movies.get(200).getDirectors().add(directors.get(189));
        movies.get(201).getDirectors().add(directors.get(107));
        movies.get(202).getDirectors().add(directors.get(190));
        movies.get(203).getDirectors().add(directors.get(191));
        movies.get(204).getDirectors().add(directors.get(133));
        movies.get(205).getDirectors().add(directors.get(116));
        movies.get(206).getDirectors().add(directors.get(192));
        movies.get(207).getDirectors().add(directors.get(193));
        movies.get(208).getDirectors().add(directors.get(194));
        movies.get(209).getDirectors().add(directors.get(195));
        movies.get(210).getDirectors().add(directors.get(195));
        movies.get(211).getDirectors().add(directors.get(196));
        movies.get(212).getDirectors().add(directors.get(197));
        movies.get(213).getDirectors().add(directors.get(198));
        movies.get(214).getDirectors().add(directors.get(199));
        movies.get(214).getDirectors().add(directors.get(200));
        movies.get(215).getDirectors().add(directors.get(201));
        movies.get(216).getDirectors().add(directors.get(202));
        movies.get(217).getDirectors().add(directors.get(203));
        movies.get(218).getDirectors().add(directors.get(204));
        movies.get(219).getDirectors().add(directors.get(205));
        movies.get(219).getDirectors().add(directors.get(206));
        movies.get(220).getDirectors().add(directors.get(207));
        movies.get(221).getDirectors().add(directors.get(208));
        movies.get(222).getDirectors().add(directors.get(209));
        movies.get(222).getDirectors().add(directors.get(210));
        movies.get(223).getDirectors().add(directors.get(211));
        movies.get(224).getDirectors().add(directors.get(212));
        movies.get(225).getDirectors().add(directors.get(213));
        movies.get(226).getDirectors().add(directors.get(213));
        movies.get(227).getDirectors().add(directors.get(214));
        movies.get(228).getDirectors().add(directors.get(215));
        movies.get(229).getDirectors().add(directors.get(216));
        movies.get(230).getDirectors().add(directors.get(217));
        movies.get(231).getDirectors().add(directors.get(218));
        movies.get(232).getDirectors().add(directors.get(219));
        movies.get(233).getDirectors().add(directors.get(220));
        movies.get(234).getDirectors().add(directors.get(87));
        movies.get(235).getDirectors().add(directors.get(221));
        movies.get(236).getDirectors().add(directors.get(222));
        movies.get(237).getDirectors().add(directors.get(223));
        movies.get(238).getDirectors().add(directors.get(169));
        movies.get(239).getDirectors().add(directors.get(224));
        movies.get(240).getDirectors().add(directors.get(225));
        movies.get(241).getDirectors().add(directors.get(226));
        movies.get(242).getDirectors().add(directors.get(227));
        movies.get(242).getDirectors().add(directors.get(228));
        movies.get(243).getDirectors().add(directors.get(229));
        movies.get(244).getDirectors().add(directors.get(230));
        movies.get(245).getDirectors().add(directors.get(231));
        movies.get(246).getDirectors().add(directors.get(232));
        movies.get(255).getDirectors().add(directors.get(241));

    }

    @Override
    public Movie findMovieById(int id) {
        return movies.get(id);
    }

    @Override
    public Collection<Movie> findAllMovies() {
        return movies.values();
    }

    @Override
    public Collection<Movie> findAllMoviesByYearRange(int fromYear, int toYear) {
        Collection<Movie> resultList = new ArrayList<>();
        for (Movie movie : movies.values()) {
            int year = movie.getYear();
            if (year >= fromYear && year <= toYear) {
                resultList.add(movie);
            }
        }
        return resultList;
    }

    @Override
    public Collection<Movie> findAllMoviesByYearRangeAndGenre(String genre,
            int fromYear, int toYear) {
        Collection<Movie> resultList = new ArrayList<>();
        Genre g = findGenreByName(genre);
        for (Movie movie : movies.values()) {
            int year = movie.getYear();
            if (year >= fromYear && year <= toYear
                    && movie.getGenres().contains(g)) {
                resultList.add(movie);
            }
        }
        return resultList;
    }

    @Override
    public Genre findGenreByName(String genre) {
        for (Genre g : genres.values()) {
            if (genre.equals(g.getName())) {
                return g;
            }
        }
        return null;
    }

    @Override
    public Collection<Movie> findAllMoviesByGenre(String genre) {
        Collection<Movie> resultList = new ArrayList<>();
        Genre g = findGenreByName(genre);
        for (Movie movie : movies.values()) {
            if (movie.getGenres().contains(g)) {
                resultList.add(movie);
            }
        }
        return resultList;
    }

    @Override
    public Collection<Movie> findAllMoviesByDirectorId(int directorId) {
        Collection<Movie> resultList = new ArrayList<>();
        Director director = directors.get(directorId);
        for (Movie movie : movies.values()) {
            if (movie.getDirectors().contains(director)) {
                resultList.add(movie);
            }
        }
        return resultList;
    }

    @Override
    public Movie addMovie(int id, String title, int year, String imdb,
            List<Genre> genres, List<Director> directors) {
        Movie movie = new Movie(id, title, year, imdb);
        movie.getDirectors().addAll(directors);
        movie.getGenres().addAll(genres);
        return movie;
    }

    @Override
    public Collection<Genre> findAllGenres() {
        return genres.values();
    }

    @Override
    public Collection<Director> findAllDirectors() {
        return directors.values();
    }

    @Override
    public Collection<Movie> findAllMoviesByCriteria(CriteriaBean criteria) {
        List<Movie> searchResult = new ArrayList<>();
        for (Movie movie : movies.values()) {
            boolean criteriaMatched = true;
            if (criteria.isYearRangeSelected()) {
                int year = movie.getYear();
                if (year < criteria.getFromYear()
                        || year > criteria.getToYear()) {
                    criteriaMatched = false;
                }
            }
            if (criteria.isDirectorSelected()) {
                boolean found = false;
                for (Director director : movie.getDirectors()) {
                    if (director.getId() == criteria.getDirector()) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    criteriaMatched = false;
                }
            }
            if (criteria.isGenreSelected()) {
                boolean found = false;
                for (Genre genre : movie.getGenres()) {
                    if (genre.getId() == criteria.getGenre()) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    criteriaMatched = false;
                }
            }
            if (criteriaMatched) {
                searchResult.add(movie);
            }
        }
        return searchResult;
    }
}
