package p204p;

import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$AuthenticateCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateRequest$AuthenticateRequest;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class i570 {
    /* JADX INFO: renamed from: a */
    public static final EsAuthenticateRequest$AuthenticateRequest m49766a(eg7 eg7Var) {
        diw diwVarM3560s = EsAuthenticateRequest$AuthenticateRequest.m3560s();
        if (!(eg7Var instanceof eg7)) {
            throw new NoWhenBranchMatchedException();
        }
        rhw rhwVarM3497A = EsAuthenticateCredentials$AuthenticateCredentials.m3497A();
        upw upwVarM7486r = EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.m7486r();
        byte[] bArr = eg7Var.f59235b;
        cva cvaVar = gva.f84678b;
        upwVarM7486r.m83730m(gva.m45886d(0, bArr, bArr.length));
        upwVarM7486r.m83731q(eg7Var.f59234a);
        rhwVarM3497A.m75522B(upwVarM7486r);
        diwVarM3560s.m36128m((EsAuthenticateCredentials$AuthenticateCredentials) rhwVarM3497A.build());
        return (EsAuthenticateRequest$AuthenticateRequest) diwVarM3560s.build();
    }
}
