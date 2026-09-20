package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ut4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f233767a;

    /* JADX INFO: renamed from: b */
    public final bji f233768b;

    /* JADX INFO: renamed from: c */
    public final wg61 f233769c = new wg61(new zr4(this, 21));

    public ut4(boolean z, bji bjiVar) {
        this.f233767a = z;
        this.f233768b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m83922a() {
        ut4 ut4Var = (ut4) this.f233769c.getValue();
        return ut4Var != null ? ut4Var.m83922a() : this.f233767a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("skip_connect_device_check", "android-videoautoplay-videoautoplayimpl", m83922a()));
    }
}
