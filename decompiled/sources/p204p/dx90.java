package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dx90 implements jx90 {

    /* JADX INFO: renamed from: a */
    public final String f53908a;

    public dx90(String str) {
        this.f53908a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx90) && wj50.m88271j(this.f53908a, ((dx90) obj).f53908a);
    }

    public final int hashCode() {
        return this.f53908a.hashCode();
    }
}
