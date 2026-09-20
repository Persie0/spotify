package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bcz {

    /* JADX INFO: renamed from: a */
    public final String f25958a;

    /* JADX INFO: renamed from: b */
    public final acz f25959b;

    public bcz(String str, acz aczVar) {
        this.f25958a = str;
        this.f25959b = aczVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcz)) {
            return false;
        }
        bcz bczVar = (bcz) obj;
        return wj50.m88271j(this.f25958a, bczVar.f25958a) && this.f25959b == bczVar.f25959b;
    }

    public final int hashCode() {
        return this.f25959b.hashCode() + (this.f25958a.hashCode() * 31);
    }
}
