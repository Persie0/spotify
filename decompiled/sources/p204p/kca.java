package p204p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.music.R;
import com.spotify.musicquizservice.p113v1.GetOrCreateChallengeRequest;
import com.spotify.musicquizservice.p113v1.GetOrCreateChallengeResponse;
import com.spotify.musicquizservice.p113v1.ListChallengeTargetsRequest;
import com.spotify.musicquizservice.p113v1.ListChallengeTargetsResponse;
import com.spotify.playlist.p126ai.creation.p127v2.CloneSessionByMessageIdRequest;
import com.spotify.profile.coreprofileimpl.CoreProfileException;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;
import spotify.profile_esperanto.proto.ChangeDisplayNameResponse;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kca implements Predicate, Function, InterfaceC2207oa, a9b, rdc1, ant {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121417a;

    /* JADX INFO: renamed from: b */
    public Object f121418b;

    /* JADX INFO: renamed from: f */
    public static void m56021f(kca kcaVar, float f, float f2, int i) {
        c06 c06Var = (c06) kcaVar.f121418b;
        if ((i & 4) != 0) {
            f = Float.intBitsToFloat((int) (c06Var.m31085B() >> 32));
        }
        float f3 = f;
        if ((i & 8) != 0) {
            f2 = Float.intBitsToFloat((int) (c06Var.m31085B() & 4294967295L));
        }
        kcaVar.m56024e(0.0f, 0.0f, f3, f2, 1);
    }

    @Override // p204p.a9b
    /* JADX INFO: renamed from: a */
    public Type mo25103a() {
        return (Type) this.f121418b;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        switch (this.f121417a) {
            case 10:
                return ((xfp0) this.f121418b).f261053a;
            default:
                u300 u300Var = ((ihi) obj).f102296c;
                return (u300Var == u300.DAYLIST || u300Var == u300.DAYLIST_SNAPSHOT) && ((qoo) this.f121418b).m73400g();
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f121417a) {
            case 2:
                hv31 hv31Var = (hv31) obj;
                ghb ghbVar = (ghb) this.f121418b;
                fv31 fv31Var = ghb.f79876f;
                if (!((mv31) hv31Var).m62894o(fv31Var)) {
                    return Single.just(0);
                }
                ((wy3) ghbVar.f79879c).getClass();
                return Single.just(Integer.valueOf((int) ((System.currentTimeMillis() - hv31Var.mo48712g(fv31Var, 0L)) / 3600000)));
            case 7:
                e8e e8eVar = (e8e) this.f121418b;
                ld9 ld9Var = e8eVar.f57149a;
                rmh0 rmh0Var = (rmh0) ld9Var;
                rmh0 rmh0Var2 = (rmh0) ld9Var;
                return Single.zip(rmh0Var.f200548h.doOnSubscribe(new nle(rmh0Var, 6)).firstOrError(), rmh0Var2.f200549i.doOnSubscribe(new nle(rmh0Var2, 5)).firstOrError(), new id8(e8eVar, 14));
            case 8:
                g2z0 g2z0Var = ((fpy0) ((bi1) this.f121418b).f27309b).f72016a.f87094a;
                g2z0Var.f76034a = null;
                g2z0Var.f76035b = null;
                return fty0.f73351a;
            case 9:
                nes0 nes0Var = (nes0) obj;
                C2263po c2263po = (C2263po) this.f121418b;
                i101 i101Var = (i101) c2263po.f179550b;
                String str = nes0Var.f153073b;
                ct2 ct2Var = (ct2) c2263po.f179551c;
                String str2 = nes0Var.f153072a;
                lt2 lt2Var = (lt2) ct2Var;
                tt2 tt2Var = lt2Var.f136674a;
                CloneSessionByMessageIdRequest.Builder builderNewBuilder = CloneSessionByMessageIdRequest.newBuilder();
                builderNewBuilder.setMessageId(str2);
                return i101.m49392b(i101Var, tt2Var.m81482b((CloneSessionByMessageIdRequest) builderNewBuilder.build()).flatMap(new az1(lt2Var, 11)), str, 26).map(h2h1.f86982N0).onErrorReturn(p4h1.f173926N0);
            case 11:
                t0f t0fVar = (t0f) obj;
                u4l0 u4l0Var = ((a1f) this.f121418b).f11398c;
                j46 j46Var = t0fVar.f215874a.f64885b;
                return g0b1.m43282x((luk) u4l0Var.f226773c, new rpk0(u4l0Var, j46Var.f108600b.length() > 0 ? new i190(j46Var.f108600b) : new j190(j46Var.f108599a), t0fVar.f215875b.f279709a, null, 26));
            case 17:
                return cxb.m34242g((cxb) this.f121418b, ((GetEntityResponse) obj).m15422n().m15410n().m15424n());
            case 19:
                ChangeDisplayNameResponse changeDisplayNameResponse = (ChangeDisplayNameResponse) obj;
                vsk vskVar = (vsk) this.f121418b;
                int statusCode = changeDisplayNameResponse.getStatusCode();
                vskVar.getClass();
                return (200 > statusCode || statusCode >= 300) ? Completable.m23286j(new CoreProfileException(s571.m77246e(changeDisplayNameResponse.getStatusCode(), "Failed changing display name, status "))) : CompletableEmpty.f7437a;
            default:
                q5l q5lVar = (q5l) this.f121418b;
                q5lVar.getClass();
                return vjf1.m85770t(dau.f47107a, new qri(q5lVar, (wjf) obj, null, 24));
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x014f  */
    /* JADX INFO: renamed from: b */
    public void m56022b(h2m h2mVar, f7l0 f7l0Var, f7l0 f7l0Var2, f7l0 f7l0Var3, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        au01 au01Var;
        int i3;
        int i4;
        xq00Var.m91775k0(677023354);
        ug5 ug5Var = xq00Var.f264811a;
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(h2mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(f7l0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(f7l0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(f7l0Var3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91770i(this) ? 131072 : 65536;
        }
        int i5 = i2;
        if (xq00Var.m91752Y(i5 & 1, (74899 & i5) != 74898)) {
            wb9 wb9Var = d7f0.f46174i;
            m6d0 m6d0VarM36007d = dha.m36007d(wb9Var, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                au01 au01VarM77890o = sef0.m77890o((sef0) this.f121418b, f7l0Var3, 1);
                xq00Var.m91793t0(au01VarM77890o);
                objM91750T = au01VarM77890o;
            }
            au01 au01Var2 = (au01) objM91750T;
            icr0 icr0Var = h2mVar.f87030e;
            int iM38547C = edb.m38547C(h2mVar.f87031f);
            if (iM38547C != 0) {
                au01Var = au01Var2;
                if (iM38547C == 1) {
                    i4 = 1;
                    i3 = 1;
                } else {
                    if (iM38547C != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 3;
                }
                vt01 vt01Var = new vt01(icr0Var, i3, i4);
                fxh0 fxh0VarMo66945a = pha.f177517a.mo66945a(mi21.m61820d(1.0f, cxh0.f43038a), wb9Var);
                m6d0 m6d0VarM36007d2 = dha.m36007d(d7f0.f46166e, false);
                int iHashCode2 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarMo66945a);
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(c2087le);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d2, yhhVar, xq00Var);
                zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
                AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
                zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
                mif1.m61869b(au01Var, vt01Var, null, null, xq00Var, 0, 12);
                xq00Var.m91788r(true);
                wvb.m89080a(f7l0Var, null, 0.0f, rkk.m75772x(1782481391, new apl(4, h2mVar, f7l0Var2), xq00Var), xq00Var, ((i5 >> 3) & 14) | 3072, 6);
                xq00Var.m91788r(true);
            } else {
                au01Var = au01Var2;
                i3 = 2;
            }
            i4 = 1;
            vt01 vt01Var2 = new vt01(icr0Var, i3, i4);
            fxh0 fxh0VarMo66945a2 = pha.f177517a.mo66945a(mi21.m61820d(1.0f, cxh0.f43038a), wb9Var);
            m6d0 m6d0VarM36007d3 = dha.m36007d(d7f0.f46166e, false);
            int iHashCode3 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var, fxh0VarMo66945a2);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d3, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode3, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s3, yhhVar4, xq00Var);
            mif1.m61869b(au01Var, vt01Var2, null, null, xq00Var, 0, 12);
            xq00Var.m91788r(true);
            wvb.m89080a(f7l0Var, null, 0.0f, rkk.m75772x(1782481391, new apl(4, h2mVar, f7l0Var2), xq00Var), xq00Var, ((i5 >> 3) & 14) | 3072, 6);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new sb0((Object) this, (Object) h2mVar, (Object) f7l0Var, (Object) f7l0Var2, (Object) f7l0Var3, fxh0Var, i, 14);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m56023c(vbn0 vbn0Var, int i) {
        ((c06) this.f121418b).m31107v().mo25290s(vbn0Var, i);
    }

    /* JADX INFO: renamed from: e */
    public void m56024e(float f, float f2, float f3, float f4, int i) {
        ((c06) this.f121418b).m31107v().mo25277f(f, f2, f3, f4, i);
    }

    @Override // p204p.a9b
    /* JADX INFO: renamed from: g */
    public Object mo25104g(x4l0 x4l0Var) {
        huf hufVar = new huf(x4l0Var);
        x4l0Var.mo52182p(new id8(hufVar, 20));
        return hufVar;
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (ConstraintLayout) this.f121418b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: h */
    public Serializable m56025h(String str, ibk ibkVar) {
        mjc mjcVar;
        if (ibkVar instanceof mjc) {
            mjcVar = (mjc) ibkVar;
            int i = mjcVar.f144229c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mjcVar.f144229c = i - Integer.MIN_VALUE;
            } else {
                mjcVar = new mjc(this, ibkVar);
            }
        } else {
            mjcVar = new mjc(this, ibkVar);
        }
        Object objM75638b = mjcVar.f144227a;
        int i2 = mjcVar.f144229c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM75638b);
                y910 y910VarM15814o = GetOrCreateChallengeRequest.m15814o();
                y910VarM15814o.m93138m(str);
                GetOrCreateChallengeRequest getOrCreateChallengeRequest = (GetOrCreateChallengeRequest) y910VarM15814o.build();
                rjc rjcVar = (rjc) this.f121418b;
                wj50.m88279p(getOrCreateChallengeRequest);
                mjcVar.f144229c = 1;
                objM75638b = rjcVar.m75638b(getOrCreateChallengeRequest, mjcVar);
                yuk yukVar = yuk.f276404a;
                if (objM75638b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM75638b);
            }
            o2x0 o2x0Var = (o2x0) objM75638b;
            if (o2x0Var.f161171a.f149852O0) {
                Object obj = o2x0Var.f161172b;
                if (obj != null) {
                    return ((GetOrCreateChallengeResponse) obj).m15815n();
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new c6x0(new Exception("Failed to get or create challenge: HTTP " + o2x0Var.f161171a.f149860d));
        } catch (Exception e) {
            return new c6x0(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m56026i() {
        return ((StateListAnimatorButton) this.f121418b).getContext().getResources().getConfiguration().fontScale >= 1.7f;
    }

    /* JADX INFO: renamed from: j */
    public StateListAnimatorButton m56027j() {
        return (StateListAnimatorButton) this.f121418b;
    }

    /* JADX INFO: renamed from: k */
    public void m56028k(float f, float f2, float f3, float f4) {
        c06 c06Var = (c06) this.f121418b;
        wqb wqbVarM31107v = c06Var.m31107v();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c06Var.m31085B() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c06Var.m31085B() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        if (!(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= 0.0f)) {
            lt40.m59869a("Width and height must be greater than or equal to zero");
        }
        c06Var.m31095L(jFloatToRawIntBits);
        wqbVarM31107v.mo25278g(f, f2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: l */
    public Object m56029l(ibk ibkVar) {
        njc njcVar;
        if (ibkVar instanceof njc) {
            njcVar = (njc) ibkVar;
            int i = njcVar.f154556c;
            if ((i & Integer.MIN_VALUE) != 0) {
                njcVar.f154556c = i - Integer.MIN_VALUE;
            } else {
                njcVar = new njc(this, ibkVar);
            }
        } else {
            njcVar = new njc(this, ibkVar);
        }
        Object objM75639c = njcVar.f154554a;
        int i2 = njcVar.f154556c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM75639c);
                wo80 wo80VarM15859o = ListChallengeTargetsRequest.m15859o();
                wo80VarM15859o.m88657m();
                ListChallengeTargetsRequest listChallengeTargetsRequest = (ListChallengeTargetsRequest) wo80VarM15859o.build();
                rjc rjcVar = (rjc) this.f121418b;
                wj50.m88279p(listChallengeTargetsRequest);
                njcVar.f154556c = 1;
                objM75639c = rjcVar.m75639c(listChallengeTargetsRequest, njcVar);
                yuk yukVar = yuk.f276404a;
                if (objM75639c == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM75639c);
            }
            o2x0 o2x0Var = (o2x0) objM75639c;
            if (o2x0Var.f161171a.f149852O0) {
                Object obj = o2x0Var.f161172b;
                if (obj != null) {
                    return ((ListChallengeTargetsResponse) obj).m15860n();
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new c6x0(new Exception("Failed to list challenge targets: HTTP " + o2x0Var.f161171a.f149860d));
        } catch (Exception e) {
            return new c6x0(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m56030m(gh00 gh00Var) {
        ((StateListAnimatorButton) this.f121418b).setOnClickListener(new jxo(6, gh00Var));
    }

    /* JADX INFO: renamed from: n */
    public void m56031n(dk7 dk7Var) {
        wyo wyoVar;
        Drawable drawable;
        Integer numValueOf = Integer.valueOf(R.color.glue_button_primary_blue_text);
        StateListAnimatorButton stateListAnimatorButton = (StateListAnimatorButton) this.f121418b;
        Integer numValueOf2 = Integer.valueOf(R.color.glue_button_primary_green_text);
        Integer numValueOf3 = Integer.valueOf(R.drawable.glue_button_primary_green);
        Integer numValueOf4 = Integer.valueOf(R.drawable.sthlm_blk_outline_button);
        bk7 bk7Var = dk7Var.f49899a;
        boolean z = dk7Var.f49900b;
        int iOrdinal = bk7Var.ordinal();
        ufg1 ufg1Var = null;
        if (iOrdinal != 0) {
            int i = 8;
            if (iOrdinal != 1) {
                int i2 = 2;
                if (iOrdinal == 2) {
                    int i3 = R.string.continue_with_google;
                    if (z) {
                        if (m56026i()) {
                            i3 = R.string.accessibility_continue_with_google;
                        }
                        wyoVar = new wyo(i3, new vyo(R.drawable.button_icon_google_color_24dp), Integer.valueOf(R.drawable.glue_button_primary_white), Integer.valueOf(R.color.glue_button_primary_black_text));
                    } else {
                        if (m56026i()) {
                            i3 = R.string.accessibility_continue_with_google;
                        }
                        wyoVar = new wyo(i3, new vyo(R.drawable.button_icon_google_color_24dp), numValueOf4, i);
                    }
                } else if (iOrdinal == 3) {
                    wyoVar = new wyo(m56026i() ? R.string.accessibility_continue_with_naver : R.string.continue_with_naver, new vyo(R.drawable.button_icon_naver_white_24dp), numValueOf4, i);
                } else if (iOrdinal == 5) {
                    int i4 = R.string.continue_with_email;
                    if (z) {
                        if (m56026i()) {
                            i4 = R.string.accessibility_continue_with_email;
                        }
                        wyoVar = new wyo(i4, new uyo(vc41.EMAIL, stateListAnimatorButton.getResources().getDimension(R.dimen.button_icon_size)), numValueOf3, numValueOf2);
                    } else {
                        if (m56026i()) {
                            i4 = R.string.accessibility_continue_with_email;
                        }
                        wyoVar = new wyo(i4, new uyo(vc41.EMAIL, stateListAnimatorButton.getResources().getDimension(R.dimen.button_icon_size)), numValueOf4, i);
                    }
                } else if (iOrdinal == 7) {
                    int i5 = R.string.login_go_to_login_button;
                    wyoVar = z ? new wyo(i5, ufg1Var, numValueOf3, i2) : new wyo(i5, ufg1Var, numValueOf4, 10);
                } else if (iOrdinal == 8) {
                    wyoVar = new wyo(R.string.korea_signup_button, ufg1Var, numValueOf3, i2);
                } else {
                    if (iOrdinal != 9) {
                        throw new IllegalStateException("Button is not supported by ViewBinder");
                    }
                    wyoVar = new wyo(R.string.login_go_to_create_account_button, ufg1Var, numValueOf3, i2);
                }
            } else {
                int i6 = R.string.signup_experiment_copy_facebook_button;
                if (z) {
                    if (m56026i()) {
                        i6 = R.string.accessibility_continue_with_facebook;
                    }
                    wyoVar = new wyo(i6, new vyo(R.drawable.button_icon_facebook_white_24dp), Integer.valueOf(R.drawable.glue_button_primary_blue), numValueOf);
                } else {
                    if (m56026i()) {
                        i6 = R.string.accessibility_continue_with_facebook;
                    }
                    wyoVar = new wyo(i6, new vyo(R.drawable.button_icon_facebook_color_24dp), numValueOf4, i);
                }
            }
        } else {
            int i7 = R.string.continue_with_phone;
            if (z) {
                if (m56026i()) {
                    i7 = R.string.accessibility_continue_with_phone;
                }
                wyoVar = new wyo(i7, new uyo(vc41.DEVICE_MOBILE, stateListAnimatorButton.getResources().getDimension(R.dimen.button_icon_size)), numValueOf3, numValueOf2);
            } else {
                if (m56026i()) {
                    i7 = R.string.accessibility_continue_with_phone;
                }
                wyoVar = new wyo(i7, new uyo(vc41.DEVICE_MOBILE, stateListAnimatorButton.getResources().getDimension(R.dimen.button_icon_size)), numValueOf4, numValueOf);
            }
        }
        Context context = stateListAnimatorButton.getContext();
        Integer num = wyoVar.f256328c;
        stateListAnimatorButton.setBackground(num != null ? context.getDrawable(num.intValue()) : null);
        stateListAnimatorButton.setText(context.getText(wyoVar.f256326a));
        Integer num2 = wyoVar.f256329d;
        int color = context.getColor(num2 != null ? num2.intValue() : R.color.authentication_button_default_color);
        stateListAnimatorButton.setTextColor(color);
        ufg1 ufg1Var2 = wyoVar.f256327b;
        if (ufg1Var2 == null) {
            drawable = null;
        } else if (ufg1Var2 instanceof vyo) {
            drawable = context.getDrawable(((vyo) ufg1Var2).f246296d);
        } else {
            if (!(ufg1Var2 instanceof uyo)) {
                throw new NoWhenBranchMatchedException();
            }
            uyo uyoVar = (uyo) ufg1Var2;
            tc41 tc41Var = new tc41(stateListAnimatorButton.getContext(), uyoVar.f235343d, uyoVar.f235344e);
            tc41Var.m80417b(color);
            drawable = tc41Var;
        }
        int dimensionPixelSize = stateListAnimatorButton.getResources().getDimensionPixelSize(R.dimen.multiline_button_padding);
        if (drawable != null) {
            stateListAnimatorButton.setPaddingRelative(dimensionPixelSize, stateListAnimatorButton.getPaddingTop(), drawable.getIntrinsicWidth() + dimensionPixelSize, stateListAnimatorButton.getPaddingBottom());
        }
        stateListAnimatorButton.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* JADX INFO: renamed from: o */
    public void m56032o(long j, float f) {
        wqb wqbVarM31107v = ((c06) this.f121418b).m31107v();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        wqbVarM31107v.mo25278g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        wqbVarM31107v.mo25284m(f);
        wqbVarM31107v.mo25278g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: p */
    public void m56033p(float f, float f2, long j) {
        wqb wqbVarM31107v = ((c06) this.f121418b).m31107v();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        wqbVarM31107v.mo25278g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        wqbVarM31107v.mo25273b(f, f2);
        wqbVarM31107v.mo25278g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: q */
    public void m56034q(float[] fArr) {
        ((c06) this.f121418b).m31107v().mo25289r(fArr);
    }

    /* JADX INFO: renamed from: r */
    public void m56035r(float f, float f2) {
        ((c06) this.f121418b).m31107v().mo25278g(f, f2);
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f121417a) {
            case 21:
                ((hqi0) this.f121418b).mo46962a((Set) obj);
                break;
            default:
                Integer num = (Integer) obj;
                EncoreButton encoreButton = ((e4p) this.f121418b).f56122a;
                wj50.m88279p(num);
                encoreButton.setBackgroundTintList(e4p.m37786a(num.intValue()));
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        String str;
        a97 a97Var = (a97) obj;
        ((twz0) this.f121418b).getClass();
        String str2 = a97Var.f13491a;
        return (str2 == null || str2.length() == 0 || (str = a97Var.f13492b) == null || str.length() == 0) ? false : true;
    }

    public /* synthetic */ kca(Object obj, int i) {
        this.f121417a = i;
        this.f121418b = obj;
    }

    public kca(Context context) {
        this.f121417a = 28;
        View viewInflate = View.inflate(context, R.layout.view_default_authentication_button, null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f121418b = (StateListAnimatorButton) viewInflate;
    }

    public kca(ComposeView composeView, ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout) {
        this.f121417a = 15;
        this.f121418b = constraintLayout;
    }
}
