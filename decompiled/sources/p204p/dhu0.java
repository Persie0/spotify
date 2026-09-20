package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dhu0 implements ehu0 {

    /* JADX INFO: renamed from: a */
    public final String f49171a;

    public dhu0(String str) {
        this.f49171a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhu0) && wj50.m88271j(this.f49171a, ((dhu0) obj).f49171a);
    }

    public final int hashCode() {
        return this.f49171a.hashCode();
    }
}
