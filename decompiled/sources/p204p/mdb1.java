package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mdb1 implements ndb1 {

    /* JADX INFO: renamed from: a */
    public final String f142371a;

    public mdb1(String str) {
        this.f142371a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mdb1) && wj50.m88271j(this.f142371a, ((mdb1) obj).f142371a);
    }

    public final int hashCode() {
        return this.f142371a.hashCode();
    }
}
