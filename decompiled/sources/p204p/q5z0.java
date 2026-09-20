package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class q5z0 extends j6z0 {

    /* JADX INFO: renamed from: a */
    public final String f185630a;

    /* JADX INFO: renamed from: b */
    public final String f185631b;

    /* JADX INFO: renamed from: c */
    public final String f185632c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f185633d;

    public q5z0(String str, String str2, String str3, ArrayList arrayList) {
        this.f185630a = str;
        this.f185631b = str2;
        this.f185632c = str3;
        this.f185633d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5z0)) {
            return false;
        }
        q5z0 q5z0Var = (q5z0) obj;
        return wj50.m88271j(this.f185630a, q5z0Var.f185630a) && wj50.m88271j(this.f185631b, q5z0Var.f185631b) && wj50.m88271j(this.f185632c, q5z0Var.f185632c) && this.f185633d.equals(q5z0Var.f185633d);
    }

    public final int hashCode() {
        return this.f185633d.hashCode() + s571.m77243b(s571.m77243b(this.f185630a.hashCode() * 31, 31, this.f185631b), 31, this.f185632c);
    }
}
