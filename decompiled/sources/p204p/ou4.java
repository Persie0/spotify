package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ou4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f170164a;

    /* JADX INFO: renamed from: b */
    public final boolean f170165b;

    /* JADX INFO: renamed from: c */
    public final boolean f170166c;

    /* JADX INFO: renamed from: d */
    public final boolean f170167d;

    /* JADX INFO: renamed from: e */
    public final boolean f170168e;

    /* JADX INFO: renamed from: f */
    public final bji f170169f;

    /* JADX INFO: renamed from: g */
    public final wg61 f170170g = new wg61(new zr4(this, 25));

    public ou4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f170164a = z;
        this.f170165b = z2;
        this.f170166c = z3;
        this.f170167d = z4;
        this.f170168e = z5;
        this.f170169f = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m68088a() {
        ou4 ou4Var = (ou4) this.f170170g.getValue();
        return ou4Var != null ? ou4Var.m68088a() : this.f170164a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m68089b() {
        ou4 ou4Var = (ou4) this.f170170g.getValue();
        return ou4Var != null ? ou4Var.m68089b() : this.f170165b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m68090c() {
        ou4 ou4Var = (ou4) this.f170170g.getValue();
        return ou4Var != null ? ou4Var.m68090c() : this.f170166c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m68091d() {
        ou4 ou4Var = (ou4) this.f170170g.getValue();
        return ou4Var != null ? ou4Var.m68091d() : this.f170167d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m68092e() {
        ou4 ou4Var = (ou4) this.f170170g.getValue();
        return ou4Var != null ? ou4Var.m68092e() : this.f170168e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_debug_tools", "android-voting-playlist", m68088a()), new k8a("enable_entrypoint_section", "android-voting-playlist", m68089b()), new k8a("enable_screenshot_detection", "android-voting-playlist", m68090c()), new k8a("enable_share_header_action", "android-voting-playlist", m68091d()), new k8a("enable_watchfeed_header_action", "android-voting-playlist", m68092e()));
    }
}
