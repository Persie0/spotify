package p204p;

import android.os.Bundle;
import java.util.HashSet;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class ft8 {

    /* JADX INFO: renamed from: b */
    public static boolean f73133b;

    /* JADX INFO: renamed from: a */
    public static final ft8 f73132a = new ft8();

    /* JADX INFO: renamed from: c */
    public static HashSet f73134c = new HashSet();

    /* JADX INFO: renamed from: a */
    public static final void m42584a(Bundle bundle) {
        if (p2l.f173365a.contains(ft8.class)) {
            return;
        }
        try {
            if (f73133b && bundle != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : f73134c) {
                    if (bundle.containsKey(str)) {
                        bundle.remove(str);
                        jSONArray.put(str);
                    }
                }
                if (jSONArray.length() > 0) {
                    bundle.putString("_bannedParams", jSONArray.toString());
                }
            }
        } catch (Throwable th) {
            p2l.m68953a(ft8.class, th);
        }
    }
}
