package p204p;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zwe {

    /* JADX INFO: renamed from: c */
    public static SensorManager f286966c;

    /* JADX INFO: renamed from: d */
    public static yhc1 f286967d;

    /* JADX INFO: renamed from: e */
    public static String f286968e;

    /* JADX INFO: renamed from: h */
    public static volatile boolean f286971h;

    /* JADX INFO: renamed from: a */
    public static final zwe f286964a = new zwe();

    /* JADX INFO: renamed from: b */
    public static final zhc1 f286965b = new zhc1();

    /* JADX INFO: renamed from: f */
    public static final AtomicBoolean f286969f = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g */
    public static final AtomicBoolean f286970g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static final String m97115a() {
        if (p2l.f173365a.contains(zwe.class)) {
            return null;
        }
        try {
            if (f286968e == null) {
                f286968e = UUID.randomUUID().toString();
            }
            return f286968e;
        } catch (Throwable th) {
            p2l.m68953a(zwe.class, th);
            return null;
        }
    }
}
