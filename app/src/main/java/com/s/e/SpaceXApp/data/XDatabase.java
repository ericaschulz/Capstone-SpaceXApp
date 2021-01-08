package com.s.e.SpaceXApp.data;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

abstract class XDatabase extends RoomDatabase {
    private static final XDatabase ourInstance = new XDatabase() {
        @NonNull
        @Override
        protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
            return null;
        }

        @NonNull
        @Override
        protected InvalidationTracker createInvalidationTracker() {
            return null;
        }

        @Override
        public void clearAllTables() {

        }
    };

    static XDatabase getInstance() {
        return ourInstance;
    }

    private XDatabase() {
    }
}
