package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o4e1 implements a5e1 {

    /* JADX INFO: renamed from: a */
    public final String f161661a;

    public o4e1(String str) {
        this.f161661a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4e1) && wj50.m88271j(this.f161661a, ((o4e1) obj).f161661a);
    }

    public final int hashCode() {
        return this.f161661a.hashCode();
    }
}
