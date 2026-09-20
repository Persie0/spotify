package p204p;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class rrm0 {

    /* JADX INFO: renamed from: a */
    public final qrm0 f202085a;

    /* JADX INFO: renamed from: b */
    public final int f202086b;

    public rrm0(qrm0 qrm0Var, int i) {
        this.f202085a = qrm0Var;
        this.f202086b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrm0)) {
            return false;
        }
        rrm0 rrm0Var = (rrm0) obj;
        return this.f202085a == rrm0Var.f202085a && this.f202086b == rrm0Var.f202086b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f202086b) + (this.f202085a.hashCode() * 31);
    }

    public final String toString() {
        String strName = this.f202085a.name();
        Locale locale = Locale.ROOT;
        return s571.m77252k(strName.toLowerCase(locale), "(", dq60.m36626z(this.f202086b).toLowerCase(locale), ")");
    }
}
