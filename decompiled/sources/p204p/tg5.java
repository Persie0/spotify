package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class tg5 extends AbstractC2440u5 {
    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: C */
    public final void mo53942C() {
        ((g7u) this.f226861b).f77354b.clear();
    }

    /* JADX INFO: renamed from: U */
    public final ArrayList m80732U() {
        w6u w6uVar = (w6u) this.f226862c;
        if (w6uVar instanceof g7u) {
            return ((g7u) w6uVar).f77354b;
        }
        throw new IllegalStateException("Current node cannot accept children");
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: b */
    public final void mo53943b(int i, int i2, int i3) {
        AbstractC2440u5.m82369B(i, i2, i3, m80732U());
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: f */
    public final void mo53944f(int i, int i2) {
        ArrayList arrayListM80732U = m80732U();
        if (i2 == 1) {
            arrayListM80732U.remove(i);
        } else {
            arrayListM80732U.subList(i, i2 + i).clear();
        }
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: i */
    public final void mo53945i(int i, Object obj) {
        w6u w6uVar = (w6u) obj;
        int i2 = ((g7u) this.f226862c).f77353a;
        if (i2 <= 0) {
            throw new IllegalArgumentException(("Too many embedded views for the current surface. The maximum depth is: " + ((g7u) this.f226861b).f77353a).toString());
        }
        if (w6uVar instanceof g7u) {
            ((g7u) w6uVar).f77353a = i2 - 1;
        }
        m80732U().add(i, w6uVar);
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ void mo53947n(int i, Object obj) {
    }
}
