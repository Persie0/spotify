package com.spotify.serviceapi.android.quasarworker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import p204p.bga;
import p204p.c6x0;
import p204p.cit0;
import p204p.dcq0;
import p204p.e890;
import p204p.fbk;
import p204p.hqb;
import p204p.ibk;
import p204p.iso0;
import p204p.l7t0;
import p204p.luk;
import p204p.m3s0;
import p204p.n5q;
import p204p.ojq;
import p204p.rhy0;
import p204p.seg1;
import p204p.tlp;
import p204p.x0h1;
import p204p.xsr;
import p204p.xuk;
import p204p.yuk;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/serviceapi/android/quasarworker/QuasarWorker;", "", "ScopeContext", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "src_main_java_com_spotify_serviceapi_android_quasarworker-quasarworker"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class QuasarWorker<ScopeContext> extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f6648g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference f6649h;

    /* JADX INFO: renamed from: i */
    public final AtomicReference f6650i;

    /* JADX INFO: renamed from: j */
    public final luk f6651j;

    public QuasarWorker(Context context, WorkerParameters workerParameters) {
        super(context.getApplicationContext(), workerParameters);
        this.f6648g = new AtomicBoolean(false);
        this.f6649h = new AtomicReference(null);
        this.f6650i = new AtomicReference(null);
        n5q n5qVar = xsr.f265651a;
        this.f6651j = tlp.f221498c.mo40637Q(10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public static final Object m20943i(QuasarWorker quasarWorker, xuk xukVar, ibk ibkVar) {
        cit0 cit0Var;
        if (ibkVar instanceof cit0) {
            cit0Var = (cit0) ibkVar;
            int i = cit0Var.f38434c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cit0Var.f38434c = i - Integer.MIN_VALUE;
            } else {
                cit0Var = new cit0(quasarWorker, ibkVar);
            }
        } else {
            cit0Var = new cit0(quasarWorker, ibkVar);
        }
        Object objM48221p = cit0Var.f38432a;
        int i2 = cit0Var.f38434c;
        if (i2 == 0) {
            bga.m29073P(objM48221p);
            cit0Var.f38434c = 1;
            hqb hqbVar = new hqb(1, seg1.m77914f(cit0Var));
            hqbVar.m48222q();
            try {
                quasarWorker.mo6808n().mo75534a(quasarWorker.mo6809o(), new dcq0(xukVar, hqbVar, quasarWorker, 8));
            } catch (Exception e) {
                hqbVar.resumeWith(new c6x0(e));
            }
            objM48221p = hqbVar.m48221p();
            yuk yukVar = yuk.f276404a;
            if (objM48221p == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM48221p);
        }
        return (ojq) objM48221p;
    }

    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: f */
    public final Object mo750f(fbk fbkVar) {
        return x0h1.m89557A(this.f6651j, new iso0(this, null, 27), fbkVar);
    }

    /* JADX INFO: renamed from: j */
    public abstract long mo15755j();

    /* JADX INFO: renamed from: k */
    public abstract Object mo6805k(Object obj, l7t0 l7t0Var);

    /* JADX INFO: renamed from: l */
    public abstract long mo6806l();

    /* JADX INFO: renamed from: m */
    public abstract long mo6807m();

    /* JADX INFO: renamed from: n */
    public abstract rhy0 mo6808n();

    /* JADX INFO: renamed from: o */
    public abstract String mo6809o();

    /* JADX INFO: renamed from: p */
    public void mo15756p() {
    }

    /* JADX INFO: renamed from: r */
    public void mo6810r(int i) {
    }

    /* JADX INFO: renamed from: s */
    public void mo6811s(Exception exc) {
    }

    /* JADX INFO: renamed from: t */
    public void mo15758t() {
    }

    /* JADX INFO: renamed from: u */
    public abstract Object mo15759u(iso0 iso0Var);

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v3 double) = (r0v0 double), (r0v1 double) binds: [B:3:0x0004, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: v */
    public final void m20944v(double d) {
        double d2 = 0.0d;
        if (d < 0.0d) {
            d = d2;
        } else {
            d2 = 100.0d;
            if (d > 100.0d) {
                d = d2;
            }
        }
        this.f6649h.set(new m3s0(d, mo15755j()));
    }

    /* JADX INFO: renamed from: w */
    public abstract Object mo15760w(iso0 iso0Var);

    /* JADX INFO: renamed from: q */
    public void mo15757q(e890 e890Var) {
    }
}
