package com.spotify.encoreconsumermobile.elements.quickactions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.encoreconsumermobile.elements.quickactions.ban.BanButton;
import com.spotify.encoreconsumermobile.elements.quickactions.hide.HideButton;
import com.spotify.encoreconsumermobile.elements.quickactions.profile.ProfileButtonView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.C2042k7;
import p204p.dut0;
import p204p.eut0;
import p204p.fut0;
import p204p.gh00;
import p204p.gut0;
import p204p.hta0;
import p204p.hut0;
import p204p.iut0;
import p204p.j1l0;
import p204p.kmr0;
import p204p.li1;
import p204p.lut0;
import p204p.mut0;
import p204p.oqs;
import p204p.qe70;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/quickactions/QuickActionView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/lut0;", "viewContext", "(Lp/lut0;)V", "Lp/w2a1;", "setViewContext", "src_main_java_com_spotify_encoreconsumermobile_elements_quickactions-quickactions"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class QuickActionView extends FrameLayout implements oqs {

    /* JADX INFO: renamed from: a */
    public qe70 f3724a;

    /* JADX INFO: renamed from: b */
    public lut0 f3725b;

    public QuickActionView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.gr50
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(iut0 iut0Var) {
        int i;
        setClickable(!(iut0Var instanceof gut0));
        C2042k7 c2042k7 = new C2042k7(this, 8);
        View view = (View) (!c2042k7.hasNext() ? null : c2042k7.next());
        boolean zM88271j = wj50.m88271j((iut0) (view != null ? view.getTag() : null), iut0Var);
        gut0 gut0Var = gut0.f84543a;
        fut0 fut0Var = fut0.f73568a;
        eut0 eut0Var = eut0.f63075a;
        if (!zM88271j) {
            removeAllViews();
            if (wj50.m88271j(iut0Var, eut0Var)) {
                i = R.layout.ban_button_layout;
            } else if (iut0Var instanceof dut0) {
                i = R.layout.add_button_layout;
            } else if (iut0Var instanceof hut0) {
                i = R.layout.profile_button_layout;
            } else if (wj50.m88271j(iut0Var, fut0Var)) {
                i = R.layout.hide_button_layout;
            } else if (!wj50.m88271j(iut0Var, gut0Var)) {
                throw new NoWhenBranchMatchedException();
            }
            LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, true);
        }
        C2042k7 c2042k8 = new C2042k7(this, 8);
        View view2 = (View) (!c2042k8.hasNext() ? null : c2042k8.next());
        if (view2 != 0) {
            view2.setTag(iut0Var);
        }
        if (iut0Var.equals(gut0Var)) {
            return;
        }
        if (iut0Var instanceof dut0) {
            li1 li1Var = (li1) view2;
            li1Var.mo2820d(((dut0) iut0Var).f53274a);
            li1Var.mo2821c(new mut0(this, 0));
            return;
        }
        if (iut0Var.equals(eut0Var)) {
            BanButton banButton = (BanButton) view2;
            banButton.m9647a(true);
            banButton.mo2821c(new mut0(this, 1));
            return;
        }
        if (!(iut0Var instanceof hut0)) {
            if (!iut0Var.equals(fut0Var)) {
                throw new NoWhenBranchMatchedException();
            }
            HideButton hideButton = (HideButton) view2;
            hideButton.m9648a(true);
            hideButton.mo2821c(new mut0(this, 3));
            return;
        }
        ProfileButtonView profileButtonView = (ProfileButtonView) view2;
        hut0 hut0Var = (hut0) iut0Var;
        lut0 lut0Var = this.f3725b;
        if (lut0Var == null) {
            wj50.m88260d0("viewContext");
            throw null;
        }
        profileButtonView.setImageLoader(lut0Var.m60027b());
        profileButtonView.mo2820d(new kmr0(hut0Var.f95460a));
        profileButtonView.mo2821c(new mut0(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        this.f3724a = (qe70) gh00Var;
    }

    public final void setViewContext(lut0 viewContext) {
        this.f3725b = viewContext;
    }

    public QuickActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public QuickActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3724a = j1l0.f107778S0;
        context.getString(R.string.element_content_description_context_song);
        setOnClickListener(new hta0(this, 18));
    }

    public /* synthetic */ QuickActionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public QuickActionView(lut0 lut0Var) {
        this(lut0Var.m60026a(), null, 0, 6, null);
        setViewContext(lut0Var);
    }
}
