package p204p;

import android.os.Bundle;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class l101 implements k101 {

    /* JADX INFO: renamed from: e */
    public static final fv31 f128560e = fv31.f73628b.m78182S("checkout_source");

    /* JADX INFO: renamed from: a */
    public final hv31 f128561a;

    /* JADX INFO: renamed from: b */
    public String f128562b;

    /* JADX INFO: renamed from: c */
    public int f128563c;

    /* JADX INFO: renamed from: d */
    public String f128564d;

    public l101(hv31 hv31Var) {
        this.f128561a = hv31Var;
    }

    /* JADX INFO: renamed from: b */
    public final String m57845b() {
        String str = this.f128564d;
        if (str != null) {
            return str;
        }
        String string = UUID.randomUUID().toString();
        this.f128564d = string;
        return string;
    }

    /* JADX INFO: renamed from: c */
    public final String m57846c() {
        String str = this.f128562b;
        if (str != null) {
            return str;
        }
        String str2 = null;
        String strMo48710e = this.f128561a.mo48710e(f128560e, null);
        if (strMo48710e != null) {
            this.f128562b = strMo48710e;
            str2 = strMo48710e;
        }
        if (str2 != null) {
            return str2;
        }
        na6.m63957e("sessionIdProvider.source was null");
        return "unknown";
    }

    /* JADX INFO: renamed from: d */
    public final boolean m57847d(gb80 gb80Var, f9y0 f9y0Var) {
        boolean z = false;
        if (this.f128563c == 0) {
            Bundle bundleM41108a = f9y0Var.m41108a("session_id_provider_state");
            String string = bundleM41108a != null ? bundleM41108a.getString("session_id") : null;
            if (string == null) {
                string = UUID.randomUUID().toString();
                z = true;
            }
            this.f128564d = string;
        }
        f9y0Var.m41112e("session_id_provider_state");
        f9y0Var.m41110c("session_id_provider_state", new C1982ik(this, 20));
        this.f128563c++;
        gb80Var.mo31986a(new dz2(this, 20));
        return z;
    }
}
