package p204p;

import com.spotify.kidsaccount.api.p084v3.proto.AddChildRequest;
import com.spotify.kidsaccount.api.p084v3.proto.AddChildResponse;
import com.spotify.kidsaccount.api.p084v3.proto.ChildAttributes;
import com.spotify.kidsaccount.api.p084v3.proto.ChildProfile;
import com.spotify.kidsaccount.api.p084v3.proto.GetChildDateOfBirthRangeRequest;
import com.spotify.kidsaccount.api.p084v3.proto.GetChildDateOfBirthRangeResponse;
import com.spotify.kidsaccount.api.p084v3.proto.GetCreateChildConfigRequest;
import com.spotify.kidsaccount.api.p084v3.proto.GetCreateChildConfigResponse;
import com.spotify.kidsaccount.api.p084v3.proto.GetTransitionChildConfigRequest;
import com.spotify.kidsaccount.api.p084v3.proto.GetTransitionChildConfigResponse;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class j470 {

    /* JADX INFO: renamed from: a */
    public final m470 f108612a;

    public j470(m470 m470Var) {
        this.f108612a = m470Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m52327a(String str, String str2, String str3, d0n0 d0n0Var, String str4, ibk ibkVar) {
        f470 f470Var;
        String string;
        boolean z;
        if (ibkVar instanceof f470) {
            f470Var = (f470) ibkVar;
            int i = f470Var.f65689c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f470Var.f65689c = i - Integer.MIN_VALUE;
            } else {
                f470Var = new f470(this, ibkVar);
            }
        } else {
            f470Var = new f470(this, ibkVar);
        }
        Object objM60791b = f470Var.f65687a;
        int i2 = f470Var.f65689c;
        if (i2 == 0) {
            bga.m29073P(objM60791b);
            if (str3 != null) {
                int i3 = yd20.f271624a;
                string = xd20.f260364a.m93079p(str3, vuc.f244913a).toString();
            } else {
                string = null;
            }
            aa1 aa1VarM12113r = AddChildRequest.m12113r();
            h4e h4eVarM12130p = ChildProfile.m12130p();
            h4eVarM12130p.m46637q(str);
            h4eVarM12130p.m46636m(str2);
            aa1VarM12113r.m25177s((ChildProfile) h4eVarM12130p.build());
            f3e f3eVarM12127p = ChildAttributes.m12127p();
            lzm0 lzm0Var = d0n0Var.f44013b;
            boolean z2 = lzm0Var instanceof fzm0;
            boolean z3 = false;
            kzm0 kzm0Var = kzm0.f128164a;
            if (z2) {
                z = ((fzm0) lzm0Var).f75128a;
            } else {
                if (!wj50.m88271j(lzm0Var, kzm0Var)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            f3eVarM12127p.m40655m(z);
            lzm0 lzm0Var2 = d0n0Var.f44012a;
            if (lzm0Var2 instanceof fzm0) {
                z3 = ((fzm0) lzm0Var2).f75128a;
            } else if (!wj50.m88271j(lzm0Var2, kzm0Var)) {
                throw new NoWhenBranchMatchedException();
            }
            f3eVarM12127p.m40656q(z3);
            aa1VarM12113r.m25174m((ChildAttributes) f3eVarM12127p.build());
            if (string != null) {
                aa1VarM12113r.m25176r(string);
            }
            if (str4 != null) {
                aa1VarM12113r.m25175q(str4);
            }
            AddChildRequest addChildRequest = (AddChildRequest) aa1VarM12113r.build();
            f470Var.f65689c = 1;
            objM60791b = this.f108612a.m60791b(addChildRequest, f470Var);
            yuk yukVar = yuk.f276404a;
            if (objM60791b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM60791b);
        }
        return ((AddChildResponse) objM60791b).getChildId();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m52328b(ibk ibkVar) {
        g470 g470Var;
        if (ibkVar instanceof g470) {
            g470Var = (g470) ibkVar;
            int i = g470Var.f76358c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g470Var.f76358c = i - Integer.MIN_VALUE;
            } else {
                g470Var = new g470(this, ibkVar);
            }
        } else {
            g470Var = new g470(this, ibkVar);
        }
        Object objM60790a = g470Var.f76356a;
        int i2 = g470Var.f76358c;
        if (i2 == 0) {
            bga.m29073P(objM60790a);
            h710 h710VarM12135o = GetChildDateOfBirthRangeRequest.m12135o();
            h710VarM12135o.m46753m();
            GetChildDateOfBirthRangeRequest getChildDateOfBirthRangeRequest = (GetChildDateOfBirthRangeRequest) h710VarM12135o.build();
            wj50.m88279p(getChildDateOfBirthRangeRequest);
            g470Var.f76358c = 1;
            objM60790a = this.f108612a.m60790a(getChildDateOfBirthRangeRequest, g470Var);
            yuk yukVar = yuk.f276404a;
            if (objM60790a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM60790a);
        }
        GetChildDateOfBirthRangeResponse getChildDateOfBirthRangeResponse = (GetChildDateOfBirthRangeResponse) objM60790a;
        return new k3e(getChildDateOfBirthRangeResponse.m12137o(), getChildDateOfBirthRangeResponse.m12136n());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m52329c(String str, ibk ibkVar) {
        h470 h470Var;
        if (ibkVar instanceof h470) {
            h470Var = (h470) ibkVar;
            int i = h470Var.f87458c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h470Var.f87458c = i - Integer.MIN_VALUE;
            } else {
                h470Var = new h470(this, ibkVar);
            }
        } else {
            h470Var = new h470(this, ibkVar);
        }
        Object objM60792c = h470Var.f87456a;
        int i2 = h470Var.f87458c;
        if (i2 == 0) {
            bga.m29073P(objM60792c);
            x710 x710VarM12140p = GetCreateChildConfigRequest.m12140p();
            x710VarM12140p.m90112q();
            if (str != null) {
                x710VarM12140p.m90111m(str);
            }
            GetCreateChildConfigRequest getCreateChildConfigRequest = (GetCreateChildConfigRequest) x710VarM12140p.build();
            h470Var.f87458c = 1;
            objM60792c = this.f108612a.m60792c(getCreateChildConfigRequest, h470Var);
            yuk yukVar = yuk.f276404a;
            if (objM60792c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM60792c);
        }
        GetCreateChildConfigResponse getCreateChildConfigResponse = (GetCreateChildConfigResponse) objM60792c;
        return stg1.m79280u(getCreateChildConfigResponse.m12144q(), getCreateChildConfigResponse.m12141n(), getCreateChildConfigResponse.m12145r(), getCreateChildConfigResponse.m12143p(), getCreateChildConfigResponse.m12142o(), false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m52330d(h891 h891Var, ibk ibkVar) {
        i470 i470Var;
        GetTransitionChildConfigRequest getTransitionChildConfigRequest;
        if (ibkVar instanceof i470) {
            i470Var = (i470) ibkVar;
            int i = i470Var.f98446c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i470Var.f98446c = i - Integer.MIN_VALUE;
            } else {
                i470Var = new i470(this, ibkVar);
            }
        } else {
            i470Var = new i470(this, ibkVar);
        }
        Object objM60793d = i470Var.f98444a;
        int i2 = i470Var.f98446c;
        if (i2 == 0) {
            bga.m29073P(objM60793d);
            if (h891Var instanceof g891) {
                cc10 cc10VarM12148p = GetTransitionChildConfigRequest.m12148p();
                cc10VarM12148p.m32201q(((g891) h891Var).f77444a);
                getTransitionChildConfigRequest = (GetTransitionChildConfigRequest) cc10VarM12148p.build();
            } else {
                if (!(h891Var instanceof e891)) {
                    throw new NoWhenBranchMatchedException();
                }
                cc10 cc10VarM12148p2 = GetTransitionChildConfigRequest.m12148p();
                cc10VarM12148p2.m32200m(((e891) h891Var).f57115a);
                getTransitionChildConfigRequest = (GetTransitionChildConfigRequest) cc10VarM12148p2.build();
            }
            wj50.m88279p(getTransitionChildConfigRequest);
            i470Var.f98446c = 1;
            objM60793d = this.f108612a.m60793d(getTransitionChildConfigRequest, i470Var);
            yuk yukVar = yuk.f276404a;
            if (objM60793d == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM60793d);
        }
        GetTransitionChildConfigResponse getTransitionChildConfigResponse = (GetTransitionChildConfigResponse) objM60793d;
        return stg1.m79280u(getTransitionChildConfigResponse.m12153r(), getTransitionChildConfigResponse.m12149n(), getTransitionChildConfigResponse.m12154s(), getTransitionChildConfigResponse.m12151p(), getTransitionChildConfigResponse.m12150o(), getTransitionChildConfigResponse.m12152q());
    }
}
