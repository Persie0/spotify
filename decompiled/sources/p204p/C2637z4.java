package p204p;

import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: renamed from: p.z4 */
/* JADX INFO: loaded from: classes8.dex */
public final class C2637z4 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1729c5 f279077a;

    public C2637z4(C1729c5 c1729c5) {
        this.f279077a = c1729c5;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r3.m60397a(r4, r8) == r11) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        C2600y4 c2600y4;
        ho01 an80Var;
        ho01 lc40Var;
        int i;
        if (ibkVar instanceof C2600y4) {
            c2600y4 = (C2600y4) ibkVar;
            int i2 = c2600y4.f269042b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2600y4.f269042b = i2 - Integer.MIN_VALUE;
            } else {
                c2600y4 = new C2600y4(this, ibkVar);
            }
        } else {
            c2600y4 = new C2600y4(this, ibkVar);
        }
        C2600y4 c2600y5 = c2600y4;
        Object objM26512u = c2600y5.f269041a;
        int i3 = c2600y5.f269042b;
        yuk yukVar = yuk.f276404a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = c2600y5.f269044d;
                bga.m29073P(objM26512u);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM26512u);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM26512u);
        C2077l4 c2077l4 = (C2077l4) obj;
        qf40 qf40VarMo89606h = c2077l4.f129464b.mo89606h();
        Uri uri = c2077l4.f129465c;
        fbk fbkVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (!qf40VarMo89606h.contains(tj01.IMAGE_STORY) || uri == null) {
            if (!qf40VarMo89606h.contains(tj01.IMAGE) || uri == null) {
                an80Var = new an80(c2077l4.f129463a, objArr == true ? 1 : 0, 14);
            } else {
                lc40Var = new lc40(uri, c2077l4.f129463a, null, null, 124);
            }
            z0r z0rVar = c2077l4.f129464b;
            C2400t4 c2400t4 = new C2400t4(uri, fbkVar, 0);
            C2400t4 c2400t5 = new C2400t4(uri, objArr2 == true ? 1 : 0, 1);
            c2600y5.f269044d = 0;
            c2600y5.f269042b = 1;
            objM26512u = ang1.m26512u(z0rVar, lc40Var, c2400t4, c2400t5, null, c2600y5, 56);
            if (objM26512u != yukVar) {
                i = 0;
            }
            return yukVar;
        }
        an80Var = new ud51(c2077l4.f129463a, new d3r(uri), null, null, null, null, null, 124);
        lc40Var = an80Var;
        z0r z0rVar2 = c2077l4.f129464b;
        C2400t4 c2400t6 = new C2400t4(uri, fbkVar, 0);
        C2400t4 c2400t7 = new C2400t4(uri, objArr2 == true ? 1 : 0, 1);
        c2600y5.f269044d = 0;
        c2600y5.f269042b = 1;
        objM26512u = ang1.m26512u(z0rVar2, lc40Var, c2400t6, c2400t7, null, c2600y5, 56);
        if (objM26512u != yukVar) {
            i = 0;
        }
        return yukVar;
        m011 m011Var = this.f279077a.f34037b;
        acr0 acr0Var = new acr0(new b3r((v2r) objM26512u));
        c2600y5.f269044d = i;
        c2600y5.f269042b = 2;
    }
}
