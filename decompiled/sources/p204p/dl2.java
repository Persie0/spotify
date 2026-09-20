package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class dl2 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f50092a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f50093b;

    /* JADX INFO: renamed from: c */
    public final String f50094c;

    /* JADX INFO: renamed from: d */
    public final String f50095d;

    public dl2(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        this.f50092a = arrayList;
        this.f50093b = arrayList2;
        this.f50094c = str;
        this.f50095d = str2;
    }

    /* JADX INFO: renamed from: a */
    public final List m36341a() {
        return this.f50092a;
    }

    /* JADX INFO: renamed from: b */
    public final String m36342b() {
        return this.f50095d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl2)) {
            return false;
        }
        dl2 dl2Var = (dl2) obj;
        return this.f50092a.equals(dl2Var.f50092a) && this.f50093b.equals(dl2Var.f50093b) && wj50.m88271j(this.f50094c, dl2Var.f50094c) && wj50.m88271j(this.f50095d, dl2Var.f50095d);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f50093b, this.f50092a.hashCode() * 31, 31);
        String str = this.f50094c;
        int iHashCode = (iM59700f + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50095d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
