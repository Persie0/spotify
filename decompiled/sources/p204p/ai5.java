package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ai5 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f15884a;

    /* JADX INFO: renamed from: b */
    public final boolean f15885b;

    /* JADX INFO: renamed from: c */
    public final bji f15886c;

    /* JADX INFO: renamed from: d */
    public final wg61 f15887d = new wg61(new uu4(this, 26));

    public ai5(boolean z, boolean z2, bji bjiVar) {
        this.f15884a = z;
        this.f15885b = z2;
        this.f15886c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26057a() {
        ai5 ai5Var = (ai5) this.f15887d.getValue();
        return ai5Var != null ? ai5Var.m26057a() : this.f15884a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m26058b() {
        ai5 ai5Var = (ai5) this.f15887d.getValue();
        return ai5Var != null ? ai5Var.m26058b() : this.f15885b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("material_you_enabled", "apps-music-features-widget", m26057a()), new k8a("promote_new_widget", "apps-music-features-widget", m26058b()));
    }
}
