package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cpy implements epy {

    /* JADX INFO: renamed from: a */
    public final String f40678a;

    public cpy(String str) {
        this.f40678a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cpy) && wj50.m88271j(this.f40678a, ((cpy) obj).f40678a);
    }

    public final int hashCode() {
        return this.f40678a.hashCode();
    }
}
