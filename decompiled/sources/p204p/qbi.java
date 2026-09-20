package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes9.dex */
public final class qbi implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tbi f187096a;

    public qbi(tbi tbiVar) {
        this.f187096a = tbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r10.mo30229d(r2, r0) == r7) goto L39;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        pbi pbiVar;
        int i;
        if (ibkVar instanceof pbi) {
            pbiVar = (pbi) ibkVar;
            int i2 = pbiVar.f175848b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pbiVar.f175848b = i2 - Integer.MIN_VALUE;
            } else {
                pbiVar = new pbi(this, ibkVar);
            }
        } else {
            pbiVar = new pbi(this, ibkVar);
        }
        Object objM87671c = pbiVar.f175847a;
        int i3 = pbiVar.f175848b;
        Object fciVar = eci.f58342a;
        tbi tbiVar = this.f187096a;
        yuk yukVar = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(objM87671c);
                wai waiVar = (wai) obj;
                Set set = dd41.f47702f;
                String strM35710h = r46.m74726U(waiVar.f249537a).m35710h();
                wbi wbiVar = tbiVar.f218861a;
                pbiVar.f175850d = bqz0Var;
                pbiVar.f175851e = 0;
                pbiVar.f175848b = 1;
                objM87671c = wbiVar.m87671c(strM35710h, pbiVar);
                if (objM87671c != yukVar) {
                    i = 0;
                }
                return yukVar;
            }
            if (i3 == 1) {
                i = pbiVar.f175851e;
                bqz0Var = pbiVar.f175850d;
                bga.m29073P(objM87671c);
            } else if (i3 == 2) {
                bqz0Var = pbiVar.f175850d;
                bga.m29073P(objM87671c);
                fciVar = new fci((List) objM87671c);
                pbiVar.f175850d = null;
                pbiVar.f175848b = 3;
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM87671c);
            }
            return w2a1.f247311a;
            sci sciVar = (sci) objM87671c;
            if (sciVar.f207749a.isEmpty()) {
                pbiVar.f175850d = null;
                pbiVar.f175848b = 3;
            } else {
                i7k i7kVar = tbiVar.f218862b;
                List list = sciVar.f207749a;
                pbiVar.f175850d = bqz0Var;
                pbiVar.f175851e = i;
                pbiVar.f175848b = 2;
                objM87671c = i7kVar.m49869a(list, pbiVar);
                if (objM87671c != yukVar) {
                    fciVar = new fci((List) objM87671c);
                    pbiVar.f175850d = null;
                    pbiVar.f175848b = 3;
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return yukVar;
    }
}
