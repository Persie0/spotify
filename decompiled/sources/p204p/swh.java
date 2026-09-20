package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class swh implements cxh {

    /* JADX INFO: renamed from: a */
    public final String f214668a;

    public swh(String str) {
        this.f214668a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swh) && wj50.m88271j(this.f214668a, ((swh) obj).f214668a);
    }

    public final int hashCode() {
        return this.f214668a.hashCode();
    }
}
