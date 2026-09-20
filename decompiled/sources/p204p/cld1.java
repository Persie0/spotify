package p204p;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cld1 extends Service implements ado, pmc {

    /* JADX INFO: renamed from: a */
    public ComponentName f39256a;

    /* JADX INFO: renamed from: b */
    public wpg1 f39257b;

    /* JADX INFO: renamed from: c */
    public o6f1 f39258c;

    /* JADX INFO: renamed from: d */
    public Intent f39259d;

    /* JADX INFO: renamed from: e */
    public Looper f39260e;

    /* JADX INFO: renamed from: g */
    public boolean f39262g;

    /* JADX INFO: renamed from: f */
    public final Object f39261f = new Object();

    /* JADX INFO: renamed from: h */
    public final gjf1 f39263h = new gjf1(new a0b1());

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.BIND_LISTENER") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.CHANNEL_EVENT") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.DATA_CHANGED") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.MESSAGE_RECEIVED") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.REQUEST_RECEIVED") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.CAPABILITY_CHANGED") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        return r3.f39258c;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IBinder onBind(Intent intent) {
        String action;
        if (intent != null && (action = intent.getAction()) != null) {
            switch (action.hashCode()) {
                case -1487371046:
                    break;
                case -1140095138:
                    break;
                case -786751258:
                    break;
                case 915816236:
                    break;
                case 1003809169:
                    break;
                case 1460975593:
                    break;
                default:
                    if (Log.isLoggable("WearableLS", 3)) {
                        intent.toString();
                    }
                    break;
            }
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f39256a = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            "onCreate: ".concat(String.valueOf(this.f39256a));
        }
        if (this.f39260e == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.f39260e = handlerThread.getLooper();
        }
        this.f39257b = new wpg1(this, this.f39260e);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.f39259d = intent;
        intent.setComponent(this.f39256a);
        this.f39258c = new o6f1(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            "onDestroy: ".concat(String.valueOf(this.f39256a));
        }
        synchronized (this.f39261f) {
            this.f39262g = true;
            wpg1 wpg1Var = this.f39257b;
            if (wpg1Var == null) {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=".concat(String.valueOf(this.f39256a)));
            }
            wpg1Var.getLooper().quit();
            wpg1Var.m88687a();
        }
        super.onDestroy();
    }

    @Override // p204p.pmc
    /* JADX INFO: renamed from: a */
    public final void mo33268a(dlf1 dlf1Var) {
    }

    @Override // p204p.pmc
    /* JADX INFO: renamed from: b */
    public final void mo33269b(dlf1 dlf1Var) {
    }

    @Override // p204p.pmc
    /* JADX INFO: renamed from: c */
    public final void mo33270c(dlf1 dlf1Var) {
    }

    @Override // p204p.ado
    /* JADX INFO: renamed from: d */
    public final void mo24626d(jfo jfoVar) {
    }

    @Override // p204p.pmc
    /* JADX INFO: renamed from: e */
    public final void mo33271e(dlf1 dlf1Var) {
    }
}
