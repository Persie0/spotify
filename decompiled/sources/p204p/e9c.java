package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e9c implements Update {
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        fiy0 fiy0Var = (fiy0) obj;
        i6c i6cVar = (i6c) obj2;
        String str = fiy0Var.f70024c;
        if (i6cVar instanceof d6c) {
            return fiy0Var.equals(fiy0.f70021d) ? Next.m15606h(((d6c) i6cVar).f45654a) : Next.m15608j();
        }
        if (i6cVar instanceof b6c) {
            return Next.m15605a(bk5.m29624m1(new AbstractC2206o9[]{new e5c(str, ln21.f135076b), new x4c(str)}));
        }
        if (i6cVar instanceof g6c) {
            return Next.m15605a(bk5.m29624m1(new AbstractC2206o9[]{new u4c(1), new w4c(str)}));
        }
        if (i6cVar instanceof e6c) {
            e6c e6cVar = (e6c) i6cVar;
            String str2 = e6cVar.f56615a;
            return Next.m15605a(bk5.m29624m1(new AbstractC2206o9[]{new d5c(str2), new c5c(str, e6cVar.f56616b, str2)}));
        }
        if (i6cVar instanceof h6c) {
            return Next.m15605a(Collections.singleton(new f5c("Skipped")));
        }
        if (!(i6cVar instanceof f6c)) {
            throw new NoWhenBranchMatchedException();
        }
        f6c f6cVar = (f6c) i6cVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = f6cVar.f66361b;
        linkedHashSet.add(new y4c(str, i));
        int i2 = f6cVar.f66360a;
        if (i2 >= 0 && i2 != i) {
            linkedHashSet.add(new z4c(str, i2, i));
        }
        eiy0 eiy0Var = (eiy0) g6f.m43747t0(i, fiy0Var.f70022a);
        if (eiy0Var != null) {
            String str3 = eiy0Var.f60065f;
            if (str3.length() > 0) {
                linkedHashSet.add(new b5c(str, i, str3));
            }
        }
        if (i2 < 0) {
            linkedHashSet.add(new v4c(str));
        }
        return Next.m15605a(linkedHashSet);
    }
}
