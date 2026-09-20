package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zuw implements u1x {

    /* JADX INFO: renamed from: a */
    public final String f286550a;

    public zuw(String str) {
        this.f286550a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zuw) && wj50.m88271j(this.f286550a, ((zuw) obj).f286550a);
    }

    public final int hashCode() {
        return this.f286550a.hashCode();
    }
}
