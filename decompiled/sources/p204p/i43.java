package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i43 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f98397a;

    /* JADX INFO: renamed from: b */
    public final hw2 f98398b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f98399c;

    /* JADX INFO: renamed from: d */
    public final long f98400d;

    /* JADX INFO: renamed from: e */
    public final boolean f98401e;

    public i43(String str, hw2 hw2Var, ArrayList arrayList, long j, boolean z) {
        this.f98397a = str;
        this.f98398b = hw2Var;
        this.f98399c = arrayList;
        this.f98400d = j;
        this.f98401e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i43)) {
            return false;
        }
        i43 i43Var = (i43) obj;
        return wj50.m88271j(this.f98397a, i43Var.f98397a) && this.f98398b.equals(i43Var.f98398b) && this.f98399c.equals(i43Var.f98399c) && this.f98400d == i43Var.f98400d && this.f98401e == i43Var.f98401e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f98401e) + dq60.m36605e(lq51.m59700f(this.f98399c, (this.f98398b.hashCode() + (this.f98397a.hashCode() * 31)) * 31, 31), this.f98400d, 31);
    }
}
