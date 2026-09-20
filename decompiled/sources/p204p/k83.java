package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final class k83 extends gba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f120240a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wba f120241b;

    public /* synthetic */ k83(wba wbaVar, int i) {
        this.f120240a = i;
        this.f120241b = wbaVar;
    }

    @Override // p204p.gba
    /* JADX INFO: renamed from: a */
    public final void mo33380a(View view, float f) {
        int i = this.f120240a;
    }

    @Override // p204p.gba
    /* JADX INFO: renamed from: b */
    public final void mo33381b(View view, int i) {
        switch (this.f120240a) {
            case 0:
                if (i == 4) {
                    this.f120241b.m87626g().m1578L(5);
                }
                break;
            case 1:
                if (i == 5) {
                    this.f120241b.cancel();
                }
                break;
            default:
                if (i == 4) {
                    this.f120241b.m87626g().m1578L(5);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m55722c(View view, float f) {
    }

    /* JADX INFO: renamed from: d */
    private final void m55723d(View view, float f) {
    }

    /* JADX INFO: renamed from: e */
    private final void m55724e(View view, float f) {
    }
}
