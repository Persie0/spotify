package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vwk implements Update {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        xwk xwkVar = (xwk) obj;
        twk twkVar = (twk) obj2;
        if (twkVar instanceof swk) {
            String str = ((swk) twkVar).f214681a;
            owk owkVar = xwkVar.f266696a;
            return Next.m15606h(xwk.m92291c(xwkVar, str, k8f0.m55741a(str, owkVar.f170730d, owkVar.f170729c), 1));
        }
        if (twkVar instanceof rwk) {
            return Next.m15605a(Collections.singleton(new pwk(((rwk) twkVar).f203363a)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
