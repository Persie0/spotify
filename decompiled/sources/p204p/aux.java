package p204p;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class aux {

    /* JADX INFO: renamed from: b */
    public static volatile aux f20043b;

    /* JADX INFO: renamed from: c */
    public static final aux f20044c = new aux();

    /* JADX INFO: renamed from: a */
    public final Map f20045a;

    public aux(aux auxVar) {
        if (auxVar == f20044c) {
            this.f20045a = Collections.EMPTY_MAP;
        } else {
            this.f20045a = Collections.unmodifiableMap(auxVar.f20045a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static aux m27220a() {
        aux auxVar;
        e3t0 e3t0Var = e3t0.f55882c;
        aux auxVar2 = f20043b;
        if (auxVar2 != null) {
            return auxVar2;
        }
        synchronized (aux.class) {
            try {
                auxVar = f20043b;
                if (auxVar == null) {
                    Class cls = utx.f234004a;
                    aux auxVar3 = null;
                    if (cls != null) {
                        try {
                            auxVar3 = (aux) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    auxVar = auxVar3 != null ? auxVar3 : f20044c;
                    f20043b = auxVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return auxVar;
    }

    public aux() {
        this.f20045a = Collections.EMPTY_MAP;
    }
}
