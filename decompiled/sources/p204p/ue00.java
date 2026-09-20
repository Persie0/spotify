package p204p;

import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ue00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ve00 f229356a;

    public ue00(ve00 ve00Var) {
        this.f229356a = ve00Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ee, code lost:
    
        if (r3.m60397a(r4, r8) == r14) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        te00 te00Var;
        me00 me00Var;
        int i;
        String str;
        if (ibkVar instanceof te00) {
            te00Var = (te00) ibkVar;
            int i2 = te00Var.f219541b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                te00Var.f219541b = i2 - Integer.MIN_VALUE;
            } else {
                te00Var = new te00(this, ibkVar);
            }
        } else {
            te00Var = new te00(this, ibkVar);
        }
        te00 te00Var2 = te00Var;
        Object objM26512u = te00Var2.f219540a;
        int i3 = te00Var2.f219541b;
        ve00 ve00Var = this.f229356a;
        int i4 = 1;
        fbk fbkVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        yuk yukVar = yuk.f276404a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = te00Var2.f219544e;
                me00Var = te00Var2.f219543d;
                bga.m29073P(objM26512u);
            } else if (i3 == 2) {
                i = te00Var2.f219544e;
                bga.m29073P(objM26512u);
                m011 m011Var = ve00Var.f240537b;
                acr0 acr0Var = new acr0(new b3r((v2r) objM26512u));
                te00Var2.f219543d = null;
                te00Var2.f219544e = i;
                te00Var2.f219541b = 3;
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM26512u);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM26512u);
        me00 me00Var2 = (me00) obj;
        fq01 fq01VarMo89604c = me00Var2.f142551b.mo89604c();
        List listM43728j1 = g6f.m43728j1(me00Var2.f142551b.mo89606h());
        re00 re00Var = me00Var2.f142550a;
        Uri uri = me00Var2.f142552c;
        pm80 pm80Var = uri != null ? new pm80(uri.toString(), objArr2 == true ? 1 : 0, 62, objArr == true ? 1 : 0) : null;
        Uri uri2 = (pm80Var == null || (str = pm80Var.f178974a) == null) ? null : Uri.parse(str);
        x2r x2rVarM31048c = ve00Var.f240536a.m31048c(fq01VarMo89604c, listM43728j1, new f2r(3));
        lu01 lu01Var = re00Var.f198237a;
        int i5 = re00Var.f198241e;
        fcr0 fcr0Var = new fcr0(i5, i5, "");
        gcr0 gcr0Var = uri2 != null ? new gcr0(uri2, "") : null;
        te00Var2.f219543d = me00Var2;
        te00Var2.f219544e = 0;
        te00Var2.f219541b = 1;
        Object objMo34037c = x2rVarM31048c.mo34037c(lu01Var, fcr0Var, gcr0Var, uri2, te00Var2);
        if (objMo34037c != yukVar) {
            me00Var = me00Var2;
            objM26512u = objMo34037c;
            i = 0;
        }
        return yukVar;
        z0r z0rVar = me00Var.f142551b;
        C1673an c1673an = new C1673an(i4, 14, fbkVar);
        C1673an c1673an2 = new C1673an(i4, 15, objArr3 == true ? 1 : 0);
        te00Var2.f219543d = null;
        te00Var2.f219544e = i;
        te00Var2.f219541b = 2;
        objM26512u = ang1.m26512u(z0rVar, (ho01) objM26512u, c1673an, c1673an2, null, te00Var2, 56);
        if (objM26512u != yukVar) {
            m011 m011Var2 = ve00Var.f240537b;
            acr0 acr0Var2 = new acr0(new b3r((v2r) objM26512u));
            te00Var2.f219543d = null;
            te00Var2.f219544e = i;
            te00Var2.f219541b = 3;
        }
        return yukVar;
    }
}
