package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@rtz0
public final class aq50 {
    public static final zp50 Companion = new zp50();

    /* JADX INFO: renamed from: e */
    public static final fr70[] f18083e = {null, null, q3d0.m72078I(2, wv30.f255361O0), null};

    /* JADX INFO: renamed from: a */
    public final String f18084a;

    /* JADX INFO: renamed from: b */
    public final String f18085b;

    /* JADX INFO: renamed from: c */
    public final List f18086c;

    /* JADX INFO: renamed from: d */
    public final boolean f18087d;

    public /* synthetic */ aq50(int i, String str, String str2, List list, boolean z) {
        if (15 != (i & 15)) {
            edo.m38617p(i, 15, yp50.f274825a.getDescriptor());
            throw null;
        }
        this.f18084a = str;
        this.f18085b = str2;
        this.f18086c = list;
        this.f18087d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq50)) {
            return false;
        }
        aq50 aq50Var = (aq50) obj;
        return wj50.m88271j(this.f18084a, aq50Var.f18084a) && wj50.m88271j(this.f18085b, aq50Var.f18085b) && wj50.m88271j(this.f18086c, aq50Var.f18086c) && this.f18087d == aq50Var.f18087d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18087d) + s571.m77244c(s571.m77243b(this.f18084a.hashCode() * 31, 31, this.f18085b), 31, this.f18086c);
    }

    public aq50(String str, String str2, List list, boolean z) {
        this.f18084a = str;
        this.f18085b = str2;
        this.f18086c = list;
        this.f18087d = z;
    }
}
