package p204p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes6.dex */
public final class c2q0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33444a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DialogInterface.OnClickListener f33445b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2q0(int i, DialogInterface.OnClickListener onClickListener) {
        super(0);
        this.f33444a = i;
        this.f33445b = onClickListener;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f33444a) {
            case 0:
                this.f33445b.onClick(null, -1);
                break;
            default:
                DialogInterface.OnClickListener onClickListener = this.f33445b;
                if (onClickListener != null) {
                    onClickListener.onClick(null, -2);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
