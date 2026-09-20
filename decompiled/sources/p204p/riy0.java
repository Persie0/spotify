package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class riy0 implements djy0 {

    /* JADX INFO: renamed from: a */
    public final List f199652a;

    /* JADX INFO: renamed from: b */
    public final boolean f199653b;

    public riy0(List list, boolean z) {
        this.f199652a = list;
        this.f199653b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof riy0)) {
            return false;
        }
        riy0 riy0Var = (riy0) obj;
        return wj50.m88271j(this.f199652a, riy0Var.f199652a) && this.f199653b == riy0Var.f199653b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f199653b) + (this.f199652a.hashCode() * 31);
    }
}
