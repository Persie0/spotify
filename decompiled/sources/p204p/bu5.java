package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class bu5 {

    /* JADX INFO: renamed from: a */
    public final String f31017a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f31018b;

    public bu5(String str, ArrayList arrayList) {
        this.f31017a = str;
        this.f31018b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu5)) {
            return false;
        }
        bu5 bu5Var = (bu5) obj;
        return wj50.m88271j(this.f31017a, bu5Var.f31017a) && this.f31018b.equals(bu5Var.f31018b);
    }

    public final int hashCode() {
        return this.f31018b.hashCode() + (this.f31017a.hashCode() * 31);
    }
}
