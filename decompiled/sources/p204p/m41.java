package p204p;

import android.content.Intent;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m41 implements Update {

    /* JADX INFO: renamed from: a */
    public static final m41 f139790a = new m41();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        o41 o41Var = (o41) obj;
        i41 i41Var = (i41) obj2;
        if (i41Var instanceof d41) {
            return Next.m15607i(o41.m66224c(o41Var, null, 2, 247), Collections.singleton(new p31(((d41) i41Var).f45046a)));
        }
        if (i41Var instanceof f41) {
            return Next.m15606h(o41.m66224c(o41Var, ((f41) i41Var).f65630a, 0, 251));
        }
        if (i41Var instanceof e41) {
            return Next.m15607i(o41.m66224c(o41Var, null, 1, 247), Collections.singleton(t31.f216686b));
        }
        if (i41Var instanceof g41) {
            Intent intent = o41Var.f161507c;
            return intent != null ? Next.m15605a(Collections.singleton(new u31(intent))) : Next.m15608j();
        }
        if (!(i41Var instanceof h41)) {
            throw new NoWhenBranchMatchedException();
        }
        h41 h41Var = (h41) i41Var;
        boolean z = h41Var.f87389f;
        String str = h41Var.f87388e;
        h9o0 h9o0Var = h41Var.f87386c;
        String str2 = h41Var.f87385b;
        String str3 = h41Var.f87384a;
        boolean z2 = h41Var.f87387d;
        boolean z3 = h9o0Var instanceof e9o0;
        r31 r31Var = r31.f195401b;
        if (z3) {
            return Next.m15607i(o41.m66224c(o41Var, null, 2, 247), Collections.singleton(r31Var));
        }
        if (h9o0Var instanceof g9o0) {
            if (z2) {
                return Next.m15607i(o41.m66224c(o41Var, null, 2, 247), Collections.singleton(new v31(str3, str2, str)));
            }
            return Next.m15607i(o41.m66224c(o41Var, null, 2, 247), Collections.singleton(z ? new s31(str) : new p31(str)));
        }
        if (!(h9o0Var instanceof f9o0)) {
            if (h9o0Var instanceof c9o0) {
                return z2 ? Next.m15607i(o41.m66224c(o41Var, null, 2, 247), Collections.singleton(new v31(str3, str2, str))) : Next.m15607i(o41.m66224c(o41Var, null, 2, 247), Collections.singleton(new q31(((c9o0) h9o0Var).mo28528c(), str)));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (((f9o0) h9o0Var).f67309a) {
            return Next.m15607i(o41.m66224c(o41Var, null, 2, 247), Collections.singleton(r31Var));
        }
        if (z2) {
            return Next.m15607i(o41.m66224c(o41Var, null, 2, 247), Collections.singleton(new v31(str3, str2, str)));
        }
        return Next.m15607i(o41.m66224c(o41Var, null, 2, 247), Collections.singleton(z ? new s31(str) : new p31(str)));
    }
}
