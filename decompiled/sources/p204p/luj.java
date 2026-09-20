package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class luj {

    /* JADX INFO: renamed from: a */
    public final int f137095a;

    public /* synthetic */ luj(int i) {
        this.f137095a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ luj m60017a(int i) {
        return new luj(i);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m60018b(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: c */
    public static String m60019c(int i) {
        return dq60.m36613m("ContentScale(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof luj) {
            return this.f137095a == ((luj) obj).f137095a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f137095a);
    }

    public final String toString() {
        return m60019c(this.f137095a);
    }
}
