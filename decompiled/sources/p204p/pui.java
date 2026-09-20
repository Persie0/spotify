package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class pui extends qui {

    /* JADX INFO: renamed from: a */
    public final String f181457a;

    /* JADX INFO: renamed from: b */
    public final String f181458b;

    /* JADX INFO: renamed from: c */
    public final int f181459c;

    /* JADX INFO: renamed from: d */
    public final boolean f181460d;

    public pui(String str, int i, String str2, boolean z) {
        this.f181457a = str;
        this.f181458b = str2;
        this.f181459c = i;
        this.f181460d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pui)) {
            return false;
        }
        pui puiVar = (pui) obj;
        return wj50.m88271j(this.f181457a, puiVar.f181457a) && wj50.m88271j(this.f181458b, puiVar.f181458b) && this.f181459c == puiVar.f181459c && this.f181460d == puiVar.f181460d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f181460d) + f710.m40938f(this.f181459c, s571.m77243b(this.f181457a.hashCode() * 31, 31, this.f181458b), 31);
    }
}
