package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class mp40 {

    /* JADX INFO: renamed from: a */
    public final String f145863a;

    /* JADX INFO: renamed from: b */
    public final String f145864b;

    /* JADX INFO: renamed from: c */
    public final Object f145865c;

    /* JADX INFO: renamed from: d */
    public final int f145866d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f145867e;

    /* JADX INFO: renamed from: f */
    public final String f145868f;

    /* JADX INFO: renamed from: g */
    public final String f145869g;

    public mp40(String str, String str2, List list, int i, ArrayList arrayList, String str3, String str4) {
        this.f145863a = str;
        this.f145864b = str2;
        this.f145865c = list;
        this.f145866d = i;
        this.f145867e = arrayList;
        this.f145868f = str3;
        this.f145869g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp40)) {
            return false;
        }
        mp40 mp40Var = (mp40) obj;
        return wj50.m88271j(this.f145863a, mp40Var.f145863a) && wj50.m88271j(this.f145864b, mp40Var.f145864b) && this.f145865c.equals(mp40Var.f145865c) && this.f145866d == mp40Var.f145866d && this.f145867e.equals(mp40Var.f145867e) && wj50.m88271j(this.f145868f, mp40Var.f145868f) && wj50.m88271j(this.f145869g, mp40Var.f145869g);
    }

    public final int hashCode() {
        return this.f145869g.hashCode() + s571.m77243b(lq51.m59700f(this.f145867e, f710.m40938f(this.f145866d, dq60.m36604d(s571.m77243b(this.f145863a.hashCode() * 31, 31, this.f145864b), 31, this.f145865c), 31), 31), 31, this.f145868f);
    }
}
