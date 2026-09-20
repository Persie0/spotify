package com.spotify.encoreconsumermobile.elements.addtobutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.ViewOnClickListenerC1708bk;
import p204p.exg1;
import p204p.gh00;
import p204p.gtq;
import p204p.li1;
import p204p.phf1;
import p204p.pi1;
import p204p.qi1;
import p204p.r9b0;
import p204p.ri1;
import p204p.si1;
import p204p.ti1;

/* JADX INFO: loaded from: classes6.dex */
@gtq
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/addtobutton/AddToButtonView;", "Lp/li1;", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "listener", "Lp/w2a1;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "src_main_java_com_spotify_encoreconsumermobile_elements_addtobutton-addtobutton"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AddToButtonView extends StateListAnimatorImageButton implements li1 {

    /* JADX INFO: renamed from: d */
    public pi1 f3590d;

    /* JADX INFO: renamed from: e */
    public boolean f3591e;

    public AddToButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(pi1 pi1Var) {
        String string;
        this.f3590d = pi1Var;
        exg1 exg1Var = pi1Var.f177813e;
        boolean z = exg1Var instanceof si1;
        qi1 qi1Var = qi1.f188892a;
        if (z) {
            m9578b();
        } else if (exg1Var instanceof ti1) {
            r9b0 r9b0VarM69997p = phf1.m69997p(getContext(), this.f3590d.f177809a == qi1Var ? R.raw.save_now_undo_white : R.raw.save_now_positive_white);
            setImageDrawable(r9b0VarM69997p);
            if (this.f3591e || this.f3590d.f177810b) {
                r9b0VarM69997p.m75030k();
                this.f3591e = false;
            } else {
                r9b0VarM69997p.m75034o((int) r9b0VarM69997p.f196990b.m46924k());
            }
        } else {
            if (!(exg1Var instanceof ri1)) {
                throw new NoWhenBranchMatchedException();
            }
            m9578b();
        }
        pi1 pi1Var2 = this.f3590d;
        qi1 qi1Var2 = pi1Var2.f177809a;
        String str = pi1Var2.f177812d;
        String str2 = pi1Var2.f177811c;
        if (qi1Var2 == qi1Var && str2 != null && str != null) {
            Context context = getContext();
            pi1 pi1Var3 = this.f3590d;
            string = context.getString(R.string.add_to_button_content_description_with_details_add, pi1Var3.f177811c, pi1Var3.f177812d);
        } else if (qi1Var2 == qi1Var) {
            string = getContext().getString(R.string.add_to_button_content_description_add);
        } else if (qi1Var2 != qi1.f188893b || str2 == null || str == null) {
            string = getContext().getString(R.string.add_to_button_content_description_added);
        } else {
            Context context2 = getContext();
            pi1 pi1Var4 = this.f3590d;
            string = context2.getString(R.string.add_to_button_content_description_with_details_added, pi1Var4.f177811c, pi1Var4.f177812d);
        }
        setContentDescription(string);
    }

    /* JADX INFO: renamed from: b */
    public final void m9578b() {
        r9b0 r9b0VarM69997p = phf1.m69997p(getContext(), this.f3590d.f177809a == qi1.f188892a ? R.raw.save_now_undo_gray65 : R.raw.save_now_positive_gray65);
        setImageDrawable(r9b0VarM69997p);
        if (!this.f3591e && !this.f3590d.f177810b) {
            r9b0VarM69997p.m75034o((int) r9b0VarM69997p.f196990b.m46924k());
        } else {
            r9b0VarM69997p.m75030k();
            this.f3591e = false;
        }
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        super.setOnClickListener(new ViewOnClickListenerC1708bk(this, gh00Var));
    }

    @Override // android.view.View
    @gtq
    public void setOnClickListener(View.OnClickListener listener) {
        super.setOnClickListener(listener);
    }

    public AddToButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AddToButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3590d = new pi1(qi1.f188892a, false, null, null, null, 28);
    }

    public /* synthetic */ AddToButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
