package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class h06 {

    /* JADX INFO: renamed from: a */
    public final uo31 f86157a;

    public h06(uo31 uo31Var) {
        this.f86157a = uo31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h06) && wj50.m88271j(this.f86157a, ((h06) obj).f86157a);
    }

    public final int hashCode() {
        uo31 uo31Var = this.f86157a;
        if (uo31Var == null) {
            return 0;
        }
        return Boolean.hashCode(uo31Var.f232323a);
    }
}
