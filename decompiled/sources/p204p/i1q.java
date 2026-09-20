package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class i1q implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f97570a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k1q f97571b;

    public /* synthetic */ i1q(k1q k1qVar, int i) {
        this.f97570a = i;
        this.f97571b = k1qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f97570a) {
            case 0:
                this.f97571b.f118412f.invoke(ywr0.f277036X);
                break;
            case 1:
                this.f97571b.f118412f.invoke(ywr0.f277043e);
                break;
            default:
                this.f97571b.f118412f.invoke(ywr0.f277042d);
                break;
        }
    }
}
