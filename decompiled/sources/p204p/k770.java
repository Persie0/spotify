package p204p;

import com.spotify.kidsview.p092v2.proto.AccountControls;
import com.spotify.kidsview.p092v2.proto.AddOn;
import com.spotify.kidsview.p092v2.proto.DateOfBirth;
import com.spotify.kidsview.p092v2.proto.GetManagedAccountDetailsViewResponse;
import com.spotify.kidsview.p092v2.proto.ManagedAccountIdentifier;
import com.spotify.kidsview.p092v2.proto.SetManagedAccountSettingsRequest;
import com.spotify.kidsview.p092v2.proto.SetManagedAccountSettingsResponse;
import com.spotify.kidsview.p092v2.proto.VideoControls;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class k770 {

    /* JADX INFO: renamed from: a */
    public final m770 f119996a;

    public k770(m770 m770Var) {
        this.f119996a = m770Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m55634a(String str, z5c0 z5c0Var, ibk ibkVar) {
        i770 i770Var;
        String childId;
        fmo fmoVar;
        if (ibkVar instanceof i770) {
            i770Var = (i770) ibkVar;
            int i = i770Var.f99461c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i770Var.f99461c = i - Integer.MIN_VALUE;
            } else {
                i770Var = new i770(this, ibkVar);
            }
        } else {
            i770Var = new i770(this, ibkVar);
        }
        Object objM61055a = i770Var.f99459a;
        int i2 = i770Var.f99461c;
        if (i2 == 0) {
            bga.m29073P(objM61055a);
            String str2 = z5c0Var.f279542a;
            i770Var.f99461c = 1;
            objM61055a = this.f119996a.m61055a(str, str2, i770Var);
            yuk yukVar = yuk.f276404a;
            if (objM61055a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM61055a);
        }
        GetManagedAccountDetailsViewResponse getManagedAccountDetailsViewResponse = (GetManagedAccountDetailsViewResponse) objM61055a;
        int iM96448o = zmg1.m96448o(getManagedAccountDetailsViewResponse.getAccountType());
        ManagedAccountIdentifier managedAccountIdentifierM12490n = getManagedAccountDetailsViewResponse.m12490n();
        int iM12509q = managedAccountIdentifierM12490n.m12509q();
        int i3 = iM12509q == 0 ? -1 : y7c0.f270025a[edb.m38547C(iM12509q)];
        if (i3 == 1) {
            childId = managedAccountIdentifierM12490n.getChildId();
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("ManagedAccountIdentifier must have either child_id or teen_id set");
            }
            childId = managedAccountIdentifierM12490n.m12510r();
        }
        String str3 = childId;
        emr0 emr0VarM96453t = zmg1.m96453t(getManagedAccountDetailsViewResponse.getProfile());
        if (getManagedAccountDetailsViewResponse.hasDateOfBirth()) {
            DateOfBirth dateOfBirthM12493q = getManagedAccountDetailsViewResponse.m12493q();
            fmoVar = new fmo(dateOfBirthM12493q.m12488n(), dateOfBirthM12493q.m12489p());
        } else {
            fmoVar = null;
        }
        boolean zM12497u = getManagedAccountDetailsViewResponse.m12497u();
        l3c0 l3c0Var = getManagedAccountDetailsViewResponse.m12499w() ? new l3c0(getManagedAccountDetailsViewResponse.m12494r().getHasAudiobooksAvailable()) : null;
        boolean zM12496t = getManagedAccountDetailsViewResponse.m12496t();
        C1940hk c1940hkM48171o = getManagedAccountDetailsViewResponse.m12495s() ? hpg1.m48171o(getManagedAccountDetailsViewResponse.m12491o()) : null;
        r9o0 r9o0VarM96452s = getManagedAccountDetailsViewResponse.hasPlanMembership() ? zmg1.m96452s(getManagedAccountDetailsViewResponse.getPlanMembership()) : null;
        xmq xmqVarM96449p = getManagedAccountDetailsViewResponse.hasDeleteAction() ? zmg1.m96449p(getManagedAccountDetailsViewResponse.getDeleteAction()) : null;
        boolean zM12500x = getManagedAccountDetailsViewResponse.m12500x();
        cs10 cs10Var = getManagedAccountDetailsViewResponse.hasGraduationBanner() ? new cs10(getManagedAccountDetailsViewResponse.getGraduationBanner().getMinGraduationAge()) : null;
        ae50 ae50VarM12492p = getManagedAccountDetailsViewResponse.m12492p();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM12492p, 10));
        Iterator<E> it = ae50VarM12492p.iterator();
        while (it.hasNext()) {
            arrayList.add(((AddOn) it.next()).getDisplayName());
        }
        return new a6c0(iM96448o, str3, emr0VarM96453t, fmoVar, zM12497u, l3c0Var, zM12496t, c1940hkM48171o, r9o0VarM96452s, xmqVarM96449p, zM12500x, cs10Var, arrayList, getManagedAccountDetailsViewResponse.m12498v());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m55635b(String str, z5c0 z5c0Var, C1940hk c1940hk, ibk ibkVar) {
        j770 j770Var;
        ManagedAccountIdentifier managedAccountIdentifier;
        if (ibkVar instanceof j770) {
            j770Var = (j770) ibkVar;
            int i = j770Var.f109525c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j770Var.f109525c = i - Integer.MIN_VALUE;
            } else {
                j770Var = new j770(this, ibkVar);
            }
        } else {
            j770Var = new j770(this, ibkVar);
        }
        Object objM61056b = j770Var.f109523a;
        int i2 = j770Var.f109525c;
        if (i2 == 0) {
            bga.m29073P(objM61056b);
            int iOrdinal = z5c0Var.ordinal();
            if (iOrdinal == 0) {
                d8c0 d8c0VarM12508s = ManagedAccountIdentifier.m12508s();
                d8c0VarM12508s.m35260m(str);
                managedAccountIdentifier = (ManagedAccountIdentifier) d8c0VarM12508s.build();
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                d8c0 d8c0VarM12508s2 = ManagedAccountIdentifier.m12508s();
                d8c0VarM12508s2.m35261q(str);
                managedAccountIdentifier = (ManagedAccountIdentifier) d8c0VarM12508s2.build();
            }
            n501 n501VarM12514p = SetManagedAccountSettingsRequest.m12514p();
            n501VarM12514p.m63696m(managedAccountIdentifier);
            C1900gk c1900gkM12466H = AccountControls.m12466H();
            Boolean bool = c1940hk.f92296a;
            if (bool != null) {
                c1900gkM12466H.m45019q(bool.booleanValue());
            }
            Boolean bool2 = c1940hk.f92297b;
            if (bool2 != null) {
                c1900gkM12466H.m45023u(bool2.booleanValue());
            }
            msb1 msb1Var = c1940hk.f92298c;
            if (msb1Var != null) {
                lsb1 lsb1VarM12522x = VideoControls.m12522x();
                Boolean bool3 = msb1Var.f146744a;
                if (bool3 != null) {
                    lsb1VarM12522x.m59826q(bool3.booleanValue());
                }
                Boolean bool4 = msb1Var.f146745b;
                if (bool4 != null) {
                    lsb1VarM12522x.m59825m(bool4.booleanValue());
                }
                Boolean bool5 = msb1Var.f146746c;
                if (bool5 != null) {
                    lsb1VarM12522x.m59827r(bool5.booleanValue());
                }
                c1900gkM12466H.m45024v((VideoControls) lsb1VarM12522x.build());
            }
            Boolean bool6 = c1940hk.f92299d;
            if (bool6 != null) {
                c1900gkM12466H.m45022t(bool6.booleanValue());
            }
            Boolean bool7 = c1940hk.f92300e;
            if (bool7 != null) {
                c1900gkM12466H.m45018m(bool7.booleanValue());
            }
            Boolean bool8 = c1940hk.f92301f;
            if (bool8 != null) {
                c1900gkM12466H.m45021s(bool8.booleanValue());
            }
            Boolean bool9 = c1940hk.f92302g;
            if (bool9 != null) {
                c1900gkM12466H.m45020r(bool9.booleanValue());
            }
            n501VarM12514p.m63697q((AccountControls) c1900gkM12466H.build());
            SetManagedAccountSettingsRequest setManagedAccountSettingsRequest = (SetManagedAccountSettingsRequest) n501VarM12514p.build();
            String str2 = z5c0Var.f279542a;
            wj50.m88279p(setManagedAccountSettingsRequest);
            j770Var.f109525c = 1;
            objM61056b = this.f119996a.m61056b(str, str2, setManagedAccountSettingsRequest, j770Var);
            yuk yukVar = yuk.f276404a;
            if (objM61056b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM61056b);
        }
        return hpg1.m48171o(((SetManagedAccountSettingsResponse) objM61056b).m12515n());
    }
}
