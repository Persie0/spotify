package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wlt0 {

    /* JADX INFO: renamed from: a */
    public final String f252616a;

    /* JADX INFO: renamed from: b */
    public final long f252617b;

    /* JADX INFO: renamed from: c */
    public final List f252618c;

    public wlt0(long j, String str, List list) {
        this.f252616a = str;
        this.f252617b = j;
        this.f252618c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlt0)) {
            return false;
        }
        wlt0 wlt0Var = (wlt0) obj;
        return wj50.m88271j(this.f252616a, wlt0Var.f252616a) && this.f252617b == wlt0Var.f252617b && wj50.m88271j(this.f252618c, wlt0Var.f252618c);
    }

    public final int hashCode() {
        return this.f252618c.hashCode() + dq60.m36605e(this.f252616a.hashCode() * 31, this.f252617b, 31);
    }
}
