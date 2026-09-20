package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p204p.b890;
import p204p.bga;
import p204p.c890;
import p204p.e890;
import p204p.f890;
import p204p.fbk;
import p204p.gaz;
import p204p.i1e1;
import p204p.ibk;
import p204p.j6a;
import p204p.kk40;
import p204p.l0e1;
import p204p.luk;
import p204p.n7j;
import p204p.nd0;
import p204p.o7j;
import p204p.p7j;
import p204p.rrd;
import p204p.s7j;
import p204p.uo80;
import p204p.x0h1;
import p204p.yuk;
import p204p.z2h1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m24212d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "p/n7j", "work-runtime_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public final class ConstraintTrackingWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final WorkerParameters f1433g;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f1433g = workerParameters;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public static final Object m1168i(ConstraintTrackingWorker constraintTrackingWorker, f890 f890Var, uo80 uo80Var, i1e1 i1e1Var, ibk ibkVar) {
        o7j o7jVar;
        if (ibkVar instanceof o7j) {
            o7jVar = (o7j) ibkVar;
            int i = o7jVar.f162576c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o7jVar.f162576c = i - Integer.MIN_VALUE;
            } else {
                o7jVar = new o7j(constraintTrackingWorker, ibkVar);
            }
        } else {
            o7jVar = new o7j(constraintTrackingWorker, ibkVar);
        }
        Object obj = o7jVar.f162574a;
        int i2 = o7jVar.f162576c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        nd0 nd0Var = new nd0(f890Var, uo80Var, i1e1Var, (fbk) null, 11);
        o7jVar.f162576c = 1;
        Object objM56684z = kk40.m56684z(nd0Var, o7jVar);
        yuk yukVar = yuk.f276404a;
        return objM56684z == yukVar ? yukVar : objM56684z;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: j */
    public static final Object m1169j(ConstraintTrackingWorker constraintTrackingWorker, ibk ibkVar) {
        p7j p7jVar;
        ConstraintTrackingWorker constraintTrackingWorker2;
        f890 f890Var;
        int i;
        WorkerParameters workerParameters = constraintTrackingWorker.f1433g;
        Context context = constraintTrackingWorker.f66916a;
        WorkerParameters workerParameters2 = constraintTrackingWorker.f66917b;
        if (ibkVar instanceof p7j) {
            p7jVar = (p7j) ibkVar;
            int i2 = p7jVar.f174706e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p7jVar.f174706e = i2 - Integer.MIN_VALUE;
            } else {
                p7jVar = new p7j(constraintTrackingWorker, ibkVar);
            }
        } else {
            p7jVar = new p7j(constraintTrackingWorker, ibkVar);
        }
        p7j p7jVar2 = p7jVar;
        Object objM89557A = p7jVar2.f174704c;
        int i3 = p7jVar2.f174706e;
        if (i3 == 0) {
            bga.m29073P(objM89557A);
            String strM77815d = workerParameters2.f1404b.m77815d("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (strM77815d == null || strM77815d.length() == 0) {
                int i4 = s7j.f206389a;
                gaz.m44190b().getClass();
                return new b890();
            }
            l0e1 l0e1VarM57799S = l0e1.m57799S(context);
            i1e1 i1e1VarM66059j = l0e1VarM57799S.f128405B0.mo1155F().m66059j(workerParameters2.f1403a.toString());
            if (i1e1VarM66059j == null) {
                return new b890();
            }
            uo80 uo80Var = new uo80(l0e1VarM57799S.f128412I0);
            if (!uo80Var.m83595d(i1e1VarM66059j)) {
                int i5 = s7j.f206389a;
                gaz.m44190b().getClass();
                return new c890();
            }
            int i6 = s7j.f206389a;
            gaz.m44190b().getClass();
            try {
                f890 f890VarM89636b = workerParameters2.f1409g.m89636b(context, strM77815d, workerParameters);
                try {
                    luk lukVarM95213t = z2h1.m95213t(workerParameters.f1408f.f160374d);
                    j6a j6aVar = new j6a(23, constraintTrackingWorker, f890VarM89636b, uo80Var, i1e1VarM66059j, (fbk) null);
                    p7jVar2.f174702a = constraintTrackingWorker;
                    p7jVar2.f174703b = f890VarM89636b;
                    p7jVar2.f174706e = 1;
                    objM89557A = x0h1.m89557A(lukVarM95213t, j6aVar, p7jVar2);
                    yuk yukVar = yuk.f276404a;
                    if (objM89557A == yukVar) {
                        return yukVar;
                    }
                    constraintTrackingWorker2 = constraintTrackingWorker;
                    f890Var = f890VarM89636b;
                } catch (CancellationException e) {
                    e = e;
                    constraintTrackingWorker2 = constraintTrackingWorker;
                    f890Var = f890VarM89636b;
                    if (constraintTrackingWorker2.m41018b() || (e instanceof n7j)) {
                        if (Build.VERSION.SDK_INT < 31) {
                            i = -512;
                        } else if (constraintTrackingWorker2.m41018b()) {
                            i = constraintTrackingWorker2.f66918c.get();
                        } else {
                            if (!(e instanceof n7j)) {
                                throw new IllegalStateException("Unreachable");
                            }
                            i = ((n7j) e).f151177a;
                        }
                        f890Var.m41020e(i);
                    }
                    if (e instanceof n7j) {
                        return new c890();
                    }
                    throw e;
                }
            } catch (Throwable unused) {
                int i7 = s7j.f206389a;
                gaz.m44190b().getClass();
                l0e1VarM57799S.f128404A0.getClass();
                return new b890();
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f890Var = p7jVar2.f174703b;
            constraintTrackingWorker2 = p7jVar2.f174702a;
            try {
                bga.m29073P(objM89557A);
            } catch (CancellationException e2) {
                e = e2;
                if (constraintTrackingWorker2.m41018b()) {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (constraintTrackingWorker2.m41018b()) {
                        i = constraintTrackingWorker2.f66918c.get();
                    } else {
                        if (!(e instanceof n7j)) {
                            throw new IllegalStateException("Unreachable");
                        }
                        i = ((n7j) e).f151177a;
                    }
                    f890Var.m41020e(i);
                } else {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (constraintTrackingWorker2.m41018b()) {
                        i = constraintTrackingWorker2.f66918c.get();
                    } else {
                        if (!(e instanceof n7j)) {
                            throw new IllegalStateException("Unreachable");
                        }
                        i = ((n7j) e).f151177a;
                    }
                    f890Var.m41020e(i);
                }
                if (e instanceof n7j) {
                    return new c890();
                }
                throw e;
            }
        }
        return (e890) objM89557A;
    }

    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: f */
    public final Object mo750f(fbk fbkVar) {
        return x0h1.m89557A(z2h1.m95213t(this.f66917b.f1406d), new rrd(this, (fbk) null, 17), fbkVar);
    }
}
