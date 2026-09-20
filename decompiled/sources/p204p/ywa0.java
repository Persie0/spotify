package p204p;

import android.content.Intent;
import com.comscore.streaming.ContentFeedType;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ywa0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final ywa0 f276937a = new ywa0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        axa0 axa0Var = (axa0) obj;
        wwa0 wwa0Var = (wwa0) obj2;
        if (wwa0Var.equals(rwa0.f203313a)) {
            return Next.m15605a(Collections.singleton(ewa0.f63465e));
        }
        if (wwa0Var instanceof vwa0) {
            vwa0 vwa0Var = (vwa0) wwa0Var;
            return axa0Var.f20827i ? Next.m15606h(axa0.m27371c(axa0Var, null, 0, 3, false, 447)) : Next.m15607i(axa0.m27371c(axa0Var, null, 2, 0, false, 479), Collections.singleton(new dwa0(vwa0Var.f245446a, vwa0Var.f245448c)));
        }
        if (wwa0Var instanceof qwa0) {
            return Next.m15606h(axa0.m27371c(axa0Var, ((qwa0) wwa0Var).f193218a, 0, 1, false, ContentFeedType.EAST_SD));
        }
        if (wwa0Var.equals(pwa0.f181975a)) {
            return Next.m15606h(axa0.m27371c(axa0Var, null, 1, 2, false, 287));
        }
        if (wwa0Var.equals(uwa0.f234619a)) {
            Intent intent = axa0Var.f20823e;
            return intent != null ? Next.m15605a(Collections.singleton(new fwa0(intent))) : Next.m15608j();
        }
        if (!(wwa0Var instanceof twa0)) {
            if (wwa0Var.equals(swa0.f214633a)) {
                return Next.m15606h(axa0.m27371c(axa0Var, null, 0, 1, false, 319));
            }
            throw new NoWhenBranchMatchedException();
        }
        twa0 twa0Var = (twa0) wwa0Var;
        String str = twa0Var.f224390a;
        String str2 = twa0Var.f224392c;
        axa0 axa0VarM27371c = axa0.m27371c(axa0Var, null, 2, 0, true, 351);
        return axa0VarM27371c.f20827i ? Next.m15606h(axa0.m27371c(axa0VarM27371c, null, 0, 3, false, 447)) : Next.m15607i(axa0.m27371c(axa0VarM27371c, null, 2, 0, false, 479), Collections.singleton(new dwa0(str, str2)));
    }
}
