package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class rt30 {

    /* JADX INFO: renamed from: a */
    public final int f202485a;

    /* JADX INFO: renamed from: b */
    public final int f202486b;

    public rt30(int i, int i2) {
        this.f202485a = i;
        this.f202486b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final qt30 m76363a(Context context, String str) {
        urv0 urv0Var = st30.f213768a;
        String strM79232c = st30.m79232c(context, context.getString(this.f202485a), str);
        return new qt30(s571.m77250i(strM79232c, "..."), st30.m79232c(context, context.getString(this.f202486b), str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt30)) {
            return false;
        }
        rt30 rt30Var = (rt30) obj;
        return this.f202485a == rt30Var.f202485a && this.f202486b == rt30Var.f202486b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f202486b) + (Integer.hashCode(this.f202485a) * 31);
    }
}
