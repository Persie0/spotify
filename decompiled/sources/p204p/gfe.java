package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final class gfe implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79342a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hfe f79343b;

    public /* synthetic */ gfe(hfe hfeVar, int i) {
        this.f79342a = i;
        this.f79343b = hfeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f79342a) {
            case 0:
                rqc rqcVar = this.f79343b.f90716e;
                if (rqcVar != null) {
                    rqcVar.invoke(ffe.f68992c);
                }
                break;
            default:
                rqc rqcVar2 = this.f79343b.f90716e;
                if (rqcVar2 != null) {
                    rqcVar2.invoke(ffe.f68991b);
                }
                break;
        }
    }
}
