package com.spotify.puffin.setup.setupflow.manualselect.p136ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.find.FindInContextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.bec0;
import p204p.cam;
import p204p.dat0;
import p204p.g8z;
import p204p.iq6;
import p204p.rls0;
import p204p.vie1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/puffin/setup/setupflow/manualselect/ui/ManualSelectView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/dat0;", "R0", "Lp/dat0;", "getBinding", "()Lp/dat0;", "binding", "p/k0a0", "src_main_java_com_spotify_puffin_setup_setupflow-setupflow"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ManualSelectView extends ConstraintLayout {

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public final dat0 binding;

    /* JADX INFO: renamed from: S0 */
    public final rls0 f6590S0;

    /* JADX INFO: renamed from: T0 */
    public final g8z f6591T0;

    public ManualSelectView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final dat0 getBinding() {
        return this.binding;
    }

    public ManualSelectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ManualSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.puffin_manual_state_layout, this);
        int i2 = R.id.bottom_gradient;
        View viewM85629k = vie1.m85629k(this, R.id.bottom_gradient);
        if (viewM85629k != null) {
            i2 = R.id.cant_find_headphones_button;
            EncoreButton encoreButton = (EncoreButton) vie1.m85629k(this, R.id.cant_find_headphones_button);
            if (encoreButton != null) {
                i2 = R.id.devices_recyclerview;
                RecyclerView recyclerView = (RecyclerView) vie1.m85629k(this, R.id.devices_recyclerview);
                if (recyclerView != null) {
                    i2 = R.id.find_searchview;
                    FindInContextView findInContextView = (FindInContextView) vie1.m85629k(this, R.id.find_searchview);
                    if (findInContextView != null) {
                        i2 = R.id.subtitle_textview;
                        if (((EncoreTextView) vie1.m85629k(this, R.id.subtitle_textview)) != null) {
                            i2 = R.id.title_textview;
                            if (((EncoreTextView) vie1.m85629k(this, R.id.title_textview)) != null) {
                                this.binding = new dat0(this, viewM85629k, encoreButton, recyclerView, findInContextView);
                                rls0 rls0Var = new rls0();
                                this.f6590S0 = rls0Var;
                                cam camVar = new cam(context.getString(R.string.puffin_search_context_description_context));
                                this.f6591T0 = new g8z(camVar);
                                recyclerView.setAdapter(rls0Var);
                                recyclerView.setLayoutManager(new AccessibleLinearLayoutManager(1));
                                recyclerView.setItemAnimator(null);
                                findInContextView.f3658S0.setText("");
                                findInContextView.m9621z(camVar);
                                recyclerView.m1018m(new iq6(this, 11));
                                recyclerView.setOnApplyWindowInsetsListener(new bec0(this));
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ ManualSelectView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
