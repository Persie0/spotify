package p204p;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g9y0 {

    /* JADX INFO: renamed from: a */
    public final h9y0 f77919a;

    /* JADX INFO: renamed from: b */
    public final ew40 f77920b;

    /* JADX INFO: renamed from: e */
    public boolean f77923e;

    /* JADX INFO: renamed from: f */
    public Bundle f77924f;

    /* JADX INFO: renamed from: g */
    public boolean f77925g;

    /* JADX INFO: renamed from: c */
    public final i97 f77921c = new i97(27);

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f77922d = new LinkedHashMap();

    /* JADX INFO: renamed from: h */
    public boolean f77926h = true;

    public g9y0(h9y0 h9y0Var, ew40 ew40Var) {
        this.f77919a = h9y0Var;
        this.f77920b = ew40Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m44141a() {
        h9y0 h9y0Var = this.f77919a;
        if (h9y0Var.getLifecycle().mo31987b() != fb80.f67751b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f77923e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f77920b.invoke();
        h9y0Var.getLifecycle().mo31986a(new vvf(this, 2));
        this.f77923e = true;
    }
}
