package p204p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class oo70 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167503a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f167504b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo70(int i, int i2) {
        super(1);
        this.f167503a = i;
        this.f167504b = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        h6j h6jVar = (h6j) obj;
        if (this.f167503a == 0) {
            h6jVar.setMargins(this.f167504b, ((ViewGroup.MarginLayoutParams) h6jVar).topMargin, ((ViewGroup.MarginLayoutParams) h6jVar).rightMargin, ((ViewGroup.MarginLayoutParams) h6jVar).bottomMargin);
        }
        return w2a1.f247311a;
    }
}
