package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class g6z0 {

    /* JADX INFO: renamed from: a */
    public final String f77142a;

    /* JADX INFO: renamed from: b */
    public final String f77143b;

    /* JADX INFO: renamed from: c */
    public final String f77144c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f77145d;

    public g6z0(String str, String str2, String str3, ArrayList arrayList) {
        this.f77142a = str;
        this.f77143b = str2;
        this.f77144c = str3;
        this.f77145d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6z0)) {
            return false;
        }
        g6z0 g6z0Var = (g6z0) obj;
        return this.f77142a.equals(g6z0Var.f77142a) && this.f77143b.equals(g6z0Var.f77143b) && this.f77144c.equals(g6z0Var.f77144c) && this.f77145d.equals(g6z0Var.f77145d);
    }

    public final int hashCode() {
        return this.f77145d.hashCode() + s571.m77243b(s571.m77243b(this.f77142a.hashCode() * 31, 31, this.f77143b), 31, this.f77144c);
    }
}
