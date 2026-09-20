package p204p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class uq21 extends id6 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f232919e;

    public /* synthetic */ uq21(int i) {
        this.f232919e = i;
    }

    @Override // p204p.vq21
    /* JADX INFO: renamed from: b */
    public final float mo83757b(View view, ViewGroup viewGroup) {
        switch (this.f232919e) {
            case 0:
                return view.getTranslationY() - viewGroup.getHeight();
            default:
                return view.getTranslationY() + viewGroup.getHeight();
        }
    }
}
