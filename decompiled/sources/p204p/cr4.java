package p204p;

import androidx.compose.p002ui.geometry.Offset;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cr4 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41178a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f41179b;

    public /* synthetic */ cr4(kqi0 kqi0Var, int i) {
        this.f41178a = i;
        this.f41179b = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f41178a) {
            case 0:
                this.f41179b.setValue((jo70) obj);
                return w2a1.f247311a;
            case 1:
                this.f41179b.setValue((jo70) obj);
                return w2a1.f247311a;
            case 2:
                m171 m171Var = (m171) obj;
                this.f41179b.setValue(m171Var.f138860c ? m171Var.f138859b : m171Var.f138858a);
                return w2a1.f247311a;
            case 3:
                List list = (List) obj;
                kqi0 kqi0Var = this.f41179b;
                if (kqi0Var != null) {
                    kqi0Var.setValue(list);
                }
                return w2a1.f247311a;
            case 4:
                ((gh00) this.f41179b.getValue()).invoke((Offset) obj);
                return w2a1.f247311a;
            case 5:
                Float f = (Float) obj;
                f.getClass();
                ((gh00) this.f41179b.getValue()).invoke(f);
                return w2a1.f247311a;
            case 6:
                this.f41179b.setValue((jo70) obj);
                return w2a1.f247311a;
            case 7:
                Float f2 = (Float) obj;
                f2.getClass();
                return Float.valueOf(((Number) ((gh00) this.f41179b.getValue()).invoke(f2)).floatValue());
            case 8:
                ((gh00) this.f41179b.getValue()).invoke((Offset) obj);
                return w2a1.f247311a;
            default:
                this.f41179b.setValue((jo70) obj);
                return w2a1.f247311a;
        }
    }
}
