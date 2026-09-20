package p204p;

import com.google.protobuf.Any;
import com.google.protobuf.Int64Value;
import com.google.protobuf.Timestamp;
import com.spotify.watchfeed.api.p182v1.C1333a;
import com.spotify.watchfeed.api.p182v1.C1336d;
import com.spotify.watchfeed.api.p182v1.C1337e;
import com.spotify.watchfeed.api.p182v1.ConsumedFeedItem;
import com.spotify.watchfeed.api.p182v1.ConsumedGroup;
import com.spotify.watchfeed.api.p182v1.WatchFeedRequest;
import com.spotify.watchfeed.api.p182v1.proto.WatchFeedResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class c2q {

    /* JADX INFO: renamed from: a */
    public final tpr f33442a;

    /* JADX INFO: renamed from: b */
    public final biq f33443b;

    public c2q(tpr tprVar, biq biqVar) {
        this.f33442a = tprVar;
        this.f33443b = biqVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final Object m31341a(ppr pprVar, ArrayList arrayList, String str, ibk ibkVar) {
        b2q b2qVar;
        C1336d c1336dM58369r;
        int i;
        fpm0 fpm0Var;
        if (ibkVar instanceof b2q) {
            b2qVar = (b2q) ibkVar;
            int i2 = b2qVar.f22669d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b2qVar.f22669d = i2 - Integer.MIN_VALUE;
            } else {
                b2qVar = new b2q(this, ibkVar);
            }
        } else {
            b2qVar = new b2q(this, ibkVar);
        }
        Object obj = b2qVar.f22667b;
        int i3 = b2qVar.f22669d;
        yuk yukVar = yuk.f276404a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = b2qVar.f22666a;
                bga.m29073P(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return (kdd1) obj;
        }
        bga.m29073P(obj);
        if (pprVar instanceof jpr) {
            jpr jprVar = (jpr) pprVar;
            c1336dM58369r = l6l.m58369r("album-clips", jprVar.f114708a, jprVar.f114709b);
        } else if (pprVar instanceof kpr) {
            kpr kprVar = (kpr) pprVar;
            c1336dM58369r = l6l.m58369r("artist-clips", kprVar.f125110a, kprVar.f125111b);
        } else if (pprVar instanceof lpr) {
            c1336dM58369r = l6l.m58369r("clip-recs", null, ((lpr) pprVar).f135834a);
        } else if (pprVar instanceof npr) {
            npr nprVar = (npr) pprVar;
            c1336dM58369r = l6l.m58369r("countdown-clips", nprVar.f157055a, nprVar.f157056b);
        } else if (pprVar instanceof opr) {
            opr oprVar = (opr) pprVar;
            String str2 = oprVar.f167997a;
            c1336dM58369r = wj50.m88271j(str2, "related-clips") ? l6l.m58369r(str2, null, oprVar.f167998b) : null;
        } else {
            if (!(pprVar instanceof mpr)) {
                throw new NoWhenBranchMatchedException();
            }
            mpr mprVar = (mpr) pprVar;
            c1336dM58369r = l6l.m58369r(mprVar.f146068a, mprVar.f146069b, mprVar.f146070c);
        }
        if (c1336dM58369r == null) {
            throw new IllegalArgumentException("Not supported type");
        }
        int i4 = 10;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p8j p8jVar = (p8j) it.next();
            m8j m8jVarM22470p = ConsumedGroup.m22470p();
            m8jVarM22470p.m61113q(p8jVar.f174968a);
            List<o8j> list = p8jVar.f174969b;
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(list, i4));
            for (o8j o8jVar : list) {
                C1333a c1333aM22467r = ConsumedFeedItem.m22467r();
                c1333aM22467r.m22482s(o8jVar.f162818a);
                Long l = o8jVar.f162819b;
                if (l != null) {
                    c1333aM22467r.m22479m(Int64Value.m1947p(l.longValue()));
                }
                Long l2 = o8jVar.f162820c;
                if (l2 != null) {
                    long jLongValue = l2.longValue();
                    lu71 lu71VarM1966t = Timestamp.m1966t();
                    long j = 1000;
                    lu71VarM1966t.m59943q(jLongValue / j);
                    lu71VarM1966t.m59942m((int) (((long) 1000000) * (jLongValue % j)));
                    c1333aM22467r.m22480q((Timestamp) lu71VarM1966t.build());
                }
                String str3 = o8jVar.f162821d;
                if (str3 != null) {
                    c1333aM22467r.m22481r(str3);
                }
                arrayList3.add((ConsumedFeedItem) c1333aM22467r.build());
            }
            m8jVarM22470p.m61112m(arrayList3);
            arrayList2.add((ConsumedGroup) m8jVarM22470p.build());
            i4 = 10;
        }
        c1336dM58369r.m22483m(arrayList2);
        if (str != null) {
            C1337e c1337eM22478o = WatchFeedRequest.Pagination.m22478o();
            byte[] bArrM79585a = sx8.m79585a(sx8.f214837e, str, 0, 6);
            c1337eM22478o.m22488m(gva.m45886d(0, bArrM79585a, bArrM79585a.length));
            c1336dM58369r.m22487t(c1337eM22478o);
        }
        WatchFeedRequest watchFeedRequest = (WatchFeedRequest) c1336dM58369r.build();
        b2qVar.f22666a = 0;
        b2qVar.f22669d = 1;
        Object objM81272a = this.f33442a.m81272a(watchFeedRequest, b2qVar);
        if (objM81272a != yukVar) {
            obj = objM81272a;
            i = 0;
        }
        return yukVar;
        WatchFeedResponse watchFeedResponse = (WatchFeedResponse) obj;
        b2qVar.f22666a = i;
        b2qVar.f22669d = 2;
        biq biqVar = this.f33443b;
        Map map = (Map) biqVar.f27526a.get();
        t9d1 t9d1Var = biqVar.f27527b;
        vwf vwfVarM80280b = t9d1Var.m80280b(watchFeedResponse.m22492o());
        vwf vwfVarM80280b2 = t9d1Var.m80280b(watchFeedResponse.m22499v());
        f931 f931Var = vwfVarM80280b2 instanceof f931 ? (f931) vwfVarM80280b2 : null;
        Any anyM22494q = watchFeedResponse.m22494q();
        Object obj2 = map.get(anyM22494q.m1912q());
        qgl0 qgl0Var = obj2 instanceof qgl0 ? (qgl0) obj2 : null;
        egl0 egl0Var = qgl0Var != null ? (egl0) qgl0Var.m92284a(anyM22494q) : null;
        ArrayList arrayListM80279a = t9d1Var.m80279a((ae50) watchFeedResponse.getItemsList());
        if (watchFeedResponse.m22500w()) {
            WatchFeedResponse.Pagination paginationM22495r = watchFeedResponse.m22495r();
            fpm0Var = new fpm0(paginationM22495r.m22505r() ? sx8.m79587c(sx8.f214837e, paginationM22495r.m22503p().m45891s()) : null, paginationM22495r.m22504q() ? sx8.m79587c(sx8.f214837e, paginationM22495r.m22502o().m45891s()) : null);
        } else {
            fpm0Var = null;
        }
        ae50 ae50VarM22490n = watchFeedResponse.m22496s().m22490n();
        kdd1 kdd1Var = new kdd1(vwfVarM80280b, arrayListM80279a, fpm0Var, watchFeedResponse.m22491n(), ae50VarM22490n != null ? !ae50VarM22490n.isEmpty() ? new w3o0(ae50VarM22490n) : null : null, egl0Var, f931Var, watchFeedResponse.m22493p(), watchFeedResponse.m22498u(), watchFeedResponse.m22497t());
        if (kdd1Var != yukVar) {
            obj = kdd1Var;
            return (kdd1) obj;
        }
        return yukVar;
    }
}
