package p204p;

import com.spotify.concertcampaignview.p047v1.ConcertCampaignPage;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nzh implements Update {

    /* JADX INFO: renamed from: a */
    public static final nzh f160085a = new nzh();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        pzh pzhVar = (pzh) obj;
        tyh tyhVar = (tyh) obj2;
        if (tyhVar instanceof syh) {
            syh syhVar = (syh) tyhVar;
            return Next.m15606h(pzh.m71755a(pzhVar, null, null, null, null, null, null, null, null, null, null, new yqo(syhVar.f215250a, syhVar.f215251b), 0, 229375));
        }
        if (tyhVar instanceof oyh) {
            oyh oyhVar = (oyh) tyhVar;
            yqo yqoVar = new yqo(oyhVar.f171765a, oyhVar.f171766b);
            return pzhVar.f183707n ? Next.m15606h(pzh.m71755a(pzhVar, null, null, null, null, null, null, null, null, null, yqoVar, yqoVar, 0, 204799)) : Next.m15606h(pzh.m71755a(pzhVar, null, null, null, null, null, null, null, null, null, yqoVar, null, 0, 245759));
        }
        if (tyhVar.equals(nyh.f159812a)) {
            return Next.m15607i(pzh.m71755a(pzhVar, null, null, null, null, null, null, null, null, null, null, null, 0, 229375), Collections.singleton(new pxh(pzhVar.f183694a)));
        }
        if (tyhVar.equals(pyh.f183407a)) {
            return Next.m15606h(pzh.m71755a(pzhVar, null, null, null, null, null, null, null, null, null, null, null, 0, 229375));
        }
        if (tyhVar.equals(qyh.f193903a)) {
            Boolean bool = pzhVar.f183700g;
            return Next.m15606h(pzh.m71755a(pzhVar, null, null, null, Boolean.valueOf(!(bool != null ? bool.booleanValue() : pzhVar.f183698e.isEmpty())), null, null, null, null, null, null, null, 0, 262079));
        }
        if (tyhVar.equals(myh.f148464a)) {
            return Next.m15606h(pzh.m71755a(pzhVar, null, null, null, null, null, null, null, null, null, null, null, pzhVar.f183710q + 1, 196607));
        }
        if (!(tyhVar instanceof ryh)) {
            throw new NoWhenBranchMatchedException();
        }
        ConcertCampaignPage concertCampaignPage = ((ryh) tyhVar).f203921a;
        String strM6970o = concertCampaignPage.m6970o();
        if (!concertCampaignPage.m6977v()) {
            strM6970o = null;
        }
        ae50 ae50VarM6971p = concertCampaignPage.m6971p();
        ae50 ae50VarM6974s = concertCampaignPage.m6974s();
        String strM6973r = concertCampaignPage.m6973r();
        if (!concertCampaignPage.m6979x()) {
            strM6973r = null;
        }
        String strM6972q = concertCampaignPage.m6972q();
        if (!concertCampaignPage.m6978w()) {
            strM6972q = null;
        }
        String strM6976u = concertCampaignPage.m6976u();
        if (!concertCampaignPage.m6981z()) {
            strM6976u = null;
        }
        String strM6975t = concertCampaignPage.m6975t();
        if (!concertCampaignPage.m6980y()) {
            strM6975t = null;
        }
        pzh pzhVarM71755a = pzh.m71755a(pzhVar, strM6970o, ae50VarM6971p, ae50VarM6974s, null, strM6973r, strM6972q, strM6976u, strM6975t, concertCampaignPage.m6969n(), null, null, 0, 254151);
        return Next.m15607i(pzhVarM71755a, yqg1.m94360W(pzhVarM71755a));
    }
}
