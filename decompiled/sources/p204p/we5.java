package p204p;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.car.app.model.Alert;
import com.spotify.music.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;

/* JADX INFO: loaded from: classes.dex */
public final class we5 {

    /* JADX INFO: renamed from: a */
    public final String f250435a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f250436b;

    /* JADX INFO: renamed from: c */
    public final bqa f250437c;

    /* JADX INFO: renamed from: d */
    public final ge10 f250438d;

    /* JADX INFO: renamed from: e */
    public final ie5 f250439e;

    /* JADX INFO: renamed from: f */
    public final whi f250440f;

    /* JADX INFO: renamed from: g */
    public final ni21 f250441g;

    /* JADX INFO: renamed from: h */
    public final boolean f250442h;

    /* JADX INFO: renamed from: i */
    public final yum0 f250443i;

    /* JADX INFO: renamed from: j */
    public final yum0 f250444j;

    /* JADX INFO: renamed from: k */
    public Object f250445k;

    /* JADX INFO: renamed from: l */
    public final uf60 f250446l;

    /* JADX INFO: renamed from: m */
    public final zv41 f250447m;

    public we5(ge10 ge10Var, ie5 ie5Var, Bundle bundle, int i) {
        bundle = (i & 4) != 0 ? null : bundle;
        ye10 ye10Var = ye10.f271888a;
        ni21 ni21VarMo44446b = ge10Var.mo44446b();
        this.f250435a = ljf1.m59164p(ie5Var);
        this.f250436b = new AtomicBoolean(true);
        this.f250437c = xtm0.m92080a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
        this.f250438d = ge10Var;
        this.f250439e = ie5Var;
        this.f250440f = ye10Var;
        this.f250441g = ni21VarMo44446b;
        this.f250442h = true;
        if (ljf1.m59162n(ie5Var)) {
            throw new IllegalArgumentException("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
        }
        zhi0 zhi0Var = zhi0.f282936c;
        this.f250443i = sam.m77644A(null, zhi0Var);
        this.f250444j = sam.m77644A(bundle, zhi0Var);
        this.f250445k = nau.f152117a;
        this.f250446l = qlg1.m73202g();
        this.f250447m = jag1.m52819d(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m87856a() {
        this.f250437c.mo30210A(null);
        this.f250436b.set(false);
        this.f250446l.mo26601e(null);
    }

    /* JADX INFO: renamed from: b */
    public final String m87857b() {
        return this.f250435a;
    }

    /* JADX INFO: renamed from: c */
    public final void m87858c(Context context, Throwable th) {
        if (!this.f250442h) {
            throw th;
        }
        int i = this.f250439e.f101318a;
        this.f250438d.getClass();
        AppWidgetManager.getInstance(context).updateAppWidget(i, new RemoteViews(context.getPackageName(), R.layout.glance_error_layout));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
    
        if (r3.m51149b(r5) == r12) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012a, code lost:
    
        if (r14.m51149b(r5) == r12) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013a, code lost:
    
        if (r14.m51149b(r5) == r12) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0150, code lost:
    
        if (r14.m51149b(r5) == r12) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.content.Context, java.lang.Object, p.g7u] */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.content.Context, java.lang.Object, p.g7u] */
    /* JADX WARN: Type inference failed for: r11v8, types: [android.appwidget.AppWidgetProviderInfo] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m87859d(Context context, g7u g7uVar, ibk ibkVar) throws Throwable {
        se5 se5Var;
        Context context2;
        we5 we5Var;
        g7u g7uVar2;
        io70 io70Var;
        AppWidgetManager appWidgetManagerM59160l;
        io70 io70Var2;
        boolean z;
        ?? appWidgetInfo;
        ?? r11;
        ie5 ie5Var;
        if (ibkVar instanceof se5) {
            se5Var = (se5) ibkVar;
            int i = se5Var.f208210f;
            if ((i & Integer.MIN_VALUE) != 0) {
                se5Var.f208210f = i - Integer.MIN_VALUE;
            } else {
                se5Var = new se5(this, ibkVar);
            }
        } else {
            se5Var = new se5(this, ibkVar);
        }
        Object objM30750l = se5Var.f208208d;
        int i2 = se5Var.f208210f;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                try {
                    if (i2 == 0) {
                        bga.m29073P(objM30750l);
                        if (x4w0.m89925P(g7uVar)) {
                            return qyg1.m74178H(false);
                        }
                        int i3 = this.f250439e.f101318a;
                        se5Var.f208205a = this;
                        se5Var.f208206b = context;
                        se5Var.f208207c = g7uVar;
                        se5Var.f208210f = 1;
                        objM30750l = io70.f104141g.m30750l(context, i3, se5Var);
                        if (objM30750l != yukVar) {
                            context2 = context;
                            we5Var = this;
                            g7uVar2 = g7uVar;
                        }
                        return yukVar;
                    }
                    if (i2 != 1) {
                        if (i2 == 2 || i2 == 3 || i2 == 4) {
                            bga.m29073P(objM30750l);
                            z = true;
                            za81.m95767b();
                            return qyg1.m74178H(z);
                        }
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) se5Var.f208205a;
                        bga.m29073P(objM30750l);
                        za81.m95767b();
                        throw th;
                    }
                    g7uVar2 = se5Var.f208207c;
                    Context context3 = se5Var.f208206b;
                    we5Var = (we5) se5Var.f208205a;
                    bga.m29073P(objM30750l);
                    context2 = context3;
                    if (appWidgetInfo == 0) {
                        throw new IllegalArgumentException(("No app widget info for " + ie5Var.f101318a).toString());
                    }
                    ComponentName componentName = ((AppWidgetProviderInfo) appWidgetInfo).provider;
                    fpg1.m42370z((xew0) g7uVar2);
                    we5Var.f250445k = fpg1.m42344I(g7uVar2);
                    appWidgetInfo = 0;
                    try {
                        try {
                            RemoteViews remoteViewsM77568r = s95.m77568r(context2, ie5Var.f101318a, (xew0) g7uVar2, io70Var, io70Var.m51148a(g7uVar2), componentName);
                            if (we5Var.f250442h) {
                                appWidgetManagerM59160l.updateAppWidget(ie5Var.f101318a, remoteViewsM77568r);
                            }
                            we5Var.f250447m.m97090l(remoteViewsM77568r);
                            se5Var.f208205a = null;
                            se5Var.f208206b = null;
                            se5Var.f208207c = null;
                            se5Var.f208210f = 2;
                        } catch (CancellationException unused) {
                            io70Var2 = io70Var;
                            se5Var.f208205a = appWidgetInfo;
                            se5Var.f208206b = appWidgetInfo;
                            se5Var.f208207c = appWidgetInfo;
                            se5Var.f208210f = 3;
                        } catch (Throwable th) {
                            th = th;
                            io70Var2 = io70Var;
                            r11 = appWidgetInfo;
                            try {
                                we5Var.m87858c(context2, th);
                                se5Var.f208205a = r11;
                                se5Var.f208206b = r11;
                                se5Var.f208207c = r11;
                                se5Var.f208210f = 4;
                            } catch (Throwable th2) {
                                th = th2;
                                se5Var.f208205a = th;
                                se5Var.f208206b = r11;
                                se5Var.f208207c = r11;
                                se5Var.f208210f = 5;
                            }
                        }
                    } catch (CancellationException unused2) {
                        io70Var2 = io70Var;
                    } catch (Throwable th3) {
                        th = th3;
                        io70Var2 = io70Var;
                        r11 = appWidgetInfo;
                        we5Var.m87858c(context2, th);
                        se5Var.f208205a = r11;
                        se5Var.f208206b = r11;
                        se5Var.f208207c = r11;
                        se5Var.f208210f = 4;
                    }
                } catch (CancellationException unused3) {
                } catch (Throwable th4) {
                    th = th4;
                    r11 = appWidgetInfo;
                }
                appWidgetInfo = appWidgetManagerM59160l.getAppWidgetInfo(ie5Var.f101318a);
            } catch (CancellationException unused4) {
                appWidgetInfo = 0;
            } catch (Throwable th5) {
                th = th5;
                appWidgetInfo = 0;
                io70Var2 = io70Var;
                r11 = appWidgetInfo;
                we5Var.m87858c(context2, th);
                se5Var.f208205a = r11;
                se5Var.f208206b = r11;
                se5Var.f208207c = r11;
                se5Var.f208210f = 4;
            }
            we5Var.getClass();
            ie5Var = we5Var.f250439e;
            z = true;
        } catch (CancellationException unused5) {
            z = true;
        } catch (Throwable th6) {
            th = th6;
            z = true;
        }
        io70Var = (io70) objM30750l;
        appWidgetManagerM59160l = ljf1.m59160l(context2);
        io70Var2 = null;
        io70Var2 = io70Var;
        se5Var.f208205a = appWidgetInfo;
        se5Var.f208206b = appWidgetInfo;
        se5Var.f208207c = appWidgetInfo;
        se5Var.f208210f = 3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: e */
    public final Object m87860e(Context context, Object obj, ibk ibkVar) {
        te5 te5Var;
        Object obj2;
        we5 we5Var;
        iqi0 iqi0VarM58617p;
        oa31 oa31VarM66515j;
        if (ibkVar instanceof te5) {
            te5Var = (te5) ibkVar;
            int i = te5Var.f219577d;
            if ((i & Integer.MIN_VALUE) != 0) {
                te5Var.f219577d = i - Integer.MIN_VALUE;
            } else {
                te5Var = new te5(this, ibkVar);
            }
        } else {
            te5Var = new te5(this, ibkVar);
        }
        Object objM93517c = te5Var.f219575b;
        int i2 = te5Var.f219577d;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(objM93517c);
                    obj2 = null;
                    if (obj instanceof qe5) {
                        zzx0 zzx0VarMo44447c = this.f250438d.mo44447c();
                        if (zzx0VarMo44447c != null) {
                            String strM87857b = m87857b();
                            te5Var.f219574a = this;
                            te5Var.f219577d = 1;
                            objM93517c = ((ye10) this.f250440f).m93517c(context, zzx0VarMo44447c, strM87857b, te5Var);
                            yuk yukVar = yuk.f276404a;
                            if (objM93517c == yukVar) {
                                return yukVar;
                            }
                            we5Var = this;
                        } else {
                            we5Var = this;
                        }
                        iqi0VarM58617p = lb5.m58617p(null, null);
                        oa31VarM66515j = iqi0VarM58617p.m66515j();
                        we5Var.f250443i.setValue(obj2);
                        oa31.m66513q(oa31VarM66515j);
                        iqi0VarM58617p.mo28829w().mo58440m();
                        iqi0VarM58617p.mo28814c();
                        return w2a1Var;
                    }
                    if (obj instanceof pe5) {
                        iqi0 iqi0VarM58617p2 = lb5.m58617p(null, null);
                        try {
                            oa31 oa31VarM66515j2 = iqi0VarM58617p2.m66515j();
                            try {
                                this.f250444j.setValue(((pe5) obj).m69709a());
                                oa31.m66513q(oa31VarM66515j2);
                                iqi0VarM58617p2.mo28829w().mo58440m();
                                iqi0VarM58617p2.mo28814c();
                                return w2a1Var;
                            } catch (Throwable th) {
                                oa31.m66513q(oa31VarM66515j2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            iqi0VarM58617p2.mo28814c();
                            throw th2;
                        }
                    }
                    if (obj instanceof oe5) {
                        iqi0 iqi0VarM58617p3 = lb5.m58617p(null, null);
                        try {
                            oa31 oa31VarM66515j3 = iqi0VarM58617p3.m66515j();
                            try {
                                List list = (List) this.f250445k.get(((oe5) obj).m66791a());
                                if (list != null) {
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        ((re70) it.next()).m75386a().invoke();
                                    }
                                    obj2 = w2a1Var;
                                }
                                oa31.m66513q(oa31VarM66515j3);
                                iqi0VarM58617p3.mo28829w().mo58440m();
                                iqi0VarM58617p3.mo28814c();
                                if (obj2 == null) {
                                    qyg1.m74180J(Log.w("AppWidgetSession", "Triggering Action(" + ((oe5) obj).m66791a() + ") for session(" + m87857b() + ") failed"));
                                    return w2a1Var;
                                }
                            } catch (Throwable th3) {
                                oa31.m66513q(oa31VarM66515j3);
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            iqi0VarM58617p3.mo28814c();
                            throw th4;
                        }
                    } else {
                        if (!(obj instanceof re5)) {
                            throw new IllegalArgumentException("Sent unrecognized event type " + obj.getClass() + " to AppWidgetSession");
                        }
                        huk hukVarM75381a = ((re5) obj).m75381a();
                        if (((eg60) hukVarM75381a).isActive()) {
                            ((uf60) hukVarM75381a).m38797k0(w2a1Var);
                        }
                    }
                    return w2a1Var;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                we5Var = te5Var.f219574a;
                bga.m29073P(objM93517c);
                we5Var.f250443i.setValue(obj2);
                oa31.m66513q(oa31VarM66515j);
                iqi0VarM58617p.mo28829w().mo58440m();
                iqi0VarM58617p.mo28814c();
                return w2a1Var;
            } catch (Throwable th5) {
                oa31.m66513q(oa31VarM66515j);
                throw th5;
            }
            oa31VarM66515j = iqi0VarM58617p.m66515j();
        } catch (Throwable th6) {
            iqi0VarM58617p.mo28814c();
            throw th6;
        }
        obj2 = objM93517c;
        iqi0VarM58617p = lb5.m58617p(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077 A[Catch: ClosedReceiveChannelException -> 0x008f, TRY_LEAVE, TryCatch #0 {ClosedReceiveChannelException -> 0x008f, blocks: (B:13:0x002e, B:22:0x0058, B:26:0x006f, B:28:0x0077, B:18:0x0046, B:21:0x004d), top: B:34:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r5.m87860e(r1, r10, r0) == r4) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008c -> B:14:0x0031). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m87861f(Context context, jkw0 jkw0Var, ibk ibkVar) throws Throwable {
        zwz0 zwz0Var;
        upa upaVar;
        we5 we5Var;
        gh00 gh00Var;
        upa upaVar2;
        we5 we5Var2;
        Context context2;
        gh00 gh00Var2;
        Object objM83652a;
        gh00 gh00Var3;
        if (ibkVar instanceof zwz0) {
            zwz0Var = (zwz0) ibkVar;
            int i = zwz0Var.f287125g;
            if ((i & Integer.MIN_VALUE) != 0) {
                zwz0Var.f287125g = i - Integer.MIN_VALUE;
            } else {
                zwz0Var = new zwz0(this, ibkVar);
            }
        } else {
            zwz0Var = new zwz0(this, ibkVar);
        }
        Object obj = zwz0Var.f287123e;
        int i2 = zwz0Var.f287125g;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                bqa bqaVar = this.f250437c;
                bqaVar.getClass();
                upaVar = new upa(bqaVar);
                we5Var = this;
                gh00Var2 = jkw0Var;
                zwz0Var.f287119a = we5Var;
                zwz0Var.f287120b = context;
                zwz0Var.f287121c = gh00Var2;
                zwz0Var.f287122d = upaVar;
                zwz0Var.f287125g = 1;
                objM83652a = upaVar.m83652a(zwz0Var);
                if (objM83652a == yukVar) {
                    upa upaVar3 = upaVar;
                    context2 = context;
                    upaVar2 = upaVar3;
                    we5Var2 = we5Var;
                    obj = objM83652a;
                    gh00Var = gh00Var2;
                    if (((Boolean) obj).booleanValue()) {
                        Object objM83653c = upaVar2.m83653c();
                        gh00Var.invoke(objM83653c);
                        zwz0Var.f287119a = we5Var2;
                        zwz0Var.f287120b = context2;
                        zwz0Var.f287121c = gh00Var;
                        zwz0Var.f287122d = upaVar2;
                        zwz0Var.f287125g = 2;
                    }
                    return w2a1.f247311a;
                }
                gh00Var3 = gh00Var;
                return yukVar;
            }
            if (i2 == 1) {
                upaVar2 = zwz0Var.f287122d;
                gh00 gh00Var4 = zwz0Var.f287121c;
                context2 = zwz0Var.f287120b;
                we5Var2 = zwz0Var.f287119a;
                bga.m29073P(obj);
                gh00Var = gh00Var4;
                if (((Boolean) obj).booleanValue()) {
                    Object objM83653c2 = upaVar2.m83653c();
                    gh00Var.invoke(objM83653c2);
                    zwz0Var.f287119a = we5Var2;
                    zwz0Var.f287120b = context2;
                    zwz0Var.f287121c = gh00Var;
                    zwz0Var.f287122d = upaVar2;
                    zwz0Var.f287125g = 2;
                }
                return w2a1.f247311a;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            upaVar2 = zwz0Var.f287122d;
            gh00 gh00Var5 = zwz0Var.f287121c;
            context2 = zwz0Var.f287120b;
            we5Var2 = zwz0Var.f287119a;
            bga.m29073P(obj);
            gh00Var3 = gh00Var5;
            gh00Var3 = gh00Var;
            Context context3 = context2;
            upaVar = upaVar2;
            context = context3;
            we5Var = we5Var2;
            gh00Var2 = gh00Var3;
            zwz0Var.f287119a = we5Var;
            zwz0Var.f287120b = context;
            zwz0Var.f287121c = gh00Var2;
            zwz0Var.f287122d = upaVar;
            zwz0Var.f287125g = 1;
            objM83652a = upaVar.m83652a(zwz0Var);
            if (objM83652a == yukVar) {
                upa upaVar4 = upaVar;
                context2 = context;
                upaVar2 = upaVar4;
                we5Var2 = we5Var;
                obj = objM83652a;
                gh00Var = gh00Var2;
                if (((Boolean) obj).booleanValue()) {
                    Object objM83653c3 = upaVar2.m83653c();
                    gh00Var.invoke(objM83653c3);
                    zwz0Var.f287119a = we5Var2;
                    zwz0Var.f287120b = context2;
                    zwz0Var.f287121c = gh00Var;
                    zwz0Var.f287122d = upaVar2;
                    zwz0Var.f287125g = 2;
                }
                return w2a1.f247311a;
            }
            gh00Var3 = gh00Var;
            return yukVar;
        } catch (ClosedReceiveChannelException unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final Object m87862g(Object obj, ibk ibkVar) {
        Object objMo30229d = this.f250437c.mo30229d(obj, ibkVar);
        return objMo30229d == yuk.f276404a ? objMo30229d : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m87863h(ibk ibkVar) {
        ve5 ve5Var;
        re5 re5Var;
        if (ibkVar instanceof ve5) {
            ve5Var = (ve5) ibkVar;
            int i = ve5Var.f240621d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ve5Var.f240621d = i - Integer.MIN_VALUE;
            } else {
                ve5Var = new ve5(this, ibkVar);
            }
        } else {
            ve5Var = new ve5(this, ibkVar);
        }
        Object obj = ve5Var.f240619b;
        int i2 = ve5Var.f240621d;
        if (i2 == 0) {
            bga.m29073P(obj);
            re5 re5Var2 = new re5(qlg1.m73201f(this.f250446l));
            ve5Var.f240618a = re5Var2;
            ve5Var.f240621d = 1;
            Object objM87862g = m87862g(re5Var2, ve5Var);
            Object obj2 = yuk.f276404a;
            if (objM87862g == obj2) {
                return obj2;
            }
            re5Var = re5Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            re5Var = ve5Var.f240618a;
            bga.m29073P(obj);
        }
        return re5Var.m75381a();
    }
}
