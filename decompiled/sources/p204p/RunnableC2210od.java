package p204p;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.ActionMode;
import androidx.car.app.C0023j;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.encoremobile.widgets.CancellableSeekBar;
import com.spotify.interapp.interappprotocol.NotAuthorizedException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.UninitializedPropertyAccessException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: p.od */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2210od implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f164043a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f164044b;

    public /* synthetic */ RunnableC2210od(Object obj, int i) {
        this.f164043a = i;
        this.f164044b = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m66729a() {
        xn6 xn6Var = (xn6) this.f164044b;
        synchronized (xn6Var.f263523a) {
            try {
                if (xn6Var.f263535m) {
                    return;
                }
                long j = xn6Var.f263534l - 1;
                xn6Var.f263534l = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    xn6Var.m91493a();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (xn6Var.f263523a) {
                    xn6Var.f263536n = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m66730b() {
        lwb lwbVar = (lwb) this.f164044b;
        synchronized (lwbVar.f137502a) {
            if (lwbVar.f137503b.isEmpty()) {
                return;
            }
            try {
                lwbVar.m60108i(lwbVar.f137503b);
                lwbVar.f137503b.clear();
            } catch (Throwable th) {
                lwbVar.f137503b.clear();
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:302:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:304:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:307:0x0639  */
    /* JADX WARN: Code duplicated, block: B:310:0x066c A[Catch: IOException -> 0x0688, UnknownHostException -> 0x068b, TryCatch #16 {UnknownHostException -> 0x068b, IOException -> 0x0688, blocks: (B:308:0x0658, B:310:0x066c, B:311:0x0672, B:313:0x0678, B:318:0x068e, B:320:0x0698, B:325:0x06a8, B:327:0x06e5, B:334:0x0700, B:338:0x0706, B:339:0x0709, B:340:0x070a), top: B:459:0x0658 }] */
    /* JADX WARN: Code duplicated, block: B:313:0x0678 A[Catch: IOException -> 0x0688, UnknownHostException -> 0x068b, LOOP:3: B:311:0x0672->B:313:0x0678, LOOP_END, TryCatch #16 {UnknownHostException -> 0x068b, IOException -> 0x0688, blocks: (B:308:0x0658, B:310:0x066c, B:311:0x0672, B:313:0x0678, B:318:0x068e, B:320:0x0698, B:325:0x06a8, B:327:0x06e5, B:334:0x0700, B:338:0x0706, B:339:0x0709, B:340:0x070a), top: B:459:0x0658 }] */
    /* JADX WARN: Code duplicated, block: B:324:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:327:0x06e5 A[Catch: IOException -> 0x0688, UnknownHostException -> 0x068b, TRY_LEAVE, TryCatch #16 {UnknownHostException -> 0x068b, IOException -> 0x0688, blocks: (B:308:0x0658, B:310:0x066c, B:311:0x0672, B:313:0x0678, B:318:0x068e, B:320:0x0698, B:325:0x06a8, B:327:0x06e5, B:334:0x0700, B:338:0x0706, B:339:0x0709, B:340:0x070a), top: B:459:0x0658 }] */
    /* JADX WARN: Code duplicated, block: B:330:0x06f9 A[Catch: all -> 0x06fd, TRY_LEAVE, TryCatch #15 {all -> 0x06fd, blocks: (B:328:0x06f3, B:330:0x06f9), top: B:457:0x06f3 }] */
    /* JADX WARN: Code duplicated, block: B:344:0x073f  */
    /* JADX WARN: Code duplicated, block: B:373:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:466:0x0700 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v18, types: [p.d95] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r4v28, types: [p.bam[]] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v39, types: [p.bam] */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v42, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v8, types: [p.d95[]] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object obj;
        ?? r5;
        ?? r2;
        oz3 oz3Var;
        Throwable th;
        ?? SingletonList;
        int iMax;
        List listM43709W0;
        LinkedHashMap linkedHashMap;
        k95 k95Var;
        Map mapSingletonMap;
        el0 el0Var;
        HttpURLConnection httpURLConnection;
        Set<String> setKeySet;
        boolean z;
        StringBuilder sb;
        BufferedReader bufferedReader;
        String line;
        int i;
        ?? r10;
        int i2;
        String str;
        Object obj2;
        ?? r4;
        int i3;
        int i4;
        i95 i95Var;
        int i5;
        Application application = 26;
        char c = 26;
        char c2 = 7;
        int i6 = 3;
        Throwable th2 = null;
        switch (this.f164043a) {
            case 0:
                ((C2529wd) this.f164044b).m87783N();
                return;
            case 1:
                Activity activity = (Activity) this.f164044b;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = vf0.f240860g;
                Method method = vf0.f240859f;
                uf0 uf0Var = Build.VERSION.SDK_INT;
                if (uf0Var >= 28) {
                    activity.recreate();
                    return;
                }
                if (((uf0Var != 26 && uf0Var != 27) || method != null) && (vf0.f240858e != null || vf0.f240857d != null)) {
                    try {
                        Object obj3 = vf0.f240856c.get(activity);
                        if (obj3 != null && (obj = vf0.f240855b.get(activity)) != null) {
                            application = activity.getApplication();
                            uf0Var = new uf0(activity);
                            application.registerActivityLifecycleCallbacks(uf0Var);
                            int i7 = 1;
                            handler.post(new uqf1(i7, uf0Var, obj3));
                            if (uf0Var != 26 && uf0Var != 27) {
                                i7 = 0;
                            }
                            try {
                                if (i7 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r2 = application;
                                        r5 = uf0Var;
                                        handler.post(new lk00(2, r2, r5));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new lk00(2, application, uf0Var));
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                r2 = application;
                                r5 = uf0Var;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 2:
                m04 m04Var = (m04) this.f164044b;
                boolean zM60403e = m04Var.m60403e();
                oz3 oz3Var2 = m04Var.f138502a;
                if (zM60403e) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        oz3Var2.m68606u(true);
                        toi0 toi0Var = m04Var.f138499X;
                        int[] iArr = toi0Var.f247487b;
                        long[] jArr = toi0Var.f247486a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j = jArr[i8];
                                if ((((~j) << c2) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                                    int i10 = 0;
                                    while (i10 < i9) {
                                        if ((255 & j) < 128) {
                                            int i11 = iArr[(i8 << 3) + i10];
                                            if (!m04Var.m60402d().m87102a(i11)) {
                                                m04Var.f138505d.add(new agj(i11, m04Var.f138511t, 2, null));
                                                m04Var.f138509h.mo30231j(w2a1.f247311a);
                                            }
                                        }
                                        j >>= 8;
                                        i10++;
                                        oz3Var2 = oz3Var2;
                                    }
                                    oz3Var = oz3Var2;
                                    if (i9 == 8) {
                                    }
                                } else {
                                    oz3Var = oz3Var2;
                                }
                                if (i8 != length) {
                                    i8++;
                                    oz3Var2 = oz3Var;
                                    c2 = 7;
                                }
                            }
                        } else {
                            oz3Var = oz3Var2;
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            m04Var.m60405g(oz3Var.getSemanticsOwner().m42388a(), m04Var.f138500Y);
                            Trace.endSection();
                            m04Var.m60400b(m04Var.m60402d());
                            m04Var.m60409k();
                            m04Var.f138501Z = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                }
                return;
            case 3:
                ActionMode actionMode = ((ar4) this.f164044b).f18937h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 4:
                dx10 dx10Var = (dx10) this.f164044b;
                HashSet hashSet = l95.f131005a;
                String str2 = dx10Var.f53823b;
                List listM88477a1 = str2 != null ? wl51.m88477a1(str2, new String[]{"/"}, 0, 6) : null;
                if (listM88477a1 == null || listM88477a1.size() != 2) {
                    iq3 iq3Var = tra0.f223025b;
                    p8y.m69349g();
                    return;
                }
                try {
                    k95 k95Var2 = l95.f131007c;
                    if (k95Var2 == null) {
                        wj50.m88260d0("credentials");
                        throw null;
                    }
                    String str3 = k95Var2.f120519b;
                    if (k95Var2 == null) {
                        wj50.m88260d0("credentials");
                        throw null;
                    }
                    String str4 = str3 + "/capi/" + k95Var2.f120518a + "/events";
                    String str5 = "custom_events";
                    JSONObject jSONObject = dx10Var.f53824c;
                    if (jSONObject != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(n0b1.m63367g(jSONObject));
                        linkedHashMap2.put("custom_events", dx10Var.f53826e);
                        Iterator it = linkedHashMap2.keySet().iterator();
                        while (it.hasNext()) {
                            Objects.toString(linkedHashMap2.get((String) it.next()));
                            System.getProperty("line.separator");
                        }
                        iq3 iq3Var2 = tra0.f223025b;
                        synchronized (p8y.f175081b) {
                        }
                        Object obj4 = j95.f110093a;
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        ArrayList<Map> arrayList = new ArrayList();
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                        String str6 = (String) linkedHashMap2.get("event");
                        int i12 = str6.equals("MOBILE_APP_INSTALL") ? 1 : str6.equals("CUSTOM_APP_EVENTS") ? 2 : 3;
                        if (i12 == 3) {
                            i = 3;
                            th = null;
                        } else {
                            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                Throwable th6 = th2;
                                String str7 = (String) entry.getKey();
                                Object value = entry.getValue();
                                ?? Values = d95.values();
                                int length2 = Values.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 < length2) {
                                        r10 = Values[i13];
                                        int i14 = length2;
                                        if (!r10.f46689a.equals(str7)) {
                                            i13++;
                                            length2 = i14;
                                        }
                                    } else {
                                        r10 = th6;
                                    }
                                }
                                if (r10 != 0) {
                                    ?? r6 = j95.f110093a;
                                    i95 i95Var2 = (i95) r6.get(r10);
                                    if (i95Var2 != null && (i3 = i95Var2.f99910a) != 0) {
                                        int iM38547C = edb.m38547C(i3);
                                        if (iM38547C != 0) {
                                            if (iM38547C == 1 && (i95Var = (i95) r6.get(r10)) != null && (i5 = i95Var.f99911b) != 0) {
                                                linkedHashMap4.put(ydj.m93447f(i5), value);
                                            }
                                        } else if (r10 == d95.USER_DATA) {
                                            try {
                                                linkedHashMap3.putAll(n0b1.m63367g(new JSONObject((String) value)));
                                                break;
                                            } catch (JSONException unused2) {
                                                iq3 iq3Var3 = tra0.f223025b;
                                                synchronized (p8y.f175081b) {
                                                }
                                            }
                                        } else {
                                            i95 i95Var3 = (i95) r6.get(r10);
                                            if (i95Var3 != null && (i4 = i95Var3.f99911b) != 0) {
                                                linkedHashMap3.put(ydj.m93447f(i4), value);
                                            }
                                        }
                                    }
                                    str5 = str5;
                                } else {
                                    boolean zEquals = str7.equals(str5);
                                    boolean z2 = value instanceof String;
                                    if (i12 == 2 && zEquals && z2) {
                                        String str8 = (String) value;
                                        ArrayList arrayList2 = new ArrayList();
                                        try {
                                            Iterator it2 = n0b1.m63366f(new JSONArray(str8)).iterator();
                                            while (it2.hasNext()) {
                                                arrayList2.add(n0b1.m63367g(new JSONObject((String) it2.next())));
                                            }
                                            if (arrayList2.isEmpty()) {
                                                obj2 = th6;
                                            } else {
                                                ArrayList arrayList3 = new ArrayList();
                                                Iterator it3 = arrayList2.iterator();
                                                while (it3.hasNext()) {
                                                    Map map = (Map) it3.next();
                                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                                    LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                                    for (String str9 : map.keySet()) {
                                                        String str10 = str5;
                                                        ?? Values2 = bam.values();
                                                        Iterator it4 = it3;
                                                        int length3 = Values2.length;
                                                        int i15 = 0;
                                                        while (true) {
                                                            if (i15 < length3) {
                                                                int i16 = i15;
                                                                r4 = Values2[i16];
                                                                int i17 = length3;
                                                                if (!r4.f25258a.equals(str9)) {
                                                                    i15 = i16 + 1;
                                                                    length3 = i17;
                                                                }
                                                            } else {
                                                                r4 = th6;
                                                            }
                                                        }
                                                        h95 h95Var = (h95) j95.f110094b.get(r4);
                                                        if (r4 != 0 && h95Var != null) {
                                                            int i18 = h95Var.f88877b;
                                                            int i19 = h95Var.f88876a;
                                                            if (i19 == 0) {
                                                                try {
                                                                    String strM93446e = ydj.m93446e(i18);
                                                                    if (r4 == bam.EVENT_NAME && ((String) map.get(str9)) != null) {
                                                                        String str11 = (String) map.get(str9);
                                                                        ?? r7 = j95.f110095c;
                                                                        if (r7.containsKey(str11)) {
                                                                            opk opkVar = (opk) r7.get(str11);
                                                                            str11 = opkVar != null ? opkVar.f167961a : "";
                                                                        }
                                                                        linkedHashMap7.put(strM93446e, str11);
                                                                    } else if (r4 == bam.EVENT_TIME && ((Integer) map.get(str9)) != null) {
                                                                        linkedHashMap7.put(strM93446e, j95.m52725a(map.get(str9), str9));
                                                                    }
                                                                } catch (ClassCastException e) {
                                                                    iq3 iq3Var4 = tra0.f223025b;
                                                                    y85.m93049F(e);
                                                                    synchronized (p8y.f175081b) {
                                                                    }
                                                                }
                                                            } else if (i19 == 3) {
                                                                linkedHashMap6.put(ydj.m93446e(i18), j95.m52725a(map.get(str9), str9));
                                                            }
                                                        }
                                                        str5 = str10;
                                                        it3 = it4;
                                                    }
                                                    String str12 = str5;
                                                    Iterator it5 = it3;
                                                    if (!linkedHashMap6.isEmpty()) {
                                                        linkedHashMap7.put("custom_data", linkedHashMap6);
                                                    }
                                                    arrayList3.add(linkedHashMap7);
                                                    str5 = str12;
                                                    it3 = it5;
                                                }
                                                str5 = str5;
                                                obj2 = arrayList3;
                                            }
                                        } catch (JSONException unused3) {
                                            iq3 iq3Var5 = tra0.f223025b;
                                            synchronized (p8y.f175081b) {
                                            }
                                        }
                                        if (obj2 != null) {
                                            arrayList.addAll(obj2);
                                        }
                                    } else {
                                        str5 = str5;
                                        int i20 = 3;
                                        int[] iArrM38551G = edb.m38551G(3);
                                        int length4 = iArrM38551G.length;
                                        int i21 = 0;
                                        while (true) {
                                            if (i21 >= length4) {
                                                i2 = 0;
                                            } else {
                                                i2 = iArrM38551G[i21];
                                                if (i2 == 1) {
                                                    str = "data_processing_options";
                                                } else if (i2 == 2) {
                                                    str = "data_processing_options_country";
                                                } else {
                                                    if (i2 != i20) {
                                                        throw th6;
                                                    }
                                                    str = "data_processing_options_state";
                                                }
                                                if (!str.equals(str7)) {
                                                    i21++;
                                                    i20 = 3;
                                                }
                                            }
                                        }
                                        if (i2 != 0) {
                                            linkedHashMap5.put(str7, value);
                                        }
                                    }
                                }
                                th2 = th6;
                                str5 = str5;
                                i6 = 3;
                            }
                            th = th2;
                            i = i6;
                        }
                        if (i12 != i) {
                            Object obj5 = linkedHashMap2.get("install_timestamp");
                            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                            linkedHashMap8.put("action_source", "app");
                            linkedHashMap8.put("user_data", linkedHashMap3);
                            linkedHashMap8.put("app_data", linkedHashMap4);
                            linkedHashMap8.putAll(linkedHashMap5);
                            int iM38547C2 = edb.m38547C(i12);
                            if (iM38547C2 != 0) {
                                if (iM38547C2 == 1 && !arrayList.isEmpty()) {
                                    SingletonList = new ArrayList();
                                    for (Map map2 : arrayList) {
                                        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                                        linkedHashMap9.putAll(linkedHashMap8);
                                        linkedHashMap9.putAll(map2);
                                        SingletonList.add(linkedHashMap9);
                                    }
                                }
                            } else if (obj5 != null) {
                                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                                linkedHashMap10.putAll(linkedHashMap8);
                                linkedHashMap10.put("event_name", "MobileAppInstall");
                                linkedHashMap10.put("event_time", obj5);
                                SingletonList = Collections.singletonList(linkedHashMap10);
                            }
                        }
                        if (SingletonList == 0) {
                            return;
                        }
                        l95.m58494a().addAll(SingletonList);
                        iMax = Math.max(0, l95.m58494a().size() - 1000);
                        if (iMax > 0) {
                            l95.f131008d = zn91.m96559k(g6f.m43729k0(l95.m58494a(), iMax));
                        }
                        int iMin = Math.min(l95.m58494a().size(), 10);
                        listM43709W0 = g6f.m43709W0(l95.m58494a(), new b450(0, iMin - 1, 1));
                        l95.m58494a().subList(0, iMin).clear();
                        JSONArray jSONArray = new JSONArray((Collection) listM43709W0);
                        linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("data", jSONArray);
                        k95Var = l95.f131007c;
                        if (k95Var != null) {
                            Throwable th7 = th;
                            wj50.m88260d0("credentials");
                            throw th7;
                        }
                        linkedHashMap.put("accessKey", k95Var.f120520c);
                        String string = new JSONObject(linkedHashMap).toString();
                        mapSingletonMap = Collections.singletonMap("Content-Type", "application/json");
                        el0Var = new el0(listM43709W0, 1, (byte) 0);
                        try {
                            httpURLConnection = (HttpURLConnection) new URL(str4).openConnection();
                            httpURLConnection.setRequestMethod(Request.POST);
                            setKeySet = mapSingletonMap.keySet();
                            if (setKeySet != null) {
                                for (String str13 : setKeySet) {
                                    httpURLConnection.setRequestProperty(str13, (String) mapSingletonMap.get(str13));
                                }
                            }
                            if (!httpURLConnection.getRequestMethod().equals(Request.POST) || httpURLConnection.getRequestMethod().equals(Request.PUT)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            httpURLConnection.setDoOutput(z);
                            httpURLConnection.setConnectTimeout(60000);
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
                            bufferedWriter.write(string);
                            bufferedWriter.flush();
                            bufferedWriter.close();
                            bufferedOutputStream.close();
                            sb = new StringBuilder();
                            if (l95.f131005a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                                while (true) {
                                    try {
                                        line = bufferedReader.readLine();
                                        if (line != null) {
                                            sb.append(line);
                                        } else {
                                            bufferedReader.close();
                                        }
                                    } catch (Throwable th8) {
                                        try {
                                            throw th8;
                                        } catch (Throwable th9) {
                                            n0e1.m63430g(bufferedReader, th8);
                                            throw th9;
                                        }
                                    }
                                }
                            }
                            String string2 = sb.toString();
                            iq3 iq3Var6 = tra0.f223025b;
                            httpURLConnection.getResponseCode();
                            p8y.m69349g();
                            el0Var.invoke(string2, Integer.valueOf(httpURLConnection.getResponseCode()));
                            return;
                        } catch (UnknownHostException e2) {
                            iq3 iq3Var7 = tra0.f223025b;
                            e2.toString();
                            p8y.m69349g();
                            el0Var.invoke(th, 503);
                            return;
                        } catch (IOException e3) {
                            iq3 iq3Var8 = tra0.f223025b;
                            e3.toString();
                            p8y.m69349g();
                            return;
                        }
                    }
                    th = null;
                    SingletonList = th;
                    if (SingletonList == 0) {
                        return;
                    }
                    l95.m58494a().addAll(SingletonList);
                    iMax = Math.max(0, l95.m58494a().size() - 1000);
                    if (iMax > 0) {
                        l95.f131008d = zn91.m96559k(g6f.m43729k0(l95.m58494a(), iMax));
                    }
                    int iMin2 = Math.min(l95.m58494a().size(), 10);
                    listM43709W0 = g6f.m43709W0(l95.m58494a(), new b450(0, iMin2 - 1, 1));
                    l95.m58494a().subList(0, iMin2).clear();
                    JSONArray jSONArray2 = new JSONArray((Collection) listM43709W0);
                    linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("data", jSONArray2);
                    k95Var = l95.f131007c;
                    if (k95Var != null) {
                        Throwable th10 = th;
                        wj50.m88260d0("credentials");
                        throw th10;
                    }
                    linkedHashMap.put("accessKey", k95Var.f120520c);
                    String string3 = new JSONObject(linkedHashMap).toString();
                    mapSingletonMap = Collections.singletonMap("Content-Type", "application/json");
                    el0Var = new el0(listM43709W0, 1, (byte) 0);
                    httpURLConnection = (HttpURLConnection) new URL(str4).openConnection();
                    httpURLConnection.setRequestMethod(Request.POST);
                    setKeySet = mapSingletonMap.keySet();
                    if (setKeySet != null) {
                        while (r6.hasNext()) {
                            httpURLConnection.setRequestProperty(str13, (String) mapSingletonMap.get(str13));
                        }
                    }
                    if (httpURLConnection.getRequestMethod().equals(Request.POST)) {
                        z = true;
                    } else {
                        z = true;
                    }
                    httpURLConnection.setDoOutput(z);
                    httpURLConnection.setConnectTimeout(60000);
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream2, "UTF-8"));
                    bufferedWriter2.write(string3);
                    bufferedWriter2.flush();
                    bufferedWriter2.close();
                    bufferedOutputStream2.close();
                    sb = new StringBuilder();
                    if (l95.f131005a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line != null) {
                                sb.append(line);
                            } else {
                                bufferedReader.close();
                            }
                        }
                    }
                    String string4 = sb.toString();
                    iq3 iq3Var9 = tra0.f223025b;
                    httpURLConnection.getResponseCode();
                    p8y.m69349g();
                    el0Var.invoke(string4, Integer.valueOf(httpURLConnection.getResponseCode()));
                    return;
                } catch (UninitializedPropertyAccessException unused4) {
                    iq3 iq3Var10 = tra0.f223025b;
                    p8y.m69349g();
                    return;
                }
            case 5:
                if (((b6q) this.f164044b).f24016l != 1) {
                    throw new NotAuthorizedException();
                }
                return;
            case 6:
                m66729a();
                return;
            case 7:
                m12 m12Var = (m12) this.f164044b;
                ((Context) m12Var.f138797c).unregisterReceiver((bt6) m12Var.f138798d);
                return;
            case 8:
                bt6 bt6Var = (bt6) this.f164044b;
                if (bt6Var.f30521c.f138796b) {
                    bt6Var.f30519a.f27780a.m44993B1(3, false);
                    return;
                }
                return;
            case 9:
                eu6 eu6Var = (eu6) this.f164044b;
                List listM40033g = eu6Var.m40033g();
                Context context = (Context) eu6Var.f62877b;
                xs6 xs6Var = (xs6) eu6Var.f62886k;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) eu6Var.f62885j;
                wsv0 wsv0Var = bu6.f31027e;
                eu6Var.m40034h(bu6.m30504b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), xs6Var, audioDeviceInfo, listM40033g));
                return;
            case 10:
                n890 n890Var = (n890) this.f164044b;
                n890Var.getClass();
                if (Thread.currentThread() == ((Thread) n890Var.f151476c)) {
                    n890Var.m63839j(-1, new q95(c));
                    return;
                }
                return;
            case 11:
                pcb pcbVar = (pcb) this.f164044b;
                gbb gbbVar = (gbb) pcbVar.f176008h;
                if (gbbVar != null) {
                    gbbVar.m44211b(null);
                    pcbVar.f176008h = null;
                    return;
                }
                return;
            case 12:
                idb idbVar = (idb) this.f164044b;
                idbVar.f101022S0 = false;
                idbVar.f101021R0 = false;
                idbVar.m50339t("OpenCameraConfigAndClose is done, state: ".concat(m6b.m61003r(idbVar.f101044f1)));
                int iM38547C3 = edb.m38547C(idbVar.f101044f1);
                if (iM38547C3 == 1 || iM38547C3 == 4) {
                    wj50.m88281r(null, idbVar.f101031Z.isEmpty());
                    idbVar.m50340u();
                    return;
                } else {
                    if (iM38547C3 != 6) {
                        idbVar.m50339t("OpenCameraConfigAndClose finished while in state: ".concat(m6b.m61003r(idbVar.f101044f1)));
                        return;
                    }
                    int i22 = idbVar.f101027X;
                    if (i22 == 0) {
                        idbVar.m50323J(false);
                        return;
                    } else {
                        idbVar.m50339t("OpenCameraConfigAndClose in error: ".concat(idb.m50311v(i22)));
                        idbVar.f101046h.m47182b();
                        return;
                    }
                }
            case 13:
                ((CameraDevice) this.f164044b).close();
                return;
            case 14:
                gdb gdbVar = (gdb) this.f164044b;
                if (gdbVar.f78791b) {
                    return;
                }
                wj50.m88281r(null, ((hdb) gdbVar.f78793d).f90105f.f101044f1 == 7 || ((hdb) gdbVar.f78793d).f90105f.f101044f1 == 6);
                if (((hdb) gdbVar.f78793d).m47183c()) {
                    ((hdb) gdbVar.f78793d).f90105f.m50322I(true);
                    return;
                } else {
                    ((hdb) gdbVar.f78793d).f90105f.m50323J(true);
                    return;
                }
            case 15:
                lzj.m60343U(((xfb) this.f164044b).f260890b);
                return;
            case 16:
                cdb cdbVar = (cdb) this.f164044b;
                if (cdbVar.f36846c.f101044f1 == 4) {
                    cdbVar.f36846c.m50323J(false);
                    return;
                }
                return;
            case 17:
                vk9 vk9Var = (vk9) this.f164044b;
                if (((idb) vk9Var.f242171b).f101044f1 == 9) {
                    ((idb) vk9Var.f242171b).m50315B();
                    return;
                }
                return;
            case 18:
                CancellableSeekBar cancellableSeekBar = (CancellableSeekBar) this.f164044b;
                int i23 = CancellableSeekBar.f3830i;
                wsv0 wsv0VarM69794t = pf40.m69794t(new Rect(0, 0, cancellableSeekBar.getWidth(), cancellableSeekBar.getHeight()));
                WeakHashMap weakHashMap = mec1.f142677a;
                if (Build.VERSION.SDK_INT >= 29) {
                    hec1.m47303c(cancellableSeekBar, wsv0VarM69794t);
                    return;
                }
                return;
            case 19:
                ((np7) ((cwb) this.f164044b).f42689b).getClass();
                return;
            case 20:
                m66730b();
                return;
            case 21:
                for (vg61 vg61Var : (LinkedHashSet) this.f164044b) {
                    vg61Var.getClass();
                    vg61Var.mo57520c(vg61Var);
                }
                return;
            case 22:
                ((xiy0) ((C0023j) this.f164044b).m214d(xiy0.class)).m91166b();
                return;
            case 23:
                cxe cxeVar = (cxe) this.f164044b;
                if (p2l.f173365a.contains(cxe.class)) {
                    return;
                }
                try {
                    cxeVar.m34313y();
                    return;
                } catch (Throwable th11) {
                    p2l.m68953a(cxe.class, th11);
                    return;
                }
            case 24:
                yvf yvfVar = (yvf) this.f164044b;
                Runnable runnable = yvfVar.f276656b;
                if (runnable != null) {
                    runnable.run();
                    yvfVar.f276656b = null;
                    return;
                }
                return;
            case 25:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e4) {
                    if (!wj50.m88271j(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e4;
                    }
                    return;
                } catch (NullPointerException e5) {
                    if (!wj50.m88271j(e5.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e5;
                    }
                    return;
                }
            case 26:
                mwf.m63008a((mwf) this.f164044b);
                return;
            case 27:
                xwo xwoVar = (xwo) this.f164044b;
                xwoVar.m92297Z(xwoVar.m92292G(), 1028, new pwo(18));
                xwoVar.f266715f.m63835f();
                return;
            case 28:
                ayo ayoVar = (ayo) this.f164044b;
                if (ayoVar.f21306c0 >= 300000) {
                    ((rad0) ayoVar.f21319o.f129295b).f197282s2 = true;
                    ayoVar.f21306c0 = 0L;
                    return;
                }
                return;
            default:
                jep jepVar = (jep) this.f164044b;
                if (jepVar.f111640c) {
                    return;
                }
                bhs bhsVar = jepVar.f111639b;
                if (bhsVar != null) {
                    bhsVar.mo29258b(jepVar.f111638a);
                }
                jepVar.f111641d.f132641n.remove(jepVar);
                jepVar.f111640c = true;
                return;
        }
    }
}
