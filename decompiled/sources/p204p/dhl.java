package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class dhl {

    /* JADX INFO: renamed from: a */
    public final Map f49126a;

    /* JADX INFO: renamed from: b */
    public final Map f49127b;

    public dhl(Map map, Map map2) {
        this.f49126a = map;
        this.f49127b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhl)) {
            return false;
        }
        dhl dhlVar = (dhl) obj;
        return wj50.m88271j(this.f49126a, dhlVar.f49126a) && wj50.m88271j(this.f49127b, dhlVar.f49127b);
    }

    public final int hashCode() {
        return this.f49127b.hashCode() + (this.f49126a.hashCode() * 31);
    }
}
