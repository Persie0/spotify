package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class oi7 extends qi7 {
    /* JADX INFO: renamed from: a */
    public final String m67003a() {
        if (equals(ni7.f154191a)) {
            return "Unrecognised";
        }
        if (equals(ni7.f154192b)) {
            return "UserAlreadyExists";
        }
        if (equals(ni7.f154193c)) {
            return "UserNotFound";
        }
        throw new NoWhenBranchMatchedException();
    }
}
