package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class usb0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final usb0 f233580a = new usb0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        wsb0 wsb0Var = (wsb0) obj;
        ssb0 ssb0Var = (ssb0) obj2;
        boolean zEquals = ssb0Var.equals(psb0.f180806a);
        csb0 csb0Var = csb0.f41500c;
        if (zEquals) {
            return Next.m15605a(Collections.singleton(csb0Var));
        }
        if (ssb0Var instanceof qsb0) {
            return Next.m15605a(Collections.singleton(new esb0(((qsb0) ssb0Var).f192050a)));
        }
        if (ssb0Var.equals(rsb0.f202250a)) {
            return Next.m15605a(Collections.singleton(new dsb0(wsb0Var.f254573a)));
        }
        if (ssb0Var instanceof osb0) {
            return Next.m15605a(Collections.singleton(new fsb0(((osb0) ssb0Var).f168789a)));
        }
        if (ssb0Var.equals(nsb0.f157736a)) {
            return Next.m15605a(Collections.singleton(csb0Var));
        }
        throw new NoWhenBranchMatchedException();
    }
}
