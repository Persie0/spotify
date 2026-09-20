package p204p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes6.dex */
public final class cri implements DialogInterface.OnDismissListener {
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dri.f52333a.remove("gaia.content_not_supported");
        dialogInterface.dismiss();
    }
}
