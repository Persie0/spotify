package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class is21 implements ks21 {

    /* JADX INFO: renamed from: a */
    public final String f105109a;

    public is21(String str) {
        this.f105109a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m51481a() {
        return this.f105109a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof is21) && wj50.m88271j(this.f105109a, ((is21) obj).f105109a);
    }

    public final int hashCode() {
        return this.f105109a.hashCode();
    }
}
