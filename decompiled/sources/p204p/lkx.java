package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lkx implements mkx {

    /* JADX INFO: renamed from: a */
    public final String f134472a;

    public lkx(String str) {
        this.f134472a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lkx) && wj50.m88271j(this.f134472a, ((lkx) obj).f134472a);
    }

    public final int hashCode() {
        return this.f134472a.hashCode();
    }
}
