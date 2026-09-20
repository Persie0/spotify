package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class n731 implements s731 {

    /* JADX INFO: renamed from: a */
    public final String f151065a;

    public n731(String str) {
        this.f151065a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n731) && wj50.m88271j(this.f151065a, ((n731) obj).f151065a);
    }

    public final int hashCode() {
        return this.f151065a.hashCode();
    }
}
