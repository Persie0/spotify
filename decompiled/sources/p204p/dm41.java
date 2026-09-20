package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class dm41 {

    /* JADX INFO: renamed from: a */
    public final String f50422a;

    /* JADX INFO: renamed from: b */
    public final Object f50423b;

    public dm41(String str, List list) {
        this.f50422a = str;
        this.f50423b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm41)) {
            return false;
        }
        dm41 dm41Var = (dm41) obj;
        return wj50.m88271j(this.f50422a, dm41Var.f50422a) && this.f50423b.equals(dm41Var.f50423b);
    }

    public final int hashCode() {
        return this.f50423b.hashCode() + (this.f50422a.hashCode() * 31);
    }
}
