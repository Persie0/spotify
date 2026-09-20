package p204p;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class bn80 extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f28725a;

    /* JADX INFO: renamed from: b */
    public final vmb0 f28726b;

    public bn80(int i, vmb0 vmb0Var) {
        this.f28725a = i;
        this.f28726b = vmb0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        vmb0 vmb0Var = this.f28726b;
        if (vmb0Var != null) {
            vmb0Var.invoke();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f28725a);
        textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
    }
}
