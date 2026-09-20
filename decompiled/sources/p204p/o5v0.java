package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o5v0 extends gwg1 {

    /* JADX INFO: renamed from: b */
    public final String f162108b;

    /* JADX INFO: renamed from: c */
    public final int f162109c;

    public o5v0(String str, int i) {
        this.f162108b = str;
        this.f162109c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5v0)) {
            return false;
        }
        o5v0 o5v0Var = (o5v0) obj;
        return wj50.m88271j(this.f162108b, o5v0Var.f162108b) && this.f162109c == o5v0Var.f162109c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f162109c) + (this.f162108b.hashCode() * 31);
    }
}
