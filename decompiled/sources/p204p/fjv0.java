package p204p;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class fjv0 implements tmy0 {

    /* JADX INFO: renamed from: a */
    public final RecyclerView f70406a;

    public /* synthetic */ fjv0(RecyclerView recyclerView) {
        this.f70406a = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    /* JADX INFO: renamed from: a */
    public void m41857a(dkv0 dkv0Var, qr8 qr8Var, qr8 qr8Var2) {
        boolean zMo33401m;
        dkv0Var.m36318A(false);
        RecyclerView recyclerView = this.f70406a;
        sc21 sc21Var = (sc21) recyclerView.f1251n1;
        if (qr8Var != null) {
            sc21Var.getClass();
            int i = qr8Var.f191759a;
            int i2 = qr8Var2.f191759a;
            if (i == i2 && qr8Var.f191760b == qr8Var2.f191760b) {
                sc21Var.mo33399k(dkv0Var);
                zMo33401m = true;
            } else {
                zMo33401m = sc21Var.mo33401m(dkv0Var, i, qr8Var.f191760b, i2, qr8Var2.f191760b);
            }
        } else {
            sc21Var.mo33399k(dkv0Var);
            zMo33401m = true;
        }
        if (zMo33401m) {
            recyclerView.m1012i0();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m41858b(dkv0 dkv0Var, qr8 qr8Var, qr8 qr8Var2) {
        boolean zMo33401m;
        RecyclerView recyclerView = this.f70406a;
        recyclerView.f1233c.m85791n(dkv0Var);
        recyclerView.m1009h(dkv0Var);
        dkv0Var.m36318A(false);
        sc21 sc21Var = (sc21) recyclerView.f1251n1;
        sc21Var.getClass();
        int i = qr8Var.f191759a;
        int i2 = qr8Var.f191760b;
        View view = dkv0Var.f50039a;
        int left = qr8Var2 == null ? view.getLeft() : qr8Var2.f191759a;
        int top = qr8Var2 == null ? view.getTop() : qr8Var2.f191760b;
        if (dkv0Var.m36330t() || (i == left && i2 == top)) {
            sc21Var.mo33402n(dkv0Var);
            zMo33401m = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zMo33401m = sc21Var.mo33401m(dkv0Var, i, i2, left, top);
        }
        if (zMo33401m) {
            recyclerView.m1012i0();
        }
    }

    @Override // p204p.tmy0
    /* JADX INFO: renamed from: c */
    public void mo28540c(int i) {
        this.f70406a.mo994O(0, i);
    }

    @Override // p204p.tmy0
    /* JADX INFO: renamed from: d */
    public boolean mo28541d() {
        return !this.f70406a.isLayoutSuppressed();
    }
}
