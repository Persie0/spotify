package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b7q implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24369a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rv41 f24370b;

    public /* synthetic */ b7q(rv41 rv41Var, int i) {
        this.f24369a = i;
        this.f24370b = rv41Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f24369a) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                long j = ((n6f) this.f24370b.getValue()).f150873a;
                if (!as91.m27074b(j, n6f.f150871k)) {
                    DrawScope.m277h0(drawScope, j, 0L, 0L, 0.0f, null, null, 126);
                }
                return w2a1.f247311a;
            case 1:
                ((fdx0) obj).m41380b(((Number) this.f24370b.getValue()).floatValue());
                break;
            default:
                ((fdx0) obj).m41380b(((Number) this.f24370b.getValue()).floatValue());
                break;
        }
        return w2a1.f247311a;
    }
}
