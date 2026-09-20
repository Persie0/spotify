package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yv10 implements Update {

    /* JADX INFO: renamed from: a */
    public static final yv10 f276532a = new yv10();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        aw10 aw10Var = (aw10) obj;
        wv10 wv10Var = (wv10) obj2;
        String str = aw10Var.f20339a;
        if (wv10Var.equals(vv10.f245117a)) {
            return Next.m15607i(aw10.m27274c(aw10Var, false, false, true, false, 3199), Collections.singleton(new ov10(str, true)));
        }
        if (wv10Var.equals(qv10.f192854a)) {
            return Next.m15607i(aw10.m27274c(aw10Var, false, false, false, true, 2687), Collections.singleton(new ov10(str, false)));
        }
        if (wv10Var instanceof rv10) {
            return Next.m15607i(aw10.m27274c(aw10Var, false, false, false, false, 2559), Collections.singleton(new mv10(aw10Var.f20340b, ((rv10) wv10Var).f202976a)));
        }
        if (wv10Var instanceof sv10) {
            boolean z = ((sv10) wv10Var).f214294a;
            return Next.m15606h(aw10.m27274c(aw10Var, z, !z, false, false, 2175));
        }
        if (wv10Var.equals(tv10.f224026a)) {
            return Next.m15606h(aw10.m27274c(aw10Var, false, false, false, false, 3711));
        }
        if (wv10Var.equals(uv10.f234310a)) {
            return Next.m15605a(Collections.singleton(new nv10(aw10Var.f20338Y)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
