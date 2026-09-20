package p204p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ofj0 extends CoordinatorLayout implements igj0 {

    /* JADX INFO: renamed from: d1 */
    public static final /* synthetic */ int f164776d1 = 0;

    /* JADX INFO: renamed from: Z0 */
    public final wg61 f164777Z0;

    /* JADX INFO: renamed from: a1 */
    public final nfj0 f164778a1;

    /* JADX INFO: renamed from: b1 */
    public final View f164779b1;

    /* JADX INFO: renamed from: c1 */
    public final hqk f164780c1;

    public ofj0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f164777Z0 = new wg61(new ccj0(this, 5));
        nfj0 nfj0Var = new nfj0();
        this.f164778a1 = nfj0Var;
        View view = new View(getContext());
        WeakHashMap weakHashMap = mec1.f142677a;
        cec1.m32548l(view, cec1.m32541e(view));
        this.f164779b1 = view;
        hqk hqkVar = new hqk(0, 0);
        hqkVar.m48293b(nfj0Var);
        this.f164780c1 = hqkVar;
    }

    private final jgj0 getHelper() {
        return (jgj0) this.f164777Z0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getNestedTarget() {
        View view = this.f164778a1.f153390h;
        if (view != null) {
            return qjg1.m72917i(view);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getHelper().m53296a(f, f2, z) && isNestedScrollingEnabled();
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getHelper().m53297b(f, f2) && isNestedScrollingEnabled();
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getHelper().m53298c(i, i2, 0, iArr, iArr2) && isNestedScrollingEnabled();
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getHelper().m53299d(i, i2, i3, i4, iArr, 0, null) && isNestedScrollingEnabled();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getHelper().m53301f(0) && isNestedScrollingEnabled();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            hqk hqkVar = this.f164780c1;
            ((ViewGroup.MarginLayoutParams) hqkVar).width = i3 - i;
            ((ViewGroup.MarginLayoutParams) hqkVar).height = i4 - i2;
            View view = this.f164779b1;
            removeViewInLayout(view);
            addViewInLayout(view, -1, hqkVar);
        }
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getHelper().m53303h(i, 0) && isNestedScrollingEnabled();
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getHelper().m53304i(0);
    }
}
