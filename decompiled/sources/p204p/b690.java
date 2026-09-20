package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b690 implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        f690 f690Var = (f690) obj;
        z590 z590Var = (z590) obj2;
        Set set = f690Var.f66327e;
        if (z590Var instanceof y590) {
            Set setM77305h0 = s601.m77305h0(((y590) z590Var).f269378a, f690Var.f66326d);
            f690 f690VarM40838a = f690.m40838a(f690Var, false, false, null, s601.m77309l0(set, setM77305h0), ContentType.SHORT_FORM_ON_DEMAND);
            if (setM77305h0.isEmpty()) {
                return Next.m15608j();
            }
            return (f690Var.f66325c || f690Var.f66324b) ? Next.m15606h(f690VarM40838a) : mzx.m63263c(f690VarM40838a);
        }
        boolean z = z590Var instanceof w590;
        if (z || (z590Var instanceof x590)) {
            f690 f690VarM40838a2 = f690.m40838a(f690Var, false, false, null, null, ContentType.USER_GENERATED_LIVE);
            if (z) {
                f690VarM40838a2 = f690.m40838a(f690VarM40838a2, false, false, s601.m77309l0(f690VarM40838a2.f66326d, ((w590) z590Var).f248033a), null, 119);
            }
            return (f690VarM40838a2.f66324b || f690VarM40838a2.f66327e.isEmpty()) ? Next.m15606h(f690VarM40838a2) : mzx.m63263c(f690VarM40838a2);
        }
        if (z590Var instanceof u590) {
            f690 f690VarM40838a3 = f690.m40838a(f690Var, false, false, null, null, 125);
            return (f690VarM40838a3.f66325c || f690VarM40838a3.f66327e.isEmpty()) ? Next.m15606h(f690VarM40838a3) : mzx.m63263c(f690VarM40838a3);
        }
        if (z590Var instanceof v590) {
            return Next.m15606h(f690.m40838a(f690Var, false, false, gbu.f78413a, null, 119));
        }
        if (z590Var instanceof t590) {
            return Next.m15606h(f690.m40838a(f690Var, false, false, null, s601.m77305h0(set, ((t590) z590Var).f217246a), ContentType.SHORT_FORM_ON_DEMAND));
        }
        throw new NoWhenBranchMatchedException();
    }
}
