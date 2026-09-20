package p204p;

import java.io.Serializable;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class zrf1 implements f9g1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f285649a;

    /* JADX INFO: renamed from: b */
    public final Serializable f285650b;

    /* JADX INFO: renamed from: c */
    public volatile Object f285651c;

    /* JADX INFO: renamed from: d */
    public Object f285652d;

    public zrf1(int i) {
        this.f285649a = i;
        switch (i) {
            case 2:
                this.f285650b = new wkf1();
                this.f285652d = d8h1.class.getName();
                break;
            default:
                kfd1 kfd1Var = kfd1.f122143b;
                this.f285650b = new wkf1();
                this.f285651c = kfd1Var;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public Logger m96765a() {
        Logger logger;
        Logger logger2;
        switch (this.f285649a) {
            case 0:
                Logger logger3 = (Logger) this.f285651c;
                if (logger3 != null) {
                    return logger3;
                }
                synchronized (((wkf1) this.f285650b)) {
                    try {
                        logger = (Logger) this.f285651c;
                        if (logger == null) {
                            logger = Logger.getLogger((String) this.f285652d);
                            this.f285651c = logger;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return logger;
            default:
                Logger logger4 = (Logger) this.f285651c;
                if (logger4 != null) {
                    return logger4;
                }
                synchronized (((wkf1) this.f285650b)) {
                    try {
                        logger2 = (Logger) this.f285651c;
                        if (logger2 == null) {
                            logger2 = Logger.getLogger((String) this.f285652d);
                            this.f285651c = logger2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return logger2;
        }
    }

    public String toString() {
        switch (this.f285649a) {
            case 1:
                Object objM36618r = (f9g1) this.f285651c;
                if (objM36618r == z0e1.f278093b) {
                    String strValueOf = String.valueOf(this.f285652d);
                    objM36618r = dq60.m36618r(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
                }
                String strValueOf2 = String.valueOf(objM36618r);
                return dq60.m36618r(new StringBuilder(strValueOf2.length() + 19), "Suppliers.memoize(", strValueOf2, ")");
            default:
                return super.toString();
        }
    }

    @Override // p204p.f9g1
    public Object zza() {
        f9g1 f9g1Var = (f9g1) this.f285651c;
        z0e1 z0e1Var = z0e1.f278093b;
        if (f9g1Var != z0e1Var) {
            synchronized (((wkf1) this.f285650b)) {
                try {
                    if (((f9g1) this.f285651c) != z0e1Var) {
                        Object objZza = ((f9g1) this.f285651c).zza();
                        this.f285652d = objZza;
                        this.f285651c = z0e1Var;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f285652d;
    }

    public zrf1(Class cls) {
        this.f285649a = 0;
        this.f285650b = new wkf1();
        this.f285652d = cls.getName();
    }
}
