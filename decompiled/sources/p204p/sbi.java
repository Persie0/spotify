package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes9.dex */
public final class sbi implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tbi f207514a;

    public sbi(tbi tbiVar) {
        this.f207514a = tbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        rbi rbiVar;
        bqz0 bqz0Var2;
        abi abiVar;
        String str;
        Object ybiVar;
        if (ibkVar instanceof rbi) {
            rbiVar = (rbi) ibkVar;
            int i = rbiVar.f197605b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rbiVar.f197605b = i - Integer.MIN_VALUE;
            } else {
                rbiVar = new rbi(this, ibkVar);
            }
        } else {
            rbiVar = new rbi(this, ibkVar);
        }
        Object obj2 = rbiVar.f197604a;
        int i2 = rbiVar.f197605b;
        w2a1 w2a1Var = w2a1.f247311a;
        tbi tbiVar = this.f207514a;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    str = rbiVar.f197609f;
                    abiVar = rbiVar.f197608e;
                    bqz0Var2 = rbiVar.f197607d;
                    try {
                        bga.m29073P(obj2);
                    } catch (Exception unused) {
                        ybiVar = new ybi(abiVar.f14118b);
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1Var;
            }
            bga.m29073P(obj2);
            abi abiVar2 = (abi) obj;
            try {
                Set set = dd41.f47702f;
                String strM35721s = r46.m74726U(abiVar2.f14117a).m35721s();
                if (strM35721s == null) {
                    ybiVar = new ybi(abiVar2.f14118b);
                    rbiVar.f197607d = null;
                    rbiVar.f197608e = null;
                    rbiVar.f197609f = null;
                    rbiVar.f197605b = 2;
                    if (bqz0Var.mo30229d(ybiVar, rbiVar) != yukVar) {
                        return w2a1Var;
                    }
                } else {
                    wbi wbiVar = tbiVar.f218861a;
                    rbiVar.f197607d = bqz0Var;
                    rbiVar.f197608e = abiVar2;
                    rbiVar.f197609f = strM35721s;
                    rbiVar.f197605b = 1;
                    if (wbiVar.m87670b(strM35721s, rbiVar) != yukVar) {
                        bqz0Var2 = bqz0Var;
                        abiVar = abiVar2;
                        str = strM35721s;
                    }
                }
            } catch (Exception unused2) {
                bqz0Var2 = bqz0Var;
                abiVar = abiVar2;
                ybiVar = new ybi(abiVar.f14118b);
            }
            return yukVar;
            ((hb11) tbiVar.f218868h.f185926c).mo46962a(w2a1Var);
            ybiVar = new zbi(str, abiVar.f14118b);
            bqz0Var = bqz0Var2;
            rbiVar.f197607d = null;
            rbiVar.f197608e = null;
            rbiVar.f197609f = null;
            rbiVar.f197605b = 2;
            if (bqz0Var.mo30229d(ybiVar, rbiVar) != yukVar) {
                return yukVar;
            }
            return w2a1Var;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
