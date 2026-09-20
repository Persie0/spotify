package p204p;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class hey0 implements vd21 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f90549a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConstraintLayout f90550b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f90551c;

    public /* synthetic */ hey0(ConstraintLayout constraintLayout, boolean z, int i) {
        this.f90549a = i;
        this.f90550b = constraintLayout;
        this.f90551c = z;
    }

    @Override // p204p.vd21
    /* JADX INFO: renamed from: V */
    public final void mo27465V() {
        switch (this.f90549a) {
            case 0:
                ConstraintLayout constraintLayout = this.f90550b;
                constraintLayout.setVisibility(0);
                constraintLayout.setAlpha(this.f90551c ? 0.0f : 1.0f);
                break;
            default:
                ConstraintLayout constraintLayout2 = this.f90550b;
                constraintLayout2.setVisibility(0);
                constraintLayout2.setAlpha(this.f90551c ? 0.0f : 1.0f);
                break;
        }
    }
}
