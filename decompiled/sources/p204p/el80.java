package p204p;

import android.view.View;
import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class el80 {

    /* JADX INFO: renamed from: a */
    public boolean f60640a;

    /* JADX INFO: renamed from: b */
    public int f60641b;

    /* JADX INFO: renamed from: c */
    public int f60642c;

    /* JADX INFO: renamed from: d */
    public int f60643d;

    /* JADX INFO: renamed from: e */
    public int f60644e;

    /* JADX INFO: renamed from: f */
    public int f60645f;

    /* JADX INFO: renamed from: g */
    public int f60646g;

    /* JADX INFO: renamed from: h */
    public int f60647h;

    /* JADX INFO: renamed from: i */
    public int f60648i;

    /* JADX INFO: renamed from: j */
    public int f60649j;

    /* JADX INFO: renamed from: k */
    public List f60650k;

    /* JADX INFO: renamed from: l */
    public boolean f60651l;

    /* JADX INFO: renamed from: a */
    public final void m39357a(View view) {
        int iM36324n;
        int size = this.f60650k.size();
        View view2 = null;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((dkv0) this.f60650k.get(i2)).f50039a;
            ojv0 ojv0Var = (ojv0) view3.getLayoutParams();
            if (view3 != view && !ojv0Var.f166147a.m36330t() && (iM36324n = (ojv0Var.f166147a.m36324n() - this.f60643d) * this.f60644e) >= 0 && iM36324n < i) {
                view2 = view3;
                if (iM36324n == 0) {
                    break;
                } else {
                    i = iM36324n;
                }
            }
        }
        if (view2 == null) {
            this.f60643d = -1;
        } else {
            this.f60643d = ((ojv0) view2.getLayoutParams()).f166147a.m36324n();
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m39358b(vjv0 vjv0Var) {
        List list = this.f60650k;
        if (list == null) {
            View viewM85781d = vjv0Var.m85781d(this.f60643d);
            this.f60643d += this.f60644e;
            return viewM85781d;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((dkv0) this.f60650k.get(i)).f50039a;
            ojv0 ojv0Var = (ojv0) view.getLayoutParams();
            if (!ojv0Var.f166147a.m36330t() && this.f60643d == ojv0Var.f166147a.m36324n()) {
                m39357a(view);
                return view;
            }
        }
        return null;
    }
}
