package androidx.p004xr.projected.permissions;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.p002ui.text.font.FontWeight;
import com.spotify.music.R;
import com.spotify.watchfeed.component.layout.p186v1.proto.WatchFeedTwoColumnsLayout;
import kotlin.Metadata;
import p204p.cwf;
import p204p.dwf;
import p204p.epv0;
import p204p.fyf;
import p204p.h171;
import p204p.hj10;
import p204p.k0e1;
import p204p.n6f;
import p204p.pgv0;
import p204p.rnn0;
import p204p.va71;
import p204p.wj50;
import p204p.xq00;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m24212d2 = {"Landroidx/xr/projected/permissions/GoToHostProjectedActivity;", "Lp/cwf;", "", "<init>", "()V", "projected"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class GoToHostProjectedActivity extends cwf {

    /* JADX INFO: renamed from: U0 */
    public static final /* synthetic */ int f1436U0 = 0;

    /* JADX INFO: renamed from: S0 */
    public rnn0 f1437S0;

    /* JADX INFO: renamed from: T0 */
    public volatile boolean f1438T0;

    /* JADX INFO: renamed from: g0 */
    public final void m1171g0(int i, xq00 xq00Var) {
        xq00Var.m91775k0(2147466091);
        if ((i & 1) == 0 && xq00Var.m91738H()) {
            xq00Var.m91757b0();
        } else {
            String strM54977L = k0e1.m54977L(R.string.go_to_host_projected_activity_text, xq00Var);
            FontWeight fontWeight = new FontWeight(WatchFeedTwoColumnsLayout.CONFIGURATION_FIELD_NUMBER);
            va71.m85017b(strM54977L, null, n6f.f150866f, epv0.m39702v(24), fontWeight, epv0.m39698r(0.0525d), new h171(3), epv0.m39702v(32), 0, false, 0, 0, null, xq00Var, 12782976, 6, 129362);
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new hj10(this, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0028  */
    @Override // p204p.cwf, p204p.bwf, android.app.Activity
    public final void onCreate(Bundle bundle) {
        rnn0 rnn0Var;
        super.onCreate(bundle);
        dwf.m37156a(this, new fyf(new hj10(this), true, -1491472373));
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (bundle != null) {
                rnn0Var = (rnn0) bundle.getParcelable("permissionResultReceiver", rnn0.class);
            } else {
                rnn0Var = null;
            }
        } else if (bundle != null) {
            rnn0Var = (rnn0) bundle.getParcelable("permissionResultReceiver");
        } else {
            rnn0Var = null;
        }
        if (rnn0Var != null) {
            rnn0Var.f200945a = this;
            this.f1437S0 = rnn0Var;
            return;
        }
        rnn0 rnn0Var2 = new rnn0(new Handler(Looper.getMainLooper()));
        rnn0Var2.f200945a = this;
        this.f1437S0 = rnn0Var2;
        ActivityOptions launchDisplayId = i >= 26 ? ActivityOptions.makeBasic().setLaunchDisplayId(0) : ActivityOptions.makeBasic();
        Intent intentPutExtras = new Intent().setClass(this, RequestPermissionsOnHostActivity.class).putExtras(getIntent());
        rnn0 rnn0Var3 = this.f1437S0;
        if (rnn0Var3 != null) {
            startActivity(intentPutExtras.putExtra("androidx.xr.projected.permissions.extra.RESULT_RECEIVER", rnn0Var3).addFlags(805437440), launchDisplayId.toBundle());
        } else {
            wj50.m88260d0("permissionResultReceiver");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        rnn0 rnn0Var = this.f1437S0;
        if (rnn0Var == null) {
            wj50.m88260d0("permissionResultReceiver");
            throw null;
        }
        rnn0Var.f200945a = null;
        if (!isFinishing() || this.f1438T0) {
            return;
        }
        startActivity(new Intent().setClass(this, RequestPermissionsOnHostActivity.class).putExtra("androidx.xr.projected.permissions.extra.SHOULD_FINISH", true).addFlags(805437440), (Build.VERSION.SDK_INT >= 26 ? ActivityOptions.makeBasic().setLaunchDisplayId(0) : ActivityOptions.makeBasic()).toBundle());
    }

    @Override // p204p.cwf, p204p.bwf, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        rnn0 rnn0Var = this.f1437S0;
        if (rnn0Var != null) {
            bundle.putParcelable("permissionResultReceiver", rnn0Var);
        } else {
            wj50.m88260d0("permissionResultReceiver");
            throw null;
        }
    }
}
