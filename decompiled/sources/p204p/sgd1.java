package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class sgd1 {

    /* JADX INFO: renamed from: a */
    public final String f208835a;

    /* JADX INFO: renamed from: b */
    public final un20 f208836b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f208837c;

    /* JADX INFO: renamed from: d */
    public final String f208838d;

    public sgd1(String str, String str2, ArrayList arrayList, un20 un20Var) {
        this.f208835a = str;
        this.f208836b = un20Var;
        this.f208837c = arrayList;
        this.f208838d = str2;
    }

    /* JADX INFO: renamed from: a */
    public final un20 m78051a() {
        return this.f208836b;
    }

    /* JADX INFO: renamed from: b */
    public final String m78052b() {
        return this.f208835a;
    }

    /* JADX INFO: renamed from: c */
    public final List m78053c() {
        return this.f208837c;
    }

    /* JADX INFO: renamed from: d */
    public final String m78054d() {
        return this.f208838d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgd1)) {
            return false;
        }
        sgd1 sgd1Var = (sgd1) obj;
        return this.f208835a.equals(sgd1Var.f208835a) && wj50.m88271j(this.f208836b, sgd1Var.f208836b) && this.f208837c.equals(sgd1Var.f208837c) && this.f208838d.equals(sgd1Var.f208838d);
    }

    public final int hashCode() {
        int iHashCode = this.f208835a.hashCode() * 31;
        un20 un20Var = this.f208836b;
        return this.f208838d.hashCode() + ((((this.f208837c.hashCode() + ((iHashCode + (un20Var == null ? 0 : un20Var.hashCode())) * 31)) * 31) - 580014870) * 31);
    }
}
