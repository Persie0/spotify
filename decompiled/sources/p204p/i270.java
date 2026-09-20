package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i270 implements Update {

    /* JADX INFO: renamed from: a */
    public static final i270 f97761a = new i270();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        k270 k270Var = (k270) obj;
        h270 h270Var = (h270) obj2;
        if (h270Var instanceof e270) {
            return Next.m15606h(k270.m55152c(k270Var, new fzm0(((e270) h270Var).f55382a), null, 62));
        }
        if (h270Var instanceof g270) {
            return Next.m15606h(k270.m55152c(k270Var, null, new fzm0(((g270) h270Var).f75860a), 61));
        }
        if (h270Var instanceof d270) {
            return Next.m15605a(Collections.singleton(new a270(k270Var.f118534a, k270Var.f118535b, k270Var.f118536c, ((d270) h270Var).f44490a)));
        }
        if (h270Var instanceof f270) {
            return Next.m15605a(Collections.singleton(new b270(((f270) h270Var).f65124a)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
