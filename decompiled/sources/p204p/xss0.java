package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class xss0 {

    /* JADX INFO: renamed from: a */
    public final String f265658a;

    /* JADX INFO: renamed from: b */
    public final k590 f265659b;

    /* JADX INFO: renamed from: c */
    public final Object f265660c;

    /* JADX INFO: renamed from: d */
    public final boolean f265661d;

    /* JADX INFO: renamed from: e */
    public final boolean f265662e;

    public xss0(String str, k590 k590Var, List list, boolean z, boolean z2) {
        this.f265658a = str;
        this.f265659b = k590Var;
        this.f265660c = list;
        this.f265661d = z;
        this.f265662e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xss0)) {
            return false;
        }
        xss0 xss0Var = (xss0) obj;
        return wj50.m88271j(this.f265658a, xss0Var.f265658a) && this.f265659b == xss0Var.f265659b && this.f265660c.equals(xss0Var.f265660c) && this.f265661d == xss0Var.f265661d && this.f265662e == xss0Var.f265662e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265662e) + s571.m77245d(dq60.m36604d((this.f265659b.hashCode() + (this.f265658a.hashCode() * 31)) * 31, 31, this.f265660c), 31, this.f265661d);
    }
}
