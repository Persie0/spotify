package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class yi40 {

    /* JADX INFO: renamed from: a */
    public final UUID f273032a;

    /* JADX INFO: renamed from: b */
    public final int f273033b;

    public yi40(UUID uuid, int i) {
        this.f273032a = uuid;
        this.f273033b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi40)) {
            return false;
        }
        yi40 yi40Var = (yi40) obj;
        return wj50.m88271j(this.f273032a, yi40Var.f273032a) && this.f273033b == yi40Var.f273033b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f273033b) + (this.f273032a.hashCode() * 31);
    }
}
