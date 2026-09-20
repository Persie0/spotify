package p204p;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class gjb0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f80426a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f80427b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gjb0(int i, gh00 gh00Var) {
        super(1);
        this.f80426a = i;
        this.f80427b = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f80426a) {
            case 0:
                this.f80427b.invoke(new yge1((List) obj));
                return w2a1.f247311a;
            case 1:
                this.f80427b.invoke((zge1) obj);
                return w2a1.f247311a;
            case 2:
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                this.f80427b.invoke(new mnb0(str));
                return w2a1.f247311a;
            case 3:
                this.f80427b.invoke(new jnb0((String) obj));
                return w2a1.f247311a;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    this.f80427b.invoke(lnb0.f135128a);
                }
                return w2a1.f247311a;
            case 5:
                this.f80427b.invoke(new nnb0((String) obj));
                return w2a1.f247311a;
            case 6:
                int iOrdinal = ((j0c0) obj).ordinal();
                gh00 gh00Var = this.f80427b;
                if (iOrdinal == 0) {
                    gh00Var.invoke(vzs.f246533a);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00Var.invoke(uzs.f235628a);
                }
                return w2a1.f247311a;
            case 7:
                this.f80427b.invoke(new f2c0((k3c0) obj));
                return w2a1.f247311a;
            case 8:
                this.f80427b.invoke(new w9e0(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 9:
                this.f80427b.invoke(new z9e0(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 10:
                this.f80427b.invoke(new eae0(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 11:
                this.f80427b.invoke(new h5c0(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 12:
                this.f80427b.invoke(new l5c0(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 13:
                this.f80427b.invoke(new i7c0(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 14:
                this.f80427b.invoke(new v7c0(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 15:
                this.f80427b.invoke(new s7c0(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 16:
                this.f80427b.invoke(new p7c0(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 17:
                this.f80427b.invoke(new m7c0(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 18:
                this.f80427b.invoke(new r9i0((k8e0) obj));
                return w2a1.f247311a;
            case 19:
                this.f80427b.invoke(q9i0.f186600b);
                return w2a1.f247311a;
            case 20:
                this.f80427b.invoke(q9i0.f186604f);
                return w2a1.f247311a;
            case 21:
                this.f80427b.invoke(q9i0.f186601c);
                return w2a1.f247311a;
            case 22:
                this.f80427b.invoke(q9i0.f186603e);
                return w2a1.f247311a;
            case 23:
                this.f80427b.invoke(new v9i0((k8e0) obj));
                return w2a1.f247311a;
            case 24:
                this.f80427b.invoke(u9i0.f228204b);
                return w2a1.f247311a;
            case 25:
                this.f80427b.invoke(u9i0.f228209g);
                return w2a1.f247311a;
            case 26:
                this.f80427b.invoke(u9i0.f228205c);
                return w2a1.f247311a;
            case 27:
                this.f80427b.invoke(u9i0.f228206d);
                return w2a1.f247311a;
            case 28:
                this.f80427b.invoke(u9i0.f228208f);
                return w2a1.f247311a;
            default:
                this.f80427b.invoke(new z9i0((k8e0) obj));
                return w2a1.f247311a;
        }
    }
}
