package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class viy {

    /* JADX INFO: renamed from: a */
    public final String f241807a;

    /* JADX INFO: renamed from: b */
    public final String f241808b;

    /* JADX INFO: renamed from: c */
    public final String f241809c;

    /* JADX INFO: renamed from: d */
    public final List f241810d;

    /* JADX INFO: renamed from: e */
    public final uiy f241811e;

    /* JADX INFO: renamed from: f */
    public final String f241812f;

    /* JADX INFO: renamed from: g */
    public final tiy f241813g;

    public viy(String str, String str2, String str3, List list, uiy uiyVar, String str4, tiy tiyVar) {
        this.f241807a = str;
        this.f241808b = str2;
        this.f241809c = str3;
        this.f241810d = list;
        this.f241811e = uiyVar;
        this.f241812f = str4;
        this.f241813g = tiyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof viy)) {
            return false;
        }
        viy viyVar = (viy) obj;
        return wj50.m88271j(this.f241807a, viyVar.f241807a) && wj50.m88271j(this.f241808b, viyVar.f241808b) && wj50.m88271j(this.f241809c, viyVar.f241809c) && wj50.m88271j(this.f241810d, viyVar.f241810d) && this.f241811e == viyVar.f241811e && wj50.m88271j(this.f241812f, viyVar.f241812f) && wj50.m88271j(this.f241813g, viyVar.f241813g);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(s571.m77243b(this.f241807a.hashCode() * 31, 31, this.f241808b), 31, this.f241809c), 31, this.f241810d);
        uiy uiyVar = this.f241811e;
        int iHashCode = (iM77244c + (uiyVar == null ? 0 : uiyVar.hashCode())) * 31;
        String str = this.f241812f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        tiy tiyVar = this.f241813g;
        return iHashCode2 + (tiyVar != null ? tiyVar.hashCode() : 0);
    }
}
