package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class pzk implements rzk {

    /* JADX INFO: renamed from: a */
    public final String f183719a;

    public pzk(String str) {
        this.f183719a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pzk) && wj50.m88271j(this.f183719a, ((pzk) obj).f183719a);
    }

    public final int hashCode() {
        return this.f183719a.hashCode();
    }
}
