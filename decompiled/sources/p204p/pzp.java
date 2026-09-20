package p204p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes9.dex */
public final class pzp implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f183753a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wup f183754b;

    public /* synthetic */ pzp(wup wupVar, int i) {
        this.f183753a = i;
        this.f183754b = wupVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f183753a) {
            case 0:
                wup wupVar = this.f183754b;
                ViewGroup.LayoutParams layoutParams = ((View) ((aim) wupVar.f255245b).f16020Z).getLayoutParams();
                layoutParams.height = wup.m89069a(wupVar, 3);
                ((View) ((aim) wupVar.f255245b).f16020Z).setLayoutParams(layoutParams);
                break;
            default:
                ((View) ((aim) this.f183754b.f255245b).f16020Z).setVisibility(8);
                break;
        }
    }
}
