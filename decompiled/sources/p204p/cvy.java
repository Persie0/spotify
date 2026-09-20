package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cvy implements dvy {

    /* JADX INFO: renamed from: a */
    public final l380 f42578a;

    public cvy(l380 l380Var) {
        this.f42578a = l380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvy) && wj50.m88271j(this.f42578a, ((cvy) obj).f42578a);
    }

    public final int hashCode() {
        return this.f42578a.hashCode();
    }
}
