package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class cxn0 implements dxn0 {

    /* JADX INFO: renamed from: a */
    public final int f43070a;

    /* JADX INFO: renamed from: b */
    public final String f43071b;

    public cxn0(int i, String str) {
        this.f43070a = i;
        this.f43071b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxn0)) {
            return false;
        }
        cxn0 cxn0Var = (cxn0) obj;
        return this.f43070a == cxn0Var.f43070a && wj50.m88271j(this.f43071b, cxn0Var.f43071b);
    }

    public final int hashCode() {
        return this.f43071b.hashCode() + (Integer.hashCode(this.f43070a) * 31);
    }
}
