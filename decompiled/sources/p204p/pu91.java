package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pu91 {

    /* JADX INFO: renamed from: a */
    public final au91 f181394a;

    public pu91(au91 au91Var) {
        this.f181394a = au91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu91) && wj50.m88271j(this.f181394a, ((pu91) obj).f181394a);
    }

    public final int hashCode() {
        return this.f181394a.hashCode();
    }

    public final String toString() {
        return "UbiImpressionEventIdentity(path=" + this.f181394a + ')';
    }
}
