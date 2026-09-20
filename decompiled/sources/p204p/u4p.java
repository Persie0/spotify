package p204p;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class u4p extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f226782a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f226783b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u4p(int i, gh00 gh00Var) {
        super(1);
        this.f226782a = i;
        this.f226783b = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ipv ipvVar;
        switch (this.f226782a) {
            case 0:
                this.f226783b.invoke(y1f.f268254c);
                return w2a1.f247311a;
            case 1:
                this.f226783b.invoke(new a7i((String) obj));
                return w2a1.f247311a;
            case 2:
                this.f226783b.invoke(new w6i((String) obj));
                return w2a1.f247311a;
            case 3:
                this.f226783b.invoke(t6i.f217563a);
                return w2a1.f247311a;
            case 4:
                this.f226783b.invoke(q1m.f184373b);
                return w2a1.f247311a;
            case 5:
                return this.f226783b.invoke(obj);
            case 6:
                this.f226783b.invoke(v4u.f237241b);
                return w2a1.f247311a;
            case 7:
                this.f226783b.invoke(v4u.f237242c);
                return w2a1.f247311a;
            case 8:
                this.f226783b.invoke(v4u.f237240a);
                return w2a1.f247311a;
            case 9:
                this.f226783b.invoke(new w4u((Exception) obj));
                return w2a1.f247311a;
            case 10:
                this.f226783b.invoke(b6u.f24042a);
                return w2a1.f247311a;
            case 11:
                this.f226783b.invoke(b6u.f24044c);
                return w2a1.f247311a;
            case 12:
                this.f226783b.invoke(b6u.f24043b);
                return w2a1.f247311a;
            case 13:
                this.f226783b.invoke(b6u.f24045d);
                return w2a1.f247311a;
            case 14:
                InterfaceC2164nh interfaceC2164nh = (InterfaceC2164nh) obj;
                if (interfaceC2164nh.equals(C2052kh.f122492a)) {
                    ipvVar = ipv.f104568d;
                } else if (interfaceC2164nh.equals(C2090lh.f133327a)) {
                    ipvVar = ipv.f104567c;
                } else {
                    if (!interfaceC2164nh.equals(C2127mh.f143677a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ipvVar = ipv.f104569e;
                }
                this.f226783b.invoke(ipvVar);
                return w2a1.f247311a;
            case 15:
                ((Boolean) obj).booleanValue();
                this.f226783b.invoke(b1w.f22426e);
                return w2a1.f247311a;
            case 16:
                this.f226783b.invoke(b1w.f22425d);
                return w2a1.f247311a;
            case 17:
                this.f226783b.invoke(b1w.f22424c);
                return w2a1.f247311a;
            case 18:
                int iOrdinal = ((v10) obj).ordinal();
                gh00 gh00Var = this.f226783b;
                if (iOrdinal == 0) {
                    gh00Var.invoke(r1w.f194935c);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00Var.invoke(r1w.f194936d);
                }
                return w2a1.f247311a;
            case 19:
                ((Boolean) obj).booleanValue();
                this.f226783b.invoke(i7w.f99632a);
                return w2a1.f247311a;
            case 20:
                this.f226783b.invoke(new j7w(((v8w) obj).f238737a));
                return w2a1.f247311a;
            case 21:
                int iOrdinal2 = ((v10) obj).ordinal();
                if (iOrdinal2 == 0) {
                    this.f226783b.invoke(z8w.f280579b);
                } else if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
            case 22:
                this.f226783b.invoke(new q3z((List) obj));
                return w2a1.f247311a;
            case 23:
                this.f226783b.invoke(a8z.f13433a);
                return w2a1.f247311a;
            case 24:
                int iOrdinal3 = ((v10) obj).ordinal();
                if (iOrdinal3 == 0) {
                    this.f226783b.invoke(a030.f10980b);
                } else if (iOrdinal3 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
            case 25:
                this.f226783b.invoke(n640.f150681a);
                return w2a1.f247311a;
            case 26:
                this.f226783b.invoke(wg80.f251005a);
                return w2a1.f247311a;
            case 27:
                this.f226783b.invoke(lt90.f136728a);
                return w2a1.f247311a;
            case 28:
                this.f226783b.invoke(lt90.f136729b);
                return w2a1.f247311a;
            default:
                this.f226783b.invoke(e2l0.f55483c);
                return w2a1.f247311a;
        }
    }
}
