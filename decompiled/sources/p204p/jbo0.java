package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jbo0 implements nbo0 {

    /* JADX INFO: renamed from: a */
    public final String f110834a;

    public jbo0(String str) {
        this.f110834a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jbo0) && wj50.m88271j(this.f110834a, ((jbo0) obj).f110834a);
    }

    public final int hashCode() {
        return this.f110834a.hashCode();
    }
}
