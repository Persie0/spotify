package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class aib {

    /* JADX INFO: renamed from: a */
    public final ArrayList f15925a;

    /* JADX INFO: renamed from: b */
    public final String f15926b;

    /* JADX INFO: renamed from: c */
    public final un20 f15927c;

    public aib(String str, ArrayList arrayList, un20 un20Var) {
        this.f15925a = arrayList;
        this.f15926b = str;
        this.f15927c = un20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aib)) {
            return false;
        }
        aib aibVar = (aib) obj;
        return this.f15925a.equals(aibVar.f15925a) && wj50.m88271j(this.f15926b, aibVar.f15926b) && wj50.m88271j(this.f15927c, aibVar.f15927c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f15925a.hashCode() * 31, 31, this.f15926b);
        un20 un20Var = this.f15927c;
        return iM77243b + (un20Var == null ? 0 : un20Var.hashCode());
    }
}
