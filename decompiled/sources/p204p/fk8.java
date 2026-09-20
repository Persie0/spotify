package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fk8 implements mk8 {

    /* JADX INFO: renamed from: a */
    public final String f70496a;

    public fk8(String str) {
        this.f70496a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fk8) && wj50.m88271j(this.f70496a, ((fk8) obj).f70496a);
    }

    public final int hashCode() {
        return this.f70496a.hashCode();
    }
}
