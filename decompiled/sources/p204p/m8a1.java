package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m8a1 implements Update {

    /* JADX INFO: renamed from: a */
    public static final m8a1 f140999a = new m8a1();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        l8a1 l8a1Var = (l8a1) obj;
        j8a1 j8a1Var = (j8a1) obj2;
        boolean z = j8a1Var instanceof h8a1;
        v8a1 v8a1Var = t8a1.f218034a;
        if (z) {
            if (((h8a1) j8a1Var).f88668a.length() == 0) {
                v8a1Var = r8a1.f196747a;
            }
            return Next.m15606h(l8a1.m58466a(l8a1Var, v8a1Var));
        }
        if (j8a1Var instanceof f8a1) {
            f8a1 f8a1Var = (f8a1) j8a1Var;
            int i = f8a1Var.f66932a;
            if (k8a1.f120277a[edb.m38547C(i)] != 1) {
                v8a1Var = s8a1.f206614a;
            }
            l8a1 l8a1VarM58466a = l8a1.m58466a(l8a1Var, v8a1Var);
            r7a1 r7a1Var = new r7a1(l8a1Var.f130830a, f8a1Var.f66933b);
            if (i != 1) {
                r7a1Var = null;
            }
            return Next.m15607i(l8a1VarM58466a, s601.m77311n0(r7a1Var));
        }
        if (j8a1Var instanceof i8a1) {
            return Next.m15607i(l8a1.m58466a(l8a1Var, u8a1.f227880a), Collections.singleton(new s7a1(((i8a1) j8a1Var).f99751a, l8a1Var.f130831b, l8a1Var.f130832c)));
        }
        boolean zEquals = j8a1Var.equals(e8a1.f57121a);
        o7a1 o7a1Var = o7a1.f162507a;
        if (zEquals) {
            return Next.m15605a(bk5.m29624m1(new t7a1[]{q7a1.f186058a, o7a1Var}));
        }
        if (j8a1Var.equals(d8a1.f46416a)) {
            return Next.m15607i(l8a1.m58466a(l8a1Var, v8a1Var), Collections.singleton(p7a1.f174634a));
        }
        if (j8a1Var.equals(g8a1.f77447a)) {
            return Next.m15605a(Collections.singleton(o7a1Var));
        }
        throw new NoWhenBranchMatchedException();
    }
}
