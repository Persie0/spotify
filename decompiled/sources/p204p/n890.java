package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class n890 implements i6i0 {

    /* JADX INFO: renamed from: a */
    public boolean f151474a;

    /* JADX INFO: renamed from: b */
    public boolean f151475b;

    /* JADX INFO: renamed from: c */
    public final Object f151476c;

    /* JADX INFO: renamed from: d */
    public final Object f151477d;

    /* JADX INFO: renamed from: e */
    public final Object f151478e;

    /* JADX INFO: renamed from: f */
    public final Object f151479f;

    /* JADX INFO: renamed from: g */
    public final Object f151480g;

    /* JADX INFO: renamed from: h */
    public final Object f151481h;

    /* JADX INFO: renamed from: i */
    public Object f151482i;

    public /* synthetic */ n890(Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2, Object obj5, Object obj6, Object obj7) {
        this.f151476c = obj;
        this.f151477d = obj2;
        this.f151478e = obj3;
        this.f151479f = obj4;
        this.f151474a = z;
        this.f151475b = z2;
        this.f151480g = obj5;
        this.f151481h = obj6;
        this.f151482i = obj7;
    }

    @Override // p204p.i6i0
    /* JADX INFO: renamed from: a */
    public void mo34490a(eh00 eh00Var, xq00 xq00Var, int i) {
        kqi0 kqi0Var = (kqi0) this.f151482i;
        kqi0 kqi0Var2 = (kqi0) this.f151481h;
        kqi0 kqi0Var3 = (kqi0) this.f151480g;
        kqi0 kqi0Var4 = (kqi0) this.f151476c;
        qsc0 qsc0Var = (qsc0) this.f151479f;
        wf4 wf4Var = qsc0Var.f192062c;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-1320309506);
        int i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i | (xq00Var.m91766g(this) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zM91770i = ((i2 & 14) == 4) | xq00Var.m91770i(kqi0Var4);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == obj) {
                objM91750T = new C2369sa(eh00Var, kqi0Var4, 23);
                xq00Var.m91793t0(objM91750T);
            }
            hz40.m49245q((eh00) objM91750T, xq00Var);
            if (((Boolean) ((kqi0) this.f151477d).getValue()).booleanValue()) {
                xq00Var.m91771i0(-29852357);
                akg1.m26216a(lv21.f137205b, false, false, false, false, false, null, null, xq00Var, 390, 250);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-29720886);
                qf40 qf40Var = (qf40) ((kqi0) this.f151478e).getValue();
                boolean z = !wf4Var.m87949g();
                boolean z2 = wf4Var.m87935F() && qsc0Var.f192069t.mo76359a(6);
                boolean z3 = this.f151474a;
                boolean z4 = this.f151475b;
                boolean zM91770i2 = xq00Var.m91770i(kqi0Var3) | xq00Var.m91770i(kqi0Var2);
                Object objM91750T2 = xq00Var.m91750T();
                if (zM91770i2 || objM91750T2 == obj) {
                    objM91750T2 = new gyc(kqi0Var3, kqi0Var2, 5);
                    xq00Var.m91793t0(objM91750T2);
                }
                eh00 eh00Var2 = (eh00) objM91750T2;
                boolean zM91770i3 = xq00Var.m91770i(kqi0Var);
                Object objM91750T3 = xq00Var.m91750T();
                if (zM91770i3 || objM91750T3 == obj) {
                    objM91750T3 = new esc0(kqi0Var, 0);
                    xq00Var.m91793t0(objM91750T3);
                }
                akg1.m26216a(qf40Var, true, z, z2, z3, z4, eh00Var2, (gh00) objM91750T3, xq00Var, 48, 0);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new hgb0(this, eh00Var, i, 18);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m63831b(Object obj) {
        obj.getClass();
        synchronized (this.f151482i) {
            try {
                if (this.f151474a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f151479f).add(new m890(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m63832c() {
        kh61 kh61Var = (kh61) this.f151477d;
        ArrayDeque arrayDeque = (ArrayDeque) this.f151480g;
        if (this.f151475b) {
            c95.m31855u(Thread.currentThread() == ((Thread) this.f151476c));
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.f151481h;
        if (arrayDeque2.isEmpty()) {
            return;
        }
        if (((l890) this.f151478e) != null) {
            kh61Var.getClass();
            Handler handler = kh61Var.f122536a;
            if (!handler.hasMessages(1)) {
                jh61 jh61VarM56384a = kh61Var.m56384a(1);
                Message message = jh61VarM56384a.f112345a;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                jh61VarM56384a.m53363a();
            }
        }
        boolean zIsEmpty = arrayDeque.isEmpty();
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        if (zIsEmpty) {
            while (!arrayDeque.isEmpty()) {
                ((Runnable) arrayDeque.peekFirst()).run();
                arrayDeque.removeFirst();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.eh00, p.qe70] */
    /* JADX INFO: renamed from: d */
    public eh00 m63833d() {
        return (qe70) this.f151482i;
    }

    /* JADX INFO: renamed from: e */
    public void m63834e(int i, k890 k890Var) {
        if (this.f151475b) {
            c95.m31855u(Thread.currentThread() == ((Thread) this.f151476c));
        }
        ((ArrayDeque) this.f151481h).add(new scb(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f151479f), i, k890Var, 9));
    }

    /* JADX INFO: renamed from: f */
    public void m63835f() {
        if (this.f151475b) {
            c95.m31855u(Thread.currentThread() == ((Thread) this.f151476c));
        }
        synchronized (this.f151482i) {
            this.f151474a = true;
        }
        for (m890 m890Var : (CopyOnWriteArraySet) this.f151479f) {
            l890 l890Var = (l890) this.f151478e;
            m890Var.f140992d = true;
            if (l890Var != null && m890Var.f140991c) {
                m890Var.f140991c = false;
                l890Var.mo39734d(m890Var.f140989a, m890Var.f140990b.m96480m());
            }
        }
        ((CopyOnWriteArraySet) this.f151479f).clear();
    }

    /* JADX INFO: renamed from: g */
    public void m63836g(Object obj) {
        if (this.f151475b) {
            c95.m31855u(Thread.currentThread() == ((Thread) this.f151476c));
        }
        CopyOnWriteArraySet<m890> copyOnWriteArraySet = (CopyOnWriteArraySet) this.f151479f;
        for (m890 m890Var : copyOnWriteArraySet) {
            if (m890Var.f140989a.equals(obj)) {
                l890 l890Var = (l890) this.f151478e;
                m890Var.f140992d = true;
                if (l890Var != null && m890Var.f140991c) {
                    m890Var.f140991c = false;
                    l890Var.mo39734d(m890Var.f140989a, m890Var.f140990b.m96480m());
                }
                copyOnWriteArraySet.remove(m890Var);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m63837h() {
        ((Handler) this.f151478e).post((cjs0) this.f151482i);
    }

    /* JADX INFO: renamed from: i */
    public void m63838i() {
        int i;
        boolean z;
        mg10 mg10Var = (mg10) this.f151477d;
        Context context = (Context) this.f151476c;
        PackageManager packageManager = (PackageManager) this.f151479f;
        ArrayList arrayList = (ArrayList) this.f151480g;
        if (this.f151475b) {
            ArrayList arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (!this.f151474a || TextUtils.equals(context.getPackageName(), serviceInfo.packageName)) {
                        arrayList3.add(serviceInfo);
                    }
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i2 = 0;
            while (true) {
                boolean z2 = true;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo2 = it2.next().serviceInfo;
                if (serviceInfo2 != null) {
                    if (zmd0.f284250c == null ? false : zmd0.m96427c().m61670i()) {
                        if (arrayList2.isEmpty()) {
                            z = false;
                            break;
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z = false;
                                break;
                            }
                            ServiceInfo serviceInfo3 = (ServiceInfo) it3.next();
                            if (serviceInfo2.packageName.equals(serviceInfo3.packageName) && serviceInfo2.name.equals(serviceInfo3.name)) {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                        }
                    }
                    String str = serviceInfo2.packageName;
                    String str2 = serviceInfo2.name;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            i3 = -1;
                            break;
                        }
                        ComponentName componentName = ((gsv0) arrayList.get(i3)).f84028i;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i3 < 0) {
                        gsv0 gsv0Var = new gsv0(context, new ComponentName(serviceInfo2.packageName, serviceInfo2.name));
                        gsv0Var.f84024N0 = new nrs0(this, gsv0Var);
                        if (!gsv0Var.f84026Y) {
                            gsv0Var.f84026Y = true;
                            gsv0Var.m45667m();
                        }
                        i = i2 + 1;
                        arrayList.add(i2, gsv0Var);
                        mg10Var.m61662a(gsv0Var, false);
                    } else if (i3 >= i2) {
                        gsv0 gsv0Var2 = (gsv0) arrayList.get(i3);
                        if (!gsv0Var2.f84026Y) {
                            gsv0Var2.f84026Y = true;
                            gsv0Var2.m45667m();
                        }
                        if (gsv0Var2.f84022L0 == null) {
                            if (!gsv0Var2.f84026Y || (gsv0Var2.f60891e == null && gsv0Var2.f84025X.isEmpty())) {
                                z2 = false;
                            }
                            if (z2) {
                                gsv0Var2.m45666l();
                                gsv0Var2.m45663i();
                            }
                        }
                        i = i2 + 1;
                        Collections.swap(arrayList, i3, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < arrayList.size()) {
                for (int size2 = arrayList.size() - 1; size2 >= i2; size2--) {
                    gsv0 gsv0Var3 = (gsv0) arrayList.get(size2);
                    vmd0 vmd0VarM61665d = mg10Var.m61665d(gsv0Var3);
                    if (vmd0VarM61665d != null) {
                        gsv0Var3.getClass();
                        zmd0.m96426b();
                        gsv0Var3.f60890d = null;
                        gsv0Var3.m39416h(null);
                        mg10Var.m61676o(vmd0VarM61665d, null);
                        mg10Var.f143259a.m38769b(514, vmd0VarM61665d);
                        mg10Var.f143270l.remove(vmd0VarM61665d);
                    }
                    arrayList.remove(gsv0Var3);
                    gsv0Var3.f84024N0 = null;
                    if (gsv0Var3.f84026Y) {
                        gsv0Var3.f84026Y = false;
                        gsv0Var3.m45667m();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m63839j(int i, k890 k890Var) {
        m63834e(i, k890Var);
        m63832c();
    }

    /* JADX INFO: renamed from: k */
    public void m63840k() {
        Handler handler = (Handler) this.f151478e;
        if (this.f151475b) {
            return;
        }
        this.f151475b = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addDataScheme("package");
        ((Context) this.f151476c).registerReceiver((o4a) this.f151481h, intentFilter, null, handler);
        handler.post((cjs0) this.f151482i);
    }

    public n890(eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, eh00 eh00Var4, eh00 eh00Var5, boolean z, boolean z2, eh00 eh00Var6) {
        this.f151476c = eh00Var;
        this.f151477d = eh00Var2;
        this.f151478e = eh00Var3;
        this.f151479f = eh00Var4;
        this.f151480g = eh00Var5;
        this.f151474a = z;
        this.f151475b = z2;
        this.f151481h = eh00Var6;
        this.f151482i = o5t0.f162077Y;
    }

    public n890(Context context, mg10 mg10Var) {
        this.f151480g = new ArrayList();
        this.f151481h = new o4a(this, 16);
        this.f151482i = new cjs0(this, 9);
        this.f151476c = context;
        this.f151477d = mg10Var;
        this.f151478e = new Handler();
        this.f151479f = context.getPackageManager();
    }

    public n890(Looper looper) {
        this(looper.getThread());
    }

    public n890(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public n890(Looper looper, gh61 gh61Var, l890 l890Var) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), gh61Var, l890Var, true);
    }

    public n890(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, gh61 gh61Var, l890 l890Var, boolean z) {
        this.f151476c = thread;
        this.f151479f = copyOnWriteArraySet;
        this.f151478e = l890Var;
        this.f151482i = new Object();
        this.f151480g = new ArrayDeque();
        this.f151481h = new ArrayDeque();
        if (looper != null && gh61Var != null && l890Var != null) {
            this.f151477d = gh61Var.m44723a(looper, new c6s(this, 2));
        } else {
            this.f151477d = null;
        }
        this.f151475b = z;
    }
}
