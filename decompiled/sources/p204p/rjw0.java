package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rjw0 implements sjw0 {

    /* JADX INFO: renamed from: a */
    public final String f199914a;

    public rjw0(String str) {
        this.f199914a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rjw0) && wj50.m88271j(this.f199914a, ((rjw0) obj).f199914a);
    }

    public final int hashCode() {
        return this.f199914a.hashCode();
    }
}
