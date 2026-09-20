package p204p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class jak0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final jak0 f110480a = new jak0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        pak0 pak0Var = (pak0) obj;
        e9k0 e9k0Var = (e9k0) obj2;
        if (e9k0Var instanceof u8k0) {
            return Next.m15605a(Effects.m15571a(new r8k0(((u8k0) e9k0Var).f227967a)));
        }
        if (e9k0Var instanceof w8k0) {
            return Next.m15605a(Effects.m15571a(new s8k0(((w8k0) e9k0Var).f248941a)));
        }
        if (e9k0Var instanceof a9k0) {
            return Next.m15605a(Effects.m15571a(new s8k0(((a9k0) e9k0Var).f13591a)));
        }
        if (e9k0Var instanceof b9k0) {
            return Next.m15606h(pak0.m69492a(pak0Var, ((b9k0) e9k0Var).f24963a, null, null, false, false, false, 62));
        }
        if (e9k0Var instanceof x8k0) {
            return Next.m15606h(pak0.m69492a(pak0Var, null, ((x8k0) e9k0Var).f259171a, null, false, false, false, 61));
        }
        if (e9k0Var instanceof v8k0) {
            return Next.m15606h(pak0.m69492a(pak0Var, null, null, ((v8k0) e9k0Var).f238597a, false, false, false, 59));
        }
        if (e9k0Var instanceof z8k0) {
            return Next.m15606h(pak0.m69492a(pak0Var, null, null, null, false, false, ((z8k0) e9k0Var).f280493a, 31));
        }
        if (e9k0Var instanceof y8k0) {
            boolean z = ((y8k0) e9k0Var).f270310a;
            return Next.m15606h(pak0.m69492a(pak0Var, null, null, null, z, z, false, 39));
        }
        if (e9k0Var instanceof c9k0) {
            return Next.m15605a(Effects.m15571a(new t8k0(((c9k0) e9k0Var).f35579a)));
        }
        if (e9k0Var instanceof d9k0) {
            return Next.m15606h(pak0.m69492a(pak0Var, null, null, null, false, ((d9k0) e9k0Var).f46850a, false, 47));
        }
        throw new NoWhenBranchMatchedException();
    }
}
