package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class gq80 {

    /* JADX INFO: renamed from: a */
    public final List f83383a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f83384b;

    public gq80(ArrayList arrayList, List list) {
        this.f83383a = list;
        this.f83384b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq80)) {
            return false;
        }
        gq80 gq80Var = (gq80) obj;
        return wj50.m88271j(this.f83383a, gq80Var.f83383a) && this.f83384b.equals(gq80Var.f83384b);
    }

    public final int hashCode() {
        return this.f83384b.hashCode() + (this.f83383a.hashCode() * 31);
    }
}
