package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zq81 {

    /* JADX INFO: renamed from: c */
    public static final String f285329c;

    /* JADX INFO: renamed from: d */
    public static final String f285330d;

    /* JADX INFO: renamed from: a */
    public final kf81 f285331a;

    /* JADX INFO: renamed from: b */
    public final pf40 f285332b;

    static {
        String str = h0b1.f86200a;
        f285329c = Integer.toString(0, 36);
        f285330d = Integer.toString(1, 36);
    }

    public zq81(kf81 kf81Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= kf81Var.f122099a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f285331a = kf81Var;
        this.f285332b = pf40.m69791p(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zq81.class == obj.getClass()) {
            zq81 zq81Var = (zq81) obj;
            if (this.f285331a.equals(zq81Var.f285331a)) {
                pf40 pf40Var = zq81Var.f285332b;
                pf40 pf40Var2 = this.f285332b;
                pf40Var2.getClass();
                if (pmf0.m70330p(pf40Var2, pf40Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f285332b.hashCode() * 31) + this.f285331a.hashCode();
    }
}
