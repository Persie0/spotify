package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jua1 extends lua1 {

    /* JADX INFO: renamed from: a */
    public final String f116065a;

    public jua1(String str) {
        this.f116065a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m54336a() {
        return this.f116065a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jua1) && wj50.m88271j(this.f116065a, ((jua1) obj).f116065a);
    }

    public final int hashCode() {
        return this.f116065a.hashCode();
    }
}
