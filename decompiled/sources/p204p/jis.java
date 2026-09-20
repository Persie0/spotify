package p204p;

import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class jis implements AutoCompleteTextView.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kis f112816a;

    public jis(kis kisVar) {
        this.f112816a = kisVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        kis kisVar = this.f112816a;
        kisVar.f123083j = true;
        kisVar.f123085l = System.currentTimeMillis();
        kisVar.m56528g(false);
    }
}
