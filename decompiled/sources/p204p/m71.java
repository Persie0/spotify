package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class m71 extends t71 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f140621a;

    /* JADX INFO: renamed from: b */
    public final String f140622b;

    public m71(ArrayList arrayList, String str) {
        this.f140621a = arrayList;
        this.f140622b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m71)) {
            return false;
        }
        m71 m71Var = (m71) obj;
        return this.f140621a.equals(m71Var.f140621a) && wj50.m88271j(this.f140622b, m71Var.f140622b);
    }

    public final int hashCode() {
        int iHashCode = this.f140621a.hashCode() * 31;
        String str = this.f140622b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
