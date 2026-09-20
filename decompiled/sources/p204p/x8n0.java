package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x8n0 {

    /* JADX INFO: renamed from: a */
    public final String f259188a;

    /* JADX INFO: renamed from: b */
    public final int f259189b;

    /* JADX INFO: renamed from: c */
    public final List f259190c;

    /* JADX INFO: renamed from: d */
    public final boolean f259191d;

    public x8n0(int i, String str, List list, boolean z) {
        this.f259188a = str;
        this.f259189b = i;
        this.f259190c = list;
        this.f259191d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8n0)) {
            return false;
        }
        x8n0 x8n0Var = (x8n0) obj;
        return wj50.m88271j(this.f259188a, x8n0Var.f259188a) && this.f259189b == x8n0Var.f259189b && wj50.m88271j(this.f259190c, x8n0Var.f259190c) && this.f259191d == x8n0Var.f259191d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259191d) + s571.m77244c(f710.m40938f(this.f259189b, this.f259188a.hashCode() * 31, 31), 31, this.f259190c);
    }

    public /* synthetic */ x8n0(int i, int i2, String str, ArrayList arrayList) {
        this(i, str, (i2 & 4) != 0 ? lau.f131415a : arrayList, false);
    }
}
