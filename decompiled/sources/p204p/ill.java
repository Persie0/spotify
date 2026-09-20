package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ill implements jll {

    /* JADX INFO: renamed from: a */
    public final String f103397a;

    public ill(String str) {
        this.f103397a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ill) && wj50.m88271j(this.f103397a, ((ill) obj).f103397a);
    }

    public final int hashCode() {
        return this.f103397a.hashCode();
    }
}
