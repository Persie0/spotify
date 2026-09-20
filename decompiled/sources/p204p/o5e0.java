package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o5e0 {

    /* JADX INFO: renamed from: a */
    public final String f161950a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f161951b;

    /* JADX INFO: renamed from: c */
    public final un20 f161952c;

    /* JADX INFO: renamed from: d */
    public final boolean f161953d;

    public o5e0(String str, ArrayList arrayList, un20 un20Var, boolean z) {
        this.f161950a = str;
        this.f161951b = arrayList;
        this.f161952c = un20Var;
        this.f161953d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5e0)) {
            return false;
        }
        o5e0 o5e0Var = (o5e0) obj;
        return wj50.m88271j(this.f161950a, o5e0Var.f161950a) && this.f161951b.equals(o5e0Var.f161951b) && wj50.m88271j(this.f161952c, o5e0Var.f161952c) && this.f161953d == o5e0Var.f161953d;
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f161951b, this.f161950a.hashCode() * 31, 31);
        un20 un20Var = this.f161952c;
        return Boolean.hashCode(this.f161953d) + ((iM59700f + (un20Var == null ? 0 : un20Var.hashCode())) * 31);
    }
}
