package p204p;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.internal.play_crossdeviceprompt.zzp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class qrg1 {

    /* JADX INFO: renamed from: n */
    public static final HashMap f191836n = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f191837a;

    /* JADX INFO: renamed from: b */
    public final aqs f191838b;

    /* JADX INFO: renamed from: g */
    public boolean f191843g;

    /* JADX INFO: renamed from: h */
    public final Intent f191844h;

    /* JADX INFO: renamed from: l */
    public i8v f191848l;

    /* JADX INFO: renamed from: m */
    public lu30 f191849m;

    /* JADX INFO: renamed from: d */
    public final ArrayList f191840d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashSet f191841e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f191842f = new Object();

    /* JADX INFO: renamed from: j */
    public final e3f1 f191846j = new e3f1(this, 1);

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f191847k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final String f191839c = "com.google.android.finsky.crossdevicepromptservice.CrossDevicePromptService";

    /* JADX INFO: renamed from: i */
    public final WeakReference f191845i = new WeakReference(null);

    public qrg1(Context context, aqs aqsVar, Intent intent) {
        this.f191837a = context;
        this.f191838b = aqsVar;
        this.f191844h = intent;
    }

    /* JADX INFO: renamed from: b */
    public static void m73618b(qrg1 qrg1Var, mrf1 mrf1Var) {
        lu30 lu30Var = qrg1Var.f191849m;
        ArrayList<fwf1> arrayList = qrg1Var.f191840d;
        aqs aqsVar = qrg1Var.f191838b;
        if (lu30Var != null || qrg1Var.f191843g) {
            if (!qrg1Var.f191843g) {
                mrf1Var.run();
                return;
            } else {
                aqsVar.m26899h("Waiting to bind to the service.", new Object[0]);
                arrayList.add(mrf1Var);
                return;
            }
        }
        aqsVar.m26899h("Initiate binding to the service.", new Object[0]);
        arrayList.add(mrf1Var);
        i8v i8vVar = new i8v(qrg1Var);
        qrg1Var.f191848l = i8vVar;
        qrg1Var.f191843g = true;
        if (qrg1Var.f191837a.bindService(qrg1Var.f191844h, i8vVar, 1)) {
            return;
        }
        aqsVar.m26899h("Failed to bind to the service.", new Object[0]);
        qrg1Var.f191843g = false;
        for (fwf1 fwf1Var : arrayList) {
            zzp zzpVar = new zzp();
            ev61 ev61Var = fwf1Var.f74062a;
            if (ev61Var != null) {
                ev61Var.m40098c(zzpVar);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: a */
    public final Handler m73619a() {
        Handler handler;
        HashMap map = f191836n;
        synchronized (map) {
            try {
                String str = this.f191839c;
                if (!map.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    map.put(str, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
