package p204p;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.spotify.music.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p196j$.time.ZoneOffset;
import p196j$.time.format.DateTimeFormatter;
import p196j$.util.DateRetargetClass;

/* JADX INFO: loaded from: classes6.dex */
public final class j7v implements i7v, ymd1 {

    /* JADX INFO: renamed from: a */
    public final Object f109667a;

    public /* synthetic */ j7v(Object obj) {
        this.f109667a = obj;
    }

    @Override // p204p.ymd1
    /* JADX INFO: renamed from: L */
    public WebView mo2757L() {
        WebView webViewMo2757L = ((ymd1) this.f109667a).mo2757L();
        if (webViewMo2757L == null) {
            return null;
        }
        WebSettings settings = webViewMo2757L.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(false);
        if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(true);
        }
        return webViewMo2757L;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m52646a() {
        try {
            long j = ((SharedPreferences) this.f109667a).getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f109667a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.f109667a).getStringSet(key, new HashSet()));
            hashSet.remove(str);
            ((SharedPreferences) this.f109667a).edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m52647b() {
        ((AutofillManager) this.f109667a).commit();
    }

    /* JADX INFO: renamed from: c */
    public m200 m52648c() {
        Context context = (Context) this.f109667a;
        String string = context.getString(R.string.engage_clearing_notification_title);
        ktj0 ktj0Var = new ktj0(context, "CubesPublishing");
        ktj0Var.f126314e = ktj0.m57322d(string);
        ktj0Var.f126307D.icon = R.drawable.icn_notification;
        ktj0Var.f126308E = true;
        Notification notificationM57325c = ktj0Var.m57325c();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("CubesPublishing", context.getString(R.string.engage_notification_channel_name), 2));
        }
        return i >= 29 ? new m200(32543, notificationM57325c, 1) : new m200(32543, notificationM57325c, 0);
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m52649d() {
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f109667a).edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f109667a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strM52651f = m52651f(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strM52651f)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strM52651f);
                        i++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized ArrayList m52650e() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f109667a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(m52651f(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new z08(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                ((SharedPreferences) this.f109667a).edit().putLong("fire-global", jCurrentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public synchronized String m52651f(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* JADX INFO: renamed from: g */
    public synchronized String m52652g(String str) {
        for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f109667a).getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public void m52653h(oz3 oz3Var, int i, AutofillValue autofillValue) {
        ((AutofillManager) this.f109667a).notifyValueChanged(oz3Var, i, autofillValue);
    }

    /* JADX INFO: renamed from: i */
    public void m52654i(oz3 oz3Var, int i, Rect rect) {
        ((AutofillManager) this.f109667a).notifyViewEntered(oz3Var, i, rect);
    }

    /* JADX INFO: renamed from: j */
    public void m52655j(oz3 oz3Var, int i) {
        ((AutofillManager) this.f109667a).notifyViewExited(oz3Var, i);
    }

    /* JADX INFO: renamed from: k */
    public void m52656k(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            y58.m92843a(view, (AutofillManager) this.f109667a, i, z);
        }
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m52657l(String str) {
        try {
            String strM52652g = m52652g(str);
            if (strM52652g == null) {
                return;
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.f109667a).getStringSet(strM52652g, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                ((SharedPreferences) this.f109667a).edit().remove(strM52652g).commit();
            } else {
                ((SharedPreferences) this.f109667a).edit().putStringSet(strM52652g, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m52658m(oz3 oz3Var, int i, Rect rect) {
        ((AutofillManager) this.f109667a).requestAutofill(oz3Var, i, rect);
    }

    /* JADX INFO: renamed from: n */
    public synchronized boolean m52659n(long j) {
        if (!((SharedPreferences) this.f109667a).contains("fire-global")) {
            ((SharedPreferences) this.f109667a).edit().putLong("fire-global", j).commit();
            return true;
        }
        long j2 = ((SharedPreferences) this.f109667a).getLong("fire-global", -1L);
        synchronized (this) {
            if (m52651f(j2).equals(m52651f(j))) {
                return false;
            }
            ((SharedPreferences) this.f109667a).edit().putLong("fire-global", j).commit();
            return true;
        }
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m52660o(long j, String str) {
        String strM52651f = m52651f(j);
        if (((SharedPreferences) this.f109667a).getString("last-used-date", "").equals(strM52651f)) {
            String strM52652g = m52652g(strM52651f);
            if (strM52652g == null) {
                return;
            }
            if (strM52652g.equals(str)) {
                return;
            }
            m52661p(str, strM52651f);
            return;
        }
        long j2 = ((SharedPreferences) this.f109667a).getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            m52646a();
            j2 = ((SharedPreferences) this.f109667a).getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(((SharedPreferences) this.f109667a).getStringSet(str, new HashSet()));
        hashSet.add(strM52651f);
        ((SharedPreferences) this.f109667a).edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strM52651f).commit();
    }

    /* JADX INFO: renamed from: p */
    public synchronized void m52661p(String str, String str2) {
        m52657l(str2);
        HashSet hashSet = new HashSet(((SharedPreferences) this.f109667a).getStringSet(str, new HashSet()));
        hashSet.add(str2);
        ((SharedPreferences) this.f109667a).edit().putStringSet(str, hashSet).commit();
    }

    public j7v(Context context, String str) {
        this.f109667a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }
}
