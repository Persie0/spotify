package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tc50 implements Update {

    /* JADX INFO: renamed from: a */
    public static final tc50 f219025a = new tc50();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        ou41 ou41Var = (ou41) obj;
        ouw ouwVar = (ouw) obj2;
        if (ou41Var.equals(tt41.f223519a) || ou41Var.equals(cu41.f42048a) || ou41Var.equals(dt41.f52726a) || (ou41Var instanceof bt41) || (ou41Var instanceof ft41) || (ou41Var instanceof us41) || (ou41Var instanceof au41) || (ou41Var instanceof zt41)) {
            return Next.m15608j();
        }
        if (!(ou41Var instanceof et41)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!ouwVar.equals(ouw.f170360a)) {
            throw new NoWhenBranchMatchedException();
        }
        et41 et41Var = (et41) ou41Var;
        return et41Var.f62619c ? Next.m15605a(Collections.singleton(new iht(et41Var.f62617a, null))) : Next.m15605a(Collections.singleton(new pet()));
    }
}
