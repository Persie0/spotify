package p204p;

import com.spotify.scrollsita.p146v1.DiscoveryFeed;
import com.spotify.scrollsita.p146v1.DiscoveryFeedItem;
import com.spotify.scrollsita.p146v1.Section;
import com.spotify.scrollsita.p146v1.watchfeed.VideoFile;
import io.reactivex.rxjava3.core.Maybe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class f5q0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66134a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f66135b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f5q0(int i, List list) {
        super(1);
        this.f66134a = i;
        this.f66135b = list;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        vsb1 tsb1Var;
        switch (this.f66134a) {
            case 0:
                ((cqx) obj).m33647b(b5q0.class, this.f66135b, false);
                return w2a1.f247311a;
            case 1:
                return (h2r0) this.f66135b.get(((Number) obj).intValue());
            case 2:
                ((cqx) obj).m33647b(lar0.class, this.f66135b, false);
                return w2a1.f247311a;
            case 3:
                ((cqx) obj).m33647b(erc1.class, this.f66135b, false);
                return w2a1.f247311a;
            case 4:
                int iIndexOf = this.f66135b.indexOf(((na01) obj).getId());
                Integer numValueOf = Integer.valueOf(iIndexOf);
                if (iIndexOf < 0) {
                    numValueOf = null;
                }
                return numValueOf != null ? new oa01(-numValueOf.intValue()) : pa01.f175334a;
            case 5:
                cqx cqxVar = (cqx) obj;
                Iterator it = this.f66135b.iterator();
                while (it.hasNext()) {
                    cqxVar.m33646a((String) it.next(), erc1.class, false);
                }
                return w2a1.f247311a;
            case 6:
                ((cqx) obj).m33647b(xaw.class, this.f66135b, false);
                return w2a1.f247311a;
            case 7:
                return ((wyz0) this.f66135b.get(((Number) obj).intValue())).f256414a;
            case 8:
                ((cqx) obj).m33647b(dx01.class, this.f66135b, false);
                return w2a1.f247311a;
            case 9:
                ((cqx) obj).m33647b(eua1.class, this.f66135b, false);
                return w2a1.f247311a;
            case 10:
                ((cqx) obj).m33647b(ub21.class, this.f66135b, false);
                return w2a1.f247311a;
            case 11:
                return rm51.m75899a(this.f66135b, qpv0.f191387a.mo54112b(y5k0.class));
            case 12:
                return rm51.m75899a(this.f66135b, qpv0.f191387a.mo54112b(s6k0.class));
            case 13:
                return rm51.m75899a(this.f66135b, qpv0.f191387a.mo54112b(v6k0.class));
            case 14:
                return rm51.m75899a(this.f66135b, qpv0.f191387a.mo54112b(f7k0.class));
            case 15:
                return rm51.m75899a(this.f66135b, qpv0.f191387a.mo54112b(s5k0.class));
            case 16:
                return rm51.m75899a(this.f66135b, qpv0.f191387a.mo54112b(t5k0.class));
            case 17:
                return rm51.m75899a(this.f66135b, qpv0.f191387a.mo54112b(x6k0.class));
            case 18:
                return rm51.m75899a(this.f66135b, qpv0.f191387a.mo54112b(u6k0.class));
            case 19:
                return rm51.m75899a(this.f66135b, qpv0.f191387a.mo54112b(i6k0.class));
            case 20:
                return rm51.m75899a(this.f66135b, qpv0.f191387a.mo54112b(f6k0.class));
            case 21:
                Section section = (Section) obj;
                if (!section.m20647n0() || section.m20619L().getItemsList().isEmpty()) {
                    return rm51.m75899a(this.f66135b, qpv0.f191387a.mo54112b(g7k0.class));
                }
                DiscoveryFeed discoveryFeedM20619L = section.m20619L();
                String title = discoveryFeedM20619L.m20478o().getTitle();
                List<DiscoveryFeedItem> itemsList = discoveryFeedM20619L.getItemsList();
                ArrayList arrayList = new ArrayList(i6f.m49804T(itemsList, 10));
                for (DiscoveryFeedItem discoveryFeedItem : itemsList) {
                    String title2 = discoveryFeedItem.m20479n().getTitle();
                    String subtitle = discoveryFeedItem.m20479n().getSubtitle();
                    String strM20693s = discoveryFeedItem.m20479n().m20693s();
                    String strM20689n = discoveryFeedItem.m20479n().m20689n();
                    String url = discoveryFeedItem.m20479n().m20695u().getUrl();
                    Float fValueOf = discoveryFeedItem.m20479n().m20697w() ? Float.valueOf((float) discoveryFeedItem.m20479n().m20694t()) : null;
                    VideoFile videoFileM20696v = discoveryFeedItem.m20479n().m20696v();
                    int i = qm51.f190139a[videoFileM20696v.m20702q().ordinal()];
                    if (i == 1) {
                        tsb1Var = new tsb1(rm51.m75900b(videoFileM20696v.m20701p()), videoFileM20696v.getUri(), rm51.m75900b(videoFileM20696v.m20700o()));
                    } else if (i != 2) {
                        tsb1Var = null;
                    } else {
                        tsb1Var = new usb1(rm51.m75900b(videoFileM20696v.m20701p()), videoFileM20696v.getUri(), rm51.m75900b(videoFileM20696v.m20700o()));
                    }
                    arrayList.add(new wfd1(title2, subtitle, strM20693s, strM20689n, url, false, false, fValueOf, tsb1Var, discoveryFeedItem.m20479n().m20692r(), discoveryFeedItem.m20479n().m20690o(), discoveryFeedItem.m20479n().m20691q(), discoveryFeedItem.m20479n().getUri()));
                }
                return Maybe.m23363f(new g7k0(new oed1(new xfd1(title, arrayList))));
            case 22:
                return rm51.m75899a(this.f66135b, qpv0.f191387a.mo54112b(o6k0.class));
            case 23:
                return rm51.m75899a(this.f66135b, qpv0.f191387a.mo54112b(c7k0.class));
            case 24:
                return (String) this.f66135b.get(((Number) obj).intValue());
            case 25:
                ((cqx) obj).m33647b(erc1.class, this.f66135b, false);
                return w2a1.f247311a;
            case 26:
                return Boolean.valueOf(((dh71) this.f66135b.get(((Number) obj).intValue())).f49010e);
            case 27:
                return Boolean.valueOf(((ihn0) this.f66135b.get(((Number) obj).intValue())).f102325a);
            case 28:
                return Boolean.valueOf(((ihn0) this.f66135b.get(((Number) obj).intValue())).f102327c);
            default:
                s5o0 s5o0Var = (s5o0) obj;
                List list = this.f66135b;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        s5o0Var.m77294i((t5o0) it2.next(), 0, 0, 0.0f);
                    }
                }
                return w2a1.f247311a;
        }
    }
}
