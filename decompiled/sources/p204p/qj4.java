package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qj4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f189149a;

    /* JADX INFO: renamed from: b */
    public final bji f189150b;

    /* JADX INFO: renamed from: c */
    public final wg61 f189151c = new wg61(new si4(this, 21));

    public qj4(boolean z, bji bjiVar) {
        this.f189149a = z;
        this.f189150b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72889a() {
        qj4 qj4Var = (qj4) this.f189151c.getValue();
        return qj4Var != null ? qj4Var.m72889a() : this.f189149a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_card_in_npv", "android-npv-martini-card", m72889a()));
    }
}
