package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eu3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f62861a;

    /* JADX INFO: renamed from: b */
    public final boolean f62862b;

    /* JADX INFO: renamed from: c */
    public final bji f62863c;

    /* JADX INFO: renamed from: d */
    public final wg61 f62864d = new wg61(new w62(this, 26));

    public eu3(boolean z, boolean z2, bji bjiVar) {
        this.f62861a = z;
        this.f62862b = z2;
        this.f62863c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m40018a() {
        eu3 eu3Var = (eu3) this.f62864d.getValue();
        return eu3Var != null ? eu3Var.m40018a() : this.f62861a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m40019b() {
        eu3 eu3Var = (eu3) this.f62864d.getValue();
        return eu3Var != null ? eu3Var.m40019b() : this.f62862b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("clear_preroll_on_all_navigations", "android-adsdisplay-ads", m40018a()), new k8a("enable_out_of_focus_when_in_picture_in_picture_mode", "android-adsdisplay-ads", m40019b()));
    }
}
