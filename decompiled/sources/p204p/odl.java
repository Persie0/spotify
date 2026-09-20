package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class odl implements pdl {

    /* JADX INFO: renamed from: a */
    public final String f164212a;

    public odl(String str) {
        this.f164212a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof odl) && wj50.m88271j(this.f164212a, ((odl) obj).f164212a);
    }

    public final int hashCode() {
        return this.f164212a.hashCode();
    }
}
