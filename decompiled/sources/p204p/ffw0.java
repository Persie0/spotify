package p204p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes6.dex */
public final class ffw0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69109a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yfw0 f69110b;

    public /* synthetic */ ffw0(yfw0 yfw0Var, int i) {
        this.f69109a = i;
        this.f69110b = yfw0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f69109a) {
            case 0:
                this.f69110b.invoke(egw0.f59411a);
                break;
            default:
                this.f69110b.invoke(egw0.f59412b);
                break;
        }
    }
}
