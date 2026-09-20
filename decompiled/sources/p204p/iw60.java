package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class iw60 implements sw60 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f106344a;

    /* JADX INFO: renamed from: b */
    public final String f106345b;

    public iw60(ArrayList arrayList, String str) {
        this.f106344a = arrayList;
        this.f106345b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw60)) {
            return false;
        }
        iw60 iw60Var = (iw60) obj;
        return this.f106344a.equals(iw60Var.f106344a) && wj50.m88271j(this.f106345b, iw60Var.f106345b);
    }

    public final int hashCode() {
        int iHashCode = this.f106344a.hashCode() * 31;
        String str = this.f106345b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
