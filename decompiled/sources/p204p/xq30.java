package p204p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;

/* JADX INFO: loaded from: classes7.dex */
public final class xq30 {
    /* JADX INFO: renamed from: a */
    public static ar30 m91813a(String str, wj30 wj30Var) {
        HubsImmutableComponentBundle.Companion.getClass();
        return new ar30(str, br30.m30289e(wj30Var));
    }

    /* JADX INFO: renamed from: b */
    public static ar30 m91814b(mj30 mj30Var) {
        return mj30Var instanceof ar30 ? (ar30) mj30Var : m91813a(mj30Var.name(), mj30Var.data());
    }
}
