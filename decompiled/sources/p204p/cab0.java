package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class cab0 {

    /* JADX INFO: renamed from: a */
    public final u8b0 f35791a;

    /* JADX INFO: renamed from: b */
    public final Throwable f35792b;

    public cab0(u8b0 u8b0Var) {
        this.f35791a = u8b0Var;
        this.f35792b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cab0)) {
            return false;
        }
        cab0 cab0Var = (cab0) obj;
        u8b0 u8b0Var = this.f35791a;
        if (u8b0Var != null && u8b0Var.equals(cab0Var.f35791a)) {
            return true;
        }
        Throwable th = this.f35792b;
        if (th == null || cab0Var.f35792b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35791a, this.f35792b});
    }

    public cab0(Throwable th) {
        this.f35792b = th;
        this.f35791a = null;
    }
}
