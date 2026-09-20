package p204p;

import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wda1 implements i7x0 {
    /* JADX INFO: renamed from: c */
    public static avm0 m87820c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(avm0.class.getClassLoader());
        return (avm0) bundle.getParcelable("update_schedule_initial");
    }

    /* JADX INFO: renamed from: d */
    public static ResultReceiver m87821d(Bundle bundle) {
        if (bundle != null) {
            return (ResultReceiver) bundle.getParcelable("update_schedule_result_receiver");
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static Bundle m87822e(avm0 avm0Var) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("update_schedule_initial", avm0Var);
        return bundle;
    }
}
