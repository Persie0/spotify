package p204p;

import android.bluetooth.BluetoothAdapter;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.net.Uri;
import com.spotify.esperanto.esperanto.Transport;
import com.spotify.music.R;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class bj9 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27644a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f27645b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj9(Object obj, int i) {
        super(0);
        this.f27644a = i;
        this.f27645b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Transport transport;
        int i = 20;
        int i2 = 1;
        fbk fbkVar = null;
        switch (this.f27644a) {
            case 0:
                cj9 cj9Var = (cj9) this.f27645b;
                int i3 = 3;
                return bzf1.m31029u(new tjz(new nzx0(new ez4(cyf1.m34368d(new vjz(cj9Var.f38531f, new y22(cj9Var, fbkVar, i3)), -1, 1), null, cj9Var)), new aw0(cj9Var, fbkVar, i3)), cj9Var.f38530e, new cs41(0L, 0L), lau.f131415a);
            case 1:
                shq shqVar = (shq) this.f27645b;
                suj sujVar = (suj) ((nmm) shqVar.f209249e).f155492a.f16603b;
                z9j0 z9j0Var = (z9j0) ((lfn) sujVar.f214136b).f132978b.f169565X.get();
                jg31.m53271i(z9j0Var);
                l3n l3nVar = (l3n) sujVar.f214135a;
                zam0 zam0Var = l3nVar.f129351c;
                jg31.m53271i(zam0Var);
                String strM58011d = l3nVar.m58011d();
                Set set = dd41.f47702f;
                String strConcat = "spotify:blend:story:".concat(r46.m74726U(strM58011d).m35710h());
                jg31.m53272j(strConcat);
                String strM58011d2 = l3nVar.m58011d();
                son sonVar = ((lfn) sujVar.f214136b).f132977a;
                ra9 ra9Var = (ra9) sonVar.f212012d9.get();
                jg31.m53271i(ra9Var);
                oe50 oe50Var = (oe50) sonVar.f211804Vn.get();
                jg31.m53271i(oe50Var);
                l89 l89Var = (l89) sonVar.f211919a.f18534c7.get();
                jg31.m53271i(l89Var);
                return new cjc0(new tk9(z9j0Var, zam0Var, strConcat, strM58011d2, new rd51(ra9Var, oe50Var, l89Var, l3nVar.m58010c())), new qse1(shqVar, i));
            case 2:
                return new cjc0((dut) ((akm) ((ol9) this.f27645b).f166794e).get(), f89.f66902Z0);
            case 3:
                return new en2((ql9) this.f27645b);
            case 4:
                am9 am9Var = (am9) this.f27645b;
                return new cjc0(new hjb0(new utu0((c700) ((otn) ((k1n) ((t7j) am9Var.f17065d.f167059a.f16603b).f217839b).f118395b).f169961v1.get()), new C2498vj(new ea5(new j22(((tq80) am9Var.f17063b).m81306d(), 9), am9Var, 17), 15)), new wl9(am9Var, i2));
            case 5:
                kn9 kn9Var = (kn9) this.f27645b;
                return new cjc0(new ew6(kn9Var.f124361d, kn9Var.f124362e), new C2401t5(1, kn9Var, kn9.class, "metadataToProps", "metadataToProps(Lcom/spotify/listuxplatform/component/ListMetadata;)Lcom/spotify/referrals/upsell/api/Props;", 0, 0, 25));
            case 6:
                return new en2((z13) this.f27645b);
            case 7:
                lq9 lq9Var = (lq9) this.f27645b;
                lq9Var.f135982R0.invoke(lq9Var);
                return w2a1.f247311a;
            case 8:
                ((q831) ((i26) this.f27645b).f97752b).m72300d();
                return w2a1.f247311a;
            case 9:
                luk lukVar = ((fz9) this.f27645b).f74946d;
                x461 x461VarM64613f = njg1.m64613f();
                lukVar.getClass();
                return opo.m67570t(lukVar, x461VarM64613f);
            case 10:
                m0a m0aVar = (m0a) this.f27645b;
                bji bjiVar = m0aVar.f138579B;
                if (bjiVar != null) {
                    return (m0a) bjiVar.mo29483e(new au3(m0aVar, 11));
                }
                return null;
            case 11:
                whr0.f251426i.f251432f.mo31986a(((o2a) this.f27645b).f161005i);
                return w2a1.f247311a;
            case 12:
                BluetoothAdapter bluetoothAdapter = ((z2a) this.f27645b).f278521a;
                if (bluetoothAdapter == null) {
                    return null;
                }
                if (!bluetoothAdapter.isEnabled()) {
                    bluetoothAdapter = null;
                }
                if (bluetoothAdapter != null) {
                    return bluetoothAdapter.getBluetoothLeScanner();
                }
                return null;
            case 13:
                bsa bsaVar = (bsa) this.f27645b;
                Uri uri = Uri.parse(bsaVar.m30389V().m35728z());
                return Uri.parse(uri.getScheme() + "://" + uri.getAuthority() + "/__noul__/" + bsaVar.m30389V()).buildUpon().appendQueryParameter("bounce", "true").appendQueryParameter("utm_source", "app_bounce").appendQueryParameter("nd", "1").build();
            case 14:
                s67 s67Var = (s67) this.f27645b;
                synchronized (s67Var) {
                    transport = s67Var.f206016a;
                }
                return new r67(transport);
            case 15:
                p8a p8aVar = (p8a) this.f27645b;
                bji bjiVar2 = p8aVar.f174903b;
                if (bjiVar2 != null) {
                    return (p8a) bjiVar2.mo29483e(new pt4(p8aVar, 29));
                }
                return null;
            case 16:
                ((dfa) this.f27645b).f48545h.m71812a();
                return w2a1.f247311a;
            case 17:
                Integer num = (Integer) this.f27645b;
                return Boolean.valueOf(num == null || num.intValue() == 0);
            case 18:
                ((ija) this.f27645b).f102767c.mo63651f(new p6j0(WidgetInteraction.Background.DESTINATION_HOME, "", false, false, 0, 0, false, null, null, null));
                return w2a1.f247311a;
            case 19:
                return (tiv0) this.f27645b;
            case 20:
                return new noa((ao20) ((i4t0) ((fw7) this.f27645b).f74007c).get(), 0);
            case 21:
                ((p200) this.f27645b).invoke();
                return w2a1.f247311a;
            case 22:
                return Float.valueOf(((ewa) this.f27645b).f63464o);
            case 23:
                hv31 hv31Var = ((b0b) this.f27645b).f21817S1;
                if (hv31Var != null) {
                    return edb.m38564m("https://c.spotify.com?pid=", hv31Var.mo48710e(nnl0.f156443d, ""));
                }
                wj50.m88260d0("preferences");
                throw null;
            case 24:
                i3b i3bVar = (i3b) this.f27645b;
                vhy0 vhy0Var = i3bVar.f98088O0;
                if (vhy0Var == null) {
                    vhy0Var = new vhy0();
                    i3bVar.f98088O0 = vhy0Var;
                }
                if (vhy0Var.f241569b == null) {
                    ox10 ox10VarM88316F = wjg1.m88316F(i3bVar);
                    vhy0Var.m85577d();
                    vhy0Var.f241569b = ox10VarM88316F;
                }
                return vhy0Var;
            case 25:
                return new n10((qq8) this.f27645b, i);
            case 26:
                Object systemService = ((r6b) this.f27645b).f196223a.getSystemService((Class<Object>) AudioManager.class);
                wj50.m88279p(systemService);
                return (AudioManager) systemService;
            case 27:
                ((gib) this.f27645b).f80116a.setValue(null);
                return w2a1.f247311a;
            case 28:
                return ((unb) this.f27645b).f232122b.m77810d();
            default:
                return new ColorDrawable(((asb) this.f27645b).f50039a.getContext().getColor(R.color.bg_cover_art_placeholder));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj9(vrn vrnVar, kn9 kn9Var) {
        super(0);
        this.f27644a = 5;
        this.f27645b = kn9Var;
    }
}
