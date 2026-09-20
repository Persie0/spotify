package p204p;

import android.view.View;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class x5m0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f258472a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y5m0 f258473b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5m0(y5m0 y5m0Var, int i) {
        super(0);
        this.f258472a = i;
        this.f258473b = y5m0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f258472a) {
            case 0:
                View viewFindViewById = this.f258473b.findViewById(R.id.design_bottom_sheet);
                if (viewFindViewById != null) {
                    return viewFindViewById;
                }
                throw new IllegalStateException("Required value was null.");
            case 1:
                View viewFindViewById2 = this.f258473b.findViewById(R.id.container);
                if (viewFindViewById2 != null) {
                    return viewFindViewById2;
                }
                throw new IllegalStateException("Required value was null.");
            default:
                View viewFindViewById3 = this.f258473b.findViewById(R.id.coordinator);
                if (viewFindViewById3 != null) {
                    return viewFindViewById3;
                }
                throw new IllegalStateException("Required value was null.");
        }
    }
}
