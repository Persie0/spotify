package p204p;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.spotify.widget.widgetpromo.PromoSuccessHandlerService;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes2.dex */
public final class le5 implements pzn0 {

    /* JADX INFO: renamed from: a */
    public final Context f132462a;

    /* JADX INFO: renamed from: b */
    public final AppWidgetManager f132463b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f132464c;

    /* JADX INFO: renamed from: d */
    public final red1 f132465d;

    /* JADX INFO: renamed from: e */
    public final v5r f132466e;

    /* JADX INFO: renamed from: f */
    public final azu0 f132467f;

    public le5(Context context, AppWidgetManager appWidgetManager, Scheduler scheduler, red1 red1Var, v5r v5rVar, azu0 azu0Var) {
        this.f132462a = context;
        this.f132463b = appWidgetManager;
        this.f132464c = scheduler;
        this.f132465d = red1Var;
        this.f132466e = v5rVar;
        this.f132467f = azu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m58774a(zas0 zas0Var) {
        Context context = this.f132462a;
        try {
            AppWidgetManager appWidgetManager = this.f132463b;
            if (appWidgetManager == null) {
                return false;
            }
            ComponentName componentName = new ComponentName(context, "com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider");
            int i = PromoSuccessHandlerService.f6976b;
            boolean zRequestPinAppWidget = appWidgetManager.requestPinAppWidget(componentName, null, tag1.m80360f(context, zas0Var));
            if (!zRequestPinAppWidget) {
                return zRequestPinAppWidget;
            }
            this.f132465d.m75389f(zas0Var);
            return zRequestPinAppWidget;
        } catch (IllegalStateException e) {
            na6.m63972t("The widget can't be pinned because the app is not FG", e);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Enum m58775b(zas0 zas0Var, ibk ibkVar) {
        ke5 ke5Var;
        int i;
        if (ibkVar instanceof ke5) {
            ke5Var = (ke5) ibkVar;
            int i2 = ke5Var.f121808d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ke5Var.f121808d = i2 - Integer.MIN_VALUE;
            } else {
                ke5Var = new ke5(this, ibkVar);
            }
        } else {
            ke5Var = new ke5(this, ibkVar);
        }
        Object obj = ke5Var.f121806b;
        int i3 = ke5Var.f121808d;
        azu0 azu0Var = this.f132467f;
        if (i3 == 0) {
            bga.m29073P(obj);
            int iM27678k = azu0Var.m27678k();
            if (!m58774a(zas0Var)) {
                return qzn0.f194233b;
            }
            if (this.f132466e.m84743a() != null) {
                ke5Var.f121805a = iM27678k;
                ke5Var.f121808d = 1;
                Object objM64619l = njg1.m64619l(1500L, ke5Var);
                yuk yukVar = yuk.f276404a;
                if (objM64619l == yukVar) {
                    return yukVar;
                }
                i = iM27678k;
            }
            return qzn0.f194232a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = ke5Var.f121805a;
        bga.m29073P(obj);
        if (azu0Var.m27678k() <= i) {
            return qzn0.f194234c;
        }
        return qzn0.f194232a;
    }
}
