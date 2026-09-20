package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q8o0 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        w8o0 w8o0Var = (w8o0) obj;
        p8o0 p8o0Var = (p8o0) obj2;
        ctk0 ctk0Var = w8o0Var.f248974a;
        if (p8o0Var.equals(n8o0.f151572a)) {
            String str = w8o0Var.f248975b.f166878b;
            return str.equals("") ? Next.m15608j() : Next.m15605a(Collections.singleton(new l8o0(str)));
        }
        if (p8o0Var.equals(o8o0.f162841a)) {
            String str2 = ctk0Var.f41912h;
            if (str2 == null) {
                str2 = "";
            }
            return str2.equals("") ? Next.m15608j() : Next.m15605a(Collections.singleton(new k8o0(str2)));
        }
        if (!p8o0Var.equals(m8o0.f141102a)) {
            throw new NoWhenBranchMatchedException();
        }
        String str3 = ctk0Var.f41909e.f130612d;
        if (str3 == null) {
            str3 = "";
        }
        return str3.equals("") ? Next.m15608j() : Next.m15605a(Collections.singleton(new j8o0(str3)));
    }
}
