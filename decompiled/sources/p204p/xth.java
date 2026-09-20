package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xth {

    /* JADX INFO: renamed from: a */
    public final tth f265871a;

    /* JADX INFO: renamed from: b */
    public final int f265872b;

    public xth(tth tthVar, int i) {
        this.f265871a = tthVar;
        this.f265872b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xth)) {
            return false;
        }
        xth xthVar = (xth) obj;
        return wj50.m88271j(this.f265871a, xthVar.f265871a) && this.f265872b == xthVar.f265872b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f265872b) + (this.f265871a.hashCode() * 31);
    }
}
