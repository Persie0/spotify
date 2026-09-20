package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class dvt0 {

    /* JADX INFO: renamed from: a */
    public final boolean f53537a;

    /* JADX INFO: renamed from: b */
    public final List f53538b;

    public dvt0(List list, boolean z) {
        this.f53537a = z;
        this.f53538b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvt0)) {
            return false;
        }
        dvt0 dvt0Var = (dvt0) obj;
        return this.f53537a == dvt0Var.f53537a && wj50.m88271j(this.f53538b, dvt0Var.f53538b);
    }

    public final int hashCode() {
        return this.f53538b.hashCode() + (Boolean.hashCode(this.f53537a) * 31);
    }
}
