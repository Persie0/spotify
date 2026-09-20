package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n9d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f151771a;

    public n9d(String str) {
        this.f151771a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9d) && wj50.m88271j(this.f151771a, ((n9d) obj).f151771a);
    }

    public final int hashCode() {
        return this.f151771a.hashCode();
    }
}
