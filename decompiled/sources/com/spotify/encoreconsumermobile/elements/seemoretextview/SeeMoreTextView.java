package com.spotify.encoreconsumermobile.elements.seemoretextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.car.app.model.Alert;
import com.spotify.music.R;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.AbstractC2202o5;
import p204p.bbz0;
import p204p.bk5;
import p204p.bm51;
import p204p.c2u0;
import p204p.cbz0;
import p204p.edb;
import p204p.eh00;
import p204p.fbz0;
import p204p.gbz0;
import p204p.gh00;
import p204p.gk71;
import p204p.hbz0;
import p204p.hta0;
import p204p.ibz0;
import p204p.oqs;
import p204p.qe70;
import p204p.wg61;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002:\u0003'()B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006*"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/seemoretextview/SeeMoreTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "l", "Lp/w2a1;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "maxLines", "setMaxLines", "(I)V", "setExpandedMaxLines", "Lp/bbz0;", "model", "setExpandedText", "(Lp/bbz0;)V", "setCollapsedText", "value", "h", "Lp/bbz0;", "getModel", "()Lp/bbz0;", "Landroid/text/style/ClickableSpan;", "R0", "Lp/fr70;", "getSeeMoreSpan", "()Landroid/text/style/ClickableSpan;", "seeMoreSpan", "S0", "getSeeLessSpan", "seeLessSpan", "p/rie", "p/fbz0", "p/er3", "src_main_java_com_spotify_encoreconsumermobile_elements_seemoretextview-seemoretextview"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SeeMoreTextView extends AppCompatTextView implements oqs {

    /* JADX INFO: renamed from: V0 */
    public static final Pattern f3733V0 = Pattern.compile(" ");

    /* JADX INFO: renamed from: L0 */
    public final String f3734L0;

    /* JADX INFO: renamed from: M0 */
    public final String f3735M0;

    /* JADX INFO: renamed from: N0 */
    public final String f3736N0;

    /* JADX INFO: renamed from: O0 */
    public final String f3737O0;

    /* JADX INFO: renamed from: P0 */
    public int f3738P0;

    /* JADX INFO: renamed from: Q0 */
    public int f3739Q0;

    /* JADX INFO: renamed from: R0 */
    public final wg61 f3740R0;

    /* JADX INFO: renamed from: S0 */
    public final wg61 f3741S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f3742T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f3743U0;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public bbz0 model;

    /* JADX INFO: renamed from: i */
    public final String f3745i;

    /* JADX INFO: renamed from: t */
    public qe70 f3746t;

    public SeeMoreTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClickableSpan getSeeLessSpan() {
        return (ClickableSpan) this.f3741S0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClickableSpan getSeeMoreSpan() {
        return (ClickableSpan) this.f3740R0.getValue();
    }

    private final void setCollapsedText(bbz0 model) {
        super.setMaxLines(this.f3738P0);
        m9654B(model, new hbz0(this, model, 0));
    }

    private final void setExpandedText(bbz0 model) {
        super.setMaxLines(Alert.DURATION_SHOW_INDEFINITELY);
        m9654B(model, new hbz0(this, model, 1));
    }

    /* JADX INFO: renamed from: v */
    public static final SpannableStringBuilder m9652v(SeeMoreTextView seeMoreTextView, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append('\n');
        seeMoreTextView.m9655x(spannableStringBuilder, seeMoreTextView.f3737O0, seeMoreTextView.getSeeLessSpan());
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: w */
    public static final SpannableStringBuilder m9653w(SeeMoreTextView seeMoreTextView, SpannableString spannableString, int i, String str) {
        CharSequence charSequenceSubSequence;
        int length;
        CharSequence charSequenceSubSequence2 = spannableString.subSequence(0, seeMoreTextView.m9656y(spannableString).getLineEnd(i - 1));
        char[] cArr = {'\n'};
        int length2 = charSequenceSubSequence2.length() - 1;
        if (length2 < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i2 = length2 - 1;
            if (!bk5.m29617j0(cArr, charSequenceSubSequence2.charAt(length2))) {
                charSequenceSubSequence = charSequenceSubSequence2.subSequence(0, length2 + 1);
                break;
            }
            if (i2 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length2 = i2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceSubSequence);
        while (true) {
            if (seeMoreTextView.m9656y(spannableStringBuilder.toString() + str).getLineCount() <= i || (length = spannableStringBuilder.length() - str.length()) <= 0 || length >= spannableStringBuilder.length()) {
                break;
            }
            spannableStringBuilder.delete(length, spannableStringBuilder.length());
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: B */
    public final void m9654B(bbz0 bbz0Var, eh00 eh00Var) {
        CharSequence charSequence = bbz0Var.f25689a;
        boolean z = getWidth() > 0 && this.f3738P0 > 0 && m9656y(charSequence).getLineCount() > this.f3738P0;
        if (z) {
            setMovementMethod(LinkMovementMethod.getInstance());
            setText((CharSequence) eh00Var.invoke(), TextView.BufferType.NORMAL);
        } else {
            setMovementMethod(null);
            setText(charSequence);
        }
        post(new ibz0(this, bbz0Var, charSequence, z, eh00Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        this.f3746t = (qe70) gh00Var;
    }

    public final bbz0 getModel() {
        return this.model;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fbz0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fbz0 fbz0Var = (fbz0) parcelable;
        super.onRestoreInstanceState(fbz0Var.f161807a);
        cbz0 cbz0Var = fbz0Var.f67960c;
        if (cbz0Var != null) {
            bbz0 bbz0VarM28652a = bbz0.m28652a(this.model, null, cbz0Var, null, 5);
            this.model = bbz0VarM28652a;
            int iOrdinal = bbz0VarM28652a.f25690b.ordinal();
            if (iOrdinal == 0) {
                setCollapsedText(bbz0VarM28652a);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                setExpandedText(bbz0VarM28652a);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = AbstractC2202o5.f161806b;
        }
        fbz0 fbz0Var = new fbz0(parcelableOnSaveInstanceState);
        fbz0Var.f67960c = this.model.f25690b;
        return fbz0Var;
    }

    public final void setExpandedMaxLines(int maxLines) {
        if (maxLines >= 0 && maxLines >= this.f3738P0) {
            this.f3739Q0 = maxLines;
        }
        this.f3743U0 = this.f3739Q0 != Integer.MAX_VALUE;
        if (this.f3742T0) {
            mo2820d(this.model);
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int maxLines) {
        this.f3738P0 = maxLines;
        if (this.f3742T0) {
            mo2820d(this.model);
        } else {
            super.setMaxLines(maxLines);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l) {
        gk71.f80747a.m83942J("Use SeeMoreText.Events.DisplayTextClicked instead to gather general click events of this view", new Object[0]);
        super.setOnClickListener(l);
    }

    /* JADX INFO: renamed from: x */
    public final void m9655x(SpannableStringBuilder spannableStringBuilder, String str, ClickableSpan clickableSpan) {
        spannableStringBuilder.append((CharSequence) str);
        String str2 = this.f3734L0;
        spannableStringBuilder.setSpan(clickableSpan, (spannableStringBuilder.length() - str.length()) + (bm51.m29803n0(str, str2, false) ? str2.length() : 0), spannableStringBuilder.length(), 33);
    }

    /* JADX INFO: renamed from: y */
    public final StaticLayout m9656y(CharSequence charSequence) {
        int measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        Layout.Alignment alignment = getLayout() != null ? getLayout().getAlignment() : Layout.Alignment.ALIGN_NORMAL;
        wj50.m88279p(alignment);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), measuredWidth).setAlignment(alignment).setTextDirection(TextDirectionHeuristics.ANYRTL_LTR).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).setBreakStrategy(getBreakStrategy()).setHyphenationFrequency(getHyphenationFrequency());
        if (Build.VERSION.SDK_INT >= 26) {
            hyphenationFrequency.setJustificationMode(getJustificationMode());
        }
        return hyphenationFrequency.build();
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(bbz0 bbz0Var) {
        this.f3742T0 = true;
        this.model = bbz0Var;
        int iOrdinal = bbz0Var.f25690b.ordinal();
        if (iOrdinal == 0) {
            setCollapsedText(bbz0Var);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            setExpandedText(bbz0Var);
        }
    }

    public SeeMoreTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SeeMoreTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.model = new bbz0(6, "");
        this.f3745i = context.getString(R.string.see_less_text);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c2u0.f33468a, 0, 0);
        String string = typedArrayObtainStyledAttributes.getResources().getString(typedArrayObtainStyledAttributes.getResourceId(0, R.string.see_less_text));
        wj50.m88279p(string);
        this.f3745i = string;
        typedArrayObtainStyledAttributes.recycle();
        super.setOnClickListener(new hta0(this, 26));
        this.f3734L0 = "…";
        String string2 = getResources().getString(R.string.see_more_text);
        Pattern pattern = f3733V0;
        this.f3735M0 = edb.m38564m("… ", pattern.matcher(string2).replaceAll(" "));
        this.f3736N0 = edb.m38564m("…", pattern.matcher(this.f3745i).replaceAll(" "));
        this.f3737O0 = this.f3745i;
        this.f3738P0 = getMaxLines();
        this.f3739Q0 = Alert.DURATION_SHOW_INDEFINITELY;
        this.f3740R0 = new wg61(new gbz0(this, 1));
        this.f3741S0 = new wg61(new gbz0(this, 0));
    }

    public /* synthetic */ SeeMoreTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
