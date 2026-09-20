package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class o0n0 {

    /* JADX INFO: renamed from: a */
    public final String f160429a;

    /* JADX INFO: renamed from: b */
    public final boolean f160430b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f160431c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f160432d;

    public o0n0(String str, boolean z, ArrayList arrayList, ArrayList arrayList2) {
        this.f160429a = str;
        this.f160430b = z;
        this.f160431c = arrayList;
        this.f160432d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0n0)) {
            return false;
        }
        o0n0 o0n0Var = (o0n0) obj;
        return this.f160429a.equals(o0n0Var.f160429a) && this.f160430b == o0n0Var.f160430b && this.f160431c.equals(o0n0Var.f160431c) && this.f160432d.equals(o0n0Var.f160432d);
    }

    public final int hashCode() {
        return this.f160432d.hashCode() + lq51.m59700f(this.f160431c, s571.m77245d(this.f160429a.hashCode() * 31, 31, this.f160430b), 31);
    }
}
