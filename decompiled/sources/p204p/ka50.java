package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ka50 implements la50 {

    /* JADX INFO: renamed from: a */
    public final String f120798a;

    /* JADX INFO: renamed from: b */
    public final boolean f120799b;

    /* JADX INFO: renamed from: c */
    public final boolean f120800c;

    public ka50(String str, boolean z, boolean z2) {
        this.f120798a = str;
        this.f120799b = z;
        this.f120800c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka50)) {
            return false;
        }
        ka50 ka50Var = (ka50) obj;
        return wj50.m88271j(this.f120798a, ka50Var.f120798a) && this.f120799b == ka50Var.f120799b && this.f120800c == ka50Var.f120800c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f120800c) + s571.m77245d(this.f120798a.hashCode() * 31, 31, this.f120799b);
    }
}
