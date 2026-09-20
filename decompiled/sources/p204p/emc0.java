package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class emc0 {

    /* JADX INFO: renamed from: a */
    public final String f60878a;

    /* JADX INFO: renamed from: b */
    public final boolean f60879b;

    /* JADX INFO: renamed from: c */
    public final boolean f60880c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f60881d;

    /* JADX INFO: renamed from: e */
    public final int f60882e;

    public emc0(String str, boolean z, boolean z2, ArrayList arrayList, int i) {
        this.f60878a = str;
        this.f60879b = z;
        this.f60880c = z2;
        this.f60881d = arrayList;
        this.f60882e = i;
    }

    /* JADX INFO: renamed from: a */
    public static emc0 m39412a(emc0 emc0Var, boolean z, boolean z2, ArrayList arrayList, int i) {
        String str = emc0Var.f60878a;
        emc0Var.getClass();
        return new emc0(str, z, z2, arrayList, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emc0)) {
            return false;
        }
        emc0 emc0Var = (emc0) obj;
        return wj50.m88271j(this.f60878a, emc0Var.f60878a) && this.f60879b == emc0Var.f60879b && this.f60880c == emc0Var.f60880c && this.f60881d.equals(emc0Var.f60881d) && this.f60882e == emc0Var.f60882e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60882e) + lq51.m59700f(this.f60881d, s571.m77245d(s571.m77245d(this.f60878a.hashCode() * 31, 31, this.f60879b), 31, this.f60880c), 31);
    }
}
