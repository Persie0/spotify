package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class gh4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f79793a;

    /* JADX INFO: renamed from: b */
    public final boolean f79794b;

    /* JADX INFO: renamed from: c */
    public final bji f79795c;

    /* JADX INFO: renamed from: d */
    public final wg61 f79796d = new wg61(new bh4(this, 3));

    public gh4(boolean z, boolean z2, bji bjiVar) {
        this.f79793a = z;
        this.f79794b = z2;
        this.f79795c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m44712a() {
        gh4 gh4Var = (gh4) this.f79796d.getValue();
        return gh4Var != null ? gh4Var.m44712a() : this.f79793a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m44713b() {
        gh4 gh4Var = (gh4) this.f79796d.getValue();
        return gh4Var != null ? gh4Var.m44713b() : this.f79794b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("membership_upsell_enabled", "android-membership-upsell", m44712a()), new k8a("show_membership_badge_dialog_enabled", "android-membership-upsell", m44713b()));
    }
}
