package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ib3 {

    /* JADX INFO: renamed from: a */
    public final int f100421a;

    public /* synthetic */ ib3(int i) {
        this.f100421a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ib3 m50113a(int i) {
        return new ib3(i);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m50114b(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: c */
    public static String m50115c(int i) {
        return dq60.m36613m("Horizontal(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ib3) {
            return this.f100421a == ((ib3) obj).f100421a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f100421a);
    }

    public final String toString() {
        return m50115c(this.f100421a);
    }
}
