package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class olf implements bmf {

    /* JADX INFO: renamed from: a */
    public final String f166835a;

    public olf(String str) {
        this.f166835a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof olf) && wj50.m88271j(this.f166835a, ((olf) obj).f166835a);
    }

    public final int hashCode() {
        return this.f166835a.hashCode();
    }
}
