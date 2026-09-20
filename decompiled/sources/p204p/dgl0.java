package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class dgl0 extends fgl0 {

    /* JADX INFO: renamed from: a */
    public final String f48830a;

    /* JADX INFO: renamed from: b */
    public final String f48831b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f48832c;

    public dgl0(String str, String str2, ArrayList arrayList) {
        this.f48830a = str;
        this.f48831b = str2;
        this.f48832c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgl0)) {
            return false;
        }
        dgl0 dgl0Var = (dgl0) obj;
        return this.f48830a.equals(dgl0Var.f48830a) && this.f48831b.equals(dgl0Var.f48831b) && this.f48832c.equals(dgl0Var.f48832c);
    }

    public final int hashCode() {
        return this.f48832c.hashCode() + s571.m77243b(this.f48830a.hashCode() * 31, 31, this.f48831b);
    }
}
