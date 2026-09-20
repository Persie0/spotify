package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zak {

    /* JADX INFO: renamed from: a */
    public final Boolean f281082a;

    public zak(Boolean bool) {
        this.f281082a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zak) && wj50.m88271j(this.f281082a, ((zak) obj).f281082a);
    }

    public final int hashCode() {
        Boolean bool = this.f281082a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
