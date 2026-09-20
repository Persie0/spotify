package p204p;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class gma extends CoordinatorLayout {

    /* JADX INFO: renamed from: Z0 */
    public final View f81341Z0;

    /* JADX INFO: renamed from: a1 */
    public final RecyclerView f81342a1;

    /* JADX INFO: renamed from: b1 */
    public final View f81343b1;

    /* JADX INFO: renamed from: c1 */
    public final ViewGroup f81344c1;

    /* JADX INFO: renamed from: d1 */
    public final ComposeView f81345d1;

    /* JADX INFO: renamed from: e1 */
    public v290 f81346e1;

    /* JADX INFO: renamed from: f1 */
    public swd1 f81347f1;

    /* JADX INFO: renamed from: g1 */
    public ArrayList f81348g1;

    /* JADX INFO: renamed from: h1 */
    public String f81349h1;

    public gma(Context context) {
        super(context, null, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.browse_content_state, (ViewGroup) this, true);
        this.f81341Z0 = viewInflate;
        this.f81342a1 = (RecyclerView) viewInflate.findViewById(R.id.browse_recycler_view);
        this.f81343b1 = viewInflate.findViewById(R.id.browse_app_bar);
        this.f81344c1 = (ViewGroup) viewInflate.findViewById(R.id.browse_toolbar_container);
        this.f81345d1 = (ComposeView) viewInflate.findViewById(R.id.browse_search_bar_container);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View viewFindFocus;
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 61 && keyEvent.isShiftPressed() && (viewFindFocus = findFocus()) != null) {
            while (viewFindFocus != null) {
                RecyclerView recyclerView = this.f81342a1;
                if (viewFindFocus.equals(recyclerView)) {
                    AbstractC0110a layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if ((linearLayoutManager != null ? linearLayoutManager.m936d1() : -1) != 0 || !this.f81345d1.requestFocus()) {
                        break;
                        break;
                    }
                    return true;
                }
                Object parent = viewFindFocus.getParent();
                viewFindFocus = parent instanceof View ? (View) parent : null;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final View getAppBarLayout() {
        return this.f81343b1;
    }

    public final RecyclerView getRecyclerView() {
        return this.f81342a1;
    }

    public final ViewGroup getToolbarContainer() {
        return this.f81344c1;
    }
}
