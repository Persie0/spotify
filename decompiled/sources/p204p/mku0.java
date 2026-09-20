package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mku0 implements qku0 {

    /* JADX INFO: renamed from: a */
    public final String f144689a;

    public mku0(String str) {
        this.f144689a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mku0) && wj50.m88271j(this.f144689a, ((mku0) obj).f144689a);
    }

    public final int hashCode() {
        return this.f144689a.hashCode();
    }
}
