package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class sh91 implements Update {

    /* JADX INFO: renamed from: a */
    public static final sh91 f209150a = new sh91();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        svh0 svh0Var = (svh0) obj;
        if (((q0x) obj2).equals(q0x.f184129a)) {
            return Next.m15607i(svh0Var, Collections.singleton(wht.f251442a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
