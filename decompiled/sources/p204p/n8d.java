package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n8d implements lad {

    /* JADX INFO: renamed from: a */
    public final l6s f151502a;

    public n8d(l6s l6sVar) {
        this.f151502a = l6sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8d) && wj50.m88271j(this.f151502a, ((n8d) obj).f151502a);
    }

    public final int hashCode() {
        return this.f151502a.hashCode();
    }
}
