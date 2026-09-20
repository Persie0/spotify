package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gx90 implements jx90 {

    /* JADX INFO: renamed from: a */
    public final String f85229a;

    public gx90(String str) {
        this.f85229a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx90) && wj50.m88271j(this.f85229a, ((gx90) obj).f85229a);
    }

    public final int hashCode() {
        return this.f85229a.hashCode();
    }
}
