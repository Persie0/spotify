package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class cy40 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43154a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ my40 f43155b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy40(my40 my40Var, int i) {
        super(2);
        this.f43154a = i;
        this.f43155b = my40Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43154a) {
            case 0:
                this.f43155b.f148305a.invoke(new dy40((View) obj, (ky40) obj2));
                break;
            case 1:
                this.f43155b.f148305a.invoke(new ey40(((hy40) obj2).f96462d, 1));
                break;
            default:
                this.f43155b.f148305a.invoke(new ey40(((hy40) obj2).f96462d, 2));
                break;
        }
        return w2a1.f247311a;
    }
}
