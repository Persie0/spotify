package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qpe extends rpe {

    /* JADX INFO: renamed from: a */
    public final String f191281a;

    public qpe(String str) {
        this.f191281a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qpe) && wj50.m88271j(this.f191281a, ((qpe) obj).f191281a);
    }

    public final int hashCode() {
        return this.f191281a.hashCode();
    }
}
