package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cwl0 implements e9y0, gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dwl0 f42787a;

    public cwl0(dwl0 dwl0Var) {
        this.f42787a = dwl0Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e9y0) && (obj instanceof gi00)) {
            return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p204p.e9y0
    /* JADX INFO: renamed from: f */
    public final Bundle mo25168f() {
        dwl0 dwl0Var = this.f42787a;
        dwl0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("orientation_plugin_saved_state", dwl0Var.f53724a.m89131h());
        return bundle;
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        return new ri00(0, this.f42787a, dwl0.class, "onSaveInstanceState", "onSaveInstanceState()Landroid/os/Bundle;", 0, 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
