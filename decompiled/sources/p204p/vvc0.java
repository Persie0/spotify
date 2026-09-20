package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class vvc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final t0d0 f245202a;

    /* JADX INFO: renamed from: b */
    public final String f245203b;

    /* JADX INFO: renamed from: c */
    public final String f245204c;

    /* JADX INFO: renamed from: d */
    public final Long f245205d;

    /* JADX INFO: renamed from: e */
    public final r891 f245206e;

    /* JADX INFO: renamed from: f */
    public final List f245207f;

    /* JADX INFO: renamed from: g */
    public final int f245208g;

    public vvc0(t0d0 t0d0Var, String str, String str2, Long l, r891 r891Var, List list, int i) {
        this.f245202a = t0d0Var;
        this.f245203b = str;
        this.f245204c = str2;
        this.f245205d = l;
        this.f245206e = r891Var;
        this.f245207f = list;
        this.f245208g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvc0)) {
            return false;
        }
        vvc0 vvc0Var = (vvc0) obj;
        return this.f245202a.equals(vvc0Var.f245202a) && wj50.m88271j(this.f245203b, vvc0Var.f245203b) && wj50.m88271j(this.f245204c, vvc0Var.f245204c) && wj50.m88271j(this.f245205d, vvc0Var.f245205d) && this.f245206e == vvc0Var.f245206e && this.f245207f.equals(vvc0Var.f245207f) && this.f245208g == vvc0Var.f245208g;
    }

    public final int hashCode() {
        int iHashCode = this.f245202a.hashCode() * 31;
        String str = this.f245203b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f245204c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f245205d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        r891 r891Var = this.f245206e;
        int iM77244c = s571.m77244c((iHashCode4 + (r891Var == null ? 0 : r891Var.hashCode())) * 31, 31, this.f245207f);
        int i = this.f245208g;
        return iM77244c + (i != 0 ? edb.m38547C(i) : 0);
    }
}
