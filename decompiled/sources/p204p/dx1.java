package p204p;

import android.os.Bundle;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class dx1 implements e9y0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53817a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kx1 f53818b;

    public /* synthetic */ dx1(kx1 kx1Var, int i) {
        this.f53817a = i;
        this.f53818b = kx1Var;
    }

    @Override // p204p.e9y0
    /* JADX INFO: renamed from: f */
    public final Bundle mo25168f() {
        switch (this.f53817a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putSerializable("STATE_KEY_VIEW_ID", (UUID) this.f53818b.f127304P1.getValue());
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("STATE_TRACKED_DROPDOWN_SEARCH", this.f53818b.f127305Q1);
                return bundle2;
        }
    }
}
