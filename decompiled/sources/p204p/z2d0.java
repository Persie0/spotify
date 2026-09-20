package p204p;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class z2d0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MaterialButtonToggleGroup f278550a;

    public z2d0(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f278550a = materialButtonToggleGroup;
    }

    /* JADX INFO: renamed from: a */
    public final void m95187a(MaterialButton materialButton, boolean z) {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f278550a;
        if (materialButtonToggleGroup.f2076g) {
            return;
        }
        if (materialButtonToggleGroup.f2077h) {
            materialButtonToggleGroup.f2079t = z ? materialButton.getId() : -1;
        }
        if (materialButtonToggleGroup.m1602d(materialButton.getId(), z)) {
            materialButton.getId();
            materialButtonToggleGroup.m1600b();
        }
        materialButtonToggleGroup.invalidate();
    }
}
