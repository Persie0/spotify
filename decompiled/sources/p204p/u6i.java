package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class u6i extends b7i {

    /* JADX INFO: renamed from: a */
    public final tth f227353a;

    /* JADX INFO: renamed from: b */
    public final int f227354b;

    public u6i(tth tthVar, int i) {
        this.f227353a = tthVar;
        this.f227354b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6i)) {
            return false;
        }
        u6i u6iVar = (u6i) obj;
        return wj50.m88271j(this.f227353a, u6iVar.f227353a) && this.f227354b == u6iVar.f227354b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f227354b) + (this.f227353a.hashCode() * 31);
    }
}
