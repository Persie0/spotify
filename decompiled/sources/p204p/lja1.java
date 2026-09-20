package p204p;

import com.spotify.upsells.p173v1.proto.GatedFeatureContext;
import com.spotify.upsells.p173v1.proto.GetUpsellResponse;
import com.spotify.upsells.p173v1.proto.ShouldUpsellResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class lja1 {

    /* JADX INFO: renamed from: a */
    public final mqr f134026a;

    /* JADX INFO: renamed from: b */
    public final bc21 f134027b;

    /* JADX INFO: renamed from: c */
    public final z9j0 f134028c;

    public lja1(mqr mqrVar, x9y0 x9y0Var, bc21 bc21Var, z9j0 z9j0Var) {
        this.f134026a = mqrVar;
        this.f134027b = bc21Var;
        this.f134028c = z9j0Var;
    }

    /* JADX INFO: renamed from: c */
    public static GatedFeatureContext m59140c(xu00 xu00Var) {
        wu00 wu00Var;
        vu00 vu00VarM22061s = GatedFeatureContext.m22061s();
        vu00VarM22061s.m86406q(xu00Var.m92110g());
        vu00VarM22061s.m86405m(xu00Var.m92109c());
        int iM38547C = edb.m38547C(xu00Var.m92111h());
        if (iM38547C == 0) {
            wu00Var = wu00.CAPPED;
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            wu00Var = wu00.ENTITLEMENT_MISSING;
        }
        vu00VarM22061s.m86407r(wu00Var);
        return (GatedFeatureContext) vu00VarM22061s.build();
    }

    /* JADX INFO: renamed from: d */
    public static void m59141d(lja1 lja1Var, xu00 xu00Var) {
        lja1Var.f134027b.m28669m(xu00Var, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Serializable m59142a(List list, ibk ibkVar) {
        jja1 jja1Var;
        if (ibkVar instanceof jja1) {
            jja1Var = (jja1) ibkVar;
            int i = jja1Var.f112967d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jja1Var.f112967d = i - Integer.MIN_VALUE;
            } else {
                jja1Var = new jja1(this, ibkVar);
            }
        } else {
            jja1Var = new jja1(this, ibkVar);
        }
        Object objM62583b = jja1Var.f112965b;
        int i2 = jja1Var.f112967d;
        if (i2 == 0) {
            bga.m29073P(objM62583b);
            if (list.isEmpty()) {
                return nau.f152117a;
            }
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m59140c((xu00) it.next()));
            }
            jja1Var.f112964a = list;
            jja1Var.f112967d = 1;
            objM62583b = this.f134026a.m62583b(arrayList, jja1Var);
            yuk yukVar = yuk.f276404a;
            if (objM62583b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = jja1Var.f112964a;
            bga.m29073P(objM62583b);
        }
        Map map = (Map) objM62583b;
        qia1 qia1Var = qia1.f188974a;
        if (map == null) {
            int iM31820L = c95.m31820L(i6f.m49804T(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L >= 16 ? iM31820L : 16);
            for (Object obj : list) {
                linkedHashMap.put(obj, qia1Var);
            }
            return linkedHashMap;
        }
        int iM31820L2 = c95.m31820L(i6f.m49804T(list, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM31820L2 >= 16 ? iM31820L2 : 16);
        for (Object obj2 : list) {
            ShouldUpsellResponse shouldUpsellResponse = (ShouldUpsellResponse) map.get(m59140c((xu00) obj2));
            iia1 iia1VarM22080o = shouldUpsellResponse != null ? shouldUpsellResponse.m22080o() : null;
            int i3 = iia1VarM22080o == null ? -1 : ija1.f102770a[iia1VarM22080o.ordinal()];
            linkedHashMap2.put(obj2, i3 != 1 ? i3 != 2 ? qia1Var : new ria1(false) : new ria1(true));
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m59143b(xu00 xu00Var, tia1 tia1Var, ibk ibkVar) {
        kja1 kja1Var;
        w5r w5rVar;
        jq60 jq60VarM90268a;
        if (ibkVar instanceof kja1) {
            kja1Var = (kja1) ibkVar;
            int i = kja1Var.f123288c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kja1Var.f123288c = i - Integer.MIN_VALUE;
            } else {
                kja1Var = new kja1(this, ibkVar);
            }
        } else {
            kja1Var = new kja1(this, ibkVar);
        }
        Object objM62586g = kja1Var.f123286a;
        int i2 = kja1Var.f123288c;
        if (i2 == 0) {
            bga.m29073P(objM62586g);
            GatedFeatureContext gatedFeatureContextM59140c = m59140c(xu00Var);
            int iOrdinal = tia1Var.ordinal();
            if (iOrdinal == 0) {
                w5rVar = w5r.DEVICE_CAPABILITY_INLINE_UPSELL;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                w5rVar = w5r.DEVICE_CAPABILITY_BOTTOMSHEET_UPSELL;
            }
            kja1Var.f123288c = 1;
            objM62586g = this.f134026a.m62586g(gatedFeatureContextM59140c, w5rVar, kja1Var);
            yuk yukVar = yuk.f276404a;
            if (objM62586g == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62586g);
        }
        GetUpsellResponse getUpsellResponse = (GetUpsellResponse) objM62586g;
        return (getUpsellResponse == null || (jq60VarM90268a = x9y0.m90268a(getUpsellResponse)) == null) ? nia1.f154220a : new oia1(jq60VarM90268a);
    }
}
