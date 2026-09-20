package p204p;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pp3 {

    /* JADX INFO: renamed from: a */
    public static final ReentrantReadWriteLock f179878a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: b */
    public static String f179879b;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f179880c;

    /* JADX INFO: renamed from: a */
    public static void m70502a() {
        if (f179880c) {
            return;
        }
        f179878a.writeLock().lock();
        try {
            if (!f179880c) {
                f179879b = PreferenceManager.getDefaultSharedPreferences(p8y.m69343a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                f179880c = true;
            }
        } finally {
            f179878a.writeLock().unlock();
        }
    }
}
