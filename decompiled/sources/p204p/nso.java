package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nso implements rso {

    /* JADX INFO: renamed from: a */
    public final String f157854a;

    public nso(String str) {
        this.f157854a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nso) && wj50.m88271j(this.f157854a, ((nso) obj).f157854a);
    }

    public final int hashCode() {
        return this.f157854a.hashCode();
    }
}
