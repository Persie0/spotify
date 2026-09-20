package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class s260 extends v260 {

    /* JADX INFO: renamed from: a */
    public final z260 f204903a;

    /* JADX INFO: renamed from: b */
    public final q260 f204904b;

    /* JADX INFO: renamed from: c */
    public final m260 f204905c;

    /* JADX INFO: renamed from: d */
    public final by50 f204906d;

    /* JADX INFO: renamed from: e */
    public final i260 f204907e;

    public s260(z260 z260Var, q260 q260Var, m260 m260Var, by50 by50Var, i260 i260Var) {
        this.f204903a = z260Var;
        this.f204904b = q260Var;
        this.f204905c = m260Var;
        this.f204906d = by50Var;
        this.f204907e = i260Var;
    }

    @Override // p204p.v260
    /* JADX INFO: renamed from: a */
    public final by50 mo77039a() {
        return this.f204906d;
    }

    @Override // p204p.v260
    /* JADX INFO: renamed from: b */
    public final m260 mo77040b() {
        return this.f204905c;
    }

    @Override // p204p.v260
    /* JADX INFO: renamed from: c */
    public final q260 mo77041c() {
        return this.f204904b;
    }

    @Override // p204p.v260
    /* JADX INFO: renamed from: d */
    public final boolean mo77042d() {
        return true;
    }

    @Override // p204p.v260
    /* JADX INFO: renamed from: e */
    public final a360 mo77043e() {
        return this.f204903a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s260)) {
            return false;
        }
        s260 s260Var = (s260) obj;
        return this.f204903a.equals(s260Var.f204903a) && this.f204904b.equals(s260Var.f204904b) && wj50.m88271j(this.f204905c, s260Var.f204905c) && wj50.m88271j(this.f204906d, s260Var.f204906d) && wj50.m88271j(this.f204907e, s260Var.f204907e);
    }

    public final int hashCode() {
        int iHashCode = (this.f204904b.hashCode() + (Integer.hashCode(R.string.jam_manage_participants_roles_sheet_your_jam_title) * 31)) * 31;
        m260 m260Var = this.f204905c;
        int iHashCode2 = (this.f204906d.hashCode() + s571.m77245d((iHashCode + (m260Var == null ? 0 : m260Var.hashCode())) * 31, 31, true)) * 31;
        i260 i260Var = this.f204907e;
        return iHashCode2 + (i260Var != null ? i260Var.hashCode() : 0);
    }
}
