package androidx.p004xr.projected;

import android.app.Activity;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.Metadata;
import p204p.l9s0;
import p204p.wj50;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Landroidx/xr/projected/TrampolineRequestPermissionsOnHostActivity;", "Landroid/app/Activity;", "<init>", "()V", "projected"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class TrampolineRequestPermissionsOnHostActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public ResultReceiver f1435a;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("androidx.xr.projected.permissions.extra.RESULT_RECEIVER", ResultReceiver.class);
        if (resultReceiver == null) {
            finish();
            return;
        }
        String[] stringArrayExtra = getIntent().getStringArrayExtra("androidx.xr.projected.permissions.extra.PERMISSIONS");
        if (stringArrayExtra == null || stringArrayExtra.length == 0) {
            resultReceiver.send(0, Bundle.EMPTY);
            finish();
        } else {
            this.f1435a = resultReceiver;
            requestPermissions(stringArrayExtra, 105, l9s0.m58520b(this).getDeviceId());
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 105) {
            return;
        }
        ResultReceiver resultReceiver = this.f1435a;
        if (resultReceiver == null) {
            wj50.m88260d0("resultReceiver");
            throw null;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArray("androidx.xr.projected.permissions.RESULT_DATA_PERMISSIONS", strArr);
        bundle.putIntArray("androidx.xr.projected.permissions.RESULT_DATA_GRANT_RESULTS", iArr);
        resultReceiver.send(-1, bundle);
        finish();
    }
}
