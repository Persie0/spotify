package p204p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class btd implements Update {

    /* JADX INFO: renamed from: a */
    public static final btd f30553a = new btd();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        ftd ftdVar = (ftd) obj;
        atd atdVar = (atd) obj2;
        String str = ftdVar.f73186a;
        p151 p151Var = ftdVar.f73188c;
        boolean zEquals = atdVar.equals(wsd.f254590a);
        o151 o151Var = o151.f160620a;
        if (zEquals) {
            boolean zEquals2 = p151Var.equals(o151Var);
            nsd nsdVar = nsd.f157750a;
            if (zEquals2 || (p151Var instanceof m151)) {
                return Next.m15605a(Effects.m15571a(nsdVar));
            }
            if (p151Var instanceof n151) {
                return ((n151) p151Var).f149301a != null ? Next.m15605a(Effects.m15571a(new osd(str))) : Next.m15605a(Effects.m15571a(nsdVar));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (atdVar.equals(ysd.f275745a)) {
            return Next.m15606h(ftd.m42597a(ftdVar, o151Var));
        }
        if (atdVar instanceof xsd) {
            xsd xsdVar = (xsd) atdVar;
            return Next.m15605a(Effects.m15571a(new psd(str, xsdVar.f265564a, xsdVar.f265565b)));
        }
        if (atdVar instanceof zsd) {
            return Next.m15606h(ftd.m42597a(ftdVar, new n151(((zsd) atdVar).f285920a, 2, null)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
