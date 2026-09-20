package p204p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes6.dex */
public final class uqo0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b */
    public static final uqo0 f233089b = new uqo0(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f233090a;

    public /* synthetic */ uqo0(int i) {
        this.f233090a = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f233090a) {
            case 0:
                break;
            default:
                dri.f52333a.remove("gaia.content_not_supported");
                dialogInterface.dismiss();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m83809a(DialogInterface dialogInterface) {
    }
}
