package com.spotify.search.uiusecases.actionbarsearch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.addtobutton.EncoreAddToButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.edb;
import p204p.gh00;
import p204p.ood0;
import p204p.oqs;
import p204p.pi1;
import p204p.qi1;
import p204p.t10;
import p204p.vie1;
import p204p.w10;
import p204p.x10;
import p204p.ydj;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/search/uiusecases/actionbarsearch/ActionBarComplexRowSearchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_search_uiusecases-uiusecases"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ActionBarComplexRowSearchView extends ConstraintLayout implements oqs {

    /* JADX INFO: renamed from: R0 */
    public final ood0 f6647R0;

    public ActionBarComplexRowSearchView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        ood0 ood0Var = this.f6647R0;
        ((EncoreAddToButtonView) ood0Var.f167566c).mo2821c(new x10(0, gh00Var));
        ((ContextMenuButton) ood0Var.f167567d).mo2821c(new x10(1, gh00Var));
    }

    /* JADX INFO: renamed from: x */
    public final boolean m20728x() {
        return ((ContextMenuButton) this.f6647R0.f167567d).getVisibility() == 0;
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(w10 w10Var) {
        int i = w10Var.f246911c;
        t10 t10Var = w10Var.f246910b;
        ood0 ood0Var = this.f6647R0;
        if (t10Var == null && i == 0) {
            ((ActionBarComplexRowSearchView) ood0Var.f167565b).setVisibility(8);
            return;
        }
        ActionBarComplexRowSearchView actionBarComplexRowSearchView = (ActionBarComplexRowSearchView) ood0Var.f167565b;
        ContextMenuButton contextMenuButton = (ContextMenuButton) ood0Var.f167567d;
        EncoreAddToButtonView encoreAddToButtonView = (EncoreAddToButtonView) ood0Var.f167566c;
        actionBarComplexRowSearchView.setVisibility(0);
        if (t10Var != null) {
            boolean z = t10Var.f216046a;
            String str = w10Var.f246909a;
            encoreAddToButtonView.setVisibility(0);
            encoreAddToButtonView.mo2820d(new pi1(z ? qi1.f188893b : qi1.f188892a, false, str, getContext().getResources().getString(R.string.action_bar_add_to_library_context_accessibility), null, 16));
        } else {
            encoreAddToButtonView.setVisibility(8);
        }
        if (i == 0) {
            contextMenuButton.setVisibility(8);
            return;
        }
        String str2 = w10Var.f246909a;
        contextMenuButton.setVisibility(0);
        int iM38547C = edb.m38547C(i);
        int i2 = 3;
        if (iM38547C != 0) {
            if (iM38547C == 1) {
                i2 = 6;
            } else if (iM38547C == 2) {
                i2 = 5;
            } else if (iM38547C == 3) {
                i2 = 1;
            } else {
                if (iM38547C != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 2;
            }
        }
        contextMenuButton.setEnabled(true);
        contextMenuButton.setContentDescription(contextMenuButton.getResources().getString(ydj.m93443b(i2), str2));
    }

    public ActionBarComplexRowSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ActionBarComplexRowSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.action_bar_complex_row_search_layout, this);
        int i2 = R.id.add_button;
        EncoreAddToButtonView encoreAddToButtonView = (EncoreAddToButtonView) vie1.m85629k(this, R.id.add_button);
        if (encoreAddToButtonView != null) {
            i2 = R.id.context_menu_button;
            ContextMenuButton contextMenuButton = (ContextMenuButton) vie1.m85629k(this, R.id.context_menu_button);
            if (contextMenuButton != null) {
                this.f6647R0 = new ood0(this, encoreAddToButtonView, contextMenuButton, 6);
                setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ ActionBarComplexRowSearchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
