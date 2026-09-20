package com.spotify.puffin.setup.setupflow.p137ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.ghw;
import p204p.hhw;
import p204p.lhw;
import p204p.vie1;
import p204p.w8t0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m24212d2 = {"Lcom/spotify/puffin/setup/setupflow/ui/ErrorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/ghw;", "actions", "Lp/w2a1;", "setActions", "(Lp/ghw;)V", "Lp/w8t0;", "R0", "Lp/w8t0;", "getBinding", "()Lp/w8t0;", "binding", "src_main_java_com_spotify_puffin_setup_setupflow-setupflow"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ErrorView extends ConstraintLayout {

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public final w8t0 binding;

    public ErrorView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final void setActions(ghw actions) {
        w8t0 w8t0Var = this.binding;
        w8t0Var.f249011c.setOnClickListener(new hhw(actions, 0));
        w8t0Var.f249012d.setOnClickListener(new hhw(actions, 1));
    }

    public final w8t0 getBinding() {
        return this.binding;
    }

    /* JADX INFO: renamed from: x */
    public final void m20004x(lhw lhwVar, ghw ghwVar) {
        w8t0 w8t0Var = this.binding;
        w8t0Var.f249013e.setText(getResources().getString(R.string.puffin_headphones_optimization_error_title));
        w8t0Var.f249010b.setText(getResources().getString(lhwVar.f133653a));
        w8t0Var.f249011c.setVisibility(0);
        w8t0Var.f249012d.setVisibility(0);
        setActions(ghwVar);
    }

    public ErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.puffin_error_layout, this);
        int i2 = R.id.description_error;
        EncoreTextView encoreTextView = (EncoreTextView) vie1.m85629k(this, R.id.description_error);
        if (encoreTextView != null) {
            i2 = R.id.error_buttons;
            if (((LinearLayout) vie1.m85629k(this, R.id.error_buttons)) != null) {
                i2 = R.id.primary_button;
                EncoreButton encoreButton = (EncoreButton) vie1.m85629k(this, R.id.primary_button);
                if (encoreButton != null) {
                    i2 = R.id.secondary_button;
                    EncoreButton encoreButton2 = (EncoreButton) vie1.m85629k(this, R.id.secondary_button);
                    if (encoreButton2 != null) {
                        i2 = R.id.title_error;
                        EncoreTextView encoreTextView2 = (EncoreTextView) vie1.m85629k(this, R.id.title_error);
                        if (encoreTextView2 != null) {
                            this.binding = new w8t0(this, encoreTextView, encoreButton, encoreButton2, encoreTextView2);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ ErrorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
