package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g8c implements h8c {

    /* JADX INFO: renamed from: a */
    public final String f77452a;

    public g8c(String str) {
        this.f77452a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8c) && wj50.m88271j(this.f77452a, ((g8c) obj).f77452a);
    }

    public final int hashCode() {
        return this.f77452a.hashCode();
    }
}
