package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qbu {

    /* JADX INFO: renamed from: a */
    public final String f187168a;

    /* JADX INFO: renamed from: b */
    public final String f187169b;

    /* JADX INFO: renamed from: c */
    public final String f187170c;

    /* JADX INFO: renamed from: d */
    public final String f187171d;

    public qbu(String str, String str2, String str3, String str4) {
        this.f187168a = str;
        this.f187169b = str2;
        this.f187170c = str3;
        this.f187171d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbu)) {
            return false;
        }
        qbu qbuVar = (qbu) obj;
        return wj50.m88271j(this.f187168a, qbuVar.f187168a) && wj50.m88271j(this.f187169b, qbuVar.f187169b) && wj50.m88271j(this.f187170c, qbuVar.f187170c) && wj50.m88271j(this.f187171d, qbuVar.f187171d);
    }

    public final int hashCode() {
        return this.f187171d.hashCode() + s571.m77243b(s571.m77243b(this.f187168a.hashCode() * 31, 31, this.f187169b), 31, this.f187170c);
    }
}
