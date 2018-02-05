package com.example.achypur.gridviewapp;

import android.content.Context;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


final class JsonUtils {
     static List<ImageModel> loadModelsFromFile(Context context) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = context.getResources().openRawResource(R.raw.example_json);
            return  mapper.readValue(is, mapper.getTypeFactory().constructCollectionType(ArrayList.class, ImageModel.class));
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
