package p204p;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes8.dex */
public final class gam0 implements nqc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f78076a;

    /* JADX INFO: renamed from: b */
    public final xoi0 f78077b;

    public gam0(int i) {
        this.f78076a = i;
        switch (i) {
            case 1:
                this.f78077b = new xoi0();
                break;
            default:
                this.f78077b = new xoi0(new Rect(0, 0, 0, 0));
                break;
        }
    }

    @Override // p204p.nqc1
    /* JADX INFO: renamed from: a */
    public final ck90 mo44173a() {
        switch (this.f78076a) {
            case 0:
                break;
        }
        return this.f78077b;
    }
}
