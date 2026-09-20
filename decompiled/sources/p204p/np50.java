package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class np50 extends ice implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final np50 f156881a = new np50();

    public static boolean isLeapYear(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    private Object readResolve() {
        return f156881a;
    }
}
