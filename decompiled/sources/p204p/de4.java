package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class de4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f47958a;

    /* JADX INFO: renamed from: b */
    public final boolean f47959b;

    /* JADX INFO: renamed from: c */
    public final bji f47960c;

    /* JADX INFO: renamed from: d */
    public final wg61 f47961d;

    public de4(boolean z, boolean z2, bji bjiVar) {
        this.f47958a = z;
        this.f47959b = z2;
        this.f47960c = bjiVar;
        this.f47961d = new wg61(new dd4(this, 22));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m35761a() {
        de4 de4Var = (de4) this.f47961d.getValue();
        return de4Var != null ? de4Var.m35761a() : this.f47958a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m35762b() {
        de4 de4Var = (de4) this.f47961d.getValue();
        return de4Var != null ? de4Var.m35762b() : this.f47959b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_filter_chips_chip_bar_action", "android-list-ux-platform-consumers-listenlater-shared", m35761a()), new k8a("generic_items_count_enabled", "android-list-ux-platform-consumers-listenlater-shared", m35762b()));
    }

    public de4(bji bjiVar) {
        this(false, false, bjiVar);
    }
}
