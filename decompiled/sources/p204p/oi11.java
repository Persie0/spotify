package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oi11 extends pi11 {

    /* JADX INFO: renamed from: a */
    public final String f165643a;

    /* JADX INFO: renamed from: b */
    public final un20 f165644b;

    public oi11(String str, un20 un20Var) {
        this.f165643a = str;
        this.f165644b = un20Var;
    }

    @Override // p204p.pi11
    /* JADX INFO: renamed from: a */
    public final un20 mo64550a() {
        return this.f165644b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi11)) {
            return false;
        }
        oi11 oi11Var = (oi11) obj;
        return wj50.m88271j(this.f165643a, oi11Var.f165643a) && wj50.m88271j(this.f165644b, oi11Var.f165644b);
    }

    public final int hashCode() {
        int iHashCode = this.f165643a.hashCode() * 31;
        un20 un20Var = this.f165644b;
        return iHashCode + (un20Var == null ? 0 : un20Var.hashCode());
    }
}
