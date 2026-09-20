package p204p;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class vf30 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f240884a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fg30 f240885b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f240886c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f240887d;

    public /* synthetic */ vf30(fg30 fg30Var, int i, int i2, int i3) {
        this.f240884a = i3;
        this.f240885b = fg30Var;
        this.f240886c = i;
        this.f240887d = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f240884a) {
            case 0:
                fg30 fg30Var = this.f240885b;
                try {
                    fg30Var.f69196V0.m64375i(this.f240886c, this.f240887d);
                } catch (IOException e) {
                    fg30Var.m41564a(2, 2, e);
                }
                break;
            default:
                fg30 fg30Var2 = this.f240885b;
                try {
                    fg30Var2.f69196V0.m64374h(this.f240886c, this.f240887d, true);
                } catch (IOException e2) {
                    fg30Var2.m41564a(2, 2, e2);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
