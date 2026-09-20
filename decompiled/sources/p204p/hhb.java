package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hhb implements phb {

    /* JADX INFO: renamed from: a */
    public final boolean f91322a;

    /* JADX INFO: renamed from: b */
    public final String f91323b;

    /* JADX INFO: renamed from: c */
    public final String f91324c;

    public hhb(boolean z, String str, String str2) {
        this.f91322a = z;
        this.f91323b = str;
        this.f91324c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhb)) {
            return false;
        }
        hhb hhbVar = (hhb) obj;
        return this.f91322a == hhbVar.f91322a && wj50.m88271j(this.f91323b, hhbVar.f91323b) && wj50.m88271j(this.f91324c, hhbVar.f91324c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(Boolean.hashCode(this.f91322a) * 31, 31, this.f91323b);
        String str = this.f91324c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
