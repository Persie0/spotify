package p204p;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;

/* JADX INFO: loaded from: classes9.dex */
public final class cwn0 {

    /* JADX INFO: renamed from: a */
    public final Context f42791a;

    /* JADX INFO: renamed from: b */
    public final hv31 f42792b;

    public cwn0(Context context, hv31 hv31Var) {
        this.f42791a = context;
        this.f42792b = hv31Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m34148a() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        Context context = this.f42791a;
        int iCheckOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName());
        return iCheckOpNoThrow == 0 || iCheckOpNoThrow == 3;
    }
}
