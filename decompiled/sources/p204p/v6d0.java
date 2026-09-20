package p204p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class v6d0 {

    /* JADX INFO: renamed from: a */
    public final String f237814a;

    /* JADX INFO: renamed from: b */
    public final long f237815b;

    /* JADX INFO: renamed from: c */
    public final long f237816c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f237817d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f237818e;

    public v6d0(String str, long j, long j2, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.f237814a = str;
        this.f237815b = j;
        this.f237816c = j2;
        this.f237817d = arrayList;
        this.f237818e = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6d0)) {
            return false;
        }
        v6d0 v6d0Var = (v6d0) obj;
        return wj50.m88271j(this.f237814a, v6d0Var.f237814a) && this.f237815b == v6d0Var.f237815b && this.f237816c == v6d0Var.f237816c && this.f237817d.equals(v6d0Var.f237817d) && this.f237818e.equals(v6d0Var.f237818e);
    }

    public final int hashCode() {
        return this.f237818e.hashCode() + lq51.m59700f(this.f237817d, dq60.m36605e(dq60.m36605e(this.f237814a.hashCode() * 31, this.f237815b, 31), this.f237816c, 31), 31);
    }
}
