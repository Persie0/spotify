package p204p;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class xn71 extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f263555a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ moh f263556b;

    public xn71(moh mohVar, long j) {
        this.f263556b = mohVar;
        this.f263555a = j;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ((ruq) this.f263556b.f145676b).f202892a.invoke(new kuq(this.f263555a));
    }
}
