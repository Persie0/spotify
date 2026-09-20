package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class gpp implements Update {

    /* JADX INFO: renamed from: a */
    public static final gpp f83229a = new gpp();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        wuw wuwVar = (wuw) obj2;
        wj50.m88279p(wuwVar);
        if (wuwVar instanceof wuw) {
            return Next.m15605a(Collections.singleton(new yet(wuwVar.f255287a)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
