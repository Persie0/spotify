package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class bad1 {

    /* JADX INFO: renamed from: a */
    public final String f25177a;

    /* JADX INFO: renamed from: b */
    public final un20 f25178b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f25179c;

    /* JADX INFO: renamed from: d */
    public final String f25180d;

    public bad1(String str, String str2, ArrayList arrayList, un20 un20Var) {
        this.f25177a = str;
        this.f25178b = un20Var;
        this.f25179c = arrayList;
        this.f25180d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bad1)) {
            return false;
        }
        bad1 bad1Var = (bad1) obj;
        return this.f25177a.equals(bad1Var.f25177a) && wj50.m88271j(this.f25178b, bad1Var.f25178b) && this.f25179c.equals(bad1Var.f25179c) && this.f25180d.equals(bad1Var.f25180d);
    }

    public final int hashCode() {
        int iHashCode = this.f25177a.hashCode() * 31;
        un20 un20Var = this.f25178b;
        return this.f25180d.hashCode() + lq51.m59700f(this.f25179c, (iHashCode + (un20Var == null ? 0 : un20Var.hashCode())) * 31, 31);
    }
}
