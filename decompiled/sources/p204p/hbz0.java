package p204p;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class hbz0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f89641a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SeeMoreTextView f89642b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bbz0 f89643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hbz0(SeeMoreTextView seeMoreTextView, bbz0 bbz0Var, int i) {
        super(0);
        this.f89641a = i;
        this.f89642b = seeMoreTextView;
        this.f89643c = bbz0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f89641a) {
            case 0:
                bbz0 bbz0Var = this.f89643c;
                SpannableString spannableStringValueOf = SpannableString.valueOf(bbz0Var.f25689a);
                SeeMoreTextView seeMoreTextView = this.f89642b;
                int i = seeMoreTextView.f3738P0;
                String str = seeMoreTextView.f3735M0;
                String str2 = bbz0Var.f25691c;
                SpannableStringBuilder spannableStringBuilderM9653w = SeeMoreTextView.m9653w(seeMoreTextView, spannableStringValueOf, i, str2 == null ? str : str2);
                if (str2 != null) {
                    str = str2;
                }
                seeMoreTextView.m9655x(spannableStringBuilderM9653w, str, seeMoreTextView.getSeeMoreSpan());
                return spannableStringBuilderM9653w;
            default:
                SeeMoreTextView seeMoreTextView2 = this.f89642b;
                boolean z = seeMoreTextView2.f3743U0;
                String str3 = seeMoreTextView2.f3736N0;
                bbz0 bbz0Var2 = this.f89643c;
                if (!z || seeMoreTextView2.m9656y(SpannableString.valueOf(bbz0Var2.f25689a)).getLineCount() <= seeMoreTextView2.f3739Q0) {
                    return SeeMoreTextView.m9652v(seeMoreTextView2, bbz0Var2.f25689a);
                }
                SpannableStringBuilder spannableStringBuilderM9653w2 = SeeMoreTextView.m9653w(seeMoreTextView2, SpannableString.valueOf(bbz0Var2.f25689a), seeMoreTextView2.f3739Q0, str3);
                spannableStringBuilderM9653w2.append('\n');
                seeMoreTextView2.m9655x(spannableStringBuilderM9653w2, str3, seeMoreTextView2.getSeeLessSpan());
                return spannableStringBuilderM9653w2;
        }
    }
}
