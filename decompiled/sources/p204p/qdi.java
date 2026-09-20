package p204p;

import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class qdi implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f187693a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f187694b;

    /* JADX INFO: renamed from: c */
    public final ConstraintLayout f187695c;

    /* JADX INFO: renamed from: d */
    public final Barrier f187696d;

    public /* synthetic */ qdi(ConstraintLayout constraintLayout, ViewStub viewStub, ConstraintLayout constraintLayout2, Barrier barrier, int i) {
        this.f187693a = i;
        this.f187694b = constraintLayout;
        this.f187695c = constraintLayout2;
        this.f187696d = barrier;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        switch (this.f187693a) {
            case 0:
                break;
        }
        return this.f187694b;
    }
}
