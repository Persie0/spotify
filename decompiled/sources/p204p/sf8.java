package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class sf8 implements vf8 {

    /* JADX INFO: renamed from: a */
    public final pf8 f208495a;

    public sf8(pf8 pf8Var) {
        this.f208495a = pf8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sf8) && wj50.m88271j(this.f208495a, ((sf8) obj).f208495a);
    }

    public final int hashCode() {
        return this.f208495a.hashCode();
    }
}
