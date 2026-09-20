package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class eep0 {

    /* JADX INFO: renamed from: a */
    public final String f58830a;

    /* JADX INFO: renamed from: b */
    public final String f58831b;

    /* JADX INFO: renamed from: c */
    public final String f58832c;

    /* JADX INFO: renamed from: d */
    public final String f58833d;

    /* JADX INFO: renamed from: e */
    public final Object f58834e;

    public eep0(String str, String str2, String str3, String str4, List list) {
        this.f58830a = str;
        this.f58831b = str2;
        this.f58832c = str3;
        this.f58833d = str4;
        this.f58834e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eep0)) {
            return false;
        }
        eep0 eep0Var = (eep0) obj;
        return wj50.m88271j(this.f58830a, eep0Var.f58830a) && this.f58831b.equals(eep0Var.f58831b) && wj50.m88271j(this.f58832c, eep0Var.f58832c) && wj50.m88271j(this.f58833d, eep0Var.f58833d) && this.f58834e.equals(eep0Var.f58834e);
    }

    public final int hashCode() {
        return this.f58834e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f58830a.hashCode() * 31, 31, this.f58831b), 31, this.f58832c), 31, this.f58833d);
    }
}
