package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ovb {

    /* JADX INFO: renamed from: a */
    public final boolean f170459a;

    /* JADX INFO: renamed from: b */
    public final String f170460b;

    /* JADX INFO: renamed from: c */
    public final String f170461c;

    /* JADX INFO: renamed from: d */
    public final fv51 f170462d;

    /* JADX INFO: renamed from: e */
    public final List f170463e;

    /* JADX INFO: renamed from: f */
    public final boolean f170464f;

    public ovb(boolean z, String str, String str2, fv51 fv51Var, List list, boolean z2) {
        this.f170459a = z;
        this.f170460b = str;
        this.f170461c = str2;
        this.f170462d = fv51Var;
        this.f170463e = list;
        this.f170464f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovb)) {
            return false;
        }
        ovb ovbVar = (ovb) obj;
        return this.f170459a == ovbVar.f170459a && wj50.m88271j(this.f170460b, ovbVar.f170460b) && wj50.m88271j(this.f170461c, ovbVar.f170461c) && wj50.m88271j(this.f170462d, ovbVar.f170462d) && wj50.m88271j(this.f170463e, ovbVar.f170463e) && this.f170464f == ovbVar.f170464f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(Boolean.hashCode(this.f170459a) * 31, 31, this.f170460b), 31, this.f170461c);
        fv51 fv51Var = this.f170462d;
        return Boolean.hashCode(this.f170464f) + s571.m77244c((iM77243b + (fv51Var == null ? 0 : fv51Var.hashCode())) * 31, 31, this.f170463e);
    }
}
