package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.spotify.core.corefullimpl.NativeFullAuthenticatedScopeImpl;
import com.spotify.mobius.Connectable;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class tb61 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f218767a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f218768b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb61(Object obj, int i) {
        super(1);
        this.f218767a = i;
        this.f218768b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f218767a;
        nau nauVar = nau.f152117a;
        int i2 = 3;
        Object[] objArr = 0;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f218768b;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                sb61 sb61Var = (sb61) obj2;
                hqb hqbVar = sb61Var.f207368c;
                if (hqbVar != null) {
                    hqbVar.mo42416r(th);
                }
                sb61Var.f207368c = null;
                return w2a1Var;
            case 1:
                return ((ovf) ((a4s0) obj2).f12305b).getView();
            case 2:
                oe61 oe61Var = (oe61) ((te61) obj2);
                boolean zM45948t = gwg1.m45948t((String) obj, oe61Var.f164351b);
                return Boolean.valueOf(oe61Var.f164352c ? !zM45948t : zM45948t);
            case 3:
                ViewGroup viewGroup = (ViewGroup) obj;
                l2b l2bVar = (l2b) obj2;
                e23 e23Var = l2bVar.f128959a;
                tq31 tq31Var = l2bVar.f128960b;
                up60 up60Var = hxt.f96286w;
                Context context = viewGroup.getContext();
                h9y0 h9y0VarM93069n = y85.m93069n(viewGroup);
                return ia7.m50020m(context, viewGroup, e23Var, tq31Var, h9y0VarM93069n != null ? u1h1.m82222q(e23Var, "TabHeadingElement_key", h9y0VarM93069n, tq31Var) : null, 96).f96307t;
            case 4:
                return z8g1.m95591k(((xp80) ((qdm) ((ArrayList) ((nh80) obj2).f153899f).get(((wj61) obj).f251868a)).f187713c).f264537j, 3);
            case 5:
                xr61 xr61Var = (xr61) obj;
                b141 b141Var = (b141) obj2;
                if (xr61Var instanceof wr61) {
                    wr61 wr61Var = (wr61) xr61Var;
                    b141Var.m27882o((hpg1) b141Var.f22213c, new ar61(wr61Var.f254275a, wr61Var.f254276b));
                } else {
                    if (!(xr61Var instanceof vr61)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int iM38547C = edb.m38547C(((vr61) xr61Var).f244082a);
                    if (iM38547C == 0) {
                        i2 = 1;
                    } else if (iM38547C == 1) {
                        i2 = 2;
                    } else if (iM38547C != 2) {
                        if (iM38547C != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = 4;
                    }
                    b141Var.m27882o((hpg1) b141Var.f22213c, new zq61(i2));
                }
                return w2a1Var;
            case 6:
                rp80 rp80Var = (rp80) obj;
                qdm qdmVar = (qdm) obj2;
                qdmVar.f187720j.invoke(rp80Var);
                ((xp80) qdmVar.f187713c).m91651b(rp80Var);
                return w2a1Var;
            case 7:
                pg41 pg41Var = (pg41) obj2;
                return bx4.m30755d(kbv.m55958d(pg41Var, 2), kbv.m55959e(pg41Var, 2));
            case 8:
                jo70 jo70Var = (jo70) obj;
                ((xgm0) obj2).f261338b.m84032w(Float.intBitsToFloat((int) (jo70Var.mo30029m(0L) & 4294967295L)) + ((int) (jo70Var.mo30018b() & 4294967295L)));
                return w2a1Var;
            case 9:
                String str = (String) obj;
                wh51 wh51Var = ((yz61) obj2).f277711a2;
                if (wh51Var == null) {
                    wj50.m88260d0("termsSheetLogger");
                    throw null;
                }
                kv91 kv91Var = (kv91) wh51Var.f251262b;
                vfg0 vfg0Var = (vfg0) wh51Var.f251263c;
                vfg0Var.getClass();
                yt91 yt91VarM96903c = vfg0Var.f240983a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("text_link", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                dv91 dv91Var = new dv91("hit", 1);
                String string = str.toString();
                if (string == null) {
                    string = "";
                }
                kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("navigate_to_external_uri", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
                return w2a1Var;
            case 10:
                return new fw80((String) ((as5) obj2).f19303f);
            case 11:
                mpz0 mpz0Var = (mpz0) obj;
                w971 w971Var = (w971) obj2;
                if (w971Var.f249109d.length() > 0) {
                    jpz0.m54007u(mpz0Var, 0);
                    jpz0.m54000n(mpz0Var, w971Var.f249110e);
                }
                return w2a1Var;
            case 12:
                pjf1.m70155l((icp) obj, new oi71((h2v) obj2, 0));
                return w2a1Var;
            case 13:
                ((icp) obj).f100858d = new wk71((yk71) obj2, objArr == true ? 1 : 0, 0);
                return w2a1Var;
            case 14:
                zk71 zk71Var = (zk71) ((al71) obj2).f16793d.get();
                ((kv91) zk71Var.f283672a.get()).mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), zk71Var.f283673b.f175533a, st91.f213865b, System.currentTimeMillis()), null);
                return w2a1Var;
            case 15:
                fl71 fl71Var = (fl71) ((gl71) obj2).f81014d.get();
                kv91 kv91Var2 = (kv91) fl71Var.f70718a.get();
                qah0 qah0Var = fl71Var.f70719b;
                qah0Var.getClass();
                kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), qah0Var.f186879a, st91.f213865b, System.currentTimeMillis()), null);
                return w2a1Var;
            case 16:
                Resources resources = ((Context) ((qce0) obj2).f187342d).getResources();
                return new qo41(resources.getString(R.string.time_cap_upsell_title), resources.getString(R.string.time_cap_upsell_subtitle), resources.getString(R.string.time_cap_upsell_explore_premium), resources.getString(R.string.time_cap_upsell_dismiss));
            case 17:
                int iIntValue = ((Number) obj).intValue();
                bux0 bux0Var = ((cux0) obj2).f42250c;
                int i3 = iIntValue / (bux0Var != null ? bux0Var.f31233c : 1);
                int i4 = iIntValue % (bux0Var != null ? bux0Var.f31233c : 1);
                if (i4 == 0) {
                    return String.valueOf(i3);
                }
                return i3 + "_" + i4;
            case 18:
                l3b l3bVar = (l3b) obj;
                long j = n6f.f150866f;
                return l3bVar.m57995a(new zd61(20, (e5b1) obj2, new xk80(0, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (l3bVar.f129254a.mo39635n() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (l3bVar.f129254a.mo39635n() & 4294967295L)))) & 4294967295L), h6f.m46715L(new n6f(n6f.m63765b(j, 0.3f, 0.0f, 0.0f, 0.0f, 14)), new n6f(n6f.m63765b(j, 0.02f, 0.0f, 0.0f, 0.0f, 14))), null)));
            case 19:
                zv41 zv41Var = (zv41) ((dz31) obj2).f54516b;
                NativeFullAuthenticatedScopeImpl nativeFullAuthenticatedScopeImpl = ((csk) ((afq0) obj).mo25828e()).f41636W0;
                if (nativeFullAuthenticatedScopeImpl == null) {
                    wj50.m88260d0("authenticatedScopeImpl");
                    throw null;
                }
                ld91 ld91Var = new ld91(nativeFullAuthenticatedScopeImpl.tokenExchangeTransport());
                zv41Var.getClass();
                zv41Var.m97091m(null, ld91Var);
                return w2a1Var;
            case 20:
                hze0 hze0Var = (hze0) obj;
                switch (((i381) obj2).f98059a.f123383a) {
                    case 0:
                        return new gzl(hze0Var, new f381());
                    case 1:
                        return new gzl(hze0Var, new f381());
                    case 2:
                        return new gzl(hze0Var, new f381());
                    default:
                        return new gzl(hze0Var, new f381());
                }
            case 21:
                String str2 = ((vml) ((yd7) obj2).f271706c).f242868a;
                ArrayList<vjm0> arrayList = ((wjm0) obj).f251987a;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                for (vjm0 vjm0Var : arrayList) {
                    arrayList2.add(new b681(vjm0Var.f242016a, vjm0Var.f242017b, vjm0Var.f242018c));
                }
                return new c681(str2, arrayList2);
            case 22:
                ((fdx0) obj).m41380b(((o05) obj2).f160235b);
                return w2a1Var;
            case 23:
                C1790du c1790du = (C1790du) obj2;
                qsp qspVar = (qsp) ((hmh0) obj);
                qspVar.f192162a = new wz61(c1790du, 12);
                qspVar.f192164c = new crh(new Connectable[]{(C2300qn) c1790du.f52927e, (C2300qn) c1790du.f52928f}, 2);
                return w2a1Var;
            case 24:
                return new gdc(new v161((x881) obj2, 14), jq71.f114837e);
            case 25:
                return ((g981) obj2).f77705b;
            case 26:
                ty80 ty80Var = (ty80) obj;
                xc81 xc81Var = ((ld81) obj2).f132097d.f271429a;
                ybv ybvVar = ty80Var.f224877f;
                qla1 qla1Var = ybvVar.f271260e;
                boolean z = xc81Var.f260126a;
                boolean z2 = xc81Var.f260129d;
                boolean z3 = xc81Var.f260128c;
                boolean z4 = xc81Var.f260127b;
                boolean z5 = ybvVar.f271265j;
                in80[] in80VarArr = {in80.f103926g};
                qu80 qu80Var = ty80Var.f224881j;
                int iIntValue2 = 0;
                for (in80 in80Var : (in80[]) Arrays.copyOf(in80VarArr, 1)) {
                    Integer num = (Integer) qu80Var.f192603i.get(in80Var);
                    iIntValue2 += num != null ? num.intValue() : 0;
                }
                int iIntValue3 = 0;
                for (in80 in80Var2 : (in80[]) Arrays.copyOf(new in80[]{in80.f103923d, in80.f103927h}, 2)) {
                    Integer num2 = (Integer) qu80Var.f192603i.get(in80Var2);
                    iIntValue3 += num2 != null ? num2.intValue() : 0;
                }
                return new ad81(qla1Var, iIntValue3, iIntValue2, z3, z2, z, z5, z4, ty80Var.f224876e > 1 || ybvVar.f271277v.m59500b());
            case 27:
                return ((ud81) obj2).f229205a;
            case 28:
                ce81 ce81Var = (ce81) obj;
                int i5 = ce81Var.f37034H;
                boolean z6 = ce81Var.f37056v;
                boolean z7 = ce81Var.f37055u;
                syg1 syg1Var = i5 != 3 && z6 ? oej.f164450e : bga.m29067J(i5, z7, z7) ? pej.f176763e : qej.f187949e;
                String str3 = ce81Var.f37035a;
                String str4 = ce81Var.f37037c;
                String str5 = ce81Var.f37038d;
                String str6 = ce81Var.f37039e;
                String str7 = ce81Var.f37041g;
                String str8 = ce81Var.f37042h;
                int i6 = ce81Var.f37034H;
                boolean z8 = ce81Var.f37045k;
                boolean z9 = ce81Var.f37046l;
                boolean z10 = ce81Var.f37050p;
                boolean z11 = ce81Var.f37051q;
                boolean z12 = ce81Var.f37054t;
                boolean z13 = ce81Var.f37057w;
                return new de81(str3, str4, str5, str6, str7, str8, false, i6, syg1Var, 3, z8, z9, z10, false, z11, false, z12, z13, ce81Var.f37060z && (ce81Var.f37058x || z13 || z12), null, ce81Var.f37027A, ce81Var.f37058x, ce81Var.f37059y, ce81Var.f37031E, ce81Var.f37033G && ((y64) ((mqw0) obj2).f146375i).m92901e());
            default:
                o0w0 o0w0Var = (o0w0) obj;
                ((cq6) obj2).mo33600h(new xpi0(o0w0Var.m66027b().f33848a, o0w0Var.m66027b().f33849b, o0w0Var.m66027b().f33850c, o0w0Var.m66027b().f33851d));
                return w2a1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb61(twy twyVar, te61 te61Var) {
        super(1);
        this.f218767a = 2;
        this.f218768b = te61Var;
    }
}
