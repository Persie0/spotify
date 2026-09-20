package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tib {

    /* JADX INFO: renamed from: a */
    public final String f220599a;

    /* JADX INFO: renamed from: b */
    public final String f220600b;

    public tib(String str, String str2) {
        this.f220599a = str;
        this.f220600b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tib)) {
            return false;
        }
        tib tibVar = (tib) obj;
        return wj50.m88271j(this.f220599a, tibVar.f220599a) && wj50.m88271j(this.f220600b, tibVar.f220600b);
    }

    public final int hashCode() {
        return this.f220600b.hashCode() + (this.f220599a.hashCode() * 31);
    }
}
