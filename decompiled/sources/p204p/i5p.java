package p204p;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class i5p extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ j5p f98999a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f99000b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f99001c;

    public i5p(j5p j5pVar, String str, int i) {
        this.f98999a = j5pVar;
        this.f99000b = str;
        this.f99001c = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [p.gh00, p.qe70] */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f98999a.f109059t.invoke(this.f99000b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f99001c);
        textPaint.setUnderlineText(false);
    }
}
