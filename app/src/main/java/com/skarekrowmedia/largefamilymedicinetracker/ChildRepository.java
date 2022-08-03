package com.skarekrowmedia.largefamilymedicinetracker;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class ChildRepository {
    private ChildDao childDao;
    private LiveData<List<ChildModel>> allChildren;

    public ChildRepository(Application application) {
        ChildDatabase database = ChildDatabase.getInstance(application);
        childDao = database.childDao();
        allChildren = childDao.getAllChildren();
    }
    public void insert(ChildModel childModel){
    new InsertChildAsyncTask(childDao).execute(childModel);
    }

    public void update(ChildModel childModel){
    new UpdateChildAsyncTask(childDao).execute(childModel);
    }
    public void delete(ChildModel childModel) {
    new DeleteChildAsyncTask(childDao).execute(childModel);
    }
    public void deleteAllChildren() {
        new DeleteAllChildAsyncTask(childDao).execute();
    }
    public LiveData<List<ChildModel>> getAllChildren() {
        return allChildren;
    }
    private static class InsertChildAsyncTask extends AsyncTask<ChildModel, Void, Void >{
        private ChildDao childDao;

        private InsertChildAsyncTask(ChildDao childDao) {
            this.childDao = childDao;
        }

        @Override
        protected Void doInBackground(ChildModel... Child) {
            childDao.insert(Child[0]);
            return null;
    }
    }

    private static class UpdateChildAsyncTask extends AsyncTask<ChildModel, Void, Void >{
        private ChildDao childDao;

        private UpdateChildAsyncTask(ChildDao childDao) {
            this.childDao = childDao;
        }

        @Override
        protected Void doInBackground(ChildModel... Child) {
            childDao.update(Child[0]);
            return null;
        }
    }
    private static class DeleteChildAsyncTask extends AsyncTask<ChildModel, Void, Void >{
        private ChildDao childDao;

        private DeleteChildAsyncTask(ChildDao childDao) {
            this.childDao = childDao;
        }

        @Override
        protected Void doInBackground(ChildModel... Child) {
            childDao.delete(Child[0]);
            return null;
        }
    }
    private static class DeleteAllChildAsyncTask extends AsyncTask<Void, Void, Void >{
        private ChildDao childDao;

        private DeleteAllChildAsyncTask(ChildDao Child) {
            this.childDao = childDao;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            childDao.deleteAllChildren();
            return null;
        }
    }

}
