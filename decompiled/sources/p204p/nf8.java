package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nf8 implements pf8 {

    /* JADX INFO: renamed from: a */
    public final String f153265a;

    /* JADX INFO: renamed from: b */
    public final int f153266b;

    public nf8(String str, int i) {
        this.f153265a = str;
        this.f153266b = i;
    }

    @Override // p204p.pf8
    /* JADX INFO: renamed from: a */
    public final String mo38720a() {
        return this.f153265a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf8)) {
            return false;
        }
        nf8 nf8Var = (nf8) obj;
        return wj50.m88271j(this.f153265a, nf8Var.f153265a) && this.f153266b == nf8Var.f153266b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f153266b) + (this.f153265a.hashCode() * 31);
    }
}
