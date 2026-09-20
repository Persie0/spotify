package p204p;

import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class of30 implements wt31 {

    /* JADX INFO: renamed from: a */
    public final ph30 f164628a;

    /* JADX INFO: renamed from: b */
    public final x400 f164629b;

    /* JADX INFO: renamed from: c */
    public boolean f164630c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tf30 f164631d;

    public of30(tf30 tf30Var, ph30 ph30Var) {
        this.f164631d = tf30Var;
        this.f164628a = ph30Var;
        this.f164629b = new x400(((vuu0) tf30Var.f219841c.f197472c).f245079a.mo27349m());
    }

    /* JADX INFO: renamed from: a */
    public final void m66811a(sn20 sn20Var) {
        z4l0 z4l0Var;
        xzk xzkVar;
        tf30 tf30Var = this.f164631d;
        int i = tf30Var.f219842d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + tf30Var.f219842d);
        }
        x400 x400Var = this.f164629b;
        au71 au71Var = x400Var.f257923e;
        x400Var.f257923e = au71.f19881d;
        au71Var.mo27161a();
        au71Var.mo27162b();
        tf30Var.f219842d = 6;
        if (sn20Var.size() <= 0 || (z4l0Var = tf30Var.f219839a) == null || (xzkVar = z4l0Var.f279279j) == null) {
            return;
        }
        int i2 = ch30.f37887a;
        if (xzkVar == xzk.f267679M0) {
            return;
        }
        Pattern pattern = vpk.f243707k;
        emk.m39426B(this.f164628a, sn20Var).isEmpty();
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: g1 */
    public long mo27348g1(npa npaVar, long j) throws IOException {
        tf30 tf30Var = this.f164631d;
        try {
            return ((vuu0) tf30Var.f219841c.f197472c).mo27348g1(npaVar, j);
        } catch (IOException e) {
            tf30Var.f219840b.mo27261b();
            m66811a(tf30.f219838f);
            throw e;
        }
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: m */
    public final au71 mo27349m() {
        return this.f164629b;
    }
}
