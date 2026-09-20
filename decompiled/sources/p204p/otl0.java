package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class otl0 extends wtl0 {

    /* JADX INFO: renamed from: a */
    public final zo20 f169109a;

    /* JADX INFO: renamed from: b */
    public final String f169110b;

    public otl0(zo20 zo20Var, String str) {
        this.f169109a = zo20Var;
        this.f169110b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otl0)) {
            return false;
        }
        otl0 otl0Var = (otl0) obj;
        return wj50.m88271j(this.f169109a, otl0Var.f169109a) && wj50.m88271j(this.f169110b, otl0Var.f169110b);
    }

    public final int hashCode() {
        return this.f169110b.hashCode() + (this.f169109a.hashCode() * 31);
    }
}
