package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class es5 {

    /* JADX INFO: renamed from: a */
    public final String f62290a;

    /* JADX INFO: renamed from: b */
    public final String f62291b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f62292c;

    public es5(String str, String str2, ArrayList arrayList) {
        this.f62290a = str;
        this.f62291b = str2;
        this.f62292c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es5)) {
            return false;
        }
        es5 es5Var = (es5) obj;
        return wj50.m88271j(this.f62290a, es5Var.f62290a) && wj50.m88271j(this.f62291b, es5Var.f62291b) && this.f62292c.equals(es5Var.f62292c);
    }

    public final int hashCode() {
        return this.f62292c.hashCode() + s571.m77243b(this.f62290a.hashCode() * 31, 31, this.f62291b);
    }
}
