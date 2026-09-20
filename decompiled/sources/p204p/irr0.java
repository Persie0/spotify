package p204p;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class irr0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f105048a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f105049b;

    public /* synthetic */ irr0(int i, gh00 gh00Var) {
        this.f105048a = i;
        this.f105049b = gh00Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f105048a) {
            case 0:
                this.f105049b.invoke(xvr0.f266469a);
                break;
            case 1:
                this.f105049b.invoke(x9v0.f259454a);
                break;
            case 2:
                this.f105049b.invoke(zlw0.f284092a);
                break;
            case 3:
                this.f105049b.invoke(zlw0.f284092a);
                break;
            case 4:
                this.f105049b.invoke(ck7.f38858a);
                break;
            case 5:
                this.f105049b.invoke(sbz0.f207610a);
                break;
            case 6:
                this.f105049b.invoke(hcz0.f89934a);
                break;
            case 7:
                this.f105049b.invoke(xm21.f263278a);
                break;
            case 8:
                this.f105049b.invoke(new tdv0(null));
                break;
            case 9:
                this.f105049b.invoke(mq31.f146152a);
                break;
            case 10:
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                this.f105049b.invoke(new z041(new y041(rect.left, rect.top, rect.right, rect.bottom)));
                break;
            case 11:
                this.f105049b.invoke(o551.f161880a);
                break;
            case 12:
                this.f105049b.invoke(zf81.f282250a);
                break;
            case 13:
                this.f105049b.invoke(zf81.f282251b);
                break;
            default:
                this.f105049b.invoke(f7u0.f66799a);
                break;
        }
    }
}
