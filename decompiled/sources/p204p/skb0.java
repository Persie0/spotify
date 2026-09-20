package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class skb0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final skb0 f210074a = new skb0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        kkb0 kkb0Var = (kkb0) obj;
        fkb0 fkb0Var = (fkb0) obj2;
        ArrayList arrayList = kkb0Var.f123559e;
        s7f s7fVar = kkb0Var.f123556b;
        xf81 xf81Var = kkb0Var.f123555a;
        if (fkb0Var instanceof ckb0) {
            return Next.m15605a(Collections.singleton(pkb0.f178425a));
        }
        boolean z = fkb0Var instanceof ekb0;
        int i = 0;
        pk80 pk80Var = pk80.f178412a;
        if (z) {
            ekb0 ekb0Var = (ekb0) fkb0Var;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (((ok80) obj3).f166296c == pk80Var) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
            for (Object obj4 : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    h6f.m46722S();
                    throw null;
                }
                ok80 ok80Var = (ok80) obj4;
                arrayList3.add(new pqm0(String.valueOf(ok80Var.f166294a), ok80Var.f166295b));
                i = i2;
            }
            return Next.m15605a(Collections.singleton(new qkb0(kkc0.m56705r0(arrayList3), xf81Var, s7fVar, ekb0Var.f60422a)));
        }
        if (!(fkb0Var instanceof dkb0)) {
            throw new NoWhenBranchMatchedException();
        }
        dkb0 dkb0Var = (dkb0) fkb0Var;
        Set set = dkb0Var.f49950a;
        ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (Object obj5 : arrayList) {
            int i3 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            ok80 ok80Var2 = (ok80) obj5;
            arrayList4.add(new ok80(ok80Var2.f166294a, ok80Var2.f166295b, set.contains(new fk80(i)) ? pk80Var : pk80.f178413b, ok80Var2.f166297d, ok80Var2.f166298e, ok80Var2.f166299f));
            i = i3;
        }
        return Next.m15606h(new kkb0(xf81Var, s7fVar, kkb0Var.f123557c, set.isEmpty() ? mkb0.f144546b : dkb0Var.f49951b ? mkb0.f144545a : new nkb0(set.size()), arrayList4));
    }
}
