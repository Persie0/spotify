package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class wct0 extends xct0 {

    /* JADX INFO: renamed from: a */
    public final List f250111a;

    /* JADX INFO: renamed from: b */
    public final boolean f250112b;

    public wct0(List list, boolean z) {
        this.f250111a = list;
        this.f250112b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wct0)) {
            return false;
        }
        wct0 wct0Var = (wct0) obj;
        return wj50.m88271j(this.f250111a, wct0Var.f250111a) && this.f250112b == wct0Var.f250112b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f250112b) + (this.f250111a.hashCode() * 31);
    }
}
