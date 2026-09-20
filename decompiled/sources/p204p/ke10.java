package p204p;

import android.appwidget.AppWidgetManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ke10 {

    /* JADX INFO: renamed from: f */
    public static wko f121772f;

    /* JADX INFO: renamed from: a */
    public final Context f121774a;

    /* JADX INFO: renamed from: b */
    public final AppWidgetManager f121775b;

    /* JADX INFO: renamed from: c */
    public final wg61 f121776c = new wg61(new nry(this, 16));

    /* JADX INFO: renamed from: d */
    public static final ie10 f121770d = new ie10();

    /* JADX INFO: renamed from: e */
    public static final rgq0 f121771e = el51.m39346p("GlanceAppWidgetManager", null, 14);

    /* JADX INFO: renamed from: g */
    public static final sgq0 f121773g = p271.m68923z("list::Providers");

    public ke10(Context context) {
        this.f121774a = context;
        this.f121775b = AppWidgetManager.getInstance(context);
    }

    /* JADX INFO: renamed from: a */
    public final Object m56178a(py8 py8Var, ge10 ge10Var, dmx dmxVar) {
        f121770d.getClass();
        String canonicalName = py8Var.getClass().getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("no receiver name");
        }
        String canonicalName2 = ge10Var.getClass().getCanonicalName();
        if (canonicalName2 == null) {
            throw new IllegalArgumentException("no provider name");
        }
        Object objMo29190a = ((wko) this.f121776c.getValue()).mo29190a(new rcy(canonicalName, canonicalName2, (fbk) null, 9), dmxVar);
        return objMo29190a == yuk.f276404a ? objMo29190a : w2a1.f247311a;
    }
}
