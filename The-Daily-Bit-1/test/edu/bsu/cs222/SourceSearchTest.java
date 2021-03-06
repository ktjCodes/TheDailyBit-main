package edu.bsu.cs222;

import edu.bsu.cs222.JSONParser;
import edu.bsu.cs222.SourceSearch;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

class SourceSearchTest {


    @Test
    void connectToAPIBySource() throws IOException {
        String source = "cnn";
        InputStream stream = null;
        SourceSearch sourceSearch = new SourceSearch();
        JSONParser parser = new JSONParser();
        sourceSearch.connectToAPIBySource(source);
        stream=sourceSearch.pullInputStream();
        parser.getArticles(stream);
        parser.getTitleList();
    }

    @Test
    void connectToAPIByCountry() throws IOException {
        String country = "us";
        InputStream stream = null;
        SourceSearch sourceSearch = new SourceSearch();
        JSONParser parser = new JSONParser();
        sourceSearch.connectToAPIByCatagory(country);
        stream=sourceSearch.pullInputStream();
        parser.getArticles(stream);
        parser.getTitleList();
    }

    @Test
    void connectToAPIByCatagory() throws IOException {
        String catagory = "business";
        InputStream stream = null;
        SourceSearch sourceSearch = new SourceSearch();
        JSONParser parser = new JSONParser();
        sourceSearch.connectToAPIByCatagory(catagory);
        stream=sourceSearch.pullInputStream();
        parser.getArticles(stream);
        parser.getTitleList();
    }
    
}