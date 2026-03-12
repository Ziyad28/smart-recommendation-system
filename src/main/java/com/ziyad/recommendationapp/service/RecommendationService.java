package com.ziyad.recommendationapp.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class RecommendationService {

    static class Place {
        String name;
        double rating;
        int reviews;

        Place(String name, double rating, int reviews) {
            this.name = name;
            this.rating = rating;
            this.reviews = reviews;
        }
    }

    public Map<String, Object> getRecommendation(int age, int budget, String type, String category, String city, String language) {

        Map<String, List<Place>> data = new HashMap<>();

        // ================= HAIL =================

        data.put("Hail_specialty coffee", Arrays.asList(
                new Place("NAF", 4.5, 1011),
                new Place("Hao Coffee", 4.2, 276),
                new Place("IV Cafe", 4.7, 1007),
                new Place("Shed Coffee", 4.9, 894),
                new Place("Flawless Coffee", 4.3, 760)
        ));

        data.put("Hail_roastery coffee", Arrays.asList(
                new Place("Geisha Roastery", 4.3, 1590),
                new Place("Camel Step", 4.3, 604),               new Place("Alton Coffee", 4.4, 1079),
                new Place("Peacock Coffee", 4.4, 1593),
                new Place("Al Andalus Roastery", 4.1, 210)
        ));

        data.put("Hail_italian restaurant", Arrays.asList(
                new Place("Roca Roco", 4.5, 1280),
                new Place("Loft Restaurant", 4.8, 9654),
                new Place("Crops", 4.8, 499),
                new Place("Picual", 4.4, 621),
                new Place("Opalo Pizzeria", 4.0, 566)
        ));

        data.put("Hail_american restaurant", Arrays.asList(
                new Place("Flux", 4.2, 1651),
                new Place("WBJ Burger", 4.7, 390),
                new Place("Point Burger", 4.3, 3915),
                new Place("Smoke Ring", 4.1, 518),
                new Place("Reef Burger", 4.3, 2124)
        ));

        data.put("Hail_japanese restaurant", Arrays.asList(
                new Place("Kim Wok", 4.1, 228),
                new Place("Noodles Factory", 4.1, 212),
                new Place("Secret Sushi", 4.4, 356),
                new Place("Ramen Yummy", 4.9, 75),
                new Place("Myss Sushi", 4.2, 25)
        ));

        data.put("Hail_saudi restaurant", Arrays.asList(
                new Place("Nakhat Dairatna", 4.2, 2120),
                new Place("Al Wadi Al Mubarak Kitchen", 4.4, 5331),
                new Place("Al Qasrain Kitchens", 4.6, 2217),
                new Place("Zawaya Barzan", 4.5, 550),
                new Place("Duyuf Al Asalah", 4.1, 4791)
        ));

        data.put("Hail_shawarma restaurant", Arrays.asList(
                new Place("Shawrmanatak", 4.8, 1683),
                new Place("Ninety Flavor", 4.3, 201),
                new Place("Lasat Felfela", 4.4, 1286),
                new Place("Shawarma Samel", 4.5, 143),
                new Place("Shawarma Moalem", 4.4, 614)
        ));

        // ================= RIYADH =================

        data.put("Riyadh_specialty coffee", Arrays.asList(
                new Place("Brew92", 4.0, 3303),
                new Place("Quaint Cafe", 4.1, 3214),
                new Place("Kultura Coffee", 4.4, 3838),
                new Place("SCRMY", 4.5, 2027),
                new Place("DaNona Al Nakheel", 4.1, 1157)
        ));

        data.put("Riyadh_roastery coffee", Arrays.asList(
                new Place("Sulalat Coffee", 4.3, 5690),
                new Place("Origin Roastery", 3.7, 1735),
                new Place("Hjeen Roastery", 4.5, 3208),
                new Place("Bayt Al Tahmees", 4.4, 2049),
                new Place("Breehant Roastery", 4.5, 7678)
        ));

        data.put("Riyadh_american restaurant", Arrays.asList(
                new Place("Chefz Burger", 4.4, 12607),
                new Place("Steak House", 4.3, 14764),
                new Place("Prime Cut", 4.6, 11294),
                new Place("California Burger", 4.6, 22800),
                new Place("7 Adlaa", 4.3, 7847)
        ));

        data.put("Riyadh_italian restaurant", Arrays.asList(
                new Place("Mamo Michelangelo", 3.9, 6136),
                new Place("Blanca", 4.3, 9702),
                new Place("Zuma", 4.6, 2834),
                new Place("Signor Sassi", 4.2, 6065),
                new Place("San Marzano", 4.6, 1699)
        ));

        data.put("Riyadh_japanese restaurant", Arrays.asList(
                new Place("Kami", 4.9, 5712),
                new Place("Okku", 4.2, 1907),
                new Place("Shiro", 4.8, 8016),
                new Place("Sushi Yoshi", 4.0, 1869),
                new Place("Myazu", 4.4, 10018)
        ));

        data.put("Riyadh_saudi restaurant", Arrays.asList(
                new Place("Hataba", 4.4, 9575),
                new Place("Shawayat Al Khaleej", 4.2, 8770),
                new Place("Najd Village", 4.1, 11495),
                new Place("Aseeb", 4.5, 16495),
                new Place("Toufaria", 4.3, 6594)
        ));

        data.put("Riyadh_shawarma restaurant", Arrays.asList(
                new Place("Mama Noura", 4.2, 31122),
                new Place("Nawar Al Lulu", 4.1, 3992),
                new Place("Bayt Al Shawarma", 4.4, 38294),
                new Place("Shawarma Rayeg", 4.1, 3209),
                new Place("Shawarma Ayed", 4.4, 5163)
        ));

        // ================= DAMMAM =================

        data.put("Dammam_specialty coffee", Arrays.asList(
                new Place("Juz Coffee", 4.8, 2060),
                new Place("Sant Coffee", 4.8, 1649),
                new Place("Opinion Coffee", 4.8, 1275),
                new Place("Namq Coffee", 4.4, 6369),
                new Place("Llama Cafe", 4.5, 3632)
        ));

        data.put("Dammam_roastery coffee", Arrays.asList(
                new Place("Soil Roasters", 4.5, 1707),
                new Place("Andy's Coffee Roasters", 4.6, 2937),
                new Place("Slope Coffee", 4.7, 603),
                new Place("Core Coffee & Roastery", 4.4, 658),
                new Place("Sharq Coffee", 4.5, 8194)
        ));

        data.put("Dammam_american restaurant", Arrays.asList(
                new Place("Wings", 4.5, 1136),
                new Place("Half Pound Burger", 4.7, 2968),
                new Place("Burger Site", 4.4, 8524),
                new Place("The Peak", 4.5, 8533),
                new Place("Regal Burger", 4.6, 9366)
        ));

        data.put("Dammam_italian restaurant", Arrays.asList(
                new Place("Brava Italian", 4.7, 2051),
                new Place("Kart Restaurant", 4.6, 4096),
                new Place("Fatto", 4.7, 6272),
                new Place("Belivento", 4.7, 4556),
                new Place("Lievito", 4.6, 2411)
        ));

        data.put("Dammam_japanese restaurant", Arrays.asList(
                new Place("Sushi Library", 4.5, 3242),
                new Place("Unagi", 4.5, 1318),
                new Place("Masami Sushi", 4.0, 1217),
                new Place("Maki House", 4.6, 1116),
                new Place("Kaiseki Sushi & Noodles", 4.7, 1932)
        ));

        data.put("Dammam_saudi restaurant", Arrays.asList(
                new Place("Shajarat Al Durr", 4.7, 26408),
                new Place("Al Mathaq Al Othmani", 4.6, 15704),
                new Place("Zad Al Sultan", 4.2, 7569),
                new Place("Qasr Al Mathbi", 4.1, 4956),
                new Place("Al Mudhyaf", 4.3, 2806)
        ));

        data.put("Dammam_shawarma restaurant", Arrays.asList(
                new Place("Shawarma Hleel", 4.1, 5713),
                new Place("Rayeg Restaurant", 4.1, 6726),
                new Place("Shawarma Hazwra", 4.6, 3096),
                new Place("Shrimpy", 4.0, 6763),
                new Place("Shawarmer", 4.0, 3310)
        ));

        String key = city + "_" + category;

        List<Place> places = data.getOrDefault(key, new ArrayList<>());

        places.sort((a, b) -> {
            double scoreA = a.rating + Math.min(a.reviews / 1000.0, 1.0);
            double scoreB = b.rating + Math.min(b.reviews / 1000.0, 1.0);
            return Double.compare(scoreB, scoreA);
        });

        List<Map<String, Object>> resultPlaces = new ArrayList<>();

        for (Place p : places) {
            Map<String, Object> item = new HashMap<>();
            item.put("name", p.name);
            item.put("rating", p.rating);
            item.put("reviews", p.reviews);
            resultPlaces.add(item);
        }

        Map<String, Object> result = new HashMap<>();
        result.put("places", resultPlaces);

        return result;
    }
}