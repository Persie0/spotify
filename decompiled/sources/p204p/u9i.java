package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class u9i extends nai {

    /* JADX INFO: renamed from: a */
    public final String f228202a;

    public u9i(String str) {
        this.f228202a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u9i) && wj50.m88271j(this.f228202a, ((u9i) obj).f228202a);
    }

    public final int hashCode() {
        return this.f228202a.hashCode();
    }
}
