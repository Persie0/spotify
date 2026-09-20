package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class j8d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f109905a;

    public j8d(String str) {
        this.f109905a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8d) && wj50.m88271j(this.f109905a, ((j8d) obj).f109905a);
    }

    public final int hashCode() {
        return this.f109905a.hashCode();
    }
}
