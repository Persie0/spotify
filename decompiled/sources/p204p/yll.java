package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class yll {

    /* JADX INFO: renamed from: a */
    public final String f274044a;

    /* JADX INFO: renamed from: b */
    public final String f274045b;

    /* JADX INFO: renamed from: c */
    public final String f274046c;

    /* JADX INFO: renamed from: d */
    public final String f274047d;

    public yll(String str, String str2, String str3, String str4) {
        this.f274044a = str;
        this.f274045b = str2;
        this.f274046c = str3;
        this.f274047d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yll)) {
            return false;
        }
        yll yllVar = (yll) obj;
        return wj50.m88271j(this.f274044a, yllVar.f274044a) && wj50.m88271j(this.f274045b, yllVar.f274045b) && wj50.m88271j(this.f274046c, yllVar.f274046c) && wj50.m88271j(this.f274047d, yllVar.f274047d);
    }

    public final int hashCode() {
        return this.f274047d.hashCode() + s571.m77243b(s571.m77243b(this.f274044a.hashCode() * 31, 31, this.f274045b), 31, this.f274046c);
    }
}
