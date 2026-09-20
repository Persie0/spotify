package p204p;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class yhc1 {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f272814e = 0;

    /* JADX INFO: renamed from: b */
    public final WeakReference f272816b;

    /* JADX INFO: renamed from: c */
    public Timer f272817c;

    /* JADX INFO: renamed from: d */
    public String f272818d = null;

    /* JADX INFO: renamed from: a */
    public final Handler f272815a = new Handler(Looper.getMainLooper());

    public yhc1(Activity activity) {
        this.f272816b = new WeakReference(activity);
    }

    /* JADX INFO: renamed from: a */
    public static final void m93635a() {
        p2l.f173365a.contains(yhc1.class);
    }

    /* JADX INFO: renamed from: b */
    public final void m93636b(dx10 dx10Var, String str) {
        Set set = p2l.f173365a;
        if (set.contains(this) || dx10Var == null) {
            return;
        }
        try {
            gx10 gx10VarM37181c = dx10Var.m37181c();
            try {
                JSONObject jSONObject = gx10VarM37181c.f85146b;
                if (jSONObject == null) {
                    Objects.toString(gx10VarM37181c.f85147c);
                    return;
                }
                if ("true".equals(jSONObject.optString("success"))) {
                    iq3 iq3Var = tra0.f223025b;
                    synchronized (p8y.f175081b) {
                    }
                    this.f272818d = str;
                }
                if (jSONObject.has("is_app_indexing_enabled")) {
                    boolean z = jSONObject.getBoolean("is_app_indexing_enabled");
                    if (set.contains(zwe.class)) {
                        return;
                    }
                    try {
                        zwe.f286970g.set(z);
                    } catch (Throwable th) {
                        p2l.m68953a(zwe.class, th);
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            p2l.m68953a(this, th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m93637c() {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            try {
                p8y.m69345c().execute(new b381(7, this, new xhc1(this, 0)));
            } catch (RejectedExecutionException unused) {
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }
}
