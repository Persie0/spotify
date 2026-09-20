package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class d29 {

    /* JADX INFO: renamed from: a */
    public final String f44512a;

    /* JADX INFO: renamed from: b */
    public final boolean f44513b;

    /* JADX INFO: renamed from: c */
    public final String f44514c;

    /* JADX INFO: renamed from: d */
    public final List f44515d;

    /* JADX INFO: renamed from: e */
    public final b8l0 f44516e;

    /* JADX INFO: renamed from: f */
    public final Map f44517f;

    public d29(String str, boolean z, String str2, List list, b8l0 b8l0Var, Map map) {
        this.f44512a = str;
        this.f44513b = z;
        this.f44514c = str2;
        this.f44515d = list;
        this.f44516e = b8l0Var;
        this.f44517f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d29)) {
            return false;
        }
        d29 d29Var = (d29) obj;
        return wj50.m88271j(this.f44512a, d29Var.f44512a) && this.f44513b == d29Var.f44513b && wj50.m88271j(this.f44514c, d29Var.f44514c) && wj50.m88271j(this.f44515d, d29Var.f44515d) && this.f44516e == d29Var.f44516e && wj50.m88271j(this.f44517f, d29Var.f44517f);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f44512a.hashCode() * 31, 31, this.f44513b);
        String str = this.f44514c;
        return this.f44517f.hashCode() + ((this.f44516e.hashCode() + s571.m77244c((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f44515d)) * 31);
    }
}
