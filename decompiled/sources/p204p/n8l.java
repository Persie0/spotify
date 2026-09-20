package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n8l {

    /* JADX INFO: renamed from: a */
    public final String f151557a;

    public n8l(String str) {
        this.f151557a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8l) && wj50.m88271j(this.f151557a, ((n8l) obj).f151557a);
    }

    public final int hashCode() {
        return this.f151557a.hashCode();
    }
}
