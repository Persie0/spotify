package p204p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a02 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        d02 d02Var = (d02) obj;
        yz1 yz1Var = (yz1) obj2;
        if (!(yz1Var instanceof uz1)) {
            if (yz1Var instanceof tz1) {
                return Next.m15606h(d02.m34487a(d02Var, null, null, null, false, false, true, 3071));
            }
            if (yz1Var instanceof vz1) {
                return Next.m15607i(d02.m34487a(d02Var, null, null, null, true, false, false, 7167), Effects.m15571a(new oz1("https://www.spotify.com/account/profile")));
            }
            if (yz1Var instanceof sz1) {
                return Next.m15607i(d02.m34487a(d02Var, null, null, null, true, false, false, 7167), Effects.m15571a(new oz1("https://www.spotify.com/account/privacy/#tailored-ads")));
            }
            if (yz1Var instanceof xz1) {
                return Next.m15607i(d02.m34487a(d02Var, null, null, null, false, false, false, 7167), Effects.m15571a(new nz1(((xz1) yz1Var).f267504a)));
            }
            if (yz1Var instanceof wz1) {
                return Next.m15605a(Collections.singleton(lz1.f138192a));
            }
            throw new NoWhenBranchMatchedException();
        }
        uz1 uz1Var = (uz1) yz1Var;
        String str = uz1Var.f235400b;
        boolean z = uz1Var.f235401c;
        ArrayList arrayList = uz1Var.f235399a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            av61 av61Var = (av61) obj3;
            if (av61Var == av61.f20111d || av61Var == av61.f20113f) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : arrayList) {
            av61 av61Var2 = (av61) obj4;
            if (av61Var2 == av61.f20112e || av61Var2 == av61.f20114g) {
                arrayList3.add(obj4);
            }
        }
        return Next.m15606h(d02.m34487a(d02Var, str, arrayList2, arrayList3, false, z, false, 4223));
    }
}
