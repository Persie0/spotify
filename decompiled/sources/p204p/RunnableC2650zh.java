package p204p;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.spotify.music.R;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: p.zh */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2650zh implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282750a;

    /* JADX INFO: renamed from: b */
    public final Object f282751b;

    /* JADX INFO: renamed from: c */
    public final Object f282752c;

    public /* synthetic */ RunnableC2650zh(int i, Object obj, Object obj2) {
        this.f282750a = i;
        this.f282752c = obj;
        this.f282751b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, p.ac80] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, p.ac80] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        boolean z2 = false;
        switch (this.f282750a) {
            case 0:
                C1668ai c1668ai = (C1668ai) this.f282752c;
                if (((View) c1668ai.f15841d) == null) {
                    return;
                }
                Rect rect = new Rect();
                ((ViewGroup) c1668ai.f15840c).getHitRect(rect);
                int iM88767v = wqg1.m88767v(24.0f, ((View) c1668ai.f15841d).getResources());
                rect.top = 0;
                rect.left -= iM88767v;
                rect.bottom += iM88767v;
                rect.right += iM88767v;
                ((View) this.f282751b).setTouchDelegate(new TouchDelegate(rect, (View) c1668ai.f15841d));
                return;
            case 1:
                Rect rect2 = new Rect();
                b721 b721Var = (b721) this.f282751b;
                b721Var.f24127P0.getHitRect(rect2);
                int dimensionPixelSize = ((Context) this.f282752c).getResources().getDimensionPixelSize(R.dimen.spacer_8);
                rect2.right += dimensionPixelSize;
                rect2.bottom += dimensionPixelSize;
                TouchDelegate touchDelegate = new TouchDelegate(rect2, b721Var.f24127P0);
                if (View.class.isInstance(b721Var.f24127P0.getParent())) {
                    ((View) b721Var.f24127P0.getParent()).setTouchDelegate(touchDelegate);
                    return;
                }
                return;
            case 2:
                hqb hqbVar = (hqb) this.f282752c;
                u790 u790Var = (u790) this.f282751b;
                if (u790Var.isCancelled()) {
                    hqbVar.mo42416r(null);
                    return;
                }
                try {
                    while (true) {
                        try {
                            Object obj = u790Var.get();
                            if (z2) {
                                Thread.currentThread().interrupt();
                            }
                            hqbVar.resumeWith(obj);
                            return;
                        } catch (InterruptedException unused) {
                            z2 = z;
                        } catch (Throwable th) {
                            if (z2) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    wj50.m88279p(cause);
                    hqbVar.resumeWith(new c6x0(cause));
                    return;
                }
                break;
            case 3:
                l3f1 l3f1Var = (l3f1) this.f282752c;
                if (l3f1Var.f129323b) {
                    v4f1 v4f1Var = (v4f1) this.f282751b;
                    lzi lziVarM84652b = v4f1Var.m84652b();
                    if (lziVarM84652b.f138371b != 0 && lziVarM84652b.f138372c != null) {
                        ?? r2 = l3f1Var.f129322a;
                        Activity activityM58004a = l3f1Var.m58004a();
                        PendingIntent pendingIntent = lziVarM84652b.f138372c;
                        ig31.m50506x(pendingIntent);
                        int iM84651a = v4f1Var.m84651a();
                        int i = GoogleApiActivity.f1833b;
                        Intent intent = new Intent(activityM58004a, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", iM84651a);
                        intent.putExtra("notify_manager", false);
                        r2.startActivityForResult(intent, 1);
                        return;
                    }
                    Activity activityM58004a2 = l3f1Var.m58004a();
                    int i2 = lziVarM84652b.f138371b;
                    uj10 uj10Var = l3f1Var.f129326e;
                    if (uj10Var.m85678a(i2, activityM58004a2, null) != null) {
                        uj10Var.m83218g(l3f1Var.m58004a(), l3f1Var.f129322a, lziVarM84652b.f138371b, l3f1Var);
                        return;
                    }
                    if (lziVarM84652b.f138371b != 18) {
                        int iM84651a2 = v4f1Var.m84651a();
                        l3f1Var.f129324c.set(null);
                        l3f1Var.f129328g.m93841h(lziVarM84652b, iM84651a2);
                        return;
                    }
                    Activity activityM58004a3 = l3f1Var.m58004a();
                    ProgressBar progressBar = new ProgressBar(activityM58004a3, null, android.R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activityM58004a3);
                    builder.setView(progressBar);
                    builder.setMessage(h4f1.m46649c(activityM58004a3, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog alertDialogCreate = builder.create();
                    uj10.m83215j(activityM58004a3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", l3f1Var);
                    Context applicationContext = l3f1Var.m58004a().getApplicationContext();
                    s0f1 s0f1Var = new s0f1(this, alertDialogCreate);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    s3f1 s3f1Var = new s3f1(s0f1Var);
                    lzj.m60347Y(applicationContext, s3f1Var, intentFilter);
                    s3f1Var.f205282a = applicationContext;
                    if (wo10.m88622h(applicationContext)) {
                        return;
                    }
                    l3f1 l3f1Var2 = (l3f1) this.f282752c;
                    l3f1Var2.f129324c.set(null);
                    ywh0 ywh0Var = l3f1Var2.f129328g.f273250L0;
                    ywh0Var.sendMessage(ywh0Var.obtainMessage(3));
                    if (alertDialogCreate.isShowing()) {
                        alertDialogCreate.dismiss();
                    }
                    synchronized (s3f1Var) {
                        try {
                            Context context = s3f1Var.f205282a;
                            if (context != null) {
                                context.unregisterReceiver(s3f1Var);
                            }
                            s3f1Var.f205282a = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
            case 4:
                Context context2 = (Context) this.f282751b;
                ev61 ev61Var = (ev61) this.f282752c;
                try {
                    gul.m45786a(context2);
                    ev61Var.m40097b(null);
                    return;
                } catch (Exception e2) {
                    ev61Var.m40096a(e2);
                    return;
                }
            case 5:
                ((wlf1) this.f282751b).m88518e2((omd0) this.f282752c);
                return;
            case 6:
                if (((y7h1) ((Task) this.f282751b)).f270088d) {
                    ((krf1) this.f282752c).f125643d.m92997r();
                    return;
                }
                try {
                    ((krf1) this.f282752c).f125643d.m92996q(((krf1) this.f282752c).f125642c.mo25397b((Task) this.f282751b));
                    return;
                } catch (RuntimeExecutionException e3) {
                    if (e3.getCause() instanceof Exception) {
                        ((krf1) this.f282752c).f125643d.m92995p((Exception) e3.getCause());
                        return;
                    } else {
                        ((krf1) this.f282752c).f125643d.m92995p(e3);
                        return;
                    }
                } catch (Exception e4) {
                    ((krf1) this.f282752c).f125643d.m92995p(e4);
                    return;
                }
            case 7:
                krf1 krf1Var = (krf1) this.f282752c;
                y7h1 y7h1Var = krf1Var.f125643d;
                try {
                    Task task = (Task) krf1Var.f125642c.mo25397b((Task) this.f282751b);
                    if (task == null) {
                        krf1Var.mo27479o(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    dkr dkrVar = gv61.f84649b;
                    task.mo1512d(dkrVar, krf1Var);
                    task.mo1511c(dkrVar, krf1Var);
                    task.mo1509a(dkrVar, krf1Var);
                    return;
                } catch (RuntimeExecutionException e5) {
                    if (e5.getCause() instanceof Exception) {
                        y7h1Var.m92995p((Exception) e5.getCause());
                        return;
                    } else {
                        y7h1Var.m92995p(e5);
                        return;
                    }
                } catch (Exception e6) {
                    y7h1Var.m92995p(e6);
                    return;
                }
            case 8:
                synchronized (((d8g1) this.f282752c).f46460c) {
                    ((r7l0) ((d8g1) this.f282752c).f46461d).onComplete((Task) this.f282751b);
                    break;
                }
                return;
            case 9:
                synchronized (((d8g1) this.f282752c).f46460c) {
                    oal0 oal0Var = (oal0) ((d8g1) this.f282752c).f46461d;
                    Exception excMo1514f = ((Task) this.f282751b).mo1514f();
                    ig31.m50506x(excMo1514f);
                    oal0Var.mo27479o(excMo1514f);
                    break;
                }
                return;
            case 10:
                synchronized (((d8g1) this.f282752c).f46460c) {
                    ((kdl0) ((d8g1) this.f282752c).f46461d).onSuccess(((Task) this.f282751b).mo1515g());
                    break;
                }
                return;
            case 11:
                d8g1 d8g1Var = (d8g1) this.f282752c;
                try {
                    y7h1 y7h1VarMo27672d = ((cy51) d8g1Var.f46460c).mo27672d(((Task) this.f282751b).mo1515g());
                    dkr dkrVar2 = gv61.f84649b;
                    y7h1VarMo27672d.mo1512d(dkrVar2, d8g1Var);
                    y7h1VarMo27672d.mo1511c(dkrVar2, d8g1Var);
                    y7h1VarMo27672d.mo1509a(dkrVar2, d8g1Var);
                    return;
                } catch (RuntimeExecutionException e7) {
                    if (e7.getCause() instanceof Exception) {
                        d8g1Var.mo27479o((Exception) e7.getCause());
                        return;
                    } else {
                        d8g1Var.mo27479o(e7);
                        return;
                    }
                } catch (CancellationException unused2) {
                    d8g1Var.mo31435b();
                    return;
                } catch (Exception e8) {
                    d8g1Var.mo27479o(e8);
                    return;
                }
            case 12:
                jfo jfoVar = new jfo((DataHolder) this.f282751b);
                try {
                    ((o6f1) this.f282752c).f162339m.getClass();
                    return;
                } finally {
                    jfoVar.m77878e();
                }
            default:
                y7h1 y7h1Var2 = (y7h1) this.f282751b;
                try {
                    y7h1Var2.m92996q(((Callable) this.f282752c).call());
                    return;
                } catch (Exception e9) {
                    y7h1Var2.m92995p(e9);
                    return;
                } catch (Throwable th3) {
                    y7h1Var2.m92995p(new RuntimeException(th3));
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC2650zh(Object obj, Object obj2, boolean z, int i) {
        this.f282750a = i;
        this.f282751b = obj;
        this.f282752c = obj2;
    }

    public RunnableC2650zh(l3f1 l3f1Var, v4f1 v4f1Var) {
        this.f282750a = 3;
        Objects.requireNonNull(l3f1Var);
        this.f282752c = l3f1Var;
        this.f282751b = v4f1Var;
    }
}
