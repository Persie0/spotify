package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class dqh {

    /* JADX INFO: renamed from: a */
    public final List f51995a;

    /* JADX INFO: renamed from: b */
    public final List f51996b;

    /* JADX INFO: renamed from: c */
    public final List f51997c;

    /* JADX INFO: renamed from: d */
    public final List f51998d;

    /* JADX INFO: renamed from: e */
    public final String f51999e;

    /* JADX INFO: renamed from: f */
    public final Object f52000f;

    /* JADX INFO: renamed from: g */
    public final p3r f52001g;

    /* JADX INFO: renamed from: h */
    public final Object f52002h;

    public dqh(List list, List list2, List list3, List list4, String str, List list5, p3r p3rVar, List list6) {
        this.f51995a = list;
        this.f51996b = list2;
        this.f51997c = list3;
        this.f51998d = list4;
        this.f51999e = str;
        this.f52000f = list5;
        this.f52001g = p3rVar;
        this.f52002h = list6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqh)) {
            return false;
        }
        dqh dqhVar = (dqh) obj;
        return this.f51995a.equals(dqhVar.f51995a) && this.f51996b.equals(dqhVar.f51996b) && this.f51997c.equals(dqhVar.f51997c) && this.f51998d.equals(dqhVar.f51998d) && wj50.m88271j(this.f51999e, dqhVar.f51999e) && this.f52000f.equals(dqhVar.f52000f) && wj50.m88271j(this.f52001g, dqhVar.f52001g) && this.f52002h.equals(dqhVar.f52002h);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77244c(s571.m77244c(this.f51995a.hashCode() * 31, 31, this.f51996b), 31, this.f51997c), 31, this.f51998d);
        String str = this.f51999e;
        int iM36604d = dq60.m36604d((iM77244c + (str == null ? 0 : str.hashCode())) * 31, 31, this.f52000f);
        p3r p3rVar = this.f52001g;
        return this.f52002h.hashCode() + ((iM36604d + (p3rVar != null ? p3rVar.hashCode() : 0)) * 31);
    }
}
