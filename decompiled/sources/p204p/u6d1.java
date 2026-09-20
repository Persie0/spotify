package p204p;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class u6d1 implements w1j0, cy51 {
    public u6d1(oyy0 oyy0Var) {
    }

    @Override // p204p.cy51
    /* JADX INFO: renamed from: d */
    public y7h1 mo27672d(Object obj) {
        return bga.m29102x((Boolean) obj);
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        Map mapM56705r0;
        String dataString = intent.getDataString();
        if (dataString != null) {
            Uri uri = Uri.parse(dataString);
            if (uri.isHierarchical()) {
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                int iM31820L = c95.m31820L(i6f.m49804T(queryParameterNames, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                mapM56705r0 = new LinkedHashMap(iM31820L);
                for (Object obj : queryParameterNames) {
                    String queryParameter = uri.getQueryParameter((String) obj);
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    mapM56705r0.put(obj, queryParameter);
                }
            } else {
                int iM88457G0 = wl51.m88457G0(dataString, '?', 0, 6);
                if (iM88457G0 == -1) {
                    mapM56705r0 = nau.f152117a;
                } else {
                    List listM88476Z0 = wl51.m88476Z0(dataString.substring(iM88457G0 + 1), new char[]{'&'}, 6);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listM88476Z0.iterator();
                    while (it.hasNext()) {
                        List listM88476Z1 = wl51.m88476Z0((String) it.next(), new char[]{'='}, 2);
                        pqm0 pqm0Var = listM88476Z1.size() == 2 ? new pqm0(listM88476Z1.get(0), listM88476Z1.get(1)) : null;
                        if (pqm0Var != null) {
                            arrayList.add(pqm0Var);
                        }
                    }
                    mapM56705r0 = kkc0.m56705r0(arrayList);
                }
            }
        } else {
            mapM56705r0 = null;
        }
        String str = mapM56705r0 != null ? (String) mapM56705r0.get("redirectUri") : null;
        if (str == null) {
            return p1j0.f173119a;
        }
        intent.setData(Uri.parse(str));
        return new q1j0(intent);
    }
}
