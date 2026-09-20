package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class hhp0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yz80 f91558a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f91559b;

    public hhp0(yz80 yz80Var, String str) {
        this.f91558a = yz80Var;
        this.f91559b = str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:
    
        if (r13.mo30229d(r14, r8) == r10) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        ghp0 ghp0Var;
        Object yhp0Var;
        rhp0 rhp0Var;
        p2x0 p2x0Var;
        if (ibkVar instanceof ghp0) {
            ghp0Var = (ghp0) ibkVar;
            int i = ghp0Var.f79962b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ghp0Var.f79962b = i - Integer.MIN_VALUE;
            } else {
                ghp0Var = new ghp0(this, ibkVar);
            }
        } else {
            ghp0Var = new ghp0(this, ibkVar);
        }
        ghp0 ghp0Var2 = ghp0Var;
        Object objM63311h = ghp0Var2.f79961a;
        int i2 = ghp0Var2.f79962b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    rhp0Var = ghp0Var2.f79965e;
                    bqz0Var = ghp0Var2.f79964d;
                    bga.m29073P(objM63311h);
                    p2x0Var = (p2x0) objM63311h;
                } else if (i2 == 2) {
                    rhp0Var = ghp0Var2.f79965e;
                    bqz0Var = ghp0Var2.f79964d;
                    bga.m29073P(objM63311h);
                    p2x0Var = (p2x0) objM63311h;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM63311h);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM63311h);
            rhp0Var = (rhp0) obj;
            String str = rhp0Var.f199274c;
            String str2 = rhp0Var.f199272a;
            yz80 yz80Var = this.f91558a;
            if (str != null) {
                String str3 = rhp0Var.f199273b;
                List listSingletonList = Collections.singletonList(str2);
                String str4 = this.f91559b;
                qz80 qz80Var = rhp0Var.f199276e;
                ghp0Var2.f79964d = bqz0Var;
                ghp0Var2.f79965e = rhp0Var;
                ghp0Var2.f79962b = 1;
                objM63311h = ((n090) yz80Var).m63310g(str3, listSingletonList, str, str4, "", qz80Var, ghp0Var2);
                if (objM63311h != yukVar) {
                    p2x0Var = (p2x0) objM63311h;
                }
            } else {
                String str5 = rhp0Var.f199273b;
                List listSingletonList2 = Collections.singletonList(str2);
                String str6 = this.f91559b;
                qz80 qz80Var2 = rhp0Var.f199276e;
                ghp0Var2.f79964d = bqz0Var;
                ghp0Var2.f79965e = rhp0Var;
                ghp0Var2.f79962b = 2;
                objM63311h = ((n090) yz80Var).m63311h(str5, listSingletonList2, "start", str6, "", qz80Var2, ghp0Var2);
                if (objM63311h != yukVar) {
                    p2x0Var = (p2x0) objM63311h;
                }
            }
            return yukVar;
            if (p2x0Var instanceof m2x0) {
                yhp0Var = new zhp0(rhp0Var.f199275d);
            } else {
                if (!(p2x0Var instanceof k2x0)) {
                    throw new NoWhenBranchMatchedException();
                }
                yhp0Var = new yhp0(rhp0Var.f199275d);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            yhp0Var = new yhp0(obj.f199275d);
        }
        ghp0Var2.f79964d = null;
        ghp0Var2.f79965e = null;
        ghp0Var2.f79962b = 3;
    }
}
