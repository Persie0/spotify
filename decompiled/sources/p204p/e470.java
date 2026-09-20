package p204p;

import android.net.Uri;
import com.spotify.kidsaccount.api.p083v2.proto.CreateChildLoginTokenRequest;
import com.spotify.kidsaccount.api.p083v2.proto.CreateChildLoginTokenResponse;
import com.spotify.kidsaccount.api.p083v2.proto.GetChildAccountEducationAttributesResponse;
import com.spotify.kidsaccount.api.p083v2.proto.GetChildAccountSettingsRequest;
import com.spotify.kidsaccount.api.p083v2.proto.GetChildAccountSettingsResponse;
import com.spotify.kidsaccount.api.p083v2.proto.NotEmpty;
import com.spotify.kidsaccount.api.p083v2.proto.SetChildAccountSettingsRequest;
import com.spotify.kidsaccount.api.p083v2.proto.VerifyPinRequest;
import com.spotify.kidsaccount.api.p083v2.proto.VerifyPinResponse;
import io.reactivex.rxjava3.core.Completable;
import kotlin.NoWhenBranchMatchedException;
import p196j$.net.URLEncoder;

/* JADX INFO: loaded from: classes2.dex */
public final class e470 {

    /* JADX INFO: renamed from: a */
    public final l470 f56019a;

    /* JADX INFO: renamed from: b */
    public final rta0 f56020b;

    /* JADX INFO: renamed from: c */
    public final iv91 f56021c;

    /* JADX INFO: renamed from: d */
    public final boolean f56022d;

    /* JADX INFO: renamed from: e */
    public final lbm0 f56023e;

    public e470(l470 l470Var, rta0 rta0Var, iv91 iv91Var, boolean z, lbm0 lbm0Var) {
        this.f56019a = l470Var;
        this.f56020b = rta0Var;
        this.f56021c = iv91Var;
        this.f56022d = z;
        this.f56023e = lbm0Var;
    }

    /* JADX INFO: renamed from: g */
    public static Completable m37757g(e470 e470Var, String str, String str2, String str3, Boolean bool, Boolean bool2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        if ((i & 32) != 0) {
            bool2 = null;
        }
        a501 a501VarM12104t = SetChildAccountSettingsRequest.m12104t();
        a501VarM12104t.m24739m(str);
        if (str2 != null) {
            a501VarM12104t.m24741r(str2);
        }
        if (str3 != null) {
            a501VarM12104t.m24740q(str3);
        }
        if (bool != null) {
            a501VarM12104t.m24742s(bool.booleanValue());
        }
        if (bool2 != null) {
            a501VarM12104t.m24743t(bool2.booleanValue());
        }
        return e470Var.f56019a.m58126k((SetChildAccountSettingsRequest) a501VarM12104t.build());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m37758a(String str, String str2, String str3, d0n0 d0n0Var, ibk ibkVar) {
        x370 x370Var;
        String string;
        boolean zM43243c;
        if (ibkVar instanceof x370) {
            x370Var = (x370) ibkVar;
            int i = x370Var.f257709c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x370Var.f257709c = i - Integer.MIN_VALUE;
            } else {
                x370Var = new x370(this, ibkVar);
            }
        } else {
            x370Var = new x370(this, ibkVar);
        }
        Object objM58117b = x370Var.f257707a;
        int i2 = x370Var.f257709c;
        if (i2 == 0) {
            bga.m29073P(objM58117b);
            if (wl51.m88460J0(str) || wl51.m88460J0(str2)) {
                throw new IllegalStateException(new IllegalStateException("Unable to create kid account. Missing required data").toString());
            }
            if (str3 != null) {
                int i3 = yd20.f271624a;
                string = xd20.f260364a.m93079p(str3, vuc.f244913a).toString();
            } else {
                string = null;
            }
            dmr0 dmr0Var = new dmr0(str, str2);
            lzm0 lzm0Var = d0n0Var.f44012a;
            boolean z = lzm0Var instanceof fzm0;
            boolean zM43243c2 = false;
            kzm0 kzm0Var = kzm0.f128164a;
            if (z) {
                zM43243c = ((fzm0) lzm0Var).m43243c();
            } else {
                if (!wj50.m88271j(lzm0Var, kzm0Var)) {
                    throw new NoWhenBranchMatchedException();
                }
                zM43243c = false;
            }
            lzm0 lzm0Var2 = d0n0Var.f44013b;
            if (lzm0Var2 instanceof fzm0) {
                zM43243c2 = ((fzm0) lzm0Var2).m43243c();
            } else if (!wj50.m88271j(lzm0Var2, kzm0Var)) {
                throw new NoWhenBranchMatchedException();
            }
            pc1 pc1Var = new pc1(dmr0Var, string, new h0n0(zM43243c, zM43243c2));
            x370Var.f257709c = 1;
            objM58117b = this.f56019a.m58117b(pc1Var, x370Var);
            yuk yukVar = yuk.f276404a;
            if (objM58117b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM58117b);
        }
        return ((sc1) objM58117b).m77761a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m37759b(String str, Boolean bool, ibk ibkVar) {
        y370 y370Var;
        if (ibkVar instanceof y370) {
            y370Var = (y370) ibkVar;
            int i = y370Var.f268774e;
            if ((i & Integer.MIN_VALUE) != 0) {
                y370Var.f268774e = i - Integer.MIN_VALUE;
            } else {
                y370Var = new y370(this, ibkVar);
            }
        } else {
            y370Var = new y370(this, ibkVar);
        }
        Object objM58129n = y370Var.f268772c;
        int i2 = y370Var.f268774e;
        if (i2 == 0) {
            bga.m29073P(objM58129n);
            b5l b5lVarM12075p = CreateChildLoginTokenRequest.m12075p();
            b5lVarM12075p.m28171m(str);
            CreateChildLoginTokenRequest createChildLoginTokenRequest = (CreateChildLoginTokenRequest) b5lVarM12075p.build();
            y370Var.f268770a = str;
            y370Var.f268771b = bool;
            y370Var.f268774e = 1;
            objM58129n = this.f56019a.m58129n(createChildLoginTokenRequest, y370Var);
            yuk yukVar = yuk.f276404a;
            if (objM58129n == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bool = y370Var.f268771b;
            str = y370Var.f268770a;
            bga.m29073P(objM58129n);
        }
        String str2 = str;
        CreateChildLoginTokenResponse createChildLoginTokenResponse = (CreateChildLoginTokenResponse) objM58129n;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : createChildLoginTokenResponse.getIsFree();
        String str3 = zBooleanValue ? "free_managed_account" : "managed_account";
        String strName = vuc.f244913a.name();
        StringBuilder sbM38573v = edb.m38573v("https://accounts.spotify.com/login/ott/music#username=", URLEncoder.encode(createChildLoginTokenResponse.m12078p(), strName), "&token=", URLEncoder.encode(createChildLoginTokenResponse.m12079q(), strName), "&flow=");
        sbM38573v.append(str3);
        return new cza0(createChildLoginTokenResponse.m12080r() ? qyg1.m74180J(createChildLoginTokenResponse.m12076n().getValue()) : null, str2, m37761d(sbM38573v.toString()), createChildLoginTokenResponse.m12077o(), zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m37760c(String str, ibk ibkVar) {
        z370 z370Var;
        if (ibkVar instanceof z370) {
            z370Var = (z370) ibkVar;
            int i = z370Var.f278809c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z370Var.f278809c = i - Integer.MIN_VALUE;
            } else {
                z370Var = new z370(this, ibkVar);
            }
        } else {
            z370Var = new z370(this, ibkVar);
        }
        Object objM58121f = z370Var.f278807a;
        int i2 = z370Var.f278809c;
        if (i2 == 0) {
            bga.m29073P(objM58121f);
            g710 g710VarM12084p = GetChildAccountSettingsRequest.m12084p();
            g710VarM12084p.m43792m(str);
            GetChildAccountSettingsRequest getChildAccountSettingsRequest = (GetChildAccountSettingsRequest) g710VarM12084p.build();
            z370Var.f278809c = 1;
            objM58121f = this.f56019a.m58121f(getChildAccountSettingsRequest, z370Var);
            yuk yukVar = yuk.f276404a;
            if (objM58121f == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM58121f);
        }
        GetChildAccountSettingsResponse getChildAccountSettingsResponse = (GetChildAccountSettingsResponse) objM58121f;
        String name = getChildAccountSettingsResponse.getName();
        String dateOfBirth = getChildAccountSettingsResponse.getDateOfBirth();
        String dateOfBirthMinDate = getChildAccountSettingsResponse.getDateOfBirthMinDate();
        String dateOfBirthMaxDate = getChildAccountSettingsResponse.getDateOfBirthMaxDate();
        String strM12085n = getChildAccountSettingsResponse.m12085n();
        String dateOfBirthMaxDate2 = getChildAccountSettingsResponse.getDateOfBirthMaxDate();
        boolean available = getChildAccountSettingsResponse.m12086o().getAvailable();
        lzm0 fzm0Var = kzm0.f128164a;
        lzm0 fzm0Var2 = available ? new fzm0(getChildAccountSettingsResponse.m12086o().getValue()) : fzm0Var;
        if (getChildAccountSettingsResponse.m12087p().getAvailable()) {
            fzm0Var = new fzm0(getChildAccountSettingsResponse.m12087p().getValue());
        }
        return new c370(name, dateOfBirth, dateOfBirthMinDate, dateOfBirthMaxDate, strM12085n, dateOfBirthMaxDate2, new d0n0(fzm0Var2, fzm0Var), getChildAccountSettingsResponse.getImageUri().getValue(), qyg1.m74180J(getChildAccountSettingsResponse.getColor().getValue()));
    }

    /* JADX INFO: renamed from: d */
    public final String m37761d(String str) {
        if (!this.f56022d) {
            return str;
        }
        kbm0 kbm0Var = (kbm0) this.f56023e.f131690a.f174322a.get();
        String string = this.f56021c.m51739a(Uri.parse(str), kbm0Var != null ? new j6j0(kbm0Var) : null).toString();
        wj50.m88279p(string);
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m37762e(ibk ibkVar) {
        b470 b470Var;
        if (ibkVar instanceof b470) {
            b470Var = (b470) ibkVar;
            int i = b470Var.f23241c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b470Var.f23241c = i - Integer.MIN_VALUE;
            } else {
                b470Var = new b470(this, ibkVar);
            }
        } else {
            b470Var = new b470(this, ibkVar);
        }
        Object objM58128m = b470Var.f23239a;
        int i2 = b470Var.f23241c;
        if (i2 == 0) {
            bga.m29073P(objM58128m);
            ppj0 ppj0VarM12095p = NotEmpty.m12095p();
            ppj0VarM12095p.m70595m();
            NotEmpty notEmpty = (NotEmpty) ppj0VarM12095p.build();
            b470Var.f23241c = 1;
            objM58128m = this.f56019a.m58128m(notEmpty, b470Var);
            yuk yukVar = yuk.f276404a;
            if (objM58128m == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM58128m);
        }
        return qyg1.m74180J(((GetChildAccountEducationAttributesResponse) objM58128m).m12081n());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m37763f(String str, ibk ibkVar) {
        c470 c470Var;
        if (ibkVar instanceof c470) {
            c470Var = (c470) ibkVar;
            int i = c470Var.f33862c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c470Var.f33862c = i - Integer.MIN_VALUE;
            } else {
                c470Var = new c470(this, ibkVar);
            }
        } else {
            c470Var = new c470(this, ibkVar);
        }
        Object objM58119d = c470Var.f33860a;
        int i2 = c470Var.f33862c;
        if (i2 == 0) {
            bga.m29073P(objM58119d);
            int i3 = yd20.f271624a;
            wjj0 wjj0Var = new wjj0(xd20.f260364a.m93079p(str, vuc.f244913a).toString());
            c470Var.f33862c = 1;
            objM58119d = this.f56019a.m58119d(wjj0Var, c470Var);
            yuk yukVar = yuk.f276404a;
            if (objM58119d == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM58119d);
        }
        return ((wjj0) objM58119d).f251979a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m37764h(String str, ibk ibkVar) {
        d470 d470Var;
        if (ibkVar instanceof d470) {
            d470Var = (d470) ibkVar;
            int i = d470Var.f45098c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d470Var.f45098c = i - Integer.MIN_VALUE;
            } else {
                d470Var = new d470(this, ibkVar);
            }
        } else {
            d470Var = new d470(this, ibkVar);
        }
        Object objM58125j = d470Var.f45096a;
        int i2 = d470Var.f45098c;
        if (i2 == 0) {
            bga.m29073P(objM58125j);
            int i3 = yd20.f271624a;
            String string = xd20.f260364a.m93079p(str, vuc.f244913a).toString();
            tdb1 tdb1VarM12107p = VerifyPinRequest.m12107p();
            tdb1VarM12107p.m80502m(string);
            VerifyPinRequest verifyPinRequest = (VerifyPinRequest) tdb1VarM12107p.build();
            d470Var.f45098c = 1;
            objM58125j = this.f56019a.m58125j(verifyPinRequest, d470Var);
            yuk yukVar = yuk.f276404a;
            if (objM58125j == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM58125j);
        }
        return qyg1.m74178H(((VerifyPinResponse) objM58125j).m12108n());
    }
}
