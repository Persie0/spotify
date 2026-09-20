package p204p;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.allboarding.allboardingimpl.utils.PickerCollapsingTitleBar;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.music.R;
import com.spotify.wrapped.p194v1.proto.Paragraph;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ohy0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f165562a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f165563b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ohy0(Object obj, int i) {
        super(0);
        this.f165562a = i;
        this.f165563b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = 24;
        switch (this.f165562a) {
            case 0:
                phy0 phy0Var = (phy0) this.f165563b;
                synchronized (phy0Var.f177764b) {
                    phy0Var.f177765c = null;
                }
                return w2a1.f247311a;
            case 1:
                return (kv91) ((i4t0) ((clq0) this.f165563b).f39344f).get();
            case 2:
                return sam.m77645B(new o971(0L, 6, ((ovy0) this.f165563b).f170584a));
            case 3:
                ((PickerCollapsingTitleBar) ((ezw0) this.f165563b).f64486c).m1529e(true, false, true);
                return w2a1.f247311a;
            case 4:
                return (ijc1) ((iwy0) this.f165563b).invoke();
            case 5:
                ((uwy0) ((tb5) this.f165563b).f218756b).f234747a.mo7283d();
                return w2a1.f247311a;
            case 6:
                ((bxy0) this.f165563b).getClass();
                return "";
            case 7:
                kbm0 kbm0Var = ((nbm0) this.f165563b).get();
                if (kbm0Var != null) {
                    return kbm0Var.f121231a;
                }
                return null;
            case 8:
                i8g0 i8g0Var = ((a2z0) this.f165563b).f11752P0;
                i8g0Var.getClass();
                yt91 yt91VarM96903c = i8g0Var.f99785b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("top_bar", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("back_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate_back", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
            case 9:
                return new SchedulerWorkRunner((Scheduler) ((zab0) this.f165563b).f281029d);
            case 10:
                return new cjc0((dut) ((tzn) ((sps0) this.f165563b).f212939f).get(), vgz0.f241356X);
            case 11:
                return opo.m67570t(((ljz0) this.f165563b).f134187c, njg1.m64613f());
            case 12:
                return opo.m67570t(((akz0) this.f165563b).f16686d, njg1.m64613f());
            case 13:
                vmz0 vmz0Var = (vmz0) this.f165563b;
                k5m0 k5m0Var = vmz0Var.f242955b;
                if (k5m0Var.mo55547g(vmz0Var.f242956c)) {
                    k5m0Var.mo55548j();
                } else {
                    vmz0Var.f242954a.mo47345e();
                }
                return w2a1.f247311a;
            case 14:
                snz0 snz0Var = (snz0) this.f165563b;
                View view = snz0Var.f211057a;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.selection_rows_container);
                up60 up60Var = hxt.f96286w;
                Context context = view.getContext();
                wj50.m88279p(frameLayout);
                hxt hxtVarM50021n = ia7.m50021n(context, frameLayout, snz0Var.f211058b, null, 24);
                psg1.m70832H(frameLayout, hxtVarM50021n.f96307t);
                return hxtVarM50021n;
            case 15:
                poz0 poz0Var = (poz0) this.f165563b;
                ksn ksnVar = poz0Var.f179834d;
                String str = poz0Var.f179831a;
                eh00 eh00Var = poz0Var.f179833c;
                otn otnVar = (otn) ksnVar.f125978a.f241006d;
                return new wcu0(str, false, eh00Var, otnVar.m67850G2(), new vkr((yz80) otnVar.f169634b1.get()), (yfu0) otnVar.f169601Z1.get());
            case 16:
                return Paragraph.m23152x(((fuz0) this.f165563b).f73606a);
            case 17:
                ((iwz0) this.f165563b).f106535b.invoke();
                return w2a1.f247311a;
            case 18:
                rvw0 rvw0Var = (rvw0) this.f165563b;
                return ((Flowable) rvw0Var.f203140b).m23343X(new fus0(rvw0Var, i));
            case 19:
                return new cjc0((dut) ((tzn) ((nyz0) this.f165563b).f159963f).get(), gxz0.f85392t);
            case 20:
                hzz0 hzz0Var = (hzz0) this.f165563b;
                hzz0Var.f97070Y.mo47348i(new p6j0("spotify:internal:magpie?config=EDIT", "", false, false, 0, 0, false, null, null, null), pp91.m70529j(new pqm0("uri", hzz0Var.f97075d), new pqm0("pageType", "PERSONALIZED_SET")));
                return w2a1.f247311a;
            case 21:
                return new cjc0(((jzz0) this.f165563b).f117823a, gxz0.f85365N0);
            case 22:
                return new cjc0((dut) ((tzn) ((sps0) this.f165563b).f212939f).get(), gxz0.f85374W0);
            case 23:
                cvt cvtVar = (cvt) this.f165563b;
                wj50.m88279p(cvtVar);
                return m3h1.m60683w(cvtVar);
            case 24:
                ((gh00) ((xq3) this.f165563b).f264857b).invoke(u801.f227780a);
                return w2a1.f247311a;
            case 25:
                return new cjc0((dut) ((tzn) ((kfp) this.f165563b).f122211f).get(), d901.f46628e);
            case 26:
                return ((tb01) ((lb01) this.f165563b).f131483b.mo27096d().get()).create();
            case 27:
                Set set = ((mc01) this.f165563b).f142006a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : set) {
                    cbm0 cbm0VarMo27095c = ((lc01) obj).mo27095c();
                    Object arrayList = linkedHashMap.get(cbm0VarMo27095c);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(cbm0VarMo27095c, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                return linkedHashMap;
            case 28:
                return ((de01) ((ee01) this.f165563b).f58639b.mo47264d().get()).create();
            default:
                Set set2 = ((ie01) this.f165563b).f101293a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj2 : set2) {
                    cbm0 cbm0VarMo47263c = ((he01) obj2).mo47263c();
                    Object arrayList2 = linkedHashMap2.get(cbm0VarMo47263c);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap2.put(cbm0VarMo47263c, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                return linkedHashMap2;
        }
    }
}
