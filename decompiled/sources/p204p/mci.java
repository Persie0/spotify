package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class mci extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f142162a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f142163b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f142164c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mci(int i, List list, gh00 gh00Var) {
        super(0);
        this.f142162a = i;
        this.f142163b = gh00Var;
        this.f142164c = list;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f142162a) {
            case 0:
                this.f142163b.invoke(g6f.m43741q0(this.f142164c));
                break;
            case 1:
                this.f142163b.invoke(g6f.m43741q0(this.f142164c));
                break;
            default:
                this.f142163b.invoke(new jzy(this.f142164c));
                break;
        }
        return w2a1.f247311a;
    }
}
