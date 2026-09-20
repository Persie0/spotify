package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dv4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f53357a;

    /* JADX INFO: renamed from: b */
    public final bji f53358b;

    /* JADX INFO: renamed from: c */
    public final wg61 f53359c;

    public dv4(boolean z, bji bjiVar) {
        this.f53357a = z;
        this.f53358b = bjiVar;
        this.f53359c = new wg61(new uu4(this, 5));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m37043a() {
        dv4 dv4Var = (dv4) this.f53359c.getValue();
        return dv4Var != null ? dv4Var.m37043a() : this.f53357a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("show_animated_educational_message", "android-widget-educationalmessage", m37043a()));
    }

    public dv4(bji bjiVar) {
        this(false, bjiVar);
    }
}
