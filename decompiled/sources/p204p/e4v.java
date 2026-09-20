package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e4v implements g4v {

    /* JADX INFO: renamed from: a */
    public final String f56178a;

    public e4v(String str) {
        this.f56178a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e4v) && wj50.m88271j(this.f56178a, ((e4v) obj).f56178a);
    }

    public final int hashCode() {
        return this.f56178a.hashCode();
    }
}
