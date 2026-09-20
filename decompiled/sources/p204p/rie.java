package p204p;

import android.graphics.Typeface;
import android.net.Uri;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import com.spotify.music.R;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class rie extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f199498a = 3;

    /* JADX INFO: renamed from: b */
    public final Serializable f199499b;

    /* JADX INFO: renamed from: c */
    public final Object f199500c;

    public rie(String str, z9j0 z9j0Var) {
        this.f199499b = str;
        this.f199500c = z9j0Var;
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r5v6, types: [p.eh00, p.qe70] */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.f199498a) {
            case 0:
                ((z9j0) this.f199500c).mo47346g((String) this.f199499b);
                break;
            case 1:
                Selection.setSelection((Spannable) ((TextView) view).getText(), 0);
                view.invalidate();
                ((vy00) this.f199499b).invoke(((vl80) this.f199500c).f242402b);
                break;
            case 2:
                ((qe70) this.f199499b).invoke();
                ao80 ao80Var = (ao80) this.f199500c;
                Uri uri = Uri.parse("https://support.spotify.com/article/managed-accounts-for-premium-family/plain/");
                xvb xvbVar = new xvb(1);
                ((suj) xvbVar.f266338d).f214135a = -16777216;
                xvbVar.m92229s();
                xvbVar.m92223k().m86160d(ao80Var.f17600a, uri);
                break;
            default:
                SeeMoreTextView seeMoreTextView = (SeeMoreTextView) this.f199500c;
                seeMoreTextView.cancelPendingInputEvents();
                ?? r5 = seeMoreTextView.f3746t;
                if (r5 != 0) {
                    r5.invoke((abz0) this.f199499b);
                }
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f199498a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setColor(-1);
                break;
            case 1:
                textPaint.setColor(textPaint.getColor());
                textPaint.setUnderlineText(true);
                break;
            case 2:
                super.updateDrawState(textPaint);
                textPaint.setColor(((ao80) this.f199500c).f17600a.getColor(R.color.dark_base_text_subdued));
                textPaint.setUnderlineText(true);
                break;
            default:
                textPaint.setColor(textPaint.linkColor);
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
                ((SeeMoreTextView) this.f199500c).setHighlightColor(0);
                break;
        }
    }

    public rie(vy00 vy00Var, vl80 vl80Var) {
        this.f199499b = vy00Var;
        this.f199500c = vl80Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rie(eh00 eh00Var, ao80 ao80Var) {
        this.f199499b = (qe70) eh00Var;
        this.f199500c = ao80Var;
    }

    public rie(SeeMoreTextView seeMoreTextView, abz0 abz0Var) {
        this.f199500c = seeMoreTextView;
        this.f199499b = abz0Var;
    }
}
