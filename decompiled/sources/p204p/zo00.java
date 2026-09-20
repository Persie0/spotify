package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zo00 implements ep00 {

    /* JADX INFO: renamed from: a */
    public final String f284609a;

    public zo00(String str) {
        this.f284609a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zo00) && wj50.m88271j(this.f284609a, ((zo00) obj).f284609a);
    }

    public final int hashCode() {
        return this.f284609a.hashCode();
    }
}
