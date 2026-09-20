package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class f7o0 {

    /* JADX INFO: renamed from: a */
    public final String f66757a;

    /* JADX INFO: renamed from: b */
    public final String f66758b;

    /* JADX INFO: renamed from: c */
    public final List f66759c;

    public f7o0(String str, List list, String str2) {
        this.f66757a = str;
        this.f66758b = str2;
        this.f66759c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7o0)) {
            return false;
        }
        f7o0 f7o0Var = (f7o0) obj;
        return wj50.m88271j(this.f66757a, f7o0Var.f66757a) && wj50.m88271j(this.f66758b, f7o0Var.f66758b) && wj50.m88271j(this.f66759c, f7o0Var.f66759c);
    }

    public final int hashCode() {
        int iHashCode = this.f66757a.hashCode() * 31;
        String str = this.f66758b;
        return this.f66759c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
