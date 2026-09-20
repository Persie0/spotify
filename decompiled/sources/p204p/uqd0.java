package p204p;

import android.app.ActivityManager;
import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.data.cache.room.MessagesDatabase_Impl;
import com.spotify.music.R;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class uqd0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f232981a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f232982b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uqd0(Object obj, int i) {
        super(0);
        this.f232981a = i;
        this.f232982b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        voc1 voc1Var;
        int i = this.f232981a;
        Set setM75983b = gbu.f78413a;
        int i2 = 3;
        int i3 = 0;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        Object obj = this.f232982b;
        switch (i) {
            case 0:
                boolean zMo48713h = ((vqd0) obj).f243931a.mo48713h(wqd0.f254018b, false);
                Boolean boolValueOf = Boolean.valueOf(zMo48713h);
                Logger.m3965a("Read cached value ONCE for this session: " + zMo48713h, new Object[0]);
                return boolValueOf;
            case 1:
                return String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(((Context) ((s2o) obj).f205039f).getColor(R.color.fallback_extracted_color) & 16777215)}, 1));
            case 2:
                luk lukVar = ((tyd0) obj).f224928d;
                kuk kukVar = luk.f137098b;
                return lukVar.mo40637Q(4);
            case 3:
                fzd0 fzd0Var = (fzd0) obj;
                bji bjiVar = fzd0Var.f74978b;
                if (bjiVar != null) {
                    return (fzd0) bjiVar.mo29483e(new c3f(fzd0Var, 19));
                }
                return null;
            case 4:
                gv41 gv41Var = (gv41) obj;
                gv41Var.getClass();
                return new q4k(null, true, false, false, false, false, false, new ray(gv41Var.f84620e, gv41Var.f84624i, null, new cqj0(253, gv41Var.f84629n, null, null, false, false, false), 20), false, false, 0, false, !gv41Var.f84637v, false, false, false, null, false, false, null, false, null, null, null, false, false, 1073725181);
            case 5:
                return new y3m((v5m) ((li0) obj).f133682d);
            case 6:
                return new y3m((v5m) ((hgc) obj).f91119e);
            case 7:
                return bga.m29062E(((h5e0) obj).f87816e);
            case 8:
                ljp ljpVar = (ljp) obj;
                rmx rmxVar = (rmx) ljpVar.f134122h;
                if (rmxVar != null) {
                    setM75983b = rmxVar.m75983b();
                }
                Object value = ((cw41) ljpVar.f134118d).f42642Y.getValue();
                wj50.m88279p(value);
                return new n7e0((ebf0) value, setM75983b);
            case 9:
                l22 l22Var = (l22) obj;
                rmx rmxVar2 = (rmx) l22Var.f128871X;
                if (rmxVar2 != null) {
                    setM75983b = rmxVar2.m75983b();
                }
                return new n7e0((ebf0) l22Var.f128873Z, setM75983b);
            case 10:
                ((rce0) obj).f197854b.m63782a(bda.f26063c);
                return w2a1Var;
            case 11:
                String str = ((tfe0) ((li80) obj).f133741c).f219933a;
                st91 st91Var = st91.f213865b;
                return new chh0(str);
            case 12:
                String str2 = ((hge0) ((oge0) obj).f165108c).f91144a;
                st91 st91Var2 = st91.f213865b;
                return new dhh0(str2);
            case 13:
                ActivityManager activityManager = (ActivityManager) obj;
                if (activityManager == null) {
                    return null;
                }
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                return new tge0(memoryInfo.availMem, memoryInfo.threshold, memoryInfo.lowMemory);
            case 14:
                vne0 vne0Var = (vne0) obj;
                return vne0Var.f243106i.m34065a(vne0Var.f243090M0, vne0Var.f243097Z);
            case 15:
                return new ynb0((ooe0) obj, i2);
            case 16:
                return new ghh0(((jtr0) ((sdo) obj).f208051e).f115954c.mo24361d());
            case 17:
                q040 q040Var = (q040) ((hse0) obj).f94683a.mo15684j0(q040.class).mo31538a();
                if (q040Var == null || (voc1Var = q040Var.f183902b) == null) {
                    return null;
                }
                return voc1Var.f243453a;
            case 18:
                return new vve0((MessagesDatabase_Impl) obj);
            case 19:
                n23 n23Var = (n23) obj;
                lwe0 lwe0Var = (lwe0) n23Var.f149613c;
                return new cjc0(new C1790du(lwe0Var.f137551a, lwe0Var.f137552b, lwe0Var.f137553c, lwe0Var.f137554d, lwe0Var.f137555e), new n2d0(n23Var, 22));
            case 20:
                return new qu50(((w6f0) obj).f248363b);
            case 21:
                umn umnVar = ((sff0) obj).f208579e;
                String str3 = (String) umnVar.f231921h;
                if (str3 != null) {
                    ((lwr) umnVar.f231920g).m60127a(((yqp) umnVar.f231915b).m94391a(str3).subscribe());
                }
                umnVar.f231921h = null;
                umnVar.f231916c = null;
                return w2a1Var;
            case 22:
                sif0 sif0Var = (sif0) obj;
                return new k3g0(sif0Var.f209505h.f40308a.f201303a.f212413s4, sif0Var.f209496Y);
            case 23:
                vif0 vif0Var = (vif0) obj;
                return new cjc0((dut) vif0Var.f241700f.get(), new uif0(vif0Var, 2));
            case 24:
                dsf0 dsf0Var = (dsf0) obj;
                return new hgo(dsf0Var.f52559c.m70264a(dsf0Var.f52557a, new csf0(i2, i3, fbkVar)), asf0.f19429Z);
            case 25:
                return ((j3g0) obj).f108390a.m80029a(new p431(null, null, 0, null, 63));
            case 26:
                oq51 oq51Var = (oq51) obj;
                oq51Var.f168093l.mo24510D0(oq51Var.f168087f, oq51Var.f168088g, 0);
                return w2a1Var;
            case 27:
                return (Float) ((gw4) obj).m45912e();
            case 28:
                ((ith0) obj).f105584h.m71812a();
                return w2a1Var;
            default:
                ihk0 ihk0Var = (ihk0) obj;
                if (!ihk0Var.f102313b) {
                    Window window = (Window) ihk0Var.f102314c;
                    if (window != null) {
                        Window.Callback callback = window.getCallback();
                        Dialog dialog = callback instanceof Dialog ? (Dialog) callback : null;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                    ihk0Var.f102314c = null;
                }
                ihk0Var.f102313b = false;
                return w2a1Var;
        }
    }
}
