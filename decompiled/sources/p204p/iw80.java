package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class iw80 implements qw80 {

    /* JADX INFO: renamed from: a */
    public final int f106360a;

    /* JADX INFO: renamed from: b */
    public final c4a f106361b;

    /* JADX INFO: renamed from: c */
    public final int f106362c;

    public iw80(int i, c4a c4aVar, int i2) {
        this.f106360a = i;
        this.f106361b = c4aVar;
        this.f106362c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw80)) {
            return false;
        }
        iw80 iw80Var = (iw80) obj;
        return this.f106360a == iw80Var.f106360a && wj50.m88271j(this.f106361b, iw80Var.f106361b) && this.f106362c == iw80Var.f106362c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f106362c) + ((this.f106361b.hashCode() + (Integer.hashCode(this.f106360a) * 31)) * 31);
    }
}
