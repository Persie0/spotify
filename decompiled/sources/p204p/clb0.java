package p204p;

import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class clb0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m011 f39234a;

    public clb0(l45 l45Var, m011 m011Var) {
        this.f39234a = m011Var;
    }

    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r2v18, types: [android.net.Uri, java.lang.Long, java.lang.String, p.dit, p.fbk] */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.net.Uri, p.dit] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        blb0 blb0Var;
        dit ditVar;
        int i;
        Object obj2;
        Object lc40Var;
        int i2;
        Uri uri;
        ?? r2;
        yuk yukVar;
        ?? r3;
        acr0 acr0Var;
        if (ibkVar instanceof blb0) {
            blb0Var = (blb0) ibkVar;
            int i3 = blb0Var.f28154b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                blb0Var.f28154b = i3 - Integer.MIN_VALUE;
            } else {
                blb0Var = new blb0(this, ibkVar);
            }
        } else {
            blb0Var = new blb0(this, ibkVar);
        }
        blb0 blb0Var2 = blb0Var;
        Object objM26512u = blb0Var2.f28153a;
        int i4 = blb0Var2.f28154b;
        LinkedHashMap linkedHashMap = null;
        yuk yukVar2 = yuk.f276404a;
        if (i4 != 0) {
            if (i4 == 1) {
                int i5 = blb0Var2.f28158f;
                uri = blb0Var2.f28157e;
                ditVar = blb0Var2.f28156d;
                bga.m29073P(objM26512u);
                i2 = i5;
                r2 = 0;
            } else if (i4 == 2) {
                int i6 = blb0Var2.f28158f;
                bga.m29073P(objM26512u);
                i2 = i6;
                r3 = 0;
                yukVar = yukVar2;
                acr0Var = new acr0(new b3r((v2r) objM26512u));
                blb0Var2.f28156d = r3;
                blb0Var2.f28157e = r3;
                blb0Var2.f28158f = i2;
                blb0Var2.f28154b = 3;
                if (this.f39234a.m60397a(acr0Var, blb0Var2) == yukVar) {
                    return yukVar;
                }
            } else {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM26512u);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM26512u);
        ditVar = (dit) obj;
        z0r z0rVar = ditVar.f49474c;
        zkb0 zkb0Var = ditVar.f49473b;
        fq01 fq01VarMo89604c = z0rVar.mo89604c();
        List listM43728j1 = g6f.m43728j1(ditVar.f49474c.mo89606h());
        Uri uri2 = ditVar.f49475d;
        String str = zkb0Var.f283701b;
        tk8 tk8Var = zkb0Var.f283700a;
        int iM61873g = mif1.m61873g(tk8Var.f221096a);
        int iM61873g2 = mif1.m61873g(tk8Var.f221097b);
        String str2 = zkb0Var.f283702c.f207168a;
        blb0Var2.f28156d = ditVar;
        blb0Var2.f28157e = uri2;
        blb0Var2.f28158f = 0;
        blb0Var2.f28154b = 1;
        an80 an80Var = new an80(str, linkedHashMap, 14);
        if (psg1.m70831G(fq01VarMo89604c)) {
            lc40Var = an80.m26480f(an80Var, kkc0.m56700m0(an80Var.f17326c, Collections.singletonMap("lyrics_provider_id", str2)));
            obj2 = null;
            i = 0;
        } else if (listM43728j1.contains(tj01.IMAGE_STORY)) {
            i = 0;
            lc40Var = new td51(str, new c3r(iM61873g, iM61873g2), uri2 != null ? new d3r(uri2) : null, null, an80Var.f17326c, null, new sd51(null, 7, false, false));
            obj2 = null;
        } else {
            i = 0;
            if (listM43728j1.contains(tj01.IMAGE)) {
                obj2 = null;
                lc40Var = new lc40(uri2, str, null, null, an80Var.f17326c, null, null);
            } else {
                obj2 = null;
                lc40Var = an80Var;
            }
        }
        if (lc40Var == yukVar2) {
            return yukVar2;
        }
        i2 = i;
        uri = uri2;
        objM26512u = lc40Var;
        r2 = obj2;
        ho01 ho01Var = (ho01) objM26512u;
        z0r z0rVar2 = ditVar.f49474c;
        dw4 dw4Var = new dw4(uri, ditVar, r2, 4);
        yukVar = yukVar2;
        C2400t4 c2400t4 = new C2400t4(uri, r2, 2);
        Collection collectionMo36660d = ((AbstractC2328r7) ditVar.f49473b.f283703d.f141856d).mo36660d();
        ArrayList arrayList = new ArrayList(i6f.m49804T(collectionMo36660d, 10));
        Iterator it = collectionMo36660d.iterator();
        while (it.hasNext()) {
            arrayList.add(new vj80((String) it.next(), r2));
        }
        s0c s0cVar = new s0c(new t0u0(r2, arrayList));
        blb0Var2.f28156d = r2;
        blb0Var2.f28157e = r2;
        blb0Var2.f28158f = i2;
        blb0Var2.f28154b = 2;
        objM26512u = ang1.m26512u(z0rVar2, ho01Var, dw4Var, c2400t4, s0cVar, blb0Var2, 24);
        r3 = r2;
        if (objM26512u == yukVar) {
            return yukVar;
        }
        acr0Var = new acr0(new b3r((v2r) objM26512u));
        blb0Var2.f28156d = r3;
        blb0Var2.f28157e = r3;
        blb0Var2.f28158f = i2;
        blb0Var2.f28154b = 3;
        if (this.f39234a.m60397a(acr0Var, blb0Var2) == yukVar) {
            return yukVar;
        }
        return w2a1.f247311a;
    }
}
