package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v6i extends b7i {

    /* JADX INFO: renamed from: a */
    public final String f237848a;

    public v6i(String str) {
        this.f237848a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v6i) && wj50.m88271j(this.f237848a, ((v6i) obj).f237848a);
    }

    public final int hashCode() {
        return this.f237848a.hashCode();
    }
}
