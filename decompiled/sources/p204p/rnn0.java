package p204p;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.p004xr.projected.permissions.GoToHostProjectedActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class rnn0 extends ResultReceiver {

    /* JADX INFO: renamed from: a */
    public GoToHostProjectedActivity f200945a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        GoToHostProjectedActivity goToHostProjectedActivity = this.f200945a;
        if (goToHostProjectedActivity != null) {
            goToHostProjectedActivity.setResult(-1, new Intent().putExtra("androidx.xr.projected.permissions.extra.PERMISSION_RESULTS", bundle));
            goToHostProjectedActivity.f1438T0 = true;
            goToHostProjectedActivity.finish();
        }
    }
}
