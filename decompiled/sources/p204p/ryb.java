package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ryb extends tyb {

    /* JADX INFO: renamed from: a */
    public final String f203868a;

    public ryb(String str) {
        this.f203868a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ryb) && wj50.m88271j(this.f203868a, ((ryb) obj).f203868a);
    }

    public final int hashCode() {
        return this.f203868a.hashCode();
    }
}
