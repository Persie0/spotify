package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class sat0 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        qat0 qat0Var = (qat0) obj2;
        boolean z = ((vat0) obj).f239328a;
        boolean z2 = qat0Var instanceof mat0;
        iat0 iat0Var = iat0.f100347c;
        gat0 gat0Var = gat0.f78094c;
        if (z2) {
            return Next.m15605a(z ? Collections.singleton(iat0Var) : Collections.singleton(gat0Var));
        }
        if (qat0Var instanceof lat0) {
            return Next.m15605a(Collections.singleton(new hat0(z)));
        }
        if (qat0Var instanceof pat0) {
            return Next.m15605a(z ? Collections.singleton(iat0Var) : Collections.singleton(gat0Var));
        }
        if (qat0Var instanceof kat0) {
            return !((kat0) qat0Var).f120962a ? Next.m15605a(Collections.singleton(gat0Var)) : Next.m15608j();
        }
        if ((qat0Var instanceof oat0) || (qat0Var instanceof nat0)) {
            return Next.m15605a(Collections.singleton(gat0Var));
        }
        throw new NoWhenBranchMatchedException();
    }
}
