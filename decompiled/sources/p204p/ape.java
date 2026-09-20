package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class ape implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s611 f17919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qsb1 f17920b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p4p f17921c;

    public ape(s611 s611Var, qsb1 qsb1Var, xre xreVar, p4p p4pVar) {
        this.f17919a = s611Var;
        this.f17920b = qsb1Var;
        this.f17921c = p4pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        zoe zoeVar;
        if (ibkVar instanceof zoe) {
            zoeVar = (zoe) ibkVar;
            int i = zoeVar.f284773b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zoeVar.f284773b = i - Integer.MIN_VALUE;
            } else {
                zoeVar = new zoe(this, ibkVar);
            }
        } else {
            zoeVar = new zoe(this, ibkVar);
        }
        Object obj2 = zoeVar.f284772a;
        int i2 = zoeVar.f284773b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            ipe ipeVar = (ipe) obj;
            hpe hpeVar = ipeVar.f104480d;
            if (hpeVar != null) {
                String str = hpeVar.f93760c;
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() - hpeVar.f93761d);
                boolean z = ipeVar.f104479c;
                p4p p4pVar = this.f17921c;
                if (z) {
                    p4pVar.m69153c(hpeVar.f93762e, str, iCurrentTimeMillis, hpeVar.f93758a, false, 2, hpeVar.f93763f, hpeVar.f93764g);
                } else {
                    p4pVar.m69153c(hpeVar.f93762e, str, iCurrentTimeMillis, hpeVar.f93758a, false, 4, hpeVar.f93763f, hpeVar.f93764g);
                }
            }
            zoeVar.f284773b = 1;
            Object objM77313a = this.f17919a.m77313a(zoeVar);
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
        this.f17920b.invoke();
        return w2a1.f247311a;
    }
}
