package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a7i extends b7i {

    /* JADX INFO: renamed from: a */
    public final String f13057a;

    public a7i(String str) {
        this.f13057a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7i) && wj50.m88271j(this.f13057a, ((a7i) obj).f13057a);
    }

    public final int hashCode() {
        return this.f13057a.hashCode();
    }
}
