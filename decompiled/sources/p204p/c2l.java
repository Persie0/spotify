package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c2l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f33413a;

    public c2l(String str) {
        this.f33413a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m31332a() {
        return this.f33413a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2l) && wj50.m88271j(this.f33413a, ((c2l) obj).f33413a);
    }

    public final int hashCode() {
        return this.f33413a.hashCode();
    }
}
