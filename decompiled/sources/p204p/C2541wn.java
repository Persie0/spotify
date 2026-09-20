package p204p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p.wn */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2541wn implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        InterfaceC2183nn interfaceC2183nn = (InterfaceC2183nn) obj2;
        if (interfaceC2183nn instanceof C2059kn) {
            return Next.m15605a(Effects.m15571a(new C1866fn(((C2059kn) interfaceC2183nn).f124247a)));
        }
        if (interfaceC2183nn instanceof C2096ln) {
            C2096ln c2096ln = (C2096ln) interfaceC2183nn;
            String str = c2096ln.f135059a;
            return str != null ? Next.m15605a(Effects.m15571a(new C1948hn(str, c2096ln.f135060b, c2096ln.f135061c))) : Next.m15608j();
        }
        if (!(interfaceC2183nn instanceof C2133mn)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList = ((C2133mn) interfaceC2183nn).f145291a;
        return Next.m15607i(new C2221on(arrayList), arrayList.isEmpty() ? Effects.m15571a(C1903gn.f81509a) : Effects.m15571a(new C1903gn[0]));
    }
}
