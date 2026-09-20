package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sie implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f209467a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f209468b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f209469c;

    public /* synthetic */ sie(kqi0 kqi0Var, gh00 gh00Var, int i) {
        this.f209467a = i;
        this.f209468b = kqi0Var;
        this.f209469c = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f209467a) {
            case 0:
                db71 db71Var = (db71) obj;
                this.f209468b.setValue(db71Var);
                this.f209469c.invoke(db71Var);
                break;
            default:
                Offset offset = (Offset) obj;
                db71 db71Var2 = (db71) this.f209468b.getValue();
                if (db71Var2 != null) {
                    this.f209469c.invoke(Integer.valueOf(db71Var2.f47231b.m95500g(offset.f493a)));
                }
                break;
        }
        return w2a1.f247311a;
    }
}
