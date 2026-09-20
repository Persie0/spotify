package p204p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class tbk {

    /* JADX INFO: renamed from: a */
    public final Context f218879a;

    /* JADX INFO: renamed from: b */
    public final xre f218880b;

    /* JADX INFO: renamed from: c */
    public final suj f218881c;

    /* JADX INFO: renamed from: d */
    public final Flowable f218882d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f218883e;

    /* JADX INFO: renamed from: f */
    public final String f218884f;

    /* JADX INFO: renamed from: j */
    public boolean f218888j;

    /* JADX INFO: renamed from: l */
    public gha f218890l;

    /* JADX INFO: renamed from: g */
    public final String f218885g = "spotify:internal:connect:pull";

    /* JADX INFO: renamed from: h */
    public final String f218886h = "&utm_medium=android_crossdevice_sdk";

    /* JADX INFO: renamed from: i */
    public final iwr f218887i = new iwr();

    /* JADX INFO: renamed from: k */
    public final long f218889k = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: m */
    public String f218891m = "";

    /* JADX INFO: renamed from: n */
    public final rbk f218892n = new rbk(this);

    /* JADX INFO: renamed from: o */
    public final sbk f218893o = new sbk(this);

    public tbk(Context context, xre xreVar, suj sujVar, Flowable flowable, Scheduler scheduler) {
        this.f218879a = context;
        this.f218880b = xreVar;
        this.f218881c = sujVar;
        this.f218882d = flowable;
        this.f218883e = scheduler;
        this.f218884f = context.getPackageName() + "." + UUID.randomUUID();
    }

    /* JADX INFO: renamed from: a */
    public final void m80397a() {
        this.f218890l = null;
        if (this.f218888j) {
            try {
                o85.f162705a.deleteAppContext(this.f218879a.getApplicationContext(), this.f218884f, this.f218893o);
            } catch (Exception e) {
                this.f218881c.m79402n("DeleteResume error", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m80398b(long j) {
        boolean z = this.f218888j;
        xre xreVar = this.f218880b;
        if (!z) {
            ((wy3) xreVar).getClass();
            this.f218890l = new gha(j, System.currentTimeMillis());
            return;
        }
        j85 j85Var = new j85();
        j85Var.setType(4);
        Context context = this.f218879a;
        j85Var.setAppId(context.getPackageName());
        j85Var.setContextId(this.f218884f);
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        String strM95636p = z96.m95636p(bArr);
        j85Var.setIntentUri(this.f218885g + "?" + edb.m38566o("user_hash=", z96.m95636p(MessageDigest.getInstance("SHA-256").digest(s571.m77250i(this.f218891m, strM95636p).getBytes(vuc.f244913a))), "&user_salt=", strM95636p) + this.f218886h);
        wy3 wy3Var = (wy3) xreVar;
        wy3Var.getClass();
        j85Var.setCreateTime(System.currentTimeMillis());
        wy3Var.getClass();
        j85Var.setLastUpdatedTime(System.currentTimeMillis());
        j85Var.setLifeTime(j + this.f218889k);
        try {
            o85.f162705a.sendAppContext(context.getApplicationContext(), j85Var, this.f218893o);
        } catch (Exception e) {
            this.f218881c.m79402n("SendResume error", e);
        }
    }
}
