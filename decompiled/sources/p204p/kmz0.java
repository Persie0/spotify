package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kmz0 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f124245a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rv41 f124246b;

    public /* synthetic */ kmz0(rv41 rv41Var, int i) {
        this.f124245a = i;
        this.f124246b = rv41Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f124245a;
        rv41 rv41Var = this.f124246b;
        switch (i) {
            case 0:
                return new Offset(((Offset) rv41Var.getValue()).f493a);
            case 1:
                t05 t05Var = mmz0.f145287a;
                return new Offset(((Offset) rv41Var.getValue()).f493a);
            case 2:
                return Boolean.valueOf(((Number) rv41Var.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) rv41Var.getValue()).floatValue() > 0.0f);
        }
    }
}
