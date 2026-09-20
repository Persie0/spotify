package p204p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes9.dex */
public final class iir implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f102623a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f102624b;

    public /* synthetic */ iir(int i, eh00 eh00Var) {
        this.f102623a = i;
        this.f102624b = eh00Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f102623a) {
            case 0:
                this.f102624b.invoke();
                break;
            case 1:
                this.f102624b.invoke();
                break;
            default:
                this.f102624b.invoke();
                break;
        }
    }
}
