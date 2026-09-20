package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class u9e1 {

    /* JADX INFO: renamed from: a */
    public final Integer f228149a;

    /* JADX INFO: renamed from: b */
    public final String f228150b;

    /* JADX INFO: renamed from: c */
    public final sia f228151c;

    /* JADX INFO: renamed from: d */
    public final List f228152d;

    public u9e1(Integer num, String str, sia siaVar, List list) {
        this.f228149a = num;
        this.f228150b = str;
        this.f228151c = siaVar;
        this.f228152d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9e1)) {
            return false;
        }
        u9e1 u9e1Var = (u9e1) obj;
        return wj50.m88271j(this.f228149a, u9e1Var.f228149a) && wj50.m88271j(this.f228150b, u9e1Var.f228150b) && wj50.m88271j(this.f228151c, u9e1Var.f228151c) && wj50.m88271j(this.f228152d, u9e1Var.f228152d);
    }

    public final int hashCode() {
        Integer num = this.f228149a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f228150b;
        return this.f228152d.hashCode() + ((this.f228151c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public /* synthetic */ u9e1(Integer num, String str, List list, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, ria.f199468a, (i & 8) != 0 ? lau.f131415a : list);
    }
}
