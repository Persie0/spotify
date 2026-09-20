package p204p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class qdm {

    /* JADX INFO: renamed from: a */
    public final String f187711a;

    /* JADX INFO: renamed from: b */
    public final String f187712b;

    /* JADX INFO: renamed from: c */
    public final tp80 f187713c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f187714d;

    /* JADX INFO: renamed from: e */
    public final Map f187715e;

    /* JADX INFO: renamed from: f */
    public final hzd0 f187716f;

    /* JADX INFO: renamed from: g */
    public final fw7 f187717g;

    /* JADX INFO: renamed from: h */
    public final boolean f187718h;

    /* JADX INFO: renamed from: i */
    public final boolean f187719i;

    /* JADX INFO: renamed from: j */
    public final j441 f187720j;

    public qdm(String str, String str2, tp80 tp80Var, LinkedHashMap linkedHashMap, Map map, hzd0 hzd0Var, fw7 fw7Var, boolean z, boolean z2, j441 j441Var) {
        this.f187711a = str;
        this.f187712b = str2;
        this.f187713c = tp80Var;
        this.f187714d = linkedHashMap;
        this.f187715e = map;
        this.f187716f = hzd0Var;
        this.f187717g = fw7Var;
        this.f187718h = z;
        this.f187719i = z2;
        this.f187720j = j441Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qdm) {
            return wj50.m88271j(this.f187712b, ((qdm) obj).f187712b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f187712b.hashCode();
    }
}
