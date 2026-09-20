package p204p;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class j4h1 {

    /* JADX INFO: renamed from: c */
    public static final Logger f108703c = Logger.getLogger(j4h1.class.getName());

    /* JADX INFO: renamed from: d */
    public static final j4h1 f108704d = new j4h1();

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f108705a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f108706b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final synchronized void m52342a(d5h1 d5h1Var, int i, boolean z) {
        if (!xuf1.m92181t(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        m52343b(d5h1Var, z);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m52343b(d5h1 d5h1Var, boolean z) {
        try {
            String str = d5h1Var.f45441a;
            if (z) {
                ConcurrentHashMap concurrentHashMap = this.f108706b;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.f108705a;
            d5h1 d5h1Var2 = (d5h1) concurrentHashMap2.get(str);
            if (d5h1Var2 != null && !d5h1Var2.getClass().equals(d5h1Var.getClass())) {
                f108703c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + d5h1Var2.getClass().getName() + ", cannot be re-registered with " + d5h1Var.getClass().getName());
            }
            concurrentHashMap2.putIfAbsent(str, d5h1Var);
            this.f108706b.put(str, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }
}
