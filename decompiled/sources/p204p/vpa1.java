package p204p;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class vpa1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f243640a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f243641b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f243642c;

    public /* synthetic */ vpa1(int i, Object obj, Object obj2) {
        this.f243640a = i;
        this.f243641b = obj;
        this.f243642c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        yt30 yt30Var;
        int i = 13;
        ydf1 ydf1Var = null;
        boolean z = true;
        int i2 = 0;
        switch (this.f243640a) {
            case 0:
                ((zpa1) this.f243641b).f285065h.m27880m((List) this.f243642c);
                return;
            case 1:
                EditText editText = (EditText) this.f243641b;
                editText.requestFocus();
                editText.setSelection(editText.getText().length());
                ((InputMethodManager) ((Context) this.f243642c).getSystemService("input_method")).showSoftInput(editText, 1);
                return;
            case 2:
                qob1 qob1Var = (qob1) this.f243641b;
                qob1Var.f190908t = false;
                RecyclerView recyclerView = (RecyclerView) this.f243642c;
                if (recyclerView.getChildCount() == 0 || recyclerView.getLayoutParams().height != -2) {
                    ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = -2;
                    recyclerView.setLayoutParams(layoutParams);
                    qob1Var.f190903e.f51257c.requestLayout();
                    return;
                }
                return;
            case 3:
                ((ozo0) this.f243641b).mo49983c((String) this.f243642c);
                return;
            case 4:
                ((khc1) this.f243642c).onScrollChanged();
                return;
            case 5:
                fpc1 fpc1Var = (fpc1) this.f243642c;
                fpc1Var.f71806f = true;
                fpc1Var.m42327c();
                return;
            case 6:
                bhd1 bhd1Var = (bhd1) this.f243641b;
                if (bhd1Var.getHeight() == 0) {
                    return;
                }
                bhd1Var.getAnimator().cancel();
                bhd1Var.getAnimator().removeAllUpdateListeners();
                bhd1.m29235a(bhd1Var);
                bhd1.m29239g(bhd1Var);
                bhd1Var.getAnimator().start();
                ((zgd1) this.f243642c).getClass();
                bhd1Var.setTag("Dashed line color: #ffffff");
                return;
            case 7:
                ((gb80) this.f243641b).mo31986a((mxd0) this.f243642c);
                return;
            case 8:
                lzi lziVar = (lzi) this.f243641b;
                i82 i82Var = (i82) this.f243642c;
                yj10 yj10Var = (yj10) i82Var.f99670f;
                o35 o35Var = (o35) i82Var.f99666b;
                p3f1 p3f1Var = (p3f1) yj10Var.f273264t.get((i45) i82Var.f99667c);
                if (p3f1Var == null) {
                    return;
                }
                if (lziVar.f138371b != 0) {
                    p3f1Var.m69013l(lziVar, null);
                    return;
                }
                i82Var.f99665a = true;
                if (o35Var.mo27713b()) {
                    if (!i82Var.f99665a || (yt30Var = (yt30) i82Var.f99668d) == null) {
                        return;
                    }
                    ((dz8) o35Var).m37437p(yt30Var, (Set) i82Var.f99669e);
                    return;
                }
                try {
                    li10 li10Var = (li10) o35Var;
                    ((dz8) o35Var).m37437p(null, li10Var.mo27713b() ? li10Var.f133687z : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException unused) {
                    ((dz8) o35Var).m37430g("Failed to get service from broker.");
                    p3f1Var.m69013l(new lzi(10, null, null), null);
                    return;
                }
            case 9:
                b4f1 b4f1Var = (b4f1) this.f243642c;
                t4f1 t4f1Var = (t4f1) this.f243641b;
                b4f1Var.getClass();
                lzi lziVar2 = t4f1Var.f216994b;
                if (lziVar2.f138371b == 0) {
                    d5f1 d5f1Var = t4f1Var.f216995c;
                    ig31.m50506x(d5f1Var);
                    lzi lziVar3 = d5f1Var.f45429c;
                    if (lziVar3.f138371b != 0) {
                        String strValueOf = String.valueOf(lziVar3);
                        new Exception();
                        "Sign-in succeeded with resolve account failure: ".concat(strValueOf);
                        b4f1Var.f23350r.m49910D(lziVar3);
                        b4f1Var.f23349q.mo32171f();
                        return;
                    }
                    i82 i82Var2 = b4f1Var.f23350r;
                    IBinder iBinder = d5f1Var.f45428b;
                    yt30 yt30VarM36239c2 = iBinder == null ? null : AbstractBinderC1781dk.m36239c2(iBinder);
                    Set set = b4f1Var.f23347o;
                    i82Var2.getClass();
                    if (yt30VarM36239c2 == null || set == null) {
                        new Exception();
                        i82Var2.m49910D(new lzi(4, null, null));
                    } else {
                        i82Var2.f99668d = yt30VarM36239c2;
                        i82Var2.f99669e = set;
                        if (i82Var2.f99665a) {
                            ((dz8) ((o35) i82Var2.f99666b)).m37437p(yt30VarM36239c2, set);
                        }
                    }
                } else {
                    b4f1Var.f23350r.m49910D(lziVar2);
                }
                b4f1Var.f23349q.mo32171f();
                return;
            case 10:
                xc9 xc9Var = (xc9) this.f243641b;
                b9v0 b9v0Var = (b9v0) this.f243642c;
                ye9 ye9Var = esf1.f62365i;
                xc9Var.m90380P(24, 13, ye9Var);
                b9v0Var.m28543f(ye9Var);
                return;
            case 11:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f243641b;
                while (!((Set) this.f243642c).isEmpty()) {
                    try {
                        nrf1 nrf1Var = (nrf1) referenceQueue.remove();
                        if (nrf1Var.f157549a.remove(nrf1Var)) {
                            nrf1Var.clear();
                            nrf1Var.f157550b.getClass();
                        }
                    } catch (InterruptedException unused2) {
                    }
                }
                return;
            case 12:
                xc9 xc9Var2 = (xc9) this.f243641b;
                gjv0 gjv0Var = (gjv0) this.f243642c;
                ye9 ye9Var2 = esf1.f62365i;
                xc9Var2.m90380P(24, 7, ye9Var2);
                mlf1 mlf1Var = tlf1.f221461b;
                mnf1 mnf1Var = mnf1.f145422e;
                gjv0Var.m44973n(ye9Var2, new aaq0(12, mnf1Var, mnf1Var));
                return;
            case 13:
                lkf1 lkf1Var = ((fkf1) this.f243641b).f70538l;
                l6f1 l6f1Var = (l6f1) this.f243642c;
                lkf1Var.getClass();
                String str = l6f1Var.f130365a;
                if (acc.m25453c(str, lkf1Var.f134362v)) {
                    z = false;
                } else {
                    lkf1Var.f134362v = str;
                }
                lkf1.f134343H.m83848a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(lkf1Var.f134355o));
                m6h1 m6h1Var = lkf1Var.f134349E;
                if (m6h1Var != null && (z || lkf1Var.f134355o)) {
                    m6h1Var.m61016d();
                }
                lkf1Var.f134355o = false;
                return;
            case 14:
                try {
                    ((xc9) ((g2a1) this.f243641b).f75877c).f260137H.mo42511f((ye9) this.f243642c);
                    return;
                } catch (Throwable unused3) {
                    mmf1.m62315i("BillingClient");
                    return;
                }
            case 15:
                rng1 rng1Var = (rng1) this.f243641b;
                IBinder iBinder2 = (IBinder) this.f243642c;
                synchronized (rng1Var) {
                    if (iBinder2 == null) {
                        rng1Var.m76001a("Null service connection");
                    } else {
                        try {
                            rng1Var.f200913c = new y3d1(iBinder2);
                            rng1Var.f200911a = 2;
                            t0h1.m79788M(rng1Var.f200916f).execute(new h8g1(rng1Var, i2));
                        } catch (RemoteException e) {
                            rng1Var.m76001a(e.getMessage());
                        }
                    }
                }
                return;
            case 16:
                AbstractC2440u5 abstractC2440u5 = (AbstractC2440u5) this.f243641b;
                ev61 ev61Var = (ev61) this.f243642c;
                int iDecrementAndGet = ((AtomicInteger) abstractC2440u5.f226862c).decrementAndGet();
                ig31.m50471A(iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    abstractC2440u5.mo44368I();
                    ((AtomicBoolean) abstractC2440u5.f226863d).set(false);
                }
                uzg1.f235583a.clear();
                e2h1.f55473a.clear();
                ev61Var.m40097b(null);
                return;
            case 17:
                s831 s831Var = (s831) this.f243641b;
                ig31.m50471A(((Thread) ((AtomicReference) s831Var.f206536e).getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) this.f243642c).run();
                    ((AtomicReference) s831Var.f206536e).set(null);
                    s831Var.zzc();
                    return;
                } catch (Throwable th) {
                    try {
                        ((AtomicReference) s831Var.f206536e).set(null);
                        s831Var.zzc();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 18:
                x4h1 x4h1Var = (x4h1) this.f243641b;
                btg1 btg1Var = btg1.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
                jgc1 jgc1Var = (jgc1) this.f243642c;
                HashMap map = x4h1Var.f258132j;
                qgf1 qgf1Var = (qgf1) map.get(btg1Var);
                if (qgf1Var != null) {
                    zif1 zif1Var = qgf1Var.f188464c;
                    y7f1 y7f1Var = qgf1Var.f143464a;
                    if (y7f1Var == null) {
                        y7f1Var = new y7f1(qgf1Var, zif1Var);
                        qgf1Var.f143464a = y7f1Var;
                    }
                    for (Object obj : y7f1Var) {
                        Object arrayList = (Collection) zif1Var.get(obj);
                        if (arrayList == null) {
                            arrayList = new ArrayList(3);
                        }
                        List list = (List) arrayList;
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new uaf1(qgf1Var, obj, list, ydf1Var) : new ydf1(qgf1Var, obj, list, ydf1Var));
                        Collections.sort(arrayList2);
                        ycm0 ycm0Var = new ycm0(22);
                        Iterator it = arrayList2.iterator();
                        long jLongValue = 0;
                        while (it.hasNext()) {
                            jLongValue = ((Long) it.next()).longValue() + jLongValue;
                        }
                        qgf1 qgf1Var2 = qgf1Var;
                        ycm0Var.f271529d = Long.valueOf((jLongValue / ((long) arrayList2.size())) & Long.MAX_VALUE);
                        ycm0Var.f271527b = Long.valueOf(x4h1.m89880a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        ycm0Var.f271532g = Long.valueOf(x4h1.m89880a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        ycm0Var.f271531f = Long.valueOf(x4h1.m89880a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        ycm0Var.f271530e = Long.valueOf(x4h1.m89880a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        ycm0Var.f271528c = Long.valueOf(x4h1.m89880a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        jrg1 jrg1Var = new jrg1(ycm0Var);
                        int size = arrayList2.size();
                        gd71 gd71Var = (gd71) jgc1Var.f112156b;
                        qzf1 qzf1Var = (qzf1) obj;
                        sef0 sef0Var = new sef0();
                        sef0Var.f208286c = ((ed71) gd71Var.f78757h).m38517b() ? zsg1.TYPE_THICK : zsg1.TYPE_THIN;
                        f7d1 f7d1Var = new f7d1(i);
                        f7d1Var.f66659c = Integer.valueOf(size & Alert.DURATION_SHOW_INDEFINITELY);
                        f7d1Var.f66658b = qzf1Var;
                        f7d1Var.f66660d = jrg1Var;
                        sef0Var.f208289f = new yzf1(f7d1Var);
                        f8g1.f66988a.execute(new qk8(x4h1Var, new ob31(sef0Var, 0), btg1Var, x4h1Var.m89882c(), 18));
                        qgf1Var = qgf1Var2;
                        ydf1Var = null;
                    }
                    map.remove(btg1Var);
                    return;
                }
                return;
            default:
                v9h1 v9h1Var = (v9h1) this.f243641b;
                String str2 = ((l6f1) this.f243642c).f130365a;
                if (acc.m25453c(str2, v9h1Var.f238960I)) {
                    z = false;
                } else {
                    v9h1Var.f238960I = str2;
                }
                v9h1.f238950U.m83848a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(v9h1Var.f238962K));
                m6h1 m6h1Var2 = v9h1Var.f238955D;
                if (m6h1Var2 != null && (z || v9h1Var.f238962K)) {
                    m6h1Var2.m61016d();
                }
                v9h1Var.f238962K = false;
                return;
        }
    }

    public /* synthetic */ vpa1(Object obj, AbstractC2206o9 abstractC2206o9, int i) {
        this.f243640a = i;
        this.f243641b = abstractC2206o9;
        this.f243642c = obj;
    }

    public vpa1(ozo0 ozo0Var, String str, long j, long j2) {
        this.f243640a = 3;
        this.f243641b = ozo0Var;
        this.f243642c = str;
    }

    public /* synthetic */ vpa1(x4h1 x4h1Var, jgc1 jgc1Var) {
        this.f243640a = 18;
        btg1 btg1Var = btg1.UNKNOWN_EVENT;
        this.f243641b = x4h1Var;
        this.f243642c = jgc1Var;
    }

    public vpa1(v7h1 v7h1Var, v9h1 v9h1Var, l6f1 l6f1Var) {
        this.f243640a = 19;
        this.f243641b = v9h1Var;
        this.f243642c = l6f1Var;
    }
}
