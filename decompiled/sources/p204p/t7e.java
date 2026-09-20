package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t7e implements b8e {

    /* JADX INFO: renamed from: a */
    public final String f217756a;

    public t7e(String str) {
        this.f217756a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7e) && wj50.m88271j(this.f217756a, ((t7e) obj).f217756a);
    }

    public final int hashCode() {
        return this.f217756a.hashCode();
    }
}
