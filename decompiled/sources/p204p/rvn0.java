package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rvn0 implements tvn0 {

    /* JADX INFO: renamed from: a */
    public final String f203107a;

    public rvn0(String str) {
        this.f203107a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rvn0) && wj50.m88271j(this.f203107a, ((rvn0) obj).f203107a);
    }

    public final int hashCode() {
        return this.f203107a.hashCode();
    }
}
