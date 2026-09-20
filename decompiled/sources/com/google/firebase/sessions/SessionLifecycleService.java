package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import kotlin.Metadata;
import p204p.o101;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m24212d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "<init>", "()V", "p/o101", "com.google.firebase-firebase-sessions"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public final class SessionLifecycleService extends Service {

    /* JADX INFO: renamed from: a */
    public final HandlerThread f2421a = new HandlerThread("FirebaseSessions_HandlerThread");

    /* JADX INFO: renamed from: b */
    public o101 f2422b;

    /* JADX INFO: renamed from: c */
    public Messenger f2423c;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            return null;
        }
        intent.getAction();
        Messenger messenger = Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
        if (messenger != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messenger;
            o101 o101Var = this.f2422b;
            if (o101Var != null) {
                o101Var.sendMessage(messageObtain);
            }
        }
        Messenger messenger2 = this.f2423c;
        if (messenger2 != null) {
            return messenger2.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.f2421a;
        handlerThread.start();
        this.f2422b = new o101(handlerThread.getLooper());
        this.f2423c = new Messenger(this.f2422b);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f2421a.quit();
    }
}
