package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ge31 implements ie31 {

    /* JADX INFO: renamed from: a */
    public final String f79010a;

    public ge31(String str) {
        this.f79010a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge31) && wj50.m88271j(this.f79010a, ((ge31) obj).f79010a);
    }

    public final int hashCode() {
        return this.f79010a.hashCode();
    }
}
