package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jzk {

    /* JADX INFO: renamed from: a */
    public final ixk f117743a;

    /* JADX INFO: renamed from: b */
    public final Object f117744b;

    public jzk(ixk ixkVar, boolean z) {
        this.f117743a = ixkVar;
        fr70 fr70VarM72078I = q3d0.m72078I(3, new yfk(this, 12));
        this.f117744b = fr70VarM72078I;
        if (z) {
            fr70VarM72078I.getValue();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jzk) {
            return wj50.m88271j(this.f117743a, ((jzk) obj).f117743a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f117743a.hashCode();
    }
}
