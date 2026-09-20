package p204p;

import android.net.nsd.NsdServiceInfo;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class tvx {

    /* JADX INFO: renamed from: a */
    public static final List f224267a = Collections.singletonList("token");

    /* JADX INFO: renamed from: a */
    public static final boolean m81619a(NsdServiceInfo nsdServiceInfo) {
        Map<String, byte[]> attributes = nsdServiceInfo.getAttributes();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, byte[]> entry : attributes.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List list = f224267a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!linkedHashMap.containsKey((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final nmr m81620b(NsdServiceInfo nsdServiceInfo) {
        if (!m81619a(nsdServiceInfo)) {
            na6.m63957e("Discovered malformed mDNS broadcast");
            return null;
        }
        Map<String, byte[]> attributes = nsdServiceInfo.getAttributes();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, byte[]> entry : attributes.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new nmr(new String((byte[]) kkc0.m56692e0("token", linkedHashMap), StandardCharsets.UTF_8));
    }
}
