package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class o9d1 {

    /* JADX INFO: renamed from: a */
    public final String f163000a;

    /* JADX INFO: renamed from: b */
    public final Object f163001b;

    /* JADX INFO: renamed from: c */
    public final un20 f163002c;

    /* JADX INFO: renamed from: d */
    public final String f163003d;

    /* JADX INFO: renamed from: e */
    public final boolean f163004e;

    /* JADX INFO: renamed from: f */
    public final String f163005f;

    public o9d1(String str, List list, un20 un20Var, String str2, boolean z, String str3) {
        this.f163000a = str;
        this.f163001b = list;
        this.f163002c = un20Var;
        this.f163003d = str2;
        this.f163004e = z;
        this.f163005f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9d1)) {
            return false;
        }
        o9d1 o9d1Var = (o9d1) obj;
        return wj50.m88271j(this.f163000a, o9d1Var.f163000a) && this.f163001b.equals(o9d1Var.f163001b) && wj50.m88271j(this.f163002c, o9d1Var.f163002c) && wj50.m88271j(this.f163003d, o9d1Var.f163003d) && this.f163004e == o9d1Var.f163004e && wj50.m88271j(this.f163005f, o9d1Var.f163005f);
    }

    public final int hashCode() {
        int iM36604d = dq60.m36604d(this.f163000a.hashCode() * 31, 31, this.f163001b);
        un20 un20Var = this.f163002c;
        return this.f163005f.hashCode() + s571.m77245d(s571.m77243b((iM36604d + (un20Var == null ? 0 : un20Var.hashCode())) * 31, 31, this.f163003d), 31, this.f163004e);
    }
}
