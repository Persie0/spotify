package p204p;

import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class d5i {

    /* JADX INFO: renamed from: a */
    public final tei f45442a;

    /* JADX INFO: renamed from: b */
    public final rkn f45443b;

    /* JADX INFO: renamed from: c */
    public final boolean f45444c;

    /* JADX INFO: renamed from: d */
    public final fs9 f45445d;

    /* JADX INFO: renamed from: e */
    public final epx f45446e;

    /* JADX INFO: renamed from: f */
    public final q831 f45447f;

    /* JADX INFO: renamed from: g */
    public final ugi f45448g;

    /* JADX INFO: renamed from: h */
    public final xre f45449h;

    /* JADX INFO: renamed from: i */
    public final hc80 f45450i;

    /* JADX INFO: renamed from: j */
    public final luk f45451j;

    /* JADX INFO: renamed from: k */
    public final yum0 f45452k = sam.m77645B(null);

    public d5i(tei teiVar, rkn rknVar, boolean z, fs9 fs9Var, epx epxVar, q831 q831Var, ugi ugiVar, xre xreVar, hc80 hc80Var, luk lukVar) {
        this.f45442a = teiVar;
        this.f45443b = rknVar;
        this.f45444c = z;
        this.f45445d = fs9Var;
        this.f45446e = epxVar;
        this.f45447f = q831Var;
        this.f45448g = ugiVar;
        this.f45449h = xreVar;
        this.f45450i = hc80Var;
        this.f45451j = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m35001a(d5i d5iVar, String str, ibk ibkVar) {
        b5i b5iVar;
        Object next;
        String str2;
        Object next2;
        String str3;
        d5iVar.getClass();
        if (ibkVar instanceof b5i) {
            b5iVar = (b5i) ibkVar;
            int i = b5iVar.f23596d;
            if ((i & Integer.MIN_VALUE) != 0) {
                b5iVar.f23596d = i - Integer.MIN_VALUE;
            } else {
                b5iVar = new b5i(d5iVar, ibkVar);
            }
        } else {
            b5iVar = new b5i(d5iVar, ibkVar);
        }
        Object objM86757v = b5iVar.f23594b;
        int i2 = b5iVar.f23596d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86757v);
                va3 va3Var = new va3(cyf1.m34374j(k0e1.m54985d(((jpx) d5iVar.f45446e).m53978b(new C1668ai("concert-entity-page", false, (gh00) new ivg(str, 8)))), d5iVar.f45451j), str, 6);
                hvi0 hvi0Var = cks.f39079b;
                ysk yskVarM46157w = gyf1.m46157w(va3Var, jwg1.m54449D(1000, ils.MILLISECONDS));
                b5iVar.f23593a = str;
                b5iVar.f23596d = 1;
                objM86757v = vyf1.m86757v(yskVarM46157w, b5iVar);
                yuk yukVar = yuk.f276404a;
                if (objM86757v == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = b5iVar.f23593a;
                bga.m29073P(objM86757v);
            }
            String str4 = str;
            gqx gqxVar = (gqx) objM86757v;
            i2i i2iVar = gqxVar != null ? (i2i) gqxVar.mo45449a(i2i.class, str4).f72301b : null;
            b2i b2iVar = gqxVar != null ? (b2i) gqxVar.mo45449a(b2i.class, str4).f72301b : null;
            if (((i2iVar != null ? i2iVar.f97846a : null) instanceof yib) && b2iVar != null) {
                ArrayList arrayList = b2iVar.f22614a;
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!wj50.m88271j(((hjb) next).f92005a, "decline_offer_title"));
                hjb hjbVar = (hjb) next;
                if (hjbVar != null && (str2 = hjbVar.f92006b) != null) {
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!wj50.m88271j(((hjb) next2).f92005a, "decline_offer_subtitle"));
                    hjb hjbVar2 = (hjb) next2;
                    if (hjbVar2 != null && (str3 = hjbVar2.f92006b) != null) {
                        return ceg1.m32574m(new x60((Object) d5iVar, str4, (Object) str2, (Object) str3, 13));
                    }
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m35002b(d5i d5iVar, int i, List list) {
        q831 q831Var = d5iVar.f45447f;
        na6.m63963k(true, "Invalid resource ID provided: %s", Integer.valueOf(i));
        na6.m63963k(true, "Invalid resource ID provided: %s", null);
        Integer numValueOf = Integer.valueOf(i);
        na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
        q831Var.m72305j(new g631(null, "", numValueOf, null, Integer.valueOf(R.string.not_interested_undo), new ViewOnClickListenerC1708bk(24, d5iVar, list), null, null, false));
    }
}
