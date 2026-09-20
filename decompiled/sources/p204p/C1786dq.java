package p204p;

import android.content.Context;
import android.content.SharedPreferences;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: p.dq */
/* JADX INFO: loaded from: classes17.dex */
public final class C1786dq {

    /* JADX INFO: renamed from: a */
    public final Context f51769a;

    /* JADX INFO: renamed from: b */
    public final am60 f51770b;

    /* JADX INFO: renamed from: c */
    public final C2141mv f51771c;

    /* JADX INFO: renamed from: d */
    public final luk f51772d;

    /* JADX INFO: renamed from: e */
    public final long f51773e;

    /* JADX INFO: renamed from: f */
    public final boolean f51774f;

    /* JADX INFO: renamed from: g */
    public final wg61 f51775g = new wg61(new C2658zp(this));

    /* JADX INFO: renamed from: h */
    public final wg61 f51776h = new wg61(new C2346rp(this));

    public C1786dq(Context context, am60 am60Var, C2141mv c2141mv, luk lukVar, long j, boolean z) {
        this.f51769a = context;
        this.f51770b = am60Var;
        this.f51771c = c2141mv;
        this.f51772d = lukVar;
        this.f51773e = j;
        this.f51774f = z;
    }

    /* JADX INFO: renamed from: e */
    public static void m36589e(Exception exc, String str) {
        if (exc.getMessage() == null) {
            exc = new Exception(str);
        }
        String message = exc.getMessage();
        if (message != null) {
            Logger.m3967c(exc, str + ": " + message, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1993iw m36590a(String str, String str2) {
        if (str2 != null) {
            try {
                return ((C2271pw) this.f51775g.getValue()).m71207a(str2);
            } catch (IOException e) {
                na6.m63972t("Could not deserialize stored account", e);
                m36594f(str);
                Logger.m3967c(e, "AccountSwitching: Could not read user info for ".concat(str), new Object[0]);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final SharedPreferences m36591b() {
        return (SharedPreferences) this.f51776h.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final List m36592c() {
        return m36593d(this.f51774f ? m36591b() : (SharedPreferences) x0h1.m89581x(dau.f47107a, new C1714bq(this, x0h1.m89574q(kk40.m56661c(this.f51772d), null, 0, new C1750cq(this, null), 3), null)));
    }

    /* JADX INFO: renamed from: d */
    public final List m36593d(SharedPreferences sharedPreferences) {
        Map<String, ?> all;
        if (sharedPreferences == null || (all = sharedPreferences.getAll()) == null) {
            return lau.f131415a;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            C1993iw c1993iwM36590a = m36590a(key, value instanceof String ? (String) value : null);
            if (c1993iwM36590a != null) {
                arrayList.add(c1993iwM36590a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final void m36594f(String str) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorRemove;
        SharedPreferences sharedPreferencesM36591b = m36591b();
        if (sharedPreferencesM36591b == null || (editorEdit = sharedPreferencesM36591b.edit()) == null || (editorRemove = editorEdit.remove(str)) == null) {
            return;
        }
        editorRemove.apply();
    }

    /* JADX INFO: renamed from: g */
    public final int m36595g() {
        Map<String, ?> all;
        SharedPreferences sharedPreferencesM36591b = m36591b();
        if (sharedPreferencesM36591b == null || (all = sharedPreferencesM36591b.getAll()) == null) {
            return 0;
        }
        return all.size();
    }
}
