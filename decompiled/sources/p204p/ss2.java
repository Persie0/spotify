package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ss2 implements us2 {

    /* JADX INFO: renamed from: a */
    public final String f213459a;

    public ss2(String str) {
        this.f213459a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss2) && wj50.m88271j(this.f213459a, ((ss2) obj).f213459a);
    }

    public final int hashCode() {
        return this.f213459a.hashCode();
    }
}
