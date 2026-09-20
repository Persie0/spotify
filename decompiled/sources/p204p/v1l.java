package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class v1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f236409a;

    public v1l(String str) {
        this.f236409a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1l) && wj50.m88271j(this.f236409a, ((v1l) obj).f236409a);
    }

    public final int hashCode() {
        return this.f236409a.hashCode();
    }
}
