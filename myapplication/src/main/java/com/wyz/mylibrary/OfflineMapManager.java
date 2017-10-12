package com.wyz.mylibrary;

import android.content.Context;

import java.util.List;

/**
 * Created by WYZ on 2017/10/12.
 */

public class OfflineMapManager {

    private OfflineMapManager.OfflineMapDownloadListener downloadListener;
    private OfflineMapManager.OfflineLoadedListener loadedListener;

    public OfflineMapManager(Context activity, OfflineMapDownloadListener Listener) {

    }

    public void downloadByCityName(String city) {

    }

    public void downloadByProvinceName(String city) {

    }

    public void pause() {

    }

    public void restart() {

    }

    public void remove(String name) {

    }

    public void updateOfflineCityByName(String name) {

    }

    public List<OfflineMapCity> getDownloadOfflineMapCityList() {
        return null;
    }
    public List<OfflineMapCity> getDownloadingCityList() {
        return null;
    }

    public void destroy() {

    }

    public void stop() {

    }

    public void setOnOfflineLoadedListener(OfflineMapDownloadListener listener) {
        this.downloadListener = listener;

    }

    public List<OfflineMapProvince> getOfflineMapProvinceList() {
        return null;
    }

    public interface OfflineLoadedListener {
        void onVerifyComplete();
    }

    public interface OfflineMapDownloadListener {
        void onDownload(int status, int completeCode, String downName) ;

        void onCheckUpdate(boolean hasNew, String name);

        void  onRemove(boolean success, String name, String describe);
    }
}
