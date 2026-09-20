package p204p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h5y {

    /* JADX INFO: renamed from: b */
    public static final h5y f87924b = new h5y(q0f1.m71826S(new LinkedHashMap()));

    /* JADX INFO: renamed from: a */
    public final Map f87925a;

    public h5y(Map map) {
        this.f87925a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5y) && wj50.m88271j(this.f87925a, ((h5y) obj).f87925a);
    }

    public final int hashCode() {
        return this.f87925a.hashCode();
    }

    public final String toString() {
        return "Extras(data=" + this.f87925a + ')';
    }
}
