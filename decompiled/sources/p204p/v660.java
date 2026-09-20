package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class v660 {

    /* JADX INFO: renamed from: a */
    public final Map f237739a;

    /* JADX INFO: renamed from: b */
    public final Object f237740b;

    public v660(Map map, Map map2) {
        this.f237739a = map;
        this.f237740b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v660)) {
            return false;
        }
        v660 v660Var = (v660) obj;
        return wj50.m88271j(this.f237739a, v660Var.f237739a) && this.f237740b.equals(v660Var.f237740b);
    }

    public final int hashCode() {
        return this.f237740b.hashCode() + (this.f237739a.hashCode() * 31);
    }
}
