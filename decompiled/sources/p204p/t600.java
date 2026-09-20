package p204p;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t600 implements zb80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f217407a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b800 f217408b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gb80 f217409c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ c700 f217410d;

    public t600(c700 c700Var, String str, b800 b800Var, gb80 gb80Var) {
        this.f217410d = c700Var;
        this.f217407a = str;
        this.f217408b = b800Var;
        this.f217409c = gb80Var;
    }

    @Override // p204p.zb80
    /* JADX INFO: renamed from: y */
    public final void mo26206y(hc80 hc80Var, ta80 ta80Var) {
        Bundle bundle;
        c700 c700Var = this.f217410d;
        Map map = c700Var.f34678m;
        ta80 ta80Var2 = ta80.ON_START;
        String str = this.f217407a;
        if (ta80Var == ta80Var2 && (bundle = (Bundle) map.get(str)) != null) {
            this.f217408b.mo27561b(str, bundle);
            map.remove(str);
            c700.m31595O(2);
        }
        if (ta80Var == ta80.ON_DESTROY) {
            this.f217409c.mo31988d(this);
            c700Var.f34679n.remove(str);
        }
    }
}
