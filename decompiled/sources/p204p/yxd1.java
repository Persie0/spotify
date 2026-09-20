package p204p;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class yxd1 extends View {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f277236a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zxd1 f277237b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxd1(Activity activity, zxd1 zxd1Var) {
        super(activity);
        this.f277236a = activity;
        this.f277237b = zxd1Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f277237b.m97196a(this.f277236a);
    }
}
