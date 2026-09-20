package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bv90 implements iv90 {

    /* JADX INFO: renamed from: a */
    public final String f31310a;

    public bv90(String str, int i) {
        this.f31310a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bv90) && wj50.m88271j(this.f31310a, ((bv90) obj).f31310a);
    }

    public final int hashCode() {
        return this.f31310a.hashCode() * 31;
    }
}
