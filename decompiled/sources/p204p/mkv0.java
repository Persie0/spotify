package p204p;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class mkv0 extends xd40 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f144696a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f144697b;

    public /* synthetic */ mkv0(int i, ViewGroup viewGroup) {
        this.f144696a = i;
        this.f144697b = viewGroup;
    }

    @Override // p204p.xd40
    /* JADX INFO: renamed from: a */
    public final wd40 mo62185a(pqm0 pqm0Var) {
        View view;
        uze1 uze1VarM90407b;
        switch (this.f144696a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f144697b;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int iM939g1 = linearLayoutManager.m939g1();
                int iM942i1 = linearLayoutManager.m942i1();
                if (iM939g1 <= iM942i1) {
                    while (true) {
                        dkv0 dkv0VarM993M = recyclerView.m993M(iM939g1);
                        if (dkv0VarM993M != null && (view = dkv0VarM993M.f50039a) != null) {
                            view.getGlobalVisibleRect(new Rect());
                            if (!xd40.m90408c(pqm0Var, view) || (uze1VarM90407b = xd40.m90407b(view)) == null) {
                                if (iM939g1 != iM942i1) {
                                    iM939g1++;
                                }
                            } else if (xd40.m90408c(pqm0Var, uze1VarM90407b.getView())) {
                                return new wd40(uze1VarM90407b, uze1VarM90407b.getRectF());
                            }
                        }
                    }
                }
                return null;
            default:
                Rect rect = new Rect();
                ViewGroup viewGroup = this.f144697b;
                viewGroup.getGlobalVisibleRect(rect);
                PointF pointF = (PointF) pqm0Var.f180350a;
                PointF pointF2 = new PointF(rect.left + pointF.x, rect.top + pointF.y);
                PointF pointF3 = (PointF) pqm0Var.f180351b;
                PointF pointF4 = new PointF(rect.left + pointF3.x, rect.top + pointF3.y);
                uze1 uze1VarM90407b2 = xd40.m90407b(viewGroup);
                if (uze1VarM90407b2 == null) {
                    return null;
                }
                View view2 = uze1VarM90407b2.getView();
                Rect rect2 = new Rect();
                view2.getGlobalVisibleRect(rect2);
                Point point = new Point((int) pointF2.x, (int) pointF2.y);
                if (!rect2.contains(point.x, point.y)) {
                    return null;
                }
                Point point2 = new Point((int) pointF4.x, (int) pointF4.y);
                if (rect2.contains(point2.x, point2.y)) {
                    return new wd40(uze1VarM90407b2, uze1VarM90407b2.getRectF());
                }
                return null;
        }
    }
}
