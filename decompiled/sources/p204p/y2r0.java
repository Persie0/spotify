package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class y2r0 {

    /* JADX INFO: renamed from: a */
    public final z2r0 f268670a;

    /* JADX INFO: renamed from: b */
    public final String f268671b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f268672c;

    public y2r0(z2r0 z2r0Var, String str, ArrayList arrayList) {
        this.f268670a = z2r0Var;
        this.f268671b = str;
        this.f268672c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2r0)) {
            return false;
        }
        y2r0 y2r0Var = (y2r0) obj;
        return this.f268670a.equals(y2r0Var.f268670a) && this.f268671b.equals(y2r0Var.f268671b) && this.f268672c.equals(y2r0Var.f268672c);
    }

    public final int hashCode() {
        return this.f268672c.hashCode() + s571.m77243b(this.f268670a.hashCode() * 31, 31, this.f268671b);
    }
}
