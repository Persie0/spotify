package p204p;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class x551 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f258305a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConstraintLayout f258306b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f258307c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f258308d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f258309e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ View f258310f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ View f258311g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ View f258312h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x551(View view, ConstraintLayout constraintLayout, int i, View view2, int i2, View view3, View view4, View view5) {
        super(1);
        this.f258305a = view;
        this.f258306b = constraintLayout;
        this.f258307c = i;
        this.f258308d = view2;
        this.f258309e = i2;
        this.f258310f = view3;
        this.f258311g = view4;
        this.f258312h = view5;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        c7j c7jVar = (c7j) obj;
        ConstraintLayout constraintLayout = this.f258306b;
        View view = this.f258308d;
        View view2 = this.f258305a;
        if (view2 != null) {
            c7jVar.m31737g(view2.getId(), 3, constraintLayout.getId(), 3);
            c7jVar.m31737g(view2.getId(), 4, constraintLayout.getId(), 4);
            c7jVar.m31737g(view2.getId(), 6, constraintLayout.getId(), 6);
            c7jVar.m31740l(view2.getId()).f258686e.f269861y = 0.0f;
            int id = view2.getId();
            int i = this.f258307c;
            c7jVar.m31745u(id, 3, i);
            c7jVar.m31745u(view2.getId(), 4, i);
            c7jVar.m31737g(view.getId(), 6, view2.getId(), 7);
            c7jVar.m31744t(view.getId(), this.f258309e);
            c7jVar.m31737g(view.getId(), 3, view2.getId(), 3);
            c7jVar.m31737g(view.getId(), 4, view2.getId(), 4);
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            c7jVar.m31737g(view.getId(), 3, viewGroup.getId(), 3);
            c7jVar.m31737g(view.getId(), 4, viewGroup.getId(), 4);
            c7jVar.m31737g(view.getId(), 6, constraintLayout.getId(), 6);
        }
        View view3 = this.f258311g;
        View view4 = this.f258310f;
        if (view4 != null) {
            c7jVar.m31737g(view4.getId(), 6, view.getId(), 7);
            c7jVar.m31737g(view4.getId(), 7, view3.getId(), 6);
            c7jVar.m31737g(view4.getId(), 4, view.getId(), 4);
            c7jVar.m31737g(view4.getId(), 3, view.getId(), 3);
            c7jVar.m31737g(view.getId(), 7, view4.getId(), 6);
            c7jVar.m31737g(view3.getId(), 6, view4.getId(), 7);
        } else {
            c7jVar.m31737g(view.getId(), 7, view3.getId(), 6);
        }
        c7jVar.m31737g(view3.getId(), 7, constraintLayout.getId(), 7);
        c7jVar.m31737g(view3.getId(), 4, view.getId(), 4);
        c7jVar.m31737g(view3.getId(), 3, view.getId(), 3);
        c7jVar.m31737g(this.f258312h.getId(), 4, constraintLayout.getId(), 4);
        return w2a1.f247311a;
    }
}
