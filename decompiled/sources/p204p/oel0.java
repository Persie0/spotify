package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class oel0 implements sel0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f164467a;

    /* JADX INFO: renamed from: b */
    public final String f164468b;

    public oel0(ArrayList arrayList, String str) {
        this.f164467a = arrayList;
        this.f164468b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oel0)) {
            return false;
        }
        oel0 oel0Var = (oel0) obj;
        return this.f164467a.equals(oel0Var.f164467a) && wj50.m88271j(this.f164468b, oel0Var.f164468b);
    }

    public final int hashCode() {
        return this.f164468b.hashCode() + (this.f164467a.hashCode() * 31);
    }
}
