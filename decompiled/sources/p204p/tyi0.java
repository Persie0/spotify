package p204p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@y9j0(d6n0.f45729b)
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lp/tyi0;", "Lp/aaj0;", "Lp/ryi0;", "navigation-common_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public class tyi0 extends aaj0 {

    /* JADX INFO: renamed from: c */
    public final eaj0 f224979c;

    public tyi0(eaj0 eaj0Var) {
        this.f224979c = eaj0Var;
    }

    @Override // p204p.aaj0
    /* JADX INFO: renamed from: d */
    public final void mo25255d(List list, ezi0 ezi0Var) {
        jyi0 jyi0VarM76727p;
        String strValueOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uxi0 uxi0Var = (uxi0) it.next();
            ryi0 ryi0Var = (ryi0) uxi0Var.f234936b;
            rlv0 rlv0Var = new rlv0();
            rlv0Var.f200373a = uxi0Var.m84175a();
            int i = ryi0Var.f203928Z;
            String str = ryi0Var.f203926M0;
            if (i == 0 && str == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i2 = ryi0Var.f117421h;
                if (i2 != 0) {
                    strValueOf = ryi0Var.f117416c;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(i2);
                    }
                } else {
                    strValueOf = "the root navigation";
                }
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (str != null) {
                jyi0VarM76727p = ryi0Var.m76727p(str, false);
            } else {
                mw31 mw31Var = ryi0Var.f203927Y;
                mw31Var.getClass();
                jyi0VarM76727p = (jyi0) fag1.m41164m(mw31Var, i);
            }
            if (jyi0VarM76727p == null) {
                if (ryi0Var.f203925L0 == null) {
                    String strValueOf2 = ryi0Var.f203926M0;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(ryi0Var.f203928Z);
                    }
                    ryi0Var.f203925L0 = strValueOf2;
                }
                String str2 = ryi0Var.f203925L0;
                wj50.m88279p(str2);
                throw new IllegalArgumentException(s571.m77251j("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            LinkedHashMap linkedHashMap = jyi0VarM76727p.f117420g;
            if (str != null) {
                if (!str.equals(jyi0VarM76727p.f117422i)) {
                    hyi0 hyi0VarM54795i = jyi0VarM76727p.m54795i(str);
                    Bundle bundle = hyi0VarM54795i != null ? hyi0VarM54795i.f96592b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putAll(bundle);
                        Bundle bundle3 = (Bundle) rlv0Var.f200373a;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        rlv0Var.f200373a = bundle2;
                    }
                }
                if (kkc0.m56706s0(linkedHashMap).isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListM61850C = mif1.m61850C(kkc0.m56706s0(linkedHashMap), new gfx(rlv0Var, 20));
                    if (!arrayListM61850C.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + jyi0VarM76727p + ". Missing required arguments [" + arrayListM61850C + ']').toString());
                    }
                }
            }
            aaj0 aaj0VarM38302b = this.f224979c.m38302b(jyi0VarM76727p.f117414a);
            zxi0 zxi0VarM25253b = m25253b();
            Bundle bundleM54791b = jyi0VarM76727p.m54791b((Bundle) rlv0Var.f200373a);
            uyi0 uyi0Var = zxi0VarM25253b.f287334h;
            aaj0VarM38302b.mo25255d(Collections.singletonList(x74.m90118q(uyi0Var.f235265a, jyi0VarM76727p, bundleM54791b, uyi0Var.m84257j(), uyi0Var.f235280p)), ezi0Var);
        }
    }

    @Override // p204p.aaj0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ryi0 mo25252a() {
        return new ryi0(this);
    }
}
