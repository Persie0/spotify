package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rjd implements ojd {

    /* JADX INFO: renamed from: a */
    public final String f199794a;

    public rjd(String str) {
        this.f199794a = str;
    }

    @Override // p204p.ojd
    /* JADX INFO: renamed from: a */
    public final String mo67111a() {
        return this.f199794a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rjd) && wj50.m88271j(this.f199794a, ((rjd) obj).f199794a);
    }

    public final int hashCode() {
        return this.f199794a.hashCode();
    }
}
