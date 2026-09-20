package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class bxz {

    /* JADX INFO: renamed from: a */
    public final String f32019a;

    /* JADX INFO: renamed from: b */
    public final String f32020b;

    /* JADX INFO: renamed from: c */
    public final String f32021c;

    /* JADX INFO: renamed from: d */
    public final long f32022d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f32023e;

    public bxz(long j, String str, String str2, String str3, ArrayList arrayList) {
        this.f32019a = str;
        this.f32020b = str2;
        this.f32021c = str3;
        this.f32022d = j;
        this.f32023e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxz)) {
            return false;
        }
        bxz bxzVar = (bxz) obj;
        return wj50.m88271j(this.f32019a, bxzVar.f32019a) && wj50.m88271j(this.f32020b, bxzVar.f32020b) && wj50.m88271j(this.f32021c, bxzVar.f32021c) && this.f32022d == bxzVar.f32022d && this.f32023e.equals(bxzVar.f32023e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f32019a.hashCode() * 31, 31, this.f32020b);
        String str = this.f32021c;
        return this.f32023e.hashCode() + dq60.m36605e((iM77243b + (str == null ? 0 : str.hashCode())) * 31, this.f32022d, 31);
    }
}
