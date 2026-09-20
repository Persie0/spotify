package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fkp0 {

    /* JADX INFO: renamed from: a */
    public final String f70575a;

    /* JADX INFO: renamed from: b */
    public final String f70576b;

    /* JADX INFO: renamed from: c */
    public final int f70577c;

    public fkp0(String str, String str2, int i) {
        this.f70575a = str;
        this.f70576b = str2;
        this.f70577c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkp0)) {
            return false;
        }
        fkp0 fkp0Var = (fkp0) obj;
        return wj50.m88271j(this.f70575a, fkp0Var.f70575a) && this.f70576b.equals(fkp0Var.f70576b) && this.f70577c == fkp0Var.f70577c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f70577c) + s571.m77243b(this.f70575a.hashCode() * 31, 31, this.f70576b);
    }
}
