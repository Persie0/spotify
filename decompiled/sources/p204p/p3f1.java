package p204p;

import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class p3f1 implements wj10, xj10 {

    /* JADX INFO: renamed from: l */
    public final o35 f173637l;

    /* JADX INFO: renamed from: m */
    public final i45 f173638m;

    /* JADX INFO: renamed from: n */
    public final yya1 f173639n;

    /* JADX INFO: renamed from: q */
    public final int f173642q;

    /* JADX INFO: renamed from: r */
    public final b4f1 f173643r;

    /* JADX INFO: renamed from: s */
    public boolean f173644s;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ yj10 f173648w;

    /* JADX INFO: renamed from: a */
    public final LinkedList f173636a = new LinkedList();

    /* JADX INFO: renamed from: o */
    public final HashSet f173640o = new HashSet();

    /* JADX INFO: renamed from: p */
    public final HashMap f173641p = new HashMap();

    /* JADX INFO: renamed from: t */
    public final ArrayList f173645t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public lzi f173646u = null;

    /* JADX INFO: renamed from: v */
    public int f173647v = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public p3f1(yj10 yj10Var, tj10 tj10Var) {
        this.f173648w = yj10Var;
        ywh0 ywh0Var = yj10Var.f273250L0;
        Looper looper = ywh0Var.getLooper();
        twy twyVarM34248k = tj10Var.m80958a().m34248k();
        ufc1 ufc1VarM58956q = tj10Var.f220798d.m58956q();
        ig31.m50506x(ufc1VarM58956q);
        o35 o35VarMo48938g = ufc1VarM58956q.mo48938g(tj10Var.f220795a, looper, twyVarM34248k, tj10Var.f220799e, this, this);
        az1 az1Var = tj10Var.f220797c;
        if (az1Var == null || !(o35VarMo48938g instanceof dz8)) {
            String str = tj10Var.f220796b;
            if (str != null && (o35VarMo48938g instanceof dz8)) {
                ((dz8) o35VarMo48938g).m37411E(str);
            }
        } else {
            ((dz8) o35VarMo48938g).m37410D(az1Var);
        }
        this.f173637l = o35VarMo48938g;
        this.f173638m = tj10Var.f220800f;
        this.f173639n = new yya1();
        this.f173642q = tj10Var.f220802h;
        if (o35VarMo48938g.mo27713b()) {
            this.f173643r = new b4f1(yj10Var.f273259e, ywh0Var, tj10Var.m80958a().m34248k());
        } else {
            this.f173643r = null;
        }
    }

    @Override // p204p.xj10
    /* JADX INFO: renamed from: C */
    public final void mo28089C(lzi lziVar) {
        m69013l(lziVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: a */
    public final void m69002a() {
        o35 o35Var = this.f173637l;
        yj10 yj10Var = this.f173648w;
        ig31.m50500r(yj10Var.f273250L0);
        this.f173646u = null;
        m69010i(lzi.f138369f);
        if (this.f173644s) {
            ywh0 ywh0Var = yj10Var.f273250L0;
            i45 i45Var = this.f173638m;
            ywh0Var.removeMessages(11, i45Var);
            yj10Var.f273250L0.removeMessages(9, i45Var);
            this.f173644s = false;
        }
        Iterator it = this.f173641p.values().iterator();
        while (it.hasNext()) {
            jij0 jij0Var = ((a4f1) it.next()).f12242a;
            if (m69011j(jij0Var.m53457d()) != null) {
                it.remove();
            } else {
                try {
                    jij0Var.m53458e(o35Var, new ev61());
                } catch (DeadObjectException unused) {
                    mo28092v1(3);
                    ((dz8) o35Var).m37430g("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException | RuntimeException unused2) {
                    it.remove();
                }
            }
        }
        m69005d();
        m69009h();
    }

    /* JADX INFO: renamed from: b */
    public final void m69003b(int i) {
        yj10 yj10Var = this.f173648w;
        ig31.m50500r(yj10Var.f273250L0);
        this.f173646u = null;
        this.f173644s = true;
        this.f173639n.m94882k(i, ((dz8) this.f173637l).m37436o());
        ywh0 ywh0Var = yj10Var.f273250L0;
        i45 i45Var = this.f173638m;
        ywh0Var.sendMessageDelayed(Message.obtain(ywh0Var, 9, i45Var), 5000L);
        ywh0 ywh0Var2 = yj10Var.f273250L0;
        ywh0Var2.sendMessageDelayed(Message.obtain(ywh0Var2, 11, i45Var), 120000L);
        yj10Var.f273261g.m75392i();
        Iterator it = this.f173641p.values().iterator();
        while (it.hasNext()) {
            ((a4f1) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m69004c(lzi lziVar) {
        synchronized (yj10.f273248P0) {
            try {
                yj10 yj10Var = this.f173648w;
                if (yj10Var.f273252X == null || !yj10Var.f273253Y.contains(this.f173638m)) {
                    return false;
                }
                l3f1 l3f1Var = yj10Var.f273252X;
                int i = this.f173642q;
                l3f1Var.getClass();
                v4f1 v4f1Var = new v4f1(lziVar, i);
                if (t3d1.m80002q(l3f1Var.f129324c, v4f1Var)) {
                    l3f1Var.f129325d.post(new RunnableC2650zh(l3f1Var, v4f1Var));
                }
                yj10Var.f273260f.m83220i(yj10Var.f273259e, lziVar, true);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m69005d() {
        LinkedList linkedList = this.f173636a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            p4f1 p4f1Var = (p4f1) arrayList.get(i);
            if (!((dz8) this.f173637l).m37442x()) {
                return;
            }
            if (m69006e(p4f1Var)) {
                linkedList.remove(p4f1Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final boolean m69006e(p4f1 p4f1Var) {
        if (!(p4f1Var instanceof v3f1)) {
            yya1 yya1Var = this.f173639n;
            o35 o35Var = this.f173637l;
            p4f1Var.mo43531c(yya1Var, o35Var.mo27713b());
            try {
                p4f1Var.mo43532d(this);
                return true;
            } catch (DeadObjectException unused) {
                mo28092v1(1);
                ((dz8) o35Var).m37430g("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        v3f1 v3f1Var = (v3f1) p4f1Var;
        gey geyVarM69011j = m69011j(v3f1Var.mo55372f(this));
        if (geyVarM69011j == null) {
            yya1 yya1Var2 = this.f173639n;
            o35 o35Var2 = this.f173637l;
            p4f1Var.mo43531c(yya1Var2, o35Var2.mo27713b());
            try {
                p4f1Var.mo43532d(this);
                return true;
            } catch (DeadObjectException unused2) {
                mo28092v1(1);
                ((dz8) o35Var2).m37430g("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f173637l.getClass().getName();
        String str = geyVarM69011j.f79230a;
        long jM44535k = geyVarM69011j.m44535k();
        int length = name.length();
        new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(jM44535k).length() + 2);
        yj10 yj10Var = this.f173648w;
        if (!yj10Var.f273251M0 || !v3f1Var.mo55373g(this)) {
            v3f1Var.mo43530b(new UnsupportedApiCallException(geyVarM69011j));
            return true;
        }
        int iMo55374h = v3f1Var.mo55374h(this);
        q3f1 q3f1Var = new q3f1(this.f173638m, geyVarM69011j);
        ArrayList arrayList = this.f173645t;
        int iIndexOf = arrayList.indexOf(q3f1Var);
        if (iIndexOf >= 0) {
            q3f1 q3f1Var2 = (q3f1) arrayList.get(iIndexOf);
            yj10Var.f273250L0.removeMessages(15, q3f1Var2);
            yj10Var.f273250L0.sendMessageDelayed(Message.obtain(yj10Var.f273250L0, 15, q3f1Var2), 5000L);
            return false;
        }
        arrayList.add(q3f1Var);
        yj10Var.f273250L0.sendMessageDelayed(Message.obtain(yj10Var.f273250L0, 15, q3f1Var), 5000L);
        yj10Var.f273250L0.sendMessageDelayed(Message.obtain(yj10Var.f273250L0, 16, q3f1Var), 120000L);
        lzi lziVar = new lzi(1, 2, null, null, Integer.valueOf(iMo55374h));
        if (m69004c(lziVar)) {
            String str2 = geyVarM69011j.f79230a;
            long jM44535k2 = geyVarM69011j.m44535k();
            new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jM44535k2).length());
            return false;
        }
        if (!yj10Var.m93840g(lziVar, this.f173642q)) {
            return false;
        }
        String str3 = geyVarM69011j.f79230a;
        long jM44535k3 = geyVarM69011j.m44535k();
        new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jM44535k3).length());
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m69007f(Status status, Exception exc, boolean z) {
        ig31.m50500r(this.f173648w.f273250L0);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f173636a.iterator();
        while (it.hasNext()) {
            p4f1 p4f1Var = (p4f1) it.next();
            if (!z || p4f1Var.f173916a == 2) {
                if (status != null) {
                    p4f1Var.mo43529a(status);
                } else {
                    p4f1Var.mo43530b(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m69008g(Status status) {
        ig31.m50500r(this.f173648w.f273250L0);
        m69007f(status, null, false);
    }

    /* JADX INFO: renamed from: h */
    public final void m69009h() {
        yj10 yj10Var = this.f173648w;
        ywh0 ywh0Var = yj10Var.f273250L0;
        i45 i45Var = this.f173638m;
        ywh0Var.removeMessages(12, i45Var);
        ywh0 ywh0Var2 = yj10Var.f273250L0;
        ywh0Var2.sendMessageDelayed(ywh0Var2.obtainMessage(12, i45Var), yj10Var.f273255a);
    }

    /* JADX INFO: renamed from: i */
    public final void m69010i(lzi lziVar) {
        HashSet hashSet = this.f173640o;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        ikc0.m50942n(it.next());
        if (mvl0.m62956s(lziVar, lzi.f138369f)) {
            ((dz8) this.f173637l).m37434l();
        }
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public final gey m69011j(gey[] geyVarArr) {
        if (geyVarArr != null && geyVarArr.length != 0) {
            gey[] geyVarArrM37431i = ((dz8) this.f173637l).m37431i();
            if (geyVarArrM37431i == null) {
                geyVarArrM37431i = new gey[0];
            }
            uj5 uj5Var = new uj5(geyVarArrM37431i.length);
            for (gey geyVar : geyVarArrM37431i) {
                uj5Var.put(geyVar.f79230a, Long.valueOf(geyVar.m44535k()));
            }
            for (gey geyVar2 : geyVarArr) {
                Long l = (Long) uj5Var.get(geyVar2.f79230a);
                if (l == null || l.longValue() < geyVar2.m44535k()) {
                    return geyVar2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m69012k(lzi lziVar) {
        ig31.m50500r(this.f173648w.f273250L0);
        Object obj = this.f173637l;
        String name = obj.getClass().getName();
        String strValueOf = String.valueOf(lziVar);
        dz8 dz8Var = (dz8) obj;
        dz8Var.m37430g(klh.m56837i(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        m69013l(lziVar, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m69013l(lzi lziVar, RuntimeException runtimeException) {
        yj10 yj10Var = this.f173648w;
        ig31.m50500r(yj10Var.f273250L0);
        b4f1 b4f1Var = this.f173643r;
        if (b4f1Var != null) {
            b4f1Var.m28091c2();
        }
        ig31.m50500r(this.f173648w.f273250L0);
        this.f173646u = null;
        yj10Var.f273261g.m75392i();
        m69010i(lziVar);
        if ((this.f173637l instanceof a5f1) && lziVar.f138371b != 24) {
            yj10Var.f273256b = true;
            ywh0 ywh0Var = yj10Var.f273250L0;
            ywh0Var.sendMessageDelayed(ywh0Var.obtainMessage(19), 300000L);
        }
        int i = lziVar.f138371b;
        if (i == 4) {
            m69008g(yj10.f273247O0);
            return;
        }
        if (i == 25) {
            m69008g(yj10.m93834c(this.f173638m, lziVar));
            return;
        }
        LinkedList linkedList = this.f173636a;
        if (linkedList.isEmpty()) {
            this.f173646u = lziVar;
            return;
        }
        if (runtimeException != null) {
            ig31.m50500r(yj10Var.f273250L0);
            m69007f(null, runtimeException, false);
            return;
        }
        if (!yj10Var.f273251M0) {
            m69008g(yj10.m93834c(this.f173638m, lziVar));
            return;
        }
        i45 i45Var = this.f173638m;
        m69007f(yj10.m93834c(i45Var, lziVar), null, true);
        if (linkedList.isEmpty() || m69004c(lziVar) || yj10Var.m93840g(lziVar, this.f173642q)) {
            return;
        }
        if (lziVar.f138371b == 18) {
            this.f173644s = true;
        }
        if (!this.f173644s) {
            m69008g(yj10.m93834c(i45Var, lziVar));
        } else {
            ywh0 ywh0Var2 = yj10Var.f273250L0;
            ywh0Var2.sendMessageDelayed(Message.obtain(ywh0Var2, 9, i45Var), 5000L);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m69014m(p4f1 p4f1Var) {
        ig31.m50500r(this.f173648w.f273250L0);
        boolean zM37442x = ((dz8) this.f173637l).m37442x();
        LinkedList linkedList = this.f173636a;
        if (zM37442x) {
            if (m69006e(p4f1Var)) {
                m69009h();
                return;
            } else {
                linkedList.add(p4f1Var);
                return;
            }
        }
        linkedList.add(p4f1Var);
        lzi lziVar = this.f173646u;
        if (lziVar == null || lziVar.f138371b == 0 || lziVar.f138372c == null) {
            m69016o();
        } else {
            m69013l(lziVar, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m69015n() {
        ig31.m50500r(this.f173648w.f273250L0);
        m69008g(yj10.f273246N0);
        this.f173639n.m94881j();
        for (i890 i890Var : (i890[]) this.f173641p.keySet().toArray(new i890[0])) {
            m69014m(new k4f1(i890Var, new ev61()));
        }
        m69010i(new lzi(4, null, null));
        dz8 dz8Var = (dz8) this.f173637l;
        if (dz8Var.m37442x()) {
            dz8Var.m37409C(new vaa1(this, 14));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: o */
    public final void m69016o() {
        yj10 yj10Var = this.f173648w;
        ig31.m50500r(yj10Var.f273250L0);
        o35 o35Var = this.f173637l;
        dz8 dz8Var = (dz8) o35Var;
        if (dz8Var.m37442x() || dz8Var.m37443y()) {
            return;
        }
        try {
            int iM75390g = yj10Var.f273261g.m75390g(yj10Var.f273259e, o35Var);
            if (iM75390g != 0) {
                lzi lziVar = new lzi(iM75390g, null, null);
                new StringBuilder(o35Var.getClass().getName().length() + 35 + lziVar.toString().length());
                m69013l(lziVar, null);
                return;
            }
            i82 i82Var = new i82(yj10Var, o35Var, this.f173638m);
            if (o35Var.mo27713b()) {
                b4f1 b4f1Var = this.f173643r;
                ig31.m50506x(b4f1Var);
                b4f1Var.m28090b2(i82Var);
            }
            try {
                o35Var.mo37429c(i82Var);
            } catch (SecurityException e) {
                m69013l(new lzi(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            m69013l(new lzi(10, null, null), e2);
        }
    }

    @Override // p204p.wj10
    public final void onConnected() {
        yj10 yj10Var = this.f173648w;
        if (Looper.myLooper() == yj10Var.f273250L0.getLooper()) {
            m69002a();
        } else {
            yj10Var.f273250L0.post(new n081(this, 15));
        }
    }

    @Override // p204p.wj10
    /* JADX INFO: renamed from: v1 */
    public final void mo28092v1(int i) {
        yj10 yj10Var = this.f173648w;
        if (Looper.myLooper() == yj10Var.f273250L0.getLooper()) {
            m69003b(i);
        } else {
            yj10Var.f273250L0.post(new e9w(this, i, 5));
        }
    }
}
