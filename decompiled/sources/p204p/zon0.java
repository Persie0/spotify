package p204p;

import android.content.DialogInterface;
import com.spotify.android.permissionsimpl.PermissionsRequestActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class zon0 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PermissionsRequestActivity f284851a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String[] f284852b;

    public zon0(PermissionsRequestActivity permissionsRequestActivity, String[] strArr) {
        this.f284851a = permissionsRequestActivity;
        this.f284852b = strArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        PermissionsRequestActivity permissionsRequestActivity = this.f284851a;
        if (permissionsRequestActivity.f2947b) {
            ze0.m95954t0(permissionsRequestActivity, this.f284852b, 49374);
        }
    }
}
