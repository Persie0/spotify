package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class pm31 {

    /* JADX INFO: renamed from: a */
    public final String f178873a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f178874b;

    /* JADX INFO: renamed from: c */
    public final String f178875c;

    public pm31(String str, String str2, ArrayList arrayList) {
        this.f178873a = str;
        this.f178874b = arrayList;
        this.f178875c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm31)) {
            return false;
        }
        pm31 pm31Var = (pm31) obj;
        return wj50.m88271j(this.f178873a, pm31Var.f178873a) && this.f178874b.equals(pm31Var.f178874b) && wj50.m88271j(this.f178875c, pm31Var.f178875c);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f178874b, this.f178873a.hashCode() * 31, 31);
        String str = this.f178875c;
        return iM59700f + (str == null ? 0 : str.hashCode());
    }
}
