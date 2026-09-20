package p204p;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCaptureSession;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.ArrayMap;
import android.view.ActionMode;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaSessionManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.facebook.FacebookException;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.CallbackExceptionImpl;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zq4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f285303a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f285304b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f285305c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f285306d;

    public /* synthetic */ zq4(Object obj, Object obj2, Object obj3, int i) {
        this.f285303a = i;
        this.f285304b = obj;
        this.f285305c = obj2;
        this.f285306d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        Bitmap bitmap = null;
        switch (this.f285303a) {
            case 0:
                ar4 ar4Var = (ar4) this.f285304b;
                xq4 xq4Var = (xq4) this.f285305c;
                yq4 yq4Var = (yq4) this.f285306d;
                ActionMode actionModeStartActionMode = ar4Var.f18930a.startActionMode(new ciz(xq4Var), 1);
                wj50.m88271j(ar4Var.f18937h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    yq4Var.close();
                    return;
                }
                return;
            case 1:
                fw40 fw40Var = (fw40) this.f285304b;
                r300 r300Var = (r300) this.f285305c;
                kro kroVar = (kro) this.f285306d;
                j57 j57Var = (j57) fw40Var.f73935c;
                String str = h0b1.f86200a;
                j57Var.mo29562p(r300Var, kroVar);
                return;
            case 2:
                AudioTrack audioTrack = (AudioTrack) this.f285304b;
                Handler handler = (Handler) this.f285305c;
                n890 n890Var = (n890) this.f285306d;
                int i4 = 10;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC2210od(n890Var, i4));
                    }
                    synchronized (i77.f99438s) {
                        try {
                            int i5 = i77.f99440u - 1;
                            i77.f99440u = i5;
                            if (i5 == 0) {
                                ScheduledExecutorService scheduledExecutorService = i77.f99439t;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                i77.f99439t = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC2210od(n890Var, i4));
                    }
                    synchronized (i77.f99438s) {
                        try {
                            int i6 = i77.f99440u - 1;
                            i77.f99440u = i6;
                            if (i6 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = i77.f99439t;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                i77.f99439t = null;
                            }
                            throw th2;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            case 3:
                wcb wcbVar = (wcb) this.f285304b;
                Executor executor = (Executor) this.f285305c;
                wdb wdbVar = (wdb) this.f285306d;
                tcb tcbVar = wcbVar.f250009x;
                ((HashSet) tcbVar.f219059b).add(wdbVar);
                ((ArrayMap) tcbVar.f219060c).put(wdbVar, executor);
                return;
            case 4:
                ((jeb) this.f285304b).f111518a.onSurfacePrepared((CameraCaptureSession) this.f285305c, (Surface) this.f285306d);
                return;
            case 5:
                WorkDatabase workDatabase = (WorkDatabase) this.f285304b;
                String str2 = (String) this.f285305c;
                l0e1 l0e1Var = (l0e1) this.f285306d;
                o1e1 o1e1VarMo1155F = workDatabase.mo1155F();
                o1e1VarMo1155F.getClass();
                TreeMap treeMap = ojx0.f166164i;
                ojx0 ojx0VarM50495m = ig31.m50495m(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                ojx0VarM50495m.mo38269L0(1, str2);
                WorkDatabase_Impl workDatabase_Impl = o1e1VarMo1155F.f160711a;
                workDatabase_Impl.m59182b();
                Cursor cursorM65531q = nsf1.m65531q(workDatabase_Impl, ojx0VarM50495m, false);
                try {
                    ArrayList arrayList = new ArrayList(cursorM65531q.getCount());
                    while (cursorM65531q.moveToNext()) {
                        arrayList.add(cursorM65531q.getString(0));
                    }
                    cursorM65531q.close();
                    ojx0VarM50495m.m67120a();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        cv9.m33993k((String) it.next(), l0e1Var);
                    }
                    return;
                } catch (Throwable th4) {
                    cursorM65531q.close();
                    ojx0VarM50495m.m67120a();
                    throw th4;
                }
            case 6:
                h0b1.m46304c0(((rpd0) this.f285305c).f201552l, new fxf(i, (bxb) this.f285304b, (rxi) this.f285306d));
                return;
            case 7:
                a3l a3lVar = (a3l) this.f285304b;
                String str3 = (String) this.f285305c;
                String str4 = (String) this.f285306d;
                v2l v2lVar = a3lVar.f11989h;
                v2lVar.getClass();
                try {
                    ((s831) v2lVar.f236681d.f39343e).m77455c(str3, str4);
                    return;
                } catch (IllegalArgumentException e) {
                    Context context = v2lVar.f236678a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    return;
                }
            case 8:
                dbm dbmVar = (dbm) this.f285304b;
                awa0 awa0Var = (awa0) this.f285305c;
                Bundle bundle = (Bundle) this.f285306d;
                try {
                    dbmVar.m30995u(bundle, awa0Var);
                    dbmVar.m51843R(awa0Var, bundle, null);
                    return;
                } catch (FacebookException e2) {
                    dbmVar.m51843R(awa0Var, null, e2);
                    return;
                }
            case 9:
                hcn hcnVar = (hcn) this.f285304b;
                hab habVar = (hab) this.f285305c;
                o2x0 o2x0Var = (o2x0) this.f285306d;
                j1p j1pVar = (j1p) hcnVar.f89846c;
                if (j1pVar.f107811b.mo52181o()) {
                    habVar.mo25646l(j1pVar, new IOException("Canceled"));
                    return;
                } else {
                    habVar.mo25640c(j1pVar, o2x0Var);
                    return;
                }
            case 10:
                ((hab) this.f285305c).mo25646l((j1p) ((hcn) this.f285304b).f89846c, (Throwable) this.f285306d);
                return;
            case 11:
                ViewGroup viewGroup = (ViewGroup) this.f285304b;
                View view = (View) this.f285305c;
                o9q o9qVar = (o9q) this.f285306d;
                viewGroup.endViewTransition(view);
                ((jx31) o9qVar.f163121c.f57320b).m54494c(o9qVar);
                return;
            case 12:
                jx31 jx31Var = (jx31) this.f285304b;
                jx31 jx31Var2 = (jx31) this.f285305c;
                w9q w9qVar = (w9q) this.f285306d;
                i500 i500Var = jx31Var.f116782c;
                i500 i500Var2 = jx31Var2.f116782c;
                boolean z = w9qVar.f249243o;
                p800 p800Var = k800.f120225a;
                if (z) {
                    i500Var2.getClass();
                    return;
                } else {
                    i500Var.getClass();
                    return;
                }
            case 13:
                cbq cbqVar = (cbq) this.f285304b;
                Runnable runnable = (Runnable) this.f285305c;
                Runnable runnable2 = (Runnable) this.f285306d;
                if (cbqVar.f36183t) {
                    runnable.run();
                    return;
                } else {
                    runnable2.run();
                    return;
                }
            case 14:
                ehs ehsVar = (ehs) this.f285304b;
                ((fhs) this.f285305c).mo40363D(ehsVar.f59655a, ehsVar.f59656b, (Exception) this.f285306d);
                return;
            case 15:
                ehs ehsVar2 = (ehs) this.f285304b;
                fhs fhsVar = (fhs) this.f285305c;
                m57 m57Var = (m57) this.f285306d;
                int i7 = ehsVar2.f59655a;
                vsd0 vsd0Var = ehsVar2.f59656b;
                fhsVar.mo41682f();
                fhsVar.mo40364J(i7, vsd0Var, m57Var);
                return;
            case 16:
                kjs kjsVar = (kjs) this.f285304b;
                Runnable runnable3 = (Runnable) this.f285305c;
                Runnable runnable4 = (Runnable) this.f285306d;
                if (kjsVar.f123416f) {
                    runnable3.run();
                    return;
                } else {
                    runnable4.run();
                    return;
                }
            case 17:
                C2488va c2488va = (C2488va) this.f285304b;
                id6 id6Var = (id6) this.f285305c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f285306d;
                try {
                    szz szzVarM54478b = new jwo(5).m54478b(c2488va.f239071a);
                    if (szzVarM54478b == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    rzz rzzVar = (rzz) szzVarM54478b.f120194a;
                    synchronized (rzzVar.f204259d) {
                        rzzVar.f204261f = threadPoolExecutor;
                        break;
                    }
                    szzVarM54478b.f120194a.mo66404a(new s7u(id6Var, threadPoolExecutor));
                    return;
                } catch (Throwable th5) {
                    id6Var.mo49880k(th5);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 18:
                j9v j9vVar = (j9v) this.f285304b;
                Intent intent = (Intent) this.f285305c;
                ev61 ev61Var = (ev61) this.f285306d;
                try {
                    j9vVar.mo1898b(intent);
                    return;
                } finally {
                    ev61Var.m40097b(null);
                }
            case 19:
                String str5 = (String) this.f285304b;
                Context context2 = (Context) this.f285305c;
                String str6 = (String) this.f285306d;
                jty jtyVar = jty.f115983a;
                JSONObject jSONObjectM54318a = jty.m54318a();
                if (jSONObjectM54318a.length() != 0) {
                    jty.m54321e(str5, jSONObjectM54318a);
                    context2.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str6, jSONObjectM54318a.toString()).apply();
                    jty.f115987e = Long.valueOf(System.currentTimeMillis());
                }
                jty.m54322f();
                jty.f115984b.set(false);
                return;
            case 20:
                ((i440) this.f285304b).f98427a.m52323a((Bitmap) this.f285305c, (r300) this.f285306d);
                return;
            case 21:
                ck40 ck40Var = (ck40) this.f285304b;
                jk40 jk40Var = (jk40) this.f285305c;
                Runnable runnable5 = (Runnable) this.f285306d;
                if (p2l.f173365a.contains(ck40.class)) {
                    return;
                }
                try {
                    Class cls = ck40Var.f38808f;
                    kk40.m56649K(ck40Var.f38804b, ck40Var.m33073d(), ck40Var.f38812j, jk40Var.f113208a, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new zj40(ck40Var, jk40Var, runnable5)));
                    return;
                } catch (Throwable th6) {
                    p2l.m68953a(ck40.class, th6);
                    return;
                }
            case 22:
                dk40 dk40Var = (dk40) this.f285304b;
                jk40 jk40Var2 = (jk40) this.f285305c;
                Runnable runnable6 = (Runnable) this.f285306d;
                if (p2l.f173365a.contains(dk40.class)) {
                    return;
                }
                try {
                    Class cls2 = dk40Var.f49865o;
                    kk40.m56649K(dk40Var.f49852b, dk40Var.m36248d(), dk40Var.f49867q, dk40Var.m36251g(jk40Var2), Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new bk40(dk40Var, new Object[]{jk40Var2, runnable6}, i3)));
                    return;
                } catch (Throwable th7) {
                    p2l.m68953a(dk40.class, th7);
                    return;
                }
            case 23:
                je60 je60Var = (je60) this.f285304b;
                String str7 = (String) this.f285305c;
                ve60 ve60Var = (ve60) this.f285306d;
                why0.m88178a("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + str7 + " running callback");
                try {
                    ue60 ue60Var = ((se60) je60Var).f208223m;
                    try {
                        ve60Var.mo98370run();
                        break;
                    } catch (Throwable th8) {
                        ue60Var.m82893b(new CallbackExceptionImpl("Exception received from UploadDataProvider", th8));
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th9) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th10) {
                        th9.addSuppressed(th10);
                    }
                    throw th9;
                }
            case 24:
                ue60 ue60Var2 = (ue60) this.f285304b;
                String str8 = (String) this.f285305c;
                yka1 yka1Var = (yka1) this.f285306d;
                String string = URI.create(ue60Var2.f229426m).resolve(str8).toString();
                ue60Var2.f229429p = string;
                ue60Var2.f229418e.add(string);
                ue60Var2.m82897f(2, 3, new zaz(8, ue60Var2, yka1Var));
                return;
            case 25:
                re60 re60Var = (re60) this.f285304b;
                UrlResponseInfo urlResponseInfo = (UrlResponseInfo) this.f285305c;
                CronetException cronetException = (CronetException) this.f285306d;
                ue60 ue60Var3 = re60Var.f198294d;
                try {
                    re60Var.f198291a.onFailed(ue60Var3, urlResponseInfo, cronetException);
                    break;
                } catch (Exception unused) {
                    ue60Var3.f229438y = true;
                }
                re60Var.m75385d();
                ue60Var3.f229432s.f68353e.decrementAndGet();
                return;
            case 26:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f285304b;
                gbb gbbVar = (gbb) this.f285305c;
                eh00 eh00Var = (eh00) this.f285306d;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    gbbVar.m44211b(eh00Var.invoke());
                    return;
                } catch (Throwable th11) {
                    gbbVar.m44212c(th11);
                    return;
                }
            case 27:
                xh70 xh70Var = (xh70) this.f285304b;
                dk90 dk90Var = (dk90) this.f285305c;
                dk90 dk90Var2 = (dk90) this.f285306d;
                xoi0 xoi0Var = (xoi0) xh70Var.f261460b;
                if (dk90Var != null) {
                    xoi0Var.mo33102k(dk90Var);
                }
                xoi0Var.m33100g(dk90Var2);
                return;
            case 28:
                u790 u790Var = (u790) this.f285304b;
                t601 t601Var = (t601) this.f285305c;
                ufd0 ufd0Var = (ufd0) this.f285306d;
                try {
                    bitmap = (Bitmap) vgg1.m85481v(u790Var);
                } catch (CancellationException | ExecutionException e3) {
                    yif1.m93804p(e3, "failed to get bitmap");
                }
                t601Var.m28330u(x280.m89719a(ufd0Var, bitmap));
                return;
            default:
                pgd0 pgd0Var = (pgd0) this.f285304b;
                MediaSessionManager.RemoteUserInfo remoteUserInfo = (MediaSessionManager.RemoteUserInfo) this.f285305c;
                MediaBrowserServiceCompat.Result result = (MediaBrowserServiceCompat.Result) this.f285306d;
                bxb bxbVar = pgd0Var.f157497c;
                tnd0 tnd0VarM30808v = bxbVar.m30808v(remoteUserInfo);
                if (tnd0VarM30808v == null) {
                    result.sendResult(null);
                    return;
                } else if (!bxbVar.m30772C(tnd0VarM30808v, 50004)) {
                    result.sendResult(null);
                    return;
                } else {
                    t601 t601VarM46324m0 = h0b1.m46324m0(pgd0Var.f177293d.m36016I(tnd0VarM30808v), new hgd0(pgd0Var, i2));
                    t601VarM46324m0.mo28322a(new lgd0(t601VarM46324m0, result, i2), ckr.f39074a);
                    return;
                }
        }
    }

    public /* synthetic */ zq4(pgd0 pgd0Var, MediaSessionManager.RemoteUserInfo remoteUserInfo, MediaBrowserServiceCompat.Result result, String str) {
        this.f285303a = 29;
        this.f285304b = pgd0Var;
        this.f285305c = remoteUserInfo;
        this.f285306d = result;
    }
}
