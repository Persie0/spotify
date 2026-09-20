package p204p;

import com.google.protobuf.AbstractC0269h;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfo;
import com.spotify.libs.connect.events.proto.AuthStorageResultNonAuth;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ui7 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final si7 f230606a;

    /* JADX INFO: renamed from: b */
    public final k7x f230607b;

    /* JADX INFO: renamed from: c */
    public final BehaviorSubject f230608c = BehaviorSubject.m23796g(new cm7(sh7.f209127b));

    public ui7(si7 si7Var, k7x k7xVar) {
        this.f230606a = si7Var;
        this.f230607b = k7xVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m83184a(wi7 wi7Var, boolean z) {
        if (z) {
            mi7 mi7Var = (mi7) this.f230606a.f209366b.getValue();
            mi7Var.getClass();
            eg7 eg7Var = wi7Var.f251544c;
            if (!(eg7Var instanceof eg7)) {
                throw new NoWhenBranchMatchedException();
            }
            phw phwVarM7480q = EsAuthBlob$AuthBlob.m7480q();
            upw upwVarM7486r = EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.m7486r();
            byte[] bArr = eg7Var.f59235b;
            cva cvaVar = gva.f84678b;
            upwVarM7486r.m83730m(gva.m45886d(0, bArr, bArr.length));
            upwVarM7486r.m83731q(eg7Var.f59234a);
            phwVarM7480q.m70051m((EsUnencryptedStoredCredentials$UnencryptedStoredCredentials) upwVarM7486r.build());
            AbstractC0269h abstractC0269hBuild = phwVarM7480q.build();
            wj50.m88279p(abstractC0269hBuild);
            zow zowVarM7505r = EsStoredUserInfo$StoredUserInfo.m7505r();
            zowVarM7505r.m96642q(wi7Var.f251542a);
            zowVarM7505r.m96641m((EsAuthBlob$AuthBlob) abstractC0269hBuild);
            EsStoredUserInfo$StoredUserInfo esStoredUserInfo$StoredUserInfo = (EsStoredUserInfo$StoredUserInfo) zowVarM7505r.build();
            r67 r67Var = mi7Var.f143951a;
            wj50.m88279p(esStoredUserInfo$StoredUserInfo);
            qi7 qi7Var = (qi7) r67Var.m74846f(esStoredUserInfo$StoredUserInfo).map(new a7j0(mi7Var)).blockingGet();
            if (w4u0.f247891b.mo84662b() >= 0.99d) {
                boolean z2 = qi7Var instanceof pi7;
                k7x k7xVar = this.f230607b;
                if (z2) {
                    qre0 qre0Var = k7xVar.f120207b;
                    ri7 ri7VarM12649p = AuthStorageResultNonAuth.m12649p();
                    ri7VarM12649p.m75581q(true);
                    qre0Var.m73616a(ri7VarM12649p.build());
                } else {
                    if (!(qi7Var instanceof oi7)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qre0 qre0Var2 = k7xVar.f120207b;
                    ri7 ri7VarM12649p2 = AuthStorageResultNonAuth.m12649p();
                    ri7VarM12649p2.m75581q(false);
                    ri7VarM12649p2.m75580m(((oi7) qi7Var).m67003a());
                    qre0Var2.m73616a(ri7VarM12649p2.build());
                }
            }
        }
        this.f230608c.onNext(new am7(wi7Var));
    }

    @Override // p204p.hgm
    public final void shutdown() {
        this.f230608c.onNext(new cm7(sh7.f209133h));
        Logger.m3969e("AuthTriggerService shutdown", new Object[0]);
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
