package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class zwb0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f286957a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f286958b;

    public zwb0(ArrayList arrayList, ArrayList arrayList2) {
        this.f286957a = arrayList;
        this.f286958b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwb0)) {
            return false;
        }
        zwb0 zwb0Var = (zwb0) obj;
        return this.f286957a.equals(zwb0Var.f286957a) && this.f286958b.equals(zwb0Var.f286958b);
    }

    public final int hashCode() {
        return this.f286958b.hashCode() + (this.f286957a.hashCode() * 31);
    }
}
