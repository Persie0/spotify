package p204p;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.media3.transformer.ExportException;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rsz0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f202456a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f202457b;

    public /* synthetic */ rsz0(Object obj, int i) {
        this.f202456a = i;
        this.f202457b = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m76357a() {
        a691 a691Var = (a691) ((f151) this.f202457b).f64793b;
        a691Var.getClass();
        long j = a691Var.f12729f;
        LinkedHashMap linkedHashMap = qpo.f191349a;
        synchronized (qpo.class) {
        }
        Locale locale = Locale.US;
        ExportException exportException = new ExportException("Muxer error", new IllegalStateException(edb.m38562k(j, "Abort: no output sample written in the last ", " milliseconds. DebugTrace: \"Tracing disabled\"")), 7002, 0);
        ahp ahpVar = a691Var.f12743t;
        if (ahpVar == null) {
            a691Var.f12741r.m34948s(new mnx().m62371a(), exportException);
            return;
        }
        g691 g691Var = ahpVar.f15746u;
        g691Var.getClass();
        g691Var.m43683c(exportException);
    }

    @Override // java.lang.Runnable
    public final void run() {
        View viewFindFocus;
        boolean z = true;
        Boolean bool = null;
        Map mapUnmodifiableMap = null;
        String str = null;
        switch (this.f202456a) {
            case 0:
                ((ssz0) this.f202457b).m79226a();
                return;
            case 1:
                tsz0 tsz0Var = (tsz0) this.f202457b;
                try {
                    if (tsz0Var.f223465d.f233725v) {
                        return;
                    }
                    tsz0Var.f223465d.m83915h();
                    tsz0Var.f223464c += tsz0Var.f223465d.f233727x;
                    tsz0Var.f223465d.f233717n.release();
                    usz0 usz0Var = tsz0Var.f223465d;
                    usz0Var.f233715l = false;
                    int i = usz0Var.f233716m + 1;
                    usz0Var.f233716m = i;
                    wsv0 wsv0Var = usz0Var.f233704a;
                    if (i == wsv0Var.f254765d) {
                        usz0Var.f233716m = 0;
                        usz0Var.f233721r++;
                    }
                    y8t y8tVar = (y8t) wsv0Var.get(usz0Var.f233716m);
                    usz0 usz0Var2 = tsz0Var.f223465d;
                    azu0 azu0Var = usz0Var2.f233706c;
                    Looper looperMyLooper = Looper.myLooper();
                    looperMyLooper.getClass();
                    usz0 usz0Var3 = tsz0Var.f223465d;
                    usz0Var2.f233717n = azu0Var.mo27675h(y8tVar, looperMyLooper, usz0Var3, usz0Var3.f233707d);
                    tsz0Var.f223465d.f233717n.start();
                    return;
                } catch (RuntimeException e) {
                    tsz0Var.f223465d.mo40840b(ExportException.m868a(1000, e));
                    return;
                }
            case 2:
                ((mqi0) this.f202457b).m62569i();
                return;
            case 3:
                iqp0 iqp0Var = (iqp0) this.f202457b;
                synchronized (((ArrayDeque) iqp0Var.f104824e)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) iqp0Var.f104821b).edit();
                    String str2 = (String) iqp0Var.f104822c;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) iqp0Var.f104824e).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) iqp0Var.f104823d);
                    }
                    editorEdit.putString(str2, sb.toString()).commit();
                    break;
                }
                return;
            case 4:
                ke41 ke41Var = (ke41) this.f202457b;
                te40 te40Var = te40.f219571b;
                String str3 = h0b1.f86200a;
                Set set = ke41Var.f121802e;
                set.remove(te40Var);
                if (set.isEmpty()) {
                    ke41Var.m56195o1(((le41) ke41Var).f132457l, false, false);
                    return;
                }
                return;
            case 5:
                tn20 tn20Var = (tn20) this.f202457b;
                ((ze21) tn20Var.f221865b).f281859d.mo40873c(tn20Var.f221864a);
                return;
            case 6:
                ShimmerFrameLayout shimmerFrameLayout = ((bk21) this.f202457b).f27819b;
                if (shimmerFrameLayout == null || !shimmerFrameLayout.f1665c) {
                    return;
                }
                shimmerFrameLayout.m1430e();
                shimmerFrameLayout.f1665c = false;
                shimmerFrameLayout.invalidate();
                return;
            case 7:
                View view = (View) this.f202457b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 8:
                y541 y541Var = (y541) this.f202457b;
                Surface surface = y541Var.f269346h;
                if (surface != null) {
                    Iterator it2 = y541Var.f269339a.iterator();
                    while (it2.hasNext()) {
                        ((bjx) it2.next()).f27780a.m45015y1(null);
                    }
                }
                SurfaceTexture surfaceTexture = y541Var.f269345g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                y541Var.f269345g = null;
                y541Var.f269346h = null;
                return;
            case 9:
                ljs ljsVar = (ljs) ((ay21) this.f202457b).f21069d;
                if (ljsVar != null) {
                    Iterator it3 = ljsVar.values().iterator();
                    while (it3.hasNext()) {
                        ((v761) it3.next()).m84842b();
                    }
                    return;
                }
                return;
            case 10:
                ((jt4) this.f202457b).m54266c();
                return;
            case 11:
                ((ts61) this.f202457b).m81393b();
                return;
            case 12:
                ja71 ja71Var = (ja71) this.f202457b;
                u010 u010Var = ja71Var.f110383b;
                ja71Var.f110395n = null;
                qqi0 qqi0Var = ja71Var.f110394m;
                View view2 = ja71Var.f110382a;
                if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    qqi0Var.m73561g();
                    return;
                }
                Object[] objArr = qqi0Var.f191608a;
                int i2 = qqi0Var.f191610c;
                Boolean boolValueOf = null;
                for (int i3 = 0; i3 < i2; i3++) {
                    ia71 ia71Var = (ia71) objArr[i3];
                    int iOrdinal = ia71Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = Boolean.FALSE;
                        } else {
                            if (iOrdinal != 2 && iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!wj50.m88271j(bool, Boolean.FALSE)) {
                                boolValueOf = Boolean.valueOf(ia71Var == ia71.f100170c);
                            }
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                qqi0Var.m73561g();
                if (wj50.m88271j(bool, Boolean.TRUE)) {
                    u010Var.m82084E();
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((jhz0) ((gjv0) u010Var.f225347d).f80569b).mo53437i();
                    } else {
                        ((jhz0) ((gjv0) u010Var.f225347d).f80569b).mo53434f();
                    }
                }
                if (wj50.m88271j(bool, Boolean.FALSE)) {
                    u010Var.m82084E();
                    return;
                }
                return;
            case 13:
                ((HandlerThread) this.f202457b).quitSafely();
                return;
            case 14:
                clq0 clq0Var = (clq0) this.f202457b;
                synchronized (((AtomicMarkableReference) clq0Var.f39346h)) {
                    try {
                        if (((AtomicMarkableReference) clq0Var.f39346h).isMarked()) {
                            str = (String) ((AtomicMarkableReference) clq0Var.f39346h).getReference();
                            ((AtomicMarkableReference) clq0Var.f39346h).set(str, false);
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (z) {
                    ((f5f0) clq0Var.f39340b).m40760i((String) clq0Var.f39342d, str);
                    return;
                }
                return;
            case 15:
                s831 s831Var = (s831) this.f202457b;
                ((AtomicReference) s831Var.f206535d).set(null);
                synchronized (s831Var) {
                    if (((AtomicMarkableReference) s831Var.f206534c).isMarked()) {
                        e070 e070Var = (e070) ((AtomicMarkableReference) s831Var.f206534c).getReference();
                        synchronized (e070Var) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(e070Var.f54891a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) s831Var.f206534c;
                        atomicMarkableReference.set((e070) atomicMarkableReference.getReference(), false);
                    }
                }
                if (mapUnmodifiableMap != null) {
                    clq0 clq0Var2 = (clq0) s831Var.f206536e;
                    ((f5f0) clq0Var2.f39340b).m40759h((String) clq0Var2.f39342d, mapUnmodifiableMap, s831Var.f206533b);
                    return;
                }
                return;
            case 16:
                kjc1 kjc1Var = (kjc1) this.f202457b;
                if (p2l.f173365a.contains(kjc1.class)) {
                    return;
                }
                try {
                    WeakReference weakReference = kjc1Var.f123306a;
                    View viewM38205j = e95.m38205j((Activity) weakReference.get());
                    Activity activity = (Activity) weakReference.get();
                    if (viewM38205j != null && activity != null) {
                        for (View view3 : vy51.m86705a(viewM38205j)) {
                            if (!msz0.m62783b(view3)) {
                                String strM86707d = vy51.m86707d(view3);
                                if (strM86707d.length() > 0 && strM86707d.length() <= 300) {
                                    HashSet hashSet = qjc1.f189213e;
                                    pjc1.m70138b(view3, viewM38205j, activity.getLocalClassName());
                                }
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th2) {
                    p2l.m68953a(kjc1.class, th2);
                    return;
                }
            case 17:
                m76357a();
                return;
            case 18:
                uzd1 uzd1Var = (uzd1) this.f202457b;
                uzd1Var.f235535a.getAction();
                uzd1Var.f235536b.m40099d(null);
                return;
            default:
                be41 be41Var = (be41) this.f202457b;
                ((czx0) ((qg61) be41Var.f26282e)).m34475h(new zga1(be41Var, 19));
                return;
        }
    }

    public /* synthetic */ rsz0(ke41 ke41Var) {
        this.f202456a = 4;
        te40 te40Var = te40.f219571b;
        this.f202457b = ke41Var;
    }
}
