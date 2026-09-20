package p204p;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.spotify.authentication.login5setupimpl.NativeLogin5SetupImpl;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.connectivity.NativeAuthenticatedScope;
import com.spotify.connectivity.NativeConnectionTypeProvider;
import com.spotify.connectivity.NativeConnectivityPolicyProvider;
import com.spotify.connectivity.auth.NativeCredentialsStorage;
import com.spotify.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.core.coreimpl.NativeApplicationScopeImpl;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.yourlibrary.yourlibraryx.shared.offlinesync.DownloadProgressBannerView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class eph implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61649a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f61650b;

    public /* synthetic */ eph(Object obj, int i) {
        this.f61649a = i;
        this.f61650b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gb80 gb80Var;
        fb80 fb80VarMo31987b;
        View viewM66905d;
        int width;
        int i = this.f61649a;
        Object obj = this.f61650b;
        switch (i) {
            case 0:
                ((fph) obj).f71859Z.invoke();
                return;
            case 1:
                fxi fxiVar = (fxi) obj;
                oc80 oc80Var = fxiVar.f74381d;
                if (!fxiVar.f74378a || (gb80Var = fxiVar.f74379b) == null || (fb80VarMo31987b = gb80Var.mo31987b()) == null) {
                    return;
                }
                if (fb80VarMo31987b.compareTo(oc80Var.f163857d) < 0) {
                    oc80Var.m66678i(fb80VarMo31987b);
                }
                if (fb80VarMo31987b == fb80.f67750a && fxiVar.f74378a) {
                    fxiVar.f74380c.removeCallbacksAndMessages(null);
                    gb80 gb80Var2 = fxiVar.f74379b;
                    if (gb80Var2 != null) {
                        gb80Var2.mo31988d(fxiVar.f74382e);
                    }
                    fxiVar.f74379b = null;
                    fxiVar.f74378a = false;
                    return;
                }
                return;
            case 2:
                o1j o1jVar = (o1j) obj;
                o1jVar.m66072a().prepareForShutdown();
                NativeLogin5SetupImpl nativeLogin5SetupImpl = o1jVar.f160770M0;
                if (nativeLogin5SetupImpl == null) {
                    wj50.m88260d0("nativeLogin5Setup");
                    throw null;
                }
                nativeLogin5SetupImpl.destroy();
                o1jVar.m66072a().destroy();
                NativeConnectivityPolicyProvider nativeConnectivityPolicyProvider = o1jVar.f160779Z;
                if (nativeConnectivityPolicyProvider == null) {
                    wj50.m88260d0("nativeConnectivityPolicyProvider");
                    throw null;
                }
                nativeConnectivityPolicyProvider.destroy();
                NativeConnectionTypeProvider nativeConnectionTypeProvider = o1jVar.f160778Y;
                if (nativeConnectionTypeProvider == null) {
                    wj50.m88260d0("nativeConnectionTypeProvider");
                    throw null;
                }
                nativeConnectionTypeProvider.destroy();
                NativeCredentialsStorage nativeCredentialsStorage = o1jVar.f160777X;
                if (nativeCredentialsStorage == null) {
                    wj50.m88260d0("nativeCredentialsStorage");
                    throw null;
                }
                nativeCredentialsStorage.destroy();
                NativeConnectivityManager nativeConnectivityManager = o1jVar.f160789t;
                if (nativeConnectivityManager != null) {
                    nativeConnectivityManager.destroy();
                    return;
                } else {
                    wj50.m88260d0("nativeConnectivityManager");
                    throw null;
                }
            case 3:
                NativeAuthenticatedScope nativeAuthenticatedScope = ((p1j) obj).f173118t;
                if (nativeAuthenticatedScope != null) {
                    nativeAuthenticatedScope.destroy();
                    return;
                } else {
                    wj50.m88260d0("authenticatedScope");
                    throw null;
                }
            case 4:
                ((csk) obj).m33777c();
                return;
            case 5:
                btk btkVar = (btk) obj;
                NativeApplicationScopeImpl nativeApplicationScopeImpl = btkVar.f30886g;
                if (nativeApplicationScopeImpl == null) {
                    wj50.m88260d0("nativeCoreApplicationScopeImpl");
                    throw null;
                }
                nativeApplicationScopeImpl.prepareForShutdown();
                NativeApplicationScopeImpl nativeApplicationScopeImpl2 = btkVar.f30886g;
                if (nativeApplicationScopeImpl2 != null) {
                    nativeApplicationScopeImpl2.destroy();
                    return;
                } else {
                    wj50.m88260d0("nativeCoreApplicationScopeImpl");
                    throw null;
                }
            case 6:
                ago agoVar = (ago) obj;
                agoVar.f15452p.set(false);
                agoVar.m25877n();
                return;
            case 7:
                jfg1.m53184g(jfg1.m53183f("", (JSONObject) obj));
                return;
            case 8:
                zfp zfpVar = (zfp) obj;
                ((TextView) zfpVar.f282363g.f286303f).setVisibility(8);
                ((View) zfpVar.f282363g.f286304g).setVisibility(8);
                return;
            case 9:
                ((lqk) obj).invoke();
                return;
            case 10:
                aop aopVar = (aop) obj;
                u12 u12Var = aopVar.f17732a;
                pzs0 pzs0Var = aopVar.f17734c;
                int bottom = ((ConstraintLayout) pzs0Var.f183794b).getBottom() - aopVar.f17738g;
                ((LinearLayout.LayoutParams) ((CollapsingToolbarLayout) u12Var.f225653g).getLayoutParams()).setMargins(0, -bottom, 0, 0);
                View view = (View) u12Var.f225656t;
                view.getLayoutParams().height = bottom;
                view.setVisibility(0);
                BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) u12Var.f225650d;
                if (behaviorRetainingAppBarLayout.getHeight() - behaviorRetainingAppBarLayout.getBottom() == 0) {
                    fn20.m42207k(u12Var, fn20.m42202f((ConstraintLayout) pzs0Var.f183794b), false);
                    return;
                }
                return;
            case 11:
                ((RecyclerView) ((ycm0) ((pfp) obj).f177126c).f271529d).setVisibility(8);
                return;
            case 12:
                FrameLayout frameLayout = (FrameLayout) obj;
                if (frameLayout.getChildCount() > 1) {
                    frameLayout.removeViewAt(0);
                    return;
                }
                return;
            case 13:
                hsg1.m48458z(((p36) obj).m68992b().f190689c);
                return;
            case 14:
                ((zbq) obj).m95875f();
                return;
            case 15:
                ugr ugrVar = (ugr) obj;
                ugrVar.f230236D1.onDismiss(ugrVar.f230244L1);
                return;
            case 16:
                g4s g4sVar = (g4s) obj;
                String strM83451s = umg1.m83451s("videoPodcastsDownloadAudioOnly");
                g4sVar.f76517d.mo47346g(strM83451s);
                g4sVar.f76518e.m27127a(new b07(strM83451s));
                return;
            case 17:
                ((f6s) obj).f66494a.m37960e();
                return;
            case 18:
                int i2 = DownloadProgressBannerView.f7133e;
                ((DownloadProgressBannerView) obj).m23259a();
                return;
            case 19:
                ngs ngsVar = (ngs) obj;
                ogs ogsVar = ngsVar.f153789e;
                int i3 = ngsVar.f153787c.f240691o;
                int i4 = ngsVar.f153786b;
                boolean z = i4 == 3;
                if (z) {
                    viewM66905d = ogsVar.m66905d(3);
                    width = (viewM66905d != null ? -viewM66905d.getWidth() : 0) + i3;
                } else {
                    viewM66905d = ogsVar.m66905d(5);
                    width = ogsVar.getWidth() - i3;
                }
                if (viewM66905d != null) {
                    if (((!z || viewM66905d.getLeft() >= width) && (z || viewM66905d.getLeft() <= width)) || ogsVar.m66907f(viewM66905d) != 0) {
                        return;
                    }
                    lgs lgsVar = (lgs) viewM66905d.getLayoutParams();
                    ngsVar.f153787c.m85316r(viewM66905d, width, viewM66905d.getTop());
                    lgsVar.f133279c = true;
                    ogsVar.invalidate();
                    View viewM66905d2 = ogsVar.m66905d(i4 == 3 ? 5 : 3);
                    if (viewM66905d2 != null) {
                        ogsVar.m66903b(viewM66905d2);
                    }
                    if (ogsVar.f165228S0) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = ogsVar.getChildCount();
                    for (int i5 = 0; i5 < childCount; i5++) {
                        ogsVar.getChildAt(i5).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    ogsVar.f165228S0 = true;
                    return;
                }
                return;
            case 20:
                rhs rhsVar = (rhs) obj;
                rhsVar.f199327M0 = null;
                rhsVar.drawableStateChanged();
                return;
            case 21:
                o3x o3xVar = (o3x) obj;
                xst xstVar = o3xVar.f161471T1;
                if (xstVar != null) {
                    xstVar.m91994z(o3xVar.f161472U1);
                    return;
                } else {
                    wj50.m88260d0("viewBinder");
                    throw null;
                }
            case 22:
                ((ias) obj).invoke();
                return;
            case 23:
                ufx ufxVar = (ufx) obj;
                ufxVar.f229895R0.setItemAnimator(ufxVar.f229908a1);
                return;
            case 24:
                ((xcw) obj).invoke();
                return;
            case 25:
                bey beyVar = (bey) obj;
                ValueAnimator valueAnimator = beyVar.f26480X0;
                int i6 = beyVar.f26482Y0;
                if (i6 == 1) {
                    valueAnimator.cancel();
                } else if (i6 != 2) {
                    return;
                }
                beyVar.f26482Y0 = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER);
                valueAnimator.start();
                return;
            case 26:
                hnz hnzVar = (hnz) obj;
                b450 b450Var = hnzVar.f93407e;
                hnzVar.f93407e = null;
                if (b450Var == null) {
                    hnzVar.f93408f = false;
                    return;
                } else {
                    hnzVar.f93405c.invoke(b450Var);
                    hnz.f93402h.postDelayed(this, hnzVar.f93404b);
                    return;
                }
            case 27:
                ((nry) obj).invoke();
                return;
            case 28:
                i500 i500Var = (i500) obj;
                if (i500Var.f98710k1 != null) {
                    i500Var.m49714m0().getClass();
                    return;
                }
                return;
            default:
                ((c700) obj).m31658z(true);
                return;
        }
    }
}
