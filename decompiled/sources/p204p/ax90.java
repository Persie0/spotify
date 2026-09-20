package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ax90 implements jx90 {

    /* JADX INFO: renamed from: a */
    public final String f20812a;

    public ax90(String str) {
        this.f20812a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ax90) && wj50.m88271j(this.f20812a, ((ax90) obj).f20812a);
    }

    public final int hashCode() {
        return this.f20812a.hashCode();
    }
}
