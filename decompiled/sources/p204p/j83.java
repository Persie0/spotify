package p204p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes9.dex */
public final class j83 implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f109781a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wba f109782b;

    public /* synthetic */ j83(wba wbaVar, int i) {
        this.f109781a = i;
        this.f109782b = wbaVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f109781a) {
            case 0:
                this.f109782b.m87626g().m1578L(3);
                break;
            default:
                this.f109782b.m87626g().m1578L(3);
                break;
        }
    }
}
