package p204p;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b101 {

    /* JADX INFO: renamed from: a */
    public final nr6 f22162a;

    /* JADX INFO: renamed from: b */
    public final String f22163b;

    /* JADX INFO: renamed from: c */
    public ArrayList f22164c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f22165d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f22166e;

    public b101(nr6 nr6Var, String str) {
        this.f22162a = nr6Var;
        this.f22163b = str;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m27858a(v85 v85Var) {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            if (this.f22164c.size() + this.f22165d.size() >= 1000) {
                this.f22166e++;
            } else {
                this.f22164c.add(v85Var);
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m27859b(boolean z) {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        if (z) {
            try {
                this.f22164c.addAll(this.f22165d);
            } catch (Throwable th) {
                p2l.m68953a(this, th);
                return;
            }
        }
        this.f22165d.clear();
        this.f22166e = 0;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized List m27860c() {
        if (p2l.f173365a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = this.f22164c;
            this.f22164c = new ArrayList();
            return arrayList;
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m27861d(dx10 dx10Var, Context context, boolean z, boolean z2) {
        Throwable th;
        Throwable th2;
        if (p2l.f173365a.contains(this)) {
            return 0;
        }
        try {
            try {
                synchronized (this) {
                    try {
                        int i = this.f22166e;
                        z4x.m95380b(this.f22164c);
                        this.f22165d.addAll(this.f22164c);
                        this.f22164c.clear();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        for (v85 v85Var : this.f22165d) {
                            try {
                                if (z || !v85Var.f238384c) {
                                    jSONArray.put(v85Var.f238382a);
                                    jSONArray2.put(v85Var.f238383b);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        if (jSONArray.length() != 0) {
                            m27862e(dx10Var, context, i, jSONArray, jSONArray2, z2);
                            return jSONArray.length();
                        }
                        try {
                            return 0;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                    p2l.m68953a(this, th);
                    return 0;
                }
            } catch (Throwable th6) {
                th = th6;
                th = th;
            }
        } catch (Throwable th7) {
            th = th7;
            th = th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m27862e(dx10 dx10Var, Context context, int i, JSONArray jSONArray, JSONArray jSONArray2, boolean z) {
        JSONObject jSONObject;
        try {
            if (p2l.f173365a.contains(this)) {
                return;
            }
            try {
                jSONObject = p95.m69358a(o95.f162946b, this.f22162a, this.f22163b, z, context);
                if (this.f22166e > 0) {
                    jSONObject.put("num_skipped_events", i);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            dx10Var.f53824c = jSONObject;
            Bundle bundle = dx10Var.f53825d;
            String string = jSONArray.toString();
            bundle.putString("custom_events", string);
            if (hgy.m47481b(fgy.IapLoggingLib5To7)) {
                bundle.putString("operational_parameters", jSONArray2.toString());
            }
            dx10Var.f53826e = string;
            dx10Var.f53825d = bundle;
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }
}
