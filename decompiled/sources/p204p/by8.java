package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public abstract class by8 extends va80 implements zh10, em20 {

    /* JADX INFO: renamed from: a */
    public final View f32103a;

    /* JADX INFO: renamed from: b */
    public final q591 f32104b;

    public by8(View view) {
        this.f32103a = view;
        this.f32104b = qjg1.m72913e(view);
    }

    @Override // p204p.em20
    /* JADX INFO: renamed from: a */
    public void mo30875a(float f, int i) {
        this.f32104b.mo31432a(f);
    }

    @Override // p204p.clc1
    public final View getView() {
        return this.f32103a;
    }
}
