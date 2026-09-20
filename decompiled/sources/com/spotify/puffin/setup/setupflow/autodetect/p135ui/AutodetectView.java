package com.spotify.puffin.setup.setupflow.autodetect.p135ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ScrollView;
import androidx.compose.p002ui.platform.ComposeView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.c961;
import p204p.fyf;
import p204p.gd6;
import p204p.h8t0;
import p204p.mkr0;
import p204p.n58;
import p204p.o58;
import p204p.r58;
import p204p.vie1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m24212d2 = {"Lcom/spotify/puffin/setup/setupflow/autodetect/ui/AutodetectView;", "Landroid/widget/ScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/r58;", "data", "Lp/w2a1;", "setDeviceInformation", "(Lp/r58;)V", "setAnimation", "Lp/n58;", "actions", "setActions", "(Lp/n58;)V", "Lp/h8t0;", "a", "Lp/h8t0;", "getBinding", "()Lp/h8t0;", "binding", "src_main_java_com_spotify_puffin_setup_setupflow-setupflow"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AutodetectView extends ScrollView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final h8t0 binding;

    public AutodetectView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final void setActions(n58 actions) {
        h8t0 h8t0Var = this.binding;
        h8t0Var.f88791e.setOnClickListener(new o58(actions, 0));
        h8t0Var.f88792f.setOnClickListener(new o58(actions, 1));
    }

    private final void setAnimation(r58 data) {
        ComposeView composeView = this.binding.f88789c;
        composeView.setViewCompositionStrategy(mkr0.f144646T0);
        composeView.setContent(new fyf(new gd6(data, 10), true, 432158275));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0042  */
    private final void setDeviceInformation(r58 data) {
        String string;
        h8t0 h8t0Var = this.binding;
        EncoreTextView encoreTextView = h8t0Var.f88788b;
        Resources resources = getResources();
        data.getClass();
        boolean z = data.f195987d;
        encoreTextView.setText(resources.getString(R.string.compatible_title, data.f195985b));
        h8t0Var.f88790d.setText(getResources().getString(R.string.puffin_autodetect_subtitle));
        EncoreProgressIndicatorButton encoreProgressIndicatorButton = h8t0Var.f88791e;
        Integer num = data.f195986c;
        if (num != null) {
            string = getResources().getString(num.intValue());
            if (string == null) {
                string = "";
            }
        } else {
            string = "";
        }
        encoreProgressIndicatorButton.setText(string);
        encoreProgressIndicatorButton.setShowProgressIndicator(z);
        boolean z2 = !z;
        encoreProgressIndicatorButton.setEnabled(z2);
        h8t0Var.f88792f.setEnabled(z2);
    }

    /* JADX INFO: renamed from: a */
    public final void m20003a(r58 r58Var, c961 c961Var) {
        setActions(c961Var);
        setDeviceInformation(r58Var);
        setAnimation(r58Var);
    }

    public final h8t0 getBinding() {
        return this.binding;
    }

    public AutodetectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AutodetectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.puffin_autodetect_state_layout, this);
        int i2 = R.id.compatible_title;
        EncoreTextView encoreTextView = (EncoreTextView) vie1.m85629k(this, R.id.compatible_title);
        if (encoreTextView != null) {
            i2 = R.id.setupflow_animation;
            ComposeView composeView = (ComposeView) vie1.m85629k(this, R.id.setupflow_animation);
            if (composeView != null) {
                i2 = R.id.subtitle;
                EncoreTextView encoreTextView2 = (EncoreTextView) vie1.m85629k(this, R.id.subtitle);
                if (encoreTextView2 != null) {
                    i2 = R.id.turn_on_button;
                    EncoreProgressIndicatorButton encoreProgressIndicatorButton = (EncoreProgressIndicatorButton) vie1.m85629k(this, R.id.turn_on_button);
                    if (encoreProgressIndicatorButton != null) {
                        i2 = R.id.wrong_headphones_button;
                        EncoreButton encoreButton = (EncoreButton) vie1.m85629k(this, R.id.wrong_headphones_button);
                        if (encoreButton != null) {
                            this.binding = new h8t0(this, encoreTextView, composeView, encoreTextView2, encoreProgressIndicatorButton, encoreButton);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ AutodetectView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
