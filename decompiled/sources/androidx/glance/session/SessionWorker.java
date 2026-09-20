package androidx.glance.session;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.b401;
import p204p.bga;
import p204p.d890;
import p204p.du71;
import p204p.e890;
import p204p.fbk;
import p204p.gx31;
import p204p.ibk;
import p204p.luk;
import p204p.n0e1;
import p204p.n5q;
import p204p.pvb0;
import p204p.sco;
import p204p.t101;
import p204p.u1h1;
import p204p.xay0;
import p204p.xsr;
import p204p.yuk;
import p204p.z101;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m24212d2 = {"Landroidx/glance/session/SessionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Lp/t101;", "sessionManager", "Lp/du71;", "timeouts", "Lp/luk;", "coroutineContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/t101;Lp/du71;Lp/luk;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "glance_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public final class SessionWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final WorkerParameters f942g;

    /* JADX INFO: renamed from: h */
    public final t101 f943h;

    /* JADX INFO: renamed from: i */
    public final du71 f944i;

    /* JADX INFO: renamed from: j */
    public final luk f945j;

    /* JADX INFO: renamed from: k */
    public final String f946k;

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionWorker(Context context, WorkerParameters workerParameters, t101 t101Var, du71 du71Var, luk lukVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        t101 t101VarM95089a = (i & 4) != 0 ? z101.m95089a() : t101Var;
        du71 du71Var2 = (i & 8) != 0 ? new du71() : du71Var;
        if ((i & 16) != 0) {
            n5q n5qVar = xsr.f265651a;
            lukVar = pvb0.f181680a;
        }
        this(context, workerParameters, t101VarM95089a, du71Var2, lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: f */
    public final Object mo750f(fbk fbkVar) {
        b401 b401Var;
        if (fbkVar instanceof b401) {
            b401Var = (b401) fbkVar;
            int i = b401Var.f23163c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b401Var.f23163c = i - Integer.MIN_VALUE;
            } else {
                b401Var = new b401(this, (ibk) fbkVar);
            }
        } else {
            b401Var = new b401(this, (ibk) fbkVar);
        }
        Object objM82227v = b401Var.f23161a;
        int i2 = b401Var.f23163c;
        if (i2 == 0) {
            bga.m29073P(objM82227v);
            gx31 gx31VarM36922a = this.f944i.m36922a();
            xay0 xay0Var = new xay0(this, (fbk) null, 19);
            b401Var.f23163c = 1;
            objM82227v = u1h1.m82227v(gx31VarM36922a, xay0Var, b401Var);
            yuk yukVar = yuk.f276404a;
            if (objM82227v == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM82227v);
        }
        e890 e890Var = (e890) objM82227v;
        if (e890Var != null) {
            return e890Var;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("TIMEOUT_EXIT_REASON", Boolean.TRUE);
        sco scoVar = new sco(linkedHashMap);
        n0e1.m63412T(scoVar);
        return new d890(scoVar);
    }

    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g, reason: from getter */
    public final luk getF945j() {
        return this.f945j;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters, t101 t101Var, du71 du71Var, luk lukVar) {
        super(context, workerParameters);
        this.f942g = workerParameters;
        this.f943h = t101Var;
        this.f944i = du71Var;
        this.f945j = lukVar;
        sco scoVar = this.f66917b.f1404b;
        t101Var.getClass();
        String strM77815d = scoVar.m77815d("KEY");
        if (strM77815d == null) {
            throw new IllegalStateException("SessionWorker must be started with a key");
        }
        this.f946k = strM77815d;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, z101.m95089a(), null, null, 24, null);
    }
}
