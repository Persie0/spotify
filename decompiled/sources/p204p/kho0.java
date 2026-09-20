package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class kho0 {

    /* JADX INFO: renamed from: a */
    public final String f122700a;

    /* JADX INFO: renamed from: b */
    public final String f122701b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f122702c;

    public kho0(String str, String str2, ArrayList arrayList) {
        this.f122700a = str;
        this.f122701b = str2;
        this.f122702c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kho0)) {
            return false;
        }
        kho0 kho0Var = (kho0) obj;
        return wj50.m88271j(this.f122700a, kho0Var.f122700a) && wj50.m88271j(this.f122701b, kho0Var.f122701b) && this.f122702c.equals(kho0Var.f122702c);
    }

    public final int hashCode() {
        int iHashCode = this.f122700a.hashCode() * 31;
        String str = this.f122701b;
        return this.f122702c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
