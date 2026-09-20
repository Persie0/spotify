package p204p;

import com.spotify.mobius.Init;

/* JADX INFO: loaded from: classes10.dex */
public final class u5a0 {

    /* JADX INFO: renamed from: a */
    public final qe70 f226960a;

    /* JADX INFO: renamed from: b */
    public final th00 f226961b;

    /* JADX INFO: renamed from: c */
    public final Init f226962c;

    /* JADX INFO: renamed from: d */
    public final gh00 f226963d;

    public /* synthetic */ u5a0(th00 th00Var, th00 th00Var2, Init init) {
        this(th00Var, th00Var2, init, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5a0)) {
            return false;
        }
        u5a0 u5a0Var = (u5a0) obj;
        return wj50.m88271j(this.f226960a, u5a0Var.f226960a) && wj50.m88271j(this.f226961b, u5a0Var.f226961b) && wj50.m88271j(this.f226962c, u5a0Var.f226962c) && wj50.m88271j(this.f226963d, u5a0Var.f226963d);
    }

    public final int hashCode() {
        int iHashCode = (this.f226962c.hashCode() + ((this.f226961b.hashCode() + (this.f226960a.hashCode() * 31)) * 31)) * 31;
        gh00 gh00Var = this.f226963d;
        return iHashCode + (gh00Var == null ? 0 : gh00Var.hashCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u5a0(th00 th00Var, th00 th00Var2, Init init, gh00 gh00Var) {
        this.f226960a = (qe70) th00Var;
        this.f226961b = th00Var2;
        this.f226962c = init;
        this.f226963d = gh00Var;
    }
}
