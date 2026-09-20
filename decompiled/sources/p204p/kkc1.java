package p204p;

import android.os.Build;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.common.api.Status;
import com.google.android.recaptcha.internal.zzhg;
import com.spotify.appauthorization.builtinauth.model.FieldValidator$ValidationException;
import com.spotify.base.java.logging.Logger;
import com.spotify.interapp.model.AppProtocol$HelloDetailsAppProtocol$HelloDetails;
import com.spotify.interapp.model.AppProtocol$Message;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class kkc1 implements InterfaceC1667ah, Function, r7d1, WebViewStartUpConfigBoundaryInterface, BiFunction, kdl0, alg1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f123566a;

    /* JADX INFO: renamed from: b */
    public final Object f123567b;

    public /* synthetic */ kkc1(Object obj, int i) {
        this.f123566a = i;
        this.f123567b = obj;
    }

    @Override // p204p.alg1
    /* JADX INFO: renamed from: a */
    public void mo26346a(ong1 ong1Var, File file, boolean z) {
        dc31 dc31Var = (dc31) this.f123567b;
        ((HashSet) dc31Var.f47416c).add(file);
        if (z) {
            return;
        }
        ((AtomicBoolean) dc31Var.f47417d).set(false);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        int streamMaxVolume;
        switch (this.f123566a) {
            case 1:
                xwc1 xwc1Var = (xwc1) obj;
                n601 n601Var = xwc1Var.f266634a;
                z5p z5pVar = (z5p) this.f123567b;
                double dM95466a = z5pVar.m95466a();
                hz6 hz6Var = z5pVar.f279596a;
                double d = n601Var.f150655a;
                gh00 gh00Var = n601Var.f150658d;
                if (!nec.m64253p(Double.valueOf(d), dM95466a)) {
                    if (gh00Var != null) {
                        gh00Var.invoke(Boolean.FALSE);
                    }
                    return new yxc1(n601Var, false, dM95466a, null);
                }
                boolean z = false;
                try {
                    streamMaxVolume = ((pz6) hz6Var).f183611a.getStreamMaxVolume(3);
                    break;
                } catch (NullPointerException unused) {
                    streamMaxVolume = 0;
                }
                try {
                    try {
                        ((pz6) hz6Var).f183611a.setStreamVolume(3, q3d0.m72082M(((double) streamMaxVolume) * d), xwc1Var.f266635b ? 1 : 0);
                        break;
                    } catch (NullPointerException unused2) {
                    }
                    z = true;
                } catch (SecurityException e) {
                    Logger.m3967c(e, "Volume adjustment not allowed to toggle Do Not Disturb", new Object[0]);
                }
                Double dValueOf = z ? Double.valueOf(z5pVar.m95466a()) : null;
                if (gh00Var != null) {
                    gh00Var.invoke(Boolean.valueOf(z));
                }
                return new yxc1(n601Var, z, dM95466a, dValueOf);
            default:
                return (gx80) ((nmj0) ((a531) this.f123567b).f12416d).invoke((YourLibraryDecorateResponse) obj);
        }
    }

    /* JADX INFO: renamed from: b */
    public swd1 m56710b() {
        return ((hwd1) this.f123567b).mo30680b();
    }

    /* JADX INFO: renamed from: c */
    public void m56711c(dx40 dx40Var) {
        ((hwd1) this.f123567b).mo40142c(2, dx40Var);
    }

    @Override // p204p.r7d1
    /* JADX INFO: renamed from: d */
    public void mo28350d(y0i0 y0i0Var) {
        u4i u4iVar = (u4i) this.f123567b;
        if (((tw80) u4iVar.f226726e) != null) {
            String strM92588f = y0i0Var.m92588f(1);
            AppProtocol$HelloDetailsAppProtocol$HelloDetails appProtocol$HelloDetailsAppProtocol$HelloDetails = (AppProtocol$HelloDetailsAppProtocol$HelloDetails) y0i0Var.m92587e(AppProtocol$HelloDetailsAppProtocol$HelloDetails.class, 2);
            tw80 tw80Var = (tw80) u4iVar.f226726e;
            u4i u4iVar2 = (u4i) tw80Var.f224367c;
            b6q b6qVar = (b6q) tw80Var.f224366b;
            cke ckeVar = b6qVar.f24015k;
            String str = appProtocol$HelloDetailsAppProtocol$HelloDetails.authid;
            List list = appProtocol$HelloDetailsAppProtocol$HelloDetails.authmethods;
            if (str == null) {
                str = "";
            }
            hve0 hve0Var = b6qVar.f24014j;
            if (!((InterfaceC1810ed) tw80Var.f224372h).mo38504b(new nbb(str, ckeVar.f38937a))) {
                u4iVar2.m82339j(new AppProtocol$Message("Client not allowed"), "wamp.error.not_authorized");
                tw80Var.m81655g(false);
                return;
            }
            try {
                hve0Var.getClass();
                hve0.m48824B(strM92588f, appProtocol$HelloDetailsAppProtocol$HelloDetails);
                if (b6qVar.f24008d) {
                    hve0.m48825C(appProtocol$HelloDetailsAppProtocol$HelloDetails);
                }
                List list2 = appProtocol$HelloDetailsAppProtocol$HelloDetails.info.requiredFeatures;
                if (!(list2 != null ? i661.f99113a.containsAll(list2) : true)) {
                    u4iVar2.m82339j(new AppProtocol$Message("Feature mismatch"), "com.spotify.error.unsupported_version");
                    tw80Var.m81655g(false);
                    return;
                }
                b6qVar.f184927a = appProtocol$HelloDetailsAppProtocol$HelloDetails;
                if (list.isEmpty()) {
                    tw80Var.m81657j();
                } else {
                    ob5 ob5Var = (ob5) b6qVar.f24007c.get(list.get(0));
                    if (ob5Var == null) {
                        u4iVar2.m82339j(new AppProtocol$Message("Unsupported authentication method"), "wamp.error");
                        tw80Var.m81655g(false);
                    } else {
                        fy7 fy7Var = new fy7(appProtocol$HelloDetailsAppProtocol$HelloDetails.authid, appProtocol$HelloDetailsAppProtocol$HelloDetails.extras, list, ckeVar);
                        try {
                            ob5Var.m66624b(fy7Var);
                            tw80Var.f224373i = ob5Var.m66623a(fy7Var).subscribe(new vv2(tw80Var, 12), new xc5(tw80Var, 18));
                        } catch (FieldValidator$ValidationException e) {
                            Logger.m3966b(e.getMessage(), new Object[0]);
                            int i = AppProtocol$Message.f4358d;
                            u4iVar2.m82339j(gif1.m44794e(e), "wamp.error.invalid_argument");
                            tw80Var.m81655g(false);
                        }
                    }
                }
                ((m401) tw80Var.f224368d).m60752a(b6qVar);
            } catch (FieldValidator$ValidationException e2) {
                Logger.m3966b(e2.getMessage(), new Object[0]);
                int i2 = AppProtocol$Message.f4358d;
                u4iVar2.m82339j(gif1.m44794e(e2), "wamp.error.invalid_argument");
                tw80Var.m81655g(false);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m56712e(dx40 dx40Var) {
        ((hwd1) this.f123567b).mo30681e(dx40Var);
    }

    /* JADX INFO: renamed from: f */
    public void m56713f(dx40 dx40Var) {
        ((hwd1) this.f123567b).mo30682g(dx40Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: g */
    public Object m56714g(String str, egf1 egf1Var, ibk ibkVar) throws zzhg {
        oog1 oog1Var;
        zz11 zz11Var = zz11.f287826e2;
        if (ibkVar instanceof oog1) {
            oog1Var = (oog1) ibkVar;
            int i = oog1Var.f167622c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oog1Var.f167622c = i - Integer.MIN_VALUE;
            } else {
                oog1Var = new oog1(this, ibkVar);
            }
        } else {
            oog1Var = new oog1(this, ibkVar);
        }
        Object objM45436a = oog1Var.f167620a;
        int i2 = oog1Var.f167622c;
        int i3 = 8;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(objM45436a);
                    gqg1 gqg1Var = (gqg1) this.f123567b;
                    byte[] bArrM55800d = egf1Var.m55800d();
                    oog1Var.f167622c = 1;
                    objM45436a = gqg1Var.m45436a(str, bArrM55800d, oog1Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM45436a == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM45436a);
                }
                jqg1 jqg1Var = (jqg1) objM45436a;
                try {
                    return (gef1) jqg1Var.m54091b(gef1.m44472H());
                } catch (zzhg e) {
                    if (!wj50.m88271j(e.f2336b, zz11.f287839j1)) {
                        throw e;
                    }
                    try {
                        zzhg zzhgVar = (zzhg) zzhg.f2334f.get(fgf1.m41579x(jqg1Var.f114914b).m41580w());
                        if (zzhgVar == null) {
                            throw new zzhg(zz11.f287820c2, zz11.f287816b1, (String) null, 12);
                        }
                        throw zzhgVar;
                    } catch (Exception e2) {
                        throw new zzhg(zz11Var, zz11.f287783M0, e2.getMessage(), i3);
                    }
                }
            } catch (Exception e3) {
                throw new zzhg(zz11Var, zz11.f287781L0, e3.getMessage(), i3);
            }
        } catch (zzhg e4) {
            throw e4;
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public Executor getBackgroundExecutor() {
        return ((dnd1) this.f123567b).f50764a;
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public Set getProfileNamesToLoad() {
        ((dnd1) this.f123567b).getClass();
        return null;
    }

    @Override // p204p.kdl0
    public void onSuccess(Object obj) {
        ura0 ura0Var = obc.f163599m;
        ((d151) this.f123567b).m1493a(new Status(0, null, null, null));
    }

    @Override // p204p.InterfaceC1667ah
    /* JADX INFO: renamed from: q */
    public boolean mo1561q(View view) {
        lkc1 lkc1Var = (lkc1) this.f123567b;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = lkc1Var.f134324d;
        if (viewPager2.f1388S0) {
            viewPager2.m1144e(currentItem, true);
        }
        return true;
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public boolean shouldRunUiThreadStartUpTasks() {
        ((dnd1) this.f123567b).getClass();
        return true;
    }

    public kkc1() {
        this.f123566a = 6;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.f123567b = new gwd1();
            return;
        }
        if (i >= 31) {
            this.f123567b = new fwd1();
            return;
        }
        if (i >= 30) {
            this.f123567b = new ewd1();
        } else if (i >= 29) {
            this.f123567b = new dwd1();
        } else {
            this.f123567b = new bwd1();
        }
    }

    public kkc1(swd1 swd1Var) {
        this.f123566a = 6;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.f123567b = new gwd1(swd1Var);
            return;
        }
        if (i >= 31) {
            this.f123567b = new fwd1(swd1Var);
            return;
        }
        if (i >= 30) {
            this.f123567b = new ewd1(swd1Var);
        } else if (i >= 29) {
            this.f123567b = new dwd1(swd1Var);
        } else {
            this.f123567b = new bwd1(swd1Var);
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        Map map = (Map) obj2;
        vrd1 vrd1Var = (vrd1) this.f123567b;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : (List) obj) {
            api apiVar = (api) obj3;
            if (apiVar.mo26697m() || apiVar.mo26699o()) {
                if (!apiVar.mo26700p() && !wl51.m88460J0(apiVar.mo26689e())) {
                    arrayList.add(obj3);
                }
            }
        }
        List<api> listM43711Y0 = g6f.m43711Y0(arrayList, vrd1Var.f244189e.m26960a(map));
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(listM43711Y0, 10));
        for (api apiVar2 : listM43711Y0) {
            arrayList2.add(new d5r(apiVar2.mo26689e(), apiVar2.getName(), apiVar2.getType().toString(), apiVar2.mo26684F(), apiVar2.mo26704t(), apiVar2.mo26697m() ? null : (Long) map.get(vrd1Var.f244190f.m35754a(apiVar2.mo26689e())), Boolean.valueOf(apiVar2.mo26697m())));
        }
        return arrayList2;
    }
}
