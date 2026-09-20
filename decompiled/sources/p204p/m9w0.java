package p204p;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.wear.remote.interactions.RemoteActivityHelper$RemoteIntentException;

/* JADX INFO: loaded from: classes3.dex */
public final class m9w0 extends ResultReceiver {

    /* JADX INFO: renamed from: a */
    public final gbb f141398a;

    /* JADX INFO: renamed from: b */
    public int f141399b;

    /* JADX INFO: renamed from: c */
    public int f141400c;

    public m9w0(gbb gbbVar, int i) {
        super(null);
        this.f141398a = gbbVar;
        this.f141399b = i;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        int i2 = this.f141399b - 1;
        this.f141399b = i2;
        if (i != 0) {
            this.f141400c++;
        }
        if (i2 > 0) {
            return;
        }
        int i3 = this.f141400c;
        gbb gbbVar = this.f141398a;
        if (i3 == 0) {
            gbbVar.m44211b(null);
        } else {
            gbbVar.m44212c(new RemoteActivityHelper$RemoteIntentException("There was an error while starting remote activity."));
        }
    }
}
