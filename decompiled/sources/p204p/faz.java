package p204p;

import android.app.Application;
import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class faz {

    /* JADX INFO: renamed from: k */
    public static final Object f67663k = new Object();

    /* JADX INFO: renamed from: l */
    public static final uj5 f67664l = new uj5(0);

    /* JADX INFO: renamed from: a */
    public final Context f67665a;

    /* JADX INFO: renamed from: b */
    public final String f67666b;

    /* JADX INFO: renamed from: c */
    public final bbz f67667c;

    /* JADX INFO: renamed from: d */
    public final gxf f67668d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f67669e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f67670f;

    /* JADX INFO: renamed from: g */
    public final gr70 f67671g;

    /* JADX INFO: renamed from: h */
    public final j4t0 f67672h;

    /* JADX INFO: renamed from: i */
    public final CopyOnWriteArrayList f67673i;

    /* JADX INFO: renamed from: j */
    public final CopyOnWriteArrayList f67674j;

    public faz(Context context, String str, bbz bbzVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f67669e = atomicBoolean;
        this.f67670f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f67673i = copyOnWriteArrayList;
        this.f67674j = new CopyOnWriteArrayList();
        this.f67665a = context;
        ig31.m50502t(str);
        this.f67666b = str;
        this.f67667c = bbzVar;
        d28 d28Var = qaz.f186951a;
        stf1.m79255o("Firebase");
        stf1.m79255o("ComponentDiscovery");
        ArrayList arrayListM31895u = c97.m31871v(context, ComponentDiscoveryService.class).m31895u();
        stf1.m79254n();
        stf1.m79255o("Runtime");
        uhc uhcVar = new uhc(nx91.f159417a);
        uhcVar.m83139c(arrayListM31895u);
        uhcVar.m83138b(new FirebaseCommonRegistrar());
        uhcVar.m83138b(new ExecutorsRegistrar());
        uhcVar.m83137a(svf.m79444c(context, Context.class, new Class[0]));
        uhcVar.m83137a(svf.m79444c(this, faz.class, new Class[0]));
        uhcVar.m83137a(svf.m79444c(bbzVar, bbz.class, new Class[0]));
        uhcVar.m83145k(new d67(3));
        if (z8g1.m95592l(context) && qaz.f186952b.get()) {
            uhcVar.m83137a(svf.m79444c(d28Var, d28.class, new Class[0]));
        }
        gxf gxfVarM83140d = uhcVar.m83140d();
        this.f67668d = gxfVarM83140d;
        stf1.m79254n();
        this.f67671g = new gr70(new djp(this, context));
        this.f67672h = gxfVarM83140d.mo54441h(fjp.class);
        caz cazVar = new caz(this);
        m41197a();
        if (atomicBoolean.get()) {
            dm8.f50469e.f50470a.get();
        }
        copyOnWriteArrayList.add(cazVar);
        stf1.m79254n();
    }

    /* JADX INFO: renamed from: c */
    public static faz m41195c() {
        faz fazVar;
        synchronized (f67663k) {
            try {
                fazVar = (faz) f67664l.get("[DEFAULT]");
                if (fazVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + r35.m74611s() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((fjp) fazVar.f67672h.get()).m41855b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fazVar;
    }

    /* JADX INFO: renamed from: f */
    public static faz m41196f(Context context, bbz bbzVar) {
        faz fazVar;
        AtomicReference atomicReference = daz.f47161a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = daz.f47161a;
            if (atomicReference2.get() == null) {
                daz dazVar = new daz();
                if (j4x.m52413k(atomicReference2, dazVar)) {
                    dm8.m36396a(application);
                    dm8 dm8Var = dm8.f50469e;
                    dm8Var.getClass();
                    synchronized (dm8Var) {
                        dm8Var.f50472c.add(dazVar);
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f67663k) {
            uj5 uj5Var = f67664l;
            ig31.m50508z("FirebaseApp name [DEFAULT] already exists!", !uj5Var.containsKey("[DEFAULT]"));
            ig31.m50507y(context, "Application context cannot be null.");
            fazVar = new faz(context, "[DEFAULT]", bbzVar);
            uj5Var.put("[DEFAULT]", fazVar);
        }
        fazVar.m41200e();
        return fazVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m41197a() {
        ig31.m50508z("FirebaseApp was deleted", !this.f67670f.get());
    }

    /* JADX INFO: renamed from: b */
    public final Object m41198b(Class cls) {
        m41197a();
        return this.f67668d.mo54438a(cls);
    }

    /* JADX INFO: renamed from: d */
    public final String m41199d() {
        StringBuilder sb = new StringBuilder();
        m41197a();
        sb.append(vmg1.m86011s(this.f67666b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        m41197a();
        sb.append(vmg1.m86011s(this.f67667c.f25683b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public final void m41200e() {
        Context context = this.f67665a;
        if (!z8g1.m95592l(context)) {
            m41197a();
            eaz.m38325a(context);
            return;
        }
        m41197a();
        m41197a();
        this.f67668d.m46065i("[DEFAULT]".equals(this.f67666b));
        ((fjp) this.f67672h.get()).m41855b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof faz)) {
            return false;
        }
        faz fazVar = (faz) obj;
        fazVar.m41197a();
        return this.f67666b.equals(fazVar.f67666b);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m41201g() {
        boolean z;
        m41197a();
        ddo ddoVar = (ddo) this.f67671g.get();
        synchronized (ddoVar) {
            z = ddoVar.f47845a;
        }
        return z;
    }

    public final int hashCode() {
        return this.f67666b.hashCode();
    }

    public final String toString() {
        a9i0 a9i0VarM62936D = mvl0.m62936D(this);
        a9i0VarM62936D.m25120b(this.f67666b, "name");
        a9i0VarM62936D.m25120b(this.f67667c, "options");
        return a9i0VarM62936D.toString();
    }
}
