package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tkf implements bmf {

    /* JADX INFO: renamed from: a */
    public final String f221129a;

    public tkf(String str) {
        this.f221129a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tkf) && wj50.m88271j(this.f221129a, ((tkf) obj).f221129a);
    }

    public final int hashCode() {
        return this.f221129a.hashCode();
    }
}
