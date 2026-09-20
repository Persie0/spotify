package p204p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MenuItem;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import com.facebook.FacebookException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p196j$.net.URLDecoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0b1 {

    /* JADX INFO: renamed from: a */
    public static volatile int f148968a = 0;

    /* JADX INFO: renamed from: b */
    public static volatile long f148969b = -1;

    /* JADX INFO: renamed from: c */
    public static volatile long f148970c = -1;

    /* JADX INFO: renamed from: d */
    public static volatile long f148971d = -1;

    /* JADX INFO: renamed from: e */
    public static volatile String f148972e = "";

    /* JADX INFO: renamed from: f */
    public static volatile String f148973f = "";

    /* JADX INFO: renamed from: g */
    public static volatile String f148974g = "NoCarrier";

    /* JADX INFO: renamed from: h */
    public static volatile String f148975h = "";

    /* JADX INFO: renamed from: i */
    public static volatile Locale f148976i;

    /* JADX INFO: renamed from: A */
    public static final ArrayList m63342A(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    public static final HashMap m63343B(String str) {
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* JADX INFO: renamed from: C */
    public static final String m63344C(Map map) {
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m63345D(Context context) {
        AutofillManager autofillManagerM64313f;
        return Build.VERSION.SDK_INT >= 26 && (autofillManagerM64313f = C2162nf.m64313f(context.getSystemService(C2162nf.m64314g()))) != null && autofillManagerM64313f.isAutofillSupported() && autofillManagerM64313f.isEnabled();
    }

    /* JADX INFO: renamed from: E */
    public static final Bundle m63346E(String str) {
        Bundle bundle = new Bundle();
        if (!m63385y(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            for (String str2 : (String[]) wl51.m88477a1(str, new String[]{"&"}, 0, 6).toArray(new String[0])) {
                String[] strArr = (String[]) wl51.m88477a1(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), URLDecoder.decode(strArr[1], "UTF-8"));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException unused) {
                    p8y p8yVar = p8y.f175080a;
                }
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public static final void m63347F(Bundle bundle, JSONArray jSONArray) {
        if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) jSONArray);
            return;
        }
        if (jSONArray instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) jSONArray);
            return;
        }
        if (jSONArray instanceof int[]) {
            bundle.putIntArray("media", (int[]) jSONArray);
        } else if (jSONArray instanceof long[]) {
            bundle.putLongArray("media", (long[]) jSONArray);
        } else {
            bundle.putString("media", jSONArray.toString());
        }
    }

    /* JADX INFO: renamed from: G */
    public static final HashMap m63348G(Parcel parcel) {
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (string != null && string2 != null) {
                map.put(string, string2);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: H */
    public static final String m63349H(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(inputStream));
        try {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int i = inputStreamReader.read(cArr);
                if (i == -1) {
                    String string = sb.toString();
                    inputStreamReader.close();
                    return string;
                }
                sb.append(cArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n0e1.m63430g(inputStreamReader, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static Intent m63350I(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler, int i) {
        return (i & 4) != 0 ? context.registerReceiver(broadcastReceiver, intentFilter, lzj.m60341S(context), handler) : context.registerReceiver(broadcastReceiver, intentFilter, null, handler, i & 1);
    }

    /* JADX INFO: renamed from: J */
    public static void m63351J(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    /* JADX INFO: renamed from: K */
    public static final void m63352K(JSONObject jSONObject, Context context) throws JSONException {
        Locale locale;
        int i;
        int i2;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        int i3 = 0;
        if (f148969b == -1 || System.currentTimeMillis() - f148969b >= 1800000) {
            f148969b = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                f148972e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                f148973f = timeZone.getID();
            } catch (AssertionError unused) {
            } catch (Exception unused2) {
                p8y p8yVar = p8y.f175080a;
            }
            if (f148974g.equals("NoCarrier")) {
                try {
                    f148974g = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
                } catch (Exception unused3) {
                    p8y p8yVar2 = p8y.f175080a;
                }
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f148970c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
                }
                f148970c = Math.round(f148970c / 1.073741824E9d);
            } catch (Exception unused4) {
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f148971d = ((long) statFs2.getAvailableBlocks()) * ((long) statFs2.getBlockSize());
                }
                f148971d = Math.round(f148971d / 1.073741824E9d);
            } catch (Exception unused5) {
            }
        }
        String packageName = context.getPackageName();
        int i4 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i4 = packageInfo.versionCode;
            f148975h = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused6) {
        }
        jSONArray.put(packageName);
        jSONArray.put(i4);
        jSONArray.put(f148975h);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().getLocales().get(0);
        } catch (Exception unused7) {
            locale = Locale.getDefault();
        }
        f148976i = locale;
        StringBuilder sb = new StringBuilder();
        Locale locale2 = f148976i;
        String language = locale2 != null ? locale2.getLanguage() : null;
        if (language == null) {
            language = "";
        }
        sb.append(language);
        sb.append('_');
        Locale locale3 = f148976i;
        String country = locale3 != null ? locale3.getCountry() : null;
        sb.append(country != null ? country : "");
        jSONArray.put(sb.toString());
        jSONArray.put(f148972e);
        jSONArray.put(f148974g);
        double d = 0.0d;
        try {
            Object systemService = context.getSystemService("display");
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                int i5 = displayMetrics.widthPixels;
                try {
                    i3 = displayMetrics.heightPixels;
                    d = displayMetrics.density;
                } catch (Exception unused8) {
                }
                i = i3;
                i3 = i5;
            } else {
                i = 0;
            }
        } catch (Exception unused9) {
        }
        jSONArray.put(i3);
        jSONArray.put(i);
        jSONArray.put(new DecimalFormat("#.##").format(d));
        if (f148968a > 0) {
            i2 = f148968a;
        } else {
            try {
                File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new l4l(5));
                if (fileArrListFiles != null) {
                    f148968a = fileArrListFiles.length;
                }
            } catch (Exception unused10) {
                p8y p8yVar3 = p8y.f175080a;
            }
            if (f148968a <= 0) {
                f148968a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
            }
            i2 = f148968a;
        }
        jSONArray.put(i2);
        jSONArray.put(f148970c);
        jSONArray.put(f148971d);
        jSONArray.put(f148973f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    /* JADX INFO: renamed from: L */
    public static void m63353L(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: M */
    public static void m63354M(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    /* JADX INFO: renamed from: N */
    public static void m63355N(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    /* JADX INFO: renamed from: O */
    public static void m63356O(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    /* JADX INFO: renamed from: P */
    public static void m63357P(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    /* JADX INFO: renamed from: Q */
    public static final String m63358Q(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(vuc.f244913a);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString((b >> 4) & 15));
                sb.append(Integer.toHexString(b & 15));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m63359R(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    /* JADX INFO: renamed from: S */
    public static final void m63360S(Parcel parcel, Map map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        Iterator itM91403l = xl81.m91403l(parcel, map);
        while (itM91403l.hasNext()) {
            Map.Entry entry = (Map.Entry) itM91403l.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Uri m63361a(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(pka1.f178421b);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: b */
    public static void m63362b(String str) {
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : (String[]) wl51.m88477a1(cookie, new String[]{";"}, 0, 6).toArray(new String[0])) {
            String[] strArr = (String[]) wl51.m88477a1(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = wj50.m88282u(str3.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                sb.append(str3.subSequence(i, length + 1).toString());
                sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb.toString());
            }
        }
        cookieManager.flush();
    }

    /* JADX INFO: renamed from: c */
    public static final void m63363c(Context context) {
        try {
            m63362b("facebook.com");
            m63362b(".facebook.com");
            m63362b("https://facebook.com");
            m63362b("https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m63364d(String str) {
        return m63385y(str) ? "" : str;
    }

    /* JADX INFO: renamed from: e */
    public static final HashSet m63365e(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: f */
    public static final ArrayList m63366f(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: g */
    public static final HashMap m63367g(JSONObject jSONObject) {
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArrayNames.getString(i);
                    Object objM63367g = jSONObject.get(string);
                    if (objM63367g instanceof JSONObject) {
                        objM63367g = m63367g((JSONObject) objM63367g);
                    }
                    map.put(string, objM63367g);
                } catch (JSONException unused) {
                    p8y p8yVar = p8y.f175080a;
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: h */
    public static final HashMap m63368h(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null) {
                map.put(next, strOptString);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: i */
    public static final int m63369i(InputStream inputStream, FilterOutputStream filterOutputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byte[] bArr = new byte[8192];
            int i = 0;
            while (true) {
                int i2 = bufferedInputStream.read(bArr);
                if (i2 == -1) {
                    bufferedInputStream.close();
                    return i;
                }
                filterOutputStream.write(bArr, 0, i2);
                i += i2;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n0e1.m63430g(bufferedInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m63370j(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* JADX INFO: renamed from: k */
    public static final String m63371k(Context context) {
        if (context == null) {
            return "null";
        }
        return context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: l */
    public static final int m63372l(Bitmap bitmap) {
        int i;
        if (bitmap.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            Bitmap.Config config = bitmap.getConfig();
            if (config == Bitmap.Config.ALPHA_8) {
                i = 1;
            } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                i = 2;
            } else {
                i = (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
            }
            return height * i;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final String m63373m(Context context) {
        try {
            p8y p8yVar = p8y.f175080a;
            zn91.m96564m0();
            String str = p8y.f175084e;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Date m63374n(Bundle bundle, String str, Date date) {
        long jLongValue;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            jLongValue = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                jLongValue = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (jLongValue == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((jLongValue * 1000) + date.getTime());
    }

    /* JADX INFO: renamed from: o */
    public static final JSONObject m63375o() {
        if (p2l.f173365a.contains(n0b1.class)) {
            return null;
        }
        try {
            String string = p8y.m69343a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                    p8y p8yVar = p8y.f175080a;
                }
            }
            return null;
        } catch (Throwable th) {
            p2l.m68953a(n0b1.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static dx10 m63376p(String str) {
        String str2;
        Bundle bundle = new Bundle();
        Date date = C1893gd.f78679Y;
        C1893gd c1893gdM67200x = okg1.m67200x();
        if (c1893gdM67200x == null || (str2 = c1893gdM67200x.f78681X) == null) {
            str2 = "facebook";
        }
        bundle.putString("fields", str2.equals("instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", str);
        dx10 dx10Var = new dx10(null, "me", null, null, new f95(1), 32);
        dx10Var.f53825d = bundle;
        dx10Var.f53829h = eh30.f59473a;
        return dx10Var;
    }

    /* JADX INFO: renamed from: q */
    public static final Method m63377q(String str, String str2, Class... clsArr) {
        try {
            Class<?> cls = Class.forName(str);
            Class[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
            return cls.getMethod(str2, (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public static final Object m63378r(String str, String str2, JSONObject jSONObject) throws JSONException {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, objOpt);
        return jSONObject2;
    }

    /* JADX INFO: renamed from: s */
    public static final Object m63379s(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m63380t() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("fb%s://applinks", Arrays.copyOf(new Object[]{p8y.m69344b()}, 1))));
            Context contextM69343a = p8y.m69343a();
            PackageManager packageManager = contextM69343a.getPackageManager();
            String packageName = contextM69343a.getPackageName();
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                if (wj50.m88271j(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m63381u(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        return str != null && Pattern.compile(".+_cheets|cheets_.+").matcher(str).matches();
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m63382v() {
        if (!p2l.f173365a.contains(n0b1.class)) {
            try {
                JSONObject jSONObjectM63375o = m63375o();
                if (jSONObjectM63375o != null) {
                    try {
                        JSONArray jSONArray = jSONObjectM63375o.getJSONArray("data_processing_options");
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            if (jSONArray.getString(i).toLowerCase().equals("ldu")) {
                                return true;
                            }
                        }
                    } catch (Exception unused) {
                        p8y p8yVar = p8y.f175080a;
                    }
                }
            } catch (Throwable th) {
                p2l.m68953a(n0b1.class, th);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m63383w(Context context) {
        Method methodM63377q = m63377q("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodM63377q != null) {
            Object objM63379s = m63379s(null, methodM63377q, context);
            if ((objM63379s instanceof Integer) && objM63379s.equals(0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m63384x(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m63385y(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m63386z(Uri uri) {
        if (uri != null) {
            return "http".equalsIgnoreCase(uri.getScheme()) || pka1.f178421b.equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme());
        }
        return false;
    }
}
