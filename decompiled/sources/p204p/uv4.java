package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class uv4 {

    /* JADX INFO: renamed from: a */
    public final vv4 f234332a;

    /* JADX INFO: renamed from: b */
    public int f234333b;

    public uv4(vv4 vv4Var, int i) {
        this.f234332a = vv4Var;
        this.f234333b = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m84048a() {
        String str;
        vv4 vv4Var = this.f234332a;
        String strM86454b = vv4Var.m86454b();
        String strM86453a = vv4Var.m86453a();
        int iM38547C = edb.m38547C(this.f234333b);
        if (iM38547C == 0) {
            str = "w";
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "r";
        }
        return strM86454b + "_{" + strM86453a + "," + str + "}";
    }
}
