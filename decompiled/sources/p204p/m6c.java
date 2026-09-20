package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m6c {

    /* JADX INFO: renamed from: a */
    public final List f140458a;

    /* JADX INFO: renamed from: b */
    public final List f140459b;

    /* JADX INFO: renamed from: c */
    public final boolean f140460c;

    /* JADX INFO: renamed from: d */
    public final boolean f140461d;

    public m6c(List list, List list2, boolean z, boolean z2) {
        this.f140458a = list;
        this.f140459b = list2;
        this.f140460c = z;
        this.f140461d = z2;
    }

    /* JADX INFO: renamed from: a */
    public static m6c m61006a(m6c m6cVar, List list, ArrayList arrayList, boolean z, int i) {
        if ((i & 1) != 0) {
            list = m6cVar.f140458a;
        }
        List list2 = arrayList;
        if ((i & 2) != 0) {
            list2 = m6cVar.f140459b;
        }
        boolean z2 = (i & 4) != 0 ? m6cVar.f140460c : true;
        if ((i & 8) != 0) {
            z = m6cVar.f140461d;
        }
        m6cVar.getClass();
        return new m6c(list, list2, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6c)) {
            return false;
        }
        m6c m6cVar = (m6c) obj;
        return wj50.m88271j(this.f140458a, m6cVar.f140458a) && wj50.m88271j(this.f140459b, m6cVar.f140459b) && this.f140460c == m6cVar.f140460c && this.f140461d == m6cVar.f140461d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140461d) + s571.m77245d(s571.m77244c(this.f140458a.hashCode() * 31, 31, this.f140459b), 31, this.f140460c);
    }
}
