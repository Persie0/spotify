package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class wrl0 {

    /* JADX INFO: renamed from: a */
    public final List f254385a;

    /* JADX INFO: renamed from: b */
    public final lmc f254386b;

    /* JADX INFO: renamed from: c */
    public final boolean f254387c;

    public wrl0(List list, lmc lmcVar, boolean z) {
        this.f254385a = list;
        this.f254386b = lmcVar;
        this.f254387c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrl0)) {
            return false;
        }
        wrl0 wrl0Var = (wrl0) obj;
        return wj50.m88271j(this.f254385a, wrl0Var.f254385a) && this.f254386b == wrl0Var.f254386b && this.f254387c == wrl0Var.f254387c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f254387c) + ((this.f254386b.hashCode() + (this.f254385a.hashCode() * 31)) * 31);
    }
}
