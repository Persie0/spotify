package p204p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class hw20 implements rt71 {

    /* JADX INFO: renamed from: a */
    public final fuz0 f95840a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f95841b;

    public hw20(fuz0 fuz0Var, ArrayList arrayList) {
        this.f95840a = fuz0Var;
        this.f95841b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw20)) {
            return false;
        }
        hw20 hw20Var = (hw20) obj;
        return this.f95840a.equals(hw20Var.f95840a) && this.f95841b.equals(hw20Var.f95841b);
    }

    @Override // p204p.rt71
    public final String getId() {
        return "highlights-shelf";
    }

    public final int hashCode() {
        return this.f95841b.hashCode() + (Arrays.hashCode(this.f95840a.f73606a) * 31);
    }
}
