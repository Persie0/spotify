package p204p;

import com.spotify.player.model.Restrictions;

/* JADX INFO: loaded from: classes9.dex */
public final class yvv0 {

    /* JADX INFO: renamed from: a */
    public final String f276780a;

    /* JADX INFO: renamed from: b */
    public final Restrictions f276781b;

    /* JADX INFO: renamed from: c */
    public final am81 f276782c;

    /* JADX INFO: renamed from: d */
    public final icc0 f276783d;

    public yvv0(String str, Restrictions restrictions, am81 am81Var, icc0 icc0Var) {
        this.f276780a = str;
        this.f276781b = restrictions;
        this.f276782c = am81Var;
        this.f276783d = icc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvv0)) {
            return false;
        }
        yvv0 yvv0Var = (yvv0) obj;
        return wj50.m88271j(this.f276780a, yvv0Var.f276780a) && wj50.m88271j(this.f276781b, yvv0Var.f276781b) && wj50.m88271j(this.f276782c, yvv0Var.f276782c) && wj50.m88271j(this.f276783d, yvv0Var.f276783d);
    }

    public final int hashCode() {
        return this.f276783d.hashCode() + ((this.f276782c.hashCode() + ((this.f276781b.hashCode() + (this.f276780a.hashCode() * 31)) * 31)) * 31);
    }
}
