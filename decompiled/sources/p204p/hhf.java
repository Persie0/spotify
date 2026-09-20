package p204p;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final class hhf extends URLSpan {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gh00 f91378a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ URLSpan f91379b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhf(gh00 gh00Var, URLSpan uRLSpan, String str) {
        super(str);
        this.f91378a = gh00Var;
        this.f91379b = uRLSpan;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        super.onClick(view);
        gh00 gh00Var = this.f91378a;
        if (gh00Var != null) {
            gh00Var.invoke(this.f91379b.getURL());
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
