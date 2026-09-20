package p204p;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class axe {

    /* JADX INFO: renamed from: a */
    public final WeakReference f20842a;

    /* JADX INFO: renamed from: b */
    public final String f20843b;

    public axe(View view, String str) {
        this.f20842a = new WeakReference(view);
        this.f20843b = str;
    }

    /* JADX INFO: renamed from: a */
    public final View m27383a() {
        WeakReference weakReference = this.f20842a;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }
}
