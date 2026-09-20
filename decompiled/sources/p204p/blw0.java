package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class blw0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f28297a;

    /* JADX INFO: renamed from: b */
    public final Object f28298b;

    public blw0(ArrayList arrayList, List list) {
        this.f28297a = arrayList;
        this.f28298b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blw0)) {
            return false;
        }
        blw0 blw0Var = (blw0) obj;
        return this.f28297a.equals(blw0Var.f28297a) && this.f28298b.equals(blw0Var.f28298b);
    }

    public final int hashCode() {
        return this.f28298b.hashCode() + (this.f28297a.hashCode() * 31);
    }
}
