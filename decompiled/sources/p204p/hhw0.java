package p204p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes11.dex */
public final class hhw0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f91608a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tw80 f91609b;

    public /* synthetic */ hhw0(tw80 tw80Var, int i) {
        this.f91608a = i;
        this.f91609b = tw80Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f91608a) {
            case 0:
                ((vb5) this.f91609b.f224373i).getClass();
                break;
            default:
                ((h0a) this.f91609b.f224372h).m46270b();
                break;
        }
    }
}
