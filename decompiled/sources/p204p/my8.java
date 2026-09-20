package p204p;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.music.R;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lp/my8;", "Lp/xba;", "<init>", "()V", "src_main_java_com_spotify_bottomsheet_core-core"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class my8 extends xba {

    /* JADX INFO: renamed from: Q1 */
    public final wg61 f148353Q1 = new wg61(new so5(this, 25));

    /* JADX INFO: renamed from: R1 */
    public final boolean f148354R1 = true;

    /* JADX INFO: renamed from: S1 */
    public final boolean f148355S1 = true;

    @Override // p204p.i500
    /* JADX INFO: renamed from: R0 */
    public void mo881R0(View view, Bundle bundle) {
        CoordinatorLayout coordinatorLayout;
        wba wbaVar;
        if (this.f148355S1) {
            View view2 = this.f98706h1;
            Iterator it = btz0.m30487K(view2 instanceof ViewGroup ? (ViewGroup) view2 : null, in8.f103894R0).iterator();
            do {
                if (!it.hasNext()) {
                    coordinatorLayout = null;
                    break;
                } else {
                    ViewGroup viewGroup = (ViewGroup) it.next();
                    coordinatorLayout = viewGroup instanceof CoordinatorLayout ? (CoordinatorLayout) viewGroup : null;
                }
            } while (coordinatorLayout == null);
            if (coordinatorLayout != null && (wbaVar = (wba) this.f230244L1) != null) {
                View view3 = this.f98706h1;
                ViewGroup viewGroup2 = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
                if (viewGroup2 != null) {
                    coordinatorLayout.addView(new rrk(wbaVar.m87626g(), viewGroup2));
                }
            }
        }
        p3h1.m69032r(view.getRootView(), new zk3(this, 22));
    }

    @Override // p204p.ugr
    /* JADX INFO: renamed from: j1 */
    public final Dialog mo63161j1() {
        return (wba) this.f230244L1;
    }

    @Override // p204p.ugr
    /* JADX INFO: renamed from: k1 */
    public final int mo33450k1() {
        return R.style.CoreBottomSheetTheme;
    }

    @Override // p204p.xba, p204p.o65, p204p.ugr
    /* JADX INFO: renamed from: l1 */
    public final Dialog mo25833l1(Bundle bundle) {
        srk srkVar = new srk(m49702X0(), new l02(0, this, my8.class, "allowDismissal", "allowDismissal()Z", 0, 0, 1));
        mo38127t1(srkVar);
        return srkVar;
    }

    @Override // p204p.ugr, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo41980u1();
    }

    @Override // p204p.ugr
    /* JADX INFO: renamed from: p1 */
    public final void mo63162p1(c700 c700Var, String str) {
        ytg1.m94615f(c700Var, this);
        super.mo63162p1(c700Var, str);
    }

    @Override // p204p.ugr
    /* JADX INFO: renamed from: q1 */
    public final void mo63163q1(c700 c700Var, String str) {
        ytg1.m94615f(c700Var, this);
        super.mo63163q1(c700Var, str);
    }

    /* JADX INFO: renamed from: r1 */
    public boolean mo63164r1() {
        return true;
    }

    /* JADX INFO: renamed from: s1, reason: from getter */
    public boolean getF148354R1() {
        return this.f148354R1;
    }

    /* JADX INFO: renamed from: v1 */
    public abstract void mo50804v1(dx40 dx40Var);

    /* JADX INFO: renamed from: u1 */
    public void mo41980u1() {
    }

    /* JADX INFO: renamed from: t1 */
    public void mo38127t1(srk srkVar) {
    }
}
