package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class atu0 {

    /* JADX INFO: renamed from: a */
    public final boolean f19746a;

    /* JADX INFO: renamed from: b */
    public final String f19747b;

    /* JADX INFO: renamed from: c */
    public final List f19748c;

    public atu0(String str, List list, boolean z) {
        this.f19746a = z;
        this.f19747b = str;
        this.f19748c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atu0)) {
            return false;
        }
        atu0 atu0Var = (atu0) obj;
        return this.f19746a == atu0Var.f19746a && wj50.m88271j(this.f19747b, atu0Var.f19747b) && wj50.m88271j(this.f19748c, atu0Var.f19748c);
    }

    public final int hashCode() {
        return this.f19748c.hashCode() + s571.m77243b(Boolean.hashCode(this.f19746a) * 31, 31, this.f19747b);
    }
}
