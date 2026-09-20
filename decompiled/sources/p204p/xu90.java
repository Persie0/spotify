package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xu90 implements iv90 {

    /* JADX INFO: renamed from: a */
    public final String f266034a;

    /* JADX INFO: renamed from: b */
    public final String f266035b;

    public xu90(String str, String str2) {
        this.f266034a = str;
        this.f266035b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu90)) {
            return false;
        }
        xu90 xu90Var = (xu90) obj;
        return wj50.m88271j(this.f266034a, xu90Var.f266034a) && wj50.m88271j(this.f266035b, xu90Var.f266035b);
    }

    public final int hashCode() {
        return this.f266035b.hashCode() + (this.f266034a.hashCode() * 31);
    }
}
