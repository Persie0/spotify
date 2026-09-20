package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class act0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final act0 f14434a = new act0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        fct0 fct0Var = (fct0) obj;
        zbt0 zbt0Var = (zbt0) obj2;
        if (zbt0Var.equals(wbt0.f249852a)) {
            return Next.m15605a(Collections.singleton(new tbt0(fct0Var.f68256a)));
        }
        boolean zEquals = zbt0Var.equals(xbt0.f260005a);
        sbt0 sbt0Var = sbt0.f207580c;
        ubt0 ubt0Var = ubt0.f228887c;
        if (zEquals) {
            return fct0Var.f68256a ? Next.m15605a(Collections.singleton(ubt0Var)) : Next.m15605a(Collections.singleton(sbt0Var));
        }
        if (zbt0Var.equals(ybt0.f271244a)) {
            return fct0Var.f68256a ? Next.m15605a(Collections.singleton(ubt0Var)) : Next.m15605a(Collections.singleton(sbt0Var));
        }
        throw new NoWhenBranchMatchedException();
    }
}
