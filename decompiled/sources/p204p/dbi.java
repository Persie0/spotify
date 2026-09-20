package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dbi implements gbi {

    /* JADX INFO: renamed from: a */
    public final String f47324a;

    public dbi(String str) {
        this.f47324a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dbi) && wj50.m88271j(this.f47324a, ((dbi) obj).f47324a);
    }

    public final int hashCode() {
        return this.f47324a.hashCode();
    }
}
