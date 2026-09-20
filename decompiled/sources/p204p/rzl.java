package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rzl implements vzl {

    /* JADX INFO: renamed from: a */
    public final String f204162a;

    /* JADX INFO: renamed from: b */
    public final String f204163b;

    /* JADX INFO: renamed from: c */
    public final String f204164c;

    public rzl(String str, String str2, String str3) {
        this.f204162a = str;
        this.f204163b = str2;
        this.f204164c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzl)) {
            return false;
        }
        rzl rzlVar = (rzl) obj;
        return wj50.m88271j(this.f204162a, rzlVar.f204162a) && wj50.m88271j(this.f204163b, rzlVar.f204163b) && wj50.m88271j(this.f204164c, rzlVar.f204164c);
    }

    public final int hashCode() {
        return this.f204164c.hashCode() + s571.m77243b(this.f204162a.hashCode() * 31, 31, this.f204163b);
    }
}
