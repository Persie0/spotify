package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d8j0 implements e8j0 {

    /* JADX INFO: renamed from: a */
    public final String f46472a;

    public d8j0(String str) {
        this.f46472a = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("A non-empty URL must be provided.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d8j0) && wj50.m88271j(this.f46472a, ((d8j0) obj).f46472a);
    }

    public final int hashCode() {
        return this.f46472a.hashCode();
    }
}
