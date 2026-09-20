package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class cpe implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ p4p f40545a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s611 f40546b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jq9 f40547c;

    public cpe(xre xreVar, p4p p4pVar, s611 s611Var, jq9 jq9Var) {
        this.f40545a = p4pVar;
        this.f40546b = s611Var;
        this.f40547c = jq9Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        bpe bpeVar;
        if (ibkVar instanceof bpe) {
            bpeVar = (bpe) ibkVar;
            int i = bpeVar.f29420b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bpeVar.f29420b = i - Integer.MIN_VALUE;
            } else {
                bpeVar = new bpe(this, ibkVar);
            }
        } else {
            bpeVar = new bpe(this, ibkVar);
        }
        Object obj2 = bpeVar.f29419a;
        int i2 = bpeVar.f29420b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            hpe hpeVar = ((lpe) obj).f135745c;
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - hpeVar.f93761d);
            this.f40545a.m69153c(hpeVar.f93762e, hpeVar.f93760c, iCurrentTimeMillis, hpeVar.f93758a, false, 3, hpeVar.f93763f, hpeVar.f93764g);
            bpeVar.f29420b = 1;
            Object objM77313a = this.f40546b.m77313a(bpeVar);
            yuk yukVar = yuk.f276404a;
            if (objM77313a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        this.f40547c.invoke();
        return w2a1.f247311a;
    }
}
