package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class e781 {

    /* JADX INFO: renamed from: a */
    public final String f56862a;

    /* JADX INFO: renamed from: b */
    public final String f56863b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f56864c;

    /* JADX INFO: renamed from: d */
    public final String f56865d;

    /* JADX INFO: renamed from: e */
    public final long f56866e;

    public e781(long j, String str, String str2, String str3, ArrayList arrayList) {
        this.f56862a = str;
        this.f56863b = str2;
        this.f56864c = arrayList;
        this.f56865d = str3;
        this.f56866e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e781)) {
            return false;
        }
        e781 e781Var = (e781) obj;
        return wj50.m88271j(this.f56862a, e781Var.f56862a) && wj50.m88271j(this.f56863b, e781Var.f56863b) && this.f56864c.equals(e781Var.f56864c) && wj50.m88271j(this.f56865d, e781Var.f56865d) && this.f56866e == e781Var.f56866e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f56866e) + s571.m77243b(lq51.m59700f(this.f56864c, s571.m77243b(this.f56862a.hashCode() * 31, 31, this.f56863b), 31), 31, this.f56865d);
    }
}
