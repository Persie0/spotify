package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kj01 {

    /* JADX INFO: renamed from: a */
    public final String f123192a;

    public kj01(String str) {
        this.f123192a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kj01) && wj50.m88271j(this.f123192a, ((kj01) obj).f123192a);
    }

    public final int hashCode() {
        return this.f123192a.hashCode();
    }
}
