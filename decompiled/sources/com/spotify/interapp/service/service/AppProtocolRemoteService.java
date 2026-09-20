package com.spotify.interapp.service.service;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.spotify.appauthorization.sso.ClientIdentity$ValidationException;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoFinally;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import p204p.InterfaceC1810ed;
import p204p.RunnableC2210od;
import p204p.a301;
import p204p.ac50;
import p204p.b6q;
import p204p.c5f0;
import p204p.c95;
import p204p.cd5;
import p204p.cke;
import p204p.cx21;
import p204p.fke;
import p204p.fzj;
import p204p.hfn;
import p204p.hmm;
import p204p.i6o;
import p204p.id8;
import p204p.iwr;
import p204p.jwz0;
import p204p.lwz0;
import p204p.lzj;
import p204p.m401;
import p204p.m94;
import p204p.mcu0;
import p204p.myx;
import p204p.ny30;
import p204p.ob5;
import p204p.oh5;
import p204p.qre0;
import p204p.qwx0;
import p204p.skp;
import p204p.tw80;
import p204p.u4i;
import p204p.uzx;
import p204p.v0i0;
import p204p.vme0;
import p204p.vv2;
import p204p.vzx;
import p204p.wc5;
import p204p.wd20;
import p204p.wm21;
import p204p.xc5;
import p204p.xf40;
import p204p.xhy0;
import p204p.xre;
import p204p.yc5;
import p204p.yd20;
import p204p.zc5;
import p204p.zxx0;

/* JADX INFO: loaded from: classes7.dex */
public class AppProtocolRemoteService extends i6o {

    /* JADX INFO: renamed from: c1 */
    public static final /* synthetic */ int f4610c1 = 0;

    /* JADX INFO: renamed from: L0 */
    public zxx0 f4611L0;

    /* JADX INFO: renamed from: M0 */
    public xre f4612M0;

    /* JADX INFO: renamed from: N0 */
    public myx f4613N0;

    /* JADX INFO: renamed from: O0 */
    public wc5 f4614O0;

    /* JADX INFO: renamed from: P0 */
    public String f4615P0;

    /* JADX INFO: renamed from: Q0 */
    public mcu0 f4616Q0;

    /* JADX INFO: renamed from: R0 */
    public wm21 f4617R0;

    /* JADX INFO: renamed from: S0 */
    public Map f4618S0;

    /* JADX INFO: renamed from: T0 */
    public InterfaceC1810ed f4619T0;

    /* JADX INFO: renamed from: U0 */
    public qre0 f4620U0;

    /* JADX INFO: renamed from: X */
    public ob5 f4623X;

    /* JADX INFO: renamed from: X0 */
    public uzx f4624X0;

    /* JADX INFO: renamed from: Y */
    public qwx0 f4625Y;

    /* JADX INFO: renamed from: Z */
    public Flowable f4627Z;

    /* JADX INFO: renamed from: Z0 */
    public cke f4628Z0;

    /* JADX INFO: renamed from: a */
    public hfn f4629a;

    /* JADX INFO: renamed from: b */
    public vzx f4631b;

    /* JADX INFO: renamed from: b1 */
    public Handler f4632b1;

    /* JADX INFO: renamed from: c */
    public Flowable f4633c;

    /* JADX INFO: renamed from: d */
    public oh5 f4634d;

    /* JADX INFO: renamed from: e */
    public Scheduler f4635e;

    /* JADX INFO: renamed from: f */
    public jwz0 f4636f;

    /* JADX INFO: renamed from: g */
    public hmm f4637g;

    /* JADX INFO: renamed from: h */
    public m401 f4638h;

    /* JADX INFO: renamed from: i */
    public cx21 f4639i;

    /* JADX INFO: renamed from: t */
    public fke f4640t;

    /* JADX INFO: renamed from: V0 */
    public final Messenger f4621V0 = new Messenger(new cd5(this));

    /* JADX INFO: renamed from: W0 */
    public final HashSet f4622W0 = new HashSet();

    /* JADX INFO: renamed from: Y0 */
    public final iwr f4626Y0 = new iwr();

    /* JADX INFO: renamed from: a1 */
    public final ArrayList f4630a1 = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m12030a(Message message) {
        ApplicationInfo applicationInfo;
        c5f0 c5f0Var = new c5f0(message.replyTo);
        Messenger messenger = c5f0Var.f34159b;
        try {
            oh5 oh5Var = this.f4634d;
            int i = message.arg1;
            oh5Var.getClass();
            String[] packagesForUid = getPackageManager().getPackagesForUid(i);
            if (packagesForUid != null && packagesForUid.length != 0) {
                String str = packagesForUid[0];
                Signature signatureM33119c = cke.m33119c(this, str);
                int i2 = yd20.f271624a;
                vme0 vme0Var = wd20.f250193a;
                byte[] byteArray = signatureM33119c.toByteArray();
                vme0Var.getClass();
                int length = byteArray.length;
                c95.m31852r(0, length, byteArray.length);
                c95.m31842h("expectedInputSize must be >= 0 but was %s", length, length >= 0);
                c95 c95VarMo28837w = vme0Var.mo28837w();
                c95VarMo28837w.mo25556S(byteArray, length);
                cke ckeVar = new cke(str, c95VarMo28837w.mo25555F().toString().toUpperCase(Locale.US));
                PackageManager packageManager = getPackageManager();
                try {
                    applicationInfo = packageManager.getApplicationInfo(str, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    applicationInfo = null;
                }
                ((lwz0) this.f4636f).m60139g("com.spotify.interapp.service.service.AppProtocolRemoteService", getString(R.string.interapp_app_remote_notification_is_connecting, (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : getString(R.string.app_remote_notification_is_connected_fallback))));
                u4i u4iVar = new u4i(new v0i0(), c5f0Var, Executors.newSingleThreadExecutor());
                int[] iArr = {2, 1, 4, 8};
                int i3 = 0;
                for (int i4 = 0; i4 < 4; i4++) {
                    i3 |= iArr[i4];
                }
                xhy0 xhy0Var = new xhy0(i3);
                hfn hfnVar = this.f4629a;
                uzx uzxVar = this.f4624X0;
                fzj fzjVar = new fzj();
                fzjVar.f75030a = xhy0Var;
                a301 a301Var = new a301(this, hfnVar, uzxVar, fzjVar, (ac50) this.f4637g.get(), this.f4635e, this.f4639i, this.f4625Y, this.f4627Z, this.f4611L0, this.f4633c, this.f4612M0, this.f4613N0, this.f4616Q0, this.f4617R0, this.f4618S0);
                b6q b6qVar = new b6q(u4iVar, a301Var, xf40.m90452j("appid", this.f4623X), this.f4638h, ckeVar);
                this.f4630a1.add(b6qVar);
                this.f4628Z0 = ckeVar;
                int i5 = 0;
                u4iVar.f226727f = new ny30(new RunnableC2210od(b6qVar, 5), new yc5(a301Var, i5), new id8(b6qVar, 7), new skp(new zc5(a301Var), i5));
                u4iVar.f226726e = new tw80(b6qVar, u4iVar, this.f4638h, this, this.f4640t, this.f4612M0, this.f4619T0);
                c5f0Var.f34161d = new m94(3, this, b6qVar);
                try {
                    messenger.getBinder().linkToDeath(c5f0Var, 0);
                } catch (RemoteException unused2) {
                    Logger.m3966b("Trying to create a session but client binder is already dead.", new Object[0]);
                    c5f0Var.binderDied();
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.replyTo = c5f0Var.f34158a;
                try {
                    messenger.send(messageObtain);
                    return;
                } catch (RemoteException unused3) {
                    Logger.m3966b("Could not send the message to the remote client", new Object[0]);
                    return;
                }
            }
            try {
                throw new ClientIdentity$ValidationException("Can't find packages for caller id");
            } catch (ClientIdentity$ValidationException unused4) {
            }
        } catch (ClientIdentity$ValidationException unused5) {
        }
        Logger.m3966b("Cannot validate calling identity", new Object[r6]);
        stopSelf();
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 1;
        try {
            messenger.send(messageObtain2);
        } catch (RemoteException unused6) {
            Logger.m3966b("Could not send the message to the remote client", new Object[0]);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f4621V0.getBinder();
    }

    @Override // p204p.i6o, android.app.Service
    public final void onCreate() {
        try {
            lzj.m60362g0(this, 28, 2);
        } catch (Exception unused) {
        }
        super.onCreate();
        this.f4632b1 = new Handler();
        this.f4626Y0.m51848b(new FlowableDoFinally(this.f4631b.m86914a(this.f4615P0).m23332L(this.f4635e), new vv2(this, 1)).subscribe(new xc5(this, 0)));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((lwz0) this.f4636f).m60138f(this, "com.spotify.interapp.service.service.AppProtocolRemoteService");
        this.f4626Y0.m51847a();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ((lwz0) this.f4636f).m60137e(this, "com.spotify.interapp.service.service.AppProtocolRemoteService", Build.VERSION.SDK_INT >= 31 ? 2 : null);
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        if ("android.intent.action.MAIN".equals(intent.getAction())) {
            ArrayList<b6q> arrayList = this.f4630a1;
            for (b6q b6qVar : arrayList) {
                if (b6qVar.f24016l != 2) {
                    b6qVar.m28303b("wamp.error.system_shutdown");
                    m401 m401Var = b6qVar.f24011g;
                    m401Var.getClass();
                    int i = b6qVar.f24009e;
                    ConcurrentHashMap concurrentHashMap = m401Var.f139788a;
                    concurrentHashMap.remove(Integer.valueOf(i));
                    m401Var.f139789b.onNext(new ArrayList(concurrentHashMap.values()));
                }
            }
            arrayList.clear();
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        stopSelf();
        return super.onUnbind(intent);
    }
}
