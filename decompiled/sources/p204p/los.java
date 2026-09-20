package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class los extends pos {

    /* JADX INFO: renamed from: a */
    public final String f135540a;

    public los(String str) {
        this.f135540a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof los) && wj50.m88271j(this.f135540a, ((los) obj).f135540a);
    }

    public final int hashCode() {
        return this.f135540a.hashCode();
    }
}
