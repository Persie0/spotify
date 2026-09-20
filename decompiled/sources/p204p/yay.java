package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yay {

    /* JADX INFO: renamed from: a */
    public final String f271024a;

    /* JADX INFO: renamed from: b */
    public final String f271025b;

    public yay(String str, String str2) {
        this.f271024a = str;
        this.f271025b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yay)) {
            return false;
        }
        yay yayVar = (yay) obj;
        return wj50.m88271j(this.f271024a, yayVar.f271024a) && wj50.m88271j(this.f271025b, yayVar.f271025b);
    }

    public final int hashCode() {
        return this.f271025b.hashCode() + (this.f271024a.hashCode() * 31);
    }
}
