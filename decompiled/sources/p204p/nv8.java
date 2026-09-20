package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes8.dex */
public final class nv8 implements qte0 {

    /* JADX INFO: renamed from: a */
    public final fv8 f158827a;

    /* JADX INFO: renamed from: b */
    public final hjn f158828b;

    /* JADX INFO: renamed from: c */
    public final e940 f158829c;

    /* JADX INFO: renamed from: d */
    public final adl0 f158830d;

    /* JADX INFO: renamed from: e */
    public final jal0 f158831e;

    /* JADX INFO: renamed from: f */
    public final g7l0 f158832f;

    /* JADX INFO: renamed from: g */
    public final luk f158833g;

    /* JADX INFO: renamed from: h */
    public pqm0 f158834h;

    /* JADX INFO: renamed from: i */
    public fw8 f158835i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f158836j;

    /* JADX INFO: renamed from: k */
    public final zv41 f158837k;

    /* JADX INFO: renamed from: l */
    public final zv41 f158838l;

    public nv8(fv8 fv8Var, luk lukVar, hjn hjnVar, m500 m500Var, e940 e940Var, g7l0 g7l0Var, jal0 jal0Var, adl0 adl0Var) {
        this.f158827a = fv8Var;
        this.f158828b = hjnVar;
        this.f158829c = e940Var;
        this.f158830d = adl0Var;
        this.f158831e = jal0Var;
        this.f158832f = g7l0Var;
        this.f158833g = lukVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f158836j = linkedHashSet;
        Boolean bool = Boolean.FALSE;
        this.f158837k = jag1.m52819d(bool);
        this.f158838l = jag1.m52819d(bool);
        linkedHashSet.add(x0h1.m89578u(n5h1.m63737m(m500Var), null, 0, new cg5(this, (fbk) null, 8), 3));
    }

    /* JADX INFO: renamed from: c */
    public static final void m65728c(nv8 nv8Var, fyf fyfVar, fxh0 fxh0Var, String str, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-794569933);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(fyfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(nv8Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            qqg1.m73532b(vm6.f242710a.mo30068a(nv8Var.f158829c), rkk.m75772x(1782777459, new gv8(str, fyfVar, fxh0Var, 0), xq00Var), xq00Var, 56);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1816ej(nv8Var, fyfVar, fxh0Var, str, false, i, 27);
        }
    }

    @Override // p204p.qte0
    /* JADX INFO: renamed from: a */
    public final void mo27112a(MessageResponseToken messageResponseToken, gh00 gh00Var) {
        this.f158834h = new pqm0(messageResponseToken, gh00Var.invoke(messageResponseToken));
    }

    @Override // p204p.qte0
    /* JADX INFO: renamed from: b */
    public final void mo27113b(eh00 eh00Var) {
        vre0 vre0Var;
        MessageResponseToken messageResponseToken;
        MessageRequest messageRequest;
        ase0 orchestrationMetadata;
        MessageResponseToken messageResponseToken2;
        MessageRequest messageRequest2;
        ase0 orchestrationMetadata2;
        if (this.f158835i == null) {
            ot8 ot8Var = new ot8(new kv8(this));
            pqm0 pqm0Var = this.f158834h;
            fbk fbkVar = null;
            zre0 zre0Var = (pqm0Var == null || (messageResponseToken2 = (MessageResponseToken) pqm0Var.f180350a) == null || (messageRequest2 = messageResponseToken2.getMessageRequest()) == null || (orchestrationMetadata2 = messageRequest2.getOrchestrationMetadata()) == null) ? null : orchestrationMetadata2.f19404a;
            boolean z = zre0Var instanceof wre0 ? ((wre0) zre0Var).f254346a : false;
            pqm0 pqm0Var2 = this.f158834h;
            if (pqm0Var2 == null || (messageResponseToken = (MessageResponseToken) pqm0Var2.f180350a) == null || (messageRequest = messageResponseToken.getMessageRequest()) == null || (orchestrationMetadata = messageRequest.getOrchestrationMetadata()) == null || (vre0Var = orchestrationMetadata.f19405b) == null) {
                vre0Var = ure0.f233341a;
            }
            fw8 fw8VarM42774b = this.f158827a.m42774b(ot8Var, z, vre0Var);
            di41 di41VarM89578u = x0h1.m89578u(kk40.m56661c(opo.m67570t(qlg1.m73202g(), xsr.f265652b)), null, 0, new gw8(fw8VarM42774b, new lv8(this, fbkVar, 0), fbkVar, 0), 3);
            LinkedHashSet linkedHashSet = this.f158836j;
            linkedHashSet.add(di41VarM89578u);
            uf60 uf60VarM73202g = qlg1.m73202g();
            luk lukVar = this.f158833g;
            linkedHashSet.add(x0h1.m89578u(kk40.m56661c(opo.m67570t(uf60VarM73202g, lukVar)), null, 0, new jr4(fw8VarM42774b, new mv8(this, null), fbkVar, 28), 3));
            linkedHashSet.add(x0h1.m89578u(kk40.m56661c(opo.m67570t(qlg1.m73202g(), lukVar)), null, 0, new jr4(fw8VarM42774b, new lv8(this, fbkVar, 1), fbkVar, 29), 3));
            this.f158835i = fw8VarM42774b;
        }
    }

    @Override // p204p.qte0
    public final void dismiss() {
        fw8 fw8Var = this.f158835i;
        if (fw8Var != null) {
            fw8Var.m42953a();
        }
        this.f158835i = null;
        Iterator it = this.f158836j.iterator();
        while (it.hasNext()) {
            ((tf60) it.next()).mo26601e(null);
        }
    }
}
