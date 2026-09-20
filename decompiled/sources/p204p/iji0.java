package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class iji0 implements kji0 {

    /* JADX INFO: renamed from: a */
    public final String f102812a;

    public iji0(String str) {
        this.f102812a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iji0) && wj50.m88271j(this.f102812a, ((iji0) obj).f102812a);
    }

    public final int hashCode() {
        return this.f102812a.hashCode();
    }
}
