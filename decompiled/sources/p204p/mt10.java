package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mt10 implements Update {

    /* JADX INFO: renamed from: a */
    public static final mt10 f146930a = new mt10();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        ot10 ot10Var = (ot10) obj;
        j2x j2xVar = (j2x) obj2;
        if (j2xVar.equals(iww.f106520a)) {
            return Next.m15608j();
        }
        if (j2xVar.equals(iww.f106521b)) {
            return Next.m15605a(Collections.singleton(let.f132708b));
        }
        if (j2xVar.equals(iww.f106523d)) {
            return Next.m15607i(new ot10(ot10Var.f168947a, true), Collections.singleton(zdt.f281795a));
        }
        if (j2xVar.equals(iww.f106522c)) {
            return Next.m15607i(new ot10(ot10Var.f168947a, false), Collections.singleton(aft.f15227a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
