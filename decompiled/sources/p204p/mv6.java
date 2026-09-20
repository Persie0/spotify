package p204p;

import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class mv6 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dy0 f147514a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vbu0 f147515b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m011 f147516c;

    public mv6(dy0 dy0Var, vbu0 vbu0Var, m011 m011Var) {
        this.f147514a = dy0Var;
        this.f147515b = vbu0Var;
        this.f147516c = m011Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d8, code lost:
    
        if (r12.f147516c.m60397a(r15, r6) == r10) goto L44;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        lv6 lv6Var;
        tv6 tv6Var;
        dw6 dw6Var;
        nu71 nu71Var;
        int i;
        lu01 lu01Var;
        dw6 dw6Var2;
        tv6 tv6Var2;
        int i2;
        ru71 ru71Var;
        int i3;
        if (ibkVar instanceof lv6) {
            lv6Var = (lv6) ibkVar;
            int i4 = lv6Var.f137229b;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lv6Var.f137229b = i4 - Integer.MIN_VALUE;
            } else {
                lv6Var = new lv6(this, ibkVar);
            }
        } else {
            lv6Var = new lv6(this, ibkVar);
        }
        lv6 lv6Var2 = lv6Var;
        Object objM85174f = lv6Var2.f137228a;
        int i5 = lv6Var2.f137229b;
        yuk yukVar = yuk.f276404a;
        if (i5 != 0) {
            if (i5 == 1) {
                i2 = lv6Var2.f137234g;
                nu71Var = lv6Var2.f137233f;
                dw6Var2 = lv6Var2.f137232e;
                tv6Var2 = lv6Var2.f137231d;
                bga.m29073P(objM85174f);
            } else if (i5 == 2) {
                i3 = lv6Var2.f137234g;
                bga.m29073P(objM85174f);
                acr0 acr0Var = new acr0(new b3r((v2r) objM85174f));
                lv6Var2.f137231d = null;
                lv6Var2.f137232e = null;
                lv6Var2.f137233f = null;
                lv6Var2.f137234g = i3;
                lv6Var2.f137229b = 3;
            } else {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM85174f);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM85174f);
        tv6Var = (tv6) obj;
        dw6Var = tv6Var.f224070f;
        nu71Var = dw6Var.f53613X;
        lu01 lu01VarM59923c = dw6Var.f53616a.f213201a.f201918a;
        i = 0;
        if (nu71Var != null) {
            long j = nu71Var.f158526a;
            nu71 nu71Var2 = dw6Var.f53614Y;
            String str = dw6Var.f53615Z;
            lv6Var2.f137231d = tv6Var;
            lv6Var2.f137232e = dw6Var;
            lv6Var2.f137233f = nu71Var;
            lv6Var2.f137234g = 0;
            lv6Var2.f137229b = 1;
            Object objM37286H = this.f147514a.m37286H(lu01VarM59923c, j, nu71Var2, str, lv6Var2);
            if (objM37286H != yukVar) {
                dw6Var2 = dw6Var;
                objM85174f = objM37286H;
                tv6Var2 = tv6Var;
                i2 = 0;
            }
        } else {
            String str2 = dw6Var.f53615Z;
            if (str2 != null) {
                lu01VarM59923c = lu01.m59923c(lu01VarM59923c, str2, null, null, 126);
            }
            lu01Var = lu01VarM59923c;
            z0r z0rVar = tv6Var.f224068d;
            Uri uri = tv6Var.f224069e;
            int i6 = dw6Var.f53620e;
            if (nu71Var == null) {
                ru71Var = null;
            } else {
                if (dw6Var.f53615Z != null) {
                    nu71Var = null;
                }
                if (nu71Var != null) {
                    ru71Var = new ru71(nu71Var.f158526a);
                } else {
                    ru71Var = null;
                }
            }
            lv6Var2.f137231d = null;
            lv6Var2.f137232e = null;
            lv6Var2.f137233f = null;
            lv6Var2.f137234g = i;
            lv6Var2.f137229b = 2;
            objM85174f = this.f147515b.m85174f(z0rVar, uri, lu01Var, i6, ru71Var, lv6Var2);
            if (objM85174f != yukVar) {
                i3 = i;
                acr0 acr0Var2 = new acr0(new b3r((v2r) objM85174f));
                lv6Var2.f137231d = null;
                lv6Var2.f137232e = null;
                lv6Var2.f137233f = null;
                lv6Var2.f137234g = i3;
                lv6Var2.f137229b = 3;
            }
        }
        return yukVar;
        i = i2;
        lu01Var = (lu01) objM85174f;
        dw6Var = dw6Var2;
        tv6Var = tv6Var2;
        z0r z0rVar2 = tv6Var.f224068d;
        Uri uri2 = tv6Var.f224069e;
        int i7 = dw6Var.f53620e;
        if (nu71Var == null) {
            ru71Var = null;
        } else {
            if (dw6Var.f53615Z != null) {
                nu71Var = null;
            }
            if (nu71Var != null) {
                ru71Var = new ru71(nu71Var.f158526a);
            } else {
                ru71Var = null;
            }
        }
        lv6Var2.f137231d = null;
        lv6Var2.f137232e = null;
        lv6Var2.f137233f = null;
        lv6Var2.f137234g = i;
        lv6Var2.f137229b = 2;
        objM85174f = this.f147515b.m85174f(z0rVar2, uri2, lu01Var, i7, ru71Var, lv6Var2);
        if (objM85174f != yukVar) {
            i3 = i;
            acr0 acr0Var3 = new acr0(new b3r((v2r) objM85174f));
            lv6Var2.f137231d = null;
            lv6Var2.f137232e = null;
            lv6Var2.f137233f = null;
            lv6Var2.f137234g = i3;
            lv6Var2.f137229b = 3;
        }
        return yukVar;
    }
}
