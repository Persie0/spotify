package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xs10 implements Update {

    /* JADX INFO: renamed from: a */
    public static final xs10 f265453a = new xs10();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        i2x i2xVar = (i2x) obj2;
        if (i2xVar instanceof fxw) {
            return Next.m15605a(Collections.singleton(new zjt(((fxw) i2xVar).f74472a)));
        }
        boolean zEquals = i2xVar.equals(kww.f127253a);
        jft jftVar = jft.f111966a;
        if (zEquals) {
            return Next.m15605a(Collections.singleton(jftVar));
        }
        if (i2xVar instanceof bxw) {
            return Next.m15606h(new zs10(((bxw) i2xVar).f31988a));
        }
        if (i2xVar.equals(exw.f63865a)) {
            return Next.m15605a(Collections.singleton(rft.f198730a));
        }
        if (i2xVar.equals(cxw.f43108a)) {
            return Next.m15605a(Collections.singleton(jftVar));
        }
        throw new NoWhenBranchMatchedException();
    }
}
