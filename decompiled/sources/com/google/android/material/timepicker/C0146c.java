package com.google.android.material.timepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.spotify.music.R;
import p204p.C2374sf;
import p204p.C2647ze;
import p204p.c961;

/* JADX INFO: renamed from: com.google.android.material.timepicker.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C0146c extends C2647ze {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ClockFaceView f2326d;

    public C0146c(ClockFaceView clockFaceView) {
        this.f2326d = clockFaceView;
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: d */
    public final void mo1668d(View view, C2374sf c2374sf) {
        AccessibilityNodeInfo accessibilityNodeInfo = c2374sf.f208417a;
        this.f281839a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f2326d.f2301X0.get(iIntValue - 1));
        }
        c2374sf.m77980o(c961.m31864c(view.isSelected(), 0, 1, iIntValue, 1));
    }
}
