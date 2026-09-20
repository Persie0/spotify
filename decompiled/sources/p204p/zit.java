package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zit {

    /* JADX INFO: renamed from: a */
    public final String f283242a;

    public zit(String str) {
        this.f283242a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zit) && wj50.m88271j(this.f283242a, ((zit) obj).f283242a);
    }

    public final int hashCode() {
        return this.f283242a.hashCode();
    }
}
