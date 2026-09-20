package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class wfb0 implements xfb0 {

    /* JADX INFO: renamed from: a */
    public final Set f250785a;

    /* JADX INFO: renamed from: b */
    public final boolean f250786b;

    public wfb0(Set set, boolean z) {
        this.f250785a = set;
        this.f250786b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfb0)) {
            return false;
        }
        wfb0 wfb0Var = (wfb0) obj;
        return wj50.m88271j(this.f250785a, wfb0Var.f250785a) && this.f250786b == wfb0Var.f250786b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f250786b) + (this.f250785a.hashCode() * 31);
    }
}
