package p204p;

import androidx.compose.p002ui.geometry.Offset;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class m2c1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f139315a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f139316b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2c1(int i, gh00 gh00Var) {
        super(1);
        this.f139315a = i;
        this.f139316b = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Object h2c1Var;
        switch (this.f139315a) {
            case 0:
                b0w0 b0w0Var = (b0w0) obj;
                if (b0w0Var instanceof wzv0) {
                    wzv0 wzv0Var = (wzv0) b0w0Var;
                    int i = wzv0Var.f256692a;
                    String str = wzv0Var.f256693b;
                    String str2 = wzv0Var.f256694c;
                    int iOrdinal = wzv0Var.f256695d.ordinal();
                    int i2 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            i2 = 2;
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i2 = 3;
                        }
                    }
                    h2c1Var = new c2c1(i, str, i2, str2);
                } else if (b0w0Var instanceof xzv0) {
                    h2c1Var = new d2c1();
                } else if (b0w0Var instanceof yzv0) {
                    yzv0 yzv0Var = (yzv0) b0w0Var;
                    h2c1Var = new e2c1(yzv0Var.f277908a, yzv0Var.f277909b);
                } else if (b0w0Var instanceof zzv0) {
                    zzv0 zzv0Var = (zzv0) b0w0Var;
                    h2c1Var = new h2c1(zzv0Var.f288120a, zzv0Var.f288121b);
                } else {
                    h2c1Var = b0w0Var.equals(a0w0.f11180a) ? g2c1.f75886a : null;
                }
                if (h2c1Var != null) {
                    this.f139316b.invoke(h2c1Var);
                }
                return w2a1.f247311a;
            case 1:
                long j = ((Offset) obj).f493a;
                this.f139316b.invoke(s5c1.f205774b);
                return w2a1.f247311a;
            case 2:
                long j2 = ((Offset) obj).f493a;
                this.f139316b.invoke(s5c1.f205773a);
                return w2a1.f247311a;
            case 3:
                this.f139316b.invoke(new m6c1((String) obj));
                return w2a1.f247311a;
            case 4:
                this.f139316b.invoke(new qvc1((String) obj));
                return w2a1.f247311a;
            case 5:
                this.f139316b.invoke(new tvc1((String) obj));
                return w2a1.f247311a;
            case 6:
                this.f139316b.invoke(new lbe1(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            default:
                if (((hkl) obj).equals(fkl.f70561d)) {
                    this.f139316b.invoke(gce1.f78576a);
                }
                return w2a1.f247311a;
        }
    }
}
