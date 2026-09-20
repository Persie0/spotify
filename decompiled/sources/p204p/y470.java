package p204p;

import com.spotify.genalphagraduation.graduationapi.KidsGraduationException;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class y470 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f269089a;

    public y470(String str) {
        this.f269089a = str;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        f570 f570Var = (f570) obj;
        if (f570Var instanceof d570) {
            ((d570) f570Var).f45360a.m82202b(sh7.f209119L0, 0);
            return Single.just(this.f269089a);
        }
        if (f570Var.equals(e570.f56311a)) {
            return Single.error(new KidsGraduationException.LogoutUserException("Failed to fetch logged-in dependencies", null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
