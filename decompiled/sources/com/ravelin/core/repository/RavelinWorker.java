package com.ravelin.core.repository;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.ravelin.core.model.Events;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.music.R;
import kotlin.Metadata;
import p204p.C2434u;
import p204p.alk0;
import p204p.b2s;
import p204p.b450;
import p204p.b890;
import p204p.bga;
import p204p.e890;
import p204p.edb;
import p204p.epv0;
import p204p.fbk;
import p204p.gk71;
import p204p.h2f1;
import p204p.h4t0;
import p204p.ibk;
import p204p.juk;
import p204p.ktj0;
import p204p.m200;
import p204p.p4b1;
import p204p.q0f1;
import p204p.q8n;
import p204p.rgp0;
import p204p.u2f1;
import p204p.utu0;
import p204p.w050;
import p204p.w2a1;
import p204p.w2f1;
import p204p.wj50;
import p204p.x0h1;
import p204p.xau0;
import p204p.yuk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/ravelin/core/repository/RavelinWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "core_release"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public class RavelinWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: j */
    public static final String f2659j;

    /* JADX INFO: renamed from: k */
    public static final b450 f2660k;

    /* JADX INFO: renamed from: g */
    public final Context f2661g;

    /* JADX INFO: renamed from: h */
    public h2f1 f2662h;

    /* JADX INFO: renamed from: i */
    public alk0 f2663i;

    static {
        String canonicalName = RavelinWorker.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "RavelinWorker";
        }
        f2659j = canonicalName;
        f2660k = new b450(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 504, 1);
    }

    public RavelinWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2661g = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public static Object m2226j(RavelinWorker ravelinWorker, ibk ibkVar) throws Throwable {
        xau0 xau0Var;
        w2a1 w2a1Var;
        if (ibkVar instanceof xau0) {
            xau0Var = (xau0) ibkVar;
            int i = xau0Var.f259770c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xau0Var.f259770c = i - Integer.MIN_VALUE;
            } else {
                xau0Var = new xau0(ravelinWorker, ibkVar);
            }
        } else {
            xau0Var = new xau0(ravelinWorker, ibkVar);
        }
        Object objM89557A = xau0Var.f259768a;
        int i2 = xau0Var.f259770c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                WorkerParameters workerParameters = ravelinWorker.f66917b;
                if (workerParameters.f1405c > 72) {
                    return new b890();
                }
                String strM77815d = workerParameters.f1404b.m77815d("Api");
                String strM77815d2 = workerParameters.f1404b.m77815d("Payload");
                String strM38566o = edb.m38566o("doWork was called with keys: apiKey - ", strM77815d, ", payloadKey - ", strM77815d2);
                utu0 utu0Var = gk71.f80747a;
                String str = f2659j;
                utu0Var.m83940H(str);
                utu0Var.m83952u(strM38566o, new Object[0]);
                fbk fbkVar = null;
                if (strM77815d != null) {
                    ravelinWorker.m2227i(strM77815d);
                    w2a1Var = w2a1.f247311a;
                } else {
                    w2a1Var = null;
                }
                if (w2a1Var == null) {
                    return new b890();
                }
                if (strM77815d == null || strM77815d.length() == 0 || strM77815d2 == null || strM77815d2.length() == 0) {
                    utu0Var.m83940H(str);
                    utu0Var.m83952u("Failed with lack of information", new Object[0]);
                    return new b890();
                }
                Events events = (Events) ((Parcelable) q0f1.m71831e(new p4b1(14)).m41880a(strM77815d2, epv0.m39700t(Events.INSTANCE.serializer())));
                alk0 alk0Var = ravelinWorker.f2663i;
                if (alk0Var == null) {
                    wj50.m88260d0("coroutineContextProvider");
                    throw null;
                }
                juk jukVarM26348a = alk0Var.m26348a();
                rgp0 rgp0Var = new rgp0(ravelinWorker, strM77815d, events, fbkVar, 13);
                xau0Var.f259770c = 1;
                objM89557A = x0h1.m89557A(jukVarM26348a, rgp0Var, xau0Var);
                yuk yukVar = yuk.f276404a;
                if (objM89557A == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89557A);
            }
            return (e890) objM89557A;
        } catch (Exception e) {
            e.getMessage();
            return new b890();
        }
    }

    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: f */
    public Object mo750f(fbk fbkVar) {
        return m2226j(this, (ibk) fbkVar);
    }

    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: h */
    public final Object mo1148h() {
        String str;
        utu0 utu0Var = gk71.f80747a;
        utu0Var.m83940H(f2659j);
        utu0Var.m83952u("Fallback to foreground service", new Object[0]);
        int i = Build.VERSION.SDK_INT;
        Context context = this.f2661g;
        if (i >= 26) {
            str = "Ravelin channel id";
            NotificationChannel notificationChannel = new NotificationChannel("Ravelin channel id", "Ravelin channel", 0);
            notificationChannel.setLightColor(-16776961);
            notificationChannel.setLockscreenVisibility(0);
            ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(notificationChannel);
        } else {
            str = "";
        }
        String packageName = context.getPackageName();
        ktj0 ktj0Var = new ktj0(context, str);
        ktj0Var.f126314e = ktj0.m57322d(packageName);
        ktj0Var.m57339r(packageName);
        ktj0Var.f126315f = ktj0.m57322d("Application doing some work");
        ktj0Var.f126307D.icon = R.drawable.ic_stat_name;
        ktj0Var.m57332k(2, true);
        return new m200(3557, ktj0Var.m57325c(), 0);
    }

    /* JADX INFO: renamed from: i */
    public final void m2227i(String str) {
        u2f1 u2f1Var = new u2f1();
        h4t0 h4t0VarM27972b = b2s.m27972b(new q8n(10, u2f1Var, b2s.m27972b(new q8n(u2f1Var, b2s.m27972b(new C2434u(u2f1Var, b2s.m27972b(new w2f1(u2f1Var, 2)), b2s.m27972b(new w2f1(u2f1Var, 1)), 3)), w050.m86919a(str)))));
        h4t0 h4t0VarM27972b2 = b2s.m27972b(new w2f1(u2f1Var, 0));
        this.f2662h = (h2f1) h4t0VarM27972b.get();
        this.f2663i = (alk0) h4t0VarM27972b2.get();
    }
}
