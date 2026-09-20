package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class yje0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f273351a;

    /* JADX INFO: renamed from: b */
    public final boolean f273352b;

    /* JADX INFO: renamed from: c */
    public final String f273353c;

    /* JADX INFO: renamed from: d */
    public final String f273354d;

    public yje0(String str, String str2, ArrayList arrayList, boolean z) {
        this.f273351a = arrayList;
        this.f273352b = z;
        this.f273353c = str;
        this.f273354d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yje0)) {
            return false;
        }
        yje0 yje0Var = (yje0) obj;
        return this.f273351a.equals(yje0Var.f273351a) && this.f273352b == yje0Var.f273352b && wj50.m88271j(this.f273353c, yje0Var.f273353c) && wj50.m88271j(this.f273354d, yje0Var.f273354d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f273351a.hashCode() * 31, 31, this.f273352b);
        String str = this.f273353c;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f273354d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
