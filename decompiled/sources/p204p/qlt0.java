package p204p;

import android.hardware.SensorManager;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.R;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class qlt0 implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f189920a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f189921b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f189922c;

    public /* synthetic */ qlt0(int i, Object obj, Object obj2) {
        this.f189920a = i;
        this.f189921b = obj;
        this.f189922c = obj2;
    }

    @Override // p204p.ewr
    public final void dispose() {
        qu91 qu91VarM29063F;
        int i = this.f189920a;
        Object obj = this.f189922c;
        Object obj2 = this.f189921b;
        switch (i) {
            case 0:
                ((InputMethodManager) obj2).hideSoftInputFromWindow((IBinder) obj, 0);
                break;
            case 1:
                hhu0 hhu0Var = (hhu0) obj;
                MobiusLoop.Controller controller = (MobiusLoop.Controller) obj2;
                if (((ohu0) controller.mo15602a()).f165551a instanceof l9a0) {
                    phu0 phu0Var = hhu0Var.f91587a;
                    ohu0 ohu0Var = (ohu0) controller.mo15602a();
                    ohu0Var.getClass();
                    ohu0 ohu0VarM66979c = ohu0.m66979c(ohu0Var, null, null, null, 0, 13);
                    ju61 ju61Var = hhu0Var.f91588b;
                    String str = hhu0Var.f91589c;
                    if (str == null) {
                        str = "";
                    }
                    LinkedHashMap linkedHashMap = phu0Var.f177726a;
                    linkedHashMap.clear();
                    linkedHashMap.put(ju61Var + str, ohu0VarM66979c);
                }
                controller.stop();
                controller.disconnect();
                break;
            case 2:
                vwf vwfVar = (vwf) obj;
                LinkedHashMap linkedHashMap2 = ((uwf) obj2).f234647c;
                jv50 jv50Var = (jv50) linkedHashMap2.get(vwfVar);
                if (jv50Var != null) {
                    jv50Var.m54371a(jxf.f117122a);
                }
                linkedHashMap2.remove(vwfVar);
                break;
            case 3:
                ((nf01) obj2).f153199O0.getLifecycle().mo31988d((mxd0) obj);
                break;
            case 4:
                ((gb80) obj2).mo31988d((wpe) obj);
                break;
            case 5:
                ((SensorManager) obj2).unregisterListener((n931) obj);
                break;
            case 6:
                ((hc80) obj2).getLifecycle().mo31988d((sr0) obj);
                break;
            case 7:
                View view = (View) obj2;
                ppg1.m70567k(view);
                cqi0 cqi0Var = wxd1.f256013a;
                view.setTag(R.id.androidx_compose_ui_view_composition_context, (hsh) obj);
                break;
            case 8:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.m1570D((i651) obj);
                }
                break;
            case 9:
                kqi0 kqi0Var = (kqi0) obj2;
                m3r0 m3r0Var = (m3r0) kqi0Var.getValue();
                if (m3r0Var != null) {
                    l3r0 l3r0Var = new l3r0(m3r0Var);
                    voi0 voi0Var = (voi0) obj;
                    if (voi0Var != null) {
                        voi0Var.mo86072a(l3r0Var);
                    }
                    kqi0Var.setValue(null);
                }
                break;
            case 10:
                ((rb71) obj2).f197522c.remove((gh00) obj);
                break;
            case 11:
                ((SensorManager) obj2).unregisterListener((yj71) obj);
                break;
            case 12:
                ((c791) obj2).f34836j.remove((c791) obj);
                break;
            case 13:
                c791 c791Var = (c791) obj2;
                c791Var.getClass();
                p691 p691VarM72225b = ((q691) obj).m72225b();
                if (p691VarM72225b != null) {
                    c791Var.f34835i.remove(p691VarM72225b.f174327a);
                }
                break;
            case 14:
                ((c791) obj2).f34835i.remove((w691) obj);
                break;
            case 15:
                tkm0 tkm0Var = (tkm0) obj2;
                if (tkm0Var != null) {
                    ((y991) obj).f270542c.m69810a(tkm0Var);
                }
                break;
            case 16:
                ((hc80) obj2).getLifecycle().mo31988d((ne2) obj);
                break;
            case 17:
                dnb1 dnb1Var = ((hnb1) obj2).f93288e;
                u4u.m82365b(dnb1Var.f50727a, 4, (ilb1) obj, null, null, 12);
                if (!dnb1Var.f50728b) {
                    wj50.m88279p(dnb1Var.f50731e.m48693o().subscribe());
                } else {
                    dnb1Var.f50729c.m83641b(dnb1Var.f50730d);
                }
                break;
            case 18:
                ((pa9) obj2).m69441f();
                ogq ogqVar = (ogq) obj;
                pa9 pa9Var = ogqVar.f165201a;
                ogqVar.f165201a = null;
                break;
            case 19:
                ((hc80) obj2).getLifecycle().mo31988d((ne2) obj);
                break;
            case 20:
                ((hc80) obj2).getLifecycle().mo31988d((bl81) obj);
                break;
            case 21:
                ((hc80) obj2).getLifecycle().mo31988d((gdc1) obj);
                break;
            case 22:
                kqi0 kqi0Var2 = (kqi0) obj;
                if (((aj40) kqi0Var2.getValue()) != null) {
                    xjp xjpVar = (xjp) obj2;
                    aj40 aj40Var = (aj40) kqi0Var2.getValue();
                    if (aj40Var != null && (qu91VarM29063F = bga.m29063F((dcm0) xjpVar.f262183b)) != null) {
                        qu91VarM29063F.m73887h(aj40Var);
                        break;
                    }
                }
                break;
            case 23:
                ((hc80) obj2).getLifecycle().mo31988d((nbd1) obj);
                break;
            case 24:
                ((hc80) obj2).getLifecycle().mo31988d((ubd1) obj);
                break;
            case 25:
                kqi0 kqi0Var3 = (kqi0) obj;
                if (((aj40) kqi0Var3.getValue()) != null) {
                    ((yfd1) obj2).m93560g((aj40) kqi0Var3.getValue());
                    kqi0Var3.setValue(null);
                }
                break;
            default:
                cxd1 cxd1Var = (cxd1) obj2;
                View view2 = (View) obj;
                int i2 = cxd1Var.f43006v - 1;
                cxd1Var.f43006v = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = mec1.f142677a;
                    cec1.m32550n(view2, null);
                    awd1.m27300e(view2, null);
                    view2.removeOnAttachStateChangeListener(cxd1Var.f43007w);
                }
                break;
        }
    }
}
