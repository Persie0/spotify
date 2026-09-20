package p204p;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.comscore.streaming.ContentMediaFormat;
import com.spotify.encoremobile.tooltip.TooltipContainer;
import com.spotify.messages.DjInteractivityConnectionAttempt;
import com.spotify.share.shareables.impl.ShareablesBitmapParseException;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class u4l0 implements iab, Function, sb11, y561 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f226771a;

    /* JADX INFO: renamed from: b */
    public Object f226772b;

    /* JADX INFO: renamed from: c */
    public Object f226773c;

    public /* synthetic */ u4l0(int i, Object obj, Object obj2) {
        this.f226771a = i;
        this.f226772b = obj;
        this.f226773c = obj2;
    }

    /* JADX INFO: renamed from: a */
    public File m82352a() {
        if (((File) this.f226772b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f226772b) == null) {
                        faz fazVar = (faz) this.f226773c;
                        fazVar.m41197a();
                        this.f226772b = new File(fazVar.f67665a.getFilesDir(), "PersistedInstallation." + ((faz) this.f226773c).m41199d() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.f226772b;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return new e1x((String) this.f226772b, ((hkt) this.f226773c).m47852b(), (Throwable) obj);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [p.eh00, p.qe70] */
    /* JADX INFO: renamed from: b */
    public Object m82353b(Object obj, qr60 qr60Var) {
        Object obj2;
        WeakReference weakReference = (WeakReference) this.f226773c;
        if (weakReference != null && (obj2 = weakReference.get()) != null) {
            return obj2;
        }
        Object objInvoke = ((qe70) this.f226772b).invoke();
        this.f226773c = new WeakReference(objInvoke);
        return objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m82354c(yjt yjtVar, ibk ibkVar) {
        ip41 ip41Var;
        if (ibkVar instanceof ip41) {
            ip41Var = (ip41) ibkVar;
            int i = ip41Var.f104384c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ip41Var.f104384c = i - Integer.MIN_VALUE;
            } else {
                ip41Var = new ip41(this, ibkVar);
            }
        } else {
            ip41Var = new ip41(this, ibkVar);
        }
        Object obj = ip41Var.f104382a;
        int i2 = ip41Var.f104384c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Single map = ((cgm) this.f226773c).m32730a(true).first(qyg1.m74178H(false)).map(new hm11(18, yjtVar, this));
        ip41Var.f104384c = 1;
        Object objM96567o = zn91.m96567o(map, ip41Var);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    /* JADX INFO: renamed from: d */
    public void m82355d(t18 t18Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", t18Var.f216171a);
            jSONObject.put("Status", edb.m38547C(t18Var.f216172b));
            jSONObject.put("AuthToken", t18Var.f216173c);
            jSONObject.put("RefreshToken", t18Var.f216174d);
            jSONObject.put("TokenCreationEpochInSecs", t18Var.f216176f);
            jSONObject.put("ExpiresInSecs", t18Var.f216175e);
            jSONObject.put("FisError", t18Var.f216177g);
            faz fazVar = (faz) this.f226773c;
            fazVar.m41197a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", fazVar.f67665a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(m82352a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override // p204p.y561
    /* JADX INFO: renamed from: e */
    public void mo34937e(x561 x561Var) {
        kgg1.m56347j(x561Var, (Object[]) this.f226773c);
    }

    @Override // p204p.iab
    /* JADX INFO: renamed from: f */
    public void mo31884f(y8b y8bVar, IOException iOException) {
        switch (this.f226771a) {
            case 0:
                try {
                    ((hab) this.f226772b).mo25646l((x4l0) this.f226773c, iOException);
                } catch (Throwable th) {
                    zn91.m96574r0(th);
                    th.printStackTrace();
                    return;
                }
                break;
            default:
                yvu0.m94746c((yvu0) this.f226772b, iOException, null, 6);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public Object m82356g(Throwable th, String str, String str2, ibk ibkVar) {
        o811 o811Var;
        String str3;
        String str4;
        ur01 ur01Var;
        if (ibkVar instanceof o811) {
            o811Var = (o811) ibkVar;
            int i = o811Var.f162678f;
            if ((i & Integer.MIN_VALUE) != 0) {
                o811Var.f162678f = i - Integer.MIN_VALUE;
            } else {
                o811Var = new o811(this, ibkVar);
            }
        } else {
            o811Var = new o811(this, ibkVar);
        }
        Object objM44323e = o811Var.f162676d;
        int i2 = o811Var.f162678f;
        if (i2 == 0) {
            bga.m29073P(objM44323e);
            if (th instanceof ShareablesBitmapParseException) {
                ur01Var = new ur01(stz0.m79350d(2), str2, str, "Bitmap returned from shareables failed to be parsed", sxg1.m79617E(th));
            } else {
                str3 = str;
                str4 = str2;
                gcu0 gcu0Var = (gcu0) this.f226772b;
                o811Var.f162673a = th;
                o811Var.f162674b = str3;
                o811Var.f162675c = str4;
                o811Var.f162678f = 1;
                objM44323e = gcu0Var.m44323e(o811Var);
                yuk yukVar = yuk.f276404a;
                if (objM44323e == yukVar) {
                    return yukVar;
                }
            }
            ((y0i0) this.f226773c).m92591i(ur01Var);
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str5 = o811Var.f162675c;
        String str6 = o811Var.f162674b;
        th = o811Var.f162673a;
        bga.m29073P(objM44323e);
        str3 = str6;
        str4 = str5;
        ur01Var = ((Boolean) objM44323e).booleanValue() ? new ur01(stz0.m79350d(3), str4, str3, "Device offline", sxg1.m79617E(th)) : new ur01(stz0.m79350d(1), str4, str3, "Failure loading an image from shareables", sxg1.m79617E(th));
        ((y0i0) this.f226773c).m92591i(ur01Var);
        return w2a1.f247311a;
    }

    @Override // p204p.sb11
    public Context getContext() {
        return (Context) this.f226773c;
    }

    @Override // p204p.y561
    /* JADX INFO: renamed from: h */
    public String mo34938h() {
        return (String) this.f226772b;
    }

    /* JADX INFO: renamed from: i */
    public void m82357i(dod1 dod1Var, int i, int i2, String str) {
        yyr yyrVarM13840t = DjInteractivityConnectionAttempt.m13840t();
        yyrVarM13840t.m94950m(dod1Var.m36528a());
        yyrVarM13840t.m94954t(dod1Var.m36529b());
        ((wy3) ((xre) this.f226773c)).getClass();
        yyrVarM13840t.m94955u(System.currentTimeMillis());
        yyrVarM13840t.m94951q(t3d1.m80008w(i));
        yyrVarM13840t.m94953s(i2);
        if (str != null) {
            yyrVarM13840t.m94952r(str);
        }
        DjInteractivityConnectionAttempt djInteractivityConnectionAttempt = (DjInteractivityConnectionAttempt) yyrVarM13840t.build();
        qre0 qre0Var = (qre0) this.f226772b;
        wj50.m88279p(djInteractivityConnectionAttempt);
        qre0Var.m73616a(djInteractivityConnectionAttempt);
    }

    @Override // p204p.sb11
    /* JADX INFO: renamed from: j */
    public wb11 mo55493j() {
        return (jv31) this.f226772b;
    }

    /* JADX INFO: renamed from: k */
    public d850 m82358k(zag1 zag1Var) {
        cbh0 cbh0Var = (cbh0) this.f226773c;
        i4t0 i4t0Var = (i4t0) this.f226772b;
        if (zag1Var.equals(e750.f56834c)) {
            return ((kv91) i4t0Var.get()).mo57453r(cbh0Var.m32165l().m72858e().m72867p(), null);
        }
        if (zag1Var instanceof w750) {
            w750 w750Var = (w750) zag1Var;
            return ((kv91) i4t0Var.get()).mo57453r(cbh0Var.m32165l().m72870s(w750Var.m87316r()).m72864m(w750Var.m87316r()), null);
        }
        if (zag1Var instanceof b750) {
            return ((kv91) i4t0Var.get()).mo57453r(cbh0Var.m32161h().m79600l(((b750) zag1Var).m28359r()), null);
        }
        if (zag1Var instanceof p750) {
            p750 p750Var = (p750) zag1Var;
            return ((kv91) i4t0Var.get()).mo57453r(cbh0Var.m32164k(p750Var.m69249r()).m32022a(p750Var.m69249r()), null);
        }
        if (zag1Var instanceof y750) {
            y750 y750Var = (y750) zag1Var;
            return ((kv91) i4t0Var.get()).mo57453r(cbh0Var.m32169p().m43534h(y750Var.m92988r()).m32022a(y750Var.m92989s()), null);
        }
        if (zag1Var instanceof m750) {
            m750 m750Var = (m750) zag1Var;
            return ((kv91) i4t0Var.get()).mo57453r(cbh0Var.m32165l().m72860i(Integer.valueOf(m750Var.m61048t()), m750Var.m61047s()).m72857a(m750Var.m61046r()), null);
        }
        if (zag1Var instanceof h750) {
            return ((kv91) i4t0Var.get()).mo57453r(cbh0Var.m32165l().m72859h(((h750) zag1Var).m46756r()).m72868q(), null);
        }
        if (!(zag1Var instanceof g750)) {
            throw new NoWhenBranchMatchedException();
        }
        g750 g750Var = (g750) zag1Var;
        return ((kv91) i4t0Var.get()).mo57453r(cbh0Var.m32162i(g750Var.m43799r()).m72869r().m79600l(g750Var.m43800s()), null);
    }

    /* JADX INFO: renamed from: l */
    public void m82359l(boolean z) {
        ((kv91) ((er70) this.f226772b).get()).mo57453r(((xug0) this.f226773c).m92190o(z ? o7t0.m66387a(1) : o7t0.m66387a(2)).m79596h().m79605q(), null);
    }

    /* JADX INFO: renamed from: n */
    public void m82360n(int i, String str) {
        ((kv91) ((er70) this.f226772b).get()).mo57453r(((xug0) this.f226773c).m92190o(o7t0.m66387a(1)).m79610v().m79603o(Integer.valueOf(i), str), null);
    }

    /* JADX INFO: renamed from: o */
    public t18 m82361o() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m82352a());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = t18.f216170h;
        s18 s18Var = new s18();
        s18Var.m76930m(0L);
        s18Var.m76929l(1);
        s18Var.m76925h(0L);
        s18Var.m76926i(strOptString);
        s18Var.m76929l(p3n0._values()[iOptInt]);
        s18Var.m76924g(strOptString2);
        s18Var.m76928k(strOptString3);
        s18Var.m76930m(jOptLong);
        s18Var.m76925h(jOptLong2);
        s18Var.m76927j(strOptString4);
        return s18Var.m76920c();
    }

    /* JADX INFO: renamed from: p */
    public void m82362p(hwv0 hwv0Var, u1h1 u1h1Var, zre0 zre0Var, eh00 eh00Var) {
        sr31 sr31Var = new sr31(TooltipContainer.m9684c((m500) this.f226772b));
        n09 n09VarM25266b = ((aaq0) this.f226773c).m25266b(u1h1Var);
        n09VarM25266b.m63305k(eh00Var);
        sr31Var.m79005v(n09VarM25266b);
        sr31Var.m79006w(hwv0Var.m48950a(), zre0Var);
    }

    /* JADX INFO: renamed from: q */
    public void m82363q(pr41 pr41Var, int i) {
        ((o0e1) this.f226773c).m66013a(new iba((mir0) this.f226772b, pr41Var, false, i));
    }

    @Override // p204p.iab
    /* JADX INFO: renamed from: y */
    public void mo31897y(y8b y8bVar, n2x0 n2x0Var) {
        wt31 source;
        ai21 ai21VarMo33068q;
        int iIntValue;
        switch (this.f226771a) {
            case 0:
                hab habVar = (hab) this.f226772b;
                x4l0 x4l0Var = (x4l0) this.f226773c;
                try {
                    try {
                        habVar.mo25640c(x4l0Var, x4l0Var.m89904d(n2x0Var));
                        return;
                    } catch (Throwable th) {
                        zn91.m96574r0(th);
                        th.printStackTrace();
                        return;
                    }
                } catch (Throwable th2) {
                    zn91.m96574r0(th2);
                    try {
                        habVar.mo25646l(x4l0Var, th2);
                        return;
                    } catch (Throwable th3) {
                        zn91.m96574r0(th3);
                        th3.printStackTrace();
                        return;
                    }
                }
            default:
                try {
                    ck31 ck31VarM94747a = ((yvu0) this.f226772b).m94747a(n2x0Var);
                    sn20 sn20Var = n2x0Var.f149862f;
                    int size = sn20Var.size();
                    int i = 0;
                    int i2 = 0;
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    Integer numM29807r0 = null;
                    Integer numM29807r1 = null;
                    while (i2 < size) {
                        if (sn20Var.m78535d(i2).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                            String strM78538i = sn20Var.m78538i(i2);
                            int i3 = i;
                            while (i3 < strM78538i.length()) {
                                sn20Var = sn20Var;
                                int iM24345f = a0f1.m24345f(strM78538i, ',', i3, i, 4);
                                int iM24343d = a0f1.m24343d(';', i3, iM24345f, strM78538i);
                                String strM24355p = a0f1.m24355p(i3, iM24343d, strM78538i);
                                i3 = iM24343d + 1;
                                if (strM24355p.equalsIgnoreCase("permessage-deflate")) {
                                    if (z) {
                                        z4 = true;
                                    }
                                    while (true) {
                                        i3 = i3;
                                        while (true) {
                                            if (i3 < iM24345f) {
                                                int iM24343d2 = a0f1.m24343d(';', i3, iM24345f, strM78538i);
                                                int iM24343d3 = a0f1.m24343d('=', i3, iM24343d2, strM78538i);
                                                String strM24355p2 = a0f1.m24355p(i3, iM24343d3, strM78538i);
                                                String strM88471U0 = iM24343d3 < iM24343d2 ? wl51.m88471U0(a0f1.m24355p(iM24343d3 + 1, iM24343d2, strM78538i)) : null;
                                                i3 = iM24343d2 + 1;
                                                if (strM24355p2.equalsIgnoreCase("client_max_window_bits")) {
                                                    if (numM29807r0 != null) {
                                                        z4 = true;
                                                    }
                                                    numM29807r0 = strM88471U0 != null ? bm51.m29807r0(strM88471U0) : null;
                                                    if (numM29807r0 != null) {
                                                    }
                                                    z4 = true;
                                                } else if (strM24355p2.equalsIgnoreCase("client_no_context_takeover")) {
                                                    if (z2) {
                                                        z4 = true;
                                                    }
                                                    if (strM88471U0 != null) {
                                                        z4 = true;
                                                    }
                                                    z2 = true;
                                                } else {
                                                    if (strM24355p2.equalsIgnoreCase("server_max_window_bits")) {
                                                        if (numM29807r1 != null) {
                                                            z4 = true;
                                                        }
                                                        numM29807r1 = strM88471U0 != null ? bm51.m29807r0(strM88471U0) : null;
                                                        if (numM29807r1 != null) {
                                                        }
                                                    } else if (strM24355p2.equalsIgnoreCase("server_no_context_takeover")) {
                                                        if (z3) {
                                                            z4 = true;
                                                        }
                                                        if (strM88471U0 != null) {
                                                            z4 = true;
                                                        }
                                                        z3 = true;
                                                    }
                                                    z4 = true;
                                                }
                                            } else {
                                                z = true;
                                            }
                                        }
                                    }
                                } else {
                                    i3 = i3;
                                    z4 = true;
                                }
                                i = 0;
                            }
                        }
                        i2++;
                        sn20Var = sn20Var;
                        i = 0;
                    }
                    ((yvu0) this.f226772b).f276754d = new rld1(z, numM29807r0, z2, numM29807r1, z3, z4);
                    if (z4 || numM29807r0 != null || (numM29807r1 != null && (8 > (iIntValue = numM29807r1.intValue()) || iIntValue >= 16))) {
                        yvu0 yvu0Var = (yvu0) this.f226772b;
                        synchronized (yvu0Var) {
                            yvu0Var.f276766p.clear();
                            yvu0Var.m94748b(ContentMediaFormat.EXTRA_GENERIC, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    String str = c0f1.f32775b + " WebSocket " + ((auw0) this.f226773c).f20037a.m69944h();
                    yvu0 yvu0Var2 = (yvu0) this.f226772b;
                    rb5 rb5VarM97321t = zzg1.m97321t(ck31VarM94747a);
                    rld1 rld1Var = yvu0Var2.f276754d;
                    wj50.m88279p(rld1Var);
                    synchronized (yvu0Var2) {
                        try {
                            yvu0Var2.f276763m = str;
                            yvu0Var2.f276764n = rb5VarM97321t;
                            yvu0Var2.f276761k = new zld1((tuu0) rb5VarM97321t.f197473d, yvu0Var2.f276752b, rld1Var.f200294a, rld1Var.f200296c, yvu0Var2.f276755e);
                            yvu0Var2.f276759i = new tqr(yvu0Var2);
                            long j = yvu0Var2.f276753c;
                            if (j != 0) {
                                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                                kv61 kv61Var = yvu0Var2.f276762l;
                                String strConcat = str.concat(" ping");
                                lr4 lr4Var = new lr4(yvu0Var2, nanos, 1);
                                kv61Var.getClass();
                                kv61Var.m57443d(new jv61(strConcat, lr4Var), nanos);
                            }
                            if (!yvu0Var2.f276766p.isEmpty()) {
                                yvu0Var2.m94750e();
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                        break;
                    }
                    yvu0Var2.f276760j = new uld1((vuu0) rb5VarM97321t.f197472c, yvu0Var2, rld1Var.f200294a, rld1Var.f200298e);
                    yvu0 yvu0Var3 = (yvu0) this.f226772b;
                    try {
                        yvu0Var3.f276751a.mo40718G(yvu0Var3, n2x0Var);
                        while (yvu0Var3.f276769s == -1) {
                            uld1 uld1Var = yvu0Var3.f276760j;
                            wj50.m88279p(uld1Var);
                            uld1Var.m83364a();
                        }
                    } catch (Exception e) {
                        yvu0.m94746c(yvu0Var3, e, null, 6);
                    } finally {
                        yvu0Var3.m94749d();
                    }
                    return;
                } catch (IOException e2) {
                    yvu0.m94746c((yvu0) this.f226772b, e2, n2x0Var, 4);
                    a0f1.m24341b(n2x0Var);
                    ck31 ck31Var = n2x0Var.f149864h;
                    if (ck31Var != null && (ai21VarMo33068q = ck31Var.mo33068q()) != null) {
                        a0f1.m24341b(ai21VarMo33068q);
                    }
                    ck31 ck31Var2 = n2x0Var.f149864h;
                    if (ck31Var2 == null || (source = ck31Var2.getSource()) == null) {
                        return;
                    }
                    a0f1.m24341b(source);
                    return;
                }
        }
    }

    public u4l0() {
        this.f226771a = 14;
        this.f226772b = new ArrayList();
        this.f226773c = "";
    }

    public u4l0(kv91 kv91Var, int i) {
        this.f226771a = i;
        switch (i) {
            case 21:
                this.f226772b = kv91Var;
                this.f226773c = new LinkedHashSet();
                break;
            default:
                this.f226772b = kv91Var;
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                this.f226773c = g391.m43461t(xgg1.m90796g3().f36166c);
                break;
        }
    }

    public u4l0(xb5 xb5Var) {
        this.f226771a = 4;
        this.f226772b = xb5Var;
        this.f226773c = new Bundle();
    }

    public u4l0(o330 o330Var, cgm cgmVar, jhx0 jhx0Var) {
        this.f226771a = 20;
        this.f226772b = o330Var;
        this.f226773c = cgmVar;
    }

    public u4l0(qy8 qy8Var, Object obj, gw41 gw41Var, gh00 gh00Var) {
        this.f226771a = 24;
        m12 m12Var = new m12(qy8Var.getBehavior(), obj, gw41Var, gh00Var);
        this.f226772b = qy8Var;
        this.f226773c = m12Var;
    }

    public u4l0(yya1 yya1Var) {
        this.f226771a = 25;
        this.f226772b = (PendingIntent) yya1Var.f277453b;
        this.f226773c = (Integer) yya1Var.f277454c;
    }

    public u4l0(m500 m500Var, t5m0 t5m0Var, aaq0 aaq0Var) {
        this.f226771a = 12;
        this.f226772b = m500Var;
        this.f226773c = aaq0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u4l0(eh00 eh00Var) {
        this.f226771a = 27;
        this.f226772b = (qe70) eh00Var;
    }

    public u4l0(ExecutorService executorService) {
        this.f226771a = 13;
        this.f226773c = new uj5(0);
        this.f226772b = executorService;
    }

    public u4l0(fiz fizVar, ysk yskVar, fiz fizVar2, vjz vjzVar, fiz fizVar3, ysk yskVar2, pzs0 pzs0Var, fiz fizVar4, ysk yskVar3, fiz fizVar5) {
        this.f226771a = 8;
        nlz nlzVarM43301f = g0g1.m43301f(g0g1.m43300e(fizVar2, g0g1.m43299d(kyf1.m57709n(fizVar, new mri0(7)), kyf1.m57709n(fizVar3, new mri0(8)), new qq80()), kyf1.m57709n(yskVar2, new mri0(9)), g0g1.m43299d(kyf1.m57709n(fizVar5, new mri0(10)), kyf1.m57709n(fizVar4, new mri0(11)), new m3p0()), kyf1.m57709n(yskVar3, new mri0(12)), new n3p0(null)), vjzVar, kyf1.m57709n(pzs0Var.m71779q(), new mri0(5)), kyf1.m57709n(yskVar, new mri0(6)), new y33());
        this.f226772b = nlzVarM43301f;
        this.f226773c = new ou8(nlzVarM43301f, 10);
    }

    public u4l0(faz fazVar) {
        this.f226771a = 3;
        this.f226773c = fazVar;
    }

    public u4l0(x4l0 x4l0Var, hab habVar) {
        this.f226771a = 0;
        this.f226773c = x4l0Var;
        this.f226772b = habVar;
    }
}
