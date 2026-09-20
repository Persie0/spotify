package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class nwi implements he41 {

    /* JADX INFO: renamed from: e */
    public static final ak0 f159186e = new ak0(19);

    /* JADX INFO: renamed from: a */
    public final String f159187a;

    /* JADX INFO: renamed from: b */
    public final Map f159188b;

    /* JADX INFO: renamed from: c */
    public final String f159189c;

    /* JADX INFO: renamed from: d */
    public final String f159190d;

    public nwi(Map map, String str, String str2, String str3) {
        this.f159187a = str;
        this.f159188b = map;
        this.f159189c = str2;
        this.f159190d = str3;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwi)) {
            return false;
        }
        nwi nwiVar = (nwi) obj;
        return wj50.m88271j(this.f159187a, nwiVar.f159187a) && wj50.m88271j(this.f159188b, nwiVar.f159188b) && wj50.m88271j(this.f159189c, nwiVar.f159189c) && wj50.m88271j(this.f159190d, nwiVar.f159190d);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f159186e;
    }

    public final int hashCode() {
        int iM38557f = edb.m38557f(this.f159187a.hashCode() * 31, 31, this.f159188b);
        String str = this.f159189c;
        return this.f159190d.hashCode() + ((iM38557f + (str == null ? 0 : str.hashCode())) * 31);
    }
}
