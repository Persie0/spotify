package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class n7y0 implements o7y0 {

    /* JADX INFO: renamed from: a */
    public final Map f151272a;

    /* JADX INFO: renamed from: b */
    public final boolean f151273b;

    public n7y0(Map map, boolean z) {
        this.f151272a = map;
        this.f151273b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7y0)) {
            return false;
        }
        n7y0 n7y0Var = (n7y0) obj;
        return wj50.m88271j(this.f151272a, n7y0Var.f151272a) && this.f151273b == n7y0Var.f151273b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f151273b) + (this.f151272a.hashCode() * 31);
    }
}
