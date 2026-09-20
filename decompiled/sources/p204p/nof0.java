package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nof0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final String f156694a;

    public nof0(String str) {
        this.f156694a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nof0) && wj50.m88271j(this.f156694a, ((nof0) obj).f156694a);
    }

    public final int hashCode() {
        String str = this.f156694a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
