package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class bmd0 {

    /* JADX INFO: renamed from: a */
    public Bundle f28509a;

    public bmd0() {
        this.f28509a = new Bundle();
    }

    /* JADX INFO: renamed from: a */
    public cmd0 m29826a() {
        return new cmd0(this.f28509a);
    }

    /* JADX INFO: renamed from: b */
    public void m29827b(String str) {
        this.f28509a.putString("clientPackageName", str);
    }

    public bmd0(cmd0 cmd0Var) {
        Bundle bundle = new Bundle();
        this.f28509a = bundle;
        Bundle bundle2 = (Bundle) cmd0Var.f39652a.getParcelable("controlHints");
        bundle.putParcelable("controlHints", bundle2 == null ? Bundle.EMPTY : bundle2);
        m29827b(cmd0Var.f39652a.getString("clientPackageName", ""));
    }
}
