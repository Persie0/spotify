package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eai extends nai {

    /* JADX INFO: renamed from: a */
    public final d2k0 f57682a;

    public eai(d2k0 d2k0Var) {
        this.f57682a = d2k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eai) && wj50.m88271j(this.f57682a, ((eai) obj).f57682a);
    }

    public final int hashCode() {
        return this.f57682a.hashCode();
    }
}
