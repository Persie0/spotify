package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.ModalTemplate;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class ith0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final doh f105577a;

    /* JADX INFO: renamed from: b */
    public final kth0 f105578b;

    /* JADX INFO: renamed from: c */
    public final wsh0 f105579c;

    /* JADX INFO: renamed from: d */
    public final adl0 f105580d;

    /* JADX INFO: renamed from: e */
    public final kal0 f105581e;

    /* JADX INFO: renamed from: f */
    public final jal0 f105582f;

    /* JADX INFO: renamed from: g */
    public final g7l0 f105583g;

    /* JADX INFO: renamed from: h */
    public final q0f0 f105584h;

    /* JADX INFO: renamed from: i */
    public final uln f105585i;

    /* JADX INFO: renamed from: j */
    public final lrp f105586j;

    /* JADX INFO: renamed from: k */
    public final krp f105587k;

    /* JADX INFO: renamed from: l */
    public final luk f105588l;

    /* JADX INFO: renamed from: m */
    public boolean f105589m = true;

    /* JADX INFO: renamed from: n */
    public final zv41 f105590n;

    /* JADX INFO: renamed from: o */
    public final zv41 f105591o;

    /* JADX INFO: renamed from: p */
    public final pfm0 f105592p;

    public ith0(doh dohVar, kth0 kth0Var, wsh0 wsh0Var, adl0 adl0Var, kal0 kal0Var, jal0 jal0Var, g7l0 g7l0Var, q0f0 q0f0Var, uln ulnVar, lrp lrpVar, krp krpVar, luk lukVar) {
        cbm0 cbm0VarM90848o2;
        this.f105577a = dohVar;
        this.f105578b = kth0Var;
        this.f105579c = wsh0Var;
        this.f105580d = adl0Var;
        this.f105581e = kal0Var;
        this.f105582f = jal0Var;
        this.f105583g = g7l0Var;
        this.f105584h = q0f0Var;
        this.f105585i = ulnVar;
        this.f105586j = lrpVar;
        this.f105587k = krpVar;
        this.f105588l = lukVar;
        Boolean bool = Boolean.FALSE;
        this.f105590n = jag1.m52819d(bool);
        this.f105591o = jag1.m52819d(bool);
        if (kth0Var.m57319c().getMessageData().getFormat().getTemplate() instanceof ModalTemplate.JitModal) {
            AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
            cbm0VarM90848o2 = xgg1.m90842n2();
        } else {
            AtomicReferenceArray atomicReferenceArray2 = cbm0.f36163e;
            cbm0VarM90848o2 = xgg1.m90848o2();
        }
        this.f105592p = new pfm0(new qfm0[]{new q040(cbm0VarM90848o2, xoc1.f263920K1, null), new sw91(14, true, false, false), new e6m0(true)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f105592p;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f105577a.m36532a(rkk.m75763o(new hth0(this), true, 600846008));
    }
}
