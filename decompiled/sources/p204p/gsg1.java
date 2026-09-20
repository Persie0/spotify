package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class gsg1 {

    /* JADX INFO: renamed from: a */
    public final fsg1 f83966a;

    /* JADX INFO: renamed from: b */
    public final Integer f83967b;

    public /* synthetic */ gsg1(yya1 yya1Var) {
        this.f83966a = (fsg1) yya1Var.f277453b;
        this.f83967b = (Integer) yya1Var.f277454c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gsg1)) {
            return false;
        }
        gsg1 gsg1Var = (gsg1) obj;
        return mvl0.m62956s(this.f83966a, gsg1Var.f83966a) && mvl0.m62956s(this.f83967b, gsg1Var.f83967b) && mvl0.m62956s(null, null) && mvl0.m62956s(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f83966a, this.f83967b, null, null});
    }
}
