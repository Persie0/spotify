package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p.bv */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1719bv implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        InterfaceC2622yq interfaceC2622yq = (InterfaceC2622yq) obj2;
        if (interfaceC2622yq instanceof C2544wq) {
            C2544wq c2544wq = (C2544wq) interfaceC2622yq;
            String str = c2544wq.f253871a;
            return (str == null || wl51.m88460J0(str)) ? Next.m15607i(new C2509vu(3), Collections.singleton(new C2310qq(false))) : Next.m15607i(new C2509vu(2), Collections.singleton(new C2347rq(str, c2544wq.f253872b, c2544wq.f253873c)));
        }
        if (interfaceC2622yq instanceof C2505vq) {
            return ((C2505vq) interfaceC2622yq).f243818a ? Next.m15607i(new C2509vu(5), Collections.singleton(new C2310qq(true))) : Next.m15607i(new C2509vu(4), Collections.singleton(new C2310qq(false)));
        }
        if (interfaceC2622yq instanceof C2584xq) {
            return Next.m15607i(new C2509vu(2), Collections.singleton(new C2385sq(((C2584xq) interfaceC2622yq).f264788a)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
