package p204p;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class v811 {

    /* JADX INFO: renamed from: a */
    public final Context f238352a;

    /* JADX INFO: renamed from: b */
    public final flw0 f238353b;

    /* JADX INFO: renamed from: c */
    public final c06 f238354c;

    public v811(Context context, flw0 flw0Var, c06 c06Var) {
        this.f238352a = context;
        this.f238353b = flw0Var;
        this.f238354c = c06Var;
    }

    /* JADX INFO: renamed from: a */
    public static final ww01 m84902a(v811 v811Var, m811 m811Var, m811 m811Var2, icr0 icr0Var, String str) {
        Context context = v811Var.f238352a;
        List list = m811Var.f140901g;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new gcr0((Uri) it.next(), context.getString(R.string.image_background_default_content_description)));
        }
        Integer num = m811Var.f140896b;
        int iIntValue = num != null ? num.intValue() : Color.parseColor("#FF535353");
        Integer num2 = m811Var.f140897c;
        return new ww01(context, str, m811Var, m811Var2, g6f.m43700N0(h6f.m46715L(icr0Var, new fcr0(iIntValue, num2 != null ? num2.intValue() : Color.parseColor("#000000"), context.getString(R.string.gradient_background_default_content_description))), arrayList));
    }

    /* JADX INFO: renamed from: b */
    public static final void m84903b(v811 v811Var, Object obj, v311 v311Var, String str) {
        v811Var.getClass();
        if (!(obj instanceof c6x0)) {
            v311Var.setAttribute(str.concat(".result"), "success");
        }
        if (s6x0.m77348a(obj) != null) {
            v311Var.setAttribute(str.concat(".result"), "failure");
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m84904c(String str, xr01 xr01Var, hwv hwvVar, v311 v311Var, ibk ibkVar) {
        p811 p811Var;
        String str2;
        if (ibkVar instanceof p811) {
            p811Var = (p811) ibkVar;
            int i = p811Var.f174813d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p811Var.f174813d = i - Integer.MIN_VALUE;
            } else {
                p811Var = new p811(this, ibkVar);
            }
        } else {
            p811Var = new p811(this, ibkVar);
        }
        p811 p811Var2 = p811Var;
        Object objMo24656a = p811Var2.f174811b;
        int i2 = p811Var2.f174813d;
        if (i2 == 0) {
            bga.m29073P(objMo24656a);
            th00 q811Var = new q811(this, v311Var, str, xr01Var, hwvVar, null, 0);
            p811Var2.f174810a = str;
            p811Var2.f174813d = 1;
            objMo24656a = v311Var.mo24656a("fetching_playlist_sticker", q811Var, p811Var2);
            Object obj = yuk.f276404a;
            if (objMo24656a == obj) {
                return obj;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = p811Var2.f174810a;
            bga.m29073P(objMo24656a);
            str2 = str3;
        }
        m811 m811Var = (m811) objMo24656a;
        Uri uri = m811Var.f140895a;
        String strM61105a = m811Var.m61105a();
        if (strM61105a == null) {
            strM61105a = "";
        }
        m811 m811Var2 = null;
        return new ww01(this.f238352a, str2, null, m811Var2, Collections.singletonList(new gcr0(uri, strM61105a)), 8);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: d */
    public final Object m84905d(String str, xr01 xr01Var, hwv hwvVar, v311 v311Var, ibk ibkVar) {
        r811 r811Var;
        String str2;
        if (ibkVar instanceof r811) {
            r811Var = (r811) ibkVar;
            int i = r811Var.f196695d;
            if ((i & Integer.MIN_VALUE) != 0) {
                r811Var.f196695d = i - Integer.MIN_VALUE;
            } else {
                r811Var = new r811(this, ibkVar);
            }
        } else {
            r811Var = new r811(this, ibkVar);
        }
        r811 r811Var2 = r811Var;
        Object objMo24656a = r811Var2.f196693b;
        int i2 = r811Var2.f196695d;
        if (i2 == 0) {
            bga.m29073P(objMo24656a);
            a081 a081Var = hwvVar.f96057b;
            boolean z = a081Var instanceof zz71;
            Object obj = yuk.f276404a;
            if (z && (a081Var instanceof zz71) && ((zz71) a081Var).f287907a) {
                u811 u811Var = new u811(0, str, null, xr01Var, v311Var, this);
                r811Var2.f196692a = null;
                r811Var2.f196695d = 1;
                Object objM56684z = kk40.m56684z(u811Var, r811Var2);
                if (objM56684z != obj) {
                    return objM56684z;
                }
            } else {
                th00 q811Var = new q811(this, v311Var, str, xr01Var, hwvVar, null, 1);
                r811Var2.f196692a = str;
                r811Var2.f196695d = 2;
                objMo24656a = v311Var.mo24656a("fetching_playlist_sticker", q811Var, r811Var2);
                if (objMo24656a != obj) {
                    str2 = str;
                }
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(objMo24656a);
            return objMo24656a;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str3 = r811Var2.f196692a;
        bga.m29073P(objMo24656a);
        str2 = str3;
        return new ww01(this.f238352a, str2, (m811) objMo24656a, null, null, 16);
    }

    /* JADX INFO: renamed from: e */
    public final Object m84906e(String str, xr01 xr01Var, hwv hwvVar, String str2, v311 v311Var, ibk ibkVar) {
        String str3 = hwvVar.f96056a;
        String str4 = str3 == null ? str : str3;
        a081 a081Var = hwvVar.f96057b;
        if ((a081Var instanceof zz71) && (a081Var instanceof zz71) && ((zz71) a081Var).f287907a && (str2 == null || str2.length() == 0)) {
            return kk40.m56684z(new u811(1, str4, null, xr01Var, v311Var, this), ibkVar);
        }
        return kk40.m56684z(new vns0((Object) v311Var, (Object) this, str4, (Object) str2, (Object) xr01Var, (Object) hwvVar, (fbk) null, 14), ibkVar);
    }
}
