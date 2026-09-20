package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class oke0 implements pke0 {

    /* JADX INFO: renamed from: a */
    public final String f166319a;

    /* JADX INFO: renamed from: b */
    public final gh00 f166320b;

    public oke0(String str, gh00 gh00Var) {
        this.f166319a = str;
        this.f166320b = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oke0)) {
            return false;
        }
        oke0 oke0Var = (oke0) obj;
        return wj50.m88271j(this.f166319a, oke0Var.f166319a) && wj50.m88271j(this.f166320b, oke0Var.f166320b);
    }

    public final int hashCode() {
        return this.f166320b.hashCode() + (this.f166319a.hashCode() * 31);
    }
}
