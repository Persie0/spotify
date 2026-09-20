package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w5d1 extends e6d1 {

    /* JADX INFO: renamed from: a */
    public final String f248066a;

    public w5d1(String str) {
        this.f248066a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5d1) && wj50.m88271j(this.f248066a, ((w5d1) obj).f248066a);
    }

    public final int hashCode() {
        return this.f248066a.hashCode();
    }
}
