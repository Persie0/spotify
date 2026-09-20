package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ev4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f63135a;

    /* JADX INFO: renamed from: b */
    public final int f63136b;

    /* JADX INFO: renamed from: c */
    public final bji f63137c;

    /* JADX INFO: renamed from: d */
    public final wg61 f63138d = new wg61(new uu4(this, 6));

    public ev4(int i, bji bjiVar, boolean z) {
        this.f63135a = z;
        this.f63136b = i;
        this.f63137c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m40088a() {
        ev4 ev4Var = (ev4) this.f63138d.getValue();
        return ev4Var != null ? ev4Var.m40088a() : this.f63135a;
    }

    /* JADX INFO: renamed from: b */
    public final int m40089b() {
        ev4 ev4Var = (ev4) this.f63138d.getValue();
        return ev4Var != null ? ev4Var.m40089b() : this.f63136b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_native_prompt", "android-widget-widgetpromo", m40088a()), new k8a("native_prompt_frequency_days", "android-widget-widgetpromo", m40089b(), 1, 365));
    }
}
