package p204p;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.encoreconsumermobile.elements.entityaction.EntityActionView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class ti3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f220539a;

    /* JADX INFO: renamed from: b */
    public int f220540b;

    /* JADX INFO: renamed from: c */
    public final Object f220541c;

    /* JADX INFO: renamed from: d */
    public final Object f220542d;

    /* JADX WARN: Multi-variable type inference failed */
    public ti3(int i, wt81 wt81Var, eh00 eh00Var) {
        this.f220539a = 12;
        this.f220540b = i;
        this.f220541c = wt81Var;
        this.f220542d = (qe70) eh00Var;
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [p.eh00, p.qe70] */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        gbb gbbVar;
        ArrayList arrayList2;
        y7h1 y7h1Var;
        switch (this.f220539a) {
            case 0:
                Rect rect = new Rect();
                View view = (View) this.f220541c;
                view.getHitRect(rect);
                int i = rect.top;
                int i2 = this.f220540b;
                rect.top = i - i2;
                rect.left -= i2;
                rect.bottom += i2;
                rect.right += i2;
                ((ui3) this.f220542d).setTouchDelegate(new TouchDelegate(rect, view));
                return;
            case 1:
                ((TextView) this.f220541c).setTypeface((Typeface) this.f220542d, this.f220540b);
                return;
            case 2:
                ((BottomSheetBehavior) this.f220542d).m1580N((View) this.f220541c, this.f220540b);
                return;
            case 3:
                Rect rect2 = new Rect();
                View view2 = (View) this.f220541c;
                view2.getHitRect(rect2);
                int i3 = rect2.bottom;
                int i4 = rect2.top;
                int i5 = this.f220540b;
                int i6 = i5 - (i3 - i4);
                if (i6 > 0) {
                    int i7 = i6 / 2;
                    rect2.top = i4 - i7;
                    rect2.bottom = i3 + i7;
                }
                int i8 = rect2.right;
                int i9 = rect2.left;
                int i10 = i5 - (i8 - i9);
                if (i10 > 0) {
                    int i11 = i10 / 2;
                    rect2.left = i9 - i11;
                    rect2.right = i8 + i11;
                }
                ((View) this.f220542d).setTouchDelegate(new TouchDelegate(rect2, view2));
                return;
            case 4:
                hxt hxtVar = (hxt) this.f220542d;
                View view3 = (View) this.f220541c;
                if (view3.getParent() == null) {
                    if (view3.isAttachedToWindow()) {
                        int i12 = this.f220540b;
                        if (i12 < 3) {
                            this.f220540b = i12 + 1;
                            view3.postOnAnimation(this);
                            return;
                        } else {
                            view3.requestLayout();
                            view3.addOnLayoutChangeListener(new j96(10, view3, hxtVar));
                            return;
                        }
                    }
                    return;
                }
                bvt bvtVar = hxtVar.f96296i;
                bvtVar.f31434h = null;
                bvtVar.f31435i = false;
                u4l0 u4l0Var = hxtVar.f96308u;
                if (u4l0Var != null) {
                    u4l0 u4l0Var2 = ((m12) u4l0Var.f226773c).f138796b ? null : u4l0Var;
                    if (u4l0Var2 != null) {
                        hxt.m49041b(hxtVar, u4l0Var2);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                Rect rect3 = new Rect();
                EntityActionView entityActionView = (EntityActionView) this.f220541c;
                entityActionView.getHitRect(rect3);
                int i13 = rect3.top;
                int i14 = this.f220540b;
                rect3.top = i13 - i14;
                rect3.left -= i14;
                rect3.bottom += i14;
                rect3.right += i14;
                ((ViewGroup) this.f220542d).setTouchDelegate(new TouchDelegate(rect3, entityActionView));
                return;
            case 6:
                nv50 nv50Var = (nv50) this.f220541c;
                dkv0 dkv0Var = nv50Var.f158796e;
                qv50 qv50Var = (qv50) this.f220542d;
                RecyclerView recyclerView = qv50Var.f192880O0;
                if (recyclerView == null || !recyclerView.f1216T0 || nv50Var.f158802k || dkv0Var.m36322l() == -1) {
                    return;
                }
                mjv0 itemAnimator = qv50Var.f192880O0.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.mo33397i()) {
                    ArrayList arrayList3 = qv50Var.f192878M0;
                    int size = arrayList3.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        if (((nv50) arrayList3.get(i15)).f158803l) {
                        }
                    }
                    qv50Var.f192891Y.mo38515p(this.f220540b, dkv0Var);
                    return;
                }
                qv50Var.f192880O0.post(this);
                return;
            case 7:
                hw80 hw80Var = (hw80) this.f220542d;
                int i16 = this.f220540b;
                u790 u790Var = (u790) this.f220541c;
                boolean z = hw80Var.f95883c;
                AtomicInteger atomicInteger = hw80Var.f95884d;
                ArrayList arrayList4 = hw80Var.f95882b;
                if (hw80Var.isDone() || arrayList4 == null) {
                    wj50.m88281r("Future was done before all dependencies completed", z);
                    return;
                }
                try {
                    wj50.m88281r("Tried to set value from future which is not done", u790Var.isDone());
                    arrayList4.set(i16, x4w0.m89914E(u790Var));
                    int iDecrementAndGet = atomicInteger.decrementAndGet();
                    wj50.m88281r("Less than 0 remaining futures", iDecrementAndGet >= 0);
                    if (iDecrementAndGet == 0) {
                        if (arrayList != null) {
                            gbbVar = hw80Var.f95886f;
                            arrayList2 = new ArrayList(arrayList);
                            gbbVar.m44211b(arrayList2);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (ExecutionException e) {
                    if (z) {
                        hw80Var.f95886f.m44212c(e.getCause());
                    }
                    int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                    wj50.m88281r("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                    if (iDecrementAndGet2 == 0) {
                        if (arrayList != null) {
                            gbbVar = hw80Var.f95886f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } catch (Error e2) {
                    hw80Var.f95886f.m44212c(e2);
                    int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                    wj50.m88281r("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                    if (iDecrementAndGet3 == 0) {
                        if (arrayList != null) {
                            gbbVar = hw80Var.f95886f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } catch (CancellationException unused) {
                    if (z) {
                        hw80Var.cancel(false);
                    }
                    int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                    wj50.m88281r("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                    if (iDecrementAndGet4 == 0) {
                        if (arrayList != null) {
                            gbbVar = hw80Var.f95886f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } catch (RuntimeException e3) {
                    if (z) {
                        hw80Var.f95886f.m44212c(e3);
                    }
                    int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                    wj50.m88281r("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                    if (iDecrementAndGet5 == 0) {
                        if (arrayList != null) {
                            gbbVar = hw80Var.f95886f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } finally {
                    int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                    wj50.m88281r("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                    if (iDecrementAndGet6 == 0) {
                        arrayList = hw80Var.f95882b;
                        if (arrayList != null) {
                            hw80Var.f95886f.m44211b(new ArrayList(arrayList));
                        } else {
                            wj50.m88281r(null, hw80Var.isDone());
                        }
                    }
                }
            case 8:
                x4j0 x4j0Var = (x4j0) this.f220541c;
                Activity activity = (Activity) x4j0Var.f258138b;
                CharSequence text = activity.getText(R.string.your_library_pin_failed_title_out_of_pins);
                Resources resources = activity.getResources();
                int i17 = this.f220540b;
                ih10 ih10VarM31832a0 = c95.m31832a0(activity, text, resources.getQuantityString(R.plurals.your_library_pin_failed_body_item_pin_limit_reached, i17, Integer.valueOf(i17)));
                CharSequence text2 = activity.getText(R.string.your_library_pin_failed_positive_button);
                voc1 voc1Var = (voc1) this.f220542d;
                i0o0 i0o0Var = new i0o0(x4j0Var, i17, voc1Var);
                ih10VarM31832a0.f102113a = text2;
                ih10VarM31832a0.f102115c = i0o0Var;
                ih10VarM31832a0.f102120h = new j0o0(x4j0Var, i17, voc1Var);
                ih10VarM31832a0.f102117e = true;
                ih10VarM31832a0.m50574b().m58942b();
                return;
            case 9:
                ((ResultReceiver) this.f220542d).onReceiveResult(this.f220540b, (Bundle) this.f220541c);
                return;
            case 10:
                i031 i031Var = (i031) this.f220541c;
                jy21 jy21Var = i031Var.f97126d;
                int i18 = this.f220540b;
                if (jy21Var.m54773a(i18) != null) {
                    i031Var.f97132t.onNext(new kz21(i18, (zxc) this.f220542d));
                    return;
                }
                return;
            case 11:
                ((dh61) this.f220541c).m35995b((Intent) this.f220542d, this.f220540b);
                return;
            case 12:
                if (this.f220540b == ((wt81) this.f220541c).f254883i) {
                    ((qe70) this.f220542d).invoke();
                    return;
                }
                return;
            case 13:
                wlf1 wlf1Var = (wlf1) this.f220541c;
                omd0 omd0Var = (omd0) this.f220542d;
                int i19 = this.f220540b;
                synchronized (wlf1Var.f252546n) {
                    wlf1Var.m88517d2(omd0Var, i19);
                    break;
                }
                return;
            default:
                bfg1 bfg1Var = (bfg1) this.f220541c;
                gxg1 gxg1Var = (gxg1) this.f220542d;
                int i20 = this.f220540b;
                hpf1 hpf1Var = bfg1Var.f26718h;
                if (hpf1Var == null) {
                    return;
                }
                synchronized (hpf1Var) {
                    ev61 ev61Var = new ev61();
                    bqg1 bqg1Var = hpf1Var.f93775a;
                    bqg1Var.getClass();
                    h9p h9pVarM46874g = h9p.m46874g();
                    h9pVarM46874g.f89015c = new k791(bqg1Var, 18);
                    h9pVarM46874g.f89013a = 4501;
                    y7h1 y7h1VarM80962e = bqg1Var.m80962e(0, h9pVarM46874g.m46881f());
                    vaa1 vaa1Var = new vaa1(ev61Var, 16);
                    y7h1VarM80962e.getClass();
                    y7h1VarM80962e.mo1512d(gv61.f84648a, vaa1Var);
                    y7h1VarM80962e.m92992m(new rpe1(ev61Var, 3));
                    hpf1Var.f93777c.postDelayed(new tof1(0, ev61Var), hpf1Var.f93776b * 1000);
                    y7h1Var = ev61Var.f63172a;
                }
                y7h1Var.m92993n(new ob31(i20, bfg1Var, gxg1Var));
                return;
        }
    }

    public /* synthetic */ ti3(Object obj, int i, Object obj2, int i2) {
        this.f220539a = i2;
        this.f220541c = obj;
        this.f220540b = i;
        this.f220542d = obj2;
    }

    public /* synthetic */ ti3(Object obj, int i, Object obj2, int i2, boolean z) {
        this.f220539a = i2;
        this.f220542d = obj;
        this.f220540b = i;
        this.f220541c = obj2;
    }

    public /* synthetic */ ti3(Object obj, Object obj2, int i, int i2) {
        this.f220539a = i2;
        this.f220541c = obj;
        this.f220542d = obj2;
        this.f220540b = i;
    }

    public /* synthetic */ ti3(Object obj, Object obj2, int i, int i2, boolean z) {
        this.f220539a = i2;
        this.f220542d = obj;
        this.f220541c = obj2;
        this.f220540b = i;
    }

    public ti3(View view, hxt hxtVar) {
        this.f220539a = 4;
        this.f220541c = view;
        this.f220542d = hxtVar;
    }
}
