package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class yix0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f273216a;

    /* JADX INFO: renamed from: b */
    public final String f273217b;

    /* JADX INFO: renamed from: c */
    public final List f273218c;

    /* JADX INFO: renamed from: d */
    public final String f273219d;

    public yix0(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        this.f273216a = arrayList;
        this.f273217b = str;
        this.f273218c = arrayList2;
        this.f273219d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yix0)) {
            return false;
        }
        yix0 yix0Var = (yix0) obj;
        return this.f273216a.equals(yix0Var.f273216a) && wj50.m88271j(this.f273217b, yix0Var.f273217b) && wj50.m88271j(this.f273218c, yix0Var.f273218c) && wj50.m88271j(this.f273219d, yix0Var.f273219d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f273216a.hashCode() * 31, 31, this.f273217b);
        List list = this.f273218c;
        int iHashCode = (iM77243b + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f273219d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
