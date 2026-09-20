package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class js4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f115387a;

    /* JADX INFO: renamed from: b */
    public final boolean f115388b;

    /* JADX INFO: renamed from: c */
    public final boolean f115389c;

    /* JADX INFO: renamed from: d */
    public final boolean f115390d;

    /* JADX INFO: renamed from: e */
    public final bji f115391e;

    /* JADX INFO: renamed from: f */
    public final wg61 f115392f;

    public js4(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f115387a = z;
        this.f115388b = z2;
        this.f115389c = z3;
        this.f115390d = z4;
        this.f115391e = bjiVar;
        this.f115392f = new wg61(new zr4(this, 8));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m54208a() {
        js4 js4Var = (js4) this.f115392f.getValue();
        return js4Var != null ? js4Var.m54208a() : this.f115387a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m54209b() {
        js4 js4Var = (js4) this.f115392f.getValue();
        return js4Var != null ? js4Var.m54209b() : this.f115388b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m54210c() {
        js4 js4Var = (js4) this.f115392f.getValue();
        return js4Var != null ? js4Var.m54210c() : this.f115389c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m54211d() {
        js4 js4Var = (js4) this.f115392f.getValue();
        return js4Var != null ? js4Var.m54211d() : this.f115390d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_read_along", "android-transcript-scroll-card", m54208a()), new k8a("enable_transcript_translation", "android-transcript-scroll-card", m54209b()), new k8a("exclude_companion_content", "android-transcript-scroll-card", m54210c()), new k8a("use_compose_transcript_list", "android-transcript-scroll-card", m54211d()));
    }

    public js4(bji bjiVar) {
        this(false, false, false, false, bjiVar);
    }
}
