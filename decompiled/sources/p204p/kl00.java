package p204p;

import com.spotify.thestage.vtec.events.proto.VtecEvent;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class kl00 {

    /* JADX INFO: renamed from: a */
    public final String f123761a;

    /* JADX INFO: renamed from: b */
    public final String f123762b;

    /* JADX INFO: renamed from: c */
    public final long f123763c;

    /* JADX INFO: renamed from: d */
    public final qre0 f123764d;

    /* JADX INFO: renamed from: e */
    public final hk60 f123765e = new p0i0.C2237b().m68713e().m68703c(Map.class);

    public kl00(String str, String str2, long j, xre xreVar, qre0 qre0Var) {
        this.f123761a = str;
        this.f123762b = str2;
        this.f123763c = j;
        this.f123764d = qre0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m56793a(g6d1 g6d1Var) {
        LinkedHashMap linkedHashMap;
        pqm0 pqm0Var;
        h5d1 h5d1VarM21807t = VtecEvent.m21807t();
        h5d1VarM21807t.m46683t(this.f123761a);
        h5d1VarM21807t.m46682s(this.f123762b);
        h5d1VarM21807t.m46679m((System.currentTimeMillis() - this.f123763c) / ((double) 1000));
        h5d1VarM21807t.m46681r(g6d1Var.f77022c);
        Map map = g6d1Var.f77021b;
        if (map != null) {
            h5d1VarM21807t.m46680q(this.f123765e.toJson(map));
        }
        String str = g6d1Var.f77020a;
        if (str != null) {
            URI uri = new URI(str);
            String rawQuery = uri.getRawQuery();
            if (rawQuery != null) {
                List<String> listM88477a1 = wl51.m88477a1(rawQuery, new String[]{"&"}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (String str2 : listM88477a1) {
                    if (wl51.m88477a1(str2, new String[]{"="}, 0, 6).size() == 2) {
                        List listM88477a2 = wl51.m88477a1(str2, new String[]{"="}, 0, 6);
                        pqm0Var = new pqm0((String) listM88477a2.get(0), (String) listM88477a2.get(1));
                    } else {
                        pqm0Var = null;
                    }
                    if (pqm0Var != null) {
                        arrayList.add(pqm0Var);
                    }
                }
                linkedHashMap = new LinkedHashMap(kkc0.m56705r0(arrayList));
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.remove("utm_app_version");
            linkedHashMap.remove("utm_session_id");
            String strM43753y0 = g6f.m43753y0(linkedHashMap.entrySet(), "&", null, null, se00.f208136Z, 30);
            String strConcat = "";
            String strM38564m = wj50.m88271j(strM43753y0, "") ? "" : edb.m38564m("?", strM43753y0);
            String fragment = uri.getFragment();
            if (fragment != null && !bm51.m29803n0(fragment, "id_token", false)) {
                strConcat = "#".concat(fragment);
            }
            h5d1VarM21807t.m46684u(uri.getScheme() + "://" + uri.getAuthority() + uri.getPath() + strM38564m + strConcat);
        }
        VtecEvent vtecEvent = (VtecEvent) h5d1VarM21807t.build();
        Objects.toString(vtecEvent);
        this.f123764d.m73616a(vtecEvent);
    }
}
