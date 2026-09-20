package p204p;

import com.spotify.showpage.memberbadgepreferenceimpl.proto.SignalData;
import com.spotify.showpage.memberbadgepreferenceimpl.proto.ToggleBadgePayload;

/* JADX INFO: loaded from: classes10.dex */
public final class v8e0 {

    /* JADX INFO: renamed from: a */
    public final wt80 f238483a;

    /* JADX INFO: renamed from: b */
    public final yz80 f238484b;

    /* JADX INFO: renamed from: c */
    public final ub80 f238485c;

    public v8e0(wt80 wt80Var, yz80 yz80Var, ub80 ub80Var) {
        this.f238483a = wt80Var;
        this.f238484b = yz80Var;
        this.f238485c = ub80Var;
    }

    /* JADX INFO: renamed from: a */
    public final fiz m84913a(String str) {
        fbk fbkVar = null;
        vjz vjzVarM68469j0 = oyf1.m68469j0(new prb0(((mu80) this.f238483a).m62851p(new iz80(str)), 18), 3L, new rqf(2, 3, fbkVar));
        int i = 3;
        return mvl0.m62953p(new ner(o8e0.f162793a, new vjz(vjzVarM68469j0, new ga2(i, 29, fbkVar), 2), new bm70(i, 14, fbkVar), 6));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m84914b(String str, ibk ibkVar, boolean z) {
        u8e0 u8e0Var;
        if (ibkVar instanceof u8e0) {
            u8e0Var = (u8e0) ibkVar;
            int i = u8e0Var.f227942c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u8e0Var.f227942c = i - Integer.MIN_VALUE;
            } else {
                u8e0Var = new u8e0(this, ibkVar);
            }
        } else {
            u8e0Var = new u8e0(this, ibkVar);
        }
        Object objM38777P = u8e0Var.f227940a;
        int i2 = u8e0Var.f227942c;
        if (i2 == 0) {
            bga.m29073P(objM38777P);
            t121 t121VarM21300o = SignalData.m21300o();
            t121VarM21300o.m79864m();
            gva byteString = ((SignalData) t121VarM21300o.build()).toByteString();
            px71 px71VarM21302o = ToggleBadgePayload.m21302o();
            px71VarM21302o.m71358m(z);
            pjq pjqVarM89574q = x0h1.m89574q(this.f238485c, null, 0, new q0a0(14, this, str, byteString, ((ToggleBadgePayload) px71VarM21302o.build()).toByteString(), null), 3);
            u8e0Var.f227942c = 1;
            objM38777P = pjqVarM89574q.m38777P(u8e0Var);
            yuk yukVar = yuk.f276404a;
            if (objM38777P == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM38777P);
        }
        return ((s6x0) objM38777P).f206218a;
    }
}
