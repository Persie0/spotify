package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class q770 extends h870 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f186042a;

    public q770(ArrayList arrayList) {
        this.f186042a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q770) && this.f186042a.equals(((q770) obj).f186042a);
    }

    public final int hashCode() {
        return this.f186042a.hashCode();
    }

    public final String toString() {
        return "ArrayValue(" + this.f186042a + ')';
    }
}
