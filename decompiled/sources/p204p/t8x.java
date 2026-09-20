package p204p;

import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t8x {

    /* JADX INFO: renamed from: a */
    public final ois[] f218148a;

    public t8x() {
        LinkedHashMap linkedHashMap = q8x.f186420b;
        int iM52160v = j1h1.m52160v();
        ois[] oisVarArr = new ois[iM52160v];
        for (int i = 0; i < iM52160v; i++) {
            ois oisVar = new ois();
            oisVar.f165879a = 0L;
            oisVar.f165880b = 0L;
            oisVarArr[i] = oisVar;
        }
        this.f218148a = oisVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return t8x.class.equals(obj != null ? obj.getClass() : null) && Arrays.equals(this.f218148a, ((t8x) obj).f218148a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f218148a);
    }
}
