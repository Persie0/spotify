package p204p;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class z5e implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: a */
    public ViewGroup.OnHierarchyChangeListener f279547a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ChipGroup f279548b;

    public z5e(ChipGroup chipGroup) {
        this.f279548b = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f279548b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = mec1.f142677a;
                view2.setId(View.generateViewId());
            }
            Chip chip = (Chip) view2;
            if (chip.isChecked()) {
                ((ChipGroup) view).m1614b(chip.getId());
            }
            chip.setOnCheckedChangeListenerInternal(chipGroup.f2113i);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f279547a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view == this.f279548b && (view2 instanceof Chip)) {
            ((Chip) view2).setOnCheckedChangeListenerInternal(null);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f279547a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
