package p204p;

import android.app.Application;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import androidx.webkit.WebViewStartupException;
import com.google.android.gms.internal.cast.zzxo;
import com.spotify.widgets.npvwidget.WidgetsProxyActivity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class bnd1 implements zmd1, Function, zmm0, dne1, s4h1, r9w0 {

    /* JADX INFO: renamed from: a */
    public final Object f28810a;

    public /* synthetic */ bnd1(Application application) {
        jmg1 jmg1Var = null;
        try {
            jmg1 jmg1Var2 = jmg1.f113864c;
            jmg1Var2 = jmg1Var2 == null ? new jmg1(application, jmg1.f113863b, null, jmg1.f113862a) : jmg1Var2;
            jmg1.f113864c = jmg1Var2;
            jmg1Var = jmg1Var2;
        } catch (Exception unused) {
        }
        this.f28810a = jmg1Var;
    }

    @Override // p204p.dne1
    /* JADX INFO: renamed from: a */
    public void mo29958a(int i, String str) {
        hsb1 hsb1Var = (hsb1) this.f28810a;
        kv91 kv91Var = (kv91) hsb1Var.f94654b;
        ekh0 ekh0Var = (ekh0) hsb1Var.f94657e;
        ekh0Var.getClass();
        yt91 yt91VarM96903c = ekh0Var.f60453a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("list", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        Integer numValueOf = Integer.valueOf(i);
        yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("option", str, numValueOf, null, null));
        yt91VarM96903c2.f276056j = true;
        kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.r9w0
    public void accept(Object obj, Object obj2) {
        ogx ogxVar = (ogx) this.f28810a;
        veg1 veg1Var = new veg1(0, (ev61) obj2);
        a1g1 a1g1Var = (a1g1) ((nng1) obj).m37438q();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i = pmf1.f179064a;
        parcelObtain.writeStrongBinder(veg1Var);
        parcelObtain.writeInt(1);
        ogxVar.writeToParcel(parcelObtain, 0);
        a1g1Var.m24431C(2, parcelObtain);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        prd1 prd1Var = (prd1) this.f28810a;
        return prd1.m70709a(prd1Var, (nrd1) obj, k0e1.m54988g(prd1Var.f180569h.f281556b, dau.f47107a).map(pqq0.f180381Y0).firstOrError());
    }

    @Override // p204p.zmd1
    /* JADX INFO: renamed from: b */
    public void mo29959b(final dnd1 dnd1Var, final gc41 gc41Var) {
        WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface = (WebViewProviderFactoryBoundaryInterface) this.f28810a;
        final int i = 2;
        Consumer<BiConsumer<Integer, Object>> consumer = new Consumer() { // from class: p.and1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        gc41 gc41Var2 = (gc41) dnd1Var;
                        end1 end1Var = new end1(1);
                        end1Var.f61145b = new ArrayList();
                        end1Var.f61146c = new ArrayList();
                        ((Consumer) obj).accept(end1Var);
                        new Handler(Looper.getMainLooper()).post(new cmd1(gc41Var2, end1Var));
                        break;
                    case 1:
                        gc41 gc41Var3 = (gc41) dnd1Var;
                        end1 end1Var2 = new end1(0);
                        ((Consumer) obj).accept(end1Var2);
                        new Handler(Looper.getMainLooper()).post(new b381(15, gc41Var3, ((Integer) end1Var2.f61145b) == null ? new WebViewStartupException((String) end1Var2.f61146c) : new WebViewStartupException((String) end1Var2.f61146c)));
                        break;
                    default:
                        dnd1 dnd1Var2 = (dnd1) dnd1Var;
                        dnd1Var2.getClass();
                        ((BiConsumer) obj).accept(0, dnd1Var2.f50764a);
                        break;
                }
            }
        };
        final int i2 = 0;
        final int i3 = 1;
        webViewProviderFactoryBoundaryInterface.startUpWebView(consumer, new Consumer() { // from class: p.and1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        gc41 gc41Var2 = (gc41) gc41Var;
                        end1 end1Var = new end1(1);
                        end1Var.f61145b = new ArrayList();
                        end1Var.f61146c = new ArrayList();
                        ((Consumer) obj).accept(end1Var);
                        new Handler(Looper.getMainLooper()).post(new cmd1(gc41Var2, end1Var));
                        break;
                    case 1:
                        gc41 gc41Var3 = (gc41) gc41Var;
                        end1 end1Var2 = new end1(0);
                        ((Consumer) obj).accept(end1Var2);
                        new Handler(Looper.getMainLooper()).post(new b381(15, gc41Var3, ((Integer) end1Var2.f61145b) == null ? new WebViewStartupException((String) end1Var2.f61146c) : new WebViewStartupException((String) end1Var2.f61146c)));
                        break;
                    default:
                        dnd1 dnd1Var2 = (dnd1) gc41Var;
                        dnd1Var2.getClass();
                        ((BiConsumer) obj).accept(0, dnd1Var2.f50764a);
                        break;
                }
            }
        }, new Consumer() { // from class: p.and1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        gc41 gc41Var2 = (gc41) gc41Var;
                        end1 end1Var = new end1(1);
                        end1Var.f61145b = new ArrayList();
                        end1Var.f61146c = new ArrayList();
                        ((Consumer) obj).accept(end1Var);
                        new Handler(Looper.getMainLooper()).post(new cmd1(gc41Var2, end1Var));
                        break;
                    case 1:
                        gc41 gc41Var3 = (gc41) gc41Var;
                        end1 end1Var2 = new end1(0);
                        ((Consumer) obj).accept(end1Var2);
                        new Handler(Looper.getMainLooper()).post(new b381(15, gc41Var3, ((Integer) end1Var2.f61145b) == null ? new WebViewStartupException((String) end1Var2.f61146c) : new WebViewStartupException((String) end1Var2.f61146c)));
                        break;
                    default:
                        dnd1 dnd1Var2 = (dnd1) gc41Var;
                        dnd1Var2.getClass();
                        ((BiConsumer) obj).accept(0, dnd1Var2.f50764a);
                        break;
                }
            }
        });
    }

    @Override // p204p.zmm0
    /* JADX INFO: renamed from: c */
    public Observable mo24811c() {
        return ((WidgetsProxyActivity) this.f28810a).f6991e1;
    }

    @Override // p204p.zmd1
    /* JADX INFO: renamed from: d */
    public void mo29960d(dnd1 dnd1Var, zga1 zga1Var) {
        ((WebViewProviderFactoryBoundaryInterface) this.f28810a).startUpWebView(new fga(new kkc1(dnd1Var, 4)), new fga(new va91(new zga1(zga1Var, 16), 13)));
    }

    @Override // p204p.dne1
    /* JADX INFO: renamed from: e */
    public void mo29961e(int i, String str) {
        hsb1 hsb1Var = (hsb1) this.f28810a;
        kv91 kv91Var = (kv91) hsb1Var.f94654b;
        ekh0 ekh0Var = (ekh0) hsb1Var.f94657e;
        ekh0Var.getClass();
        yt91 yt91VarM96903c = ekh0Var.f60453a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("list", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        Integer numValueOf = Integer.valueOf(i);
        yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("option", str, numValueOf, null, null));
        yt91VarM96903c2.f276056j = true;
        zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = zt91VarM94607a2;
        nu91Var.f248108b = st91.f213865b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
    }

    @Override // p204p.zmd1
    /* JADX INFO: renamed from: f */
    public String[] mo29962f() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f28810a).getSupportedFeatures();
    }

    /* JADX INFO: renamed from: g */
    public void m29963g(List list) {
        synchronized (jmg1.class) {
            try {
                jmg1 jmg1Var = (jmg1) this.f28810a;
                if (jmg1Var != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jmg1Var.m53779a((omg1) it.next());
                    }
                    int iM53780c = jmg1Var.m53780c() - 500;
                    if (iM53780c > 0) {
                        jmg1Var.m53782f(g6f.m43714b1(jmg1Var.m53781e(), iM53780c));
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m29964h(int i, Object obj, lch1 lch1Var) throws zzxo {
        oah1 oah1Var = (oah1) this.f28810a;
        r9h1 r9h1Var = (r9h1) obj;
        oah1Var.m66554I(i, 2);
        oah1Var.m66563R(r9h1Var.mo44226c(lch1Var));
        lch1Var.mo32261d(r9h1Var, this);
    }

    @Override // p204p.s4h1
    public Object zza(Object obj) {
        return new x071((p6h1) obj, (Matrix) this.f28810a);
    }

    public /* synthetic */ bnd1(Object obj) {
        this.f28810a = obj;
    }

    public bnd1(oah1 oah1Var) {
        Charset charset = rbh1.f197602a;
        this.f28810a = oah1Var;
        oah1Var.f163334d = this;
    }
}
