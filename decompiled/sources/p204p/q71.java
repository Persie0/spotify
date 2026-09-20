package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class q71 extends t71 {

    /* JADX INFO: renamed from: a */
    public final List f185977a;

    /* JADX INFO: renamed from: b */
    public final boolean f185978b;

    /* JADX INFO: renamed from: c */
    public final String f185979c;

    public q71(String str, List list, boolean z) {
        this.f185977a = list;
        this.f185978b = z;
        this.f185979c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q71)) {
            return false;
        }
        q71 q71Var = (q71) obj;
        return wj50.m88271j(this.f185977a, q71Var.f185977a) && this.f185978b == q71Var.f185978b && wj50.m88271j(this.f185979c, q71Var.f185979c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f185977a.hashCode() * 31, 31, this.f185978b);
        String str = this.f185979c;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
