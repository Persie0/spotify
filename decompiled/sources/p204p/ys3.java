package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ys3 extends zs3 {

    /* JADX INFO: renamed from: a */
    public final String f275666a;

    /* JADX INFO: renamed from: b */
    public final un20 f275667b;

    public ys3(String str, un20 un20Var) {
        this.f275666a = str;
        this.f275667b = un20Var;
    }

    @Override // p204p.zs3
    /* JADX INFO: renamed from: a */
    public final un20 mo91961a() {
        return this.f275667b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys3)) {
            return false;
        }
        ys3 ys3Var = (ys3) obj;
        return wj50.m88271j(this.f275666a, ys3Var.f275666a) && wj50.m88271j(this.f275667b, ys3Var.f275667b);
    }

    public final int hashCode() {
        int iHashCode = this.f275666a.hashCode() * 31;
        un20 un20Var = this.f275667b;
        return iHashCode + (un20Var == null ? 0 : un20Var.hashCode());
    }
}
