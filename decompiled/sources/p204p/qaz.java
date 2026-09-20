package p204p;

import android.content.ContentProvider;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class qaz extends ContentProvider {

    /* JADX INFO: renamed from: a */
    public static final d28 f186951a = new d28(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f186952b = new AtomicBoolean(false);
}
