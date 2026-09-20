package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j7w extends m7w {

    /* JADX INFO: renamed from: a */
    public final t8w f109669a;

    public j7w(t8w t8wVar) {
        this.f109669a = t8wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7w) && wj50.m88271j(this.f109669a, ((j7w) obj).f109669a);
    }

    public final int hashCode() {
        return this.f109669a.hashCode();
    }
}
