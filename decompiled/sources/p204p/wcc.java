package p204p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class wcc implements Update {

    /* JADX INFO: renamed from: a */
    public static final wcc f250015a = new wcc();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        zcc zccVar = (zcc) obj;
        scc sccVar = (scc) obj2;
        if (sccVar instanceof ncc) {
            ncc nccVar = (ncc) sccVar;
            return Next.m15605a(Effects.m15571a(new fcc(nccVar.f152489a, nccVar.f152490b)));
        }
        if (sccVar instanceof pcc) {
            return Next.m15605a(Effects.m15571a(new gcc()));
        }
        if (sccVar instanceof mcc) {
            return Next.m15606h(zcc.m95905a(zccVar, ((mcc) sccVar).f142124a, null, 6));
        }
        if (sccVar instanceof lcc) {
            return Next.m15608j();
        }
        if (sccVar instanceof qcc) {
            qcc qccVar = (qcc) sccVar;
            return Next.m15606h(zcc.m95905a(zccVar, null, new dh70(qccVar.f187299a, qccVar.f187300b), 5));
        }
        if (sccVar.equals(rcc.f197843a)) {
            return Next.m15606h(zcc.m95905a(zccVar, null, gh70.f79846a, 5));
        }
        if (sccVar.equals(occ.f163895a)) {
            return Next.m15606h(zcc.m95905a(zccVar, null, fh70.f69597a, 5));
        }
        throw new NoWhenBranchMatchedException();
    }
}
