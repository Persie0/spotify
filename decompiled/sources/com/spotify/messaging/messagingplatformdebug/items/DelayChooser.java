package com.spotify.messaging.messagingplatformdebug.items;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.spotify.music.R;
import kotlin.Metadata;
import p204p.bm51;
import p204p.fef;
import p204p.gh00;
import p204p.puo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\fJ!\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/messaging/messagingplatformdebug/items/DelayChooser;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function1;", "Lp/w2a1;", "onDelayUpdated", "setOnDelayUpdatedListener", "(Lp/gh00;)V", "src_main_java_com_spotify_messaging_messagingplatformdebug-messagingplatformdebug"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class DelayChooser extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final CheckBox f5510a;

    /* JADX INFO: renamed from: b */
    public final TextInputEditText f5511b;

    public DelayChooser(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.delay_item_debug_messaging_platform, (ViewGroup) this, true);
        this.f5510a = (CheckBox) findViewById(R.id.delay_checkbox_common_delay);
        TextInputEditText textInputEditText = (TextInputEditText) findViewById(R.id.delay_edit_common_delay);
        this.f5511b = textInputEditText;
        textInputEditText.setEnabled(false);
    }

    /* JADX INFO: renamed from: a */
    public static final int m15321a(DelayChooser delayChooser) {
        String string;
        Integer numM29807r0;
        TextInputEditText textInputEditText = delayChooser.f5511b;
        if (!delayChooser.f5510a.isChecked()) {
            return 0;
        }
        Editable text = textInputEditText.getText();
        int iIntValue = (text == null || (string = text.toString()) == null || (numM29807r0 = bm51.m29807r0(string)) == null) ? -1 : numM29807r0.intValue();
        if (iIntValue == -1) {
            textInputEditText.setError("Invalid delay value");
        }
        return iIntValue;
    }

    public final void setOnDelayUpdatedListener(gh00 onDelayUpdated) {
        this.f5510a.setOnCheckedChangeListener(new puo(2, this, onDelayUpdated));
        this.f5511b.addTextChangedListener(new fef(2, onDelayUpdated, this));
    }

    public DelayChooser(Context context) {
        this(context, null);
    }

    public DelayChooser(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
