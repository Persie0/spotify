package p204p;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public final class jp1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114543a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u9m f114544b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp1(u9m u9mVar, int i) {
        super(0);
        this.f114543a = i;
        this.f114544b = u9mVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f114543a) {
            case 0:
                return this.f114544b.m82646c();
            case 1:
                return this.f114544b.m82646c();
            case 2:
                return (RectF) this.f114544b.f228232h.getValue();
            default:
                u9m u9mVar = this.f114544b;
                return new pqm0(Integer.valueOf(u9mVar.m82647d()), Integer.valueOf(((Number) u9mVar.f228228d.getValue()).intValue()));
        }
    }
}
