package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nos extends pos {

    /* JADX INFO: renamed from: a */
    public final String f156787a;

    public nos(String str) {
        this.f156787a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nos) && wj50.m88271j(this.f156787a, ((nos) obj).f156787a);
    }

    public final int hashCode() {
        return this.f156787a.hashCode();
    }
}
