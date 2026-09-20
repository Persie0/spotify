package p204p;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: loaded from: classes3.dex */
public final class l800 extends Transition.EpicenterCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f130767a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Rect f130768b;

    public /* synthetic */ l800(int i, Rect rect) {
        this.f130767a = i;
        this.f130768b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.f130767a) {
            case 0:
                return this.f130768b;
            default:
                Rect rect = this.f130768b;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
