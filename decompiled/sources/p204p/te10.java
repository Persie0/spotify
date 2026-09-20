package p204p;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class te10 implements RemoteViewsService.RemoteViewsFactory {

    /* JADX INFO: renamed from: a */
    public final GlanceRemoteViewsService f219547a;

    /* JADX INFO: renamed from: b */
    public final int f219548b;

    /* JADX INFO: renamed from: c */
    public final int f219549c;

    /* JADX INFO: renamed from: d */
    public final String f219550d;

    public te10(GlanceRemoteViewsService glanceRemoteViewsService, int i, int i2, String str) {
        this.f219547a = glanceRemoteViewsService;
        this.f219548b = i;
        this.f219549c = i2;
        this.f219550d = str;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m80524a(te10 te10Var, ie5 ie5Var, ibk ibkVar) {
        se10 se10Var;
        ComponentName componentName;
        String className;
        tf60 tf60Var;
        if (ibkVar instanceof se10) {
            se10Var = (se10) ibkVar;
            int i = se10Var.f208168d;
            if ((i & Integer.MIN_VALUE) != 0) {
                se10Var.f208168d = i - Integer.MIN_VALUE;
            } else {
                se10Var = new se10(te10Var, ibkVar);
            }
        } else {
            se10Var = new se10(te10Var, ibkVar);
        }
        Object objM92609b = se10Var.f208166b;
        int i2 = se10Var.f208168d;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                te10Var = se10Var.f208165a;
                bga.m29073P(objM92609b);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM92609b);
                    return w2a1Var;
                }
                bga.m29073P(objM92609b);
                tf60Var = (tf60) objM92609b;
            }
            if (tf60Var != null) {
                se10Var.f208165a = null;
                se10Var.f208168d = 3;
                if (tf60Var.mo26604k(se10Var) == yukVar) {
                    return yukVar;
                }
            }
            return w2a1Var;
        }
        bga.m29073P(objM92609b);
        AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(te10Var.f219547a).getAppWidgetInfo(te10Var.f219548b);
        ge10 ge10VarMo19758b = (appWidgetInfo == null || (componentName = appWidgetInfo.provider) == null || (className = componentName.getClassName()) == null) ? null : ((py8) Class.forName(className).getDeclaredConstructor(null).newInstance(null)).mo19758b();
        if (ge10VarMo19758b == null) {
            sp5 sp5Var = UnmanagedSessionReceiver.f890a;
            sp5.m78854t(te10Var.f219548b);
            tf60Var = null;
            if (tf60Var != null) {
                se10Var.f208165a = null;
                se10Var.f208168d = 3;
                if (tf60Var.mo26604k(se10Var) == yukVar) {
                }
            }
            return w2a1Var;
        }
        y101 y101Var = z101.f278200a;
        sqt sqtVar = new sqt(te10Var, ie5Var, ge10VarMo19758b, fbkVar, 26);
        se10Var.f208165a = te10Var;
        se10Var.f208168d = 1;
        objM92609b = y101Var.m92609b(sqtVar, se10Var);
        if (objM92609b != yukVar) {
            te10Var = te10Var;
        }
        return yukVar;
        tf60Var = (tf60) objM92609b;
        if (tf60Var == null) {
            sp5 sp5Var2 = UnmanagedSessionReceiver.f890a;
            sp5.m78854t(te10Var.f219548b);
            tf60Var = null;
        }
        if (tf60Var != null) {
            se10Var.f208165a = null;
            se10Var.f208168d = 3;
            if (tf60Var.mo26604k(se10Var) == yukVar) {
                return yukVar;
            }
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: b */
    public final s9w0 m80525b() {
        s9w0 s9w0Var;
        oce oceVar = GlanceRemoteViewsService.f889a;
        int i = this.f219548b;
        int i2 = this.f219549c;
        String str = this.f219550d;
        oce oceVar2 = GlanceRemoteViewsService.f889a;
        synchronized (oceVar2) {
            s9w0Var = (s9w0) oceVar2.f163909a.get(oce.m66680f(i, i2, str));
            if (s9w0Var == null) {
                s9w0Var = s9w0.f207080d;
            }
        }
        return s9w0Var;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return m80525b().f207081a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return m80525b().f207081a[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return m80525b().f207082b[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f219547a.getPackageName(), R.layout.glance_invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return m80525b().f207083c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        m80525b().getClass();
        return false;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        x0h1.m89580w(new joz(this, (fbk) null, 12));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        oce oceVar = GlanceRemoteViewsService.f889a;
        int i = this.f219548b;
        int i2 = this.f219549c;
        String str = this.f219550d;
        oce oceVar2 = GlanceRemoteViewsService.f889a;
        synchronized (oceVar2) {
            oceVar2.f163909a.remove(oce.m66680f(i, i2, str));
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }
}
