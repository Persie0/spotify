package p204p;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class wpg1 extends Handler {

    /* JADX INFO: renamed from: a */
    public boolean f253766a;

    /* JADX INFO: renamed from: b */
    public final tj40 f253767b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cld1 f253768c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpg1(cld1 cld1Var, Looper looper) {
        super(looper);
        this.f253768c = cld1Var;
        this.f253767b = new tj40(1);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m88687a() {
        if (this.f253766a) {
            if (Log.isLoggable("WearableLS", 2)) {
                String.valueOf(this.f253768c.f39256a);
            }
            try {
                this.f253768c.unbindService(this.f253767b);
            } catch (RuntimeException unused) {
            }
            this.f253766a = false;
        }
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        synchronized (this) {
            try {
                if (!this.f253766a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        "bindService: ".concat(String.valueOf(this.f253768c.f39256a));
                    }
                    cld1 cld1Var = this.f253768c;
                    cld1Var.bindService(cld1Var.f39259d, this.f253767b, 1);
                    this.f253766a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            super.dispatchMessage(message);
            if (hasMessages(0)) {
            }
        } finally {
            if (!hasMessages(0)) {
                m88687a();
            }
        }
    }
}
