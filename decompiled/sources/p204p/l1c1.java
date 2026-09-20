package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class l1c1 {

    /* JADX INFO: renamed from: a */
    public final String f128699a;

    /* JADX INFO: renamed from: b */
    public final Map f128700b;

    public l1c1(String str, Map map) {
        this.f128699a = str;
        this.f128700b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1c1)) {
            return false;
        }
        l1c1 l1c1Var = (l1c1) obj;
        return wj50.m88271j(this.f128699a, l1c1Var.f128699a) && wj50.m88271j(this.f128700b, l1c1Var.f128700b);
    }

    public final int hashCode() {
        return this.f128700b.hashCode() + (this.f128699a.hashCode() * 31);
    }
}
