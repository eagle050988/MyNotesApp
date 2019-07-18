package com.nasatech.mynotesapp;

import com.nasatech.mynotesapp.entity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();
    void postExecute(ArrayList<Note> notes);
}
