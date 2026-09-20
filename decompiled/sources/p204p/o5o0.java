package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class o5o0 {

    /* JADX INFO: renamed from: a */
    public final String f162042a;

    /* JADX INFO: renamed from: b */
    public final String f162043b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f162044c;

    public o5o0(String str, String str2, ArrayList arrayList) {
        this.f162042a = str;
        this.f162043b = str2;
        this.f162044c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5o0)) {
            return false;
        }
        o5o0 o5o0Var = (o5o0) obj;
        return wj50.m88271j(this.f162042a, o5o0Var.f162042a) && wj50.m88271j(this.f162043b, o5o0Var.f162043b) && this.f162044c.equals(o5o0Var.f162044c);
    }

    public final int hashCode() {
        int iHashCode = this.f162042a.hashCode() * 31;
        String str = this.f162043b;
        return this.f162044c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
