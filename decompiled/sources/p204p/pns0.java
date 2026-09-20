package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class pns0 {

    /* JADX INFO: renamed from: a */
    public final String f179525a;

    /* JADX INFO: renamed from: b */
    public final String f179526b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f179527c;

    public pns0(String str, String str2, ArrayList arrayList) {
        this.f179525a = str;
        this.f179526b = str2;
        this.f179527c = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final String m70451a() {
        return this.f179526b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pns0)) {
            return false;
        }
        pns0 pns0Var = (pns0) obj;
        return this.f179525a.equals(pns0Var.f179525a) && wj50.m88271j(this.f179526b, pns0Var.f179526b) && this.f179527c.equals(pns0Var.f179527c);
    }

    public final int hashCode() {
        return this.f179527c.hashCode() + s571.m77243b(this.f179525a.hashCode() * 31, 31, this.f179526b);
    }
}
