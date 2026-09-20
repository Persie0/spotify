package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pge0 {

    /* JADX INFO: renamed from: a */
    public final String f177295a;

    /* JADX INFO: renamed from: b */
    public final Map f177296b;

    public pge0(String str, Map map) {
        this.f177295a = str;
        this.f177296b = q0f1.m71826S(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pge0)) {
            return false;
        }
        pge0 pge0Var = (pge0) obj;
        return wj50.m88271j(this.f177295a, pge0Var.f177295a) && wj50.m88271j(this.f177296b, pge0Var.f177296b);
    }

    public final int hashCode() {
        return this.f177296b.hashCode() + (this.f177295a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f177295a + ", extras=" + this.f177296b + ')';
    }
}
