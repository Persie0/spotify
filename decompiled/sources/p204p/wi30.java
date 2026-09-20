package p204p;

import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: loaded from: classes6.dex */
public final class wi30 extends ofj0 {
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof vi30) {
            super.onRestoreInstanceState(((vi30) parcelable).f241608a);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final Parcelable onSaveInstanceState() {
        iqk iqkVar = (iqk) super.onSaveInstanceState();
        vi30 vi30Var = new vi30(AbsSavedState.EMPTY_STATE);
        vi30Var.f241608a = iqkVar;
        return vi30Var;
    }
}
