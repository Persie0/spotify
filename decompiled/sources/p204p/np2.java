package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class np2 implements pp2 {

    /* JADX INFO: renamed from: a */
    public final String f156850a;

    public np2(String str) {
        this.f156850a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m65282a() {
        return this.f156850a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof np2) && wj50.m88271j(this.f156850a, ((np2) obj).f156850a);
    }

    public final int hashCode() {
        String str = this.f156850a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
