package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ij71 implements mj71 {

    /* JADX INFO: renamed from: a */
    public final String f102745a;

    public ij71(String str) {
        this.f102745a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ij71) && wj50.m88271j(this.f102745a, ((ij71) obj).f102745a);
    }

    public final int hashCode() {
        return this.f102745a.hashCode();
    }
}
