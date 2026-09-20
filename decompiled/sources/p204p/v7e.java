package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v7e implements b8e {

    /* JADX INFO: renamed from: a */
    public final String f238155a;

    public v7e(String str) {
        this.f238155a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7e) && wj50.m88271j(this.f238155a, ((v7e) obj).f238155a);
    }

    public final int hashCode() {
        return this.f238155a.hashCode();
    }
}
