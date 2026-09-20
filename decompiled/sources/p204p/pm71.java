package p204p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class pm71 {

    /* JADX INFO: renamed from: a */
    public final String f178950a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f178951b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f178952c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f178953d;

    /* JADX INFO: renamed from: e */
    public final Long f178954e;

    /* JADX INFO: renamed from: f */
    public final Map f178955f;

    /* JADX INFO: renamed from: g */
    public final Map f178956g;

    public pm71(String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Long l, Map map, Map map2) {
        this.f178950a = str;
        this.f178951b = arrayList;
        this.f178952c = arrayList2;
        this.f178953d = arrayList3;
        this.f178954e = l;
        this.f178955f = map;
        this.f178956g = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm71)) {
            return false;
        }
        pm71 pm71Var = (pm71) obj;
        return this.f178950a.equals(pm71Var.f178950a) && this.f178951b.equals(pm71Var.f178951b) && this.f178952c.equals(pm71Var.f178952c) && this.f178953d.equals(pm71Var.f178953d) && wj50.m88271j(this.f178954e, pm71Var.f178954e) && this.f178955f.equals(pm71Var.f178955f) && this.f178956g.equals(pm71Var.f178956g);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f178953d, lq51.m59700f(this.f178952c, lq51.m59700f(this.f178951b, this.f178950a.hashCode() * 31, 31), 31), 31);
        Long l = this.f178954e;
        return this.f178956g.hashCode() + edb.m38557f((iM59700f + (l == null ? 0 : l.hashCode())) * 31, 31, this.f178955f);
    }
}
