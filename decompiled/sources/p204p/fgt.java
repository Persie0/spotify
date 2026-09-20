package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fgt implements rmt {

    /* JADX INFO: renamed from: a */
    public final String f69397a;

    public fgt(String str) {
        this.f69397a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fgt) && wj50.m88271j(this.f69397a, ((fgt) obj).f69397a);
    }

    public final int hashCode() {
        return this.f69397a.hashCode();
    }
}
