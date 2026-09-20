package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class f6z0 {

    /* JADX INFO: renamed from: a */
    public final String f66517a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f66518b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f66519c;

    public f6z0(String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f66517a = str;
        this.f66518b = arrayList;
        this.f66519c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6z0)) {
            return false;
        }
        f6z0 f6z0Var = (f6z0) obj;
        return this.f66517a.equals(f6z0Var.f66517a) && this.f66518b.equals(f6z0Var.f66518b) && this.f66519c.equals(f6z0Var.f66519c);
    }

    public final int hashCode() {
        return this.f66519c.hashCode() + lq51.m59700f(this.f66518b, this.f66517a.hashCode() * 31, 31);
    }
}
