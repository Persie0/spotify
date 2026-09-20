package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jba1 implements kba1 {

    /* JADX INFO: renamed from: a */
    public final String f110725a;

    public jba1(String str) {
        this.f110725a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jba1) && wj50.m88271j(this.f110725a, ((jba1) obj).f110725a);
    }

    public final int hashCode() {
        return this.f110725a.hashCode();
    }
}
