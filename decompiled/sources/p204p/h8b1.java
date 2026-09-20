package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h8b1 extends k8b1 {

    /* JADX INFO: renamed from: a */
    public final tth f88674a;

    /* JADX INFO: renamed from: b */
    public final int f88675b;

    public h8b1(tth tthVar, int i) {
        this.f88674a = tthVar;
        this.f88675b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8b1)) {
            return false;
        }
        h8b1 h8b1Var = (h8b1) obj;
        return wj50.m88271j(this.f88674a, h8b1Var.f88674a) && this.f88675b == h8b1Var.f88675b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f88675b) + (this.f88674a.hashCode() * 31);
    }
}
