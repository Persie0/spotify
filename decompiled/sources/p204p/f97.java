package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class f97 {

    /* JADX INFO: renamed from: a */
    public final myh0 f67182a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f67183b;

    /* JADX INFO: renamed from: c */
    public final p881 f67184c;

    /* JADX INFO: renamed from: d */
    public final m0u0 f67185d;

    public f97(myh0 myh0Var, ArrayList arrayList, p881 p881Var, m0u0 m0u0Var) {
        this.f67182a = myh0Var;
        this.f67183b = arrayList;
        this.f67184c = p881Var;
        this.f67185d = m0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f97)) {
            return false;
        }
        f97 f97Var = (f97) obj;
        return this.f67182a.equals(f97Var.f67182a) && this.f67183b.equals(f97Var.f67183b) && this.f67184c.equals(f97Var.f67184c) && this.f67185d.equals(f97Var.f67185d);
    }

    public final int hashCode() {
        return this.f67185d.hashCode() + ((this.f67184c.hashCode() + lq51.m59700f(this.f67183b, this.f67182a.hashCode() * 31, 31)) * 31);
    }
}
