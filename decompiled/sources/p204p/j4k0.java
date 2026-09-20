package p204p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes8.dex */
public final class j4k0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f108722a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ m4k0 f108723b;

    public /* synthetic */ j4k0(m4k0 m4k0Var, int i) {
        this.f108722a = i;
        this.f108723b = m4k0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f108722a) {
            case 0:
                this.f108723b.f139981b.onNext(hw10.f95834a);
                break;
            default:
                this.f108723b.f139981b.onNext(bi61.f27346a);
                break;
        }
    }
}
