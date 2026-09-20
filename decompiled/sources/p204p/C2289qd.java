package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: p.qd */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2289qd implements zw10 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f187432a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f187433b;

    public /* synthetic */ C2289qd(Object obj, int i) {
        this.f187432a = i;
        this.f187433b = obj;
    }

    @Override // p204p.zw10
    /* JADX INFO: renamed from: a */
    public final void mo41049a(gx10 gx10Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        switch (this.f187432a) {
            case 0:
                C2449ud c2449ud = (C2449ud) this.f187433b;
                JSONObject jSONObject3 = gx10Var.f85148d;
                if (jSONObject3 != null) {
                    c2449ud.f229148c = jSONObject3.optString("access_token");
                    c2449ud.f229147b = jSONObject3.optInt("expires_at");
                    c2449ud.f229150e = jSONObject3.optInt("expires_in");
                    c2449ud.f229151f = Long.valueOf(jSONObject3.optLong("data_access_expiration_time"));
                    c2449ud.f229149d = jSONObject3.optString("graph_domain", null);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f187433b;
                try {
                    if (gx10Var.f85147c == null && (jSONObject = gx10Var.f85148d) != null && jSONObject.getBoolean("success")) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            kxf1.m57617l(((cgw) it.next()).f37817a);
                        }
                        break;
                    }
                } catch (JSONException unused) {
                    return;
                }
                break;
            default:
                r150 r150Var = (r150) this.f187433b;
                try {
                    if (gx10Var.f85147c == null && (jSONObject2 = gx10Var.f85148d) != null && jSONObject2.getBoolean("success")) {
                        kxf1.m57617l(r150Var.f194766a);
                        break;
                    }
                } catch (JSONException unused2) {
                    return;
                }
                break;
        }
    }
}
