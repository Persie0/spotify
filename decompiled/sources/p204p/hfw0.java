package p204p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes6.dex */
public final class hfw0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f90808a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yfw0 f90809b;

    public /* synthetic */ hfw0(yfw0 yfw0Var, int i) {
        this.f90808a = i;
        this.f90809b = yfw0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f90808a) {
            case 0:
                this.f90809b.invoke(egw0.f59411a);
                break;
            default:
                this.f90809b.invoke(egw0.f59412b);
                break;
        }
    }
}
