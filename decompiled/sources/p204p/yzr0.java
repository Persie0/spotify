package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yzr0 extends zzr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f277883a;

    /* JADX INFO: renamed from: b */
    public final String f277884b;

    public yzr0(boolean z, String str) {
        this.f277883a = z;
        this.f277884b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzr0)) {
            return false;
        }
        yzr0 yzr0Var = (yzr0) obj;
        return this.f277883a == yzr0Var.f277883a && wj50.m88271j(this.f277884b, yzr0Var.f277884b);
    }

    public final int hashCode() {
        return this.f277884b.hashCode() + (Boolean.hashCode(this.f277883a) * 31);
    }
}
