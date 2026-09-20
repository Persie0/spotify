package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wsl0 extends ktl0 {

    /* JADX INFO: renamed from: a */
    public final zo20 f254650a;

    /* JADX INFO: renamed from: b */
    public final String f254651b;

    public wsl0(zo20 zo20Var, String str) {
        this.f254650a = zo20Var;
        this.f254651b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsl0)) {
            return false;
        }
        wsl0 wsl0Var = (wsl0) obj;
        return wj50.m88271j(this.f254650a, wsl0Var.f254650a) && wj50.m88271j(this.f254651b, wsl0Var.f254651b);
    }

    public final int hashCode() {
        return this.f254651b.hashCode() + (this.f254650a.hashCode() * 31);
    }
}
