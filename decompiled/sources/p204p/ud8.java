package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ud8 implements yd8 {

    /* JADX INFO: renamed from: a */
    public final String f229194a;

    /* JADX INFO: renamed from: b */
    public final int f229195b;

    public ud8(String str, int i) {
        this.f229194a = str;
        this.f229195b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud8)) {
            return false;
        }
        ud8 ud8Var = (ud8) obj;
        return wj50.m88271j(this.f229194a, ud8Var.f229194a) && this.f229195b == ud8Var.f229195b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f229195b) + (this.f229194a.hashCode() * 31);
    }
}
