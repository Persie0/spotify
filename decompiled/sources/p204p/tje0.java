package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class tje0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f220895a;

    /* JADX INFO: renamed from: b */
    public final boolean f220896b;

    /* JADX INFO: renamed from: c */
    public final String f220897c;

    /* JADX INFO: renamed from: d */
    public final String f220898d;

    public tje0(String str, String str2, ArrayList arrayList, boolean z) {
        this.f220895a = arrayList;
        this.f220896b = z;
        this.f220897c = str;
        this.f220898d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tje0)) {
            return false;
        }
        tje0 tje0Var = (tje0) obj;
        return this.f220895a.equals(tje0Var.f220895a) && this.f220896b == tje0Var.f220896b && wj50.m88271j(this.f220897c, tje0Var.f220897c) && wj50.m88271j(this.f220898d, tje0Var.f220898d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f220895a.hashCode() * 31, 31, this.f220896b);
        String str = this.f220897c;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f220898d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
