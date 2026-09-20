package p204p;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface z1w0 {
    /* JADX INFO: renamed from: b */
    static /* synthetic */ Serializable m95161b(z1w0 z1w0Var, String str, String str2, List list, String str3, String str4, Long l, u1w0 u1w0Var, boolean z, ibk ibkVar, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            l = null;
        }
        if ((i & 64) != 0) {
            u1w0Var = new u1w0();
        }
        if ((i & 128) != 0) {
            z = false;
        }
        return ((q1w0) z1w0Var).m71960f(str, str2, list, str3, str4, l, u1w0Var, z, ibkVar);
    }
}
