package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wt3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f254813a;

    /* JADX INFO: renamed from: b */
    public final bji f254814b;

    /* JADX INFO: renamed from: c */
    public final wg61 f254815c = new wg61(new w62(this, 23));

    public wt3(int i, bji bjiVar) {
        this.f254813a = i;
        this.f254814b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m88903a() {
        wt3 wt3Var = (wt3) this.f254815c.getValue();
        return wt3Var != null ? wt3Var.m88903a() : this.f254813a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("max_accounts", "android-accountswitching-switcherstateimpl", m88903a(), 0, 200));
    }
}
