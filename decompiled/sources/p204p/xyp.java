package p204p;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class xyp extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f267393a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zyp f267394b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ConstraintLayout f267395c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f267396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xyp(zyp zypVar, ConstraintLayout constraintLayout, boolean z, int i) {
        super(1);
        this.f267393a = i;
        this.f267394b = zypVar;
        this.f267395c = constraintLayout;
        this.f267396d = z;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f267393a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                zyp.m97238a(this.f267394b, this.f267395c, this.f267396d, Integer.valueOf(iIntValue));
                break;
            default:
                zyp.m97238a(this.f267394b, this.f267395c, this.f267396d, null);
                break;
        }
        return w2a1.f247311a;
    }
}
