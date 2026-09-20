package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qs4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f191982a;

    /* JADX INFO: renamed from: b */
    public final bji f191983b;

    /* JADX INFO: renamed from: c */
    public final wg61 f191984c = new wg61(new zr4(this, 15));

    public qs4(boolean z, bji bjiVar) {
        this.f191982a = z;
        this.f191983b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m73675a() {
        qs4 qs4Var = (qs4) this.f191984c.getValue();
        return qs4Var != null ? qs4Var.m73675a() : this.f191982a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_page_presentation_tracking", "android-ubi-page-presentation", m73675a()));
    }
}
