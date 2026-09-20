package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class y5z0 extends j6z0 {

    /* JADX INFO: renamed from: a */
    public final String f269574a;

    /* JADX INFO: renamed from: b */
    public final String f269575b;

    /* JADX INFO: renamed from: c */
    public final String f269576c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f269577d;

    /* JADX INFO: renamed from: e */
    public final String f269578e;

    public y5z0(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.f269574a = str;
        this.f269575b = str2;
        this.f269576c = str3;
        this.f269577d = arrayList;
        this.f269578e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5z0)) {
            return false;
        }
        y5z0 y5z0Var = (y5z0) obj;
        return wj50.m88271j(this.f269574a, y5z0Var.f269574a) && wj50.m88271j(this.f269575b, y5z0Var.f269575b) && wj50.m88271j(this.f269576c, y5z0Var.f269576c) && this.f269577d.equals(y5z0Var.f269577d) && this.f269578e.equals(y5z0Var.f269578e);
    }

    public final int hashCode() {
        return this.f269578e.hashCode() + lq51.m59700f(this.f269577d, s571.m77243b(s571.m77243b(this.f269574a.hashCode() * 31, 31, this.f269575b), 31, this.f269576c), 31);
    }
}
