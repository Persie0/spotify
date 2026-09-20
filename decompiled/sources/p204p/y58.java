package p204p;

import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y58 {
    /* JADX INFO: renamed from: a */
    public static void m92843a(View view, AutofillManager autofillManager, int i, boolean z) {
        autofillManager.notifyViewVisibilityChanged(view, i, z);
    }
}
