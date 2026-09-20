package com.spotify.messaging.messagingplatformdebug.items;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.spotify.music.R;
import java.util.ArrayList;
import kotlin.Metadata;
import p204p.gh00;
import p204p.ker0;
import p204p.oer0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\fJ!\u0010\u0011\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/messaging/messagingplatformdebug/items/PriorityPicker;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function1;", "Lp/ker0;", "Lp/w2a1;", "onPriorityUpdated", "setOnPriorityUpdatedListener", "(Lp/gh00;)V", "src_main_java_com_spotify_messaging_messagingplatformdebug-messagingplatformdebug"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PriorityPicker extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final Spinner f5512a;

    public PriorityPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.priority_item_debug_messaging_platform, (ViewGroup) this, true);
        this.f5512a = (Spinner) findViewById(R.id.dropdown_common_priority);
        ker0[] ker0VarArrValues = ker0.values();
        ArrayList arrayList = new ArrayList(ker0VarArrValues.length);
        for (ker0 ker0Var : ker0VarArrValues) {
            arrayList.add(ker0Var.name());
        }
        this.f5512a.setAdapter((SpinnerAdapter) new ArrayAdapter(this.f5512a.getContext(), android.R.layout.simple_spinner_dropdown_item, arrayList));
        this.f5512a.setSelection(arrayList.indexOf("DEFAULT"));
    }

    public final void setOnPriorityUpdatedListener(gh00 onPriorityUpdated) {
        this.f5512a.setOnItemSelectedListener(new oer0(onPriorityUpdated, this));
    }

    public PriorityPicker(Context context) {
        this(context, null);
    }

    public PriorityPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
