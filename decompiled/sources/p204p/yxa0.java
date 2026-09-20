package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yxa0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final yxa0 f277188a = new yxa0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        if (((wxa0) obj2) instanceof wxa0) {
            return Next.m15605a(Collections.singleton(txa0.f224631a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
