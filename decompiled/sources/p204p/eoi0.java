package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class eoi0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f61430a;

    public eoi0(LinkedHashMap linkedHashMap) {
        this.f61430a = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public final void m39574a(o50 o50Var, Object obj) {
        LinkedHashMap linkedHashMap = this.f61430a;
        linkedHashMap.get(o50Var);
        if (obj == null) {
            linkedHashMap.remove(o50Var);
        } else {
            linkedHashMap.put(o50Var, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eoi0) {
            return this.f61430a.equals(((eoi0) obj).f61430a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f61430a.hashCode();
    }

    public final String toString() {
        return this.f61430a.toString();
    }
}
