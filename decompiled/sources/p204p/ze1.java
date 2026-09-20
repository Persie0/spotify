package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ze1 implements cf1 {

    /* JADX INFO: renamed from: a */
    public final String f281845a;

    public ze1(String str) {
        this.f281845a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ze1) && wj50.m88271j(this.f281845a, ((ze1) obj).f281845a);
    }

    public final int hashCode() {
        return this.f281845a.hashCode();
    }
}
