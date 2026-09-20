package p204p;

import android.content.Context;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class bh40 {

    /* JADX INFO: renamed from: a */
    public final vg40 f27079a;

    /* JADX INFO: renamed from: b */
    public final Context f27080b;

    public bh40(vg40 vg40Var, Context context) {
        this.f27079a = vg40Var;
        this.f27080b = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m29199a(String str, ibk ibkVar) {
        xg40 xg40Var;
        wg40 wg40Var;
        String str2;
        String str3;
        if (ibkVar instanceof xg40) {
            xg40Var = (xg40) ibkVar;
            int i = xg40Var.f261200e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xg40Var.f261200e = i - Integer.MIN_VALUE;
            } else {
                xg40Var = new xg40(this, ibkVar);
            }
        } else {
            xg40Var = new xg40(this, ibkVar);
        }
        Object objM65530p = xg40Var.f261198c;
        int i2 = xg40Var.f261200e;
        w2a1 w2a1Var = w2a1.f247311a;
        vg40 vg40Var = this.f27079a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM65530p);
            xg40Var.f261196a = str;
            xg40Var.f261200e = 1;
            objM65530p = nsf1.m65530p(xg40Var, new ug40(str, vg40Var, 0), vg40Var.f241116a, true, false);
            if (objM65530p != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            str = xg40Var.f261196a;
            bga.m29073P(objM65530p);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wg40Var = xg40Var.f261197b;
            bga.m29073P(objM65530p);
        }
        if (wg40Var != null && (str3 = wg40Var.f250979j) != null) {
            m29202d(str3);
        }
        if (wg40Var != null && (str2 = wg40Var.f250978i) != null) {
            m29202d(str2);
        }
        return w2a1Var;
        wg40 wg40Var2 = (wg40) objM65530p;
        xg40Var.f261196a = null;
        xg40Var.f261197b = wg40Var2;
        xg40Var.f261200e = 2;
        Object objM65530p2 = nsf1.m65530p(xg40Var, new ej10(str, 13), vg40Var.f241116a, false, true);
        if (objM65530p2 != yukVar) {
            objM65530p2 = w2a1Var;
        }
        if (objM65530p2 != yukVar) {
            wg40Var = wg40Var2;
            if (wg40Var != null) {
                m29202d(str3);
            }
            if (wg40Var != null) {
                m29202d(str2);
            }
            return w2a1Var;
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Serializable m29200b(ibk ibkVar) {
        yg40 yg40Var;
        if (ibkVar instanceof yg40) {
            yg40Var = (yg40) ibkVar;
            int i = yg40Var.f272476c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yg40Var.f272476c = i - Integer.MIN_VALUE;
            } else {
                yg40Var = new yg40(this, ibkVar);
            }
        } else {
            yg40Var = new yg40(this, ibkVar);
        }
        Object objM65530p = yg40Var.f272474a;
        int i2 = yg40Var.f272476c;
        if (i2 == 0) {
            bga.m29073P(objM65530p);
            yg40Var.f272476c = 1;
            vg40 vg40Var = this.f27079a;
            objM65530p = nsf1.m65530p(yg40Var, new zc30(vg40Var, 13), vg40Var.f241116a, true, false);
            yuk yukVar = yuk.f276404a;
            if (objM65530p == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM65530p);
        }
        Iterable iterable = (Iterable) objM65530p;
        ArrayList arrayList = new ArrayList(i6f.m49804T(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(mhf1.m61776x((wg40) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final Object m29201c(sg40 sg40Var, ibk ibkVar) {
        int i;
        eay eayVar;
        lg40 lg40Var = sg40Var.f208714c;
        String str = sg40Var.f208712a;
        is50 is50Var = sg40Var.f208713b;
        if (is50Var instanceof es50) {
            i = 1;
        } else if (is50Var instanceof hs50) {
            i = 2;
        } else if (is50Var instanceof gs50) {
            i = 3;
        } else if (is50Var instanceof ds50) {
            i = 4;
        } else if (is50Var instanceof cs50) {
            i = 5;
        } else {
            if (!(is50Var instanceof fs50)) {
                throw new NoWhenBranchMatchedException();
            }
            i = 6;
        }
        hs50 hs50Var = is50Var instanceof hs50 ? (hs50) is50Var : null;
        double d = hs50Var != null ? hs50Var.f94609a : 0.0d;
        ds50 ds50Var = is50Var instanceof ds50 ? (ds50) is50Var : null;
        wg40 wg40Var = new wg40(str, i, d, (ds50Var == null || (eayVar = ds50Var.f52491a) == null) ? null : eayVar.name(), lg40Var != null ? lg40Var.f133069a : null, lg40Var != null ? lg40Var.f133070b : null, lg40Var != null ? lg40Var.f133071c : null, lg40Var != null ? Integer.valueOf(lg40Var.f133072d) : null, lg40Var != null ? lg40Var.f133073e : null, sg40Var.f208715d, sg40Var.f208716e, sg40Var.f208717f, sg40Var.f208718g, sg40Var.f208719h);
        vg40 vg40Var = this.f27079a;
        Object objM65530p = nsf1.m65530p(ibkVar, new ne30(5, vg40Var, wg40Var), vg40Var.f241116a, false, true);
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (objM65530p != yukVar) {
            objM65530p = w2a1Var;
        }
        return objM65530p == yukVar ? objM65530p : w2a1Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m29202d(String str) {
        try {
            this.f27080b.getContentResolver().releasePersistableUriPermission(Uri.parse(str), 1);
        } catch (SecurityException e) {
            Logger.m3973i(edb.m38566o("STS: failed to release URI permission for ", str, ": ", e.getMessage()), new Object[0]);
        }
    }
}
