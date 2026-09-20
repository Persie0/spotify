package p204p;

import com.google.protobuf.AbstractC0269h;
import com.spotify.contexts.Sdk;

/* JADX INFO: loaded from: classes.dex */
public final class ooy0 implements s4x {

    /* JADX INFO: renamed from: a */
    public final hke f167716a;

    public ooy0(hke hkeVar) {
        this.f167716a = hkeVar;
    }

    @Override // p204p.s4x
    /* JADX INFO: renamed from: a */
    public final String mo29679a() {
        return "context_sdk";
    }

    @Override // p204p.s4x
    public final AbstractC0269h getData() {
        ooi0 ooi0Var = (ooi0) ((rpi0) this.f167716a.f92426b).get();
        StringBuilder sb = new StringBuilder("1.1.1");
        if (!ooi0Var.f167632b) {
            sb.append("-essopt");
        }
        Integer num = ooi0Var.f167631a;
        if (ooi0.m67507b(num) != null) {
            sb.append("-sendinterval" + ooi0.m67507b(num) + ".0s");
        }
        sb.append("-batchpayload");
        sb.append(ooi0Var.f167641k / 1000);
        sb.append("k-batchsize");
        sb.append(ooi0Var.f167640j);
        if (ooi0Var.f167633c) {
            sb.append("-bgsend");
        }
        if (ooi0Var.f167634d) {
            sb.append("-bckgsendonstop");
        }
        if (ooi0Var.f167635e) {
            sb.append("-sendonbcd");
        }
        if (ooi0Var.m67508c()) {
            sb.append("-heartbeat" + ooi0Var.f167638h + "/" + ooi0Var.f167639i);
        }
        moy0 moy0VarM8025p = Sdk.m8025p();
        moy0VarM8025p.m62425q(sb.toString());
        moy0VarM8025p.m62424m();
        return moy0VarM8025p.build();
    }
}
