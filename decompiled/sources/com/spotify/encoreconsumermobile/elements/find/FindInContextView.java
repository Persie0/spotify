package com.spotify.encoreconsumermobile.elements.find;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.clearbutton.ClearButtonView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.azg1;
import p204p.cam;
import p204p.ciq;
import p204p.fef;
import p204p.g8z;
import p204p.gh00;
import p204p.gtq;
import p204p.kk6;
import p204p.ndp;
import p204p.ol51;
import p204p.oqs;
import p204p.tc41;
import p204p.vc41;
import p204p.wj50;
import p204p.y28;

/* JADX INFO: loaded from: classes6.dex */
@gtq
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/find/FindInContextView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_find-find"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class FindInContextView extends ConstraintLayout implements oqs {

    /* JADX INFO: renamed from: R0 */
    public final View f3657R0;

    /* JADX INFO: renamed from: S0 */
    public final EditText f3658S0;

    /* JADX INFO: renamed from: T0 */
    public final ClearButtonView f3659T0;

    public FindInContextView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        this.f3659T0.setOnClickListener(new ndp(this, gh00Var));
        fef fefVar = new fef(this, gh00Var);
        EditText editText = this.f3658S0;
        editText.addTextChangedListener(fefVar);
        editText.setOnKeyListener(new ciq(gh00Var));
        editText.setOnFocusChangeListener(new y28(gh00Var));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        g8z g8zVar = (g8z) obj;
        g8zVar.getClass();
        this.f3658S0.setText("");
        m9621z(g8zVar.f77631a);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m9620x() {
        return this.f3658S0.getText().length() > 0;
    }

    /* JADX INFO: renamed from: z */
    public final void m9621z(azg1 azg1Var) {
        String string;
        if (azg1Var instanceof ol51) {
            string = getResources().getString(((ol51) azg1Var).mo66944r());
        } else {
            if (!(azg1Var instanceof cam)) {
                throw new NoWhenBranchMatchedException();
            }
            string = ((cam) azg1Var).f35839b;
        }
        wj50.m88279p(string);
        EditText editText = this.f3658S0;
        editText.setHint(string);
        editText.setContentDescription(string);
        ClearButtonView clearButtonView = this.f3659T0;
        clearButtonView.setContentDescription(clearButtonView.getContext().getString(R.string.clear_button_content_description, string));
    }

    public FindInContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FindInContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.find_in_context_layout, (ViewGroup) this, true);
        this.f3657R0 = viewInflate;
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(R.id.search_icon);
        this.f3658S0 = (EditText) viewInflate.findViewById(R.id.edit_text);
        ClearButtonView clearButtonView = (ClearButtonView) viewInflate.findViewById(R.id.clear_text_button);
        this.f3659T0 = clearButtonView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackground(context.getDrawable(R.drawable.find_in_context_background));
        float dimension = getContext().getResources().getDimension(R.dimen.encore_action_button_icon_size_small);
        int color = getContext().getColor(R.color.white);
        tc41 tc41Var = new tc41(getContext(), vc41.SEARCH, dimension);
        tc41Var.m80417b(color);
        appCompatImageView.setImageDrawable(tc41Var);
        if (isLaidOut() && !isLayoutRequested()) {
            clearButtonView.setVisibility(m9620x() ? 0 : 8);
        } else {
            addOnLayoutChangeListener(new kk6(this, 13));
        }
    }

    public /* synthetic */ FindInContextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
