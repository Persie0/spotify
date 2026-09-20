package p204p;

import com.spotify.accountswitching.p009v1.GetAddAccountPageRequest;
import com.spotify.familyviewservice.p066v1.AddChildToPlanRequest;
import com.spotify.familyviewservice.p066v1.Allocation;
import com.spotify.familyviewservice.p066v1.CreateDowngradeCheckoutRequest;
import com.spotify.familyviewservice.p066v1.CreateDowngradeCheckoutResponse;
import com.spotify.familyviewservice.p066v1.GenAlphaManagedSettings;
import com.spotify.familyviewservice.p066v1.GetAddChildToPlanPageRequest;
import com.spotify.familyviewservice.p066v1.GetProfileRequest;
import com.spotify.familyviewservice.p066v1.GetProfileResponse;
import com.spotify.familyviewservice.p066v1.GetRegularMemberDetailsRequest;
import com.spotify.familyviewservice.p066v1.GetRegularMemberDetailsResponse;
import com.spotify.familyviewservice.p066v1.GetRemoveMemberPageRequest;
import com.spotify.familyviewservice.p066v1.MemberProfile;
import com.spotify.familyviewservice.p066v1.RemoveOrDeleteMemberRequest;
import com.spotify.familyviewservice.p066v1.RemoveOrDeleteMemberResponse;
import com.spotify.familyviewservice.p066v1.SetParentalControlRequest;
import com.spotify.familyviewservice.p066v1.SetParentalControlsRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zby {

    /* JADX INFO: renamed from: a */
    public final acy f281417a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1756cw f281418b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1823eq f281419c;

    public zby(acy acyVar, InterfaceC1756cw interfaceC1756cw, InterfaceC1823eq interfaceC1823eq) {
        this.f281417a = acyVar;
        this.f281418b = interfaceC1756cw;
        this.f281419c = interfaceC1823eq;
    }

    /* JADX INFO: renamed from: d */
    public static int m95881d(MemberProfile memberProfile) {
        if (memberProfile.hasColor()) {
            return memberProfile.getColor().getValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public static Object m95882j(zby zbyVar, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ibk ibkVar, int i) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            bool3 = null;
        }
        if ((i & 16) != 0) {
            bool4 = null;
        }
        q501 q501VarM10784t = SetParentalControlRequest.m10784t();
        q501VarM10784t.m72186t(str);
        if (bool != null) {
            q501VarM10784t.m72183q(bool.booleanValue());
        }
        if (bool2 != null) {
            q501VarM10784t.m72184r(bool2.booleanValue());
        }
        if (bool3 != null) {
            q501VarM10784t.m72182m(bool3.booleanValue());
        }
        if (bool4 != null) {
            q501VarM10784t.m72185s(bool4.booleanValue());
        }
        SetParentalControlRequest setParentalControlRequest = (SetParentalControlRequest) q501VarM10784t.build();
        acy acyVar = zbyVar.f281417a;
        wj50.m88279p(setParentalControlRequest);
        Object objM96565n = zn91.m96565n(acyVar.m25494h(setParentalControlRequest), ibkVar);
        return objM96565n == yuk.f276404a ? objM96565n : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: k */
    public static Completable m95883k(zby zbyVar, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        if ((i & 32) != 0) {
            bool3 = null;
        }
        hz00 hz00VarM10703s = GenAlphaManagedSettings.m10703s();
        if (str2 != null) {
            hz00VarM10703s.m49217t(str2);
        }
        if (str3 != null) {
            hz00VarM10703s.m49216s(str3);
        }
        if (bool != null) {
            hz00VarM10703s.m49213m(bool.booleanValue());
        }
        if (bool2 != null) {
            hz00VarM10703s.m49214q(bool2.booleanValue());
        }
        if (bool3 != null) {
            hz00VarM10703s.m49215r(bool3.booleanValue());
        }
        GenAlphaManagedSettings genAlphaManagedSettings = (GenAlphaManagedSettings) hz00VarM10703s.build();
        r501 r501VarM10788q = SetParentalControlsRequest.m10788q();
        r501VarM10788q.m74783m(str);
        r501VarM10788q.m74784q(genAlphaManagedSettings);
        SetParentalControlsRequest setParentalControlsRequest = (SetParentalControlsRequest) r501VarM10788q.build();
        acy acyVar = zbyVar.f281417a;
        wj50.m88279p(setParentalControlsRequest);
        return acyVar.m25489c(setParentalControlsRequest);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m95884a(String str, ibk ibkVar) {
        pby pbyVar;
        if (ibkVar instanceof pby) {
            pbyVar = (pby) ibkVar;
            int i = pbyVar.f175917c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbyVar.f175917c = i - Integer.MIN_VALUE;
            } else {
                pbyVar = new pby(this, ibkVar);
            }
        } else {
            pbyVar = new pby(this, ibkVar);
        }
        Object obj = pbyVar.f175915a;
        int i2 = pbyVar.f175917c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        ba1 ba1VarM10686p = AddChildToPlanRequest.m10686p();
        ba1VarM10686p.m28554m(str);
        SingleSource map = this.f281417a.m25501o((AddChildToPlanRequest) ba1VarM10686p.build()).map(qby.f187202b);
        pbyVar.f175917c = 1;
        Object objM96567o = zn91.m96567o(map, pbyVar);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m95885b(String str, ibk ibkVar, boolean z) {
        rby rbyVar;
        if (ibkVar instanceof rby) {
            rbyVar = (rby) ibkVar;
            int i = rbyVar.f197675c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rbyVar.f197675c = i - Integer.MIN_VALUE;
            } else {
                rbyVar = new rby(this, ibkVar);
            }
        } else {
            rbyVar = new rby(this, ibkVar);
        }
        Object objM96567o = rbyVar.f197673a;
        int i2 = rbyVar.f197675c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            z5l z5lVarM10691q = CreateDowngradeCheckoutRequest.m10691q();
            z5lVarM10691q.m95464m(str);
            z5lVarM10691q.m95465q(z);
            Single<CreateDowngradeCheckoutResponse> singleM25500n = this.f281417a.m25500n((CreateDowngradeCheckoutRequest) z5lVarM10691q.build());
            rbyVar.f197675c = 1;
            objM96567o = zn91.m96567o(singleM25500n, rbyVar);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        if (wj50.m88271j((CreateDowngradeCheckoutResponse) objM96567o, CreateDowngradeCheckoutResponse.m10692o())) {
            objM96567o = null;
        }
        CreateDowngradeCheckoutResponse createDowngradeCheckoutResponse = (CreateDowngradeCheckoutResponse) objM96567o;
        if (createDowngradeCheckoutResponse != null) {
            return new k2s(createDowngradeCheckoutResponse.m10693n(), createDowngradeCheckoutResponse.m10694p());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m95886c(String str, ibk ibkVar) {
        sby sbyVar;
        if (ibkVar instanceof sby) {
            sbyVar = (sby) ibkVar;
            int i = sbyVar.f207599c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbyVar.f207599c = i - Integer.MIN_VALUE;
            } else {
                sbyVar = new sby(this, ibkVar);
            }
        } else {
            sbyVar = new sby(this, ibkVar);
        }
        Object obj = sbyVar.f207597a;
        int i2 = sbyVar.f207599c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        f610 f610VarM10706p = GetAddChildToPlanPageRequest.m10706p();
        f610VarM10706p.m40793m(str);
        SingleSource map = this.f281417a.m25499m((GetAddChildToPlanPageRequest) f610VarM10706p.build()).map(new q1h1(str, 4));
        sbyVar.f207599c = 1;
        Object objM96567o = zn91.m96567o(map, sbyVar);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m95887e(String str, ibk ibkVar) {
        tby tbyVar;
        Object obj;
        if (ibkVar instanceof tby) {
            tbyVar = (tby) ibkVar;
            int i = tbyVar.f218970c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tbyVar.f218970c = i - Integer.MIN_VALUE;
            } else {
                tbyVar = new tby(this, ibkVar);
            }
        } else {
            tbyVar = new tby(this, ibkVar);
        }
        Object objM25490d = tbyVar.f218968a;
        int i2 = tbyVar.f218970c;
        if (i2 == 0) {
            bga.m29073P(objM25490d);
            ia10 ia10VarM10722p = GetProfileRequest.m10722p();
            ia10VarM10722p.m50004m(str);
            GetProfileRequest getProfileRequest = (GetProfileRequest) ia10VarM10722p.build();
            wj50.m88279p(getProfileRequest);
            tbyVar.f218970c = 1;
            objM25490d = this.f281417a.m25490d(getProfileRequest, tbyVar);
            yuk yukVar = yuk.f276404a;
            if (objM25490d == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM25490d);
        }
        o2x0 o2x0Var = (o2x0) objM25490d;
        if (o2x0Var.f161171a.f149852O0 && (obj = o2x0Var.f161172b) != null) {
            MemberProfile memberProfileM10723n = ((GetProfileResponse) obj).m10723n();
            return new uqr0(memberProfileM10723n.getDisplayName(), memberProfileM10723n.getImageUrl(), m95881d(memberProfileM10723n));
        }
        throw new IllegalStateException(("Failed to load profile data: " + o2x0Var).toString());
    }

    /* JADX INFO: renamed from: f */
    public final Single m95888f(boolean z) {
        InterfaceC1823eq interfaceC1823eq = this.f281419c;
        if (z) {
            e610 e610VarM2248p = GetAddAccountPageRequest.m2248p();
            e610VarM2248p.m37868m();
            GetAddAccountPageRequest getAddAccountPageRequest = (GetAddAccountPageRequest) e610VarM2248p.build();
            wj50.m88279p(getAddAccountPageRequest);
            return this.f281418b.m34073a(getAddAccountPageRequest).zipWith(interfaceC1823eq.mo39718j(), new ly5(this, 11));
        }
        d610 d610VarM10673p = com.spotify.familyviewservice.accountswitching.p065v1.GetAddAccountPageRequest.m10673p();
        d610VarM10673p.m35047m();
        com.spotify.familyviewservice.accountswitching.p065v1.GetAddAccountPageRequest getAddAccountPageRequest2 = (com.spotify.familyviewservice.accountswitching.p065v1.GetAddAccountPageRequest) d610VarM10673p.build();
        wj50.m88279p(getAddAccountPageRequest2);
        return this.f281417a.m25498l(getAddAccountPageRequest2).zipWith(interfaceC1823eq.mo39718j(), new cu5(this, 11));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: g */
    public final Object m95889g(String str, ibk ibkVar) {
        uby ubyVar;
        Object obj;
        if (ibkVar instanceof uby) {
            ubyVar = (uby) ibkVar;
            int i = ubyVar.f228904c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ubyVar.f228904c = i - Integer.MIN_VALUE;
            } else {
                ubyVar = new uby(this, ibkVar);
            }
        } else {
            ubyVar = new uby(this, ibkVar);
        }
        Object objM25497k = ubyVar.f228902a;
        int i2 = ubyVar.f228904c;
        if (i2 == 0) {
            bga.m29073P(objM25497k);
            za10 za10VarM10726p = GetRegularMemberDetailsRequest.m10726p();
            za10VarM10726p.m95742m(str);
            GetRegularMemberDetailsRequest getRegularMemberDetailsRequest = (GetRegularMemberDetailsRequest) za10VarM10726p.build();
            wj50.m88279p(getRegularMemberDetailsRequest);
            ubyVar.f228904c = 1;
            objM25497k = this.f281417a.m25497k(getRegularMemberDetailsRequest, ubyVar);
            yuk yukVar = yuk.f276404a;
            if (objM25497k == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM25497k);
        }
        o2x0 o2x0Var = (o2x0) objM25497k;
        if (!o2x0Var.f161171a.f149852O0 || (obj = o2x0Var.f161172b) == null) {
            throw new IllegalStateException(("Failed to load regular member details: " + o2x0Var).toString());
        }
        GetRegularMemberDetailsResponse getRegularMemberDetailsResponse = (GetRegularMemberDetailsResponse) obj;
        String memberId = getRegularMemberDetailsResponse.getMemberId();
        String displayName = getRegularMemberDetailsResponse.m10734u().getDisplayName();
        String imageUrl = getRegularMemberDetailsResponse.m10734u().getImageUrl();
        int iM95881d = m95881d(getRegularMemberDetailsResponse.m10734u());
        boolean zM10751p = getRegularMemberDetailsResponse.m10733t().m10751p();
        boolean zM10732s = getRegularMemberDetailsResponse.m10732s();
        boolean zM10731r = getRegularMemberDetailsResponse.m10731r();
        boolean zM10729p = getRegularMemberDetailsResponse.m10729p();
        ae50 ae50VarM10727n = getRegularMemberDetailsResponse.m10727n();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM10727n, 10));
        Iterator<E> it = ae50VarM10727n.iterator();
        while (it.hasNext()) {
            arrayList.add(((Allocation) it.next()).getName());
        }
        return new gtv0(memberId, displayName, imageUrl, iM95881d, zM10751p, zM10732s, zM10731r, zM10729p, arrayList, getRegularMemberDetailsResponse.m10730q(), getRegularMemberDetailsResponse.m10728o(), getRegularMemberDetailsResponse.m10729p(), getRegularMemberDetailsResponse.m10733t().m10752q(), getRegularMemberDetailsResponse.m10733t().m10750n(), getRegularMemberDetailsResponse.m10733t().m10753r());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m95890h(String str, ibk ibkVar) {
        vby vbyVar;
        if (ibkVar instanceof vby) {
            vbyVar = (vby) ibkVar;
            int i = vbyVar.f239604c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vbyVar.f239604c = i - Integer.MIN_VALUE;
            } else {
                vbyVar = new vby(this, ibkVar);
            }
        } else {
            vbyVar = new vby(this, ibkVar);
        }
        Object obj = vbyVar.f239602a;
        int i2 = vbyVar.f239604c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        ab10 ab10VarM10737p = GetRemoveMemberPageRequest.m10737p();
        ab10VarM10737p.m25306m(str);
        SingleSource map = this.f281417a.m25488b((GetRemoveMemberPageRequest) ab10VarM10737p.build()).map(wby.f249898b);
        vbyVar.f239604c = 1;
        Object objM96567o = zn91.m96567o(map, vbyVar);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m95891i(String str, ibk ibkVar) {
        xby xbyVar;
        if (ibkVar instanceof xby) {
            xbyVar = (xby) ibkVar;
            int i = xbyVar.f260029c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xbyVar.f260029c = i - Integer.MIN_VALUE;
            } else {
                xbyVar = new xby(this, ibkVar);
            }
        } else {
            xbyVar = new xby(this, ibkVar);
        }
        Object objM96567o = xbyVar.f260027a;
        int i2 = xbyVar.f260029c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            bjw0 bjw0VarM10765p = RemoveOrDeleteMemberRequest.m10765p();
            bjw0VarM10765p.m29542m(str);
            Single<RemoveOrDeleteMemberResponse> singleM25492f = this.f281417a.m25492f((RemoveOrDeleteMemberRequest) bjw0VarM10765p.build());
            xbyVar.f260029c = 1;
            objM96567o = zn91.m96567o(singleM25492f, xbyVar);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        return ((RemoveOrDeleteMemberResponse) objM96567o).m10766n();
    }
}
