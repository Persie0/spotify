package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class on00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rn00 f167128a;

    public on00(rn00 rn00Var) {
        this.f167128a = rn00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L25;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        nn00 nn00Var;
        Object objM56029l;
        if (ibkVar instanceof nn00) {
            nn00Var = (nn00) ibkVar;
            int i = nn00Var.f156303b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nn00Var.f156303b = i - Integer.MIN_VALUE;
            } else {
                nn00Var = new nn00(this, ibkVar);
            }
        } else {
            nn00Var = new nn00(this, ibkVar);
        }
        Object obj2 = nn00Var.f156302a;
        int i2 = nn00Var.f156303b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = nn00Var.f156305d;
                bga.m29073P(obj2);
                objM56029l = ((s6x0) obj2).f206218a;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        kca kcaVar = this.f167128a.f200678a;
        nn00Var.f156305d = bqz0Var;
        nn00Var.f156303b = 1;
        objM56029l = kcaVar.m56029l(nn00Var);
        if (objM56029l != yukVar) {
        }
        return yukVar;
        Object vm00Var = s6x0.m77348a(objM56029l) == null ? new vm00((List) objM56029l) : um00.f231701a;
        nn00Var.f156305d = null;
        nn00Var.f156303b = 2;
    }
}
