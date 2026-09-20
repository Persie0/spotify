package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import com.spotify.carapplibrary.androidauto.AndroidAutoService;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class vpj implements v94 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f243700a;

    /* JADX INFO: renamed from: b */
    public final Object f243701b;

    /* JADX INFO: renamed from: c */
    public Object f243702c;

    public /* synthetic */ vpj(int i, Object obj, Object obj2) {
        this.f243700a = i;
        this.f243701b = obj;
        this.f243702c = obj2;
    }

    /* JADX INFO: renamed from: b */
    public static uhc m86157b(Intent intent, int i) {
        Bundle bundle;
        if (i < 0 || i > 2 || i == 0) {
            throw new IllegalArgumentException(s571.m77246e(i, "Invalid colorScheme: "));
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return uhc.m83135h(null);
        }
        uhc uhcVarM83135h = uhc.m83135h(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS");
        if (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i)) == null) {
            return uhcVarM83135h;
        }
        uhc uhcVarM83135h2 = uhc.m83135h(bundle);
        Integer num = (Integer) uhcVarM83135h2.f230411b;
        if (num == null) {
            num = (Integer) uhcVarM83135h.f230411b;
        }
        Integer num2 = num;
        Integer num3 = (Integer) uhcVarM83135h2.f230412c;
        if (num3 == null) {
            num3 = (Integer) uhcVarM83135h.f230412c;
        }
        Integer num4 = num3;
        Integer num5 = (Integer) uhcVarM83135h2.f230413d;
        if (num5 == null) {
            num5 = (Integer) uhcVarM83135h.f230413d;
        }
        Integer num6 = num5;
        Integer num7 = (Integer) uhcVarM83135h2.f230414e;
        if (num7 == null) {
            num7 = (Integer) uhcVarM83135h.f230414e;
        }
        return new uhc(num2, num4, num6, num7, 11);
    }

    @Override // p204p.v94
    /* JADX INFO: renamed from: K0 */
    public void mo24956K0(Object obj) {
        switch (this.f243700a) {
            case 27:
                AndroidAutoService androidAutoService = (AndroidAutoService) obj;
                son sonVar = (son) this.f243701b;
                androidAutoService.f3274e = (z140) sonVar.f212464u2.get();
                androidAutoService.f3275f = (hv31) sonVar.f212225l3.get();
                androidAutoService.f3273d = new z4n(6, sonVar, (vpj) this.f243702c);
                break;
            default:
                pv11 pv11Var = (pv11) obj;
                pv11Var.f181575Z1 = xf40.m90452j(qqq0.f191633a, (jhn) this.f243702c);
                pv11Var.f181574Y1 = (z9j0) ((otn) this.f243701b).f169565X.get();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m86158a(String str, ibk ibkVar) {
        azk azkVar;
        if (ibkVar instanceof azk) {
            azkVar = (azk) ibkVar;
            int i = azkVar.f21635c;
            if ((i & Integer.MIN_VALUE) != 0) {
                azkVar.f21635c = i - Integer.MIN_VALUE;
            } else {
                azkVar = new azk(this, ibkVar);
            }
        } else {
            azkVar = new azk(this, ibkVar);
        }
        Object objM86756u = azkVar.f21633a;
        int i2 = azkVar.f21635c;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM86756u);
            ay7 ay7VarM41173v = fag1.m41173v((pgo) this.f243702c, dzk.f54686a, str);
            C2559x4 c2559x4 = new C2559x4(2, 23, fbkVar);
            azkVar.f21635c = 1;
            objM86756u = vyf1.m86756u(ay7VarM41173v, c2559x4, azkVar);
            yuk yukVar = yuk.f276404a;
            if (objM86756u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86756u);
        }
        qho qhoVar = (qho) objM86756u;
        oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
        if (ohoVar != null) {
            return (ow81) ohoVar.f165512a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public Object m86159c(String str, ibk ibkVar) {
        q9k q9kVar;
        if (ibkVar instanceof q9k) {
            q9kVar = (q9k) ibkVar;
            int i = q9kVar.f186614d;
            if ((i & Integer.MIN_VALUE) != 0) {
                q9kVar.f186614d = i - Integer.MIN_VALUE;
            } else {
                q9kVar = new q9k(this, ibkVar);
            }
        } else {
            q9kVar = new q9k(this, ibkVar);
        }
        Object objM76978s = q9kVar.f186612b;
        int i2 = q9kVar.f186614d;
        Object[] objArr = 0;
        if (i2 == 0) {
            bga.m29073P(objM76978s);
            rrd rrdVar = new rrd((Object) this, (fbk) (objArr == true ? 1 : 0), 22);
            q9kVar.f186611a = str;
            q9kVar.f186614d = 1;
            objM76978s = s1h1.m76978s(500L, rrdVar, q9kVar);
            yuk yukVar = yuk.f276404a;
            if (objM76978s == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = q9kVar.f186611a;
            bga.m29073P(objM76978s);
        }
        PlayerState playerState = (PlayerState) objM76978s;
        ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
        if (!wj50.m88271j(contextTrack != null ? contextTrack.uri() : null, str)) {
            throw new IllegalStateException(edb.m38564m("No track matching the entityUri: ", str));
        }
        ContextTrack contextTrack2 = (ContextTrack) playerState.track().mo49278b();
        wj50.m88279p(contextTrack2);
        String strM38021r = e72.m38021r(contextTrack2);
        String strM38012j0 = e72.m38012j0(contextTrack2);
        if (strM38012j0 == null) {
            strM38012j0 = "";
        }
        String strM38000d0 = e72.m38000d0(contextTrack2, "image_url");
        String str2 = strM38000d0 != null ? strM38000d0 : "";
        String strUri = contextTrack2.uri();
        ((wy3) ((xre) this.f243702c)).getClass();
        return new ys81(strM38021r, strM38012j0, str2, strUri, ((Number) playerState.position(System.currentTimeMillis()).mo49278b()).longValue(), Boolean.parseBoolean((String) contextTrack2.metadata().get(ContextTrack.Metadata.KEY_HAS_LYRICS)), (String) playerState.playbackId().mo49283h());
    }

    /* JADX INFO: renamed from: d */
    public void m86160d(Context context, Uri uri) {
        Intent intent = (Intent) this.f243701b;
        intent.setData(uri);
        context.startActivity(intent, (Bundle) this.f243702c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public Serializable m86161e(String str, ibk ibkVar) {
        bzk bzkVar;
        if (ibkVar instanceof bzk) {
            bzkVar = (bzk) ibkVar;
            int i = bzkVar.f32524c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bzkVar.f32524c = i - Integer.MIN_VALUE;
            } else {
                bzkVar = new bzk(this, ibkVar);
            }
        } else {
            bzkVar = new bzk(this, ibkVar);
        }
        Object objM62844i = bzkVar.f32522a;
        int i2 = bzkVar.f32524c;
        lau lauVar = lau.f131415a;
        if (i2 == 0) {
            bga.m29073P(objM62844i);
            Set set = dd41.f47702f;
            String strM35694A = r46.m74728W(str).m35694A();
            if (strM35694A == null) {
                return lauVar;
            }
            ex80 ex80Var = new ex80(strM35694A, null, bk5.m29624m1(new nt80[]{ys80.f275721a, us80.f233558a, ws80.f254555a, zs80.f285887a, at80.f19613a}), a5u0.f12598a, 2);
            wt80 wt80Var = (wt80) this.f243701b;
            bzkVar.f32524c = 1;
            objM62844i = ((mu80) wt80Var).m62844i(ex80Var, bzkVar);
            yuk yukVar = yuk.f276404a;
            if (objM62844i == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62844i);
        }
        p2x0 p2x0Var = (p2x0) objM62844i;
        if (!(p2x0Var instanceof m2x0)) {
            if (!(p2x0Var instanceof k2x0)) {
                throw new NoWhenBranchMatchedException();
            }
            Objects.toString(((k2x0) p2x0Var).f118699a);
            return lauVar;
        }
        Iterable iterable = (Iterable) ((m2x0) p2x0Var).f139474a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((dx80) it.next()).f53899c);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Set set2 = dd41.f47702f;
            if (r46.m74708A((String) obj, gn80.TRACK)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public Object m86162f(String str, ibk ibkVar) {
        czk czkVar;
        String str2;
        lar0 lar0Var;
        erc1 erc1Var;
        m340 m340Var;
        z240 z240VarM60640a;
        if (ibkVar instanceof czk) {
            czkVar = (czk) ibkVar;
            int i = czkVar.f43580d;
            if ((i & Integer.MIN_VALUE) != 0) {
                czkVar.f43580d = i - Integer.MIN_VALUE;
            } else {
                czkVar = new czk(this, ibkVar);
            }
        } else {
            czkVar = new czk(this, ibkVar);
        }
        Object objM86158a = czkVar.f43578b;
        int i2 = czkVar.f43580d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86158a);
                czkVar.f43577a = str;
                czkVar.f43580d = 1;
                objM86158a = m86158a(str, czkVar);
                Object obj = yuk.f276404a;
                if (objM86158a == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = czkVar.f43577a;
                bga.m29073P(objM86158a);
            }
            ow81 ow81Var = (ow81) objM86158a;
            if (ow81Var == null || (erc1Var = ow81Var.f170674a) == null || (m340Var = erc1Var.f62079a) == null || (z240VarM60640a = m340Var.m60640a(a340.f11861b)) == null || (str2 = z240VarM60640a.f278475a.f198763a) == null) {
                str2 = null;
            }
            if (str2 == null) {
                return null;
            }
            jar0 jar0Var = (ow81Var == null || (lar0Var = ow81Var.f170675b) == null) ? null : lar0Var.f131400b;
            return new cf81(str, jar0Var instanceof har0 ? ((har0) jar0Var).f89268a.f223223a.f213499a.f198763a : null, dzk.m37471a(ow81Var != null ? ow81Var.f170674a : null), str2);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public void m86163g(int i) {
        String str;
        sr4 sr4Var = (sr4) this.f243702c;
        if (sr4Var != null) {
            if (i == 1) {
                str = "success";
            } else {
                if (i != 2) {
                    throw null;
                }
                str = "failure";
            }
            sr4Var.f213230e.put(VoiceAssistantsPerformance.DIMENSION_OUTCOME, str);
            sr4Var.m79016f("load_recommendations");
            ((rr4) ((am71) this.f243701b)).m76276b(sr4Var.m79015d());
        }
        this.f243702c = null;
    }

    public vpj(am71 am71Var) {
        this.f243700a = 0;
        this.f243701b = am71Var;
    }

    public vpj(twy twyVar) {
        this.f243700a = 15;
        this.f243701b = twyVar;
        this.f243702c = be21.m28868a(new akm(this, 27));
    }

    public vpj(es9 es9Var) {
        this.f243700a = 13;
        this.f243701b = es9Var;
        this.f243702c = be21.m28868a(new akm(this, 13));
    }

    public vpj(t5i0 t5i0Var) {
        this.f243700a = 26;
        this.f243701b = t5i0Var;
        this.f243702c = be21.m28868a(new n8n(this, 14));
    }

    public vpj(e99 e99Var) {
        this.f243700a = 16;
        this.f243701b = e99Var;
        this.f243702c = be21.m28868a(new tqm(this, 6));
    }

    public vpj(xxo xxoVar) {
        this.f243700a = 18;
        this.f243701b = xxoVar;
        this.f243702c = be21.m28868a(new tqm(this, 23));
    }

    public vpj(zzh0 zzh0Var) {
        this.f243700a = 23;
        this.f243701b = zzh0Var;
        this.f243702c = be21.m28868a(new w4n(this, 20));
    }

    public vpj(vx1 vx1Var, dcm0 dcm0Var) {
        this.f243700a = 10;
        this.f243701b = dcm0Var;
        this.f243702c = new lgm(this, 13);
    }

    public vpj(mfn mfnVar) {
        this.f243700a = 17;
        this.f243701b = mfnVar;
        this.f243702c = be21.m28868a(new tqm(this, 12));
    }

    public vpj(bv10 bv10Var, dcm0 dcm0Var) {
        this.f243700a = 19;
        this.f243701b = dcm0Var;
        this.f243702c = new e0n(this, 10);
    }

    public vpj(uen uenVar, l3n l3nVar, urq urqVar) {
        this.f243700a = 21;
        this.f243701b = uenVar;
        this.f243702c = be21.m28868a(new e0n(this, 29));
    }

    public vpj(jy50 jy50Var, ky50 ky50Var) {
        this.f243700a = 20;
        this.f243701b = jy50Var;
        this.f243702c = b2s.m27972b(new e0n(this, 20));
    }

    public vpj(cpa0 cpa0Var, dcm0 dcm0Var) {
        this.f243700a = 22;
        this.f243701b = dcm0Var;
        this.f243702c = new w4n(this, 9);
    }

    public vpj(jen jenVar, bu50 bu50Var) {
        this.f243700a = 11;
        this.f243701b = jenVar;
        this.f243702c = be21.m28868a(new lgm(this, 25));
    }

    public vpj(kzj0 kzj0Var, r0k0 r0k0Var) {
        this.f243700a = 24;
        this.f243701b = kzj0Var;
        this.f243702c = b2s.m27972b(new n8n(this, 0));
    }

    public vpj(nsw0 nsw0Var, osw0 osw0Var) {
        this.f243700a = 29;
        this.f243701b = nsw0Var;
        this.f243702c = b2s.m27972b(new tzn(this, 9));
    }

    public vpj(twx twxVar, Set set) {
        this.f243700a = 25;
        this.f243701b = twxVar;
        this.f243702c = b2s.m27972b(new n8n(this, 7));
    }

    public vpj(y91 y91Var, ikh ikhVar, z91 z91Var) {
        this.f243700a = 9;
        this.f243701b = y91Var;
        this.f243702c = new lgm(this, 6);
    }

    public vpj(z2e z2eVar, ynh ynhVar, dcm0 dcm0Var) {
        this.f243700a = 14;
        this.f243701b = dcm0Var;
        this.f243702c = new akm(this, 19);
    }

    public vpj(g98 g98Var, ikh ikhVar, h98 h98Var, dcm0 dcm0Var) {
        this.f243700a = 12;
        this.f243701b = dcm0Var;
        this.f243702c = new akm(this, 5);
    }

    public vpj(son sonVar) {
        this.f243700a = 27;
        this.f243702c = this;
        this.f243701b = sonVar;
    }

    public vpj(son sonVar, otn otnVar) {
        this.f243700a = 28;
        this.f243701b = otnVar;
        this.f243702c = new jhn(sonVar, 10);
    }
}
