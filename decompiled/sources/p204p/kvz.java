package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kvz extends mvz {

    /* JADX INFO: renamed from: a */
    public final String f126981a;

    public kvz(String str) {
        this.f126981a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvz) && wj50.m88271j(this.f126981a, ((kvz) obj).f126981a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f126981a;
    }

    public final int hashCode() {
        return this.f126981a.hashCode();
    }
}
