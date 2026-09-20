package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jyu0 {

    /* JADX INFO: renamed from: a */
    public final String f117491a;

    /* JADX INFO: renamed from: b */
    public final String f117492b;

    public jyu0(String str, String str2) {
        this.f117491a = str;
        this.f117492b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m54819a() {
        return this.f117491a;
    }

    /* JADX INFO: renamed from: b */
    public final String m54820b() {
        return this.f117492b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyu0)) {
            return false;
        }
        jyu0 jyu0Var = (jyu0) obj;
        return wj50.m88271j(this.f117491a, jyu0Var.f117491a) && wj50.m88271j(this.f117492b, jyu0Var.f117492b);
    }

    public final int hashCode() {
        int iHashCode = this.f117491a.hashCode() * 31;
        String str = this.f117492b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
