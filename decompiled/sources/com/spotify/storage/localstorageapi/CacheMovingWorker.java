package com.spotify.storage.localstorageapi;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m24212d2 = {"Lcom/spotify/storage/localstorageapi/CacheMovingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "p/h5n", "src_main_java_com_spotify_storage_localstorageapi-localstorageapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class CacheMovingWorker extends CoroutineWorker {
    public CacheMovingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
