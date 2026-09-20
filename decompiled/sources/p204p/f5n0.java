package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class f5n0 {

    /* JADX INFO: renamed from: a */
    public final String f66117a;

    /* JADX INFO: renamed from: b */
    public final xam f66118b;

    /* JADX INFO: renamed from: c */
    public final int f66119c;

    /* JADX INFO: renamed from: d */
    public final l5n0 f66120d;

    /* JADX INFO: renamed from: e */
    public final boolean f66121e;

    /* JADX INFO: renamed from: f */
    public final p5n0 f66122f;

    /* JADX INFO: renamed from: g */
    public final tdu f66123g;

    public f5n0(e5n0 e5n0Var, d5n0 d5n0Var) {
        tdu pduVar;
        String str = e5n0Var.f56431a;
        xam xamVar = e5n0Var.f56432b;
        int i = e5n0Var.f56434d;
        l5n0 l5n0Var = e5n0Var.f56436f;
        boolean z = d5n0Var != null ? d5n0Var.f45467a : false;
        p5n0 p5n0Var = (d5n0Var == null || (p5n0Var = d5n0Var.f45468b) == null) ? o5n0.f162040a : p5n0Var;
        if (d5n0Var == null) {
            pduVar = new pdu(Integer.valueOf(R.string.settings_disabled_reason_loading), null);
        } else {
            tdu tduVar = d5n0Var.f45469c;
            pduVar = tduVar instanceof pdu ? tduVar : d5n0Var.f45468b instanceof o5n0 ? new pdu(Integer.valueOf(R.string.settings_disabled_reason_failed_to_load), null) : rdu.f198207a;
        }
        this.f66117a = str;
        this.f66118b = xamVar;
        this.f66119c = i;
        this.f66120d = l5n0Var;
        this.f66121e = z;
        this.f66122f = p5n0Var;
        this.f66123g = pduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5n0)) {
            return false;
        }
        f5n0 f5n0Var = (f5n0) obj;
        return this.f66117a.equals(f5n0Var.f66117a) && wj50.m88271j(this.f66118b, f5n0Var.f66118b) && this.f66119c == f5n0Var.f66119c && wj50.m88271j(this.f66120d, f5n0Var.f66120d) && this.f66121e == f5n0Var.f66121e && this.f66122f.equals(f5n0Var.f66122f) && wj50.m88271j(this.f66123g, f5n0Var.f66123g);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f66119c, (this.f66118b.hashCode() + (this.f66117a.hashCode() * 31)) * 31, 31);
        l5n0 l5n0Var = this.f66120d;
        return this.f66123g.hashCode() + ((this.f66122f.hashCode() + s571.m77245d((iM62800g + (l5n0Var == null ? 0 : l5n0Var.hashCode())) * 31, 31, this.f66121e)) * 31);
    }
}
