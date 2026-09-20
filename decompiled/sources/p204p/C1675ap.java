package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p.ap */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C1675ap implements Update {

    /* JADX INFO: renamed from: a */
    public static final C1675ap f17797a = new C1675ap();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        C1785dp c1785dp = (C1785dp) obj;
        InterfaceC2582xo interfaceC2582xo = (InterfaceC2582xo) obj2;
        if (interfaceC2582xo instanceof C2308qo) {
            InterfaceC1821eo interfaceC1821eo = ((C2308qo) interfaceC2582xo).f190729a;
            if (interfaceC1821eo instanceof C1712bo) {
                return (c1785dp.f51140f && ((C1712bo) interfaceC1821eo).f28967g) ? Next.m15606h(C1785dp.m36554c(c1785dp, null, null, false, true, 63)) : Next.m15605a(Collections.singleton(new C2097lo(((C1712bo) interfaceC1821eo).f28961a)));
            }
            if (interfaceC1821eo instanceof C1748co) {
                return Next.m15606h(C1785dp.m36554c(c1785dp, b5j0.f23599a, null, false, false, ContentType.USER_GENERATED_LIVE));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (interfaceC2582xo instanceof C2503vo) {
            return Next.m15606h(C1785dp.m36554c(c1785dp, new d5j0(((C2503vo) interfaceC2582xo).f243279a), null, false, false, ContentType.USER_GENERATED_LIVE));
        }
        if (interfaceC2582xo.equals(C2465uo.f232292a)) {
            return Next.m15605a(Collections.singleton(C2060ko.f124491a));
        }
        if (interfaceC2582xo.equals(C2465uo.f232293b)) {
            return Next.m15606h(C1785dp.m36554c(c1785dp, c5j0.f34195a, null, false, false, ContentType.USER_GENERATED_LIVE));
        }
        if (interfaceC2582xo instanceof C2422to) {
            return Next.m15607i(C1785dp.m36554c(c1785dp, null, ((C2422to) interfaceC2582xo).f222113a, false, false, 119), Collections.singleton(C2184no.f156538a));
        }
        if (interfaceC2582xo instanceof C2542wo) {
            qta0 qta0Var = c1785dp.f51138d;
            return qta0Var != null ? Next.m15605a(Collections.singleton(new C2134mo(qta0Var, c1785dp.f51136b))) : Next.m15608j();
        }
        if (interfaceC2582xo instanceof C2345ro) {
            return Next.m15606h(C1785dp.m36554c(c1785dp, null, null, ((C2345ro) interfaceC2582xo).f201028a, false, ContentType.SHORT_FORM_ON_DEMAND));
        }
        if (interfaceC2582xo.equals(C2383so.f211067a)) {
            return Next.m15606h(C1785dp.m36554c(c1785dp, null, null, false, false, 63));
        }
        throw new NoWhenBranchMatchedException();
    }
}
