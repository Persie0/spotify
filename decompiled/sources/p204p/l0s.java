package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class l0s implements n0s {

    /* JADX INFO: renamed from: a */
    public final String f128501a;

    public l0s(String str) {
        this.f128501a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0s) && wj50.m88271j(this.f128501a, ((l0s) obj).f128501a);
    }

    public final int hashCode() {
        return this.f128501a.hashCode();
    }
}
