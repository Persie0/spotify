package p204p;

import android.content.Context;
import android.content.SharedPreferences;
import java.nio.charset.Charset;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jv31 implements wb11 {

    /* JADX INFO: renamed from: c */
    public static final HashMap f116237c = new HashMap(4);

    /* JADX INFO: renamed from: d */
    public static final utu0 f116238d = new utu0(25);

    /* JADX INFO: renamed from: a */
    public final h15 f116239a;

    /* JADX INFO: renamed from: b */
    public final boolean f116240b;

    public jv31(h15 h15Var, boolean z) {
        this.f116239a = h15Var;
        this.f116240b = z;
    }

    @Override // p204p.wb11
    /* JADX INFO: renamed from: a */
    public final hv31 mo35841a(Context context) {
        return m54360d(context);
    }

    @Override // p204p.wb11
    /* JADX INFO: renamed from: b */
    public final hv31 mo35842b(Context context, String str) {
        rv31 rv31Var;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        HashMap map = f116237c;
        synchronized (map) {
            try {
                Object sharedPreferences = map.get(str);
                if (sharedPreferences == null) {
                    Context applicationContext = context.getApplicationContext();
                    int i = yd20.f271624a;
                    sharedPreferences = applicationContext.getSharedPreferences("user-".concat(wd20.f250193a.m93079p(str, Charset.defaultCharset()).toString()), 0);
                    map.put(str, sharedPreferences);
                }
                rv31Var = new rv31(new iv31((SharedPreferences) sharedPreferences, 1), m54360d(context), this.f116239a, this.f116240b, f116238d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return rv31Var;
    }

    @Override // p204p.wb11
    /* JADX INFO: renamed from: c */
    public final hv31 mo35843c(Context context) {
        return m54360d(context);
    }

    /* JADX INFO: renamed from: d */
    public final mv31 m54360d(Context context) {
        mv31 mv31Var;
        HashMap map = f116237c;
        synchronized (map) {
            try {
                Object sharedPreferences = map.get("spotify_preferences");
                if (sharedPreferences == null) {
                    sharedPreferences = context.getSharedPreferences("spotify_preferences", 0);
                    map.put("spotify_preferences", sharedPreferences);
                }
                mv31Var = new mv31(new iv31((SharedPreferences) sharedPreferences, 0), this.f116239a, this.f116240b, f116238d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return mv31Var;
    }
}
