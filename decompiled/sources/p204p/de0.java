package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class de0 {

    /* JADX INFO: renamed from: a */
    public final List f47919a;

    /* JADX INFO: renamed from: b */
    public final boolean f47920b;

    /* JADX INFO: renamed from: c */
    public final tfu f47921c;

    /* JADX INFO: renamed from: d */
    public final st91 f47922d;

    public de0(List list, boolean z, tfu tfuVar, st91 st91Var) {
        this.f47919a = list;
        this.f47920b = z;
        this.f47921c = tfuVar;
        this.f47922d = st91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de0)) {
            return false;
        }
        de0 de0Var = (de0) obj;
        return wj50.m88271j(this.f47919a, de0Var.f47919a) && this.f47920b == de0Var.f47920b && this.f47921c == de0Var.f47921c && wj50.m88271j(this.f47922d, de0Var.f47922d);
    }

    public final int hashCode() {
        return this.f47922d.f213866a.hashCode() + ((this.f47921c.hashCode() + s571.m77245d(this.f47919a.hashCode() * 31, 31, this.f47920b)) * 31);
    }
}
