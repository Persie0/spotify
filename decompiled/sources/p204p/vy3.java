package p204p;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class vy3 implements roe {

    /* JADX INFO: renamed from: a */
    public final Context f245903a;

    /* JADX INFO: renamed from: b */
    public ClipboardManager f245904b;

    public vy3(Context context) {
        this.f245903a = context;
    }

    /* JADX INFO: renamed from: a */
    public final ClipboardManager m86703a() {
        ClipboardManager clipboardManager = this.f245904b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        ClipboardManager clipboardManager2 = (ClipboardManager) this.f245903a.getSystemService("clipboard");
        this.f245904b = clipboardManager2;
        return clipboardManager2;
    }
}
