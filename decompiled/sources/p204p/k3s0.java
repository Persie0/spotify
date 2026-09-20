package p204p;

import android.view.View;
import android.view.ViewStub;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class k3s0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118968a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2099lq f118969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3s0(C2099lq c2099lq, int i) {
        super(1);
        this.f118968a = i;
        this.f118969b = c2099lq;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f118968a) {
            case 0:
                View view = (View) obj;
                return Boolean.valueOf(((view instanceof ViewStub) || ((Set) this.f118969b.f135869P0).contains(Integer.valueOf(view.getId()))) ? false : true);
            default:
                View view2 = (View) obj;
                return Boolean.valueOf(((view2 instanceof ViewStub) || ((Set) this.f118969b.f135869P0).contains(Integer.valueOf(view2.getId()))) ? false : true);
        }
    }
}
