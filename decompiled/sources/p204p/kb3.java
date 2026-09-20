package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class kb3 {

    /* JADX INFO: renamed from: a */
    public final int f121073a;

    public /* synthetic */ kb3(int i) {
        this.f121073a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ kb3 m55923a(int i) {
        return new kb3(i);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m55924b(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: c */
    public static String m55925c(int i) {
        return dq60.m36613m("Vertical(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kb3) {
            return this.f121073a == ((kb3) obj).f121073a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121073a);
    }

    public final String toString() {
        return m55925c(this.f121073a);
    }
}
