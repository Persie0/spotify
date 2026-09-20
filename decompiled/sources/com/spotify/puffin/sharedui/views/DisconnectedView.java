package com.spotify.puffin.sharedui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.lmr;
import p204p.ryp;
import p204p.u8t0;
import p204p.vie1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m24212d2 = {"Lcom/spotify/puffin/sharedui/views/DisconnectedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/lmr;", "actions", "Lp/w2a1;", "setActions", "(Lp/lmr;)V", "Lp/u8t0;", "R0", "Lp/u8t0;", "getBinding", "()Lp/u8t0;", "binding", "src_main_java_com_spotify_puffin_sharedui-sharedui"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class DisconnectedView extends ConstraintLayout {

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public final u8t0 binding;

    public DisconnectedView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final u8t0 getBinding() {
        return this.binding;
    }

    public final void setActions(lmr actions) {
        this.binding.f228016b.setOnClickListener(new ryp(actions, 2));
    }

    public DisconnectedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DisconnectedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.puffin_disconnected_state, this);
        int i2 = R.id.bullet1;
        if (((LinearLayout) vie1.m85629k(this, R.id.bullet1)) != null) {
            i2 = R.id.bullet2;
            if (((LinearLayout) vie1.m85629k(this, R.id.bullet2)) != null) {
                i2 = R.id.bullet3;
                if (((LinearLayout) vie1.m85629k(this, R.id.bullet3)) != null) {
                    i2 = R.id.bullet4;
                    if (((LinearLayout) vie1.m85629k(this, R.id.bullet4)) != null) {
                        i2 = R.id.center_progressbar;
                        if (((ProgressBar) vie1.m85629k(this, R.id.center_progressbar)) != null) {
                            i2 = R.id.description_textview_bullet1;
                            if (((TextView) vie1.m85629k(this, R.id.description_textview_bullet1)) != null) {
                                i2 = R.id.description_textview_bullet1_description;
                                if (((TextView) vie1.m85629k(this, R.id.description_textview_bullet1_description)) != null) {
                                    i2 = R.id.description_textview_bullet2;
                                    if (((TextView) vie1.m85629k(this, R.id.description_textview_bullet2)) != null) {
                                        i2 = R.id.description_textview_bullet2_description;
                                        if (((TextView) vie1.m85629k(this, R.id.description_textview_bullet2_description)) != null) {
                                            i2 = R.id.description_textview_bullet3;
                                            if (((TextView) vie1.m85629k(this, R.id.description_textview_bullet3)) != null) {
                                                i2 = R.id.description_textview_bullet3_description;
                                                if (((TextView) vie1.m85629k(this, R.id.description_textview_bullet3_description)) != null) {
                                                    i2 = R.id.description_textview_bullet4;
                                                    if (((TextView) vie1.m85629k(this, R.id.description_textview_bullet4)) != null) {
                                                        i2 = R.id.description_textview_bullet4_description;
                                                        if (((TextView) vie1.m85629k(this, R.id.description_textview_bullet4_description)) != null) {
                                                            i2 = R.id.disconnected_title;
                                                            if (((TextView) vie1.m85629k(this, R.id.disconnected_title)) != null) {
                                                                i2 = R.id.still_not_working_button;
                                                                Button button = (Button) vie1.m85629k(this, R.id.still_not_working_button);
                                                                if (button != null) {
                                                                    this.binding = new u8t0(this, button);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ DisconnectedView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
