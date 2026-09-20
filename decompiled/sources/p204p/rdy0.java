package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class rdy0 {

    /* JADX INFO: renamed from: a */
    public static final long[] f198228a = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: b */
    public static final cqi0 f198229b = new cqi0(0);

    /* JADX INFO: renamed from: a */
    public static final int m75371a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    /* JADX INFO: renamed from: b */
    public static final int m75372b(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    /* JADX INFO: renamed from: c */
    public static final int m75373c(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static final int m75374d(int i) {
        if (i == 7) {
            return 8;
        }
        return edb.m38556e(i, 1, 7, i);
    }
}
