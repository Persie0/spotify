package p204p;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class qsv0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f192222a = Logger.getLogger(qsv0.class.getName());

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f192223b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f192224c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f192225d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f192226e;

    static {
        new ConcurrentHashMap();
        f192226e = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m73762a(String str, Class cls, boolean z) {
        ConcurrentHashMap concurrentHashMap = f192223b;
        if (concurrentHashMap.containsKey(str)) {
            psv0 psv0Var = (psv0) concurrentHashMap.get(str);
            if (psv0Var.f180994a.getClass().equals(cls)) {
                if (z && !((Boolean) f192225d.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
                return;
            }
            f192222a.warning("Attempted overwrite of a registered key manager for key type " + str);
            throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + psv0Var.f180994a.getClass().getName() + ", cannot be re-registered with " + cls.getName());
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized psv0 m73763b(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = f192223b;
        if (!concurrentHashMap.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (psv0) concurrentHashMap.get(str);
    }

    /* JADX INFO: renamed from: c */
    public static Object m73764c(String str, byte[] bArr) {
        bva bvaVar = fva.f73739b;
        return m73765d(str, fva.m42776d(0, bArr, bArr.length), a32.class);
    }

    /* JADX INFO: renamed from: d */
    public static Object m73765d(String str, fva fvaVar, Class cls) {
        AbstractC2440u5 abstractC2440u5 = m73763b(str).f180994a;
        if (abstractC2440u5.m82372R().contains(cls)) {
            try {
                return new i5z(abstractC2440u5, cls).m49786r(fvaVar);
            } catch (IllegalArgumentException e) {
                throw new GeneralSecurityException("Primitive type not supported", e);
            }
        }
        StringBuilder sb = new StringBuilder("Primitive type ");
        sb.append(cls.getName());
        sb.append(" not supported by key manager of type ");
        sb.append(abstractC2440u5.getClass());
        sb.append(", supported primitives: ");
        Set<Class> setM82372R = abstractC2440u5.m82372R();
        StringBuilder sb2 = new StringBuilder();
        boolean z = true;
        for (Class cls2 : setM82372R) {
            if (!z) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z = false;
        }
        sb.append(sb2.toString());
        throw new GeneralSecurityException(sb.toString());
    }

    /* JADX INFO: renamed from: e */
    public static synchronized du60 m73766e(uu60 uu60Var) {
        i5z i5zVar;
        AbstractC2440u5 abstractC2440u5 = m73763b(uu60Var.m83973r()).f180994a;
        i5zVar = new i5z(abstractC2440u5, abstractC2440u5.m82374k());
        if (!((Boolean) f192225d.get(uu60Var.m83973r())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + uu60Var.m83973r());
        }
        return i5zVar.m49787s(uu60Var.m83974s());
    }

    /* JADX INFO: renamed from: f */
    public static synchronized void m73767f(AbstractC2440u5 abstractC2440u5, boolean z) {
        try {
            String strMo57978q = abstractC2440u5.mo57978q();
            m73762a(strMo57978q, abstractC2440u5.getClass(), z);
            ConcurrentHashMap concurrentHashMap = f192223b;
            if (!concurrentHashMap.containsKey(strMo57978q)) {
                concurrentHashMap.put(strMo57978q, new psv0(abstractC2440u5));
                f192224c.put(strMo57978q, new ti5(23));
            }
            f192225d.put(strMo57978q, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public static synchronized void m73768g(ier0 ier0Var) {
        try {
            Class clsMo34800c = ier0Var.mo34800c();
            ConcurrentHashMap concurrentHashMap = f192226e;
            if (concurrentHashMap.containsKey(clsMo34800c)) {
                ier0 ier0Var2 = (ier0) concurrentHashMap.get(clsMo34800c);
                if (!ier0Var.getClass().equals(ier0Var2.getClass())) {
                    f192222a.warning("Attempted overwrite of a registered SetWrapper for type " + clsMo34800c);
                    throw new GeneralSecurityException("SetWrapper for primitive (" + clsMo34800c.getName() + ") is already registered to be " + ier0Var2.getClass().getName() + ", cannot be re-registered with " + ier0Var.getClass().getName());
                }
            }
            concurrentHashMap.put(clsMo34800c, ier0Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
