package p204p;

import com.google.protobuf.FieldMask;
import com.spotify.profileprivacy.proto.p132v1.GetProfilePrivacyRequest;
import com.spotify.profileprivacy.proto.p132v1.GetProfilePrivacyResponse;
import com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequest;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes10.dex */
public final class rm11 implements om11, sio {

    /* JADX INFO: renamed from: a */
    public final a2s0 f200411a;

    /* JADX INFO: renamed from: b */
    public final Observable f200412b;

    /* JADX INFO: renamed from: c */
    public final qzn f200413c;

    /* JADX INFO: renamed from: d */
    public final fnc f200414d;

    public rm11(a2s0 a2s0Var, Observable observable) {
        this.f200411a = a2s0Var;
        this.f200412b = observable;
        qzn qznVar = new qzn(this);
        this.f200413c = qznVar;
        this.f200414d = (fnc) qznVar.f194231d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (r10 == r5) goto L22;
     */
    @Override // p204p.sio
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo54020a(boolean z, ibk ibkVar) {
        qm11 qm11Var;
        SetProfilePrivacyRequest.Builder builderNewBuilder;
        a2s0 a2s0Var;
        if (ibkVar instanceof qm11) {
            qm11Var = (qm11) ibkVar;
            int i = qm11Var.f190015f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qm11Var.f190015f = i - Integer.MIN_VALUE;
            } else {
                qm11Var = new qm11(this, ibkVar);
            }
        } else {
            qm11Var = new qm11(this, ibkVar);
        }
        Object objM24525a = qm11Var.f190013d;
        int i2 = qm11Var.f190015f;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM24525a);
            builderNewBuilder = SetProfilePrivacyRequest.newBuilder();
            a2s0 a2s0Var2 = this.f200411a;
            qm11Var.f190011b = a2s0Var2;
            qm11Var.f190012c = builderNewBuilder;
            qm11Var.f190010a = z;
            qm11Var.f190015f = 1;
            Object objM96571q = zn91.m96571q(this.f200412b, 1, null, qm11Var);
            if (objM96571q != yukVar) {
                a2s0Var = a2s0Var2;
                objM24525a = objM96571q;
            }
            return yukVar;
        }
        if (i2 == 1) {
            z = qm11Var.f190010a;
            builderNewBuilder = qm11Var.f190012c;
            a2s0Var = qm11Var.f190011b;
            bga.m29073P(objM24525a);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = qm11Var.f190010a;
            bga.m29073P(objM24525a);
        }
        if (!((o2x0) objM24525a).f161171a.f149852O0) {
            objM24525a = null;
        }
        if (((o2x0) objM24525a) != null) {
            return Boolean.valueOf(z);
        }
        return null;
        SetProfilePrivacyRequest.Builder showFollows = builderNewBuilder.setUsername((String) objM24525a).setShowFollows(z);
        juy juyVarM1939p = FieldMask.m1939p();
        juyVarM1939p.m54349m("show_follows");
        SetProfilePrivacyRequest setProfilePrivacyRequest = (SetProfilePrivacyRequest) showFollows.setMask((FieldMask) juyVarM1939p.build()).build();
        qm11Var.f190011b = null;
        qm11Var.f190012c = null;
        qm11Var.f190010a = z;
        qm11Var.f190015f = 2;
        objM24525a = a2s0Var.m24525a(setProfilePrivacyRequest, qm11Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r9 == r5) goto L22;
     */
    @Override // p204p.sio
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo54021b(ibk ibkVar) {
        pm11 pm11Var;
        GetProfilePrivacyRequest.Builder builderNewBuilder;
        a2s0 a2s0Var;
        GetProfilePrivacyResponse getProfilePrivacyResponse;
        if (ibkVar instanceof pm11) {
            pm11Var = (pm11) ibkVar;
            int i = pm11Var.f178864e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pm11Var.f178864e = i - Integer.MIN_VALUE;
            } else {
                pm11Var = new pm11(this, ibkVar);
            }
        } else {
            pm11Var = new pm11(this, ibkVar);
        }
        Object objM24526b = pm11Var.f178862c;
        int i2 = pm11Var.f178864e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM24526b);
            builderNewBuilder = GetProfilePrivacyRequest.newBuilder();
            a2s0 a2s0Var2 = this.f200411a;
            pm11Var.f178860a = a2s0Var2;
            pm11Var.f178861b = builderNewBuilder;
            pm11Var.f178864e = 1;
            Object objM96571q = zn91.m96571q(this.f200412b, 1, null, pm11Var);
            if (objM96571q != yukVar) {
                a2s0Var = a2s0Var2;
                objM24526b = objM96571q;
            }
            return yukVar;
        }
        if (i2 == 1) {
            builderNewBuilder = pm11Var.f178861b;
            a2s0Var = pm11Var.f178860a;
            bga.m29073P(objM24526b);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM24526b);
        }
        if (!((o2x0) objM24526b).f161171a.f149852O0) {
            objM24526b = null;
        }
        o2x0 o2x0Var = (o2x0) objM24526b;
        if (o2x0Var == null || (getProfilePrivacyResponse = (GetProfilePrivacyResponse) o2x0Var.f161172b) == null) {
            return null;
        }
        return Boolean.valueOf(getProfilePrivacyResponse.getShowFollows());
        GetProfilePrivacyRequest getProfilePrivacyRequest = (GetProfilePrivacyRequest) builderNewBuilder.setUsername((String) objM24526b).build();
        pm11Var.f178860a = null;
        pm11Var.f178861b = null;
        pm11Var.f178864e = 2;
        objM24526b = a2s0Var.m24526b(getProfilePrivacyRequest, pm11Var);
    }
}
