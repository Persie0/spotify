package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f07 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f64560a;

    public f07(ArrayList arrayList) {
        this.f64560a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f07) && this.f64560a.equals(((f07) obj).f64560a);
    }

    public final int hashCode() {
        return this.f64560a.hashCode();
    }
}
