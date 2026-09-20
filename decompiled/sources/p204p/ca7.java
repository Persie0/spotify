package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ca7 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        ga7 ga7Var = (ga7) obj;
        ba7 ba7Var = (ba7) obj2;
        x00 x00Var = ga7Var.f77986a.f101870f;
        ag1 ag1Var = ga7Var.f77990e;
        if (ba7Var instanceof z97) {
            return Next.m15605a(Collections.singleton(new x97(ag1Var, x00Var.f256716b)));
        }
        if (ba7Var instanceof aa7) {
            return Next.m15605a(Collections.singleton(new y97(ag1Var, x00Var.f256716b)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
