package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class l56 implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f129835a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f129836b;

    public /* synthetic */ l56(Object obj, int i) {
        this.f129835a = i;
        this.f129836b = obj;
    }

    @Override // p204p.ewr
    public final void dispose() {
        switch (this.f129835a) {
            case 0:
                ((ogo) this.f129836b).dispose();
                break;
            case 1:
                ((ii8) this.f129836b).m87300e();
                break;
            case 2:
                szc0 szc0Var = (szc0) this.f129836b;
                if (!szc0Var.f215478p.m93539b()) {
                    ((ck2) szc0Var.f215468f).m33062S();
                }
                break;
            case 3:
                ((View) this.f129836b).getViewTreeObserver().removeOnWindowFocusChangeListener(n4v0.f150428a);
                break;
            default:
                c791 c791Var = (c791) this.f129836b;
                c791Var.m31695i();
                c791Var.f34827a.mo38145D1();
                break;
        }
    }
}
