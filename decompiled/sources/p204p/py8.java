package p204p;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class py8 extends AppWidgetProvider {

    /* JADX INFO: renamed from: a */
    public final n5q f183371a = xsr.f265651a;

    /* JADX INFO: renamed from: b */
    public iud1 f183372b;

    /* JADX INFO: renamed from: c */
    public er70 f183373c;

    /* JADX INFO: renamed from: d */
    public er70 f183374d;

    /* JADX INFO: renamed from: a */
    public static final void m71570a(py8 py8Var, xuk xukVar, Context context) {
        x0h1.m89578u(xukVar, null, 0, new dmx(context, py8Var, (fbk) null, 24), 3);
    }

    /* JADX INFO: renamed from: b */
    public abstract ge10 mo19758b();

    /* JADX INFO: renamed from: c */
    public final fud1 m71571c() {
        iud1 iud1Var = this.f183372b;
        if (iud1Var != null) {
            return iud1Var;
        }
        wj50.m88260d0("widgetProviderDelegate");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final void m71572d(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        edo.m38612k(this, this.f183371a, new es1(this, context, i, bundle, (fbk) null, 10));
    }

    /* JADX INFO: renamed from: e */
    public final void m71573e(Context context, int[] iArr) {
        edo.m38612k(this, this.f183371a, new ts0(this, context, iArr, null));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:21:0x0040, B:24:0x0049, B:25:0x0051, B:26:0x0052, B:27:0x005a, B:28:0x005b, B:44:0x00a6, B:34:0x0071, B:36:0x0083, B:38:0x008e, B:40:0x009a, B:39:0x0096, B:42:0x009e, B:43:0x00a5, B:31:0x0066), top: B:49:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x008e A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:21:0x0040, B:24:0x0049, B:25:0x0051, B:26:0x0052, B:27:0x005a, B:28:0x005b, B:44:0x00a6, B:34:0x0071, B:36:0x0083, B:38:0x008e, B:40:0x009a, B:39:0x0096, B:42:0x009e, B:43:0x00a5, B:31:0x0066), top: B:49:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0096 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:21:0x0040, B:24:0x0049, B:25:0x0051, B:26:0x0052, B:27:0x005a, B:28:0x005b, B:44:0x00a6, B:34:0x0071, B:36:0x0083, B:38:0x008e, B:40:0x009a, B:39:0x0096, B:42:0x009e, B:43:0x00a5, B:31:0x0066), top: B:49:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009e A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:21:0x0040, B:24:0x0049, B:25:0x0051, B:26:0x0052, B:27:0x005a, B:28:0x005b, B:44:0x00a6, B:34:0x0071, B:36:0x0083, B:38:0x008e, B:40:0x009a, B:39:0x0096, B:42:0x009e, B:43:0x00a5, B:31:0x0066), top: B:49:0x0006 }] */
    /* JADX INFO: renamed from: f */
    public final void m71574f(Context context, Intent intent) {
        Context context2;
        AppWidgetManager appWidgetManager;
        String packageName;
        String canonicalName;
        ComponentName componentName;
        int[] appWidgetIds;
        try {
            String action = intent.getAction();
            try {
                if (action == null) {
                    context2 = context;
                } else {
                    int iHashCode = action.hashCode();
                    if (iHashCode == -19011148) {
                        context2 = context;
                        if (!action.equals("android.intent.action.LOCALE_CHANGED")) {
                        }
                        appWidgetManager = AppWidgetManager.getInstance(context2);
                        packageName = context2.getPackageName();
                        canonicalName = getClass().getCanonicalName();
                        if (canonicalName != null) {
                            throw new IllegalStateException("no canonical name");
                        }
                        componentName = new ComponentName(packageName, canonicalName);
                        if (intent.hasExtra("appWidgetIds")) {
                            appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                            wj50.m88279p(appWidgetIds);
                        } else {
                            appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                        }
                        onUpdate(context2, appWidgetManager, appWidgetIds);
                        return;
                    }
                    if (iHashCode == 649033583) {
                        context2 = context;
                        if (!action.equals("androidx.glance.appwidget.action.DEBUG_UPDATE")) {
                        }
                        appWidgetManager = AppWidgetManager.getInstance(context2);
                        packageName = context2.getPackageName();
                        canonicalName = getClass().getCanonicalName();
                        if (canonicalName != null) {
                            throw new IllegalStateException("no canonical name");
                        }
                        componentName = new ComponentName(packageName, canonicalName);
                        if (intent.hasExtra("appWidgetIds")) {
                            appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                            wj50.m88279p(appWidgetIds);
                        } else {
                            appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                        }
                        onUpdate(context2, appWidgetManager, appWidgetIds);
                        return;
                    }
                    if (iHashCode == 1989767543 && action.equals("ACTION_TRIGGER_LAMBDA")) {
                        String stringExtra = intent.getStringExtra("EXTRA_ACTION_KEY");
                        if (stringExtra == null) {
                            throw new IllegalStateException("Intent is missing ActionKey extra");
                        }
                        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
                        if (intExtra == -1) {
                            throw new IllegalStateException("Intent is missing AppWidgetId extra");
                        }
                        edo.m38612k(this, this.f183371a, new me10(this, context, intExtra, stringExtra, null));
                        return;
                    }
                    context2 = context;
                }
                super.onReceive(context2, intent);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m71575g(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        edo.m38612k(this, this.f183371a, new sqt(this, context, iArr, null, 25));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        m71572d(context, appWidgetManager, i, bundle);
        ((iud1) m71571c()).m51662a(i, new ComponentName(context, getClass()));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        m71573e(context, iArr);
        ((iud1) m71571c()).m51663b(iArr);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        super.onEnabled(context);
        ((iud1) m71571c()).m51664c();
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        opo.m67561k(this, context);
        er70 er70Var = this.f183373c;
        if (er70Var == null) {
            wj50.m88260d0("intentFactory");
            throw null;
        }
        aag1.m25236m(er70Var);
        m71574f(context, intent);
        ((iud1) m71571c()).m51665d(intent);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        m71575g(context, appWidgetManager, iArr);
        ((iud1) m71571c()).m51666e(iArr, new ComponentName(context, getClass()));
    }
}
