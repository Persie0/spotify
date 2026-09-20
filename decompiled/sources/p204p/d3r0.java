package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class d3r0 implements f3r0 {

    /* JADX INFO: renamed from: a */
    public final String f44990a;

    /* JADX INFO: renamed from: b */
    public final String f44991b;

    /* JADX INFO: renamed from: c */
    public final String f44992c;

    /* JADX INFO: renamed from: d */
    public final String f44993d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f44994e;

    /* JADX INFO: renamed from: f */
    public final List f44995f;

    public d3r0(String str, String str2, String str3, String str4, ArrayList arrayList, ae50 ae50Var) {
        this.f44990a = str;
        this.f44991b = str2;
        this.f44992c = str3;
        this.f44993d = str4;
        this.f44994e = arrayList;
        this.f44995f = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3r0)) {
            return false;
        }
        d3r0 d3r0Var = (d3r0) obj;
        return wj50.m88271j(this.f44990a, d3r0Var.f44990a) && wj50.m88271j(this.f44991b, d3r0Var.f44991b) && wj50.m88271j(this.f44992c, d3r0Var.f44992c) && wj50.m88271j(this.f44993d, d3r0Var.f44993d) && this.f44994e.equals(d3r0Var.f44994e) && wj50.m88271j(this.f44995f, d3r0Var.f44995f);
    }

    public final int hashCode() {
        return this.f44995f.hashCode() + lq51.m59700f(this.f44994e, s571.m77243b(s571.m77243b(s571.m77243b(this.f44990a.hashCode() * 31, 31, this.f44991b), 31, this.f44992c), 31, this.f44993d), 31);
    }
}
