package p204p;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class xf30 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f260820a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fg30 f260821b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f260822c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f260823d;

    public /* synthetic */ xf30(fg30 fg30Var, int i, List list) {
        this.f260821b = fg30Var;
        this.f260822c = i;
        this.f260823d = list;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f260820a) {
            case 0:
                fg30 fg30Var = this.f260821b;
                int i = this.f260822c;
                fg30Var.f69198X.getClass();
                try {
                    fg30Var.f69196V0.m64375i(i, 9);
                    synchronized (fg30Var) {
                        fg30Var.f69199X0.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return w2a1.f247311a;
            default:
                fg30 fg30Var2 = this.f260821b;
                int i2 = this.f260822c;
                fg30Var2.f69198X.getClass();
                try {
                    fg30Var2.f69196V0.m64375i(i2, 9);
                    synchronized (fg30Var2) {
                        fg30Var2.f69199X0.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused2) {
                }
                return w2a1.f247311a;
        }
    }

    public /* synthetic */ xf30(fg30 fg30Var, int i, List list, boolean z) {
        this.f260821b = fg30Var;
        this.f260822c = i;
        this.f260823d = list;
    }
}
