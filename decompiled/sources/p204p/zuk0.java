package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zuk0 {

    /* JADX INFO: renamed from: a */
    public final Boolean f286457a;

    public zuk0(Boolean bool) {
        this.f286457a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zuk0) && wj50.m88271j(this.f286457a, ((zuk0) obj).f286457a);
    }

    public final int hashCode() {
        Boolean bool = this.f286457a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
