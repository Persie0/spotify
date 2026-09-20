package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class iwl {

    /* JADX INFO: renamed from: a */
    public final String f106469a;

    /* JADX INFO: renamed from: b */
    public final int f106470b;

    /* JADX INFO: renamed from: c */
    public final rcm0 f106471c;

    /* JADX INFO: renamed from: d */
    public final String f106472d;

    /* JADX INFO: renamed from: e */
    public final String f106473e;

    /* JADX INFO: renamed from: f */
    public final String f106474f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f106475g;

    public iwl(String str, int i, rcm0 rcm0Var, String str2, String str3, String str4, ArrayList arrayList) {
        this.f106469a = str;
        this.f106470b = i;
        this.f106471c = rcm0Var;
        this.f106472d = str2;
        this.f106473e = str3;
        this.f106474f = str4;
        this.f106475g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwl)) {
            return false;
        }
        iwl iwlVar = (iwl) obj;
        return wj50.m88271j(this.f106469a, iwlVar.f106469a) && this.f106470b == iwlVar.f106470b && this.f106471c.equals(iwlVar.f106471c) && wj50.m88271j(this.f106472d, iwlVar.f106472d) && wj50.m88271j(this.f106473e, iwlVar.f106473e) && wj50.m88271j(this.f106474f, iwlVar.f106474f) && this.f106475g.equals(iwlVar.f106475g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(yds.m93483m(this.f106471c, mt60.m62800g(this.f106470b, this.f106469a.hashCode() * 31, 31), 31), 31, this.f106472d);
        String str = this.f106473e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f106474f;
        return this.f106475g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
