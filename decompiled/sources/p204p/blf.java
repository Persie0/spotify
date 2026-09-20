package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class blf implements bmf {

    /* JADX INFO: renamed from: a */
    public final String f28176a;

    public blf(String str) {
        this.f28176a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof blf) && wj50.m88271j(this.f28176a, ((blf) obj).f28176a);
    }

    public final int hashCode() {
        return this.f28176a.hashCode();
    }
}
