package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l7z0 {

    /* JADX INFO: renamed from: a */
    public final String f130754a;

    public l7z0(String str) {
        this.f130754a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7z0) && wj50.m88271j(this.f130754a, ((l7z0) obj).f130754a);
    }

    public final int hashCode() {
        return this.f130754a.hashCode() * 31;
    }
}
