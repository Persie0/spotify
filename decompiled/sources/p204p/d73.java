package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d73 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f45971a;

    /* JADX INFO: renamed from: b */
    public final String f45972b;

    /* JADX INFO: renamed from: c */
    public final wzk f45973c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f45974d;

    /* JADX INFO: renamed from: e */
    public final String f45975e;

    /* JADX INFO: renamed from: f */
    public final hlo f45976f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f45977g;

    /* JADX INFO: renamed from: h */
    public final boolean f45978h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f45979i;

    /* JADX INFO: renamed from: j */
    public final Long f45980j;

    public d73(String str, String str2, wzk wzkVar, ArrayList arrayList, String str3, hlo hloVar, ArrayList arrayList2, boolean z, ArrayList arrayList3, Long l) {
        this.f45971a = str;
        this.f45972b = str2;
        this.f45973c = wzkVar;
        this.f45974d = arrayList;
        this.f45975e = str3;
        this.f45976f = hloVar;
        this.f45977g = arrayList2;
        this.f45978h = z;
        this.f45979i = arrayList3;
        this.f45980j = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d73)) {
            return false;
        }
        d73 d73Var = (d73) obj;
        return wj50.m88271j(this.f45971a, d73Var.f45971a) && wj50.m88271j(this.f45972b, d73Var.f45972b) && this.f45973c.equals(d73Var.f45973c) && this.f45974d.equals(d73Var.f45974d) && wj50.m88271j(this.f45975e, d73Var.f45975e) && this.f45976f.equals(d73Var.f45976f) && this.f45977g.equals(d73Var.f45977g) && this.f45978h == d73Var.f45978h && this.f45979i.equals(d73Var.f45979i) && wj50.m88271j(this.f45980j, d73Var.f45980j);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f45979i, s571.m77245d(lq51.m59700f(this.f45977g, (this.f45976f.hashCode() + s571.m77243b(lq51.m59700f(this.f45974d, (this.f45973c.hashCode() + s571.m77243b(this.f45971a.hashCode() * 31, 31, this.f45972b)) * 31, 31), 31, this.f45975e)) * 31, 31), 31, this.f45978h), 31);
        Long l = this.f45980j;
        return iM59700f + (l == null ? 0 : l.hashCode());
    }
}
