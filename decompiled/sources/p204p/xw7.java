package p204p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xw7 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        xul0 xul0Var = (xul0) obj;
        vw7 vw7Var = (vw7) obj2;
        boolean z = vw7Var instanceof tw7;
        rw7 rw7Var = rw7.f203286a;
        if (z) {
            return Next.m15605a(Effects.m15571a(rw7Var));
        }
        if (vw7Var instanceof uw7) {
            return Next.m15606h(xul0.m92201d(((uw7) vw7Var).f234591a));
        }
        if (vw7Var instanceof sw7) {
            return ((Boolean) xul0Var.mo49284i(cx7.f42931b).mo49280e(Boolean.FALSE)).booleanValue() ? Next.m15605a(Effects.m15571a(rw7Var)) : Next.m15608j();
        }
        throw new NoWhenBranchMatchedException();
    }
}
