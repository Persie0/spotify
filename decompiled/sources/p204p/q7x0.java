package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public final class q7x0 {

    /* JADX INFO: renamed from: a */
    public final String f186182a;

    /* JADX INFO: renamed from: b */
    public final int f186183b;

    /* JADX INFO: renamed from: c */
    public final int f186184c;

    /* JADX INFO: renamed from: d */
    public final String f186185d;

    /* JADX INFO: renamed from: e */
    public final Bundle f186186e;

    public q7x0(String str, int i, int i2, String str2, Bundle bundle) {
        this.f186182a = str;
        this.f186183b = i;
        this.f186184c = i2;
        this.f186185d = str2;
        this.f186186e = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7x0)) {
            return false;
        }
        q7x0 q7x0Var = (q7x0) obj;
        return wj50.m88271j(this.f186182a, q7x0Var.f186182a) && this.f186183b == q7x0Var.f186183b && this.f186184c == q7x0Var.f186184c && wj50.m88271j(this.f186185d, q7x0Var.f186185d) && wj50.m88271j(this.f186186e, q7x0Var.f186186e);
    }

    public final int hashCode() {
        String str = this.f186182a;
        int iM62800g = mt60.m62800g(this.f186184c, mt60.m62800g(this.f186183b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f186185d;
        int iHashCode = (iM62800g + (str2 == null ? 0 : str2.hashCode())) * 31;
        Bundle bundle = this.f186186e;
        return iHashCode + (bundle != null ? bundle.hashCode() : 0);
    }
}
