package p204p;

import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class pld0 extends smd0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Messenger f178698a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f178699b;

    public pld0(int i, Intent intent, Messenger messenger, String str) {
        this.f178698a = messenger;
        this.f178699b = i;
    }

    /* JADX INFO: renamed from: c */
    public static void m70260c(Messenger messenger, int i, int i2, Bundle bundle, Bundle bundle2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = 0;
        messageObtain.obj = bundle;
        messageObtain.setData(bundle2);
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }

    @Override // p204p.smd0
    /* JADX INFO: renamed from: a */
    public final void mo36781a(String str, Bundle bundle) {
        int i = sld0.f210387f;
        int i2 = this.f178699b;
        Messenger messenger = this.f178698a;
        if (str != null) {
            m70260c(messenger, 4, i2, bundle, dq60.m36606f("error", str));
        } else {
            m70260c(messenger, 4, i2, bundle, null);
        }
    }

    @Override // p204p.smd0
    /* JADX INFO: renamed from: b */
    public final void mo36782b(Bundle bundle) {
        int i = sld0.f210387f;
        m70260c(this.f178698a, 3, this.f178699b, bundle, null);
    }
}
