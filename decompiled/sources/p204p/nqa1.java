package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nqa1 {

    /* JADX INFO: renamed from: a */
    public final boolean f157214a;

    /* JADX INFO: renamed from: b */
    public final xul0 f157215b;

    public nqa1(xul0 xul0Var, boolean z) {
        this.f157214a = z;
        this.f157215b = xul0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqa1)) {
            return false;
        }
        nqa1 nqa1Var = (nqa1) obj;
        return this.f157214a == nqa1Var.f157214a && wj50.m88271j(this.f157215b, nqa1Var.f157215b);
    }

    public final int hashCode() {
        return this.f157215b.hashCode() + (Boolean.hashCode(this.f157214a) * 31);
    }
}
