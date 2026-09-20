package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mym0 extends rym0 {

    /* JADX INFO: renamed from: a */
    public final String f148484a;

    public mym0(String str) {
        this.f148484a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mym0) && wj50.m88271j(this.f148484a, ((mym0) obj).f148484a);
    }

    public final int hashCode() {
        return this.f148484a.hashCode();
    }
}
