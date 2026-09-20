package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class wso0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f254660a;

    /* JADX INFO: renamed from: b */
    public final v3h1 f254661b;

    public wso0(boolean z, v3h1 v3h1Var) {
        this.f254660a = z;
        this.f254661b = v3h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wso0)) {
            return false;
        }
        wso0 wso0Var = (wso0) obj;
        return this.f254660a == wso0Var.f254660a && wj50.m88271j(this.f254661b, wso0Var.f254661b);
    }

    public final int hashCode() {
        return this.f254661b.hashCode() + (Boolean.hashCode(this.f254660a) * 31);
    }
}
