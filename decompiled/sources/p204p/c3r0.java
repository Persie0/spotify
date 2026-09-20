package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class c3r0 implements f3r0 {

    /* JADX INFO: renamed from: a */
    public final String f33736a;

    /* JADX INFO: renamed from: b */
    public final String f33737b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f33738c;

    /* JADX INFO: renamed from: d */
    public final List f33739d;

    public c3r0(String str, String str2, ArrayList arrayList, ae50 ae50Var) {
        this.f33736a = str;
        this.f33737b = str2;
        this.f33738c = arrayList;
        this.f33739d = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3r0)) {
            return false;
        }
        c3r0 c3r0Var = (c3r0) obj;
        return wj50.m88271j(this.f33736a, c3r0Var.f33736a) && wj50.m88271j(this.f33737b, c3r0Var.f33737b) && this.f33738c.equals(c3r0Var.f33738c) && wj50.m88271j(this.f33739d, c3r0Var.f33739d);
    }

    public final int hashCode() {
        return this.f33739d.hashCode() + lq51.m59700f(this.f33738c, s571.m77243b(this.f33736a.hashCode() * 31, 31, this.f33737b), 31);
    }
}
