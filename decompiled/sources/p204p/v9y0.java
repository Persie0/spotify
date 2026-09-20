package p204p;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v9y0 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f239066a;

    public /* synthetic */ v9y0(int i) {
        this.f239066a = i;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        x7y0 x7y0Var = (x7y0) obj;
        switch (this.f239066a) {
            case 0:
                Shadow shadow = (Shadow) obj2;
                return h6f.m46710G(z9y0.m95741a(new n6f(shadow.f497a), z9y0.f280924r, x7y0Var), z9y0.m95741a(new Offset(shadow.f498b), z9y0.f280932z, x7y0Var), Float.valueOf(shadow.f499c));
            case 1:
                return Integer.valueOf(((h171) obj2).f86525a);
            case 2:
                return Integer.valueOf(((k571) obj2).m55429e());
            case 3:
                return Integer.valueOf(((xt30) obj2).m92007e());
            case 4:
                return Integer.valueOf(((FontStyle) obj2).f516a);
            case 5:
                return Integer.valueOf(((FontSynthesis) obj2).f517a);
            default:
                o971 o971Var = (o971) obj2;
                return h6f.m46710G(z9y0.m95741a(o971Var.f162953a, z9y0.f280907a, x7y0Var), z9y0.m95741a(new ic71(o971Var.f162954b), z9y0.f280922p, x7y0Var));
        }
    }
}
