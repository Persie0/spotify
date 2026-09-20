package p204p;

import com.spotify.playlistmixing.endpoints.GetAutoTransitionUriError;
import com.spotify.playlistmixing.proto.StoreTransitionRequest;
import com.spotify.playlistmixing.proto.StoreTransitionResponse;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class lrf0 implements jrf0 {

    /* JADX INFO: renamed from: a */
    public final mrf0 f136304a;

    /* JADX INFO: renamed from: b */
    public final r991 f136305b;

    public lrf0(mrf0 mrf0Var, r991 r991Var) {
        this.f136304a = mrf0Var;
        this.f136305b = r991Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Serializable m59802a(String str, String str2, b791 b791Var, ibk ibkVar) {
        krf0 krf0Var;
        if (ibkVar instanceof krf0) {
            krf0Var = (krf0) ibkVar;
            int i = krf0Var.f125639c;
            if ((i & Integer.MIN_VALUE) != 0) {
                krf0Var.f125639c = i - Integer.MIN_VALUE;
            } else {
                krf0Var = new krf0(this, ibkVar);
            }
        } else {
            krf0Var = new krf0(this, ibkVar);
        }
        Object objM96567o = krf0Var.f125637a;
        int i2 = krf0Var.f125639c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                f951 f951VarM19437q = StoreTransitionRequest.m19437q();
                f951VarM19437q.m41052q(str);
                f951VarM19437q.m41051m(l6l.m58361j(str2));
                this.f136305b.getClass();
                f951VarM19437q.m41053r(r991.m75018c(b791Var));
                StoreTransitionRequest storeTransitionRequest = (StoreTransitionRequest) f951VarM19437q.build();
                mrf0 mrf0Var = this.f136304a;
                wj50.m88279p(storeTransitionRequest);
                Single<StoreTransitionResponse> singleTimeout = mrf0Var.m62625a(storeTransitionRequest).timeout(5L, TimeUnit.SECONDS);
                krf0Var.f125639c = 1;
                objM96567o = zn91.m96567o(singleTimeout, krf0Var);
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
            return ((StoreTransitionResponse) objM96567o).m19438n();
        } catch (Exception unused) {
            return new c6x0(GetAutoTransitionUriError.GetAutoTransitionUriFailed.f6465a);
        }
    }
}
