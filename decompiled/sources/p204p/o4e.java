package p204p;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class o4e extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Chip f161659a;

    public o4e(Chip chip) {
        this.f161659a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Chip chip = this.f161659a;
        if (chip.f2101e != null) {
            chip.f2101e.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
