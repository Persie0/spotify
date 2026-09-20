package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class td6 {

    /* JADX INFO: renamed from: a */
    public final List f219237a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f219238b;

    public td6(ArrayList arrayList, List list) {
        this.f219237a = list;
        this.f219238b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td6)) {
            return false;
        }
        td6 td6Var = (td6) obj;
        return this.f219237a.equals(td6Var.f219237a) && this.f219238b.equals(td6Var.f219238b);
    }

    public final int hashCode() {
        return this.f219238b.hashCode() + (this.f219237a.hashCode() * 31);
    }
}
