package p204p;

import android.view.View;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public final class ixb1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f106650a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f106651b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ixb1(Object obj, int i) {
        super(0);
        this.f106650a = i;
        this.f106651b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, p.gh00] */
    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f106650a) {
            case 0:
                ((kxb1) this.f106651b).f127426c.onNext(Boolean.TRUE);
                return w2a1.f247311a;
            case 1:
                xyb1 xyb1Var = (xyb1) this.f106651b;
                kbo kboVar = xyb1Var.f267272b;
                rg41 rg41Var = xyb1Var.f267274d;
                fin finVar = (fin) kboVar.f121237a.f281093c;
                tt50 tt50Var = ((bu50) finVar.f69921c).f31025g;
                jg31.m53271i(tt50Var);
                bji bjiVar = (bji) ((ien) finVar.f69922d).f101474b.f212567y1.get();
                jg31.m53271i(bjiVar);
                return new fvt(new hgo(new no8(tt50Var, new gc41(new dg10(new ve4(bjiVar), 27), 22), rg41Var), new wyb1(xyb1Var, 0)));
            case 2:
                f1c1 f1c1Var = (f1c1) this.f106651b;
                boolean zM77169k = f1c1Var.f64865i.m77169k();
                agy agyVar = ffg1.f69005a;
                if (zM77169k) {
                    return new y3c1(f1c1Var.f64866j, f1c1Var.f64867k, f1c1Var.f64868l, f1c1Var.f64864h.m73800h(), agyVar, (kv91) f1c1Var.f64869m.get(), null, f1c1Var.f64860d);
                }
                return new d1c1(f1c1Var.f64861e, f1c1Var.f64862f, f1c1Var.f64863g, agyVar);
            case 3:
                i5c1 i5c1Var = (i5c1) this.f106651b;
                ((kv91) i5c1Var.f98892g.get()).mo57453r(i5c1Var.f98893h.m46161e(), null);
                i5c1Var.f98889d.mo55548j();
                return w2a1.f247311a;
            case 4:
                ((qsb1) this.f106651b).invoke();
                return w2a1.f247311a;
            case 5:
                o8c1 o8c1Var = (o8c1) this.f106651b;
                n6q n6qVar = o8c1Var.f162775b;
                n6qVar.m63784c(new l8c1(o8c1Var, 2));
                n6qVar.m63782a(bda.f26063c);
                return w2a1.f247311a;
            case 6:
                ((n8c1) this.f106651b).f151497b.mo47345e();
                return w2a1.f247311a;
            case 7:
                nya nyaVar = (nya) this.f106651b;
                return mwh0.m63058o(nyaVar.f159751b.getMessageRequest(), nyaVar.f159751b.getRequestId());
            case 8:
                return Pattern.compile(((uoc1) this.f106651b).f232398a);
            case 9:
                ana0 ana0Var = (ana0) this.f106651b;
                if (ana0Var.f17349b) {
                    ana0Var.f17350c.invoke(Boolean.FALSE);
                }
                ana0Var.f17349b = false;
                return w2a1.f247311a;
            case 10:
                return new View(((qqc1) this.f106651b).f191533a.getContext());
            case 11:
                return bga.m29064G(((z42) this.f106651b).f279097b);
            case 12:
                ((gh00) ((g040) this.f106651b).f75265e).invoke(bvc1.f31332a);
                return w2a1.f247311a;
            case 13:
                return Integer.valueOf(((pn01) this.f106651b).f179277a.size());
            case 14:
                ((h7d1) this.f106651b).f88440a.onNext(C2244p5.f174033a);
                return w2a1.f247311a;
            case 15:
                return ((ofm0) ((pyo) this.f106651b).f183442b).mo15684j0(q040.class);
            case 16:
                e8d1 e8d1Var = (e8d1) this.f106651b;
                bji bjiVar2 = e8d1Var.f57147b;
                if (bjiVar2 != null) {
                    return (e8d1) bjiVar2.mo29483e(new jzn0(e8d1Var, 14));
                }
                return null;
            case 17:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((t9d1) this.f106651b).f218270a.entrySet()) {
                    linkedHashMap.put(((fwf) ((i4t0) entry.getValue()).get()).mo32630b(), (String) entry.getKey());
                }
                return linkedHashMap;
            case 18:
                z63 z63Var = (z63) this.f106651b;
                xbo xboVar = (xbo) z63Var.f279686d;
                luu0 luu0Var = (luu0) z63Var.f279687e;
                h3n h3nVar = (h3n) xboVar.f259969a.f89565b;
                z9j0 z9j0Var = (z9j0) ((uen) h3nVar.f87273b).f229564b.f169565X.get();
                jg31.m53271i(z9j0Var);
                e940 e940Var = (e940) ((uen) h3nVar.f87273b).f229563a.f211626P7.get();
                jg31.m53271i(e940Var);
                return new cjc0(new r8d1(luu0Var, z9j0Var, e940Var), b9d1.f24870g);
            case 19:
                zad1 zad1Var = (zad1) this.f106651b;
                ybo yboVar = zad1Var.f281043b;
                zv41 zv41Var = zad1Var.f281044c;
                t2n t2nVar = (t2n) yboVar.f271221a.f281093c;
                z9j0 z9j0Var2 = (z9j0) ((jen) t2nVar.f216597f).f111629b.f169565X.get();
                jg31.m53271i(z9j0Var2);
                pgo pgoVar = ((rrq) t2nVar.f216593b).f202099a;
                jg31.m53271i(pgoVar);
                l3n l3nVar = (l3n) t2nVar.f216596e;
                return new hgo(new sf20(z9j0Var2, pgoVar, l3nVar.m58011d(), (zao) t2nVar.f216595d, l3nVar.m58009b(), zv41Var), b9d1.f24856X);
            case 20:
                ziy ziyVar = (ziy) this.f106651b;
                int i = ziyVar.f283299a + 1;
                ziyVar.f283299a = i;
                ziyVar.f283300b.onNext(Integer.valueOf(i));
                return w2a1.f247311a;
            case 21:
                ((egd1) this.f106651b).f59316c.m97090l(null);
                return w2a1.f247311a;
            case 22:
                zdd1 zdd1Var = (zdd1) this.f106651b;
                bji bjiVar3 = zdd1Var.f281689f;
                if (bjiVar3 != null) {
                    return (zdd1) bjiVar3.mo29483e(new jzn0(zdd1Var, 15));
                }
                return null;
            case 23:
                v95 v95Var = (v95) this.f106651b;
                pzb pzbVar = (pzb) v95Var.f238845d;
                if (pzbVar == null) {
                    wj50.m88260d0("stickyLocalBroadcastManager");
                    throw null;
                }
                y59 y59Var = (y59) v95Var.f238846e;
                if (y59Var == null) {
                    wj50.m88260d0("broadcastReceiver");
                    throw null;
                }
                ((aba0) pzbVar.f183658a.f42890c).m25345d(y59Var);
                sjd1 sjd1Var = (sjd1) v95Var.f238844c;
                if (sjd1Var != null) {
                    sjd1Var.m78314b();
                    return w2a1.f247311a;
                }
                wj50.m88260d0("wazeSdkManager");
                throw null;
            case 24:
                return (lld1) ((RetrofitMaker) this.f106651b).createWebgateService(lld1.class, "android-pagematch-endpoint");
            case 25:
                return (kv91) ((cqd1) this.f106651b).f40848a.get();
            case 26:
                ysi ysiVar = (ysi) this.f106651b;
                jqv0 jqv0Var = qpv0.f191387a;
                up60 up60VarMo54112b = jqv0Var.mo54112b(xsi.class);
                hv31 hv31Var = ysiVar.f275788a;
                long jMax = 0;
                if (up60VarMo54112b.equals(jqv0Var.mo54112b(xsi.class))) {
                    si5 si5Var = fv31.f73628b;
                    jMax = Math.max(hv31Var.mo48712g(si5Var.m78181M("device_predictability_MULTI_OPTION_BOTTOM_SHEET_connect_message_last_displayed_timestamp_ms"), 0L), hv31Var.mo48712g(si5Var.m78181M("device_predictability_SMART_CONTROL_NUDGE_connect_message_last_displayed_timestamp_ms"), 0L));
                }
                return Boolean.valueOf(fr0.m42463g((wy3) ysiVar.f275789b, jMax) >= TimeUnit.MINUTES.toMillis((long) ysiVar.f275790c.m27928e()));
            case 27:
                return new j8j[((fiz[]) this.f106651b).length];
            case 28:
                return new cjc0(((rzn) ((kqs0) this.f106651b).f125427f).m76824a(), ngd1.f153665V0);
            default:
                return q3d0.m72105o(((d3e1) this.f106651b).f44868j);
        }
    }
}
