package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class sd6 {

    /* JADX INFO: renamed from: a */
    public final zzb f207896a;

    /* JADX INFO: renamed from: b */
    public final int f207897b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1961i f207898c;

    /* JADX INFO: renamed from: d */
    public final List f207899d;

    public sd6(zzb zzbVar, int i, AbstractC1961i abstractC1961i, List list) {
        this.f207896a = zzbVar;
        this.f207897b = i;
        this.f207898c = abstractC1961i;
        this.f207899d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd6)) {
            return false;
        }
        sd6 sd6Var = (sd6) obj;
        return wj50.m88271j(this.f207896a, sd6Var.f207896a) && this.f207897b == sd6Var.f207897b && wj50.m88271j(this.f207898c, sd6Var.f207898c) && wj50.m88271j(this.f207899d, sd6Var.f207899d);
    }

    public final int hashCode() {
        return this.f207899d.hashCode() + ((this.f207898c.hashCode() + mt60.m62800g(this.f207897b, this.f207896a.hashCode() * 31, 31)) * 31);
    }
}
