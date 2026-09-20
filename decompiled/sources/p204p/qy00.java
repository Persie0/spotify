package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class qy00 {

    /* JADX INFO: renamed from: a */
    public final String f193776a;

    /* JADX INFO: renamed from: b */
    public final int f193777b;

    /* JADX INFO: renamed from: c */
    public final List f193778c;

    /* JADX INFO: renamed from: d */
    public final Map f193779d;

    /* JADX INFO: renamed from: e */
    public final boolean f193780e;

    public qy00(String str, int i, List list, Map map, boolean z) {
        this.f193776a = str;
        this.f193777b = i;
        this.f193778c = list;
        this.f193779d = map;
        this.f193780e = z;
    }

    /* JADX INFO: renamed from: a */
    public static qy00 m74150a(qy00 qy00Var, mec0 mec0Var, int i) {
        String str = qy00Var.f193776a;
        int i2 = qy00Var.f193777b;
        List list = qy00Var.f193778c;
        Map map = mec0Var;
        if ((i & 8) != 0) {
            map = qy00Var.f193779d;
        }
        Map map2 = map;
        boolean z = (i & 16) != 0 ? qy00Var.f193780e : true;
        qy00Var.getClass();
        qy00Var.getClass();
        return new qy00(str, i2, list, map2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy00)) {
            return false;
        }
        qy00 qy00Var = (qy00) obj;
        return wj50.m88271j(this.f193776a, qy00Var.f193776a) && this.f193777b == qy00Var.f193777b && wj50.m88271j(this.f193778c, qy00Var.f193778c) && wj50.m88271j(this.f193779d, qy00Var.f193779d) && this.f193780e == qy00Var.f193780e;
    }

    public final int hashCode() {
        return ((Boolean.hashCode(this.f193780e) + edb.m38557f(s571.m77244c(f710.m40938f(this.f193777b, this.f193776a.hashCode() * 31, 31), 31, this.f193778c), 31, this.f193779d)) * 31) - 785728031;
    }
}
