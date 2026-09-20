package p204p;

import android.view.ViewGroup;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes7.dex */
public final class fj30 extends sj30 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70068a;

    /* JADX INFO: renamed from: b */
    public final boolean f70069b;

    public /* synthetic */ fj30(boolean z, int i) {
        this.f70068a = i;
        this.f70069b = z;
    }

    @Override // p204p.tj30
    /* JADX INFO: renamed from: c */
    public final EnumSet mo26368c() {
        switch (this.f70068a) {
            case 0:
                return EnumSet.of(fi10.f69748h, fi10.f69746f, fi10.f69745e);
            default:
                return EnumSet.of(fi10.f69748h, fi10.f69746f, fi10.f69745e);
        }
    }

    @Override // p204p.pj30
    /* JADX INFO: renamed from: f */
    public final oj30 mo26369f(ViewGroup viewGroup, sk30 sk30Var) {
        switch (this.f70068a) {
            case 0:
                return new ej30(viewGroup, sk30Var, this.f70069b, 0);
            default:
                return new ej30(viewGroup, sk30Var, this.f70069b, 1);
        }
    }
}
