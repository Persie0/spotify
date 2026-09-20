package p204p;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Messenger;
import android.widget.EditText;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity;
import com.spotify.nowplaying.scroll.view.NowPlayingScrollView;
import com.spotify.nowplaying.scroll.view.PeekScrollView;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingFrameLayout;
import com.spotify.premiumdestination.destination.elementimpl.PremiumPageListElementImpl$ui$1$1$layoutManager$1;
import com.spotify.yourlibrary.uiusecases.filterrow.chips.LibraryChipsScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class kk00 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f123467a;

    /* JADX INFO: renamed from: b */
    public final Object f123468b;

    public /* synthetic */ kk00(Object obj, int i) {
        this.f123467a = i;
        this.f123468b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0246  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        int iM68122i;
        boolean z = true;
        z = true;
        int iM68122i2 = 0;
        switch (this.f123467a) {
            case 0:
                ((u790) this.f123468b).cancel(true);
                return;
            case 1:
                ru00 ru00Var = (ru00) this.f123468b;
                ru00Var.f202716a.f31643a.mo31986a(new dz2(ru00Var, 8));
                return;
            case 2:
                tb20.m80371a((hqb) this.f123468b);
                return;
            case 3:
                u010 u010Var = (u010) this.f123468b;
                if (((yb20) u010Var.f225347d).f271054a.getAndSet(null) != null) {
                    ((Handler) u010Var.f225345b).removeCallbacks((yb20) u010Var.f225347d);
                    return;
                }
                return;
            case 4:
                ((InAppBrowserLauncherActivity) this.f123468b).finish();
                return;
            case 5:
                qv50 qv50Var = (qv50) this.f123468b;
                if (qv50Var.f192896c != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = qv50Var.f192892Y0;
                    long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
                    AbstractC0110a layoutManager = qv50Var.f192880O0.getLayoutManager();
                    if (qv50Var.f192890X0 == null) {
                        qv50Var.f192890X0 = new Rect();
                    }
                    layoutManager.m1118p(qv50Var.f192890X0, qv50Var.f192896c.f50039a);
                    if (layoutManager.mo951q()) {
                        int i = (int) (qv50Var.f192902i + qv50Var.f192900g);
                        int paddingLeft = (i - qv50Var.f192890X0.left) - qv50Var.f192880O0.getPaddingLeft();
                        float f = qv50Var.f192900g;
                        if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((qv50Var.f192896c.f50039a.getWidth() + i) + qv50Var.f192890X0.right) - (qv50Var.f192880O0.getWidth() - qv50Var.f192880O0.getPaddingRight())) <= 0)) {
                            iM68122i = 0;
                        } else {
                            iM68122i = paddingLeft;
                        }
                    } else {
                        iM68122i = 0;
                    }
                    if (layoutManager.mo953r()) {
                        int i2 = (int) (qv50Var.f192903t + qv50Var.f192901h);
                        int paddingTop = (i2 - qv50Var.f192890X0.top) - qv50Var.f192880O0.getPaddingTop();
                        float f2 = qv50Var.f192901h;
                        if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((qv50Var.f192896c.f50039a.getHeight() + i2) + qv50Var.f192890X0.bottom) - (qv50Var.f192880O0.getHeight() - qv50Var.f192880O0.getPaddingBottom())) > 0)) {
                            iM68122i2 = paddingTop;
                        }
                    }
                    if (iM68122i != 0) {
                        ov50 ov50Var = qv50Var.f192891Y;
                        RecyclerView recyclerView = qv50Var.f192880O0;
                        int width = qv50Var.f192896c.f50039a.getWidth();
                        qv50Var.f192880O0.getWidth();
                        iM68122i = ov50Var.m68122i(recyclerView, width, iM68122i, j2);
                    }
                    int i3 = iM68122i;
                    if (iM68122i2 != 0) {
                        ov50 ov50Var2 = qv50Var.f192891Y;
                        RecyclerView recyclerView2 = qv50Var.f192880O0;
                        int height = qv50Var.f192896c.f50039a.getHeight();
                        qv50Var.f192880O0.getHeight();
                        iM68122i2 = ov50Var2.m68122i(recyclerView2, height, iM68122i2, j2);
                    }
                    if (i3 == 0 && iM68122i2 == 0) {
                        qv50Var.f192892Y0 = Long.MIN_VALUE;
                        return;
                    }
                    if (qv50Var.f192892Y0 == Long.MIN_VALUE) {
                        qv50Var.f192892Y0 = jCurrentTimeMillis;
                    }
                    qv50Var.f192880O0.scrollBy(i3, iM68122i2);
                    dkv0 dkv0Var = qv50Var.f192896c;
                    if (dkv0Var != null) {
                        qv50Var.m73970q(dkv0Var);
                    }
                    qv50Var.f192880O0.removeCallbacks(qv50Var.f192881P0);
                    RecyclerView recyclerView3 = qv50Var.f192880O0;
                    WeakHashMap weakHashMap = mec1.f142677a;
                    recyclerView3.postOnAnimation(this);
                    return;
                }
                return;
            case 6:
                ue60 ue60Var = (ue60) this.f123468b;
                ue60Var.f229426m = ue60Var.f229429p;
                ue60Var.f229429p = null;
                ue60Var.m82894c(new ke60(ue60Var, new le60(ue60Var, z ? 1 : 0), 2), "fireOpenConnection");
                return;
            case 7:
                ((oe21) this.f123468b).reset();
                return;
            case 8:
                LibraryChipsScrollView libraryChipsScrollView = (LibraryChipsScrollView) this.f123468b;
                libraryChipsScrollView.fullScroll(libraryChipsScrollView.f7122a ? 66 : 17);
                return;
            case 9:
                hw80 hw80Var = (hw80) this.f123468b;
                hw80Var.f95882b = null;
                hw80Var.f95881a = null;
                return;
            case 10:
                ik90 ik90Var = (ik90) this.f123468b;
                if (ik90Var.f103073d) {
                    ik90Var.f103071b.mo33102k(ik90Var);
                    ik90Var.f103073d = false;
                }
                ik90Var.f103075f = null;
                return;
            case 11:
                ((yr90) this.f123468b).f275426c.m87889c();
                return;
            case 12:
                ((l7a0) this.f123468b).mo58411l();
                return;
            case 13:
                t8d0 t8d0Var = (t8d0) this.f123468b;
                t8d0Var.f218067g.f35469e.remove(((Messenger) t8d0Var.f218064d.f178196b).getBinder());
                return;
            case 14:
                ArrayList arrayList = ((sgd0) this.f123468b).f208834e;
                List listM43728j1 = g6f.m43728j1(arrayList);
                arrayList.clear();
                Iterator it = listM43728j1.iterator();
                while (it.hasNext()) {
                    ((eh00) it.next()).invoke();
                }
                return;
            case 15:
                ((xpo) this.f123468b).m91717r();
                return;
            case 16:
                ((MotionLayout) this.f123468b).f645L1.m60537a();
                return;
            case 17:
                ((jfi0) this.f123468b).f111908a.mo47346g(lfi0.f132956a);
                return;
            case 18:
                ((wwi0) this.f123468b).m89206a().destroy();
                return;
            case 19:
                NowPlayingScrollView nowPlayingScrollView = (NowPlayingScrollView) this.f123468b;
                nowPlayingScrollView.m401A(0 - nowPlayingScrollView.getScrollX(), 0 - nowPlayingScrollView.getScrollY(), false);
                return;
            case 20:
                dii0 dii0Var = (dii0) this.f123468b;
                dii0Var.getClass();
                ((Context) dii0Var.f49377b).startActivity(new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(pj10.f178105a).addFlags(268435456));
                return;
            case 21:
                ((vw90) this.f123468b).m86546u();
                return;
            case 22:
                ((OverlayHidingFrameLayout) this.f123468b).mo15995a(true);
                return;
            case 23:
                ldi0 ldi0Var = ((kfm0) this.f123468b).f122186b;
                if (ldi0Var != null) {
                    for (c651 c651Var : ((LinkedHashMap) ldi0Var.f132180c).values()) {
                        if (c651Var.f34397f) {
                            c651Var.f34398g.m33101j(null);
                            c651Var.f34396e = null;
                        }
                    }
                    return;
                }
                return;
            case 24:
                PeekScrollView peekScrollView = (PeekScrollView) this.f123468b;
                peekScrollView.m401A(0 - peekScrollView.getScrollX(), 0 - peekScrollView.getScrollY(), false);
                return;
            case 25:
                for (EditText editText : (List) ((xq3) this.f123468b).f264858c) {
                    editText.setGravity(8388611);
                    editText.setGravity(17);
                }
                return;
            case 26:
                d2p0 d2p0Var = (d2p0) this.f123468b;
                jh50 jh50Var = d2p0Var.f44624c;
                boolean zM75469a = d2p0Var.f44622b.m75469a();
                if (!d2p0Var.f44611U0 && !zM75469a) {
                    z = false;
                }
                jh50Var.mo53336P(z);
                return;
            case 27:
                ukq0 ukq0Var = (ukq0) this.f123468b;
                synchronized (ukq0Var) {
                    ukq0Var.m83340f("unresolved", false);
                }
                return;
            case 28:
                roq0 roq0Var = (roq0) this.f123468b;
                int iM940h1 = roq0Var.f201325L0.m940h1();
                PremiumPageListElementImpl$ui$1$1$layoutManager$1 premiumPageListElementImpl$ui$1$1$layoutManager$1 = roq0Var.f201325L0;
                premiumPageListElementImpl$ui$1$1$layoutManager$1.f6504e1 = iM940h1 < premiumPageListElementImpl$ui$1$1$layoutManager$1.m1104R() - 1;
                return;
            default:
                xhr0 xhr0Var = (xhr0) this.f123468b;
                xhr0Var.f261694a.getLifecycle().mo31986a(xhr0Var);
                return;
        }
    }
}
