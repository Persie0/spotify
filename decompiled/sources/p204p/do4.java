package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class do4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f50931a;

    /* JADX INFO: renamed from: b */
    public final bji f50932b;

    /* JADX INFO: renamed from: c */
    public final wg61 f50933c = new wg61(new cn4(this, 20));

    public do4(boolean z, bji bjiVar) {
        this.f50931a = z;
        this.f50932b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m36511a() {
        do4 do4Var = (do4) this.f50933c.getValue();
        return do4Var != null ? do4Var.m36511a() : this.f50931a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a(x09.f256832d, "android-reinventfree-timecappivot-impl", m36511a()));
    }
}
