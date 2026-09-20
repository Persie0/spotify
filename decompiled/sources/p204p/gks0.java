package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class gks0 implements iks0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f80900a;

    /* JADX INFO: renamed from: b */
    public final boolean f80901b;

    public gks0(ArrayList arrayList, boolean z) {
        this.f80900a = arrayList;
        this.f80901b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gks0)) {
            return false;
        }
        gks0 gks0Var = (gks0) obj;
        return this.f80900a.equals(gks0Var.f80900a) && this.f80901b == gks0Var.f80901b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f80901b) + (this.f80900a.hashCode() * 31);
    }
}
