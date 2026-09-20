package p204p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kz60 implements ivd1, gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ th00 f128022a;

    public kz60(wa60 wa60Var) {
        this.f128022a = wa60Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ivd1) && (obj instanceof gi00)) {
            return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        return this.f128022a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // p204p.ivd1
    public final /* synthetic */ WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return (WindowInsets) this.f128022a.invoke(view, windowInsets);
    }
}
