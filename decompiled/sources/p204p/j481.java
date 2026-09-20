package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j481 extends l481 {

    /* JADX INFO: renamed from: a */
    public final String f108620a;

    public j481(String str) {
        this.f108620a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j481) && wj50.m88271j(this.f108620a, ((j481) obj).f108620a);
    }

    public final int hashCode() {
        return this.f108620a.hashCode();
    }
}
