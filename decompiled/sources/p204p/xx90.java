package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xx90 implements ay90 {

    /* JADX INFO: renamed from: a */
    public final String f266921a;

    public xx90(String str) {
        this.f266921a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xx90) && wj50.m88271j(this.f266921a, ((xx90) obj).f266921a);
    }

    public final int hashCode() {
        return this.f266921a.hashCode();
    }
}
