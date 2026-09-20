package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class t961 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ b141 f218196a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jz6 f218197b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wx7 f218198c;

    public t961(b141 b141Var, jz6 jz6Var, wx7 wx7Var) {
        this.f218196a = b141Var;
        this.f218197b = jz6Var;
        this.f218198c = wx7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        s961 s961Var;
        if (ibkVar instanceof s961) {
            s961Var = (s961) ibkVar;
            int i = s961Var.f206869b;
            if ((i & Integer.MIN_VALUE) != 0) {
                s961Var.f206869b = i - Integer.MIN_VALUE;
            } else {
                s961Var = new s961(this, ibkVar);
            }
        } else {
            s961Var = new s961(this, ibkVar);
        }
        Object obj2 = s961Var.f206868a;
        int i2 = s961Var.f206869b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            ta61 ta61Var = ((j961) obj).f110111a;
            if (!bkg1.m29702t(ta61Var).isEmpty()) {
                om0.m67311c((om0) this.f218196a.f22212b, qm0.SURVEY_SUBMITTED, ta61Var.f218466a, null, "survey_submit", "brand_survey_submit", bkg1.m29697o(ta61Var).toByteString().m45892u(), null, 68);
            }
            jz6 jz6Var = this.f218197b;
            jz6Var.m54846j(ta61Var);
            jz6Var.m54845i(ta61Var);
            fiz fizVarM62953p = mvl0.m62953p(new nzx0(new jr4(this.f218198c, null, 22)));
            aeq0 aeq0Var = new aeq0(bqz0Var, 23);
            s961Var.f206869b = 1;
            Object objCollect = fizVarM62953p.collect(aeq0Var, s961Var);
            yuk yukVar = yuk.f276404a;
            if (objCollect == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}
