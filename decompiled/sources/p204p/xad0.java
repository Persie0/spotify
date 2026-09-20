package p204p;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class xad0 {

    /* JADX INFO: renamed from: a */
    public final String f259663a;

    /* JADX INFO: renamed from: b */
    public final boolean f259664b;

    /* JADX INFO: renamed from: c */
    public final boolean f259665c;

    public xad0(String str, boolean z, boolean z2) {
        this.f259663a = str;
        this.f259664b = z;
        this.f259665c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == xad0.class) {
            xad0 xad0Var = (xad0) obj;
            if (TextUtils.equals(this.f259663a, xad0Var.f259663a) && this.f259664b == xad0Var.f259664b && this.f259665c == xad0Var.f259665c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((s571.m77243b(31, 31, this.f259663a) + (this.f259664b ? 1231 : 1237)) * 31) + (this.f259665c ? 1231 : 1237);
    }
}
