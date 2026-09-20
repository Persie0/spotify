package p204p;

import android.content.Context;
import com.spotify.casita.p040v1.resolved.ResolvedHome;
import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class w9c implements o9c {

    /* JADX INFO: renamed from: a */
    public final p9c f249145a;

    /* JADX INFO: renamed from: b */
    public final w430 f249146b;

    /* JADX INFO: renamed from: c */
    public final rb5 f249147c;

    /* JADX INFO: renamed from: d */
    public final q530 f249148d;

    /* JADX INFO: renamed from: e */
    public final t9k f249149e;

    /* JADX INFO: renamed from: f */
    public final ub80 f249150f;

    /* JADX INFO: renamed from: g */
    public final xp4 f249151g;

    /* JADX INFO: renamed from: h */
    public final Context f249152h;

    /* JADX INFO: renamed from: i */
    public final t2n f249153i;

    /* JADX INFO: renamed from: j */
    public final long f249154j;

    public w9c(p9c p9cVar, xre xreVar, w430 w430Var, rb5 rb5Var, q530 q530Var, t9k t9kVar, ub80 ub80Var, xp4 xp4Var, Context context, ajp0 ajp0Var, t2n t2nVar) {
        this.f249145a = p9cVar;
        this.f249146b = w430Var;
        this.f249147c = rb5Var;
        this.f249148d = q530Var;
        this.f249149e = t9kVar;
        this.f249150f = ub80Var;
        this.f249151g = xp4Var;
        this.f249152h = context;
        this.f249153i = t2nVar;
        this.f249154j = ((long) xp4Var.m91593N()) * 1000;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Throwable, p.o2x0] */
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
    /* JADX INFO: renamed from: c */
    public static final Object m87494c(w9c w9cVar, String str, String str2, boolean z, boolean z2, String str3, String str4, boolean z3, String str5, ibk ibkVar) {
        v9c v9cVar;
        int i;
        Object obj;
        Object c6x0Var;
        ?? r6;
        Throwable thM77348a;
        o2x0 o2x0Var;
        r530 r530Var;
        boolean z4 = z;
        boolean z5 = z3;
        rb5 rb5Var = w9cVar.f249147c;
        xp4 xp4Var = w9cVar.f249151g;
        if (ibkVar instanceof v9c) {
            v9cVar = (v9c) ibkVar;
            int i2 = v9cVar.f238909e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v9cVar.f238909e = i2 - Integer.MIN_VALUE;
            } else {
                v9cVar = new v9c(w9cVar, ibkVar);
            }
        } else {
            v9cVar = new v9c(w9cVar, ibkVar);
        }
        Object objM69370a = v9cVar.f238907c;
        int i3 = v9cVar.f238909e;
        try {
            if (i3 == 0) {
                bga.m29073P(objM69370a);
                try {
                    p9c p9cVar = w9cVar.f249145a;
                    String id = TimeZone.getDefault().getID();
                    String strM87495d = w9cVar.m87495d(z4);
                    String strM85812s = w9cVar.f249149e.f218321a.m85812s();
                    String strM50615A = ihf1.m50615A(ihf1.m50636t());
                    String str6 = null;
                    try {
                        boolean zM91624j = xp4Var.m91624j();
                        if (xp4Var.m91632n()) {
                            str6 = str4;
                        }
                        try {
                            Object objM74178H = qyg1.m74178H(e0b1.m37490b(w9cVar.f249152h));
                            if (!xp4Var.m91601V()) {
                                objM74178H = str6;
                            }
                            Boolean boolM74178H = z5 ? qyg1.m74178H(true) : str6;
                            v9cVar.f238905a = z4;
                            v9cVar.f238906b = z5;
                            v9cVar.f238909e = 1;
                            fbk<? super o2x0<ResolvedHome>> fbkVar = v9cVar;
                            i = 1;
                            obj = null;
                            try {
                                objM69370a = p9cVar.m69370a(strM87495d, strM85812s, zM91624j, str6, objM74178H, str, str2, id, z2, strM50615A, str3, boolM74178H, str5, fbkVar);
                                Object obj2 = yuk.f276404a;
                                obj = obj;
                                if (objM69370a == obj2) {
                                    return obj2;
                                }
                                c6x0Var = (o2x0) objM69370a;
                                r6 = obj;
                            } catch (Throwable th) {
                                th = th;
                                c6x0Var = new c6x0(th);
                                r6 = obj;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i = 1;
                            obj = str6;
                            c6x0Var = new c6x0(th);
                            r6 = obj;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i = 1;
                        obj = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i = 1;
                    obj = null;
                    c6x0Var = new c6x0(th);
                    r6 = obj;
                    if (!(c6x0Var instanceof c6x0)) {
                        o2x0Var = (o2x0) c6x0Var;
                        rb5Var.m75148F(o2x0Var, r6);
                        if (!z5) {
                            q530 q530Var = w9cVar.f249148d;
                            if (bga.m29065H(o2x0Var)) {
                                r530Var = new r530(i);
                            } else {
                                r530Var = new r530(i);
                            }
                            q530Var.mo40805i(r530Var);
                        }
                    }
                    thM77348a = s6x0.m77348a(c6x0Var);
                    if (thM77348a != null) {
                        rb5Var.m75148F(r6, thM77348a);
                    }
                    bga.m29073P(c6x0Var);
                    return c6x0Var;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z6 = v9cVar.f238906b;
                boolean z7 = v9cVar.f238905a;
                try {
                    bga.m29073P(objM69370a);
                    z5 = z6;
                    z4 = z7;
                    i = 1;
                    obj = null;
                    c6x0Var = (o2x0) objM69370a;
                    r6 = obj;
                } catch (Throwable th5) {
                    th = th5;
                    z5 = z6;
                    z4 = z7;
                    i = 1;
                    obj = null;
                    c6x0Var = new c6x0(th);
                    r6 = obj;
                }
            }
            if (!(c6x0Var instanceof c6x0)) {
                o2x0Var = (o2x0) c6x0Var;
                rb5Var.m75148F(o2x0Var, r6);
                if (!z5) {
                    q530 q530Var2 = w9cVar.f249148d;
                    if (bga.m29065H(o2x0Var) || z4) {
                        r530Var = new r530(i);
                    } else {
                        r530Var = new r530(2);
                    }
                    q530Var2.mo40805i(r530Var);
                }
            }
            thM77348a = s6x0.m77348a(c6x0Var);
            if (thM77348a != null) {
                rb5Var.m75148F(r6, thM77348a);
            }
            bga.m29073P(c6x0Var);
            return c6x0Var;
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // p204p.o9c
    /* JADX INFO: renamed from: b */
    public final Object mo46378b(String str, kaa0 kaa0Var, boolean z, boolean z2, String str2, String str3, boolean z3, String str4, ibk ibkVar) throws IOException {
        r9c r9cVar;
        w9c w9cVar;
        Object c6x0Var;
        if (ibkVar instanceof r9c) {
            r9cVar = (r9c) ibkVar;
            int i = r9cVar.f197016d;
            if ((i & Integer.MIN_VALUE) != 0) {
                r9cVar.f197016d = i - Integer.MIN_VALUE;
            } else {
                r9cVar = new r9c(this, ibkVar);
            }
        } else {
            r9cVar = new r9c(this, ibkVar);
        }
        r9c r9cVar2 = r9cVar;
        Object objM56684z = r9cVar2.f197014b;
        int i2 = r9cVar2.f197016d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM56684z);
                try {
                    u9c u9cVar = new u9c(this, str, this.f249153i.m79916h(), z, str2, str3, z3, str4, null);
                    r9cVar2.f197013a = this;
                    r9cVar2.f197016d = 1;
                    objM56684z = kk40.m56684z(u9cVar, r9cVar2);
                    yuk yukVar = yuk.f276404a;
                    if (objM56684z == yukVar) {
                        return yukVar;
                    }
                    w9cVar = this;
                } catch (Throwable th) {
                    th = th;
                    w9cVar = this;
                    c6x0Var = new c6x0(th);
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w9cVar = r9cVar2.f197013a;
                try {
                    bga.m29073P(objM56684z);
                } catch (Throwable th2) {
                    th = th2;
                    c6x0Var = new c6x0(th);
                }
            }
            c6x0Var = (o2x0) objM56684z;
            Throwable thM77348a = s6x0.m77348a(c6x0Var);
            if (thM77348a != null) {
                this.f249147c.m75148F(null, thM77348a);
            }
            Throwable thM77348a2 = s6x0.m77348a(c6x0Var);
            if (thM77348a2 != null) {
                throw new IOException(thM77348a2);
            }
            o2x0 o2x0Var = (o2x0) c6x0Var;
            w9cVar.getClass();
            if (o2x0Var.f161171a.f149852O0) {
                return o2x0Var;
            }
            n2x0 n2x0Var = o2x0Var.f161171a;
            throw new IOException(ikc0.m50939k("HTTP ", " ", n2x0Var.f149860d, n2x0Var.f149859c));
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m87495d(boolean z) {
        if (((z430) this.f249146b).f279107a.mo48713h(z430.f279106b, false)) {
            return "no-cache";
        }
        if (!z) {
            return "";
        }
        b3b b3bVar = b3b.f22995o;
        b3bVar.getClass();
        return z520.m95444x(b3bVar);
    }
}
