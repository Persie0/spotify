package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ted1 {

    /* JADX INFO: renamed from: a */
    public final String f219682a;

    /* JADX INFO: renamed from: b */
    public final String f219683b;

    public ted1(String str, String str2) {
        this.f219682a = str;
        this.f219683b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ted1)) {
            return false;
        }
        ted1 ted1Var = (ted1) obj;
        return wj50.m88271j(this.f219682a, ted1Var.f219682a) && wj50.m88271j(this.f219683b, ted1Var.f219683b);
    }

    public final int hashCode() {
        return this.f219683b.hashCode() + (this.f219682a.hashCode() * 31);
    }
}
