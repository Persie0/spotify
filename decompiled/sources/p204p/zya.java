package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zya extends bza {

    /* JADX INFO: renamed from: a */
    public final String f287538a;

    public zya(String str) {
        this.f287538a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zya) && wj50.m88271j(this.f287538a, ((zya) obj).f287538a);
    }

    public final int hashCode() {
        return this.f287538a.hashCode();
    }
}
