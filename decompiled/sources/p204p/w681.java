package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w681 implements y681 {

    /* JADX INFO: renamed from: a */
    public final String f248281a;

    public w681(String str) {
        this.f248281a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m87270a() {
        return this.f248281a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w681) && wj50.m88271j(this.f248281a, ((w681) obj).f248281a);
    }

    public final int hashCode() {
        return this.f248281a.hashCode();
    }
}
