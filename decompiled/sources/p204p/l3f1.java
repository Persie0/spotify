package p204p;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class l3f1 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final Object f129322a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f129323b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f129324c;

    /* JADX INFO: renamed from: d */
    public final ywh0 f129325d;

    /* JADX INFO: renamed from: e */
    public final uj10 f129326e;

    /* JADX INFO: renamed from: f */
    public final zj5 f129327f;

    /* JADX INFO: renamed from: g */
    public final yj10 f129328g;

    public l3f1(ac80 ac80Var, yj10 yj10Var) {
        uj10 uj10Var = uj10.f230858e;
        this.f129322a = ac80Var;
        this.f129324c = new AtomicReference(null);
        this.f129325d = new ywh0(Looper.getMainLooper(), 2);
        this.f129326e = uj10Var;
        this.f129327f = new zj5(0);
        this.f129328g = yj10Var;
        ac80Var.mo25446m(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.ac80] */
    /* JADX INFO: renamed from: a */
    public final Activity m58004a() {
        Activity activityMo25445W = this.f129322a.mo25445W();
        ig31.m50506x(activityMo25445W);
        return activityMo25445W;
    }

    /* JADX INFO: renamed from: b */
    public final void m58005b(Bundle bundle) {
        if (bundle != null) {
            this.f129324c.set(bundle.getBoolean("resolving_error", false) ? new v4f1(new lzi(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m58006c() {
        this.f129323b = false;
        yj10 yj10Var = this.f129328g;
        yj10Var.getClass();
        synchronized (yj10.f273248P0) {
            try {
                if (yj10Var.f273252X == this) {
                    yj10Var.f273252X = null;
                    yj10Var.f273253Y.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m58007d() {
        if (this.f129327f.isEmpty()) {
            return;
        }
        this.f129328g.m93838e(this);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        lzi lziVar = new lzi(13, null, null);
        AtomicReference atomicReference = this.f129324c;
        v4f1 v4f1Var = (v4f1) atomicReference.get();
        int iM84651a = v4f1Var == null ? -1 : v4f1Var.m84651a();
        atomicReference.set(null);
        this.f129328g.m93841h(lziVar, iM84651a);
    }
}
