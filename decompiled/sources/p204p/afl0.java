package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class afl0 {

    /* JADX INFO: renamed from: a */
    public final String f15172a;

    public afl0(String str) {
        this.f15172a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afl0) && wj50.m88271j(this.f15172a, ((afl0) obj).f15172a);
    }

    public final int hashCode() {
        return this.f15172a.hashCode();
    }
}
