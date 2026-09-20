package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class q5c extends r5c {

    /* JADX INFO: renamed from: a */
    public final String f185499a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f185500b;

    /* JADX INFO: renamed from: c */
    public final m5c f185501c;

    public q5c(String str, ArrayList arrayList, m5c m5cVar) {
        this.f185499a = str;
        this.f185500b = arrayList;
        this.f185501c = m5cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5c)) {
            return false;
        }
        q5c q5cVar = (q5c) obj;
        return wj50.m88271j(this.f185499a, q5cVar.f185499a) && this.f185500b.equals(q5cVar.f185500b) && wj50.m88271j(this.f185501c, q5cVar.f185501c);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f185500b, this.f185499a.hashCode() * 31, 31);
        m5c m5cVar = this.f185501c;
        return iM59700f + (m5cVar == null ? 0 : m5cVar.hashCode());
    }
}
