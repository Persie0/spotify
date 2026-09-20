package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class t730 {

    /* JADX INFO: renamed from: a */
    public final s730 f217667a;

    /* JADX INFO: renamed from: b */
    public final r730 f217668b;

    public t730(s730 s730Var, r730 r730Var) {
        this.f217667a = s730Var;
        this.f217668b = r730Var;
    }

    /* JADX INFO: renamed from: a */
    public static t730 m80177a(t730 t730Var, s730 s730Var, r730 r730Var, int i) {
        if ((i & 1) != 0) {
            s730Var = t730Var.f217667a;
        }
        if ((i & 2) != 0) {
            r730Var = t730Var.f217668b;
        }
        t730Var.getClass();
        return new t730(s730Var, r730Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t730)) {
            return false;
        }
        t730 t730Var = (t730) obj;
        return wj50.m88271j(this.f217667a, t730Var.f217667a) && wj50.m88271j(this.f217668b, t730Var.f217668b);
    }

    public final int hashCode() {
        s730 s730Var = this.f217667a;
        return this.f217668b.hashCode() + ((s730Var == null ? 0 : s730Var.hashCode()) * 31);
    }

    public /* synthetic */ t730(s730 s730Var, r730 r730Var, int i) {
        this((i & 1) != 0 ? null : s730Var, (i & 2) != 0 ? n730.f151064a : r730Var);
    }
}
