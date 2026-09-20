package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yji {

    /* JADX INFO: renamed from: a */
    public final String f273373a;

    /* JADX INFO: renamed from: b */
    public final String f273374b;

    /* JADX INFO: renamed from: c */
    public final String f273375c;

    public yji(String str, String str2, String str3) {
        this.f273373a = str;
        this.f273374b = str2;
        this.f273375c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yji)) {
            return false;
        }
        yji yjiVar = (yji) obj;
        return wj50.m88271j(this.f273373a, yjiVar.f273373a) && wj50.m88271j(this.f273374b, yjiVar.f273374b) && wj50.m88271j(this.f273375c, yjiVar.f273375c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f273373a.hashCode() * 31, 31, this.f273374b);
        String str = this.f273375c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
