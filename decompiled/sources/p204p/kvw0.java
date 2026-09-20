package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kvw0 {

    /* JADX INFO: renamed from: a */
    public final String f126973a;

    public kvw0(String str) {
        this.f126973a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvw0) && wj50.m88271j(this.f126973a, ((kvw0) obj).f126973a);
    }

    public final int hashCode() {
        return this.f126973a.hashCode();
    }
}
