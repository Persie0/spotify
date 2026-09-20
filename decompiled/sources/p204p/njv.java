package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class njv {

    /* JADX INFO: renamed from: a */
    public final String f154661a;

    public njv(String str) {
        this.f154661a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof njv) && wj50.m88271j(this.f154661a, ((njv) obj).f154661a);
    }

    public final int hashCode() {
        return this.f154661a.hashCode();
    }
}
