package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lu3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f136962a;

    /* JADX INFO: renamed from: b */
    public final bji f136963b;

    /* JADX INFO: renamed from: c */
    public final wg61 f136964c = new wg61(new ju3(this, 1));

    public lu3(boolean z, bji bjiVar) {
        this.f136962a = z;
        this.f136963b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m59926a() {
        lu3 lu3Var = (lu3) this.f136964c.getValue();
        return lu3Var != null ? lu3Var.m59926a() : this.f136962a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("clear_stream_slot_on_sponsorship_update", "android-adsdisplay-sponsorshipimpl", m59926a()));
    }
}
