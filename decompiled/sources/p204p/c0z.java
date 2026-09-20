package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c0z {

    /* JADX INFO: renamed from: a */
    public final String f32916a;

    /* JADX INFO: renamed from: b */
    public final String f32917b;

    /* JADX INFO: renamed from: c */
    public final String f32918c;

    public c0z(String str, String str2, String str3) {
        this.f32916a = str;
        this.f32917b = str2;
        this.f32918c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0z)) {
            return false;
        }
        c0z c0zVar = (c0z) obj;
        return wj50.m88271j(this.f32916a, c0zVar.f32916a) && wj50.m88271j(this.f32917b, c0zVar.f32917b) && wj50.m88271j(this.f32918c, c0zVar.f32918c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f32916a.hashCode() * 31, 31, this.f32917b);
        String str = this.f32918c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
