package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class zz30 implements b040 {

    /* JADX INFO: renamed from: a */
    public final String f287882a;

    public zz30(String str) {
        this.f287882a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zz30) && wj50.m88271j(this.f287882a, ((zz30) obj).f287882a);
    }

    public final int hashCode() {
        return this.f287882a.hashCode();
    }
}
