package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kkf implements lkf {

    /* JADX INFO: renamed from: a */
    public final String f123591a;

    public kkf(String str) {
        this.f123591a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kkf) && wj50.m88271j(this.f123591a, ((kkf) obj).f123591a);
    }

    public final int hashCode() {
        return this.f123591a.hashCode();
    }
}
