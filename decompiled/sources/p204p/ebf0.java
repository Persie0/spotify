package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ebf0 {

    /* JADX INFO: renamed from: a */
    public final ern0 f57921a;

    public ebf0(ern0 ern0Var) {
        this.f57921a = ern0Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX INFO: renamed from: a */
    public final ebf0 m38366a(Map map, boolean z) {
        ern0 ern0VarM67547D;
        if (!map.isEmpty()) {
            crn0 crn0VarBuilder = this.f57921a.builder();
            boolean z2 = false;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Map map2 = (Map) entry.getValue();
                ern0 ern0Var = (ern0) crn0VarBuilder.get(str);
                if (ern0Var != null) {
                    crn0 crn0VarBuilder2 = ern0Var.builder();
                    boolean z3 = false;
                    for (Map.Entry entry2 : map2.entrySet()) {
                        Object key = entry2.getKey();
                        dbf0 dbf0Var = (dbf0) entry2.getValue();
                        dbf0 dbf0Var2 = (dbf0) crn0VarBuilder2.get(key);
                        if (!z || dbf0Var2 == null || !(dbf0Var2 instanceof cbf0) || !(dbf0Var instanceof bbf0)) {
                            if (!wj50.m88271j(dbf0Var2, dbf0Var)) {
                                crn0VarBuilder2.put(key, dbf0Var);
                                z3 = true;
                            }
                        }
                    }
                    ern0VarM67547D = z3 ? crn0VarBuilder2.build() : ern0Var;
                    if (ern0VarM67547D == null) {
                        ern0VarM67547D = opo.m67547D(map2);
                    }
                } else {
                    ern0VarM67547D = opo.m67547D(map2);
                }
                if (ern0VarM67547D != ern0Var) {
                    crn0VarBuilder.put(str, ern0VarM67547D);
                    z2 = true;
                }
            }
            if (z2) {
                return new ebf0(crn0VarBuilder.build());
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m38367b() {
        Collection collectionMo36660d = ((AbstractC2328r7) this.f57921a).mo36660d();
        if (collectionMo36660d.isEmpty()) {
            return false;
        }
        Iterator it = collectionMo36660d.iterator();
        while (it.hasNext()) {
            Collection collectionMo36660d2 = ((AbstractC2328r7) ((ern0) it.next())).mo36660d();
            if (!collectionMo36660d2.isEmpty()) {
                Iterator it2 = collectionMo36660d2.iterator();
                while (it2.hasNext()) {
                    if (((dbf0) it2.next()) instanceof bbf0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final dbf0 m38368c(Class cls, String str) {
        ern0 ern0Var = (ern0) this.f57921a.get(str);
        if (ern0Var == null) {
            return null;
        }
        Object obj = ern0Var.get(cls);
        if (obj instanceof dbf0) {
            return (dbf0) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ebf0) {
            return wj50.m88271j(this.f57921a, ((ebf0) obj).f57921a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f57921a.hashCode();
    }

    public final String toString() {
        return "MetadataValues(m=" + this.f57921a + ")";
    }

    public /* synthetic */ ebf0() {
        this(nau.f152117a);
    }

    public ebf0(Map map) {
        this((ern0) pwb.m71227l(map));
    }
}
