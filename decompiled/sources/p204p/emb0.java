package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class emb0 implements fmb0 {

    /* JADX INFO: renamed from: a */
    public final Set f60866a;

    /* JADX INFO: renamed from: b */
    public final boolean f60867b;

    public emb0(Set set, boolean z) {
        this.f60866a = set;
        this.f60867b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emb0)) {
            return false;
        }
        emb0 emb0Var = (emb0) obj;
        return wj50.m88271j(this.f60866a, emb0Var.f60866a) && this.f60867b == emb0Var.f60867b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60867b) + (this.f60866a.hashCode() * 31);
    }
}
