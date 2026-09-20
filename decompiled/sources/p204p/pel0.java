package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pel0 implements sel0 {

    /* JADX INFO: renamed from: a */
    public final String f176782a;

    public pel0(String str) {
        this.f176782a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pel0) && wj50.m88271j(this.f176782a, ((pel0) obj).f176782a);
    }

    public final int hashCode() {
        return this.f176782a.hashCode();
    }
}
