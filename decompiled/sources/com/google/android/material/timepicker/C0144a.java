package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p204p.xf71;

/* JADX INFO: renamed from: com.google.android.material.timepicker.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C0144a extends xf71 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ChipTextInputComboView f2324b;

    public C0144a(ChipTextInputComboView chipTextInputComboView) {
        super(1);
        this.f2324b = chipTextInputComboView;
    }

    @Override // p204p.xf71, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ChipTextInputComboView chipTextInputComboView = this.f2324b;
        Chip chip = chipTextInputComboView.f2296a;
        if (TextUtils.isEmpty(editable)) {
            chip.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt("00"))));
        } else {
            chip.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(editable)))));
        }
    }
}
