package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;
import p204p.dkv0;
import p204p.mec1;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C0141b extends dkv0 {

    /* JADX INFO: renamed from: S0 */
    public final TextView f2118S0;

    /* JADX INFO: renamed from: T0 */
    public final MaterialCalendarGridView f2119T0;

    public C0141b(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f2118S0 = textView;
        mec1.m61565q(textView, true);
        this.f2119T0 = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
