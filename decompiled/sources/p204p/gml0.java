package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class gml0 {

    /* JADX INFO: renamed from: a */
    public final Set f81426a;

    /* JADX INFO: renamed from: b */
    public final long f81427b;

    public gml0(Set set, long j) {
        this.f81426a = set;
        this.f81427b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gml0)) {
            return false;
        }
        gml0 gml0Var = (gml0) obj;
        return wj50.m88271j(this.f81426a, gml0Var.f81426a) && this.f81427b == gml0Var.f81427b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f81427b) + (this.f81426a.hashCode() * 31);
    }
}
