package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class gm2 {

    /* JADX INFO: renamed from: a */
    public final String f81256a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f81257b;

    /* JADX INFO: renamed from: c */
    public final String f81258c;

    public gm2(String str, String str2, ArrayList arrayList) {
        this.f81256a = str;
        this.f81257b = arrayList;
        this.f81258c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm2)) {
            return false;
        }
        gm2 gm2Var = (gm2) obj;
        return this.f81256a.equals(gm2Var.f81256a) && this.f81257b.equals(gm2Var.f81257b) && this.f81258c.equals(gm2Var.f81258c);
    }

    public final int hashCode() {
        return this.f81258c.hashCode() + lq51.m59700f(this.f81257b, this.f81256a.hashCode() * 31, 31);
    }
}
