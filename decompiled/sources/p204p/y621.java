package p204p;

import com.spotify.signup.signup.p150v2.proto.ClientInfo;
import com.spotify.signup.signup.p150v2.proto.Tracking;
import com.spotify.signup.signup.p150v2.proto.ValidateAccountRequest;
import com.spotify.signup.signup.p150v2.proto.ValidateAccountResponse;
import com.spotify.signup.signup.p150v2.proto.ValidationAccountField;
import io.reactivex.rxjava3.core.Observable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class y621 {

    /* JADX INFO: renamed from: a */
    public final u621 f269591a;

    /* JADX INFO: renamed from: b */
    public final String f269592b;

    /* JADX INFO: renamed from: c */
    public final String f269593c;

    /* JADX INFO: renamed from: d */
    public final dt81 f269594d;

    /* JADX INFO: renamed from: e */
    public final wg61 f269595e = new wg61(new cy11(this, 4));

    /* JADX INFO: renamed from: f */
    public final wg61 f269596f = new wg61(aa11.f13710N0);

    public y621(u621 u621Var, String str, String str2, dt81 dt81Var) {
        this.f269591a = u621Var;
        this.f269592b = str;
        this.f269593c = str2;
        this.f269594d = dt81Var;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m92857a(t2b1 t2b1Var, String str) {
        r2b1 r2b1VarM21417p = ValidationAccountField.m21417p();
        r2b1VarM21417p.m74517m(t2b1Var.f216480a);
        r2b1VarM21417p.m74518q(str);
        ValidationAccountField validationAccountField = (ValidationAccountField) r2b1VarM21417p.build();
        g2b1 g2b1VarM21412r = ValidateAccountRequest.m21412r();
        g2b1VarM21412r.m43386m(validationAccountField);
        g2b1VarM21412r.m43387q((ClientInfo) this.f269595e.getValue());
        g2b1VarM21412r.m43388r((Tracking) this.f269596f.getValue());
        ValidateAccountRequest validateAccountRequest = (ValidateAccountRequest) g2b1VarM21412r.build();
        wj50.m88279p(validateAccountRequest);
        Observable<ValidateAccountResponse> observable = this.f269591a.m82431a(validateAccountRequest).onErrorResumeNext(new vr11(ValidateAccountResponse.parser(), 2)).toObservable();
        int iOrdinal = t2b1Var.ordinal();
        if (iOrdinal == 0) {
            return observable.map(new wah1(str, 10));
        }
        if (iOrdinal == 1) {
            return observable.map(onq0.f167318M0);
        }
        if (iOrdinal == 2) {
            return observable.map(mmq0.f145201N0);
        }
        throw new NoWhenBranchMatchedException();
    }
}
