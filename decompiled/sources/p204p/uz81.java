package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uz81 implements vz81 {

    /* JADX INFO: renamed from: a */
    public final String f235449a;

    public uz81(String str) {
        this.f235449a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uz81) && wj50.m88271j(this.f235449a, ((uz81) obj).f235449a);
    }

    public final int hashCode() {
        return this.f235449a.hashCode();
    }
}
