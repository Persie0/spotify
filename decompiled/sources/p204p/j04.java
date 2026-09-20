package p204p;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public final class j04 {

    /* JADX INFO: renamed from: a */
    public final ti7 f107349a;

    public j04() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.putExtra("androidx.browser.customtabs.extra.ENABLE_EPHEMERAL_BROWSING", true);
        intent.putExtra("androidx.browser.auth.extra.LAUNCH_AUTH_TAB", true);
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtras(new Bundle());
        this.f107349a = new ti7(intent);
    }
}
