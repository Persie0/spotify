package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes2.dex */
public abstract class upz0 {

    /* JADX INFO: renamed from: b */
    public static final C2617yl f232860b;

    /* JADX INFO: renamed from: c */
    public static final C2617yl f232861c;

    /* JADX INFO: renamed from: d */
    public static final C2617yl f232862d;

    /* JADX INFO: renamed from: e */
    public static final C2617yl f232863e;

    /* JADX INFO: renamed from: a */
    public static final int f232859a = fmg1.m42123P(100, 1, (12 & 8) != 0 ? Alert.DURATION_SHOW_INDEFINITELY : 2097150, "kotlinx.coroutines.semaphore.maxSpinCycles");

    /* JADX INFO: renamed from: f */
    public static final int f232864f = fmg1.m42123P(16, 1, (12 & 8) != 0 ? Alert.DURATION_SHOW_INDEFINITELY : 2097150, "kotlinx.coroutines.semaphore.segmentSize");

    static {
        int i = 8;
        f232860b = new C2617yl("PERMIT", i);
        f232861c = new C2617yl("TAKEN", i);
        f232862d = new C2617yl("BROKEN", i);
        f232863e = new C2617yl("CANCELLED", i);
    }

    /* JADX INFO: renamed from: a */
    public static tpz0 m83743a(int i) {
        return new tpz0(i, 0);
    }
}
