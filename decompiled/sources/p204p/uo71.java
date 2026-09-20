package p204p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class uo71 {

    /* JADX INFO: renamed from: a */
    public final int f232353a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f232354b;

    public uo71(int i, TimeUnit timeUnit) {
        this.f232353a = i;
        this.f232354b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo71)) {
            return false;
        }
        uo71 uo71Var = (uo71) obj;
        return this.f232353a == uo71Var.f232353a && this.f232354b == uo71Var.f232354b;
    }

    public final int hashCode() {
        return this.f232354b.hashCode() + (Integer.hashCode(this.f232353a) * 31);
    }
}
