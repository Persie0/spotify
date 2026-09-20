package p204p;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: p.ke */
/* JADX INFO: loaded from: classes3.dex */
public final class C2049ke extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f121756a;

    /* JADX INFO: renamed from: b */
    public final C2374sf f121757b;

    /* JADX INFO: renamed from: c */
    public final int f121758c;

    public C2049ke(int i, C2374sf c2374sf, int i2) {
        this.f121756a = i;
        this.f121757b = c2374sf;
        this.f121758c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f121756a);
        this.f121757b.f208417a.performAction(this.f121758c, bundle);
    }
}
