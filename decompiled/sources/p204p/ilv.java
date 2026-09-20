package p204p;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class ilv extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103498a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ klv f103499b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ilv(klv klvVar, int i) {
        super(0);
        this.f103498a = i;
        this.f103499b = klvVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f103498a) {
            case 0:
                ConstraintLayout constraintLayout = this.f103499b.f250195f;
                return Float.valueOf(constraintLayout != null ? constraintLayout.getWidth() : 0.0f);
            default:
                ConstraintLayout constraintLayout2 = this.f103499b.f250195f;
                return Float.valueOf(constraintLayout2 != null ? constraintLayout2.getWidth() : 0.0f);
        }
    }
}
