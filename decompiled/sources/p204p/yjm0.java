package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class yjm0 implements dkm0, fkm0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f273407a;

    /* JADX INFO: renamed from: b */
    public final String f273408b;

    /* JADX INFO: renamed from: c */
    public final gkm0 f273409c;

    public yjm0(ArrayList arrayList, String str, gkm0 gkm0Var) {
        this.f273407a = arrayList;
        this.f273408b = str;
        this.f273409c = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjm0)) {
            return false;
        }
        yjm0 yjm0Var = (yjm0) obj;
        return this.f273407a.equals(yjm0Var.f273407a) && wj50.m88271j(this.f273408b, yjm0Var.f273408b) && this.f273409c.equals(yjm0Var.f273409c);
    }

    public final int hashCode() {
        return this.f273409c.hashCode() + s571.m77243b(this.f273407a.hashCode() * 31, 31, this.f273408b);
    }
}
