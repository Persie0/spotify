package p204p;

import com.google.protobuf.FieldMask;
import com.spotify.profileprivacy.proto.p132v1.GetProfilePrivacyRequest;
import com.spotify.profileprivacy.proto.p132v1.GetProfilePrivacyResponse;
import com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequest;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes10.dex */
public final class jq11 implements gq11, sio {

    /* JADX INFO: renamed from: a */
    public final a2s0 f114765a;

    /* JADX INFO: renamed from: b */
    public final Observable f114766b;

    /* JADX INFO: renamed from: c */
    public final qzn f114767c;

    /* JADX INFO: renamed from: d */
    public final fnc f114768d;

    public jq11(a2s0 a2s0Var, Observable observable) {
        this.f114765a = a2s0Var;
        this.f114766b = observable;
        qzn qznVar = new qzn(this);
        this.f114767c = qznVar;
        this.f114768d = (fnc) qznVar.f194231d;
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
        iq11 iq11Var;
        SetProfilePrivacyRequest.Builder builderNewBuilder;
        a2s0 a2s0Var;
        if (ibkVar instanceof iq11) {
            iq11Var = (iq11) ibkVar;
            int i = iq11Var.f104608f;
            if ((i & Integer.MIN_VALUE) != 0) {
                iq11Var.f104608f = i - Integer.MIN_VALUE;
            } else {
                iq11Var = new iq11(this, ibkVar);
            }
        } else {
            iq11Var = new iq11(this, ibkVar);
        }
        Object objM24525a = iq11Var.f104606d;
        int i2 = iq11Var.f104608f;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM24525a);
            builderNewBuilder = SetProfilePrivacyRequest.newBuilder();
            a2s0 a2s0Var2 = this.f114765a;
            iq11Var.f104604b = a2s0Var2;
            iq11Var.f104605c = builderNewBuilder;
            iq11Var.f104603a = z;
            iq11Var.f104608f = 1;
            Object objM96571q = zn91.m96571q(this.f114766b, 1, null, iq11Var);
            if (objM96571q != yukVar) {
                a2s0Var = a2s0Var2;
                objM24525a = objM96571q;
            }
            return yukVar;
        }
        if (i2 == 1) {
            z = iq11Var.f104603a;
            builderNewBuilder = iq11Var.f104605c;
            a2s0Var = iq11Var.f104604b;
            bga.m29073P(objM24525a);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = iq11Var.f104603a;
            bga.m29073P(objM24525a);
        }
        if (!((o2x0) objM24525a).f161171a.f149852O0) {
            objM24525a = null;
        }
        if (((o2x0) objM24525a) != null) {
            return Boolean.valueOf(z);
        }
        return null;
        SetProfilePrivacyRequest.Builder showPublishedPlaylists = builderNewBuilder.setUsername((String) objM24525a).setShowPublishedPlaylists(z);
        juy juyVarM1939p = FieldMask.m1939p();
        juyVarM1939p.m54349m("show_published_playlists");
        SetProfilePrivacyRequest setProfilePrivacyRequest = (SetProfilePrivacyRequest) showPublishedPlaylists.setMask((FieldMask) juyVarM1939p.build()).build();
        iq11Var.f104604b = null;
        iq11Var.f104605c = null;
        iq11Var.f104603a = z;
        iq11Var.f104608f = 2;
        objM24525a = a2s0Var.m24525a(setProfilePrivacyRequest, iq11Var);
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
        hq11 hq11Var;
        GetProfilePrivacyRequest.Builder builderNewBuilder;
        a2s0 a2s0Var;
        GetProfilePrivacyResponse getProfilePrivacyResponse;
        if (ibkVar instanceof hq11) {
            hq11Var = (hq11) ibkVar;
            int i = hq11Var.f93988e;
            if ((i & Integer.MIN_VALUE) != 0) {
                hq11Var.f93988e = i - Integer.MIN_VALUE;
            } else {
                hq11Var = new hq11(this, ibkVar);
            }
        } else {
            hq11Var = new hq11(this, ibkVar);
        }
        Object objM24526b = hq11Var.f93986c;
        int i2 = hq11Var.f93988e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM24526b);
            builderNewBuilder = GetProfilePrivacyRequest.newBuilder();
            a2s0 a2s0Var2 = this.f114765a;
            hq11Var.f93984a = a2s0Var2;
            hq11Var.f93985b = builderNewBuilder;
            hq11Var.f93988e = 1;
            Object objM96571q = zn91.m96571q(this.f114766b, 1, null, hq11Var);
            if (objM96571q != yukVar) {
                a2s0Var = a2s0Var2;
                objM24526b = objM96571q;
            }
            return yukVar;
        }
        if (i2 == 1) {
            builderNewBuilder = hq11Var.f93985b;
            a2s0Var = hq11Var.f93984a;
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
        return Boolean.valueOf(getProfilePrivacyResponse.getShowPublishedPlaylists());
        GetProfilePrivacyRequest getProfilePrivacyRequest = (GetProfilePrivacyRequest) builderNewBuilder.setUsername((String) objM24526b).build();
        hq11Var.f93984a = null;
        hq11Var.f93985b = null;
        hq11Var.f93988e = 2;
        objM24526b = a2s0Var.m24526b(getProfilePrivacyRequest, hq11Var);
    }
}
