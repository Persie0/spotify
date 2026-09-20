package p204p;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes3.dex */
public final class ikc1 extends LinearLayoutManager {

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ ViewPager2 f103088e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikc1(ViewPager2 viewPager2) {
        super(1);
        this.f103088e1 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: A0 */
    public final boolean mo1088A0(vjv0 vjv0Var, zjv0 zjv0Var, int i, Bundle bundle) {
        this.f103088e1.f1390U0.getClass();
        return super.mo1088A0(vjv0Var, zjv0Var, i, bundle);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: F0 */
    public final boolean mo1094F0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: V0 */
    public final void mo927V0(zjv0 zjv0Var, int[] iArr) {
        ViewPager2 viewPager2 = this.f103088e1;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.mo927V0(zjv0Var, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: l0 */
    public final void mo905l0(vjv0 vjv0Var, zjv0 zjv0Var, C2374sf c2374sf) {
        super.mo905l0(vjv0Var, zjv0Var, c2374sf);
        this.f103088e1.f1390U0.getClass();
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: n0 */
    public final void mo907n0(vjv0 vjv0Var, zjv0 zjv0Var, View view, C2374sf c2374sf) {
        int iM1083V;
        int iM1083V2;
        ViewPager2 viewPager2 = this.f103088e1.f1390U0.f134324d;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.f1397g.getClass();
            iM1083V = AbstractC0110a.m1083V(view);
        } else {
            iM1083V = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.f1397g.getClass();
            iM1083V2 = AbstractC0110a.m1083V(view);
        } else {
            iM1083V2 = 0;
        }
        c2374sf.m77980o(c961.m31864c(false, iM1083V, 1, iM1083V2, 1));
    }
}
