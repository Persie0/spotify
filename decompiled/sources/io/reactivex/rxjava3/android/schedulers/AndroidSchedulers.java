package io.reactivex.rxjava3.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AndroidSchedulers {

    /* JADX INFO: renamed from: a */
    public static final Scheduler f7175a = RxAndroidPlugins.m23279a(new CallableC1409a());

    public static final class MainHolder {

        /* JADX INFO: renamed from: a */
        public static final Scheduler f7176a = new HandlerScheduler(new Handler(Looper.getMainLooper()));
    }
}
