package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xvr implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f266465a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f266466b;

    /* JADX INFO: renamed from: c */
    public final int f266467c;

    /* JADX INFO: renamed from: d */
    public final wvr f266468d;

    public xvr(String str, ArrayList arrayList, int i, wvr wvrVar) {
        this.f266465a = str;
        this.f266466b = arrayList;
        this.f266467c = i;
        this.f266468d = wvrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvr)) {
            return false;
        }
        xvr xvrVar = (xvr) obj;
        return wj50.m88271j(this.f266465a, xvrVar.f266465a) && this.f266466b.equals(xvrVar.f266466b) && this.f266467c == xvrVar.f266467c && this.f266468d.equals(xvrVar.f266468d);
    }

    public final int hashCode() {
        return this.f266468d.hashCode() + mt60.m62800g(this.f266467c, lq51.m59700f(this.f266466b, this.f266465a.hashCode() * 31, 31), 31);
    }
}
