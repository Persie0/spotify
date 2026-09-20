package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class iae0 implements Update {

    /* JADX INFO: renamed from: a */
    public static final iae0 f100241a = new iae0();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        hae0 hae0Var = (hae0) obj;
        gae0 gae0Var = (gae0) obj2;
        String str = hae0Var.f89201a;
        AbstractC1683ax abstractC1683ax = hae0Var.f89205e;
        if (gae0Var instanceof z9e0) {
            boolean z = ((z9e0) gae0Var).f280757a;
            if (abstractC1683ax instanceof C2665zw) {
                return Next.m15607i(hae0.m46930c(hae0Var, C2665zw.m97104c((C2665zw) abstractC1683ax, z), 0, 239), Collections.singleton(new q9e0(str, z)));
            }
            if (abstractC1683ax instanceof C2628yw) {
                return Next.m15607i(hae0.m46930c(hae0Var, C2628yw.m94771c((C2628yw) abstractC1683ax, z, false, false, ContentType.USER_GENERATED_LIVE), 0, 239), Collections.singleton(new o9e0(str, z)));
            }
            if (!(abstractC1683ax instanceof C2591xw)) {
                throw new NoWhenBranchMatchedException();
            }
            na6.m63957e("onExplicitContentToggleClicked is not supported for legacy managed accounts.");
            return Next.m15608j();
        }
        if (gae0Var instanceof y9e0) {
            boolean z2 = ((y9e0) gae0Var).f270580a;
            if (abstractC1683ax instanceof C2665zw) {
                return Next.m15606h(hae0.m46930c(hae0Var, C2665zw.m97104c((C2665zw) abstractC1683ax, z2), 0, 239));
            }
            if (abstractC1683ax instanceof C2628yw) {
                return Next.m15606h(hae0.m46930c(hae0Var, C2628yw.m94771c((C2628yw) abstractC1683ax, z2, false, false, ContentType.USER_GENERATED_LIVE), 0, 239));
            }
            if (!(abstractC1683ax instanceof C2591xw)) {
                throw new NoWhenBranchMatchedException();
            }
            na6.m63957e("onExplicitContentToggleChanged is not supported for legacy managed accounts.");
            return Next.m15608j();
        }
        boolean z3 = gae0Var instanceof aae0;
        m9e0 m9e0Var = m9e0.f141285b;
        if (z3) {
            boolean z4 = ((aae0) gae0Var).f13830a;
            if (abstractC1683ax instanceof C2665zw) {
                return Next.m15607i(hae0.m46930c(hae0Var, C2665zw.m97104c((C2665zw) abstractC1683ax, z4), 0, 239), Collections.singleton(m9e0Var));
            }
            if (abstractC1683ax instanceof C2628yw) {
                return Next.m15607i(hae0.m46930c(hae0Var, C2628yw.m94771c((C2628yw) abstractC1683ax, z4, false, false, ContentType.USER_GENERATED_LIVE), 0, 239), Collections.singleton(m9e0Var));
            }
            if (!(abstractC1683ax instanceof C2591xw)) {
                throw new NoWhenBranchMatchedException();
            }
            na6.m63957e("onExplicitContentToggleFailed is not supported for legacy managed accounts.");
            return Next.m15608j();
        }
        if (gae0Var instanceof eae0) {
            boolean z5 = ((eae0) gae0Var).f57645a;
            if (abstractC1683ax instanceof C2665zw) {
                na6.m63957e("onVideoContentToggleClicked is not supported for self managed accounts.");
                return Next.m15608j();
            }
            if (abstractC1683ax instanceof C2628yw) {
                return Next.m15607i(hae0.m46930c(hae0Var, C2628yw.m94771c((C2628yw) abstractC1683ax, false, z5, false, 119), 0, 239), Collections.singleton(new p9e0(str, z5)));
            }
            if (!(abstractC1683ax instanceof C2591xw)) {
                throw new NoWhenBranchMatchedException();
            }
            na6.m63957e("onVideoContentToggleClicked is not supported for legacy managed accounts.");
            return Next.m15608j();
        }
        if (gae0Var instanceof dae0) {
            dae0 dae0Var = (dae0) gae0Var;
            if (abstractC1683ax instanceof C2665zw) {
                na6.m63957e("onVideoContentToggleChanged is not supported for self managed accounts.");
                return Next.m15608j();
            }
            if (abstractC1683ax instanceof C2628yw) {
                return Next.m15606h(hae0.m46930c(hae0Var, C2628yw.m94771c((C2628yw) abstractC1683ax, false, dae0Var.f47035a, false, 119), 0, 239));
            }
            if (!(abstractC1683ax instanceof C2591xw)) {
                throw new NoWhenBranchMatchedException();
            }
            na6.m63957e("onVideoContentToggleChanged is not supported for legacy managed accounts.");
            return Next.m15608j();
        }
        if (gae0Var instanceof fae0) {
            fae0 fae0Var = (fae0) gae0Var;
            if (abstractC1683ax instanceof C2665zw) {
                na6.m63957e("onExplicitContentToggleFailed is not supported for self managed accounts.");
                return Next.m15608j();
            }
            if (abstractC1683ax instanceof C2628yw) {
                return Next.m15607i(hae0.m46930c(hae0Var, C2628yw.m94771c((C2628yw) abstractC1683ax, false, fae0Var.f67548a, false, 119), 0, 239), Collections.singleton(m9e0Var));
            }
            if (!(abstractC1683ax instanceof C2591xw)) {
                throw new NoWhenBranchMatchedException();
            }
            na6.m63957e("onExplicitContentToggleFailed is not supported for legacy managed accounts.");
            return Next.m15608j();
        }
        if (gae0Var instanceof w9e0) {
            boolean z6 = ((w9e0) gae0Var).f249165a;
            if (abstractC1683ax instanceof C2665zw) {
                na6.m63957e("onConnectToggleClicked is not supported for self managed accounts.");
                return Next.m15608j();
            }
            if (abstractC1683ax instanceof C2628yw) {
                return Next.m15607i(hae0.m46930c(hae0Var, C2628yw.m94771c((C2628yw) abstractC1683ax, false, false, z6, 95), 0, 239), Collections.singleton(new n9e0(str, z6)));
            }
            if (!(abstractC1683ax instanceof C2591xw)) {
                throw new NoWhenBranchMatchedException();
            }
            na6.m63957e("onConnectToggleClicked is not supported for legacy managed accounts.");
            return Next.m15608j();
        }
        if (gae0Var instanceof v9e0) {
            v9e0 v9e0Var = (v9e0) gae0Var;
            if (abstractC1683ax instanceof C2665zw) {
                na6.m63957e("onConnectToggleChanged is not supported for self managed accounts.");
                return Next.m15608j();
            }
            if (abstractC1683ax instanceof C2628yw) {
                return Next.m15606h(hae0.m46930c(hae0Var, C2628yw.m94771c((C2628yw) abstractC1683ax, false, false, v9e0Var.f238926a, 95), 0, 239));
            }
            if (!(abstractC1683ax instanceof C2591xw)) {
                throw new NoWhenBranchMatchedException();
            }
            na6.m63957e("onConnectToggleChanged is not supported for legacy managed accounts.");
            return Next.m15608j();
        }
        if (gae0Var instanceof x9e0) {
            x9e0 x9e0Var = (x9e0) gae0Var;
            if (abstractC1683ax instanceof C2665zw) {
                na6.m63957e("onConnectToggleFailed is not supported for self managed accounts.");
                return Next.m15608j();
            }
            if (abstractC1683ax instanceof C2628yw) {
                return Next.m15607i(hae0.m46930c(hae0Var, C2628yw.m94771c((C2628yw) abstractC1683ax, false, false, x9e0Var.f259341a, 95), 0, 239), Collections.singleton(m9e0Var));
            }
            if (!(abstractC1683ax instanceof C2591xw)) {
                throw new NoWhenBranchMatchedException();
            }
            na6.m63957e("onConnectToggleFailed is not supported for legacy managed accounts.");
            return Next.m15608j();
        }
        if (gae0Var.equals(bae0.f25183a)) {
            return Next.m15606h(hae0.m46930c(hae0Var, null, 2, 223));
        }
        if (gae0Var.equals(bae0.f25185c)) {
            return Next.m15606h(hae0.m46930c(hae0Var, null, 1, 223));
        }
        if (gae0Var instanceof u9e0) {
            return ((abstractC1683ax instanceof C2665zw) && ((C2665zw) abstractC1683ax).f286857d) ? Next.m15607i(hae0.m46930c(hae0Var, null, 1, 223), Collections.singleton(new l9e0(str))) : Next.m15608j();
        }
        if (gae0Var.equals(bae0.f25184b)) {
            return Next.m15605a(Collections.singleton(k9e0.f120574b));
        }
        if (gae0Var instanceof cae0) {
            return Next.m15606h(((cae0) gae0Var).f35809a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
