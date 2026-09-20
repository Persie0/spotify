package p204p;

import com.spotify.kidsview.p091v1.proto.Child;
import com.spotify.kidsview.p091v1.proto.GenAlphaManagedSettings;
import com.spotify.kidsview.p091v1.proto.GetChildrenResponse;
import com.spotify.kidsview.p091v1.proto.GetDeleteManagedAccountViewResponse;
import com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponse;
import com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountRequest;
import com.spotify.kidsview.p091v1.proto.TransitionToManagedAccountResponse;
import com.spotify.kidsview.p092v2.proto.GetParentOrGuardianViewResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class h770 implements b770 {

    /* JADX INFO: renamed from: a */
    public final l770 f88361a;

    public h770(l770 l770Var) {
        this.f88361a = l770Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Serializable m46759a(ibk ibkVar) {
        c770 c770Var;
        if (ibkVar instanceof c770) {
            c770Var = (c770) ibkVar;
            int i = c770Var.f34775c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c770Var.f34775c = i - Integer.MIN_VALUE;
            } else {
                c770Var = new c770(this, ibkVar);
            }
        } else {
            c770Var = new c770(this, ibkVar);
        }
        Object objM58399a = c770Var.f34773a;
        int i2 = c770Var.f34775c;
        if (i2 == 0) {
            bga.m29073P(objM58399a);
            c770Var.f34775c = 1;
            objM58399a = this.f88361a.m58399a(c770Var);
            yuk yukVar = yuk.f276404a;
            if (objM58399a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM58399a);
        }
        List<Child> childrenList = ((GetChildrenResponse) objM58399a).getChildrenList();
        ArrayList<Child> arrayList = new ArrayList();
        for (Object obj : childrenList) {
            if (((Child) obj).getProfile().getAllowedInMusicApp()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (Child child : arrayList) {
            arrayList2.add(new j2e(qyg1.m74180J(child.getProfile().getColor().getValue()), child.getChildId(), child.getProfile().getName(), child.getImageUri().getValue(), child.getProfile().getDateOfBirth(), false, child.getIsFree()));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m46760b(String str, ibk ibkVar) {
        d770 d770Var;
        if (ibkVar instanceof d770) {
            d770Var = (d770) ibkVar;
            int i = d770Var.f46016c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d770Var.f46016c = i - Integer.MIN_VALUE;
            } else {
                d770Var = new d770(this, ibkVar);
            }
        } else {
            d770Var = new d770(this, ibkVar);
        }
        Object objM58400b = d770Var.f46014a;
        int i2 = d770Var.f46016c;
        if (i2 == 0) {
            bga.m29073P(objM58400b);
            d770Var.f46016c = 1;
            objM58400b = this.f88361a.m58400b(str, d770Var);
            yuk yukVar = yuk.f276404a;
            if (objM58400b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM58400b);
        }
        return zmg1.m96450q((GetDeleteManagedAccountViewResponse) objM58400b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m46761c(String str, ibk ibkVar) {
        e770 e770Var;
        if (ibkVar instanceof e770) {
            e770Var = (e770) ibkVar;
            int i = e770Var.f56844c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e770Var.f56844c = i - Integer.MIN_VALUE;
            } else {
                e770Var = new e770(this, ibkVar);
            }
        } else {
            e770Var = new e770(this, ibkVar);
        }
        Object objM58405g = e770Var.f56842a;
        int i2 = e770Var.f56844c;
        if (i2 == 0) {
            bga.m29073P(objM58405g);
            e770Var.f56844c = 1;
            objM58405g = this.f88361a.m58405g(str, e770Var);
            yuk yukVar = yuk.f276404a;
            if (objM58405g == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM58405g);
        }
        return zmg1.m96451r((GetManagedAccountDetailsViewResponse) objM58405g);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m46762d(ibk ibkVar) {
        f770 f770Var;
        if (ibkVar instanceof f770) {
            f770Var = (f770) ibkVar;
            int i = f770Var.f66574c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f770Var.f66574c = i - Integer.MIN_VALUE;
            } else {
                f770Var = new f770(this, ibkVar);
            }
        } else {
            f770Var = new f770(this, ibkVar);
        }
        Object objM58403e = f770Var.f66572a;
        int i2 = f770Var.f66574c;
        if (i2 == 0) {
            bga.m29073P(objM58403e);
            f770Var.f66574c = 1;
            objM58403e = this.f88361a.m58403e(f770Var);
            yuk yukVar = yuk.f276404a;
            if (objM58403e == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM58403e);
        }
        return vqg1.m86221F((GetParentOrGuardianViewResponse) objM58403e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m46763e(h891 h891Var, String str, String str2, boolean z, boolean z2, String str3, ibk ibkVar) {
        g770 g770Var;
        if (ibkVar instanceof g770) {
            g770Var = (g770) ibkVar;
            int i = g770Var.f77200c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g770Var.f77200c = i - Integer.MIN_VALUE;
            } else {
                g770Var = new g770(this, ibkVar);
            }
        } else {
            g770Var = new g770(this, ibkVar);
        }
        Object objM58401c = g770Var.f77198a;
        int i2 = g770Var.f77200c;
        if (i2 == 0) {
            bga.m29073P(objM58401c);
            TransitionToManagedAccountRequest.Builder builderNewBuilder = TransitionToManagedAccountRequest.newBuilder();
            if (h891Var instanceof g891) {
                builderNewBuilder.setParentalConsentSessionId(((g891) h891Var).getValue());
            } else {
                if (!(h891Var instanceof e891)) {
                    throw new NoWhenBranchMatchedException();
                }
                builderNewBuilder.setMemberId(((e891) h891Var).getValue());
            }
            if (str3 != null) {
                int i3 = yd20.f271624a;
                builderNewBuilder.setParentPinHash(xd20.f260364a.m93079p(str3, vuc.f244913a).toString());
            }
            TransitionToManagedAccountRequest transitionToManagedAccountRequest = (TransitionToManagedAccountRequest) builderNewBuilder.setSettings((GenAlphaManagedSettings) GenAlphaManagedSettings.newBuilder().setDisplayName(str).setDateOfBirth(str2).setAllowExplicitContent(z).setAllowVideoContent(z2).build()).build();
            wj50.m88279p(transitionToManagedAccountRequest);
            g770Var.f77200c = 1;
            objM58401c = this.f88361a.m58401c(transitionToManagedAccountRequest, g770Var);
            yuk yukVar = yuk.f276404a;
            if (objM58401c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM58401c);
        }
        TransitionToManagedAccountResponse transitionToManagedAccountResponse = (TransitionToManagedAccountResponse) objM58401c;
        return new a9c0(transitionToManagedAccountResponse.getTimeout().m1932r(), transitionToManagedAccountResponse.getMigrationId());
    }
}
