package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lfl0 extends mfl0 {

    /* JADX INFO: renamed from: a */
    public final String f132971a;

    public lfl0(String str) {
        this.f132971a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfl0) && wj50.m88271j(this.f132971a, ((lfl0) obj).f132971a);
    }

    public final int hashCode() {
        return this.f132971a.hashCode();
    }
}
