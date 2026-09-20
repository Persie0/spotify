package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class wlz0 implements ylz0 {

    /* JADX INFO: renamed from: a */
    public final List f252655a;

    /* JADX INFO: renamed from: b */
    public final boolean f252656b;

    public wlz0(List list, boolean z) {
        this.f252655a = list;
        this.f252656b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlz0)) {
            return false;
        }
        wlz0 wlz0Var = (wlz0) obj;
        return wj50.m88271j(this.f252655a, wlz0Var.f252655a) && this.f252656b == wlz0Var.f252656b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f252656b) + (this.f252655a.hashCode() * 31);
    }
}
