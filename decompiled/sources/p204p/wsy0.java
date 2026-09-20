package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wsy0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final d850 f254783a;

    public wsy0(d850 d850Var) {
        this.f254783a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wsy0) && wj50.m88271j(this.f254783a, ((wsy0) obj).f254783a);
    }

    public final int hashCode() {
        d850 d850Var = this.f254783a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
