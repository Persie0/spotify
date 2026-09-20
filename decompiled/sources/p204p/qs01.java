package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class qs01 extends ijh {

    /* JADX INFO: renamed from: T1 */
    public final pvw0 f191940T1;

    /* JADX INFO: renamed from: U1 */
    public kv91 f191941U1;

    /* JADX INFO: renamed from: V1 */
    public qe70 f191942V1 = n701.f151003N0;

    /* JADX INFO: renamed from: W1 */
    public geg0 f191943W1;

    public qs01(pvw0 pvw0Var) {
        this.f191940T1 = pvw0Var;
    }

    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: E0 */
    public final void mo875E0(Context context) {
        this.f191940T1.mo24367f(this);
        super.mo875E0(context);
    }

    @Override // p204p.my8, p204p.i500
    /* JADX INFO: renamed from: R0 */
    public final void mo881R0(View view, Bundle bundle) {
        super.mo881R0(view, bundle);
        kv91 kv91Var = this.f191941U1;
        if (kv91Var == null) {
            wj50.m88260d0("ubiLogger");
            throw null;
        }
        geg0 geg0Var = this.f191943W1;
        if (geg0Var == null) {
            wj50.m88260d0("mobileChatEventFactory");
            throw null;
        }
        yt91 yt91VarM96903c = geg0Var.f79118a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("share_history_sheet", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = zt91VarM94607a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = geg0Var.f79119b;
        kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
    }

    @Override // p204p.my8
    /* JADX INFO: renamed from: t1 */
    public final void mo38127t1(srk srkVar) {
        srkVar.m87626g().m1578L(3);
    }

    @Override // p204p.ijh
    /* JADX INFO: renamed from: w1 */
    public final void mo38128w1(fjh fjhVar, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-653424005);
        int i2 = (xq00Var.m91770i(this) ? 32 : 16) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 17) != 16)) {
            boolean zM91770i = xq00Var.m91770i(this);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new mg01(this, 8);
                xq00Var.m91793t0(objM91750T);
            }
            stg1.m79271l(0, (eh00) objM91750T, xq00Var, null);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gex0(this, fjhVar, i, 22);
        }
    }

    @Override // p204p.my8
    /* JADX INFO: renamed from: u1 */
    public final void mo41980u1() {
    }
}
