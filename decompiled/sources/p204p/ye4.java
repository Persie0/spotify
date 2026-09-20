package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ye4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f271915a;

    /* JADX INFO: renamed from: b */
    public final int f271916b;

    /* JADX INFO: renamed from: c */
    public final bji f271917c;

    /* JADX INFO: renamed from: d */
    public final wg61 f271918d = new wg61(new ne4(this, 10));

    public ye4(int i, bji bjiVar, boolean z) {
        this.f271915a = z;
        this.f271916b = i;
        this.f271917c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m93523a() {
        ye4 ye4Var = (ye4) this.f271918d.getValue();
        return ye4Var != null ? ye4Var.m93523a() : this.f271915a;
    }

    /* JADX INFO: renamed from: b */
    public final int m93524b() {
        ye4 ye4Var = (ye4) this.f271918d.getValue();
        return ye4Var != null ? ye4Var.m93524b() : this.f271916b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("use_show_condition_for_sections", "android-list-ux-platform-itemlistcomposerimpl", m93523a()), new k8a("view_port_size", "android-list-ux-platform-itemlistcomposerimpl", m93524b(), 50, 1000));
    }
}
