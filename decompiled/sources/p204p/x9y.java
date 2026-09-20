package p204p;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class x9y extends RecyclerView {
    @Override // android.view.View
    public int getLeftPaddingOffset() {
        return -getPaddingLeft();
    }

    @Override // android.view.View
    public int getRightPaddingOffset() {
        return getPaddingRight();
    }

    @Override // android.view.View
    public final boolean isPaddingOffsetRequired() {
        return true;
    }
}
