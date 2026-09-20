package p204p;

import com.spotify.devicelocation.consent.ConsentDataLoaderError;
import com.spotify.usergeopoints.p176v1.ConsentWriteResponse;
import com.spotify.usergeopoints.p176v1.GetConsentResponse;
import com.spotify.usergeopoints.p176v1.GrantConsentRequest;
import com.spotify.usergeopoints.p176v1.RevokeConsentRequest;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class w4j implements t4j {

    /* JADX INFO: renamed from: a */
    public final hqa1 f247835a;

    /* JADX INFO: renamed from: b */
    public final n7r f247836b;

    /* JADX INFO: renamed from: c */
    public final zv41 f247837c = jag1.m52819d(a5j.f12525b);

    public w4j(hqa1 hqa1Var, n7r n7rVar) {
        this.f247835a = hqa1Var;
        this.f247836b = n7rVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Serializable m87199a(String str, ibk ibkVar) {
        u4j u4jVar;
        Serializable c6x0Var;
        if (ibkVar instanceof u4j) {
            u4jVar = (u4j) ibkVar;
            int i = u4jVar.f226737d;
            if ((i & Integer.MIN_VALUE) != 0) {
                u4jVar.f226737d = i - Integer.MIN_VALUE;
            } else {
                u4jVar = new u4j(this, ibkVar);
            }
        } else {
            u4jVar = new u4j(this, ibkVar);
        }
        Object objM48204c = u4jVar.f226735b;
        int i2 = u4jVar.f226737d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM48204c);
                hqa1 hqa1Var = this.f247835a;
                u4jVar.f226734a = str;
                u4jVar.f226737d = 1;
                objM48204c = hqa1Var.m48204c(u4jVar);
                yuk yukVar = yuk.f276404a;
                if (objM48204c == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = u4jVar.f226734a;
                bga.m29073P(objM48204c);
            }
            c6x0Var = twg1.m81745m(((GetConsentResponse) objM48204c).m22100n());
            zv41 zv41Var = this.f247837c;
            zv41Var.getClass();
            zv41Var.m97091m(null, c6x0Var);
        } catch (CancellationException e) {
            throw e;
        } catch (HttpException e2) {
            c6x0Var = new c6x0(new ConsentDataLoaderError.BackendError(e2.f288164a, e2.f288165b));
        } catch (Throwable unused) {
            c6x0Var = new c6x0(ConsentDataLoaderError.Unknown.f3566a);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        n7r n7rVar = this.f247836b;
        if (thM77348a == null) {
            n7rVar.m63806a((a5j) c6x0Var, 200, str);
        } else {
            ConsentDataLoaderError.BackendError backendError = thM77348a instanceof ConsentDataLoaderError.BackendError ? (ConsentDataLoaderError.BackendError) thM77348a : null;
            n7rVar.m63806a(null, backendError != null ? backendError.getF3564a() : -1, str);
        }
        return c6x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m87200b(String str, String str2, ibk ibkVar, boolean z) {
        v4j v4jVar;
        Serializable c6x0Var;
        ConsentWriteResponse consentWriteResponse;
        if (ibkVar instanceof v4j) {
            v4jVar = (v4j) ibkVar;
            int i = v4jVar.f237188e;
            if ((i & Integer.MIN_VALUE) != 0) {
                v4jVar.f237188e = i - Integer.MIN_VALUE;
            } else {
                v4jVar = new v4j(this, ibkVar);
            }
        } else {
            v4jVar = new v4j(this, ibkVar);
        }
        Object objM48203b = v4jVar.f237186c;
        int i2 = v4jVar.f237188e;
        try {
            if (i2 == 0) {
                bga.m29073P(objM48203b);
                hqa1 hqa1Var = this.f247835a;
                yuk yukVar = yuk.f276404a;
                if (z) {
                    gw10 gw10VarM22103p = GrantConsentRequest.m22103p();
                    if (str2 != null) {
                        gw10VarM22103p.m45904m(str2);
                    }
                    GrantConsentRequest grantConsentRequest = (GrantConsentRequest) gw10VarM22103p.build();
                    wj50.m88279p(grantConsentRequest);
                    v4jVar.f237185b = str;
                    v4jVar.f237184a = z;
                    v4jVar.f237188e = 1;
                    objM48203b = hqa1Var.m48202a(grantConsentRequest, v4jVar);
                    if (objM48203b == yukVar) {
                    }
                    consentWriteResponse = (ConsentWriteResponse) objM48203b;
                } else {
                    qdx0 qdx0VarM22106p = RevokeConsentRequest.m22106p();
                    if (str2 != null) {
                        qdx0VarM22106p.m72600m(str2);
                    }
                    RevokeConsentRequest revokeConsentRequest = (RevokeConsentRequest) qdx0VarM22106p.build();
                    wj50.m88279p(revokeConsentRequest);
                    v4jVar.f237185b = str;
                    v4jVar.f237184a = z;
                    v4jVar.f237188e = 2;
                    objM48203b = hqa1Var.m48203b(revokeConsentRequest, v4jVar);
                }
                return yukVar;
            }
            if (i2 == 1) {
                z = v4jVar.f237184a;
                str = v4jVar.f237185b;
                bga.m29073P(objM48203b);
                consentWriteResponse = (ConsentWriteResponse) objM48203b;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = v4jVar.f237184a;
                str = v4jVar.f237185b;
                bga.m29073P(objM48203b);
                consentWriteResponse = (ConsentWriteResponse) objM48203b;
            }
            c6x0Var = twg1.m81745m(consentWriteResponse.m22099n());
            zv41 zv41Var = this.f247837c;
            zv41Var.getClass();
            zv41Var.m97091m(null, c6x0Var);
        } catch (CancellationException e) {
            throw e;
        } catch (HttpException e2) {
            c6x0Var = new c6x0(new ConsentDataLoaderError.BackendError(e2.f288164a, e2.f288165b));
        } catch (Throwable unused) {
            c6x0Var = new c6x0(ConsentDataLoaderError.Unknown.f3566a);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        n7r n7rVar = this.f247836b;
        if (thM77348a == null) {
            n7rVar.m63807b(z, (a5j) c6x0Var, 200, str);
        } else {
            ConsentDataLoaderError.BackendError backendError = thM77348a instanceof ConsentDataLoaderError.BackendError ? (ConsentDataLoaderError.BackendError) thM77348a : null;
            n7rVar.m63807b(z, null, backendError != null ? backendError.getF3564a() : -1, str);
        }
        return c6x0Var;
    }
}
