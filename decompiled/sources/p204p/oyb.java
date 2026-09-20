package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class oyb {

    /* JADX INFO: renamed from: a */
    public final boolean f171716a;

    /* JADX INFO: renamed from: b */
    public final String f171717b;

    public oyb(boolean z, String str) {
        this.f171716a = z;
        this.f171717b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyb)) {
            return false;
        }
        oyb oybVar = (oyb) obj;
        return this.f171716a == oybVar.f171716a && wj50.m88271j(this.f171717b, oybVar.f171717b);
    }

    public final int hashCode() {
        return this.f171717b.hashCode() + (Boolean.hashCode(this.f171716a) * 31);
    }
}
