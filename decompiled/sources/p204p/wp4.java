package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wp4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f253666a;

    /* JADX INFO: renamed from: b */
    public final boolean f253667b;

    /* JADX INFO: renamed from: c */
    public final boolean f253668c;

    /* JADX INFO: renamed from: d */
    public final boolean f253669d;

    /* JADX INFO: renamed from: e */
    public final bji f253670e;

    /* JADX INFO: renamed from: f */
    public final wg61 f253671f;

    public wp4(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f253666a = z;
        this.f253667b = z2;
        this.f253668c = z3;
        this.f253669d = z4;
        this.f253670e = bjiVar;
        this.f253671f = new wg61(new kp4(this, 8));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m88676a() {
        wp4 wp4Var = (wp4) this.f253671f.getValue();
        return wp4Var != null ? wp4Var.m88676a() : this.f253666a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m88677b() {
        wp4 wp4Var = (wp4) this.f253671f.getValue();
        return wp4Var != null ? wp4Var.m88677b() : this.f253667b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m88678c() {
        wp4 wp4Var = (wp4) this.f253671f.getValue();
        return wp4Var != null ? wp4Var.m88678c() : this.f253668c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m88679d() {
        wp4 wp4Var = (wp4) this.f253671f.getValue();
        return wp4Var != null ? wp4Var.m88679d() : this.f253669d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_highlight_sharing", "android-system-highlightsstats", m88676a()), new k8a("enable_new_summary_page", "android-system-highlightsstats", m88677b()), new k8a("enable_user_timeline_page", "android-system-highlightsstats", m88678c()), new k8a("enable_v2_endpoint", "android-system-highlightsstats", m88679d()));
    }

    public wp4(bji bjiVar) {
        this(false, false, false, false, bjiVar);
    }
}
