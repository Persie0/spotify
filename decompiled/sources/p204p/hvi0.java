package p204p;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import com.comscore.util.log.LogLevel;
import com.facebook.FacebookException;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$APPermanentErrorResult;
import com.spotify.jam.internal.socialconnect.models.Session;
import com.spotify.jam.internal.socialconnect.models.SessionConfig;
import com.spotify.jam.internal.socialconnect.models.SessionConfiguration;
import com.spotify.jam.internal.socialconnect.models.SessionDeviceInfo;
import com.spotify.jam.internal.socialconnect.models.SessionMember;
import com.spotify.jam.internal.socialconnect.models.SessionOrigin;
import com.spotify.jam.internal.socialconnect.models.SessionUserCapabilities;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.zip.GZIPOutputStream;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p196j$.util.Base64;
import spotify.your_library.esperanto.proto.PinResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class hvi0 implements Function, Function3, Predicate, BiFunction, vja1, yua, hlc, vd50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95741a;

    /* JADX INFO: renamed from: b */
    public static final hvi0 f95732b = new hvi0(0);

    /* JADX INFO: renamed from: c */
    public static final hvi0 f95733c = new hvi0(1);

    /* JADX INFO: renamed from: d */
    public static final hvi0 f95734d = new hvi0(2);

    /* JADX INFO: renamed from: e */
    public static final hvi0 f95735e = new hvi0(3);

    /* JADX INFO: renamed from: f */
    public static final hvi0 f95736f = new hvi0(4);

    /* JADX INFO: renamed from: g */
    public static final hvi0 f95737g = new hvi0(5);

    /* JADX INFO: renamed from: h */
    public static final hvi0 f95738h = new hvi0(6);

    /* JADX INFO: renamed from: i */
    public static final hvi0 f95739i = new hvi0(7);

    /* JADX INFO: renamed from: t */
    public static final hvi0 f95740t = new hvi0(8);

    /* JADX INFO: renamed from: X */
    public static final hvi0 f95729X = new hvi0(9);

    /* JADX INFO: renamed from: Y */
    public static final hvi0 f95730Y = new hvi0(10);

    /* JADX INFO: renamed from: Z */
    public static final hvi0 f95731Z = new hvi0(11);

    /* JADX INFO: renamed from: L0 */
    public static final hvi0 f95723L0 = new hvi0(12);

    /* JADX INFO: renamed from: M0 */
    public static final hvi0 f95724M0 = new hvi0(13);

    /* JADX INFO: renamed from: N0 */
    public static final hvi0 f95725N0 = new hvi0(14);

    /* JADX INFO: renamed from: O0 */
    public static final hvi0 f95726O0 = new hvi0(17);

    /* JADX INFO: renamed from: P0 */
    public static final hvi0 f95727P0 = new hvi0(18);

    /* JADX INFO: renamed from: Q0 */
    public static final hvi0 f95728Q0 = new hvi0(19);

    public /* synthetic */ hvi0(int i) {
        this.f95741a = i;
    }

    /* JADX INFO: renamed from: A */
    public static oi31 m48862A(oi31 oi31Var) {
        return oi31.m67000b(oi31Var, true, 0L, null, false, false, false, false, false, false, false, null, null, null, false, 0, null, null, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -1154, 1);
    }

    /* JADX INFO: renamed from: B */
    public static void m48863B(fx10 fx10Var, ArrayList arrayList) {
        int size = fx10Var.f74220b.size();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < size; i++) {
            dx10 dx10Var = (dx10) fx10Var.f74220b.get(i);
            if (dx10Var.f53828g != null) {
                arrayList2.add(new Pair(dx10Var.f53828g, arrayList.get(i)));
            }
        }
        if (arrayList2.size() > 0) {
            zaz zazVar = new zaz(1, arrayList2, fx10Var);
            Handler handler = fx10Var.f74219a;
            if (handler != null) {
                handler.post(zazVar);
            } else {
                zazVar.run();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m48864C(HashMap map, oqb oqbVar) {
        for (Map.Entry entry : map.entrySet()) {
            String str = dx10.f53819j;
            if (m48878n(((yw10) entry.getValue()).m94774b())) {
                oqbVar.m67621h((String) entry.getKey(), ((yw10) entry.getValue()).m94774b(), ((yw10) entry.getValue()).m94773a());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX WARN: Code duplicated, block: B:75:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: D */
    public static void m48865D(HttpURLConnection httpURLConnection, fx10 fx10Var) throws Throwable {
        boolean z;
        Throwable th;
        FilterOutputStream filterOutputStream;
        FilterOutputStream gZIPOutputStream;
        eh30 eh30Var = eh30.f59474b;
        tra0 tra0Var = new tra0();
        zn91.m96548e0("Request", "tag");
        "FacebookSDK.".concat("Request");
        tra0Var.f223027a = new StringBuilder();
        int size = fx10Var.f74220b.size();
        Iterator<E> it = fx10Var.iterator();
        loop0: while (true) {
            z = false;
            if (!it.hasNext()) {
                z = true;
                break;
            }
            dx10 dx10Var = (dx10) it.next();
            Iterator<String> it2 = dx10Var.f53825d.keySet().iterator();
            while (it2.hasNext()) {
                if (m48878n(dx10Var.f53825d.get(it2.next()))) {
                    break loop0;
                }
            }
        }
        eh30 eh30Var2 = size == 1 ? ((dx10) fx10Var.f74220b.get(0)).f53829h : null;
        if (eh30Var2 == null) {
            eh30Var2 = eh30Var;
        }
        httpURLConnection.setRequestMethod(eh30Var2.name());
        if (z) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        } else {
            httpURLConnection.setRequestProperty("Content-Type", String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{dx10.f53819j}, 1)));
        }
        URL url = httpURLConnection.getURL();
        HashSet hashSet = p8y.f175081b;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
        httpURLConnection.getRequestMethod();
        synchronized (hashSet) {
        }
        httpURLConnection.getRequestProperty("User-Agent");
        tra0Var.m81342a();
        httpURLConnection.getRequestProperty("Content-Type");
        tra0Var.m81342a();
        httpURLConnection.setConnectTimeout(z);
        httpURLConnection.setReadTimeout(z);
        if (eh30Var2 != eh30Var) {
            tra0Var.f223027a.getClass();
            iq3.m51333t(hsa0.f94646a);
            tra0Var.f223027a = new StringBuilder();
            return;
        }
        httpURLConnection.setDoOutput(true);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            if (z) {
                try {
                    gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    filterOutputStream = bufferedOutputStream;
                    if (filterOutputStream != null) {
                        throw th;
                    }
                    filterOutputStream.close();
                    throw th;
                }
            } else {
                gZIPOutputStream = bufferedOutputStream;
            }
            try {
                for (C2411td c2411td : fx10Var.f74221c) {
                }
                Iterator<E> it3 = fx10Var.iterator();
                while (it3.hasNext()) {
                    zw10 zw10Var = ((dx10) it3.next()).f53828g;
                }
                m48890z(fx10Var, tra0Var, size, url, gZIPOutputStream, z);
                gZIPOutputStream.close();
                tra0Var.f223027a.getClass();
                iq3.m51333t(hsa0.f94646a);
                tra0Var.f223027a = new StringBuilder();
            } catch (Throwable th3) {
                th = th3;
                filterOutputStream = gZIPOutputStream;
                if (filterOutputStream != null) {
                    throw th;
                }
                filterOutputStream.close();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            filterOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: E */
    public static HttpURLConnection m48866E(fx10 fx10Var) throws Throwable {
        URL url;
        Iterator<E> it = fx10Var.iterator();
        ArrayList arrayList = fx10Var.f74220b;
        while (it.hasNext()) {
            dx10 dx10Var = (dx10) it.next();
            if (eh30.f59473a == dx10Var.f53829h && n0b1.m63385y(dx10Var.f53825d.getString("fields"))) {
                iq3 iq3Var = tra0.f223025b;
                iq3.m51333t(hsa0.f94649d);
            }
        }
        try {
            if (arrayList.size() == 1) {
                dx10 dx10Var2 = (dx10) arrayList.get(0);
                String str = dx10Var2.f53823b;
                String strM37184g = dx10Var2.m37184g((dx10Var2.f53829h == eh30.f59474b && str != null && bm51.m29796g0(str, "/videos", false)) ? yjg1.m93923o() : yjg1.m93922n(p8y.m69347e()));
                dx10Var2.m37179a();
                url = new URL(dx10Var2.m37180b(strM37184g, false));
            } else {
                url = new URL(yjg1.m93921m());
            }
            HttpURLConnection httpURLConnectionM48874i = null;
            try {
                httpURLConnectionM48874i = m48874i(url);
                m48865D(httpURLConnectionM48874i, fx10Var);
                return httpURLConnectionM48874i;
            } catch (IOException e) {
                n0b1.m63370j(httpURLConnectionM48874i);
                throw new FacebookException("could not construct request body", e);
            } catch (JSONException e2) {
                n0b1.m63370j(httpURLConnectionM48874i);
                throw new FacebookException("could not construct request body", e2);
            }
        } catch (MalformedURLException e3) {
            throw new FacebookException("could not construct URL for request", e3);
        }
    }

    /* JADX INFO: renamed from: F */
    public static oi31 m48867F(oi31 oi31Var, Session session) {
        List list;
        oi31 oi31VarM67000b;
        String str;
        long j = oi31Var.f165670b;
        Long l = session.timestamp;
        List list2 = session.sessionMembers;
        if (j > (l != null ? l.longValue() : 0L)) {
            return oi31Var;
        }
        String str2 = session.joinSessionToken;
        String str3 = str2 == null ? "" : str2;
        if (wj50.m88271j(oi31Var.f165679k, str3)) {
            list = list2;
            oi31VarM67000b = oi31Var;
        } else {
            list = list2;
            oi31VarM67000b = oi31.m67000b(oi31Var, false, 0L, null, false, false, false, false, false, false, false, str3, null, null, false, 0, null, null, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -1025, 1);
        }
        if (oi31VarM67000b.f165672d && !oi31VarM67000b.f165682n) {
            oi31VarM67000b = oi31.m67000b(oi31VarM67000b, false, 0L, null, false, false, false, false, false, false, false, null, null, null, (list != null ? list.size() : 0) > 1, 0, null, null, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -8193, 1);
        }
        Long l2 = session.timestamp;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        String str4 = session.sessionId;
        Boolean bool = session.isSessionOwner;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        boolean z = session.isListening;
        boolean z2 = session.isControlling;
        String str5 = session.sessionOwnerId;
        List list3 = list == null ? lau.f131415a : list;
        ArrayList<SessionMember> arrayList = new ArrayList();
        for (Object obj : list3) {
            SessionMember sessionMember = (SessionMember) obj;
            String str6 = sessionMember.id;
            if (str6 != null && str6.length() != 0 && (str = sessionMember.username) != null && str.length() != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (SessionMember sessionMember2 : arrayList) {
            String str7 = sessionMember2.id;
            wj50.m88279p(str7);
            String str8 = sessionMember2.username;
            wj50.m88279p(str8);
            String str9 = sessionMember2.displayName;
            String str10 = str9 == null ? "" : str9;
            String str11 = sessionMember2.id;
            wj50.m88279p(str11);
            arrayList2.add(new b3n0(str7, str10, sessionMember2.imageUrl, sessionMember2.largeImageUrl, str8, str11.equals(str5 == null ? "" : str5), sessionMember2.listenMode, sessionMember2.isAnonymous));
        }
        String str12 = oi31VarM67000b.f165681m;
        if (str12 == null) {
            str12 = "";
        }
        List listM43711Y0 = g6f.m43711Y0(arrayList2, new yms0(str12, 1));
        p301 p301Var = session.initialSessionType;
        if (p301Var == null) {
            p301Var = p301.UNKNOWN_SESSION_TYPE;
        }
        p301 p301Var2 = p301Var;
        j3n0 j3n0Var = session.f4876z;
        String str13 = session.hostActiveDeviceId;
        Integer num = session.maxMemberCount;
        boolean z3 = session.active;
        boolean z4 = session.queueOnlyMode;
        boolean z5 = session.wifiBroadcast;
        SessionOrigin sessionOrigin = session.origin;
        SessionConfiguration sessionConfiguration = session.configuration;
        SessionDeviceInfo sessionDeviceInfo = session.hostDeviceInfo;
        boolean z6 = session.mixedTastesEnabled;
        boolean z7 = session.isPaused;
        oi31 oi31Var2 = oi31VarM67000b;
        SessionUserCapabilities sessionUserCapabilities = session.userCapabilities;
        boolean z8 = session.isJamPaused;
        boolean z9 = session.isJamCapped;
        SessionConfig sessionConfig = session.sessionConfig;
        return oi31.m67000b(oi31Var2, false, jLongValue, str4, zBooleanValue, z, z2, false, false, false, false, null, listM43711Y0, null, false, 1, p301Var2, j3n0Var, str13, false, num, z3, z4, z5, null, sessionOrigin, sessionConfiguration, sessionDeviceInfo, z6, z7, sessionUserCapabilities, z8, z9, sessionConfig != null ? sessionConfig.getReceiveDegradedAdsExperience() : false, 8665025, 0);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m48868b(Uri uri, String str) {
        List list = rib.f199471e;
        return (uri.getPathSegments().size() >= 1 && wj50.m88271j(uri.getPathSegments().get(0), str)) || (uri.getPathSegments().size() >= 2 && wj50.m88271j(uri.getPathSegments().get(1), str));
    }

    /* JADX INFO: renamed from: c */
    public static final void m48869c(ln6 ln6Var) {
        sgz sgzVar = ln6.f135096h;
        if (ln6.f135097i == null) {
            ln6.f135097i = new ln6();
            kn6 kn6Var = new kn6("Okio Watchdog");
            kn6Var.setDaemon(true);
            kn6Var.start();
        }
        long jNanoTime = System.nanoTime();
        long j = ln6Var.f19884c;
        boolean z = ln6Var.f19882a;
        if (j != 0 && z) {
            ln6Var.f135104g = Math.min(j, ln6Var.mo27163c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            ln6Var.f135104g = jNanoTime + j;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            ln6Var.f135104g = ln6Var.mo27163c();
        }
        sgz sgzVar2 = ln6.f135096h;
        int i = sgzVar2.f208958b + 1;
        sgzVar2.f208958b = i;
        ln6[] ln6VarArr = (ln6[]) sgzVar2.f208959c;
        if (i == ln6VarArr.length) {
            ln6[] ln6VarArr2 = new ln6[i * 2];
            bk5.m29636u0(0, 0, 14, ln6VarArr, ln6VarArr2);
            sgzVar2.f208959c = ln6VarArr2;
        }
        sgzVar2.m78116c(i, ln6Var);
        if (ln6Var.f135103f == 1) {
            ln6.f135099k.signal();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m48870d(Uri uri) {
        List list = rib.f199471e;
        List list2 = rib.f199471e;
        if (list2 != null && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (wj50.m88271j((String) it.next(), uri.getHost())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static final String m48871e(Object obj) {
        String str = dx10.f53819j;
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    /* JADX INFO: renamed from: f */
    public static final oi31 m48872f(oi31 oi31Var, Session session, int i) {
        return oi31.m67000b(m48867F(oi31Var, session), false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, i, null, null, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -16385, 1);
    }

    /* JADX INFO: renamed from: g */
    public static ln6 m48873g() throws InterruptedException {
        sgz sgzVar = ln6.f135096h;
        ln6 ln6Var = ((ln6[]) sgzVar.f208959c)[1];
        if (ln6Var == null) {
            long jNanoTime = System.nanoTime();
            ln6.f135099k.await(ln6.f135100l, TimeUnit.MILLISECONDS);
            if (((ln6[]) sgzVar.f208959c)[1] != null || System.nanoTime() - jNanoTime < ln6.f135101m) {
                return null;
            }
            return ln6.f135097i;
        }
        long jNanoTime2 = ln6Var.f135104g - System.nanoTime();
        if (jNanoTime2 > 0) {
            ln6.f135099k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        sgzVar.m78120h(ln6Var);
        ln6Var.f135102e = 2;
        return ln6Var;
    }

    /* JADX INFO: renamed from: i */
    public static HttpURLConnection m48874i(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        if (dx10.f53821l == null) {
            dx10.f53821l = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "18.2.3"}, 2));
        }
        httpURLConnection.setRequestProperty("User-Agent", dx10.f53821l);
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: k */
    public static ArrayList m48875k(fx10 fx10Var) throws Throwable {
        Exception exc;
        HttpURLConnection httpURLConnectionM48866E;
        ArrayList arrayListM48876l;
        zn91.m96546d0(fx10Var);
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnectionM48866E = m48866E(fx10Var);
            exc = null;
        } catch (Exception e) {
            exc = e;
            httpURLConnectionM48866E = null;
        } catch (Throwable th) {
            th = th;
            n0b1.m63370j(httpURLConnection);
            throw th;
        }
        try {
            if (httpURLConnectionM48866E != null) {
                arrayListM48876l = m48876l(httpURLConnectionM48866E, fx10Var);
            } else {
                ArrayList arrayListM29097s = bga.m29097s(fx10Var.f74220b, null, new FacebookException(exc));
                m48863B(fx10Var, arrayListM29097s);
                arrayListM48876l = arrayListM29097s;
            }
            n0b1.m63370j(httpURLConnectionM48866E);
            return arrayListM48876l;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = httpURLConnectionM48866E;
            n0b1.m63370j(httpURLConnection);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0027 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0027: PHI (r0v4 java.util.ArrayList) = (r0v1 java.util.ArrayList), (r0v3 java.util.ArrayList), (r0v10 java.util.ArrayList) binds: [B:25:0x004d, B:23:0x0043, B:16:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r1v1 java.io.InputStream) = (r1v0 java.io.InputStream), (r1v0 java.io.InputStream), (r1v11 java.io.InputStream) binds: [B:25:0x004d, B:23:0x0043, B:16:0x0025] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public static ArrayList m48876l(HttpURLConnection httpURLConnection, fx10 fx10Var) {
        ArrayList arrayListM29097s;
        hsa0 hsa0Var = hsa0.f94646a;
        InputStream errorStream = null;
        try {
            try {
                try {
                    if (!p8y.m69348f()) {
                        throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    }
                    errorStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                    arrayListM29097s = bga.m29099u(errorStream, httpURLConnection, fx10Var);
                    if (errorStream != null) {
                        try {
                            errorStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    httpURLConnection.disconnect();
                    int size = fx10Var.f74220b.size();
                    if (size != arrayListM29097s.size()) {
                        throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(arrayListM29097s.size()), Integer.valueOf(size)}, 2)));
                    }
                    m48863B(fx10Var, arrayListM29097s);
                    C2529wd c2529wdM26362d = C2529wd.f250155f.m26362d();
                    C1893gd c1893gd = (C1893gd) c2529wdM26362d.f250162c;
                    if (c1893gd != null) {
                        long time = new Date().getTime();
                        if (c1893gd.f78687f.f260332a && time - ((Date) c2529wdM26362d.f250164e).getTime() > 3600000 && time - c1893gd.f78688g.getTime() > 86400000) {
                            if (wj50.m88271j(Looper.getMainLooper(), Looper.myLooper())) {
                                c2529wdM26362d.m87783N();
                            } else {
                                new Handler(Looper.getMainLooper()).post(new RunnableC2210od(c2529wdM26362d, 0));
                            }
                        }
                    }
                    return arrayListM29097s;
                } catch (Exception e) {
                    iq3 iq3Var = tra0.f223025b;
                    iq3.m51332s(hsa0Var);
                    arrayListM29097s = bga.m29097s(fx10Var, httpURLConnection, new FacebookException(e));
                    if (0 != 0) {
                        errorStream.close();
                    }
                }
            } catch (FacebookException e2) {
                iq3 iq3Var2 = tra0.f223025b;
                iq3.m51332s(hsa0Var);
                arrayListM29097s = bga.m29097s(fx10Var, httpURLConnection, e2);
                if (0 != 0) {
                    errorStream.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    errorStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public static Next m48877m(oi31 oi31Var, gh00 gh00Var) {
        return !oi31Var.f165675g ? Next.m15608j() : (Next) gh00Var.invoke(oi31.m67000b(oi31Var, true, 0L, null, false, false, false, false, false, false, false, null, null, null, false, 0, null, null, null, false, null, false, false, false, null, null, null, null, false, false, null, false, false, false, -66, 1));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m48878n(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof bx10);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m48879o(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    /* JADX INFO: renamed from: p */
    public static void m48880p(String str, Object... objArr) {
        Logger.m3966b(edb.m38564m("social listening impl: ", str), Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: q */
    public static un71 m48881q() {
        return new un71(koq0.f124878S0.m57008e());
    }

    /* JADX INFO: renamed from: r */
    public static dx10 m48882r(C1893gd c1893gd, String str, zw10 zw10Var) {
        return new dx10(c1893gd, str, null, null, zw10Var, 32);
    }

    /* JADX INFO: renamed from: s */
    public static dx10 m48883s(C1893gd c1893gd, String str, JSONObject jSONObject, zw10 zw10Var) {
        dx10 dx10Var = new dx10(c1893gd, str, null, eh30.f59474b, zw10Var, 32);
        dx10Var.f53824c = jSONObject;
        return dx10Var;
    }

    /* JADX INFO: renamed from: t */
    public static Next m48884t() {
        return Next.m15605a(Effects.m15571a(gg31.f79529a));
    }

    /* JADX INFO: renamed from: u */
    public static Next m48885u(oi31 oi31Var, rh31 rh31Var) {
        return Next.m15606h(oi31.m67000b(oi31Var, false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, 0, null, null, null, false, null, false, false, false, rh31Var.f199101a, null, null, null, false, false, null, false, false, false, -8388609, 1));
    }

    /* JADX INFO: renamed from: v */
    public static Next m48886v(oi31 oi31Var, gi31 gi31Var) {
        Session session = gi31Var.f80041a.session;
        return Next.m15606h(oi31.m67000b(session != null ? m48867F(oi31Var, session) : oi31Var.m67001a(), false, 0L, null, false, false, false, false, false, false, false, null, null, null, false, 0, null, null, null, false, null, false, false, false, gi31Var.f80041a.deviceBroadcastStatus, null, null, null, false, false, null, false, false, false, -8388609, 1));
    }

    /* JADX INFO: renamed from: w */
    public static Next m48887w(li31 li31Var) {
        if (li31Var.f133714b) {
            return Next.m15608j();
        }
        m48880p("Failed to update permissions control to: " + li31Var, new Object[0]);
        return Next.m15605a(cct.m32317p(crq0.f41346O0));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX INFO: renamed from: x */
    public static void m48888x(JSONObject jSONObject, String str, ax10 ax10Var) {
        boolean z;
        Matcher matcher = dx10.f53820k.matcher(str);
        String strGroup = matcher.matches() ? matcher.group(1) : str;
        if (bm51.m29803n0(strGroup, "me/", false) || bm51.m29803n0(strGroup, "/me/", false)) {
            int iM88458H0 = wl51.m88458H0(str, ":", 0, false, 6);
            int iM88458H1 = wl51.m88458H0(str, "?", 0, false, 6);
            if (iM88458H0 <= 3 || (iM88458H1 != -1 && iM88458H0 >= iM88458H1)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            m48889y(next, jSONObject.opt(next), ax10Var, z && bm51.m29797h0(next, "image", true));
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m48889y(String str, Object obj, ax10 ax10Var, boolean z) {
        Class<?> cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    m48889y(String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2)), jSONObject.opt(next), ax10Var, z);
                }
                return;
            }
            if (jSONObject.has("id")) {
                m48889y(str, jSONObject.optString("id"), ax10Var, z);
                return;
            } else if (jSONObject.has("url")) {
                m48889y(str, jSONObject.optString("url"), ax10Var, z);
                return;
            } else {
                if (jSONObject.has("fbsdk:create_object")) {
                    m48889y(str, jSONObject.toString(), ax10Var, z);
                    return;
                }
                return;
            }
        }
        if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                m48889y(String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2)), jSONArray.opt(i), ax10Var, z);
            }
            return;
        }
        if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
            ax10Var.mo27356a(str, obj.toString());
        } else if (Date.class.isAssignableFrom(cls)) {
            ax10Var.mo27356a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
        } else {
            String str2 = dx10.f53819j;
            p8y p8yVar = p8y.f175080a;
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m48890z(fx10 fx10Var, tra0 tra0Var, int i, URL url, FilterOutputStream filterOutputStream, boolean z) throws JSONException {
        String strM69344b;
        oqb oqbVar = new oqb(filterOutputStream, tra0Var, z);
        boolean z2 = true;
        if (i == 1) {
            dx10 dx10Var = (dx10) fx10Var.f74220b.get(0);
            HashMap map = new HashMap();
            for (String str : dx10Var.f53825d.keySet()) {
                Object obj = dx10Var.f53825d.get(str);
                if (m48878n(obj)) {
                    map.put(str, new yw10(dx10Var, obj));
                }
            }
            synchronized (p8y.f175081b) {
            }
            Bundle bundle = dx10Var.f53825d;
            for (String str2 : bundle.keySet()) {
                Object obj2 = bundle.get(str2);
                if (m48879o(obj2)) {
                    oqbVar.m67621h(str2, obj2, dx10Var);
                }
            }
            synchronized (p8y.f175081b) {
            }
            m48864C(map, oqbVar);
            JSONObject jSONObject = dx10Var.f53824c;
            if (jSONObject != null) {
                m48888x(jSONObject, url.getPath(), oqbVar);
                return;
            }
            return;
        }
        fx10Var.getClass();
        Iterator<E> it = fx10Var.iterator();
        while (true) {
            if (it.hasNext()) {
                C1893gd c1893gd = ((dx10) it.next()).f53822a;
                if (c1893gd != null) {
                    strM69344b = c1893gd.f78689h;
                    break;
                }
            } else {
                String str3 = dx10.f53819j;
                strM69344b = p8y.m69344b();
                break;
            }
        }
        if (strM69344b.length() == 0) {
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }
        oqbVar.mo27356a("batch_app_id", strM69344b);
        HashMap map2 = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = fx10Var.iterator();
        while (it2.hasNext()) {
            dx10 dx10Var2 = (dx10) it2.next();
            dx10Var2.getClass();
            String str4 = dx10.f53819j;
            JSONObject jSONObject2 = new JSONObject();
            String strM37184g = dx10Var2.m37184g(yjg1.m93921m());
            dx10Var2.m37179a();
            Uri uri = Uri.parse(dx10Var2.m37180b(strM37184g, z2));
            String str5 = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
            jSONObject2.put("relative_url", str5);
            jSONObject2.put("method", dx10Var2.f53829h);
            C1893gd c1893gd2 = dx10Var2.f53822a;
            if (c1893gd2 != null) {
                tra0.f223025b.m51337u(c1893gd2.f78686e);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it3 = dx10Var2.f53825d.keySet().iterator();
            while (it3.hasNext()) {
                Object obj3 = dx10Var2.f53825d.get(it3.next());
                if (m48878n(obj3)) {
                    String str6 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map2.size())}, 2));
                    arrayList.add(str6);
                    map2.put(str6, new yw10(dx10Var2, obj3));
                }
            }
            if (!arrayList.isEmpty()) {
                jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
            }
            JSONObject jSONObject3 = dx10Var2.f53824c;
            if (jSONObject3 != null) {
                ArrayList arrayList2 = new ArrayList();
                m48888x(jSONObject3, str5, new cx10(arrayList2));
                jSONObject2.put("body", TextUtils.join("&", arrayList2));
            }
            jSONArray.put(jSONObject2);
            z2 = true;
        }
        oqbVar.m67623j(jSONArray, fx10Var);
        synchronized (p8y.f175081b) {
        }
        m48864C(map2, oqbVar);
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue() || !((Boolean) obj3).booleanValue());
    }

    @Override // p204p.yua
    /* JADX INFO: renamed from: a */
    public byte[] mo48891a(int i, byte[] bArr, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new cwl(((Boolean) obj).booleanValue(), (int) ((Number) obj2).longValue());
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        xm7 xm7VarM91448a = xm7.m91448a(i);
        return xm7VarM91448a == null ? xm7.UNRECOGNIZED : xm7VarM91448a;
    }

    /* JADX INFO: renamed from: h */
    public Next m48892h(dj50 dj50Var, ej50 ej50Var, zi50 zi50Var) {
        int i;
        long j;
        ej50 ej50Var2 = dj50Var.f49563a;
        Set set = dj50Var.f49564b;
        x401 x401Var = new x401();
        boolean z = ej50Var.f60134c;
        boolean z2 = ej50Var.f60142k;
        int i2 = ej50Var.f60135d;
        boolean z3 = ej50Var.f60145n;
        boolean z4 = ej50Var.f60132a;
        long j2 = ej50Var.f60144m;
        boolean z5 = ej50Var.f60141j;
        if (z && z4) {
            bzf1.m31016h(x401Var, kn40.f124303i, set, z5);
        }
        if (ej50Var.f60139h && z && !z3) {
            bzf1.m31016h(x401Var, kn40.f124306l, set, z5);
        }
        boolean z6 = ej50Var2.f60145n;
        boolean z7 = ej50Var2.f60134c;
        boolean z8 = ej50Var2.f60142k;
        long j3 = ej50Var2.f60144m;
        boolean z9 = ej50Var2.f60141j;
        if (!z6 || z3) {
            i = i2;
            j = j3;
        } else {
            i = i2;
            j = j3;
            if (ej50Var.f60146o - ej50Var2.f60146o < 1000) {
                x401Var.add(kn40.f124298d);
            }
        }
        if (!z5 && z9 && j2 - j < 1000 && (ztg1.m96920l(ej50Var) || z4)) {
            x401Var.add(kn40.f124305k);
        }
        if (i > 1 && z && ztg1.m96920l(ej50Var) && !ej50Var.f60137f) {
            bzf1.m31016h(x401Var, kn40.f124299e, set, z5);
        }
        if (z2 && ztg1.m96920l(ej50Var) && !z && j2 - ej50Var.f60143l < LogLevel.NONE) {
            bzf1.m31016h(x401Var, kn40.f124302h, set, z5);
        } else if (ztg1.m96920l(ej50Var) && !z && !ej50Var.f60133b) {
            bzf1.m31016h(x401Var, kn40.f124300f, set, z5);
        }
        if (((z2 && !z8) || (!z2 && z8)) && z5 && z9 && z && z7 && j2 - j < 1000) {
            x401Var.add(kn40.f124301g);
        }
        if (z8 && z9 && z5 && ej50Var.f60138g - j < 1000 && ej50Var2.f60135d < i) {
            x401Var.add(kn40.f124304j);
        }
        if (z != z7 && (ztg1.m96920l(ej50Var2) || ztg1.m96920l(ej50Var))) {
            long j4 = ej50Var2.f60147p;
            if (j4 != 0 && ej50Var.f60147p - j4 < 1000) {
                x401Var.add(kn40.f124297c);
            }
        }
        x401 x401VarM63425d = n0e1.m63425d(x401Var);
        ArrayList arrayList = new ArrayList();
        Object it = x401VarM63425d.iterator();
        while (((s2v) it).hasNext()) {
            Object next = ((lec0) it).next();
            if (!set.contains((ln40) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Object it2 = x401VarM63425d.iterator();
        while (((s2v) it2).hasNext()) {
            Object next2 = ((lec0) it2).next();
            if (!((ln40) next2).m59472a()) {
                arrayList2.add(next2);
            }
        }
        Set setM43736n1 = g6f.m43736n1(arrayList2);
        dj50 dj50Var2 = new dj50(ej50Var, setM43736n1);
        LinkedHashSet linkedHashSetM43712Z0 = g6f.m43712Z0(set, setM43736n1);
        x401 x401Var2 = new x401();
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(linkedHashSetM43712Z0, 10));
        Iterator it3 = linkedHashSetM43712Z0.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new ti50((ln40) it3.next(), zi50Var.getName()));
        }
        x401Var2.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(new si50((ln40) it4.next(), zi50Var.getName()));
        }
        x401Var2.addAll(arrayList4);
        return Next.m15607i(dj50Var2, n0e1.m63425d(x401Var2));
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3;
        String str4 = (String) linkedHashMap.get("account_id");
        if (str4 == null || !igg1.m50541t(str4) || (str3 = (String) linkedHashMap.get("social_handle")) == null) {
            return null;
        }
        return new eya1(str4, str3, mec0Var, str2, str);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f95741a) {
            case 4:
                return ((qam0) obj) instanceof d7a1;
            case 5:
                return !((hq10) obj).mo48193c().mo26697m();
            case 10:
                return ((cty) obj).equals(aty.f19759a);
            default:
                return ((ubp0) obj).f228862j;
        }
    }

    public hvi0(m95 m95Var) {
        this.f95741a = 28;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f95741a) {
            case 1:
                return Boolean.valueOf(dxf1.m37216E((Map) obj));
            case 2:
                return Boolean.valueOf(dxf1.m37222K((Map) obj));
            case 3:
            case 4:
            case 5:
            case 10:
            case 11:
            default:
                byte[] bArr = (byte[]) obj;
                try {
                    return PinResponse.m98133q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.your_library.esperanto.proto.PinResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 6:
                return ((PlayerState) obj).duration();
            case 7:
                ciq0 ciq0Var = (ciq0) obj;
                if (ciq0Var.equals(aiq0.f16080a)) {
                    return "";
                }
                if (ciq0Var instanceof biq0) {
                    return ((biq0) ciq0Var).f27528a;
                }
                throw new NoWhenBranchMatchedException();
            case 8:
                return new glr0((Throwable) obj);
            case 9:
                List<h6u0> list = (List) obj;
                wj50.m88279p(list);
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                for (h6u0 h6u0Var : list) {
                    arrayList.add(pft0.m69840u(h6u0Var.f88256a, Integer.valueOf(h6u0Var.f88257b)));
                }
                return kkc0.m56705r0(arrayList);
            case 12:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsSession$APPermanentErrorResult.m7488p(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connectivity.auth.esperanto.proto.EsSession.APPermanentErrorResult: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 13:
                List list2 = (List) obj;
                return pft0.m69840u(g6f.m43741q0(list2), g6f.m43687A0(list2));
        }
    }
}
