package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class udi implements Update {

    /* JADX INFO: renamed from: a */
    public static final udi f229256a = new udi();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        wdi wdiVar = (wdi) obj;
        pdi pdiVar = (pdi) obj2;
        if (pdiVar instanceof mdi) {
            return Next.m15605a(Collections.singleton(fdi.f68506a));
        }
        if (pdiVar instanceof ndi) {
            String str = wdiVar.f250290d;
            return (str == null || str.length() == 0) ? Next.m15608j() : Next.m15605a(Collections.singleton(new gdi(wdiVar)));
        }
        if (!(pdiVar instanceof odi)) {
            throw new NoWhenBranchMatchedException();
        }
        wdi wdiVar2 = ((odi) pdiVar).f164193a;
        return Next.m15606h(new wdi(wdiVar.f250287a, wdiVar2.f250288b, wdiVar.f250289c, wdiVar2.f250290d));
    }
}
