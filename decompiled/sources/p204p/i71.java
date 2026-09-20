package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i71 extends t71 {

    /* JADX INFO: renamed from: a */
    public final String f99405a;

    public i71(String str) {
        this.f99405a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i71) && wj50.m88271j(this.f99405a, ((i71) obj).f99405a);
    }

    public final int hashCode() {
        return this.f99405a.hashCode();
    }
}
