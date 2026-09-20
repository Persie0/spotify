package p204p;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ixb implements kxb {

    /* JADX INFO: renamed from: a */
    public final String f106637a;

    /* JADX INFO: renamed from: b */
    public final List f106638b;

    /* JADX INFO: renamed from: c */
    public final String f106639c;

    /* JADX INFO: renamed from: d */
    public final String f106640d;

    /* JADX INFO: renamed from: e */
    public final y8z0 f106641e;

    /* JADX INFO: renamed from: f */
    public final dxb f106642f;

    /* JADX INFO: renamed from: g */
    public final int f106643g;

    /* JADX INFO: renamed from: h */
    public final t8z0 f106644h;

    /* JADX INFO: renamed from: i */
    public final c7b f106645i;

    public ixb(String str, List list, String str2, String str3, y8z0 y8z0Var, dxb dxbVar, int i, t8z0 t8z0Var, c7b c7bVar) {
        this.f106637a = str;
        this.f106638b = list;
        this.f106639c = str2;
        this.f106640d = str3;
        this.f106641e = y8z0Var;
        this.f106642f = dxbVar;
        this.f106643g = i;
        this.f106644h = t8z0Var;
        this.f106645i = c7bVar;
    }

    /* JADX INFO: renamed from: c */
    public static ixb m51866c(ixb ixbVar, String str, List list, int i) {
        if ((i & 1) != 0) {
            str = ixbVar.f106637a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            list = ixbVar.f106638b;
        }
        String str3 = ixbVar.f106639c;
        String str4 = ixbVar.f106640d;
        y8z0 y8z0Var = ixbVar.f106641e;
        dxb dxbVar = ixbVar.f106642f;
        int i2 = ixbVar.f106643g;
        t8z0 t8z0Var = ixbVar.f106644h;
        c7b c7bVar = ixbVar.f106645i;
        ixbVar.getClass();
        return new ixb(str2, list, str3, str4, y8z0Var, dxbVar, i2, t8z0Var, c7bVar);
    }

    @Override // p204p.kxb
    /* JADX INFO: renamed from: a */
    public final dxb mo51867a() {
        return this.f106642f;
    }

    @Override // p204p.kxb
    /* JADX INFO: renamed from: b */
    public final t8z0 mo51868b() {
        return this.f106644h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixb)) {
            return false;
        }
        ixb ixbVar = (ixb) obj;
        return wj50.m88271j(this.f106637a, ixbVar.f106637a) && wj50.m88271j(this.f106638b, ixbVar.f106638b) && wj50.m88271j(this.f106639c, ixbVar.f106639c) && wj50.m88271j(this.f106640d, ixbVar.f106640d) && this.f106641e == ixbVar.f106641e && wj50.m88271j(this.f106642f, ixbVar.f106642f) && this.f106643g == ixbVar.f106643g && wj50.m88271j(this.f106644h, ixbVar.f106644h) && wj50.m88271j(this.f106645i, ixbVar.f106645i);
    }

    @Override // p204p.kxb
    public final String getId() {
        return this.f106640d;
    }

    @Override // p204p.kxb
    public final List getItems() {
        return this.f106638b;
    }

    @Override // p204p.kxb
    public final int getKind() {
        return this.f106643g;
    }

    @Override // p204p.kxb
    public final String getTitle() {
        return this.f106637a;
    }

    @Override // p204p.kxb
    public final String getUri() {
        return this.f106639c;
    }

    public final int hashCode() {
        String str = this.f106637a;
        int iM77244c = s571.m77244c((str == null ? 0 : str.hashCode()) * 31, 31, this.f106638b);
        String str2 = this.f106639c;
        int iHashCode = (iM77244c + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f106640d;
        int iHashCode2 = (this.f106641e.hashCode() + ((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        dxb dxbVar = this.f106642f;
        int iM40938f = f710.m40938f(this.f106643g, (iHashCode2 + (dxbVar == null ? 0 : dxbVar.hashCode())) * 31, 31);
        t8z0 t8z0Var = this.f106644h;
        int iHashCode3 = (iM40938f + (t8z0Var == null ? 0 : t8z0Var.hashCode())) * 31;
        c7b c7bVar = this.f106645i;
        return iHashCode3 + (c7bVar != null ? c7bVar.hashCode() : 0);
    }

    @Override // p204p.kxb
    /* JADX INFO: renamed from: x */
    public final y8z0 mo51869x() {
        return this.f106641e;
    }

    public /* synthetic */ ixb(String str, AbstractList abstractList, int i) {
        this((i & 1) != 0 ? null : str, abstractList, null, null, y8z0.f270449a, null, 1, null, null);
    }
}
