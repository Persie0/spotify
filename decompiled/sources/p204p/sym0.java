package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sym0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final sym0 f215292a = new sym0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        uym0 uym0Var = (uym0) obj;
        rym0 rym0Var = (rym0) obj2;
        String str = uym0Var.f235339c;
        if (rym0Var instanceof mym0) {
            String str2 = ((mym0) rym0Var).f148484a;
            return uym0Var.f235340d == null ? Next.m15607i(uym0.m84274c(uym0Var, null, str2, 11), Collections.singleton(new dym0(str2, null))) : Next.m15606h(uym0.m84274c(uym0Var, by91.f32116a, str2, 9));
        }
        if (rym0Var instanceof pym0) {
            pym0 pym0Var = (pym0) rym0Var;
            if (str != null) {
                return Next.m15605a(Collections.singleton(new dym0(str, pym0Var.f183437a)));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (rym0Var instanceof nym0) {
            nym0 nym0Var = (nym0) rym0Var;
            if (str != null) {
                return Next.m15605a(Collections.singleton(new cym0(str, nym0Var.f159837a)));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (rym0Var.equals(lym0.f138076a)) {
            return Next.m15606h(uym0.m84274c(uym0Var, ay91.f21170a, null, 13));
        }
        if (rym0Var.equals(qym0.f193947a)) {
            return Next.m15607i(uym0.m84274c(uym0Var, ey91.f63995a, null, 13), Collections.singleton(bym0.f32273c));
        }
        if (rym0Var.equals(oym0.f171804a)) {
            return Next.m15605a(Collections.singleton(aym0.f21269c));
        }
        throw new NoWhenBranchMatchedException();
    }
}
