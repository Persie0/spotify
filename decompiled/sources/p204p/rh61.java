package p204p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes2.dex */
public final class rh61 implements ivd1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sh61 f199154a;

    public rh61(sh61 sh61Var) {
        this.f199154a = sh61Var;
    }

    @Override // p204p.ivd1
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.f199154a.f209117a.m33101j(windowInsets.getInsets(WindowInsets.Type.systemBars()));
        return view.onApplyWindowInsets(windowInsets);
    }
}
