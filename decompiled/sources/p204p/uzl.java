package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uzl implements vzl {

    /* JADX INFO: renamed from: a */
    public final String f235605a;

    public uzl(String str) {
        this.f235605a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uzl) && wj50.m88271j(this.f235605a, ((uzl) obj).f235605a);
    }

    public final int hashCode() {
        return this.f235605a.hashCode();
    }
}
