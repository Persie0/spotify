package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dfl implements ffl {

    /* JADX INFO: renamed from: a */
    public final String f48618a;

    public dfl(String str) {
        this.f48618a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dfl) && wj50.m88271j(this.f48618a, ((dfl) obj).f48618a);
    }

    public final int hashCode() {
        return this.f48618a.hashCode();
    }
}
