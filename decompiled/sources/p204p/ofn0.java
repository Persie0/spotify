package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ofn0 {

    /* JADX INFO: renamed from: f */
    public static final fv31 f164867f;

    /* JADX INFO: renamed from: g */
    public static final fv31 f164868g;

    /* JADX INFO: renamed from: h */
    public static final fv31 f164869h;

    /* JADX INFO: renamed from: i */
    public static final fv31 f164870i;

    /* JADX INFO: renamed from: a */
    public final hv31 f164871a;

    /* JADX INFO: renamed from: b */
    public final xre f164872b;

    /* JADX INFO: renamed from: c */
    public final fk60 f164873c;

    /* JADX INFO: renamed from: d */
    public final pn80 f164874d;

    /* JADX INFO: renamed from: e */
    public final mj5 f164875e;

    static {
        si5 si5Var = fv31.f73628b;
        f164867f = si5Var.m78183U("payment_success_urls");
        f164868g = si5Var.m78183U("payment_cancel_urls");
        f164869h = si5Var.m78183U("payment_pending_error_timestamp");
        f164870i = si5Var.m78183U("payment_selected_painted_door_methods");
    }

    public ofn0(hv31 hv31Var, xre xreVar, fk60 fk60Var) {
        this.f164871a = hv31Var;
        this.f164872b = xreVar;
        this.f164873c = fk60Var;
        ql51 ql51Var = ql51.f189738a;
        this.f164874d = new pn80(ql51Var, ska1.Companion.serializer());
        this.f164875e = new mj5(ql51Var, 1);
    }

    /* JADX INFO: renamed from: a */
    public final Map m66855a(fv31 fv31Var) {
        Map map;
        String strMo48710e = this.f164871a.mo48710e(fv31Var, "{}");
        if (strMo48710e != null) {
            try {
                map = (Map) this.f164873c.m41880a(strMo48710e, this.f164874d);
            } catch (Exception e) {
                Logger.m3967c(e, "Invalid JSON in URLs prefs: %s", strMo48710e);
                map = null;
            }
            if (map != null) {
                return map;
            }
        }
        return nau.f152117a;
    }

    /* JADX INFO: renamed from: b */
    public final Set m66856b() {
        Set set = null;
        String strMo48710e = this.f164871a.mo48710e(f164870i, null);
        if (strMo48710e != null) {
            try {
                set = (Set) this.f164873c.m41880a(strMo48710e, this.f164875e);
            } catch (Exception e) {
                Logger.m3967c(e, "Invalid JSON in painted door providers prefs: %s", strMo48710e);
            }
            if (set != null) {
                return set;
            }
        }
        return gbu.f78413a;
    }

    /* JADX INFO: renamed from: c */
    public final void m66857c(String str, String str2) {
        fv31 fv31Var = f164868g;
        LinkedHashMap linkedHashMapM56709v0 = kkc0.m56709v0(m66855a(fv31Var));
        linkedHashMapM56709v0.entrySet().removeIf(new nfn0(this));
        ((wy3) this.f164872b).getClass();
        linkedHashMapM56709v0.put(str, new ska1(str, str2, System.currentTimeMillis()));
        lv31 lv31VarEdit = this.f164871a.edit();
        lv31VarEdit.m60051d(fv31Var, this.f164873c.m41881b(this.f164874d, linkedHashMapM56709v0));
        lv31VarEdit.m60054g();
    }

    /* JADX INFO: renamed from: d */
    public final void m66858d(String str, String str2) {
        fv31 fv31Var = f164867f;
        LinkedHashMap linkedHashMapM56709v0 = kkc0.m56709v0(m66855a(fv31Var));
        linkedHashMapM56709v0.entrySet().removeIf(new nfn0(this));
        ((wy3) this.f164872b).getClass();
        linkedHashMapM56709v0.put(str, new ska1(str, str2, System.currentTimeMillis()));
        lv31 lv31VarEdit = this.f164871a.edit();
        lv31VarEdit.m60051d(fv31Var, this.f164873c.m41881b(this.f164874d, linkedHashMapM56709v0));
        lv31VarEdit.m60054g();
    }
}
