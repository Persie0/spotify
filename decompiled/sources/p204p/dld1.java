package p204p;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: loaded from: classes5.dex */
public final class dld1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50193a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ JsResult f50194b;

    public /* synthetic */ dld1(JsResult jsResult, int i) {
        this.f50193a = i;
        this.f50194b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f50193a) {
            case 0:
                this.f50194b.confirm();
                break;
            default:
                this.f50194b.cancel();
                break;
        }
    }
}
