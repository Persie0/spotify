package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gkd implements ykd {

    /* JADX INFO: renamed from: a */
    public final String f80782a;

    public gkd(String str) {
        this.f80782a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gkd) && wj50.m88271j(this.f80782a, ((gkd) obj).f80782a);
    }

    public final int hashCode() {
        return this.f80782a.hashCode();
    }
}
