package p204p;

import android.text.style.URLSpan;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class tj90 extends URLSpan {

    /* JADX INFO: renamed from: a */
    public final qe70 f220859a;

    /* JADX WARN: Multi-variable type inference failed */
    public tj90(String str, gh00 gh00Var) {
        super(str);
        this.f220859a = (qe70) gh00Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f220859a.invoke(getURL());
        super.onClick(view);
    }
}
