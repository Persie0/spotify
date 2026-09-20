package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m6c0 extends fpg1 {

    /* JADX INFO: renamed from: c */
    public final String f140462c;

    /* JADX INFO: renamed from: d */
    public final z5c0 f140463d;

    /* JADX INFO: renamed from: e */
    public final boolean f140464e;

    public m6c0(String str, z5c0 z5c0Var, boolean z) {
        this.f140462c = str;
        this.f140463d = z5c0Var;
        this.f140464e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6c0)) {
            return false;
        }
        m6c0 m6c0Var = (m6c0) obj;
        return wj50.m88271j(this.f140462c, m6c0Var.f140462c) && this.f140463d == m6c0Var.f140463d && this.f140464e == m6c0Var.f140464e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140464e) + ((this.f140463d.hashCode() + (this.f140462c.hashCode() * 31)) * 31);
    }
}
