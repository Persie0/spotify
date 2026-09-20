package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bs4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f30230a;

    /* JADX INFO: renamed from: b */
    public final bji f30231b;

    /* JADX INFO: renamed from: c */
    public final wg61 f30232c = new wg61(new zr4(this, 1));

    public bs4(boolean z, bji bjiVar) {
        this.f30230a = z;
        this.f30231b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m30350a() {
        bs4 bs4Var = (bs4) this.f30232c.getValue();
        return bs4Var != null ? bs4Var.m30350a() : this.f30230a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_visible_area_calculation", "android-tome-timekeeper-pageinstrumentation", m30350a()));
    }
}
