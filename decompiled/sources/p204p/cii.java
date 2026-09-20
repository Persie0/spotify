package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cii {

    /* JADX INFO: renamed from: a */
    public final Long f38351a;

    public cii(Long l) {
        this.f38351a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cii) && wj50.m88271j(this.f38351a, ((cii) obj).f38351a);
    }

    public final int hashCode() {
        Long l = this.f38351a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }
}
