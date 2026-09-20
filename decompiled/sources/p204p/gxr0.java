package p204p;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxr0 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f85326a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static final JSONObject m46116a(String str) {
        return (JSONObject) f85326a.get(str);
    }
}
