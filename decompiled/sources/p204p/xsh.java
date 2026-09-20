package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class xsh {

    /* JADX INFO: renamed from: a */
    public final String f265591a;

    /* JADX INFO: renamed from: b */
    public final ki71 f265592b;

    /* JADX INFO: renamed from: c */
    public final Integer f265593c;

    /* JADX INFO: renamed from: d */
    public final Integer f265594d;

    /* JADX INFO: renamed from: e */
    public final Map f265595e;

    public xsh(String str, ki71 ki71Var, Integer num, Integer num2, Map map) {
        this.f265591a = str;
        this.f265592b = ki71Var;
        this.f265593c = num;
        this.f265594d = num2;
        this.f265595e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsh)) {
            return false;
        }
        xsh xshVar = (xsh) obj;
        return wj50.m88271j(this.f265591a, xshVar.f265591a) && wj50.m88271j(this.f265592b, xshVar.f265592b) && wj50.m88271j(this.f265593c, xshVar.f265593c) && wj50.m88271j(this.f265594d, xshVar.f265594d) && wj50.m88271j(this.f265595e, xshVar.f265595e);
    }

    public final int hashCode() {
        int iHashCode = this.f265591a.hashCode() * 31;
        ki71 ki71Var = this.f265592b;
        int iHashCode2 = (iHashCode + (ki71Var == null ? 0 : ki71Var.hashCode())) * 31;
        Integer num = this.f265593c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f265594d;
        return this.f265595e.hashCode() + ((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }
}
