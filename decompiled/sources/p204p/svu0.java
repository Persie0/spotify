package p204p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class svu0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f214511a = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: b */
    public long f214512b;

    /* JADX INFO: renamed from: c */
    public long f214513c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tvu0 f214514d;

    public svu0(tvu0 tvu0Var, long j) {
        this.f214514d = tvu0Var;
        this.f214512b = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m79496a(Object obj, Object obj2, rvu0 rvu0Var) {
        rvu0 rvu0Var2 = (rvu0) obj2;
        this.f214514d.f224243b.m78121i((pge0) obj, rvu0Var2.f203131a, rvu0Var2.f203132b, rvu0Var2.f203133c);
    }

    /* JADX INFO: renamed from: b */
    public final long m79497b() {
        if (this.f214513c == -1) {
            long jM79498c = 0;
            for (Map.Entry entry : this.f214511a.entrySet()) {
                jM79498c += m79498c(entry.getKey(), entry.getValue());
            }
            this.f214513c = jM79498c;
        }
        return this.f214513c;
    }

    /* JADX INFO: renamed from: c */
    public final long m79498c(Object obj, Object obj2) throws Exception {
        try {
            long j = ((rvu0) obj2).f203133c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.f214513c = -1L;
            throw e;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m79499d(long j) {
        while (m79497b() > j) {
            LinkedHashMap linkedHashMap = this.f214511a;
            if (linkedHashMap.isEmpty()) {
                if (m79497b() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) g6f.m43739p0(linkedHashMap.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap.remove(key);
            this.f214513c = m79497b() - m79498c(key, value);
            m79496a(key, value, null);
        }
    }
}
