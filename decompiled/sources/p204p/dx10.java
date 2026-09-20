package p204p;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class dx10 {

    /* JADX INFO: renamed from: j */
    public static final String f53819j;

    /* JADX INFO: renamed from: k */
    public static final Pattern f53820k;

    /* JADX INFO: renamed from: l */
    public static volatile String f53821l;

    /* JADX INFO: renamed from: a */
    public final C1893gd f53822a;

    /* JADX INFO: renamed from: b */
    public final String f53823b;

    /* JADX INFO: renamed from: c */
    public JSONObject f53824c;

    /* JADX INFO: renamed from: d */
    public Bundle f53825d;

    /* JADX INFO: renamed from: e */
    public String f53826e;

    /* JADX INFO: renamed from: f */
    public final String f53827f;

    /* JADX INFO: renamed from: g */
    public zw10 f53828g;

    /* JADX INFO: renamed from: h */
    public eh30 f53829h;

    /* JADX INFO: renamed from: i */
    public boolean f53830i;

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < iNextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        f53819j = sb.toString();
        f53820k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public dx10(C1893gd c1893gd, String str, Bundle bundle, eh30 eh30Var, zw10 zw10Var, int i) {
        zw10Var = (i & 16) != 0 ? null : zw10Var;
        this.f53822a = c1893gd;
        this.f53823b = str;
        this.f53827f = null;
        m37186i(zw10Var);
        this.f53829h = eh30Var == null ? eh30.f59473a : eh30Var;
        if (bundle != null) {
            this.f53825d = new Bundle(bundle);
        } else {
            this.f53825d = new Bundle();
        }
        this.f53827f = p8y.m69346d();
    }

    /* JADX INFO: renamed from: f */
    public static String m37178f() {
        String strM69344b = p8y.m69344b();
        zn91.m96564m0();
        String str = p8y.f175087h;
        if (str == null) {
            throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        if (strM69344b.length() <= 0 || str.length() <= 0) {
            return null;
        }
        return strM69344b + '|' + str;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX INFO: renamed from: a */
    public final void m37179a() {
        Bundle bundle = this.f53825d;
        String strM37183e = m37183e();
        boolean zM88496t0 = strM37183e != null ? wl51.m88496t0(strM37183e, "|", false) : false;
        if (strM37183e == null || !bm51.m29803n0(strM37183e, "IG", false) || zM88496t0 || !m37185h()) {
            if ((wj50.m88271j(p8y.m69347e(), "instagram.com") ? true ^ m37185h() : true) || zM88496t0) {
                String strM37183e2 = m37183e();
                if (strM37183e2 != null) {
                    bundle.putString("access_token", strM37183e2);
                }
            } else {
                bundle.putString("access_token", m37178f());
            }
        } else {
            bundle.putString("access_token", m37178f());
        }
        if (!bundle.containsKey("access_token")) {
            p8y p8yVar = p8y.f175080a;
            zn91.m96564m0();
            if (p8y.f175087h == null) {
                throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        HashSet hashSet = p8y.f175081b;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m37180b(String str, boolean z) {
        if (!z && this.f53829h == eh30.f59474b) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f53825d.keySet()) {
            Object obj = this.f53825d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (hvi0.m48879o(obj)) {
                builderBuildUpon.appendQueryParameter(str2, hvi0.m48871e(obj).toString());
            } else if (this.f53829h != eh30.f59473a) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
            }
        }
        return builderBuildUpon.toString();
    }

    /* JADX INFO: renamed from: c */
    public final gx10 m37181c() {
        ArrayList arrayListM48875k = hvi0.m48875k(new fx10(bk5.m29620k1(new dx10[]{this})));
        if (arrayListM48875k.size() == 1) {
            return (gx10) arrayListM48875k.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    /* JADX INFO: renamed from: d */
    public final ex10 m37182d() {
        fx10 fx10Var = new fx10(bk5.m29620k1(new dx10[]{this}));
        zn91.m96546d0(fx10Var);
        ex10 ex10Var = new ex10(fx10Var);
        ex10Var.executeOnExecutor(p8y.m69345c(), new Void[0]);
        return ex10Var;
    }

    /* JADX INFO: renamed from: e */
    public final String m37183e() {
        C1893gd c1893gd = this.f53822a;
        if (c1893gd != null) {
            if (!this.f53825d.containsKey("access_token")) {
                String str = c1893gd.f78686e;
                tra0.f223025b.m51337u(str);
                return str;
            }
        } else if (!this.f53825d.containsKey("access_token")) {
            return m37178f();
        }
        return this.f53825d.getString("access_token");
    }

    /* JADX INFO: renamed from: g */
    public final String m37184g(String str) {
        if (!(wj50.m88271j(p8y.m69347e(), "instagram.com") ? true ^ m37185h() : true)) {
            str = yjg1.m93920l();
        }
        Pattern pattern = f53820k;
        String str2 = this.f53823b;
        if (!pattern.matcher(str2).matches()) {
            str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f53827f, str2}, 2));
        }
        return String.format("%s/%s", Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    /* JADX INFO: renamed from: h */
    public final boolean m37185h() {
        String str = this.f53823b;
        if (str == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("^/?");
        sb.append(p8y.m69344b());
        sb.append("/?.*");
        return this.f53830i || Pattern.matches(sb.toString(), str) || Pattern.matches("^/?app/?.*", str);
    }

    /* JADX INFO: renamed from: i */
    public final void m37186i(zw10 zw10Var) {
        HashSet hashSet = p8y.f175081b;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
        this.f53828g = zw10Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.f53822a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f53823b);
        sb.append(", graphObject: ");
        sb.append(this.f53824c);
        sb.append(", httpMethod: ");
        sb.append(this.f53829h);
        sb.append(", parameters: ");
        sb.append(this.f53825d);
        sb.append("}");
        return sb.toString();
    }
}
