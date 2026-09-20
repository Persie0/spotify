package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rg00 {

    /* JADX INFO: renamed from: a */
    public final String f198783a;

    /* JADX INFO: renamed from: b */
    public final boolean f198784b;

    public rg00(String str, boolean z) {
        this.f198783a = str;
        this.f198784b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg00)) {
            return false;
        }
        rg00 rg00Var = (rg00) obj;
        return wj50.m88271j(this.f198783a, rg00Var.f198783a) && this.f198784b == rg00Var.f198784b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198784b) + (this.f198783a.hashCode() * 31);
    }
}
