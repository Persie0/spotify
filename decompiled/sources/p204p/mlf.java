package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mlf implements bmf {

    /* JADX INFO: renamed from: a */
    public final Exception f144831a;

    /* JADX INFO: renamed from: b */
    public final String f144832b;

    /* JADX INFO: renamed from: c */
    public final String f144833c;

    public mlf(Exception exc, String str, String str2) {
        this.f144831a = exc;
        this.f144832b = str;
        this.f144833c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlf)) {
            return false;
        }
        mlf mlfVar = (mlf) obj;
        return this.f144831a.equals(mlfVar.f144831a) && this.f144832b.equals(mlfVar.f144832b) && wj50.m88271j(this.f144833c, mlfVar.f144833c);
    }

    public final int hashCode() {
        return this.f144833c.hashCode() + s571.m77243b(this.f144831a.hashCode() * 31, 31, this.f144832b);
    }
}
