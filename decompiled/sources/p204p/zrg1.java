package p204p;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzq;

/* JADX INFO: loaded from: classes.dex */
public final class zrg1 extends mtg1 {
    @Override // p204p.mtg1
    /* JADX INFO: renamed from: a */
    public final void mo34383a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m62824d(null);
        } else {
            m62823c(new zzq("Invalid response to one way request", null));
        }
    }

    @Override // p204p.mtg1
    /* JADX INFO: renamed from: b */
    public final boolean mo34384b() {
        return true;
    }
}
