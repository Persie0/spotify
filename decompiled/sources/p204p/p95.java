package p204p;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p95 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f175155a = kkc0.m56693f0(new pqm0(o95.f162945a, "MOBILE_APP_INSTALL"), new pqm0(o95.f162946b, "CUSTOM_APP_EVENTS"));

    /* JADX INFO: renamed from: a */
    public static final JSONObject m69358a(o95 o95Var, nr6 nr6Var, String str, boolean z, Context context) throws JSONException {
        String strM63344C;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f175155a.get(o95Var));
        if (!pp3.f179880c) {
            pp3.m70502a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = pp3.f179878a;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str2 = pp3.f179879b;
            reentrantReadWriteLock.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            fgy fgyVar = fgy.ServiceUpdateCompliance;
            if (!hgy.m47481b(fgyVar)) {
                jSONObject.put("anon_id", str);
            }
            jSONObject.put("application_tracking_enabled", !z);
            p8y p8yVar = p8y.f175080a;
            jSONObject.put("advertiser_id_collection_enabled", dwa1.m37141b());
            String string = null;
            if (nr6Var != null) {
                if (hgy.m47481b(fgyVar) && (Build.VERSION.SDK_INT < 31 || !n0b1.m63383w(context) || !nr6Var.f157456e)) {
                    jSONObject.put("anon_id", str);
                }
                if (nr6Var.f157454c != null && (!hgy.m47481b(fgyVar) || Build.VERSION.SDK_INT < 31 || !n0b1.m63383w(context) || !nr6Var.f157456e)) {
                    jSONObject.put("attribution", nr6Var.f157454c);
                }
                if (nr6Var.m65469a() != null) {
                    jSONObject.put("advertiser_id", nr6Var.m65469a());
                    jSONObject.put("advertiser_tracking_enabled", !nr6Var.f157456e);
                }
                if (!nr6Var.f157456e) {
                    poa1 poa1Var = poa1.f179658a;
                    if (p2l.f173365a.contains(poa1.class)) {
                        strM63344C = null;
                    } else {
                        try {
                            if (!poa1.f179660c.get()) {
                                poa1Var.m70485b();
                            }
                            HashMap map = new HashMap();
                            map.putAll(poa1.f179661d);
                            map.putAll(poa1Var.m70484a());
                            strM63344C = n0b1.m63344C(map);
                        } catch (Throwable th) {
                            p2l.m68953a(poa1.class, th);
                            strM63344C = null;
                        }
                    }
                    if (strM63344C.length() != 0) {
                        jSONObject.put("ud", strM63344C);
                    }
                }
                String str3 = nr6Var.f157455d;
                if (str3 != null) {
                    jSONObject.put("installer_package", str3);
                }
            }
            cc5 cc5VarM28682i = cc5.f36311b.m28682i();
            if (cc5VarM28682i != null && !p2l.f173365a.contains(cc5VarM28682i)) {
                try {
                    string = cc5VarM28682i.m32208a().getString("campaign_ids", null);
                } catch (Throwable th2) {
                    p2l.m68953a(cc5VarM28682i, th2);
                }
            }
            if (string != null) {
                jSONObject.put("campaign_ids", string);
            }
            try {
                n0b1.m63352K(jSONObject, context);
            } catch (Exception e) {
                iq3 iq3Var = tra0.f223025b;
                e.toString();
                synchronized (p8y.f175081b) {
                }
            }
            JSONObject jSONObjectM63375o = n0b1.m63375o();
            if (jSONObjectM63375o != null) {
                Iterator<String> itKeys = jSONObjectM63375o.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectM63375o.get(next));
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th3) {
            pp3.f179878a.readLock().unlock();
            throw th3;
        }
    }
}
