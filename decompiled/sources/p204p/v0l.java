package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class v0l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f236080a;

    public v0l(String str) {
        this.f236080a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0l) && wj50.m88271j(this.f236080a, ((v0l) obj).f236080a);
    }

    public final int hashCode() {
        return this.f236080a.hashCode();
    }
}
