package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class dj9 {

    /* JADX INFO: renamed from: a */
    public final String f49613a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f49614b;

    /* JADX INFO: renamed from: c */
    public final int f49615c;

    public dj9(int i, String str, ArrayList arrayList) {
        this.f49613a = str;
        this.f49614b = arrayList;
        this.f49615c = i;
    }

    /* JADX INFO: renamed from: a */
    public final List m36178a() {
        return this.f49614b;
    }

    /* JADX INFO: renamed from: b */
    public final int m36179b() {
        return this.f49615c;
    }

    /* JADX INFO: renamed from: c */
    public final String m36180c() {
        return this.f49613a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj9)) {
            return false;
        }
        dj9 dj9Var = (dj9) obj;
        return this.f49613a.equals(dj9Var.f49613a) && this.f49614b.equals(dj9Var.f49614b) && this.f49615c == dj9Var.f49615c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f49615c) + lq51.m59700f(this.f49614b, this.f49613a.hashCode() * 31, 31);
    }
}
