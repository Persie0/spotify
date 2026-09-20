package p204p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jra {

    /* JADX INFO: renamed from: a */
    public static final HashMap f115123a;

    static {
        HashMap map = new HashMap();
        f115123a = map;
        map.put(Boolean.class, new ira(0));
        map.put(Integer.class, new ira(1));
        map.put(Long.class, new ira(2));
        map.put(Double.class, new ira(3));
        map.put(String.class, new ira(4));
        map.put(String[].class, new ira(5));
        map.put(JSONArray.class, new ira(6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final Bundle m54180a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (!(obj instanceof JSONObject)) {
                    ira iraVar = (ira) f115123a.get(obj.getClass());
                    if (iraVar == null) {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                    switch (iraVar.f104934a) {
                        case 0:
                            bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                            break;
                        case 1:
                            bundle.putInt(next, ((Integer) obj).intValue());
                            break;
                        case 2:
                            bundle.putLong(next, ((Long) obj).longValue());
                            break;
                        case 3:
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                            break;
                        case 4:
                            bundle.putString(next, (String) obj);
                            break;
                        case 5:
                            throw new IllegalArgumentException("Unexpected type from JSON");
                        default:
                            JSONArray jSONArray = (JSONArray) obj;
                            ArrayList arrayList = new ArrayList();
                            if (jSONArray.length() == 0) {
                                bundle.putStringArrayList(next, arrayList);
                            } else {
                                int length = jSONArray.length();
                                for (int i = 0; i < length; i++) {
                                    Object obj2 = jSONArray.get(i);
                                    if (!(obj2 instanceof String)) {
                                        throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                                    }
                                    arrayList.add(obj2);
                                }
                                bundle.putStringArrayList(next, arrayList);
                            }
                            break;
                    }
                } else {
                    bundle.putBundle(next, m54180a((JSONObject) obj));
                }
            }
        }
        return bundle;
    }
}
