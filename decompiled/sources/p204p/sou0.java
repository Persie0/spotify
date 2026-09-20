package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class sou0 implements uou0 {

    /* JADX INFO: renamed from: a */
    public final List f212654a;

    /* JADX INFO: renamed from: b */
    public final boolean f212655b;

    public sou0(List list, boolean z) {
        this.f212654a = list;
        this.f212655b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sou0)) {
            return false;
        }
        sou0 sou0Var = (sou0) obj;
        return wj50.m88271j(this.f212654a, sou0Var.f212654a) && this.f212655b == sou0Var.f212655b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f212655b) + (this.f212654a.hashCode() * 31);
    }
}
